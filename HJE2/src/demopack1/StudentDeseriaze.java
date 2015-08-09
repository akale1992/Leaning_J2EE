package demopack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.omg.IOP.CodecPackage.FormatMismatchHelper;

public class StudentDeseriaze {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
	    deserialize();
	}
		public static void deserialize() throws IOException, ClassNotFoundException{
			FileInputStream fis = new FileInputStream("G:\\Eclipse EE\\core java\\HJE2\\java.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			StudentSerializable st =(StudentSerializable)ois.readObject();
			st.display();
			fis.close();
			ois.close();
			StudentDeseriaze st1 = new StudentDeseriaze();
			st1.fileWriter();
			st1.fileReader();
		}

		public void fileWriter() throws IOException {
			FileWriter fw =new FileWriter("G:\\Eclipse EE\\core java\\HJE2\\java.txt");
			fw.write("ashish\n");
			fw.write("kale\n");
			fw.flush();
			fw.close();
			
		}
		public void fileReader() throws IOException {
			File f1 = new File("G:\\Eclipse EE\\core java\\HJE2\\java.txt");
			FileReader fr = new FileReader(f1);
			char[] cArray = new char[(int) f1.length()];
			fr.read(cArray);
			for (char c : cArray) {
				System.out.println(c);
				
			}
			
		
		}
	
	

}
