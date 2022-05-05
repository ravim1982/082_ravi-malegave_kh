class reverse {
       node head;
      class node{
	    int data;
		node next;
        node prev;
      
	  node(int d){
	    data=d;
		next=null;
		
		}
		}
		
      void insert(int d) {
	  
	  node new_node=new node(d);
	  new_node.next=head;
	  head=new_node;   }


     void display() {
	
	 node n=head;
	
	 while(n!=null){
	  
	  System.out.print(n.data) ;
		
		n=n.next;  }
	 }

	 void back() {
      node n=head;	 
	 while(n!=null) {
    
     System.out.print(n.data+"==>");
     n=n.next; } 
	 }


    public static void main(String[] args){
        reverse list=new reverse();
		list.insert(1);
        list.insert(5);
         list.insert(3);
         list.insert(5);
         list.insert(5);
         
		//list.display();
        list.back();
}
}