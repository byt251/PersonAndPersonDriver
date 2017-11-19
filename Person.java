/**
 * Person class is a class to represent person with name and age
 */
public class Person {
    String name;
    int age;

    /**
     * Person constructor is used to initialize name with "Abraham" and age with "22"
     */
    public Person() {
        name = "Abraham";
        age = 25;
    }

    /**
     * Person constructor initializes a person object with
     * @param name
     * @param age
     */
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    /**
     * getter method or accessor method
     * @return name of a person
     */
    public String getName(){
        return name;
    }

    /**setter method or mutator method for name
     * @param name
     */
    public void setName(String name){
        this.name= name;
    }

    /**
     * getter/accessor/ method for age
     * @return age
     */
    public int getAge(){
        return age;
    }

    /**
     * setter/muttator/ method for age
     * @param age
     */
    public void setAge(int age){
        this.age=age;
    }

    /**
     *toString method returns a string that  represents this object
     * @return name and age
     */
    public String toString(){
        return "Name "+ this.name +" Age "+this.age;
    }

}
