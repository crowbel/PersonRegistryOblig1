package PersonRegistry;

public class Person {
    private String name;
    private int age;
    private String birthDate;
    private String eMail;
    private String phoneNr;

    public Person(String name, int age, String birthDate, String eMail, String phoneNr){
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.eMail = eMail;
        this.phoneNr = phoneNr;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String geteMail() {
        return eMail;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

}
