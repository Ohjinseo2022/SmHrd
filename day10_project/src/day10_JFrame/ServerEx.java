package day10_JFrame;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket =null;
		Scanner scanner = new Scanner(System.in);//키보드에서 읽을 scanner 객체 생성
		try {
			listener = new ServerSocket(5012);//서버 소켓생성
			System.out.println("연결을 기다리고 있습니다....");
			socket = listener.accept();//클라이언트로부터 연결 요청 대기
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();//클라이언트로부터 한행 읽기
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결 종료하였슴");
					break;
				}
				System.out.println("클라이언트 : "+inputMessage);
				System.out.print("보내기 >>");//프롬프트
				String outputMessage = scanner.nextLine();//키보드에서 한행 읽기
				out.write(outputMessage+"\n");
				out.flush();//out 스트림 버퍼에 있는 모든 문자열 전송
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				scanner.close();
				socket.close();
				listener.close();
			}catch(IOException e) {System.out.println("클라이언트와 채팅중 오류가 발생했습니다.");
		}
	}
}
}
