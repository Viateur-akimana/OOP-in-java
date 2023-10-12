import java.util.ArrayList;
import java.util.List;

class User{
   private String name;
   private int age;
   public User (String name, int age){
       setName(name);
       setAge(age);
   }

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
        List<User> users = new ArrayList<User>();
        users.add(new User("Viateur",17));
        users.add(new User("David",29));
        users.add(new User("Sammy",79));
        for(int i=0; i< users.size();i++){
            System.out.println(users.get(i).getName());
        }
    }
}