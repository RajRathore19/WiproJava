//import java.util.Scanner;

/**
 * management
 */
public interface EmployeeMnagement {
    void work();

    void display();
}

class Employee implements EmployeeMnagement {

    String name;
    int Id;

    void setname(String empname) {
        name = empname;
    }

    void setId(int empid) {
        Id = empid;
    }

    public void work() {
        System.out.println(name + " is working ");
    }

    public void display() {
        System.out.println("name = " + name);
        System.out.println("Id = " + Id);
    }
}

class Developer extends Employee {
    String language;

    void setlanguage(String setlang) {
        language = setlang;
    }

    public void display() {
        System.out.println("name = " + name);
        System.out.println("Id = " + Id);
        System.out.println("Language = " + language);

    }
}

class Company {
    Employee emp;

    public static void main(String args[]) {

        Company company = new Company();

        Developer d1 = new Developer();
        d1.setname("raj");
        d1.setId(101);
        d1.setlanguage("Java");

        company.emp=d1;

        company.emp.display();
    }
}