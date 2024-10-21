package searchAlgorithm;

import java.util.Random;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

class BinarySearchTree {
	Node root;

	BinarySearchTree() {
		root = null;
	}

	// 노드 삽입
	void insert(int key) {
		root = insertRec(root, key);
	}

	// 재귀적으로 노드 삽입
	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key) {
			root.left = insertRec(root.left, key);
		} else if (key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	// 이진 탐색 트리에서 값 검색
	boolean search(int key) {
		return searchRec(root, key);
	}

	// 재귀적으로 검색
	boolean searchRec(Node root, int key) {
		if (root == null) {
			return false;
		}
		if (root.key == key) {
			return true;
		}
		if (key < root.key) {
			return searchRec(root.left, key);
		}
		return searchRec(root.right, key);
	}

	public void randomInit(int range) {
		System.out.println("Random BinarySearchTree Init ... Size : " + range);
		Random random = new Random();
		for (int i = 0; i < range; i++) {
			insert(random.nextInt(1000000));
		}
	}
}
