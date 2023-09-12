/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;

class sv{
    String id, name, gender, status;
    double d;
    public String chuanhoaid(String id){
        
        String res = id.substring(0).toUpperCase();
        return res;
    }
//      public String chuanHoa(String s){
//        String[] a = s.trim().split("\\s+");
//        String res = "";
//        for(int i=0;i<a.length;i++){
//            if(i==0 || i==a.length-1)
//            {
//                res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase() + " ";
//            }
//            else{
//                res += a[i].substring(0).toLowerCase() + " ";
//            }
//            
//        }
//        return res.substring(0, res.length()-1);
//    }
    
    public sv(String id, String name, String gender, double d){
        this.id = chuanhoaid(id);
        this.name = (name);
        if(gender.equals("True") || gender.equals("true")){
            this.gender = "nam";
        }
        else this.gender = "nu";
        this.d = d;
        if(d>=5) this.status = "dat";
        else this.status = "hoc lai";
    }
    
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.gender+" "+this.status;
    }
}

public class Test1_TaoLopSinhVien {

    static Scanner ip = new Scanner(System.in);
    
    public static void main(String args[]) {
        String id = ip.nextLine();
        String name =ip.nextLine();
        String gender = ip.nextLine();
        double d = ip.nextDouble();
        sv a = new sv(id, name, gender, d);
        System.out.println(a);
    }
}
