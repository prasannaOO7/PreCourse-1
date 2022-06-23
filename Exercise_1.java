class Stack { 
	  //Please read sample.java file before starting.
	  //Kindly include Time and Space complexity at top of each file
	    static final int MAX = 1000; 
	    int top;
	    int a[] = new int[MAX]; // Maximum size of Stack 
	  
	    boolean isEmpty() 
	    { 
	        //Write your code here
	        return top==0;
	    } 

	    Stack() 
	    { 
	        //Initialize your constructor 
	    	this.top=0;
	    	this.a = new int[MAX];
	    } 
	  
	    boolean push(int x) 
	    {   if(top>(MAX-1)){
	            return false;
	        }
	        //Check for stack Overflow
	        //Write your code here
	        a[top]=x;
	        top++;
	        return true;

	    } 
	  
	    int pop() 
	    { 
	        //If empty return 0 and print " Stack Underflow"
	        //Write your code here
	        if(top==0){
	            System.out.print("Stack Underflow");
	            return 0;
	        }
	        else {
	        int bb=a[top];
	        top--;
	        return a[bb];
	        }
	        
	       
	       

	    } 
	  
	    int peek() 
	    { 
	        //Write your code here
	        return a[top-1];
	    }
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
