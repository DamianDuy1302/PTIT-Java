/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class gv {
    static int n=1;
    String name, id, subj, sub;
    
    public String get_sub(){
        String ans="";
        this.subj = this.subj.toUpperCase();
        String[] tmp = this.subj.trim().split("\\s+");
        for(int i=0;i<tmp.length;i++){
            ans += tmp[i].charAt(0);
        }
        return ans;
    }
    
    public String get_lastname(){
        String[] tmp = this.name.trim().split("\\s+");
        return tmp[tmp.length-1];
    }
    
    public gv(String name, String subj){
        this.id = "GV" + String.format("%02d", n++);
        this.name = name;
        this.subj = subj;
        this.sub = this.get_sub();
    }
    
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+ this.sub;
    }
}
public class J05026_DanhSachGiangVienTheoBoMon {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        ArrayList<gv> v = new ArrayList<>();
        int t = Integer.parseInt(ip.nextLine());
        while(t-->0){
            String name = ip.nextLine();
            String subj = ip.nextLine();
            gv a = new gv(name, subj);
            v.add(a);
        }
        int q = Integer.parseInt(ip.nextLine());
        while(q-->0){
            String tmp = ip.nextLine();
            String ans="";
            tmp = tmp.toUpperCase();
            String[] tmp1 = tmp.trim().split("\\s+");
            for(int i=0;i<tmp1.length;i++){
                ans += tmp1[i].charAt(0);
            }
           
            System.out.println("DANH SACH GIANG VIEN BO MON " + ans +":");
            for(gv a:v){                
                if(a.get_sub().equals(ans)){
                    System.out.println(a);
                }
            }
                
            }
        
    }
}
