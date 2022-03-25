package chapter_5.arrayList;
import chapter_5.abstractClasses.Empoloyee;

import java.util.*;

/**
 * @author HP
 * @date 2022/3/1
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Empoloyee> staff = new ArrayList<>();

        staff.add(new Empoloyee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Empoloyee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Empoloyee("Tony Tester", 40000, 1990, 3, 15));

        for(Empoloyee e : staff) {
            e.raiseSalary(5);
        }

        for (Empoloyee e:staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + "hireDay=" +
                    e.getHireDay());
        }

    }
}
