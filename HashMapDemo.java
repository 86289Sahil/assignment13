import java.util.*;
class HashMapDemo
{
	public static void main(String args[])
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("first name","sahil");
		hm.put("Last name","choudhary");
		hm.put("address","kangra");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+":"+m.getValue());  
		}
	}
} 