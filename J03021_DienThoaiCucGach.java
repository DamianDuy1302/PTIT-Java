/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;

public class J03021_DienThoaiCucGach {

    static Scanner ip = new Scanner(System.in);
    static String val(char c){
        if(c<='c'){
            return "2";
        }
        if(c<='f'){
            return "3";
        }
        if(c<='i') return "4";
        if(c<='l') return "5";
        if(c<='o') return "6";
        if(c<='s') return "7";
        if(c<='v') return "8";
        return "9";
    }
    public static void main(String args[]) {
        // TODO code application logic here
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String s = ip.nextLine().toLowerCase();
            String a = "";
            for (int i=0;i<s.length();i++){
                a+=val(s.charAt(i));
                
            }
            String rev = new StringBuilder(a).reverse().toString();
            if(a.equals(rev)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}
