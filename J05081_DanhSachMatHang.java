
package javaptit;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;



class pr {
    public static int num = 1;
    String id, name, unit;
    int buy, sell, profit;
    
    public pr(String name, String unit, int buy, int sell){
        this.id = "MH" + String.format("%03d", num++);
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
        this.profit = sell-buy;
    }
    
    public int get_profit(){
        return this.profit;
    }
    
    @Override
    public String toString(){   
        return this.id +" "+ this.name+" "+ this.unit+" "+ this.buy+" "+ this.sell+" "+ this.profit;
    }
       
//    @Override
//    public int compareTo(pr o){
//        return o.get_profit() - this.profit;
//    }
}

public class J05081_DanhSachMatHang {

    static Scanner ip = new Scanner(System.in);
    public static void main(String args[]) {
        int n = ip.nextInt();
        ip.nextLine();
        List<pr> v = new ArrayList<>(n);
        for(int i=0;i<n;i++){
            String name = ip.nextLine();
            String unit = ip.nextLine();
            int buy = Integer.parseInt(ip.nextLine());
            int sell = Integer.parseInt(ip.nextLine());
            pr x = new pr(name, unit, buy, sell);
            v.add(x);
        }
        
//        Collections.sort(v);
        Collections.sort(v, new Comparator<pr>(){
            @Override
            public int compare(pr a, pr b){
                if(a.get_profit() <= b.get_profit()){
                    return 1;
                }
                return -1;
            }
        });
        for(pr i:v){
            System.out.println(i);
        }
    }
}
