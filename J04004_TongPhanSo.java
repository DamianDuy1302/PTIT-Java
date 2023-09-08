/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;
import java.util.Scanner;

class ps{
    public long a, b;
    public ps(long a, long b){
        this.a=a;
        this.b=b;
    }
    
    public long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public long lcm(long a, long b){
        return a*b/gcd(a, b);
    }
    
    public void rutgon(){
        long tmp = gcd(this.a, this.b);
        this.a = this.a/tmp;
        this.b = this.b/tmp;
    }
    public ps congPs(ps A){
        long k = lcm(this.b, A.b);
        long tuso = this.a*(k/this.b)+ A.a*(k/A.b);
        ps ans = new ps(tuso, k);
        ans.rutgon();
        return ans;
        
    }
    
    @Override
    public String toString(){
        return this.a +"/"+ this.b;
    }
}
        
        
        
public class J04004_TongPhanSo {

    
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        long a = ip.nextLong();
        long b = ip.nextLong();
        long c = ip.nextLong();
        long d = ip.nextLong();
        ps p1 = new ps(a, b);
        ps p2 = new ps(c, d);
        ps p3 = p1.congPs(p2);
        p3.rutgon();
        System.out.println(p3);
    }
}
