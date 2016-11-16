/*
Name: Sanele Mpangalala
Date:22-03-2014
Assignment 2
*/

import java.io.*;
import java.util.*;

class Node{
	
	int key=0;
	String nodeData;
	int count=0;
	
	Node leftChild;  //left child
	Node rightChild; //right child
	
	Node(String name){
		
		this.nodeData=name;
		leftChild = rightChild=null;
	for(int i=0;i<name.length();i++){
			key+=name.charAt(i);
			}
		count++;	//increment the count after when this method is called (there's a node)
	}

}
