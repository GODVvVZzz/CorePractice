package chapter_5.equals;

/**
 * @author HP
 * @date 2022/3/1
 */
public class EqualsTest {
    public static void main(String[] args) {

        Empoloyee alice1 = new Empoloyee("Alice Adams",75000, 1987, 12, 15);
        Empoloyee alice2 = alice1;
        Empoloyee alice3 = new Empoloyee("Alice Adams", 75000, 1987, 12,15);
        Empoloyee bob = new Empoloyee("Bob Brandson", 50000, 1989, 12, 15);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));
        System.out.println("bob.toString(): "+ bob);

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        System.out.println("boss.toString(): " + boss);
        System.out.println("carl.equals(boss): " + carl.equals(boss));
        System.out.println("alice1.hashCode()" + alice1.hashCode());
        System.out.println("alice3.hashCode()" + alice3.hashCode());
        System.out.println("bob.hashCode():" + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());
    }
}
