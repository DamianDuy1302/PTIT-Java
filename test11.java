/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class arr{
    
    ArrayList<Integer> a = new ArrayList<>();
        
    public arr(){
        a = new ArrayList<>();        
    }
    
    public void add(int x){
        this.a.add(x);
    }
    
    public int nnka(){
        Integer miny = Integer.MAX_VALUE;
        for(int x:this.a){
            if(x<miny && x>=0){
                miny = x;
            }
        }
        return miny;
    }
    
    public void sx(){
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=3;i<this.a.size();i++){
            a1.add(this.a.get(i));
        }
        ArrayList<Integer> a2 = new ArrayList<>();
        Collections.sort(a1, Comparator.reverseOrder());
        for(int i=0;i<3;i++){
            a2.add(this.a.get(i));
        }
        for(int i=0;i<a1.size();i++){
            a2.add(a1.get(i));
        }
        for(int x : a2){
            System.out.print(x + " ");
        }
    }
    
}

class vanban{
    String s;
    
    public vanban(){
        
    }
    public void nhapvanban(String tmp){
        this.s = tmp;
    }
    
    public int sotu(){
        String[] tmp = this.s.trim().split("\\s+");       
        return tmp.length;
    }
    
    public int socau(){
        int cnt=0;
        for(int i=0;i<this.s.length();i++){
            if(s.charAt(i)=='.' ||s.charAt(i)=='?' ||s.charAt(i)=='!'){
                cnt++;
            }
        }
        return cnt;
    }
}

//class matran{
//    
//    public matran(int n, int m){
//        a = new int[n][m];
//        
//    }
//}

class menu{
    String l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    public menu(){
        this.l1 = "Menu:";
        this.l2 = "1.Nhập vào 1 dãy số nguyên (có thể phải nhập lại cho câu 4)";
        this.l3 = "2.Viết ra số nhỏ nhất không âm";
        this.l4 = "3.Viết ra dãy số sắp xếp giảm dần (sắp xếp từ phần tử thứ 3 đến trước phần tử cuối)";
        this.l5 = "4.Viết ra các dãy con có tổng bằng k (k nhập từ bàn phím), viết ra không có (nếu không tìm thấy)";
        this.l6 = "5.Nhập vào dòng văn bản";
        this.l7 = "6.Đưa ra số từ";
        this.l8 = "7.Đưa ra số câu";
        this.l9 = "8.Nhập vào 1 ma trận chữ nhật A";
        this.l10 = "9.Đưa ra ma trận chuyển vị của A";
    }
    
    public void out_menu(){
        System.out.println(this.l1);
        System.out.println(this.l2);
        System.out.println(this.l3);
        System.out.println(this.l4);
        System.out.println(this.l5);
        System.out.println(this.l6);
        System.out.println(this.l7);
        System.out.println(this.l8);
        System.out.println(this.l9);
        System.out.println(this.l10);      
    }
    
}

public class test11 {

    static Scanner ip = new Scanner(System.in);
    
    public static void main(String args[]) {
        menu m = new menu();
        arr a = new arr();
        vanban v = new vanban();
        while(true){
            
            m.out_menu();
            int t = Integer.parseInt(ip.nextLine());
            if(t==1){
                
                String s = ip.nextLine();
                String[] tmp = s.trim().split("\\s+");
                for(int i=0;i<tmp.length;i++){
                    int x = Integer.parseInt(tmp[i]);
                    a.add(x);
                }
            }
            else if(t==2){
                System.out.println(a.nnka());
            }
            else if(t==3){
                a.sx();
                System.out.println();
            }
//            if(t==1){
//                
//            }
            else if(t==5){
                String tmp = ip.nextLine();
                v.nhapvanban(tmp);
                
            }       
            else if(t==6){
                int x = v.sotu();
                System.out.println(x);
            }
            else if(t==7){
                int x = v.socau();
                System.out.println(x);
            }
            else if(t==8){
                
            }
//            if(t==1){
//                
//            }
            else{
                System.out.println("Moi ban nhap lai so nguyen tu 1 toi 9");
            }
        }
        
        
        
    }
}
