package tiap;

public class TIAAAC {
	
	public static void main(String[] args) {
		
		
		int[]DS={6,18,21,1,72,13};
		int largest = DS[0];
		for(int i = 0;i<6;i++){
			if(DS[i]>largest){
				largest = DS[i];
			}
			
		}
		System.out.println(largest);
	}

}
