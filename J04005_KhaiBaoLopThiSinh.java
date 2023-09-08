/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;
import java.util.Scanner;

class sv{
    String name, bd;
    double d1, d2, d3, tt;
    public sv(String name, String bd, double d1, double d2, double d3){
        this.name = name;
        this.bd = bd;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tt = d1+d2+d3;
    }
    @Override
    public String toString(){
        return this.name + " " + this.bd+" "+ String.format("%.1f", this.tt);
    }
}

public class J04005_KhaiBaoLopThiSinh {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        String name = ip.nextLine();
        String bd = ip.nextLine();
        double d1 = ip.nextDouble();
        double d2 = ip.nextDouble();
        double d3 = ip.nextDouble();
        sv a = new sv(name, bd, d1, d2, d3);
        System.out.println(a);
    }
}
