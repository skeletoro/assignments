import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class assignment4 {
	private static final String Stringbuilder = null;
	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>();// q1

		Set<Integer> ids = new HashSet<Integer>();// q2

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();// q3

		employeeNames.add("Elliot");
		employeeNames.add("Darlene");
		employeeNames.add("Angela");
		employeeNames.add("Edward");
		employeeNames.add("Tyrell");

		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		int i = 0;
		int x = 0;
		
		StringBuilder idsBuilder = new StringBuilder();
		StringBuilder namesBuilder = new StringBuilder();
		
		for (Integer idsLink : ids) {
			employeeMap.put(idsLink, employeeNames.get(i));
			i++;
		}
		System.out.println(employeeMap);
		System.out.println("------------------console seperator-------------------");

		for (Integer kSet : employeeMap.keySet()) {
			System.out.print(kSet);
			System.out.print(" = ");
			System.out.println(employeeMap.get(kSet));
		}
		System.out.println("------------------console seperator-------------------");

		for (Integer idBuild : ids) {
			idsBuilder.append(idBuild).append(" - ");
		}
		System.out.println(idsBuilder.toString());
		System.out.println("------------------console seperator-------------------");
	
		for (String fullEmp : employeeNames) {
			namesBuilder.append(employeeNames).append(" ");
		}
		System.out.println(namesBuilder.toString());
	}
}
