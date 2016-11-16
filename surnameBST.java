/*
Name: Sanele Mpangalala
Date:22-03-2014
Assignment 2
*/
import java.io.*;
import java.util.*;


// everything is the same as in the nameBST class
class surnameBST{
	
	Node root;
	
	
	
	public surnameBST(){
		root = null;
	}
	
	public void insert(String name){
		root = insert(name,root);
		}

	public Node insert(String name, Node t){
			int Key=0;
			for(int i =0; i<name.length();i++){
					Key+=name.charAt(i);
					
				}
		if(t==null){
			t=new Node(name);}
			
	
		else if(Key<t.key){
			Node lChild = insert(name, t.leftChild);
			t.leftChild = lChild;
			}
		else if(Key>t.key){
			
			Node rChild = insert(name, t.rightChild);
			t.rightChild = rChild;
			}
		else{

			
			if(Key==t.key){
				if(name.equals(t.nodeData)){
					t.count+=1;
				}
				else{
				
				Node lChild= insert(name, t.leftChild);
				t.leftChild = lChild;
			}
			}
			
			
			}
		return t;
		
	
	}
	
	//postOrder traversal	
	 public void postOrder(Node Root){
	 	 
		 if(Root!=null){
		 	
			postOrder(Root.leftChild);
			postOrder(Root.rightChild);
			System.out.println("key:"+Root.key+",name:"+Root.nodeData+",count:"+Root.count);
		 }
	 	
	 }
			



}
