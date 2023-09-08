/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.math.BigInteger;
public class J03016_ChiaHetCho11 {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        int t = ip.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(ip.next());
            BigInteger b = new BigInteger("11");
            if(a.mod(b).toString().equals("0")){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
