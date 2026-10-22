public class Brackets
{
    public static void main(String[] args)
    {
        System.out.println("Should be true");
        System.out.println(checkBrackets(" "));
        System.out.println(checkBrackets("{}"));
        System.out.println(checkBrackets("{}{}"));
        System.out.println(checkBrackets("{{}}"));
        System.out.println(checkBrackets("{{{}{{}}}}"));

        System.out.println("\nShould be false");
        System.out.println(checkBrackets("{"));
        System.out.println(checkBrackets("}{"));
        System.out.println(checkBrackets("{}}{"));
        System.out.println(checkBrackets("{{}"));
        System.out.println(checkBrackets("{{}}}{}"));
    }
    
    public static boolean checkBrackets(String b)
    {
        return false;
    }
}
