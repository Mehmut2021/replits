package replit08_OOP._05Person1;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        firstName = "undefined";
        lastName = "undefined";
        age = -1;
    }

    public Person(String firstName, String lastName, int age){
        //this.firstName = firstName;
        setFirstName(firstName);
        //this.lastName = lastName;
        setLastName(lastName);
        //this.age = age;
        setAge(age);
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return firstName + " | " + lastName + " | " + age;
    }

}
/*
`Person` class has following attributes:

 - private String instance variables: `firstName, lastName`

 - private int instance variable: `age`

`Methods:`

  - `getter and setter` methods for each instance variable. try to use `this keyword

   - `toString` method. No parameters and returns person info in this format: ``firstName | lastName | age``
  > Note: does not print! no println in the method!

`Constructors:`

1) **No-Args** constructor
 - sets default values for the Person object
 >name and lastName => "undefined"
 age => -1
2) **3-Args**  Constructor:
 - accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable
 >try to use `this` keyword
Examples:
```
Person person = new Person();
System.out.println(person.getFirstName()); //"undefined"
System.out.println(person.getLastName());  //"undefined"
System.out.println(person.getAge());       // -1
System.out.println(person.toString());     //"undefined | undefined | -1"
person.setFirstName("John");
person.setLastName("Doe");
person.setAge(44);
System.out.println(person.toString() ); // "John | Doe | 44"
```
 */