package packages.NestedInterfaces;

public class B implements A.NestedInteger {
   public boolean isOdd(int num){
    return(num & 1)==1;
   }
}
