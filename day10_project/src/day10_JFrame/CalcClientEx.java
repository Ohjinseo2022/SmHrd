package day10_JFrame;

import java.io.*;
import java.net.*;
import java.util.*;

public class CalcClientEx {
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
	
	try {
		socket = new Socket("localhost",4581);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		while(true) {
			System.out.print("계산식(빈칸으로 띄어 입력,예: 24 +42)>>");//프롬프트
			String outputMessage = scanner.nextLine();
			if(outputMessage.equalsIgnoreCase("bye")) {
				out.write(outputMessage+"\n");
				out.flush();
				break;
			}
			out.write(outputMessage+"\n");
			out.flush();
			String inputMessage = in.readLine();
			System.out.println("계산 결과 : "+inputMessage);			
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(socket != null)socket.close();
				if(listener != null)listener.close();
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}