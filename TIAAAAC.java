package tiap;

public class TIAAAAC {
	
public static void main(String[] args) {
		
		
		int[]DS={18,21,2,12,70,60};
		int smallest = DS[0];
		int secsmallest = DS[0];
		for(int i = 0;i<5;i++){
			if(DS[i]<smallest){
				smallest = DS[i];
		for(i = 0;i<5;i++){
			if(DS[i]<secsmallest & DS[i]>smallest){
				secsmallest = DS[i];
			}
			}
			
		}
		
	}
		System.out.println(smallest+" is the Smallest");
		System.out.println(secsmallest+" is the second Smallest");
}
}