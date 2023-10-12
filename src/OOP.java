class User{
   private String name;
   private int age;

   public void setAge( int newAge){
       this.age = newAge;
   }
   public int getAge(){
       return age;
   }
   public void setName( String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
}
public class OOP {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        User u = new User();
        u.setAge(30);
        u.setName("Viateur");
        System.out.println(u.getAge());
        System.out.println(u.getName());
    }
}