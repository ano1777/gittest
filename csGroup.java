import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class csGroup {
	private Map<String, Double> studentScores;

	public csGroup() {
		studentScores = new HashMap<String, Double>();
	}

	public csGroup(ArrayList<String> students) {
		studentScores = new HashMap<String, Double>();
		for (String student : students) {
			studentScores.put(student, null);
		}
		// for(int i = 0;i < students.size(); i++) {
		// String student = students.get(i);

		// studentScores.put(null, null);
	}

	public Double getScore(String student) {
		if (!studentScores.containsKey(student)) {
			System.out.println("No such student:" + student);
			return null;
		}
		return studentScores.get(student);
	}

	public void setScore(String student, double score) {
		if (!studentScores.containsKey(student)) {
			System.out.println("No such student:" + student);
			return;
		}
		studentScores.put(student, score);
	}

	public void addStudent(String student) {
		if (!studentScores.containsKey(student)) {
			studentScores.put(student, null);
		}
	}

	

}
