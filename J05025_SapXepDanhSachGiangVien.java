/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class gv implements Comparable<gv>{
    static int n=1;
    String name, id, subj, sub;
    
    public String get_sub(String s){
        String ans="";
        s = s.toUpperCase();
        String[] tmp = s.trim().split("\\s+");
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
        this.sub = this.get_sub(this.subj);
    }
    
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+ this.sub;
    }
    
    public int compareTo(gv o){
        if(this.get_lastname().equals(o.get_lastname())){
            return this.id.compareTo(o.id);
        }
        return this.get_lastname().compareTo(o.get_lastname());
    }
}
public class J05025_SapXepDanhSachGiangVien {

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
        Collections.sort(v);
        for(gv a:v){
            System.out.println(a);
        }
    }
}
