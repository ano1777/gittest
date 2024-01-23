
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class School {

	HashMap<String, ArrayList<String>> teacherSubject;
	HashMap<String, ArrayList<String>> subjectTeacher;

	// კონსტრუქტორს არაფერი არ გადაეცემა. აქ შეგიძლიათ ინიციალიზაცია გაუკეთოთ
	// თქვენთვის საჭირო ცვლადებს.
	public School() {
		teacherSubject = new HashMap<String, ArrayList<String>>();
		subjectTeacher = new HashMap<String, ArrayList<String>>();
	}

	// addTeacher მეთოდის საშუალებით შეგიძლიათ სკოლას დაამატოთ ახალი
	// მასწავლებელი. მეთოდს გადაეცემა მასწავლებლის სახელი. შეგიძლიათ ჩათვალოთ,
	// რომ მასწავლებლის სახელი უნიკალურია.
	public void addTeacher(String teacher) {
		teacherSubject.put(teacher, null);
		System.out.println(teacherSubject);
				
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
		if(!teacherSubject.containsKey(teacher)) {
			return;
		} else {
			teacherSubject.put(teacher, new ArrayList<String>() ); 
			ArrayList<String> subjects = teacherSubject.get(teacher);
			subjects.add(subject);
			subjectTeacher.put(subject, new ArrayList<String>()); 
				ArrayList<String> teachers  = subjectTeacher.get(subject);
				teachers.add(teacher);
				System.out.println(subjectTeacher);
				System.out.println(teacherSubject);
			}
	}

	// addPupil მეთოდის საშუალებით შეგიძლიათ საგანზე დაამატოთ მოსწავლე. ერთი და
	// იგივე მოსწავლე შეიძლება ერთ ან რამდენიმე საგანს სწავლობდეს.
	public void addPupil(String pupil, String subject) {
		// TIP: you can use System.out.println() to print your structures for
		// testing
	}

	// getTeachers მეთოდს გადაეცემა მოსწავლის სახელი და მან უნდა დააბრუნოს ამ
	// მოსწავლის ყველა მასწავლებელზე იტერატორი. ანუ მხოლოდ იმ მასწავლებლების
	// სახელები, რომლებიც ასწავლიან იმ საგნებს, რომლებზეც მოსწავლეა
	// დამატებული(სწავლობს). თუკი pupil სახელის მოსწავლე არ გვყავს მაშინ მეთოდმა
	// უნდა დააბრუნოს null.
	public Iterator<String> getTeachers(String pupil) {
		return null;
	}

	// getPupils მეთოდს გადაეცემა მასწავლებლის სახელი და მან უნდა დააბრუნოს ამ
	// მასწავლებლის ყველა სტუდენტზე იტერატორი. ანუ მხოლოდ იმ სტუდენტების
	// სახელები, რომლებიც მის რომელიმე საგანს სწავლობენ. თუკი teacher სახელის
	// მქონე
	// ლექტორი არ გვყავს მაშინ მეთოდმა უნდა დააბრუნოს null.
	public Iterator<String> getPupils(String teacher) {
		return null;
	}

	// მეთოდმა უნდა წაშალოს მასწავლებლის შესახებ ყველა ინფორმაცია. ამ მეთოდის
	// გამოძახების, შემდეგ getTeachers მეთოდმა არ უნდა დააბრუნოს teacher სახელი
	// არც
	// ერთი სტუდენტისთვის.
	public void removeTeacher(String teacher) {
		// TIP: you can use System.out.println() to print your structures for
		// testing
	}

}