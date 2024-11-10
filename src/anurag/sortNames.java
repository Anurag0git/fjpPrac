package anurag;

import java.util.ArrayList;
import java.util.Arrays;

public class sortNames {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("holy");
		list.add("jon");
		list.add("ram");
		list.add("alice");
		list.add("bob");
		
		int n = list.size();
		for(int i = 0; i<n-1; i++ ) {
			for(int j = 0; j< n-1-i; j++) {
				if(list.get(j).compareTo(list.get(j+1))>0) {
					String temp = list.get(j);
					list.set(j,list.get(j+1));
					list.set(j+1,temp);
				}
			}
		}
		
		System.out.print(list);
	}

}
