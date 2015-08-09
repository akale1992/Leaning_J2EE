package com.app;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadOneWriteAnother {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\Ashish1992\\Desktop\\idm serial key.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Ashish1992\\Desktop\\output.txt");
		while (true) {
			int a = fis.read();
			if(a== -1)
				break;
			fos.write(a);
		
		}
		fos.close();
		fis.close();
	

	}

}
