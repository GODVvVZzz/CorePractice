package chapter_5.abstractClasses;

/**
 * @author HP
 * @date 2022/3/1
 */
public class Student extends Person{

    private String major;

    public Student(String name, String major){
        super(name);
        this.major = major;
    }
    @Override
    public String getDescription(){
        return "a student majoring in" + major;
    }
}
