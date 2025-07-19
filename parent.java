package packages.Abstract;
 
public abstract class parent {
        int age;
        public parent(int age){
          this.age=age;
        }
        // we can also call static method here because it is abstract class.
        static void Hello(){
          System.out.println("hello world");
        }

     abstract void career();
     abstract void partner();
}
