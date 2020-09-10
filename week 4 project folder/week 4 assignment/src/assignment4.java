import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class assignment4 {

	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>();// q1

		Set<Integer> ids = new HashSet<Integer>();// q2

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();// q3

		employeeNames.add("Elliot");
		employeeNames.add("Darlene");
		employeeNames.add("Angela");
		employeeNames.add("Edward");
		employeeNames.add("Tyrell");

		ids.add(0001);
		ids.add(0002);
		ids.add(0003);
		ids.add(0004);
		ids.add(0005);
		int i = 0;
		
		for (String employee : employeeNames) {
			employeeMap.put(i, employee);
			i++;
			System.out.println(employee);
	
		for (Integer keys : employeeMap.keySet()) {	
				System.out.println(keys);				
			}
		}
	}
}

