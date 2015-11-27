package linkedLists;

public class LinkedListController {

	public static void main(String[] args) {
		LinkedList studentDataList= new LinkedList();
		studentDataList.insertFirst("Wendy", 5, "One Direction", true);
		studentDataList.insertFirst("Peter Pan", 5, "Little Mix", true);
		studentDataList.insertFirst("Cap'n Hook", 50, "Cheeky Girls", true);
		studentDataList.insertFirst("Smee", 100, "Cheeky Girls", true);
		studentDataList.displayList();
	}

}
