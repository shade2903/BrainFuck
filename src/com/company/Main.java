package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
	String brainFuckCode = "+++++++++++++++++++++++++++++++++++++++++++++\n" +
            " +++++++++++++++++++++++++++.+++++++++++++++++\n" +
            " ++++++++++++.+++++++..+++.-------------------\n" +
            " ---------------------------------------------\n" +
            " ---------------.+++++++++++++++++++++++++++++\n" +
            " ++++++++++++++++++++++++++.++++++++++++++++++\n" +
            " ++++++.+++.------.--------.------------------\n" +
            " ---------------------------------------------\n" +
            " ----.-----------------------.";
	int count = 0;
        int [] arr = new int[30000];
	char[] fuckCode = brainFuckCode.toCharArray();
	for(int i=0; i<fuckCode.length; i++){
	    switch(fuckCode[i]){
            case '>':
                count++;
                break;
            case  '<':
                count--;
                break;
            case  '+':
                if((arr[count]+1)>255) {
                    arr[count] = 0;
                }else{
                    arr[count]++;
                }
              
                break;
            case  '-':
                if((arr[count]-1)<0) {
                    arr[count] = 255;
                }else{
                    arr[count]--;
                }
                break;
            case '.':
                System.out.print((char) arr[count]);
            case ',':
//
//            try {
//
//                        arr[count] =Integer.parseInt(reader.readLine());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            break;
            case '[':
                break;
            case']':
                break;

        }
    }
        
    }
    
}
