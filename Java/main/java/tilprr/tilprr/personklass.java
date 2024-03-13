package tilprr.tilprr;

public class personklass{
    public static void main(String[] args){
        Person p = new Person();
        p.age = 100;
        p.printPerson();
        Person arvid = new Person("arvid","kågedal",18, "12345678");
        arvid.printPerson();
    }
}