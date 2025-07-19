public class Performance {
    public static void main(String[] args) {
        String series="";
        // here it will give a to z characters.
        for(int i=0;i<26;i++){
            char ch=((char)('a'+i));// here 1->a , 2->b ,3->c .... 26->z.
            //System.out.print(ch +" ");
            // we can also print like series is string 
            series=series+ch;
            
        }
        System.out.println(series);
    }
}
