package module11;

public class CallbyValueExample {
    static class Person{
        String name;
        public static void changeName(Person p , String name ){
         p.name= name;  
            
        }
            
        
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.name="divya";
        // p.name="yash";
        // p.name="divya";
    
        System.out.println(p.name);
        Person.changeName(p,"himawari");
        System.out.println(p.name);
        
       
    }

    
    public static void add(int a,int b){
        a=b;
        System.out.println(a+b);

    }
}   
