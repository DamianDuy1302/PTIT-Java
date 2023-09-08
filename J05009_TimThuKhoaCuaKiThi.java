/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class sv implements Comparable<sv>{
    static int n=1;
    String name, bd;
    Integer id;
    Float d1, d2, d3, tt;
    
    public sv(String name, String bd, float d1, float d2, float d3){
        this.id = n++;
        this.name = name;
        this.bd = bd;
        this.d1 = d1; this.d2 = d2; this.d3 = d3;
        this.tt = d1+d2+d3;
    }
    
    @Override
    public String toString(){
        return this.id +" "+ this.name+" "+ this.bd+" "+ this.tt;
    }
    
    @Override
    public int compareTo(sv o){
        if(this.tt.compareTo(o.tt)==0){
            return this.id - o.id;
        }
        return -(this.tt.compareTo(o.tt));
    }
}


public class J05009_TimThuKhoaCuaKiThi {

    static Scanner ip = new Scanner(System.in);
    
    public static void main(String args[]) {
        ArrayList<sv> v = new ArrayList<>();
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String name = ip.nextLine();
            String bd = ip.nextLine();
            float d1 = Float.parseFloat(ip.nextLine());
            float d2 = Float.parseFloat(ip.nextLine());
            float d3 = Float.parseFloat(ip.nextLine());
           
            sv a = new sv(name, bd, d1, d2, d3);
            v.add(a);
        }
        Collections.sort(v);
        float top = v.get(0).tt;
        for(sv a:v){
            if(a.tt == top){
                System.out.println(a);
            }
            else break;
        }
    }
}
