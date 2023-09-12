/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;

public class Test1_ChuanHoaTen {
    
    static String chuanHoa(String s){
        String[] a = s.trim().split("\\s+");
        String res = "";
        for(int i=0;i<a.length;i++){
            if(i==0 || i==a.length-1)
            {
                res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase() + " ";
            }
            else{
                res += a[i].substring(0).toLowerCase() + " ";
            }
            
        }
        return res.substring(0, res.length()-1);
    }

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        int t=ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String name = ip.nextLine();
            String tmp = chuanHoa(name);
            System.out.println(tmp);
        }
    }
}
