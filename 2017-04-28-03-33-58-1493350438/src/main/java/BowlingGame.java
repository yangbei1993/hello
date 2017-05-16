public class BowlingGame {

	public int getNum(char c){
		if(c=='X'||c=='/')
			return 10;
		else if(c=='-')
			return 0;
		else
			return c-'0';		
	}
	
    public int getBowlingScore(String bowlingCode) {
    	int Sum=0;
		 String[] sourceStrArray = bowlingCode.split("\\|{1,2}",11);	
		 
		 for(int i=0;i<sourceStrArray.length-1;++i){
			 if(sourceStrArray[i].equals("X")){
				 if(sourceStrArray[i+1].equals("X"))
					 Sum+=20+getNum(sourceStrArray[i+2].charAt(0));
				 else if(sourceStrArray[i+1].charAt(1)=='/')
					 Sum+=20;
				 else
					 Sum+=10+getNum(sourceStrArray[i+1].charAt(0))+getNum(sourceStrArray[i+1].charAt(1));			 
			 }
			 else if(sourceStrArray[i].charAt(1)=='/'){
				 Sum+=10+getNum(sourceStrArray[i+1].charAt(0));
			 }
			 else{
				 Sum+=getNum(sourceStrArray[i].charAt(0))+getNum(sourceStrArray[i].charAt(1));
			 }			 
		 }		
	     return Sum;
    }
}
