import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public classStringPermute {
   

       public static void StringPermute(String soFar ,String remaining)
       {
         if(remaining.length()<=0)
	     {
	       perm.add(soFar);
	     }
	     else
	     {
	       for(int i=0;i<remaining.length();i++)
	       {
	    	   String next = soFar + remaining.charAt(i);
	    	   String result = remaining.substring(0,i) + remaining.substring(i+1);
	    	   StringPermute(next,result);
	       }
	     }
	   }
       
	    public static void main (String[] args) {
	    
	    	File file = new File(args[0]);
	    	BufferedReader in = null;
		try {
			in = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	    String line;
	    try {
			while ((line = in.readLine()) != null) {
			
			        StringPermute("",line);
			        Collections.sort(perm);
			        
			        for(int i=0;i<perm.size();i++)
			        {
			        	if(i== perm.size()-1) System.out.print(perm.get(i));
			        	else System.out.print(perm.get(i) + ",");
			        }
			        System.out.println();
			        perm.clear();
			    }
		} catch (IOException e) {
			e.printStackTrace();
		}
	    }
	    public static ArrayList<String> perm=new ArrayList<String>();
}
