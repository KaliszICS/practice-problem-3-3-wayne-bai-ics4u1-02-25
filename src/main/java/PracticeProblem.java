import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

		// debuggin 

		// ArrayList<String> permResult = permsUnique("HELLO");
		// for (int i = 0; i < permResult.size(); i++) {
		// 	System.out.print(permResult.get(i) + ", ");
		// }
	}

	public static String removeLetter(String str, int at) { // negated substring operation
		return str.substring(0, at) + str.substring(at + 1, str.length());
	}

	public static void uniquify(ArrayList<String> list) {// o(n^2) complexity duplicate string removal of the elements in an ArrayList

		int size = list.size() - 1;
		for (int i = size; i > -1; i--) {
			for (int j = size; j > -1; j--) {
				if (i != j && list.get(i).equals(list.get(j))) {
					size -= 1;
					list.remove(j);
					
					if (j < i) {
						i -= 1;
					}
				}
			}
		}
	}

	public static void mutationsOf(String currentPattern, String gene, ArrayList<String> list) { // adds the mutations of a string to an array, helper function (The one who does all the work but gets no credit, the main function's only purpose is to check for a single edge case)
		
		String result = currentPattern + gene;
		if (gene.length() <= 1) {
			
			list.add(result);

			return;
		}

		for (int i = 0; i < gene.length(); i++) {
			mutationsOf(currentPattern + gene.charAt(i), removeLetter(gene, i), list);
		}
		

	}

	public static ArrayList<String> perms(String str) {

		ArrayList<String> list = new ArrayList<String>();
		//if str is ""
		//add "" to the array, then return
		if (str.length() == 0) {
			list.add("");
			return list;
		}

		mutationsOf("", str, list);


		return list;
	}
	public static ArrayList<String> permsUnique(String str) { //
		ArrayList<String> result = perms(str);
		uniquify(result);
		return result;
	}
}

/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=19010990)
# Instructions  

  ## Questions
1. Create a function called perms(Str str). It will return an ArrayList with all permutations (all possible combination of characters) of the given string.</br>

2. Create a function called permsUnique(Str str). It will return an ArrayList with all unique permutations (all possible combination of characters) of the given string.

*/