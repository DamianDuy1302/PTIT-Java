
package PTIT_Java;

import java.util.Scanner;
import java.util.Vector;


class nv{
    static int n=1;
    String id, name, gender, bd, add, tax, sign;
    
    public nv(String name, String gender, String bd, String add, String tax, String sign){
        this.id = String.format("%05d", n++);
        this.name = name;
        this.gender = gender;
        this.bd = bd;
        this.add = add;
        this.tax = tax;
        this.sign = sign;
    }
    @Override
    public String toString(){
        return id +" "+ name+" "+ gender+" "+bd+" "+ add+" "+ tax+" "+ sign;
    }
}

public class J05006_DanhSachDoiTuongNhanVien {

    static Scanner ip = new Scanner(System.in);
    
    public static void main(String args[]) {
        Vector<nv> v = new Vector<>();
               
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String name = ip.nextLine();
            String gender = ip.nextLine();
            String bd = ip.nextLine();
            String add = ip.nextLine();
            String tax = ip.nextLine();
            String sign = ip.nextLine();
            nv a = new nv(name, gender, bd, add, tax, sign);
            v.add(a);
        }
        for(nv a:v){
            System.out.println(a);
        }
    }
}
