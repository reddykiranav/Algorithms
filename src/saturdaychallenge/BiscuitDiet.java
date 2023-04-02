/**
 * 
 */
package saturdaychallenge;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

/**
 * @author reddy
 *
 */
public class BiscuitDiet {

	/**
	 * @param args	
	 */

	static Map<Integer, Integer> map = new HashMap<>();

	public static void main(String[] args, int i) {
		System.out.println("dummy");
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Node root = new Node(100, null, null);
		Node node = new Node(50, null, null);

		Node node2 = new Node(150, null, null);

		Node node3 = new Node(20, null, null);
		Node node4 = new Node(60, null, null);	
		Node node5 = new Node(130, null, null);
		Node node6 = new Node(250, null, null);
		insert(null, root);
		insert(root, node);
		insert(root, node6);
		insert(root, node5);
		insert(root, node4);
		insert(root, node2);
		insert(root, node3);
		
		System.out.println("BST: " + root);
		search(root, new Node(251, null, null));
		System.out.println("Map" + map.toString());
		Node nearestNode = min(map);
		System.out.println("nearest Node" + nearestNode);

	}

	private static Node min(Map<Integer, Integer> map2) { // TODO Auto-generated
															// method stub
		int min = 0;
		Node miNode = new Node(0, null, null);
		boolean flag = false;
		for (java.util.Map.Entry<Integer, Integer> iterable_element : map2.entrySet()) {
			if (!flag) {
				min = iterable_element.getValue();
				miNode.data = iterable_element.getKey();
				System.out.println(miNode);
				flag = true;
			}
			if (iterable_element.getValue() < min) {
				min = iterable_element.getValue();
				miNode.data = iterable_element.getKey();
				System.out.println(miNode);
			}
		}
		return miNode;
	}

	private static void search(Node root, Node node) {

		if (root.data == node.data) {
			map.put(root.data, Math.abs(root.data - node.data));
		} else {
			if (root.data < node.data) {
				map.put(root.data, Math.abs(root.data - node.data));
				if (root.right == null) {
					return;
				} else {
					search(root.right, node);
				}
			} else {
				map.put(root.data, Math.abs(root.data - node.data));
				if (root.left == null) {
					return;
				} else {
					search(root.left, node);
				}
			}
		}
	}

	private static void insert(Node root, Node node) {
		if (null == root) {
			root = node;
		} else {
			if (root.data < node.data) {
				if (null == root.right) {
					root.right = node;
				} else {
					insert(root.right, node);
				}
			} else {
				if (null == root.left) {
					root.left = node;
				} else {
					insert(root.left, node);
				}
			}
		}
	}
}

class Node {

	int data;
	Node left;
	Node right;

	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}