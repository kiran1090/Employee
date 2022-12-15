public class Main {
     public static void main(String[] args) {
         Employee employeeOne= new Employee("kiran", 30, 1000.00,"tvm");
         Employee employeeTwo= new Employee("abc",30,1000,"tvm");
         System.out.println(employeeOne.name);
         System.out.println(employeeTwo.age);
         employeeOne.raiseSalary();
         System.out.println(employeeOne.salary);


    }
}
