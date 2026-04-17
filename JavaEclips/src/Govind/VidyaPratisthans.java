package Govind;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VidyaPratisthans {
	public static void main(String[] args) {
		List<String> viit=new ArrayList<String>();
		viit.add("MCA");
		viit.add("MBA");
		
		List<String> vpkbit=new ArrayList<String>();
		vpkbit.add("computer");
		vpkbit.add("civil");
		
		List<List<String>> vp=new ArrayList<List<String>>();
		vp.add(viit);
		vp.add(vpkbit);
		
		Iterator<List<String>> itr=vp.iterator();
		while(itr.hasNext()) {
			List<String> itrvp=itr.next();
			Iterator<String> itrr=itrvp.iterator();
			while(itrr.hasNext()) {
				System.out.println(itrr.next());
			}
		}
	}
}
