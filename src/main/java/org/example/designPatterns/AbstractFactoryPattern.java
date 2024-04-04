package org.example.designPatterns;

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        Phone phone = PhoneFactory.getPhoneFactoris(new SamsungFactory());
        System.out.println(phone.OS());
    }
}

abstract class AbstractPhoneFactory{

    public abstract Phone createFactory();

}
class SamsungFactory extends  AbstractPhoneFactory{

    public Phone createFactory(){
        return new Samsung();
    }

}
class iPhoneFactory extends  AbstractFactoryPattern{

    public Phone createFactory(){
        return new iPhone();
    }

}

