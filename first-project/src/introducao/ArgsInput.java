package introducao;
public class ArgsInput {
   public static void main(String[] args) {
        String name = args[0];
        String lastName = args[1];
        String age = args[2];
     
            //output
        System.out.println("Hello, my name is " + name + " " + lastName);
        System.out.println("And I'm " + age + " years old");
   } 
}
