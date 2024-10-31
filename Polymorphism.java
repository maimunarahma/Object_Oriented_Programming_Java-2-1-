
class animal{
    int numbers=10;
    // numbers value cant be update or modified in child classes,it can only accessed.
   String pet;
      
    void sound(){
        System.out.println("Animals can sound ");
    }
     void sound(String cat,String dog, String bird){
        System.out.println("meow, bark and sing");
     }
}

class  cat extends animal{
    // Uses of constructor ,As string is non-primitive data and immutable 
    // when child-class want to access and update its parent-class non-primitive data like string and object
    // we cant directly update it ,here comes constructor which is a special type of method having no return type or void or parameters
    // and this special method named after exact the class name.example cat class contains cat() ,dog class contains dog() constructor
    // for updating pet value  
  

    cat(){
        pet="black-cat";
    }
   //here you cant re-assign numbers value.cat,dog ,bird class can only aceess numbers variable.

 @Override
     void sound(){
        System.out.println("cats sound meow");
     }
}

  class dog extends animal{
   
    dog(){
        pet="cute-puppy";
    }
    
    @Override
    void sound(){
       System.out.println("dogs sound bark");
    }

  }
  class bird extends animal{
  
    // 
    bird(){
        pet="love-birds";
    }
   
    @Override
    void sound(){
       System.out.println("birds sing");
    }

  }




public class Polymorphism {

    public static void main(String[] args) {
        String a="pickachu",b="Charlie";
        animal obj1=new animal();
        cat obj2=new cat();
       dog obj3=new dog();
       bird obj4=new bird();
         //static polymorphism
         obj1.sound(a,b,"parrot");
          // dynamic polymorphism
         obj1.sound();
        obj2.sound();
        obj3.sound();
        obj4.sound();
        // inheritance
        System.out.println(obj1.numbers);
        System.out.println(obj2.pet);
        System.out.println(obj2.numbers);
        System.out.println(obj3.pet);
        System.out.println(obj3.numbers);
        System.out.println(obj4.pet);
        System.out.println(obj4.numbers);
        
    }
    
}
