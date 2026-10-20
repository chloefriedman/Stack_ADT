public class ArrayStackTest {
    public static void main(String[] args) throws StackUnderflowException {
        
        ArrayStack<String> first = new ArrayStack<String>();
        first.push("A");
        first.push("B");
        first.push("C");
        System.out.println("Testing peek. Answer should be c");
        System.out.println(first.peek());
        System.out.println("Testing size. Should be 3");
        System.out.println(first.size());
        System.out.println("Testing pop. Answer should be C");
        System.out.println(first.pop());
        System.out.println("Testing size. Should be 2");
        System.out.println(first.size());   
        System.out.println("Testing push. Attempting to add D");
        first.push("D");
        System.out.println("Testing size. Should be 3");
        System.out.println(first.size());
        System.out.println("Testing peek. Answer should be D");
        System.out.println(first.peek());

        ArrayStack<String> second = new ArrayStack<String>();
        second.push("Hi");
        second.push("Bye");
        second.push("yay");
        System.out.println("Testing search for Hi on a new list. The answer should be 3");
        System.out.println(second.search("Hi"));

        System.out.println("Now going to clear");
        second.clear();
        System.out.println("Testing size. Should be 0");
        System.out.println(second.size());
        System.out.println("Testing second peek and pop, should throw exception");
        try
        {
            System.out.println(second.peek());
        }
        catch(StackUnderflowException e)
        {
            System.out.println("Exception: The stack is empty");
        }
        try
        {
            System.out.println(second.pop());
        }
        catch(StackUnderflowException e)
        {
            System.out.println("Exception: The stack is empty");

        }

        System.out.println("Testing empty method, should return true");
        System.out.println(second.empty());

    }
}
