/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class pr implements Comparable<pr>{
    static int n=1;
    int id;
    String name, type;
    float buy, sell;
    float profit;
    
    public pr(String name, String type, float buy, float sell){
        this.id = n++;
        this.name = name;
        this.type = type;
        this.buy = buy;
        this.sell = sell;
        this.profit = sell-buy;
    }
    
    public Float get_profit(){
        return this.profit;
    }
    
    @Override
    public String toString(){
        return this.id +" "+this.name+" "+this.type+" "+ String.format("%.2f", this.profit);
    }
    
    @Override
    public int compareTo(pr o){
        return -(this.get_profit().compareTo(o.get_profit()));
    }
}
public class J05010_SapXepDanhSachMatHang {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        ArrayList<pr> v = new ArrayList<>();
        int t= ip.nextInt();
        ip.nextLine();
        while(t-->0){
            String name = ip.nextLine();
            String type = ip.nextLine();
            float buy = Float.parseFloat(ip.nextLine());
            float sell = Float.parseFloat(ip.nextLine());
            pr a = new pr(name, type, buy, sell);
            v.add(a);
        }
        Collections.sort(v);
        for(pr a: v){
            System.out.println(a);
        }
    }
}
