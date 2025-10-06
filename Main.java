/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dolehassignment4;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * 
 */
public class DolehAssignment4 {
     static int id;
     static String name;
     static double gpa;
     static boolean isTransfer;
     static String college;
     static int u;
     static int getId(ArrayList<Student>students, int u){
    
return students.get(u).id;

     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(); 
        Scanner input = new Scanner(System.in);
    String c = "Y";
    while(c.equals("Y")){
        int cn = 0;
    System.out.print("Do you have any more students (Y or N)\n");
    c = input.nextLine();
    if (c.equals("N")){
        break;
    }
    System.out.print("Are they graduate or undergraduate (U or G)\n");
    String t = input.nextLine();
    if (t.equals("U")){
        System.out.print("Student name: \n");
        name = input.nextLine();
        System.out.print("Student GPA: \n");
        gpa = input.nextDouble();
        System.out.print("Student ID: \n");
        id = input.nextInt();
        System.out.print("Is this student a transfer student (Y or N)\n");
        input.nextLine();
        String x = input.nextLine();
        if (x.equals("Y")){
        isTransfer = true;}
        if (x.equals("N")){
        isTransfer = false;}
        students.add(new Undergrad(name,gpa,id,isTransfer));
        cn++;

    }
    if (t.equals("G")){
        System.out.print("Student name: \n");
        name = input.nextLine();
        System.out.print("Student GPA: \n");
        gpa = input.nextDouble();
        System.out.print("Student ID: \n");
        id = input.nextInt();
        System.out.print("College: \n");
        input.nextLine();
        college = input.nextLine();
        students.add(new grad(name,gpa,id,college));

    }
    }
    int id = -1;
while (id != 0){
    boolean u = false;
   
System.out.print("Enter Id: (0 to quit)\n");
id = input.nextInt();    
for (int xx = 0; xx < students.size(); xx++){
int h = getId(students, xx);
if (h == id){
    u = true;
    System.out.print(students.get(xx).getInfo());
    break;
}
else{
    u = false;
    }
}
if (u == false && id != 0){
System.out.print("ID "+ id + " not found\n");
}   

    }
System.out.print("Goodbye");
    }
}

