/*
Name: Sanele Mpangalala
Date:22-03-2014
Assignment 2
*/

import java.io.*;
import java.util.*;

class nameBST{
	
	Node root;
	
	
	//constructor
	public nameBST(){
		root = null;
	}
	
	//insert node to tree
	public void insert(String name){
		root = insert(name,root);
		}

	public Node insert(String name, Node t){
			int Key=0;
			for(int i =0; i<name.length();i++){   //compute key
					Key+=name.charAt(i);
					
				}
		if(t==null){				//if tree is empty, make the current node the root
			t=new Node(name);}
			
	
		else if(Key<t.key){			//if key is less than the one on the current node, make the node a left child
			Node lChild = insert(name, t.leftChild);
			t.leftChild = lChild;
			}
		else if(Key>t.key){			// if key is greater than the one on the current node, make the node a right child
			
			Node rChild = insert(name, t.rightChild);
			t.rightChild = rChild;
			}
		else{

			
			if(Key==t.key){				//if keys are the same, check if names are the same
				if(name.equals(t.nodeData)){
					t.count+=1;				//if names are the same, increment count
				}
				else{
				
				Node lChild= insert(name, t.leftChild); //if names are not the same insert as left child
				t.leftChild = lChild;
			}
			}
			
			
			}
		return t;			//return tree
		
	
	}
	
	 //inorder traversal	
	 public void inOrder(Node Root){
			if(Root != null){
				 inOrder(Root.leftChild);
				 System.out.println("key:"+Root.key+",name:"+Root.nodeData+",count:"+Root.count);
				 inOrder(Root.rightChild);
				}
			
			}
			



}
