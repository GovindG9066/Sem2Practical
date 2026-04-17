package Govind;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		
		List<String> mh=new ArrayList();
		mh.add("Baramati");
		mh.add("Junnar");
		
		List<String> up=new ArrayList();
		up.add("City1");
		up.add("City1");
		
		List<List<String>> india=new ArrayList();
		india.add(mh);
		india.add(up);
		
		Iterator<List<String>> itr=india.iterator();
		while(itr.hasNext()) {
			List<String> state=itr.next();
			Iterator<String> stateitr=state.iterator();
			while(stateitr.hasNext()) {
				System.out.println(stateitr.next());
			}
		}
	}

}
