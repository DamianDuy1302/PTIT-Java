/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
public class J03040_BienSoDep {

    static Scanner ip = new Scanner(System.in);
    public static int sanhtien(String s){
        if(s.charAt(5)<s.charAt(6) && s.charAt(6) < s.charAt(7)
           && s.charAt(7)<s.charAt(9) && s.charAt(9) < s.charAt(10))
            return 1;
        return 0;
    }
    public static int nguquy(String s){
        if(s.charAt(5)==(s.charAt(6)) && s.charAt(6) == s.charAt(7)
           && s.charAt(7)==s.charAt(9) && s.charAt(9) == s.charAt(10))
            return 1;
        return 0;
    }
    public static int tamnhi(String s){
        if(s.charAt(5)==(s.charAt(6)) && s.charAt(6) == s.charAt(7)
           && s.charAt(9)==s.charAt(10) )
            return 1;
        return 0;
    }
    public static int locphat(String s){
        for(int i=5;i<=10;i++){
            if(i==8) continue;
            else{
                if(s.charAt(i)!='6' && s.charAt(i)!='8'){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String args[]) {
        // TODO code application logic here
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String s = ip.nextLine();
            if(sanhtien(s)==0 && nguquy(s)==0 && tamnhi(s)==0 && locphat(s)==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
