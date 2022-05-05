class insertion {
        int i;
        int size;
	   
	   void insert(int arr[]){
        
		 size=arr.length;
		 for(i=size-1;i<=0;i--){
		  int a=arr[i];
		  int b=i-1;

        while(b>=0 && arr[b]>a) {
             arr[b+1]=arr[b];
		     b=b-1;     }       
  
            arr[b+1]=a;	 }
	   
	   }
      
	  void display(int arr[]) {
		 
		 for(i=0;i<=size-1;i++) {
			 
		 System.out.print(arr[i]+"==>") ; }
	   }




      
    public static void main(String[] args){
      insertion in=new insertion();      
	  int arr[]={1,3,5,8,5};
      in.insert(arr);
	  in.display(arr);
    



}
}