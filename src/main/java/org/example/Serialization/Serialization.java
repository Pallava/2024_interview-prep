package org.example.Serialization;

import java.io.*;

public class Serialization {

    public static void main(String[] args) {
       serialization();
       deserialization();
    }

    private static void serialization() {
        try {
            Person p = new Person("Pallava",34);
            FileOutputStream fo = new FileOutputStream("Serialization.txt");
            ObjectOutputStream str = new ObjectOutputStream(fo);
            str.writeObject(p);
            str.flush();
            str.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch(IOException e){
            throw new RuntimeException("Deserialization failed!!");
        }
    }

    private static void deserialization() {
        try {
            FileInputStream fileInputStream = new FileInputStream("Serialization.txt");
            ObjectInputStream in = new ObjectInputStream(fileInputStream);
            Person p = (Person)in.readObject();
            System.out.println("deserializing the object " + p);
        } catch (FileNotFoundException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
class Person implements Serializable{

    @Serial
    private static final long serialVersionUID = -4133873089854056570L;
    private String name;
    private int age;

    public Person(String name, int age) {
    this.age=age;
    this.name=name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}