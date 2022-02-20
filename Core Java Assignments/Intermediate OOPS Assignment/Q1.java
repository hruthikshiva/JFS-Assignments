import java.util.Objects;
class SingletonInheritanceCheck{
    public static void Check(Singleton A, Singleton B) {
        if(Objects.equals(A , B)){
            System.out.println("Authenticated Singleton Inheritance");}

        else {
            System.out.println("Not Singleton");
        }
    }
}
class Singleton
{
    private static Singleton instance;
    public String str;
    private Singleton()
    {
        str = "Yes it is a Singleton Class";
    }
    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String args[])
    {
        Singleton text = Singleton.getInstance();
        Singleton text2 = Singleton.getInstance();
        System.out.println(text.str);
        System.out.println(text2.str);
        SingletonInheritanceCheck.Check(text,text2);
    }
}
