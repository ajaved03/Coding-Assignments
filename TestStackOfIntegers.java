package Cshw105;

public class TestStackOfIntegers {
		
	
	public static void main(String [] args) {
		
		StackOfIntegers stack= new StackOfIntegers();
		
		for(int i=2;i<120;i++) {
		  
	          if(isPrime(i)) {
	        	  stack.push(i);
	          }
		}
		
		
		while(!stack.empty()) {
			System.out.print(stack.pop()+" ");
		}
	
	
	    
	         
	        
	    

}
	public static boolean isPrime(int value) 
    { 
         
        if (value <= 1) 
            return false; 
  
        
        for (int i = 2; i < value; i++) 
            if (value % i == 0) 
                return false; 
  
        return true;
    }
}

   class StackOfIntegers {

    private int[] elements;
    private int size;

    /** Construct a stack with the default capacity 16 */
    public StackOfIntegers() {
        this(16);
    }

    /** Construct a stack with the specified maximum capacity */
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    /** Push a new integer into the top of the stack */
    public int push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        return elements[size++] = value;
    }

    /** Return and remove the top element from the stack */
    public int pop() {
        return elements[--size];
    }

    /** Return the top element from the stack */
    public int peek() {
        return elements[size - 1];
    }

    /** Exercise03_21 whether the stack is empty */
    public boolean empty() {
        return size == 0;
    }

    /** Return the number of elements in the stack */
    public int getSize() {
        return size;
    }
}