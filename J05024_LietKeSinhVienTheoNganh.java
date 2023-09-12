/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;
import java.util.ArrayList;

class sv{
    String id, name, clss, email;
    
    public sv(String id, String name, String clss, String email){
        this.id = id;
        this.name = name;
        this.clss = clss;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }

    public String getClss() {
        return this.clss;
    }
    @Override
    public String toString(){
        return this.id+" "+this.name+" "+this.clss+" "+this.email;
    }
    
    
}
public class J05024_LietKeSinhVienTheoNganh {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        ArrayList<sv> v = new ArrayList<>();
        int t = ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String id = ip.nextLine();
            String name = ip.nextLine();
            String clss = ip.nextLine();
            String email = ip.nextLine();
            sv a = new sv(id, name, clss, email);
            v.add(a);
        }
        int q = ip.nextInt();
        ip.nextLine();
        while(q-->0){
            String res = ip.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + res.toUpperCase() + ":");
            
            
            if(res.equals("Ke toan")) {
                    for(sv a: v){
                        
                        if(a.getId().substring(3, 7).equals("DCKT")){
                            System.out.println(a);
                        }
                    }
                }
            if(res.equals("Vien thong")){
                    for(sv a: v){
                        if(a.getId().substring(3, 7).equals("DCVT")){
                            System.out.println(a);
                        }
                    }
                }
            if(res.equals("Dien tu")){
                    for(sv a: v){
                        if(a.getId().substring(3, 7).equals("DCDT")){
                            System.out.println(a);
                        }
                    }
                }
            if(res.equals("Cong nghe thong tin")) {
                    for(sv a: v){
                        if(a.getId().substring(3, 7).equals("DCCN")
                                && !a.getClss().substring(0, 1).equals("E")){
                            System.out.println(a);
                        }
                    }
                }
            if(res.equals("An toan thong tin")){
                    for(sv a: v){
                        if(a.getId().substring(3, 7).equals("DCAT")
                                && !a.getClss().substring(0, 1).equals("E")){
                            System.out.println(a);
                        }
                    }
                }
               
            }
        }
    }

