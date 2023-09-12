/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;
import java.util.Scanner;
import java.math.BigInteger;

class ps{
    public BigInteger a, b;
    public ps(BigInteger a, BigInteger b){
        this.a=a;
        this.b=b;
    }
    
    public BigInteger gcd(BigInteger a, BigInteger b){
        if(b.toString().equals("0")) return a;
        return gcd(b, a.mod(b));
    }
    
    
    public void rutgon(){
        BigInteger tmp = gcd(this.a, this.b);           
        this.a = this.a.divide(tmp);
        this.b = this.b.divide(tmp);

    }
    public ps thuongPs(ps A){
        
        BigInteger tuso = this.a.multiply(A.b);
        BigInteger mauso = this.b.multiply(A.a);
        ps ans = new ps(tuso, mauso);        
        ans.rutgon();
        return ans;
        
    }
    
    @Override
    public String toString(){
        return this.a +"/"+ this.b;
    }
}
        
        
        
public class Test1_TinhThuong2PhanSo {
 
    public static void main(String args[]){
        Scanner ip = new Scanner(System.in);
        BigInteger a = new BigInteger(ip.next());
        BigInteger b = new BigInteger(ip.next());
        BigInteger c = new BigInteger(ip.next());
        BigInteger d = new BigInteger(ip.next());
        ps p1 = new ps(a, b);
        ps p2 = new ps(c, d);
        ps p3 = p1.thuongPs(p2);
        p3.rutgon();
        if(p3.a.mod(p3.b).toString().equals("0")){
            System.out.println(p3.a.divide(p3.b));
        }
        else
        System.out.println(p3);
    }
}
