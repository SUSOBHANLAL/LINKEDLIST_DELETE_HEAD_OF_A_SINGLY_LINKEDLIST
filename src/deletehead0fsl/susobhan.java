package deletehead0fsl;
class node{
	int data;
	node next;
	node(int data){
		this.data = data;
	}
}
public class susobhan {
	public static void main(String args[]) {
		node head = new node(14);
		node temp1= new node(23);
		node temp2= new node(34);
		node temp3= new node(59);
		node temp4= new node(87);
		head.next= temp1;           //HERE GIVING THE CONNECTION
		temp1.next=temp2;
		temp2.next=temp3;
		temp3.next= temp4;
		temp4.next= null;
		head =deletehead(head); 
		printnode(head);
		
	}
	
	static node deletehead(node head) {
		
		if(head==null) {
			return null;
		}
		else if(head.next==null)
		{
			return null;
		}
		
		else{
			head = head.next;       // AFTER MAKING HAEAD ->  HEAD.NEXT
			 			
			 return head;          //WE ARE RETTURNING HEAD
		}
		
		
	}
	
	static void printnode(node head) {
		node curr= head;
		while(curr!= null) {
			System.out.print(curr.data+" ");
			curr= curr.next;
		}
		System.out.println();
	}

}
