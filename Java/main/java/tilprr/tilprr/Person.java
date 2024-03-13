package tilprr.tilprr;



public class Person {
    String fName;
    String lName;
    int age;
    String phoneNr;

    Person(String fName, String lName, int age, String phoneNr){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.phoneNr = phoneNr;
    }
    Person(){}

    public void printPerson(){
        System.out.println(fName);
        System.out.println(lName);
        System.out.println(age);
        System.out.println(phoneNr);
    }
    
}
