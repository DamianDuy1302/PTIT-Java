/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class J03010_DiaChiEmail {

    static Scanner ip = new Scanner(System.in);
    public static void main(String[] args){
        int n = ip.nextInt();
        ip.nextLine();
        ArrayList<String> dd = new ArrayList<>();
        while(n-->0){
            String[] ar = ip.nextLine().trim().toLowerCase().split("\\s+");
            String s = ar[ar.length-1];
            for(int i=0;i<ar.length-1;i++){
                s+=ar[i].charAt(0);
            }
            dd.add(s);
            int cnt = Collections.frequency(dd, s);
            if(cnt>1){
                s+=cnt;
            }
            s+="@ptit.edu.vn";
            System.out.println(s);
        }
    }
    
}
