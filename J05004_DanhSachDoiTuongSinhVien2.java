/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.Vector;
class sv{
    static int n=1;
    String id, name, clss, bd;
    double gpa;
    
    public String chuanhoa(String s){
        StringBuilder tmp = new StringBuilder(s);
        if(s.charAt(1)=='/'){
            tmp.insert(0, '0');
        }
        if(tmp.charAt(4)=='/'){
            tmp.insert(3, '0');
        }
        return tmp.toString();
    }
    public String chuanhoa1(String s){
        String[] a = s.trim().split("\\s+");
        String res = "";
        for(String i:a){
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res.substring(0, res.length()-1);
    }
    
    public sv(String name, String clss, String bd, double gpa){
        this.id = "B20DCCN" + String.format("%03d", n++);
        this.name = chuanhoa1(name);
        this.clss = clss;
        this.bd = chuanhoa(bd);
        this.gpa = gpa;             
    }
    
    @Override
    public String toString(){
        return this.id +" "+ this.name+" "+ this.clss+" "+ this.bd+" "+ String.format("%.2f", this.gpa);
    }
}

public class J05004_DanhSachDoiTuongSinhVien2 {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        Vector<sv> v = new Vector<>();
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String name = ip.nextLine();
            String clss = ip.nextLine();
            String bd = ip.nextLine();
            double gpa = ip.nextDouble();
            ip.nextLine();
            sv a = new sv(name, clss, bd, gpa);
            v.add(a);
        }
        for(sv i:v){
            System.out.println(i);
        }
    }
}
