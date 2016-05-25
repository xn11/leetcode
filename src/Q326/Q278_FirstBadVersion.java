
public class Q278_FirstBadVersion {

	public static void main(String[] args) {
		System.out.print(new Q278_FirstBadVersion().firstBadVersion(3));

	}
	
	public int firstBadVersion(int n) {
		if(isBadVersion(1)){
			return 1;
		}
        return recursion(1, n);
    }
	//二分查找，递归实现
	private int recursion(int l, int r){
		int p = l + (r-l)/2;
		if(p <= l){
			return r;
		}
		if(isBadVersion(p)){
			return recursion(l, p);
		}else{
			return recursion(p, r);
		}
	}
	
	private boolean isBadVersion(int version){
		return version >= 2;
	}

}
