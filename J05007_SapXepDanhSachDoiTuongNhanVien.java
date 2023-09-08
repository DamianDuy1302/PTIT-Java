
package PTIT_Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class nv implements Comparable<nv>{
    static int n=1;
    String id, name, gender, add, tax, sign;
    Date bd;
    
    public nv(String name, String gender, Date bd, String add, String tax, String sign){
        this.id = String.format("%05d", n++);
        this.name = name;
        this.gender = gender;
        this.bd = bd;
        this.add = add;
        this.tax = tax;
        this.sign = sign;
    }
    
    public String formatDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
    
    @Override
    public String toString(){
        return id +" "+ name+" "+ gender+" "+formatDate(bd)+" "+ add+" "+ tax+" "+ sign;
    }

    
    
    @Override
    public int compareTo(nv o){
      return this.bd.compareTo(o.bd);
    }
}

public class J05007_SapXepDanhSachDoiTuongNhanVien {

    static Scanner ip = new Scanner(System.in);
    
    public static void main(String args[]) throws ParseException {
        ArrayList<nv> v = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");     
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String name = ip.nextLine();
            String gender = ip.nextLine();
            Date bd = sdf.parse(ip.nextLine());
            String add = ip.nextLine();
            String tax = ip.nextLine();
            String sign = ip.nextLine();
            nv a = new nv(name, gender, bd, add, tax, sign);
            v.add(a);
        }
        Collections.sort(v);
        for(nv a:v){
            System.out.println(a);
        }
    }
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011