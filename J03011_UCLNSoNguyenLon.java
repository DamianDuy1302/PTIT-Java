/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.math.BigInteger;
import java.util.Scanner;

public class J03011_UCLNSoNguyenLon {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        // TODO code application logic here
        int t = ip.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(ip.next());
            BigInteger b = new BigInteger(ip.next());
            System.out.println(a.gcd(b));
        }
    }
}
