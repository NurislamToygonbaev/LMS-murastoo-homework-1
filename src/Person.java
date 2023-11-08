import static java.lang.StringTemplate.STR;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
    public String learn(){
        return STR."I learning: ";
    }
    public String walk(){
        return STR."I walking: ";
    }
    public String eat(){
        return STR."I eating: ";
    }
}
