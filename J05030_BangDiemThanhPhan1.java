/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class sv implements Comparable<sv>{
    String id, name, clss;
    float d1, d2, d3;
    
    public sv(String id, String name, String clss, float d1, float d2, float d3){
        this.id = id;
        this.name = name;
        this.clss = clss;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;      
    }
    
    public int compareTo(sv o){
        return this.id.compareTo(o.id);
    }
    
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.clss+" "+String.format("%.1f", this.d1)+" "+String.format("%.1f", this.d2)+" "+String.format("%.1f", this.d3);
    }
}

public class J05030_BangDiemThanhPhan1 {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        ArrayList<sv> v = new ArrayList<>();
        int t = Integer.parseInt(ip.nextLine());
        while(t-->0){
            String id = ip.nextLine();
            String name = ip.nextLine();
            String clss = ip.nextLine();
            float d1 = ip.nextFloat();
            float d2 = ip.nextFloat();
            float d3 = ip.nextFloat();
            
//            System.out.println(d1+d2+d3);
            sv a = new sv(id, name, clss, d1, d2, d3);
            v.add(a);
            ip.nextLine();
        }
        Collections.sort(v);
        for(int i=0;i<v.size();i++){
            System.out.print(i+1);
            System.out.print(" ");
            System.out.println(v.get(i));
        }
    }
}
