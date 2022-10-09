package Cshw103;

public class testInteger{
	
	public static void main(String[] args) {
		
		MyInteger Integer1= new MyInteger(5);
		
		System.out.println(Integer1.isPrime());
		 
		char[] JavaCharArray = {'1', '2', '3', '4', '5'};
	   
		
		System.out.println(MyInteger.isPrime(6));
		
		System.out.println(MyInteger.parseInt(JavaCharArray));
		
		
		
	}
	
}


 class MyInteger {
		
			
	
	
	
	 int value;
		
		
		
		public MyInteger(int myInt) {
			value=myInt;
			
		}
		
		public int getInt() {
			return value;
		}
		
		public void setValue(int newValue) {
			value=newValue;
		}
		
		public boolean isEven() {
			if(value%2==0) {
				return true;
			}
			
			else {
				return false;
			}
			
		}
		
		public boolean isOdd() {
			if(value%2==1) {
				return true;
			}
			
			else {
				return false;
			}
			
				
		}
		
		  public boolean isPrime() 
		    { 
		         
		        if (value <= 1) 
		            return false; 
		  
		        
		        for (int i = 2; i < value; i++) 
		            if (value % i == 0) 
		                return false; 
		  
		        return true;
		    }
		  public static boolean isEven(int value) {
				if(value%2==0) {
					return true;
				}
				
				else {
					return false;
				}
		  }
		  
		  
		  
		 public static boolean isOdd(int value) {
				if(value%2==1) {
					return true;
				}
				
				else {
					return false;
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
		  
		  public static boolean isEven(MyInteger myInteger) {
			  return myInteger.isEven();
		  }
		  
		  public static boolean isPrime(MyInteger myInteger) {
			  return myInteger.isPrime();
		  }
		  
		  public static boolean isOdd(MyInteger myInteger) {
			  return myInteger.isOdd();
		  }
		  
		  public boolean equals(int value) {
			  return this.value==value;
		  }
		  
		  public boolean equals(MyInteger myInteger) {
			  return value==myInteger.value;
		  }
		  
		  public static int parseInt(char[] val) {
			  int sum=0;
			  
			  for(char i :val) {
				  
				  sum += Character.getNumericValue(i);
			  }
			  
			  return sum;
			  
		  }
		  
		  public static int parseInt(String val) {
			  
			  return Integer.parseInt(val);
		  }
}
		 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 