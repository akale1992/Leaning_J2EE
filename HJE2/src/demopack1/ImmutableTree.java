package demopack1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public final class ImmutableTree {
	final  String tName;
	final  int height;
	private final List<Date> datelist;
	
	public ImmutableTree(String tname , int height, List<Date> arrayList) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.tName = tname;
		this.datelist=arrayList;
	}
	public int getHeight() {
		return height;
	}
	public String gettName() {
		return tName;
	}
	
	public List<Date> getDate() {
		return datelist;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tree Name:\t"+ this.tName + "\nHeight:\t" + this.height+"\nDate List:\t"+datelist;
	}
}
