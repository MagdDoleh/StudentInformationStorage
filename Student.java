/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dolehassignment4;

/**
 *
 * @author lebrondoleh
 */
public abstract class Student {

String name;
double gpa;
int id;

Student(){}

public Student(String name, double gpa, int id) {
this.name = name;
this.gpa = gpa;
this.id = id;
        }

String getInfo(){
    String q = "Name: " + name + "\nGPA: " + gpa +  "\nID: " + id;
        return q;
}
}
class Undergrad extends Student{
boolean isTransfer;
;
Undergrad(String name, double gpa, int id, boolean isTransfer){
this.name = name;
this.gpa = gpa;
this.id = id;
this.isTransfer = isTransfer;
}
@Override
    public String getInfo(){
    String r = "Name: " + name + "\nGPA: " + gpa +  "\nID: " + id + "\nTransfer: " + isTransfer +"\n";
    return r;
        }
}


class grad extends Student{
String college;
grad(String name, double gpa, int id, String college){
this.name = name;
this.gpa = gpa;
this.id = id;
this.college = college;
}
@Override
    String getInfo(){
    String e = "Name: " + name + "\nGPA: " + gpa +  "\nID: " + id + "\nCollege: " + college +"\n";
    return e;

    
    
    }

}


