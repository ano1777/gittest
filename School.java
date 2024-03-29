
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class School {

	HashMap<String, ArrayList<String>> teacherSubject;
	HashMap<String, ArrayList<String>> subjectTeacher;
	HashMap<String, ArrayList<String>> subjectPupil;
	HashMap<String, ArrayList<String>> pupilSubject;

	// კონსტრუქტორს არაფერი არ გადაეცემა. აქ შეგიძლიათ ინიციალიზაცია გაუკეთოთ
	// თქვენთვის საჭირო ცვლადებს.
	public School() {
		teacherSubject = new HashMap<String, ArrayList<String>>();
		subjectTeacher = new HashMap<String, ArrayList<String>>();
		subjectPupil = new HashMap<String, ArrayList<String>>();
		pupilSubject = new HashMap<String, ArrayList<String>>();
	}

	private void printsForTesting() {
		System.out.println("-------");
		System.out.println("teacherSubject: " + teacherSubject);
		System.out.println("subjectTeacher: " + subjectTeacher);
		System.out.println("pupilSubject: " + pupilSubject);
		System.out.println("subjectPupil: " + subjectPupil);
	}

	// addTeacher მეთოდის საშუალებით შეგიძლიათ სკოლას დაამატოთ ახალი
	// მასწავლებელი. მეთოდს გადაეცემა მასწავლებლის სახელი. შეგიძლიათ ჩათვალოთ,
	// რომ მასწავლებლის სახელი უნიკალურია.
	public  void addTeacher(String teacher) {
		teacherSubject.putIfAbsent(teacher, new ArrayList<String>());
		printsForTesting();

	}

	// addSubject მეთოდის საშუალებით შეგიძლიათ მასწავლებელს დაუმატოთ საგანი.
	// მეთოდს გადაეცემა მასწავლებლის სახელი და საგნის სახელი. ჩათვალეთ, რომ
	// საგნის
	// სახელი უნიკალურია. ერთი და იგივე მასწავლებელი შეიძლება რამდენიმე საგანს
	// კითხულობდეს, ასევე ერთსა და იმავე საგანს შეიძლება რამდენიმე მასწავლებელი
	// კითხულობდეს ერთდროულად.
	// თუკი teacher სახელის მქონე მასწავლებელი არ არის აქამდე დამატებული, მაშინ
	// მეთოდმა არაფერი არ უნდა გააკეთოს.
	public void addSubject(String teacher, String subject) {
		if (!teacherSubject.containsKey(teacher)) {
			return;
		} else {
			teacherSubject.get(teacher).add(subject);
			subjectTeacher.putIfAbsent(subject, new ArrayList<String>());
			subjectTeacher.get(subject).add(teacher);
			printsForTesting();
		}
	}

	// addPupil მეთოდის საშუალებით შეგიძლიათ საგანზე დაამატოთ მოსწავლე. ერთი და
	// იგივე მოსწავლე შეიძლება ერთ ან რამდენიმე საგანს სწავლობდეს.
	public void addPupil(String pupil, String subject) {
		if (!subjectTeacher.containsKey(subject)) {
			return;
		}
		subjectPupil.putIfAbsent(subject, new ArrayList<String>());
		// ArrayList<String> pupils = subjectPupil.get(subject);
		// pupils.add(pupil);
		subjectPupil.get(subject).add(pupil);

		// }
		// if (!pupilSubject.containsKey(pupil)) {
		pupilSubject.putIfAbsent(pupil, new ArrayList<String>());
		// ArrayList<String> subjects = pupilSubject.get(pupil);
		// subjects.add(subject);
		pupilSubject.get(pupil).add(subject);
		printsForTesting();

	}

	// getTeachers მეთოდს გადაეცემა მოსწავლის სახელი და მან უნდა დააბრუნოს ამ
	// მოსწავლის ყველა მასწავლებელზე იტერატორი. ანუ მხოლოდ იმ მასწავლებლების
	// სახელები, რომლებიც ასწავლიან იმ საგნებს, რომლებზეც მოსწავლეა
	// დამატებული(სწავლობს). თუკი pupil სახელის მოსწავლე არ გვყავს მაშინ მეთოდმა
	// უნდა დააბრუნოს null.
	public Iterator<String> getTeachers(String pupil) {
		if (!pupilSubject.containsKey(pupil)) {
			return null;
		}
		ArrayList<String> teachersForSubjects = new ArrayList<String>();
		
			ArrayList<String> subjects = pupilSubject.get(pupil);
			for (String eachSubject : subjects) {
				if(subjectTeacher.containsKey(eachSubject)) {
				teachersForSubjects.addAll(subjectTeacher.get(eachSubject));
				}
			}

		return teachersForSubjects.iterator();

	}

	// getPupils მეთოდს გადაეცემა მასწავლებლის სახელი და მან უნდა დააბრუნოს ამ
	// მასწავლებლის ყველა სტუდენტზე იტერატორი. ანუ მხოლოდ იმ სტუდენტების
	// სახელები, რომლებიც მის რომელიმე საგანს სწავლობენ. თუკი teacher სახელის
	// მქონე
	// ლექტორი არ გვყავს მაშინ მეთოდმა უნდა დააბრუნოს null.
	public Iterator<String> getPupils(String teacher) {
		if (!teacherSubject.containsKey(teacher)) {
			return null;
		}
		ArrayList<String> pupilsOnThisSubject = new ArrayList<String>();
		if (teacherSubject.containsKey(teacher)) {
			ArrayList<String> teachersSubjects = teacherSubject.get(teacher);
			for (String subject : teachersSubjects) {
				if (subjectPupil.containsKey(subject)) {

					pupilsOnThisSubject.addAll(subjectPupil.get(subject));
				}
			}
		}
		return pupilsOnThisSubject.iterator();

	}

	// მეთოდმა უნდა წაშალოს მასწავლებლის შესახებ ყველა ინფორმაცია. ამ მეთოდის
	// გამოძახების, შემდეგ getTeachers მეთოდმა არ უნდა დააბრუნოს teacher სახელი
	// არც ერთი სტუდენტისთვის.
	public void removeTeacher(String teacher) {
		teacherSubject.remove(teacher);

		for (ArrayList<String> teachers : subjectTeacher.values()) {
			if (teachers.contains(teacher)) {
				teachers.remove(teacher);
			}
		}
		printsForTesting();
	}

}
