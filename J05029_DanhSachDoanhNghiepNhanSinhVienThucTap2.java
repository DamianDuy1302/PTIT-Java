/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class dn implements Comparable<dn>{
    String id, name;
    int doo;
    
    public dn(String id, String name, int doo){
        this.id = id;
        this.name = name;
        this.doo = doo;
    }

    public int getdoo() {
        return this.doo;
    }

    public int compareTo(dn o){
        if(this.doo==o.doo){
            return this.id.compareTo(o.id);
        }
        return -(this.doo - o.doo);
    }
    
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.doo;
    }
}

public class J05029_DanhSachDoanhNghiepNhanSinhVienThucTap2 {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        ArrayList<dn> v = new ArrayList<>();
        int t = Integer.parseInt(ip.nextLine());
        while(t-->0){
            String id = ip.nextLine();
            String name = ip.nextLine();
            int doo = ip.nextInt();
            ip.nextLine();
            dn a = new dn(id, name, doo);
            v.add(a);
        }
        Collections.sort(v);
        int q = Integer.parseInt(ip.nextLine());
        while(q-->0){
            int a = ip.nextInt();
            int b = ip.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(int i=0;i<v.size();i++){
                if(v.get(i).getdoo()>=a && v.get(i).getdoo()<=b){
                    System.out.println(v.get(i));
                }
            }
        }
    }
}
