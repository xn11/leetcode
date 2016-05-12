import java.util.HashSet;
import java.util.Set;

public class Q217_ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            if(!set.add(i)){	//Set：没有重复元素的集合，本质map；与List一同继承自Collection接口，List本质是数组实现
                return true;
            }
        }
        return false;
    }

}
