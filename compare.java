import java.util.*;
class compare 
{
	public static void main(String[] args) 
	{
        HashSet<String> myset1 = new HashSet<String>();
        myset1.add("sahil");
        myset1.add("kangra");
        myset1.add("vibor");
        myset1.add("piyush");
        System.out.println("First HashSet:"+myset1);
        HashSet<String>myset2 = new HashSet<String>();
        myset2.add("shivay");
        myset2.add("kangra");
        myset2.add("vivek");
        myset2.add("piyush");
        System.out.println("Second HashSet:"+myset2);
        for(String str:myset1)
        {
            if(myset2.contains(str))
            {
              System.out.print(str+" ");
            }
        }
		 
	}
} 