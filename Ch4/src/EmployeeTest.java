/*
* 需求： 1.存储三个员工的个人信息（String姓名、double工资、LocalDate对象--雇佣日期）
*       2.对三个人的薪资增长5%
*       3.打印三个人的姓名 薪水 雇佣日期
*
* */


import java.time.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Briansun", 40000, 2022, 8, 20);
        staff[1] = new Employee("NickiMinaj", 40000, 2020, 10, 1);
        staff[2] = new Employee("CardiB", 40000, 2020, 10,1);

        // Raise Salary
        for(Employee e : staff){
            e.raiseSalary(20.0);
        }

        // Print Staff Info
        for(Employee e :staff){
            System.out.println("Name:" + e.getName() + " Salary:" + e.getSalary() + " HireDay:" + e.getHireDay());
        }
    }
}

class Employee{
    private String name;
    private double salary;
    private LocalDate hireDay;

    // Constructor
    public Employee(String n, double s, int year, int month, int day){
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year, month, day);
    }

    String getName(){
        return name;
    }

    double getSalary(){
        return salary;
    }

    LocalDate getHireDay(){
        return hireDay;
    }

    void raiseSalary(double byPercent){
        this.salary = this.salary * (1+0.01*byPercent);
    }

}
