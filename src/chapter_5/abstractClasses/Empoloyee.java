package chapter_5.abstractClasses;

import java.time.LocalDate;

/**
 * @author HP
 * @date 2022/3/1
 */
public class Empoloyee extends Person {

    private double salary;
    private LocalDate hireDay;

    public Empoloyee(String name, double salary, int year, int month, int day){
        super(name);
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
    public String getDescription(){
        return String.format("an employee with a salary of $%.2f",salary);
    }

}
