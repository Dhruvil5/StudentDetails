/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentdetailsprint;
import java.util.Scanner;

/**
 *
 * @author dhruvil
 */
public class StudentDetailsPrint {

    public static void main(String[] args) {
        Student[] list = new Student[3];
        Scanner in = new Scanner(System.in);
        for(int i =0;i<list.length;i++){
            
            String n =in.next();
            int a= in.nextInt();
            Student s1 = new Student(n,a);
            list[i]=s1;
        }
        //read the data i stored in array list
            for(int i=0;i<list.length;i++){
                System.out.println(list[i].getName()+ " " +list[i].getAge());
       }
            // change wednesday
        
    }
}
