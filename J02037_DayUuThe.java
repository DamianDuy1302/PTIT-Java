/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class J02037_DayUuThe {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String s = ip.nextLine();
            String a[] = s.split(" ");
            int s1=0, s2=0, n = a.length;
            for(int i=0;i<n;i++){
                if(a[i].charAt(a[i].length()-1)%2==0){
                    s1++;
                }
                else s2++;
            }
            if((n%2==0 && s1>s2)||(n%2==1 && s1<s2)){
            System.out.println("YES");
        }
        else System.out.println("NO");
        }
        
    }
}
