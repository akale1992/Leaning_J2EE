package com.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\Ashish1992\\Desktop\\idm serial key.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("C:\\Users\\Ashish1992\\Desktop\\output1.txt");
		BufferedWriter bwr = new BufferedWriter(fw);
		List<String> li = new ArrayList<String>();
		while (true) {
			String s = br.readLine();
			if (s == null)
				break;
			li.add(s);
			bwr.write(s);
			bwr.newLine();

		}
		bwr.close();
		Collections.sort(li);
		for (String string : li) {
			System.out.println(string);

		}
		

		

	}

}
