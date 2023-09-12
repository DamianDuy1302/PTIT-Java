/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PTIT_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student implements Comparable<Student>{

    private String id;
    private String name;
    private String className;
    private String email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }
    
    public int compareTo(Student o){
        if (this.getClassName().equals(o.getClassName())) {
                    return this.getId().compareTo(o.getId());
                }
                return this.getClassName().compareTo(o.getClassName());
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}

public class J05020_SapXepSinhVienTheoLop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        ArrayList<Student> arrayList = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }
        Collections.sort(arrayList);
        for(Student a:arrayList){
            System.out.println(a);
        }
    }
}
