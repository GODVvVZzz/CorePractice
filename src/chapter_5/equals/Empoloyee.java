package chapter_5.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author HP
 * @date 2022/3/1
 */
public class Empoloyee{

    private  String name;
    private double salary;
    private LocalDate hireDay;

    public Empoloyee(String name,double salary,int year,int month,int day){
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject){
        if (this == otherObject) {
            return true;
        }

        if(otherObject == null){
            return false;
        }

        if(getClass() != otherObject.getClass()){
            return false;
        }

        Empoloyee other = (Empoloyee) otherObject;

        return Objects.equals(name,other.name) && salary == other.salary
                && Objects.equals(hireDay, other.hireDay);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString(){
        return getClass().getName() + "[name=" + name + ",salary=" + ",hireDay=" + hireDay
                + "]";
    }
}
