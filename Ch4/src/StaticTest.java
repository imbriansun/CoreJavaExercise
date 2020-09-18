/*
* This program demonstrates static method.
*
* 需求： 1.存储三个员工的个人信息（String姓名、double工资）
*       2.对三个人的 进行员工编号并打印三个人的姓名 薪水 员工编号
*       3.获取到下一个能使用的员工编号并打印出来
* */

public class StaticTest {
    public static void main(String[] args){
     Employee2[] staff = new Employee2[3];

     staff[0] = new Employee2("briansun", 50000);
     staff[1] = new Employee2("Dick", 50000);
     staff[2] = new Employee2("CardiB", 50000);

     for(Employee2 e : staff){
         e.setId();
         System.out.println("name:" + e.getName() + " Salary:" + e.getSalary() + " Id:"
                 + e.getId());
     }


     System.out.println("Next Available Id:" + Employee2.getNextId());
    }
}

class Employee2{
    private String name;
    private double salary;
    private int id;

    private static int nextId = 1;

    public Employee2(String n, double s){
        name = n;
        salary = s;
    }

    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId(){
        id = nextId;
        nextId++;
    }

//  类方法（静态方法）
    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args){
        Employee2 e = new Employee2("TestPerson", 24000 );
        System.out.println("Name:"+ e.getName() + " " + "Salary:" + e.getSalary());
    }
}
