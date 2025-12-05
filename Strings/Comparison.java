package Strings;

public class Comparison {
    public static void main(String[] args){
        String a="vijay"; //stores in string pool
        String b="vijay"; //stores in string pool
        String c=new String("vijay"); //stores in heap
        System.out.println(a==b); //true because both refer to same location in string pool
        System.out.println(a==c); //false because a refers to string pool and c refers to heap
        System.out.println(a.equals(c)); //true because .equals() compares values
        String d=new String("vijay");
        System.out.println(c==d); //false because both refer to different locations in heap
        System.out.println(c.equals(d)); //true because .equals() compares values
    }
}
