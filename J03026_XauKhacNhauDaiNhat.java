/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;
import java.util.Scanner;
public class J03026_XauKhacNhauDaiNhat {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        // TODO code application logic here
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String s1 = ip.nextLine();
            String s2 = ip.nextLine();
            if(s1.equals(s2)){
                System.out.println(-1);
            }
            else{
                int ans = Math.max(s1.length(), s2.length());
                System.out.println(ans);
            }
        }
    }
}
