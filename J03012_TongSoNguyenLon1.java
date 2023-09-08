/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.math.BigInteger;

public class J03012_TongSoNguyenLon1 {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            BigInteger a = new BigInteger(ip.next());
            BigInteger b = new BigInteger(ip.next());
            BigInteger c = a.add(b);
            
            System.out.println(c.toString());
        }
    }
}
