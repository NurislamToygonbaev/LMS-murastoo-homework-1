public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }
    public Dancer(){
        super();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}'+ super.toString();
    }
    public String dancing(){
        return STR."to dance";
    }
}
