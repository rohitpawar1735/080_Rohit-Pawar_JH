class Stack{
	int arr[];
	int top1;
	int top2;
	int size = 10;
	void Stack1(int size){
		 top1= 11;
		 top2 = 40;
		 arr = new int[size];
	 }
	 
	 void push1(int v){
		 if(top1 < top2-1){
			 arr[++top2] = v;
		 }
		 else{
			 System.out.println("Stack is Full");
		 }
		 
	 }
	void push2(int v){
		 if(top1 < top2-1){
			 arr[--top2] = v;
		 }
		  else{
			 System.out.println("Stack is Full");
		 }
		 
	 }
	 
	 int pop1(){
		 int v = arr[top1--];
		 return v;
	 }
	 int pop2(){
		 int v = arr[top2++];
		 return v;
		 
	 }
	 
	 
	 public static void main(String... args){
		 
		 Stack s = new Stack();
		 s.push1(5);
		 s.push2(10);
		 s.push2(15);
		 s.push1(11);
		 s.push2(7);
		 s.push2(40);
		 }
		 
		 
	 }
	 
