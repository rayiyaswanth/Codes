import java.util.*;
public class MazeProblems {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        System.out.println(" this is the ways from a to b ");
        // or 
        path(" ", 3, 3);
        // or
        System.out.println();
        System.out.println( "[If we need return the input inside  in this [' '] the input gives inside the box output then do this]");
        System.out.println();
        System.out.println(pathret(" ", 3, 3));
    }
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1, c);
        int right=count(r, c-1);
        return left+right;
    }
    //  or 
    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D', r-1, c);
        }if(c>1){
            path(p+'R', r, c-1);
        }
    }
    // or we need return int [' '] this type in output then do this
    static ArrayList<String> pathret(String p, int r,int c){
        if(r==1 &&  c==1){
        ArrayList<String> list=new ArrayList<>();
        list.add(p);
        return list;
    }
    ArrayList<String> list=new ArrayList<>();
    if(r > 1){
        list.addAll (pathret(p+'D', r-1, c));
    }if(c > 1){
        list.addAll(pathret(p+'R', r, c-1));
    }
    return list;
}
}
