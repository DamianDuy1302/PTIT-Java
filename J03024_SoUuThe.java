/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;

public class J03024_SoUuThe {

    static Scanner ip = new Scanner(System.in);
    static int uuthe(String a){
        if(a.charAt(0)=='0'){
            return -1;
        }
        else{
            int odd=0, even=0;
            for(int i=0;i<a.length();i++){
                if(!Character.isDigit(a.charAt(i))){
                    return -1;
                }
                if((a.charAt(i)-'0')%2==0){
                    even+=1;
                }
                else{
                    odd+=1;
                }
            }
            if((a.length()%2==0 && even>odd)||(a.length()%2==1 && odd>even)){
                return 1;
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        // TODO code application logic here
        int t = ip.nextInt();
        while(t-->0){
            String s = ip.next();
            if(uuthe(s) == -1){
                System.out.println("INVALID");
            }
            else if(uuthe(s)==1){
                System.out.println("YES");
            }
            else if(uuthe(s)==0){
                System.out.println("NO");
            }
        }
        
    }
}
