package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//main class
public class Main {

    public static void main(String[] args) throws  IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter UserName: ");
        String un = br.readLine();
        System.out.println("Password here : ");
        String pw = br.readLine();

    }

}
