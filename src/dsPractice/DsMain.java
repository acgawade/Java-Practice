package dsPractice;

public class DsMain {

	public static void main(String[] args) {
		CustomBinarySearchTree bst = new CustomBinarySearchTree();
		bst.insert(5);
		bst.insert(8);
		bst.insert(4);
		bst.insert(6);
		bst.insert(1);
		bst.insert(9);

		System.out.println(bst.contains(6));
	}

}
