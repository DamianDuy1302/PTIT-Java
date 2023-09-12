/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;


import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

class hs implements Comparable<hs>{
    static int n = 1;
    String name, id, status;
    Float tt;
    
    
    public hs(String name, float[] p){
        this.name = name;
        this.id = "HS" + String.format("%02d", n++);
        this.tt = 0f;
        for(int i=0;i<10;i++){
            if(i==0 || i==1){
                this.tt += p[i]*2;
            }
            else this.tt+=p[i];
        }
        this.tt = this.tt/12f;
        this.tt = Math.round(this.tt*10f)/10f;
        if(this.tt>=9f) this.status = "XUAT SAC";
        else if(this.tt>=8f) this.status = "GIOI";
        else if(this.tt>=7f) this.status = "KHA";
        else if(this.tt>=5f) this.status = "TB";
        else this.status = "YEU";
        
    }
    
    public int compareTo(hs other){
        if(this.tt.compareTo (other.tt)==0){
            return this.id.compareTo(other.id);
        }
        return -this.tt.compareTo(other.tt);
    }
    
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+String.format("%.1f", this.tt)+" " +this.status;
    }
}

public class J05018_BangDiemHocSinh {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        ArrayList<hs> v = new ArrayList<>();
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String name = ip.nextLine();
            float[] p = new float[10];           
            for(int i=0;i<10;i++){
                p[i] = ip.nextFloat();
            }
            ip.nextLine();
            hs a = new hs(name, p);
            v.add(a);
        }
        Collections.sort(v);
        for(hs a : v){
            System.out.println(a);
        }
    }
    
}
