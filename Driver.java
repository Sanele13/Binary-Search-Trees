/*
Name: Sanele Mpangalala
Date:22-03-2014
Assignment 2
*/

import java.util.*;
import java.io.*;

class Driver{

		public static void main(String[] args){
		
			  BufferedReader br = null;	
				
 				nameBST BSTofNames = new nameBST();     //object of the names BST
				surnameBST BSTofSurnames = new surnameBST(); //object of the names BST
				
				//taking names and surnames from the text file, and inserting them to their BSTs
				try {
 
					String sCurrentLine;
					br = new BufferedReader(new FileReader("toSearchIn.txt"));
					while ((sCurrentLine = br.readLine()) != null) {

						BSTofNames.insert(sCurrentLine.substring(0,sCurrentLine.indexOf(" ")));	// insert name to nameBST
						BSTofSurnames.insert(sCurrentLine.substring(sCurrentLine.indexOf(" "))); //	insert name to surnameBST			
						}
 
				} catch (IOException e) {
						e.printStackTrace();} 
				
				//inorder traversal
				System.out.println("Name BST Traversed In Order");
				BSTofNames.inOrder(BSTofNames.root);
				
				System.out.println("\n");
				System.out.println("********************************************************************");
				System.out.println("\n");
				//postorder traversal
				System.out.println("Name BST Traversed In Order");
				BSTofSurnames.postOrder(BSTofSurnames.root);
				
		
		}

}
