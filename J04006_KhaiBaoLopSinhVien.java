/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;
import java.util.Scanner;

class sv{
    String name="", cl="", id="", bd="";
    float gpa=0;
    public String chuanhoa(String s){
        String[] a = s.split("/");
        String ans="";
        while(a[0].length()<2){
            a[0] = "0"+a[0];
        }
        ans+=a[0]+"/";
        while(a[1].length()<2){
            a[1] ="0"+a[1];
        }
        ans+=a[1]+"/";
        while(a[2].length()<4){
            a[2]="0"+a[2];
        }
        ans+=a[2];
        return ans;
    }
    public sv(String name, String cl, String bd, float gpa){
        this.name = name;
        this.cl = cl;
        this.bd = chuanhoa(bd);
        this.gpa = gpa;
        this.id = "B20DCCN001";
    }
    public void outp(){
        System.out.printf("%s %s %s %s %.2f", this.id, this.name, this.cl, this.bd, this.gpa);
    }
}

public class J04006_KhaiBaoLopSinhVien {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        String name = ip.nextLine();
        String cl = ip.nextLine();
        String bd = ip.nextLine();
        float gpa = ip.nextFloat();
        sv a = new sv(name, cl, bd, gpa);
        a.outp();
    }
}
