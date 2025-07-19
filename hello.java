package packages.human;

public class hello {
      int age;
      String name;
      long salary;
      public hello(int age,String name,long salary){
        this.age=age;
        this.name=name;
        this.salary=salary;
    }
    public void details(){
      System.out.println("Age : "+age);
      System.out.println("name : "+name);
      System.out.println("salary : "+salary);
    }
}

