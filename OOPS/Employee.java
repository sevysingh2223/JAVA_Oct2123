package OOPS;

// Class : Noun
// Classname : PascalCase
public class Employee extends Object{
    // data members
    int id;
    String name;
    double salary;

    public void takeInput(int id , String name , double salary){
        if(id<=0 || name==null || salary<=0){
            System.out.println("Invalid data");
            return;
        }
        this.id =id;
        this.name =name;
        this.salary =salary;
    }

    // member functions
    public void print(){
        System.out.println("I'm inside the print");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }
}

// This keyword : object refernce current class

// Object Class : God Class

// id,name and salary --> scope : within folder / package
// data can be corrupted easily
// user can fill invalid data
// Solution : make id, name ,salary as "private"
// if data is private, can't be corrupted

// Encapsulation : Data Protect

// Parent class : SHAPE
// Child classes : Rectangle , Circle , Square

// Rectangle : takeinput(l,b);
//             printarea()

// Circle    : takeInput(r)
//             printArea();

