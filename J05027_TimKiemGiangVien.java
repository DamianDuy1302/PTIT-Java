/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;
import java.util.Scanner;
import java.util.ArrayList;

class gv{
    static int n=1;
    String name, sub, id;
    
    public String get_sub(String s){
        String ans="";
        String[] tmp = s.trim().split("\\s+");
        for(int i=0;i<tmp.length;i++){
            String tmp1 = tmp[i].toUpperCase();
            ans+=tmp1.charAt(0);
        }
        return ans;
    }
 
    public gv(String name, String sub){
        this.id = "GV"+String.format("%02d", n++);
        this.name = name;
        this.sub = this.get_sub(sub);
    }

    public String getName() {
        return this.name.toLowerCase();
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.sub;
    }
}
public class J05027_TimKiemGiangVien {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        ArrayList<gv> v = new ArrayList<>();
        int t = Integer.parseInt(ip.nextLine());
        while(t-->0){
            String name = ip.nextLine();
            String sub = ip.nextLine();
            gv a = new gv(name, sub);
            v.add(a);
        }
        int q = Integer.parseInt(ip.nextLine());
        while(q-->0){
            String s = ip.nextLine();
            String s1 = s.toLowerCase();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + s + ":");
            for(int i=0;i<v.size();i++){
                if(v.get(i).getName().contains(s1)){
                    System.out.println(v.get(i));
                }
            }
        }
    }
}
