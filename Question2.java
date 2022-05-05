class LinkList{
	static Node head;
	static class Node{
	Node next;
	int data;
	
	Node(int d){
		data = d;
		next = null;
	}
	}
	
	void insert(int d){
		Node new_node = new Node(d);
		if(head == null){
			head = new_node;
		}
		else{
			new_node.next = head;
			head = new_node;
		}
	}
	
	void display(){
		Node temp = head;
		if(head == null){
			System.out.println("LinkList is not Present");
		}
		else{
			while(temp!=null){
				System.out.print(temp.data+" >> ");
				temp = temp.next;
			}
		}
	}
	
	Node reverse(Node head){
		Node temp = head;
		Node pre = null;
		Node next = null;
		while(temp!=null){
			next = temp.next;
			temp.next = pre;
			pre = temp;
			temp = next;
		}
		return pre;
	}


	public static void main(String... args){
		LinkList obj = new LinkList();
		obj.insert(3);
		obj.insert(2);
		obj.insert(1);
		obj.display();
		System.out.println();
		obj.reverse(head);
		obj.display();
	}
}