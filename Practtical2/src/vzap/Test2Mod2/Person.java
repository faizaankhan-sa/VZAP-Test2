package vzap.Test2Mod2;


public class Person implements Drawing{

    private String name;
    private String dob;
    @Override
    public void draw() {

    }

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return name + dob;
    }
}