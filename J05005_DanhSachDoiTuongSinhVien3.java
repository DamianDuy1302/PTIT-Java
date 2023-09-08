
package javaptit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class sv implements Comparable<sv>{
    static int n=1;
    String id, name, clss, bd;
    float gpa;
    
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
        String res="";
        for(String i:a){
            res += i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        return res.substring(0, res.length()-1);
    }
    
    public sv(String name, String clss, String bd, float gpa){
        this.id = "B20DCCN" + String.format("%03d", n++);
        this.name = chuanhoa1(name);
        this.clss = clss;
        this.bd = chuanhoa(bd);
        this.gpa = gpa;             
    }

    public Float getGpa() {
        return gpa;
    }
    
    
    
    @Override
    public int compareTo(sv other) {
        return -(this.getGpa().compareTo(other.getGpa()));
    }
    
    @Override
    public String toString(){
        return this.id +" "+ this.name+" "+ this.clss+" "+ this.bd+" "+ String.format("%.2f", this.gpa);
    }
    
}

public class J05005_DanhSachDoiTuongSinhVien3 {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        
        int t = ip.nextInt();
        List<sv> v = new ArrayList<>(t);
        
        for(int g=1;g<=t;g++){
            ip.nextLine();
            String name = ip.nextLine();
            String clss = ip.nextLine();
            String bd = ip.nextLine();
            float gpa = ip.nextFloat();            
            sv a = new sv(name, clss, bd, gpa);
            v.add(a);
        }
        Collections.sort(v);
        for(sv i:v){
            System.out.println(i);
        }
    }
}
