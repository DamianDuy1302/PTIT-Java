/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;
import java.util.Scanner;

public class J03005_ChuanHoaXauHoTen2 {

    public static Scanner ip = new Scanner(System.in);
    
    public static String normalize(String s){
        if(s.length()==1){
            return s.toUpperCase();
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public static String upcase(String s){
        return s.toUpperCase();
    }
    
    public static void testCase(){
        String line = ip.nextLine().trim();
        String[] arr = line.split("\\s+");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = normalize(arr[i]);
        }
        for(int i=1;i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[arr.length-1] + ", ");
        System.out.print(upcase(arr[0]));
        System.out.println();
    }
    
    public static void main(String args[]) {
       int t = ip.nextInt();
       ip.nextLine();
       while(t-->0){
           testCase();
       }
    }
}
