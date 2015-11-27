package linkedLists;

public class LinkedList {
	private Link first;
	public void LinkedList(){
		first=null;
	}
	public boolean isEmpty(){
		return(first==null);
	}
	public void insertFirst(String Name, int age, String favBand, boolean inARelationship){
		Link link=new Link(Name,age,favBand,inARelationship);
		if(first!=null){
			link.setNextLink(first);
			first=link;
		}
		else{
			first=link;
		}
	}
	public Link deleteFirst(){
		Link deletedLink=first;
		first=first.getNextLink();
		return deletedLink;
	}
	public void displayList(){
		System.out.println("list (first-->last): ");
		Link current = first;
		while(current!=null){
			current.displayLink();
			current=current.getNextLink();
		}
		System.out.println(" ");
	}
}