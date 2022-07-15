package day10_JFrame;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("172.30.1.45",5012);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("보내기 > ");//프롬프트
				String outputMessage = scanner.nextLine();//키보드에서 한행 읽기
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage+"\n");
					out.flush();
					break;//사용자가 "bye를 입력한 경우 서버로 전송 후 실행 종료
				}
				out.write(outputMessage+"\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("서버: "+inputMessage);
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally{
			try {
				scanner.close();
				if(socket != null) {
					socket.close();//클라이언트 소켓 닫기
				}
			}catch(IOException e) {
					System.out.println("서버와 채팅중 오류가 발생했습니다.");
				}
			}
		}
	}

