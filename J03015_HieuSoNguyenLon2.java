/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.math.BigInteger;
public class J03015_HieuSoNguyenLon2 {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        // TODO code application logic here
        BigInteger a = new BigInteger(ip.next());
        BigInteger b = new BigInteger(ip.next());
        BigInteger c = a.subtract(b);
        System.out.println(c.toString());
    }
}
