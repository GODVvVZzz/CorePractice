package chapter_5.abstractClasses;

/**
 * @author HP
 * @date 2022/3/1
 */
public abstract class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }

    public abstract String getDescription();

    public String getName(){
        return name;
    }
}
