
public class Q335_SelfCross {
	public static void main(String[] args) {
		int[] a = {1,1,2,2,3,3,4,4,10,4,4,3,3,2,2,1,1};
		System.out.println(new Q335_SelfCross().isSelfCrossing(a));

	}
	
	public boolean isSelfCrossing(int[] x) {
        for(int i = 3; i < x.length; i++){
//        	System.out.println(i + " : " + (x[i-1] <= x[i-3] && x[i] >= x[i-2]) + " " + (i >= 4 && x[i] >= (x[i-2] - x[i-4]) && x[i-1] == x[i-3]) + " " + (i >= 5 && x[i-1] >= (x[i-3] - x[i-5]) && x[i] >= (x[i-2] - x[i-4]) && x[i-2] > x[i-4]));
        	if((x[i-1] <= x[i-3] && x[i] >= x[i-2])
        			||(i >= 4 && x[i] >= (x[i-2] - x[i-4]) && x[i-1] == x[i-3])
        			||(i >= 5 && x[i-1] >= (x[i-3] - x[i-5]) && x[i] >= (x[i-2] - x[i-4]) && x[i-2] > x[i-4] && x[i-3] >= x[i-1])){
        		return true;
        	}
        }
        return false;
    }

}
