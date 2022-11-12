package com.javaproject.boltshare;

import com.javaproject.gui.ClientInformation;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyMain {
	public static void main(String args[]) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int choice = Integer.parseInt(br.readLine());
		
		if(choice == 1){		
			Server s = new Server();
		}
		else if(choice == 2){
			ClientInformation clientInformation = null;
			Client c = new Client();
		}
		else{
			System.out.println("Your choice is invalid");
		}
	}
}
