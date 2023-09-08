/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaptit;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;


class WordSet{
    
    ArrayList<String> arr;
    
    public WordSet(String g){
        g = g.toLowerCase();
        this.arr = new ArrayList<>();
        String[] a = g.split("\\s+");
        this.arr.addAll(Arrays.asList(a));
    }
    
    public WordSet(ArrayList<String> arr){
        this.arr = arr;
    }
    
    public WordSet union(WordSet x){
        TreeSet<String> s = new TreeSet<>();
        for(String i : arr){
            s.add(i);
        }
        for(String i : x.arr){
            s.add(i);
        }
        return new WordSet(new ArrayList<>(s));
    }
    
    public WordSet intersection(WordSet x){
        TreeSet<String> s = new TreeSet<>();
        for(String i : arr){
            if(x.arr.contains(i)){
                s.add(i);
            }
        }
        return new WordSet(new ArrayList<>(s));
    }
    
    @Override
    public String toString(){
        String res = "";
        for(String i : arr){
            res += i + " ";
        }
        return res;
    }
}

public class J04022_WordSet {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
