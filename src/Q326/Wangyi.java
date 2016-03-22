package Q326;

import java.util.*;

public class Wangyi {
	public static ArrayList<Integer> numList;
	public static ArrayList<String> strList;

	public static void main(String[] args) {
		// init
		String endFlag = "n";
		numList = new ArrayList<>();
		strList = new ArrayList<>();
		// reads
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String line = sc.nextLine();
			if (line.equals(endFlag)) {
				break;
			}
			addElement(line);
		}
		sc.close();
		print(strList);
	}

	public static void print(ArrayList<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
	}

	public static void addElement(String s) {
		if (strList.isEmpty()) {
			strList.add(s);
			numList.add(0);
			return;
		}
		String[] newElement = s.split(" ");
		boolean isAdded = false;
		for (int i = 0; i < strList.size(); i++) {
			String[] tmp = strList.get(i).split(" ");
			if (isCrossed(newElement, tmp)) {
				int offset = numList.get(i) + 1;
				strList.add(i + offset, s);
				numList.add(i + offset, 0);
				numList.set(i, offset);
				isAdded = true;
				return;
			}
		}
		if(!isAdded){
			strList.add(s);
			numList.add(0);
		}
	}

	private static boolean isCrossed(String[] a, String[] b) {
		for (String aa : a) {
			for (String bb : b) {
				if (aa.equals(bb)) {
					return true;
				}
			}
		}
		return false;
	}
}
