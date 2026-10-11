package Spark3;

public class LogicalOperator ///bss boolean values return krta hai
{
    public static void main(String[] args)
    {
        boolean a=true;
        boolean b=false;
        boolean c=true;
        ///AND
        System.out.println("a && b "+(a&&b)); ///jab dono conditions true ho
        System.out.println("a && c "+(a&&c));
        ///OR
        System.out.println("a || b "+(a||b)); ///jb koi  b ek condition true ho
        ///NOT
        System.out.println("!(a && b) "+!(a&&b)); /// condition reverse opposite krta hai
    }
}
