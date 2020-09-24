import com.horstmannn.corejava.*;
import static java.lang.System.*;           // 用于导入java.lang.System包下的所有静态方法和静态字段


public class PackageTest {
    public static void main(String[] agrs) {
        Employee wang = new Employee("wang", 30000, 2020, 12, 20);

        wang.raiseSalary(5);

        out.println("Name:" + wang.getName() + " Salary:" + wang.getSalary() + " HireDay:" + wang.getHireDay());
    }
}
