package test;

import java.util.ArrayList;
import java.util.List;

public class OprTabInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//déclarer tableau entier
		int [] tab=new int[1000];
	 	int i=0;
	 	for (i=0;i<tab.length;i++) tab[i]=i;
	 	
	/* 	//déclarer tableau entier
	 	List tinverse=new ArrayList() ;
	 	int j=tab.length-1;
	 //.out.println("j= "+j);
	 	while(j>=0)
	 	{//System.out.println(j);
	 		tinverse.add(tab[j]);
	 		j--;
	 	}
	 	*/
	 	//inverser
	 	int x=0;
	 	i = 0;
	  int  j = tab.length-1;
	 
	    while (i < j) {
	        x = tab[j];
	        tab[j] = tab[i];
	        tab[i] = x;
	         i++;
	         j--;
	    }
	    
	
		
	}

}
