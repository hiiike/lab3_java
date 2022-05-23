package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {

        final Subject english = new Subject("English");
        final Subject proga = new Subject("Programming");
        final Subject math = new Subject("Math");

        final List<Subject> subjects = new ArrayList<>();
        subjects.add(english);
        subjects.add(proga);
        subjects.add(math);

        final Student st1 = new Student("Evgen", "Koval", "Evgenievich", subjects);
        final Student st2 = new Student("Dmytro", "Koval", "Evgenievich", subjects);
        final Student st3 = new Student("Larisa", "Koval", "Vyacheslavivna", subjects);

        final List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);

        final StudentSimple studentSimples = new StudentSimple();
        studentSimples.transform(students);

        students.get(0).addMark(2, "English");
        students.get(0).addMark(1, "English");

        students.get(1).addMark(5, "English");
        students.get(2).addMark(4, "English");

        students.get(0).addMark(1, "Programming");
        students.get(1).addMark(5, "Programming");
        students.get(2).addMark(4, "Programming");

        students.get(0).addMark(1, "Math");
        students.get(1).addMark(5, "Math");
        students.get(2).addMark(4, "Math");

        final Students studStream = new Students(students);
        studStream.addSubject(subjects,"Сircuitry");

        System.out.println("The best stundent : "+studStream.getBestStudent());
        System.out.println("Sorted students : "+studStream.sort());
        System.out.println("Filtred students with average mark >3 : "+studStream.studentsWithMarkMoreThanThree());

        students.get(0).addMark(2, "Сircuitry");
        students.get(1).addMark(5, "Сircuitry");
        students.get(2).addMark(4, "Сircuitry");
        System.out.println(studStream.surnameWithDash());

    }
}