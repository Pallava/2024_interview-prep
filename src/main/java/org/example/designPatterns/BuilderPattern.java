package org.example.designPatterns;

import java.util.List;

public class BuilderPattern {

    public static void main(String[] args) {
     User user1 =    new User.UserBuilder().setEmail("pallav.shetty@gmail.com")
                .setUsername("Pallava").build();
        System.out.println(user1);



        List<Mobile> mobiles = List.of(Mobile.MobileBuilder.builder().setOs("OneUI")
                .setMemory(128)
                .setRam(12)
                .setProcessor("Mediatek").build(),Mobile.MobileBuilder.builder().setOs("colorOs")
                .setMemory(256)
                .setRam(8)
                .setProcessor("Snapdragon").build());
        System.out.println(mobiles);

    }
}
class Mobile{

    private final String os;
    private final String processor;
    private final int ram;
    private final int memory;

    @Override
    public String toString() {
        return "Mobile{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", memory=" + memory +
                '}';
    }

    Mobile(MobileBuilder mobileBuilder){
        this.os=mobileBuilder.os;
        this.processor=mobileBuilder.processor;
        this.memory=mobileBuilder.memory;
        this.ram=mobileBuilder.ram;
    }

    public String getOs() {
        return os;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getMemory() {
        return memory;
    }

   public static class MobileBuilder{
        private  String os;
        private  String processor;
        private  int ram;
        private  int memory;

       public MobileBuilder() {

       }

       public static MobileBuilder builder(){
           return new MobileBuilder();
       }
       public Mobile build(){
           return new Mobile(this);
       }

       public MobileBuilder setOs(String os) {
           this.os = os;
           return this;
       }

       public MobileBuilder setProcessor(String processor) {
           this.processor = processor;
           return this;
       }

       public MobileBuilder setRam(int ram) {
           this.ram = ram;
           return this;
       }

       public MobileBuilder setMemory(int memory) {
           this.memory = memory;
           return this;
       }
   }

}

class User{

    private final String username;
    private final String email;

    User(UserBuilder userBuilder){
        this.email=userBuilder.email;
        this.username=userBuilder.username;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public  static class UserBuilder{
        private  String username;
        private  String email;

        public UserBuilder(){

        }

       public UserBuilder setUsername(String username) {
           this.username = username;
           return this;
       }

       public UserBuilder setEmail(String email) {
           this.email = email;
           return this;
       }

       User build(){
            return new User(this);
       }
   }

}