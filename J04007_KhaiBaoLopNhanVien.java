/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;
import java.util.Scanner;

class nv{
    String id, name, gender, bd, add, tax, signed;
    public nv(String name, String gender, String bd, String add, String tax, String signed){
        this.id = "00001";
        this.name = name;
        this.gender = gender;
        this.bd = bd;
        this.add = add;
        this.tax = tax;
        this.signed = signed;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s %s %s %s", this.id, this.name, this.gender, this.bd, this.add, this.tax, this.signed);
        
    }
}
public class J04007_KhaiBaoLopNhanVien {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        String name = ip.nextLine();
        String gender = ip.nextLine();
        String bd = ip.nextLine();
        String add = ip.nextLine();
        String tax = ip.nextLine();
        String signed = ip.nextLine();
        nv a = new nv(name, gender, bd,add,tax,signed);
        System.out.println(a);
    }
}
