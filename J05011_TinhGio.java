
package PTIT_Java;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


class gamer implements Comparable<gamer>{
    String id, name;
    long h, m, tt, iny, outy;
    
    public long get_num(String s){
        String s1 = s.substring(0, 2);
        String s2 = s.substring(3, 5);
        long a1 = Long.parseLong(s1);
        long a2 = Long.parseLong(s2);
        return a1*60 + a2;
    }
     
    public gamer(String id, String name, String iny, String outy)
    {
        this.id = id;
        this.name = name;
        this.iny = get_num(iny);
        this.outy = get_num(outy);
        this.tt = this.outy - this.iny;
        this.h = (int)(tt/60);
        this.m = this.tt %60;
    }
    
    public int compareTo(gamer other){
        return -(int)(this.tt - other.tt);
    }
    @Override
    public String toString(){
        return this.id +" "+ this.name +" "+ this.h +" gio "+ this.m + " phut ";
    }
}

public class J05011_TinhGio {

    static Scanner ip = new Scanner(System.in);
    
    public static void main(String args[]) {
        ArrayList<gamer> v = new ArrayList<>();
        int t= ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String id = ip.nextLine();
            String name = ip.nextLine();
            String iny = ip.nextLine();
            String outy = ip.nextLine();
            gamer a = new gamer(id, name, iny, outy);
            v.add(a);
        }
        Collections.sort(v);
        for(gamer a : v){
            System.out.println(a);
        }
    }
}
