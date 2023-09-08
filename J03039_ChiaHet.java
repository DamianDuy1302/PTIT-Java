/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.*;
import java.math.*;

public class J03039_ChiaHet {

    static Scanner ip = new Scanner(System.in);
    
    public static void main(String args[]) {
        int t = ip.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(ip.next());
            BigInteger b = new BigInteger(ip.next());
            if((a.mod(b).toString().equals("0"))||b.mod(a).toString().equals("0")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
