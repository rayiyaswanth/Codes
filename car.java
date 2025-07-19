package packages.interfaces;

public class car implements Engien,Brake{

    @Override
    public void start() {
        System.out.println("i am starting");
    }

    @Override
    public void stop() {
       System.out.println("i am stoped");
    }

    @Override
    public void acc() {
       System.out.println("i am  taking accelarating");
    }
    public void brake(){
        System.out.println("i am breaking");
    }
    
}
