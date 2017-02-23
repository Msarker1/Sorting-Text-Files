import java.io.BufferedReader;	
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
/* Name of Student : Mohammad T. Sarker  Lab: 212-11E (Tuesdays and Thursdays 12:15-1:05)
 * The Purpose of this program is to read in data from the project1.txt file and store it into an array.
 * Then the program checks if any element contains a character that is not a letter and outputs it to the console.
 * All the elements that only contain letters will be stored in a the array labeled valid.
 * The method getswords reads in the file project1.txt and returns valid which contains all the elements with letters only
 * and outputs the elements that contain a character that is not a letter to the console. The main function creates a
 * constructor of the class Project1GUI. Then calls the method from ProjectGUI .frame allows to pass the valid array and 
 * output the JFrame with sorted and unsorted 
 * on the specified sides.

 */
public class Project1 {
	public static void main(String[] args){
		String mylist[] = null; // used to store read in data
		String sorted[]	=null; // used to store sorted elements
	    String valid[] = null ; // used to store only letter elements
	    JFrame ok=new JFrame();  // JFrame
		String words = "project1.txt"; // name of input file
		String k= "Letters"; // name of gui
	    valid=getwords(valid, words, mylist); // calls getswords method to read in and store data
		Project1GUI get=new Project1GUI(sorted,ok,valid,k);  // creates new constructor of Project1GUI class
	   
	} // main ends
	 
	public static String[] getwords (String x[],String words, String mylist[]){
		try{
			BufferedReader br = new BufferedReader(new FileReader(words)); // reads in data
			List<String> list = new ArrayList<String>();					// list for data to be stored
			while((words = br.readLine())!=null){			// loop to add data from project.txt file
				list.add(words);							// adds data that was read to a list
			}		
			mylist=list.toArray(new String[0]);  // takes the list and stores into array mylist
			br.close();							
		}
		catch(FileNotFoundException ex){
			System.out.println("error");		//  if fails outputs "error"
		}											
		catch(IOException ex){
			System.out.println("error");
		}
	
		List<String> testvalid = new ArrayList<String>(); // new list to store only letters
		for(int i =0;i<mylist.length;i++){			// loops until only elements with letters are stored into list	
			if(mylist[i].matches("[a-zA-Z]+")){		// if elements are only letters, it stores in to list
				testvalid.add(mylist[i]);     		
			}
			else 									// outputs the elements with characters that are not letters to console
				System.out.println(mylist[i]);  
		}
	     x = testvalid.toArray(new String[0]); // takes elements from list and stores into array
		return x;								// returns the array with only letter elements
	
	}// getswords ends

}  // Project1 class ends
	
