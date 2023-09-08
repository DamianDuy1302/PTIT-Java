/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;

class gv{
    String id, name;
    long sala;
    long level, income, bonus;
    
    public long get_bonus(){
        String tmp = this.id.substring(0, 2);
        if(tmp.equals("HT")) return 2000000;
        if(tmp.equals("HP")) return 900000;
        return 500000;
    }
    public long get_level(){
        String tmp = this.id.substring(2, 4);
        long ans = Long.parseLong(tmp);
        return ans;
    }
    
    public gv(String id, String name, long sala){
        this.id = id;
        this.name = name;
        this.sala = sala;
        this.level = this.get_level();
        this.bonus = this.get_bonus();
        this.income = this.sala * this.level + this.bonus;
    }
    @Override
    public String toString(){
        return  this.id +" "+ this.name+" "+ this.level+" "+ this.bonus+" "+ this.income;
    }
}
public class J04015_TinhThuNhapGiaoVien {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        // TODO code application logic here
        String id = ip.nextLine();
        String name = ip.nextLine();
        long sala = ip.nextLong();
        gv a = new gv(id, name, sala);
        System.out.println(a);
    }
}
