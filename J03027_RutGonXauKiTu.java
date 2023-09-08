/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
public class J03027_RutGonXauKiTu {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        String s = ip.next();
        while(true){
            int stop=1;
            for(int i=0;i<s.length()-1;i++){
                while(s.charAt(i)==s.charAt(i+1)){
                    s = s.substring(0, i)+s.substring(i+2);
                    stop=0;
                    break;
                }
            }
            if(stop==1){
                break;
            }
        }
        if(s.isEmpty()){
            System.out.println("Empty String");
        }
        else{
            System.out.println(s);
        }
    }
}
