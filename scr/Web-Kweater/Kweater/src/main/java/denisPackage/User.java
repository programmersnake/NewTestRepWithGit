package denisPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

class Person{
    private String name, sername;
    private int age;
    private Gender gender = Gender.Null;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }
}

@Component("User")
public class User extends Person {

    private String name, sername, nikname;              //Через сеттер сделать
    private int age;
    private Gender gender=Gender.Null;

    User() {}

    User(String name, String sername, int age, Gender gender, String nikname){
        this.name=name;
        this.sername=sername;
        this.age=age;
        this.gender=gender;
        this.nikname=nikname;
    }

    void createUser(String name, String sername, int age, Gender gender, String nikName){
        this.name=name;
        this.sername=sername;
        this.age=age;
        this.gender=gender;
        this.nikname=nikName;
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String getSername() {
        return sername;
    }

    @Override
    public void setSername(String sername) {
        this.sername = sername;
    }

    public String toString(){
        return "Name is "+name+". Sername is "+sername+". Age is "+age+". Nikname is "+nikname+". Gender is "+gender+".";
    }
}

enum Gender{
    Null,Male,Female;
}