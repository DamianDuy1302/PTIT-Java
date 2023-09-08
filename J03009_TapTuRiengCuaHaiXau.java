/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;
import java.util.Scanner;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;


public class J03009_TapTuRiengCuaHaiXau {

    public static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String a = ip.nextLine().trim();
            String b = ip.nextLine().trim();

            List<String> s1 = Arrays.asList(a.split("\\s+"));
            List<String> s2 = Arrays.asList(b.split("\\s+"));
                         
            Set<String> s = new TreeSet<>();
            
            for(String i : s1){
                
                if(!s2.contains(i)){
                    
                    s.add(i);
                }
            }
            for(String i:s)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }       
    }
}
