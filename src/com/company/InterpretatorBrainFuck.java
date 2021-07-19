package com.company;

import java.io.*;

public class InterpretatorBrainFuck {
    private int [] result = new int[30000];
    private char[] fuckCode;
    private int count = 0;
    private int n = 0;




 public void interpretator(char[] fuckCode) throws IOException {
     this.fuckCode = fuckCode;
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

     for(int i=0; i<fuckCode.length; i++){
         switch(fuckCode[i]){
             case '>':
                 count++;
                 break;
             case  '<':
                 count--;
                 break;
             case  '+':
                 if((result[count]+1)>255) {
                     result[count] = 0;
                 }else{
                     result[count]++;
                 }

                 break;
             case  '-':
                 if((result[count]-1)<0) {
                     result[count] = 255;
                 }else{
                     result[count]--;
                 }
                 break;
             case '.':
                 System.out.print((char) result[count]);
             case ',':

//                 try {
//
//                     result[count] =Integer.parseInt(reader.readLine());
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
                 break;
             case '[':
                 n = i;
                 if(result[count] !=0){
                     if(fuckCode[i]==']')result[count]--;
                 }
                 break;
             case']':
                 if (result[count] != 0) {
                     i = n;
                     continue;
                 }
                 break;
         }
     }
     this.fuckCode = null;

 }
  public void translationFile(String path) throws IOException {

      File file = new File(path);
      if (!file.exists()) {
          file.createNewFile();
      }
      FileReader fr = new FileReader(file);

       this.fuckCode = new char[(int) file.length()];
      fr.read(fuckCode);
      interpretator(fuckCode);
  }
    public void translationString(String string) throws IOException {
             interpretator(string.toCharArray());
    }


}
