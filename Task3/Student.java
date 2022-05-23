package Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Student {
    static long idStatic = 0;
    private long id;
    private String name;
    private String surName;
    private String fatherName;
    private List<Subject> subject;
    private List<Mark> marks;

    public Student(final String fatherName) {
    }

    public Student(final String name, final String surName, final String fatherName) {
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.marks = setMarkSubject();
        this.id = Student.idStatic++;
    }

    public Student(final String name, final String surName, final String fatherName, final List<Subject> subject) {
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.subject = subject;
        this.marks = setMarkSubject();
        this.id = Student.idStatic++;
    }

    public static long getIdStatic() {
        return idStatic;
    }

    public static void setIdStatic(final long idStatic) {
        Student.idStatic = idStatic;
    }

    public long getId() {
        return id;
    }

    public void setId(final long id) {
        this.id = id;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(final List<Subject> subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(final String surName) {
        this.surName = surName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(final String fatherName) {
        this.fatherName = fatherName;
    }

    public void addMark(final int value, final String nameSubject) {
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getNameSubject() == nameSubject) {
                    marks.get(i).getMark().add(value);
            }
        }
    }

    private List<Mark> setMarkSubject() {
        final List<Mark> marks = new ArrayList<>();

        for (int i = 0; i < subject.size(); i++) {
            final Mark mark = new Mark();
            marks.add(mark);
        }
        return marks;
    }

    public double averageMark() {
        double sum = 0;
        int count = 0;

        for (final Mark mark : marks) {
            sum += mark.getMark().stream().mapToInt(value -> value).sum();
            count += mark.getMark().stream().mapToInt(value -> value).count();
        }
        if(count != 0)
            return sum/count;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "ID = " + this.getId() +
                " Name = " + this.getName() +
                " Surname = " + this.getSurName() +
                " FatherName = " + this.getFatherName();
    }
}