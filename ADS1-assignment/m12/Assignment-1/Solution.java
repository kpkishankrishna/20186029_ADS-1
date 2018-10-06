import java.util.*;
//Student Name, Date of birth, subject1 marks,
// subject2 marks, subject3 marks, Total marks,
//  Reservation category

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qualified = Integer.parseInt(sc.nextLine());
        int vacancies = Integer.parseInt(sc.nextLine());
        int unreserved = Integer.parseInt(sc.nextLine());
        int bccatagory = Integer.parseInt(sc.nextLine());
        int sccatogory = Integer.parseInt(sc.nextLine());
        int stcatagory = Integer.parseInt(sc.nextLine());
        Student[] qualifiedarray = new Student[qualified];
        for (int i = 0; i < qualified; i++) {
            String[] studentinfo = sc.nextLine().split(",");
            qualifiedarray[i] = new Student(studentinfo[0], studentinfo[1], Integer.parseInt(studentinfo[2]),
             Integer.parseInt(studentinfo[3]), Integer.parseInt(studentinfo[4]), Integer.parseInt(studentinfo[5]), 
             studentinfo[6]);
        }
        Merge.sort(qualifiedarray);
        for (int i = 0; i < qualified; i++) {
            System.out.println(qualifiedarray[i].studentname + ","+ qualifiedarray[i].totalmarks + "," + qualifiedarray[i].reservation);
        }
        System.out.println("\n");
        for (int i = 0; i < vacancies; i++) {
            System.out.println(qualifiedarray[i].studentname + ","+ qualifiedarray[i].totalmarks + "," + qualifiedarray[i].reservation);
        }
        // System.out.println("ghvg");






    }
}