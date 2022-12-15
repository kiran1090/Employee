public class Employee {
    String name;
    int age;
    double salary;
    String location;


    Employee(String name,int age,double salary,String location)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.location=location;
    }
//create a function salary raise
    void raiseSalary() {
        this.salary = this.salary + 2000;
    }
}