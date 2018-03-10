package ejemplo;

import java.util.ArrayList;
import java.util.List;

public class RunnableHilo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 List<Integer> list = new  ArrayList<Integer>();
		   int max=500;
		   int min=0;
		   
		   while (list.size()<100)
		   {
			   int cNum = (int) Math.floor(Math.random()*(max-min+1)+min);
			   if(Utils.isPrime(cNum)){
				   list.add(cNum);	    
			   }
		   }
		   for(Integer i : list)
			   System.out.println(i);
		   
		
	}
	
	
}
