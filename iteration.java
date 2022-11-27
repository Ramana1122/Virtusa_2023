import java.util.*;
public class Iteratorop 
{
public static void main(String args[]) 
{
	// Create an array list
	ArrayList<String>list = new ArrayList();
	list.add("m");
	list.add("o");
	list.add("p");
	list.add("q");
	list.add("r");
	list.add("s");
	// Use iterator to display contents of al
	System.out.print("Original contents of al: ");
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		Object element = itr.next();
		System.out.print(element + " ");
	}
	System.out.println();
	// Modify objects being iterated
	ListIterator litr = list.listIterator();
	while(litr.hasNext()) {
		Object element = litr.next();
		litr.set(element + "-");
	}
	System.out.print("Modified contents in list are: ");
	itr = list.iterator();
	while(itr.hasNext()) {
		Object element = itr.next();
		System.out.print(element + " ");
	}
	System.out.println();
	// Now, display the list backwards
	System.out.print("Modified list backwards: ");
	while(litr.hasPrevious()) {
	Object element = litr.previous();
	System.out.print(element + " ");
	}
	System.out.println();
	}
}
