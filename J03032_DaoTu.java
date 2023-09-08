/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
public class J03032_DaoTu {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String s = ip.nextLine();
            String[] a = s.split("\\s+");
            for(int i=0;i<a.length;i++){
                for(int j=a[i].length()-1;j>=0;j--){
                    System.out.print(a[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
