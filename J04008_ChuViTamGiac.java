/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;
import java.util.Scanner;

class point{
    double x, y;
    public point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double dis(point A){
        double tmp = (this.x-A.x)*(this.x-A.x) + (this.y-A.y)*(this.y-A.y);
        double ans = Math.sqrt(tmp);
        return ans;
    }
}
class trian{
    point a, b, c;
    
    public trian(point a, point b, point c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double findPerimeter(){
        double ab = a.dis(b);
        double bc = b.dis(c);
        double ca = c.dis(a);
        if(ab+bc>ca && bc+ca>ab && ca+ab>bc){
            double ans = ab+bc+ca;
            return ans;
        }
        else{
            return 0;
        }
    }   
}

public class J04008_ChuViTamGiac {

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        int t = ip.nextInt();
        while(t-->0)
        {
            double a = ip.nextDouble();
            double b = ip.nextDouble();
            double c = ip.nextDouble();
            double d = ip.nextDouble();
            double e = ip.nextDouble();
            double f = ip.nextDouble();
            point p1 = new point(a, b);
            point p2 = new point(c, d);
            point p3 = new point(e, f);
            trian del = new trian(p1, p2, p3);
            double ans = del.findPerimeter();
            if(ans==0){
                System.out.println("INVALID");
            }
            else{
                System.out.printf("%.3f", ans);
                System.out.println();
            }
        }
    }
}
