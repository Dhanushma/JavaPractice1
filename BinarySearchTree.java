package com.java;

public class BinarySearchTree {

	public static class Node {
		int data;
		Node right;
		Node left;

		public Node(int data) {
			this.data = data;
			this.right = null;
			this.left = null;
		}
	}

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return;
		} else {
			Node current = root;
			Node parent = null;
			while (true) {
				parent = current;
				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
	public Node findMin(Node root) {
		if(root.left !=null) {
			return findMin(root.left);
		}
		else {
			return root;
		}
	}
	
	public Node search(int dat, Node root) {
		if(root.data ==dat) {
			return root;
		}
		else if(dat<root.data) {
			return search(dat,root.left);
		}
		else
			return search(dat,root.right);
		
	}
	public void inorderTraversal(Node node) {
		if(root==null) {
			System.out.println("Empty Tree");
			return ;
		}
		else {
			if(node.left!=null) {
				inorderTraversal(node.left);
			}
			System.out.println(node.data);
			if(node.right!=null) {
				inorderTraversal(node.right);
			}
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(60);
		tree.insert(10);
		tree.insert(90);
		
		tree.inorderTraversal(tree.root);


	}

}
