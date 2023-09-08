/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.HashSet;

public class J03038_DanhDauChuCai {
    
    static Scanner ip = new Scanner(System.in);

    public static void main(String args[]) {
        String s = ip.next();
        HashSet<Character> a = new HashSet<>();
        for(int i=0;i<s.length();i++){
            a.add(s.charAt(i));
        }
        
        System.out.println(a.size());
    }
}
