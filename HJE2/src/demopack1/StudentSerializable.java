package demopack1;

import java.io.*;

public class StudentSerializable implements Serializable {
	transient int stId;
	String stName;
	public StudentSerializable(int stId,String stName) {
		// TODO Auto-generated constructor stub
		this.stName = stName;
		this.stId = stId;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("G:\\Eclipse EE\\core java\\HJE2\\java.ser");
		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		StudentSerializable st = new StudentSerializable(10, "Ashish");
		oos.writeObject(st);
		oos.flush();
		oos.close();
		fos.close();

	}
	
	public void display(){
		System.out.println(stId+" "+stName);
	}

}
