public class Person {
    private String name;

    public Person() {

    }
    public static void main (String[] args) {
        Person person = new Person();
     //   System.out.println(person.name);
        person.setName("dave");
     //   System.out.println(person.name);
    }


    public String getName(){
// return the person's name
        return this.name;
    }

    public void setName(String name){
// change the name property to the passed value
        this.name = name;
    }

    public void sayHello(){
// print a message to the console using the person's name
        System.out.println("Hello from %s!");
    }

}
