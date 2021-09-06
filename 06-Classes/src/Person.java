public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String word){
        this.firstName = word;
    }
    public void setLastName(String word){
        this.lastName = word;
    }
    public void setAge(int number){
        if (number < 0 || number > 100){
            this.age = 0;
        } else {
            this.age = number;
        }
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
}
