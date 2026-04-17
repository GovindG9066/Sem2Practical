package Govind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VidyaMap {
	public static void main(String[] args) {
		List<String> viit=new ArrayList<String>();
		viit.add("MCA");
		viit.add("MBA");
		
		List<String> vpkbit=new ArrayList<String>();
		vpkbit.add("computer");
		vpkbit.add("civil");
		
		Map<String,List<String>> m1=new HashMap<String, List<String>>();
		m1.put("VP1", viit);
		m1.put("VP2", vpkbit);
		
		System.out.println(m1);
	}
}
