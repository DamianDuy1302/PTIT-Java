/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.math.BigInteger;
import java.util.Scanner;
public class J03013_HieuSoNguyenLon {

    static Scanner ip = new Scanner(System.in);
    
    public static void main(String args[]) {
        // TODO code application logic here
        int t = ip.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(ip.next());
            BigInteger b = new BigInteger(ip.next());
            BigInteger c = a.subtract(b).abs();
                
            StringBuilder sb = new StringBuilder(c.toString());
            int maxl = Math.max(a.toString().length(), b.toString().length());
            while(sb.length()<maxl){
                sb.insert(0, '0');
            }
            System.out.println(sb);
        }
       
    }
}
