/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

class time{
    int h, m ,s;
    
    public time(int h, int m, int s){
        this.h = h;
        this.m = m;
        this. s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }
    
    
    public int get_times(){
        return h*60*60 + m*60 + s; 
    }
}

public class J05033_SapXepThoiGian {

    static Scanner ip = new Scanner(System.in);
    
    public static void main(String args[]) {
        int n = ip.nextInt();
        Vector<time> v = new Vector<>();
        for(int i=0;i<n;i++){
            int h = ip.nextInt();
            int m = ip.nextInt();
            int s = ip.nextInt();
            time x = new time(h, m, s);
            v.add(x);
        }
        Collections.sort(v, new Comparator<time>(){
            @Override
            public int compare(time a, time b){
                if(a.get_times() > b.get_times()){
                    return 1;
                }
                return -1;
            }
        });
        
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i).getH()+" "+ v.get(i).getM()+" "+v.get(i).getS());
        }  
    }
}
