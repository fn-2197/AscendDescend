package gamesnstuff;

import java.util.Arrays;

public class AscendDescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//25 is the length of one line, 17 until descend column.
		String []ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		Arrays.sort(ss);
		System.out.println("Ascend:          Descend:");
		for(int i = 0; i < ss.length; i++){
			System.out.print(ss[i]);
			for(int y = 0; y < 17 - ss[i].length(); y++){
				System.out.print(" ");
			}
			System.out.println(ss[ss.length - i - 1]);
	}

}}
