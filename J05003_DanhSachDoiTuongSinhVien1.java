
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
    
    public sv(String name, String clss, String bd, double gpa){
        this.id = "B20DCCN" + String.format("%03d", n++);
        this.name = name;
        this.clss = clss;
        this.bd = chuanhoa(bd);
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return this.id +" "+ this.name +" "+ this.clss +" "+ this.bd +" "+ String.format("%.2f", this.gpa);
    } 
}
public class J05003_DanhSachDoiTuongSinhVien1 {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        Vector<sv> v = new Vector<>();
        int t=ip.nextInt();
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
        for(sv i : v){
            System.out.println(i);
        }
    }
}
