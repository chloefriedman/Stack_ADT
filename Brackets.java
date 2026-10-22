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
        if(b.equals(" "))
        {
            return true;
        }
        if(b.length() == 0)
        {
            return true;
        }
        if(b.length() %2 != 0 || b.substring(0,1).equals("}"))
        {
            return false;
        }
     
        ArrayStack<String> temp = new ArrayStack<>();
        for(int i = 0; i < b.length(); i++)
        {
            String item = b.substring(i,i+1);
            if(item.equals("{"))
            {
               String a = temp.push(item);
            }
            else if(item.equals("}"))
            {
                if(temp.empty())
                {
                    return false;
                }
               String a = temp.pop();
            }
        }
        if(temp.empty())
        {
            return true;
        }
        else
        {
            return false;
        }

        
    }
}
