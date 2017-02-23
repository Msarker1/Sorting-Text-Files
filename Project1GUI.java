import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextArea;
import java.util.Arrays;
import javax.swing.JFrame;
/* Name of Student : Mohammad T. Sarker  Lab: 212-11E (Tuesdays and Thursdays 12:15-1:05)
 * The purpose of this class is to take the data from Project1. java class and displays it on a JFrame.
 * This will display the elements of the valid array and the sorted version in the sorted array on the left and right side
 * The Project1GUI inherits the JFrame Class with extends and it can do all of the things of the JFrame. 
 */
public class Project1GUI extends JFrame{   // inherits JFrame class
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public Project1GUI(String sorted [],JFrame ok, String[] x, String k){ 
		ok.setSize(900,400);		// sets size of JFrame
		ok.setLocation(400,600);	// sets location
		ok.setTitle(k); 	// label of JFrame
		ok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes on click
		
		Container m = ok.getContentPane();	// container to add text
		TextArea txt = new TextArea();		// text area to output array elements
		TextArea subtxt = new TextArea();
		m.add(txt, BorderLayout.WEST);		// adds unsorted array elements from valid on the left side
		m.add(subtxt,BorderLayout.EAST);	// adds sorted array elements from sorted on the right side
		for(int i=0;i<x.length;i++){		// loops until all elements of valid are added on the left side of TextArea
			txt.append((i+1)+"."+x[i]+"\n");
		}
		sorted=selectionSort(x);							// sorts valid and sets it equal to sorted
		for(int i=0;i<sorted.length;i++){	// loops until all elements of sorted are added on the right side of TextArea
			subtxt.append((i+1)+"."+sorted[i]+"\n");
		}
		ok.setVisible(true);				// sets the JFrame ok to visible to public
	} // frame ends
	
	public static String[] selectionSort(String arr[]){
		for (int i = 0; i < arr.length; ++i){ // goes through each element of array
			int min = i;								
			for (int j = i; j < arr.length; ++j){	// loops until min is found
				if (arr[j].compareTo(arr[min]) < 0){ // checks for which is min
					min = j;
		        }
			}
		    String temp = arr[i];   // swaps arr[i] with arr[min]
		    arr[i] = arr[min];
		    arr[min] = temp;
		}
		return arr;			// returns sorted array 
	} // selectionSort ends
		
}	// Project1GUI ends
	





		
	
