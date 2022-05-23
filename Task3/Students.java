package Task3;

import java.util.*;
import java.util.stream.Collectors;

public class Students {
    private List<Student> students;

    public Students(final List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public void addSubject(final List<Subject> subjects, final String name) {
        final Subject subject = new Subject(name);
        subjects.add(subject);

        final List<Mark> mark = new ArrayList<>(students.size());
        for (int i = 0; i < students.size(); i++) {
            final Mark mark1 = new Mark();
            mark.add(mark1);
        }
        for (int i = 0; i < students.size(); i++) {
            students.get(i).getMarks().add(mark.get(i));
        }
    }

    public Student getBestStudent() {
        return students.stream()
               // .reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right)
                .reduce((a, b) -> a.averageMark() > b.averageMark() ? a : b)
                .get();
    }

    public List<Student> studentsWithMarkMoreThanThree() {
        return students.stream()
                .filter(e -> e.averageMark() > 3)
                .toList();
    }

    public List<Student> sort() {
        return students.stream()
                .sorted((a, b) -> {
                    if (a.getSurName() != b.getSurName())
                        return a.getSurName().compareTo(b.getSurName());
                    else if (a.getName()!= b.getName())
                        return a.getName().compareTo(b.getName());
                    else return a.getFatherName().compareTo(b.getFatherName());
                }).collect(Collectors.toList());
    }

    public String surnameWithDash() {
        return students.stream()
                .map(e -> e.getSurName())
                .reduce((s1, s2) -> s1 + "-" + s2).orElse("No");
    }

    @Override
    public String toString() {
        String res = "";
        for (final Student student : students) {
            res += "Student { " + "name= " + student.getName() +
                    ", surName= " + student.getSurName();
            for (final Subject subject : student.getSubject()) {
                res += ", subject= " + subject.getNameSubject() + "{ ";
                // предмет -> оцінки з предмету -> повертаємо в get() від ліста загальних оцінок
                for (final Integer txt : student.getMarks().get(student.getSubject().indexOf(subject)).getMark())
                    res += txt + " ";
                res += "}";
            }
            res += " }" + '\n';
        }
        return res;
    }
}