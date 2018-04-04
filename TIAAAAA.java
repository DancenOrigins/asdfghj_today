package tiap;

public class TIAAAAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]pets={"dog","cat","bird","monkey"};
		
		pets[0]=pets[2];
		pets[2]="dog";
		
		for(int i=0;i<pets.length;i++){
			
			System.out.println(pets[i]);

	}

}
}