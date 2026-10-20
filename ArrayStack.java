@SuppressWarnings("unchecked")
public class ArrayStack<T> implements StackInterface<T>
{

    private T[] stack;
    private int size;

    public ArrayStack()
    {
        size = 0;
        this.stack = (T[])new Object[4];
    }

    @Override 
    public int size()
    {
        return size;
    }
    @Override 
    public boolean empty()
    {
        return (size == 0);
    }
    @Override 
    public T peek() throws StackUnderflowException
    {
        
        if(size == 0)
        {
            throw new StackUnderflowException("There are no elements in stack");
        }
        else
        {
            return stack[size];
        }
    
    }
    @Override 
    public T pop() throws StackUnderflowException
    {
        if(size == 0)
        {
            throw new StackUnderflowException("There are no elements in stack");
        }
        else
        {
            T toReturn = stack[size];
            stack[size] = null;
            size--;
            if(size == stack.length/4 && stack.length > 4)
            {
                halfLength();
            } 
            return toReturn;
            
        }
    }
    @Override
    public T push(T item)
    {
        if(size == stack.length)
        {
            doubleLength();
        }
        stack[size] = item;
        size++;
        return item;
    }
    @Override
    public void clear()
    {
        for(int i = 0; i < size; i++)
        {
            stack[i] = null;
        }
        size = 0;
    }

    @Override
    public int search(Object o)
    {
        for(int i = size -1; i >= 0; i--)
        {
            if((stack[i] != null && stack[i].equals(o)) || stack[i] == o)
            {
                return size-i;
            }
        }
        return -1;
    }

    private void halfLength()
    {
        int length = this.stack.length;
        T[] newStack = (T[])new Object[length/2];
        for(int i = 0; i < newStack.length; i++)
        {
            newStack[i] = stack[i];
        }

        stack = newStack;

    }

     private void doubleLength()
    {
        int length = stack.length;
        T[] newStack = (T[])new Object[2*length];
        for(int i = 0; i < stack.length; i++)
        {
            newStack[i] = stack[i];
        }

        stack = newStack;

    }


}
