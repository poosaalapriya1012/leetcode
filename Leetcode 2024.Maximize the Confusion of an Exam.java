public class Main1
{
	public static void main(String[] args) {
		String answerKey = "TTFF";
		int k = 2;
		int l=0;
		int ct=0;
		int cf=0;
		int ans=0;
		for(int r=0;r<answerKey.length();r++){
		    char ch=answerKey.charAt(r);
		    if(ch=='F'){
		        cf++;
		    }
		    else{
		        ct++;
		    }
		    while(Math.min(ct,cf)>k){
    		        if(answerKey.charAt(l)=='F'){
    		        cf--;
    		    }
    		    else{
    		        ct--;
    		    } 
		    }
		    ans=Math.max(ans,r-l+1);
		}
		System.out.println(ans);
	}
}
