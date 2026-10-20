@SuppressWarnings("unchecked")
public class LinkedStack<T> implements StackInterface<T> {

    private LLNode<T> stack;
    private int size;

    public LinkedStack()
    {
        size = 0;
        stack = null;
    }

     // returns the logical size of this StringLog
    public int size()
    {
        return size;
    }
    
    // returns true if this list contains no elements
    public boolean empty()
    {
        return(size == 0);
    }
    
    @Override
    public T push(T item)
    {
        LLNode<T> temp = new LLNode(item);
        if(size == 0)
        {
            stack = temp;
        }
        else
        {
            temp.setLink(stack);
            stack = temp;
        }
        size++;
        return item;
    }


    @Override
    public T peek() throws StackUnderflowException
    {
        if(size == 0)
        {
            throw new StackUnderflowException("No items in stack");
        }
        else
        {
            return stack.getInfo();
        }
    }

    @Override
    public T pop() throws StackUnderflowException
    {
        if(empty())
        {
            throw new StackUnderflowException("No items in stack");
        }
        LLNode<T> toReturn = stack;
        LLNode<T> temp = stack.getLink();
        stack = temp;
        size--;
        return toReturn.getInfo();
    }

    @Override
    public void clear()
    {
        stack = null;
        size = 0;
    }

    @Override 
    public int search(Object o)
    {
        if(size == 0)
        {
            return -1;
        }
        else
        {
            int count = 1;
            LLNode<T> temp = stack;
            while(temp != null)
            {
                if(temp.getInfo().equals(o))
                {
                    return count; 
                }
                count++;
            }
        }
        return -1;
    }

    
}
