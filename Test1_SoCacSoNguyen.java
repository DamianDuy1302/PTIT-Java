/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;

public class Test1_SoCacSoNguyen {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        String a = ip.nextLine();
        int cnt=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='3' || a.charAt(i)=='5'){
                cnt++;
            }
        }
        if(cnt==3 || cnt==5){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
