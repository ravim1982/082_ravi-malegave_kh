 
 class stack1 {
            int arr[]=new int[10];
	         int top=0;
		  void push1(int d) {
		    
			arr[top++]=d;
		  System.out.println(d+"element added to stack1   ") ; }
 
 
          void pop1(){
			  
			  int x=arr[--top];
            System.out.println(x+"element popped from stack1   ") ;
 }
 }
 
 class stack2{
           int arr[]=new int[10];
	      int top2=0;
		 void push2(int d) {
             arr[top2++]=d;
              System.out.println(d+"element added to stack2   ") ; 
  }
         void pop2(){
			  
			  int y=arr[--top2];
            System.out.println(y+"element popped from stack2   ") ;
         }
 
}
 class main{ 
             public static void main(String[] args){   
              //int arr[]=new int[10];
              //int top=-1;
			  stack1 s1=new stack1();
			  stack2 s2=new stack2();
               s1.push1(10);
			   s2.push2(30);
			   s1.push1(40);
			   s1.pop1();
			   s2.pop2();
			 
 
 }
 }
 
 
 
 
 
 
 
 