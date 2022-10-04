package ComparableTuts;

public class Student implements Comparable{
    private String name;
    private int grade;
    private double gpa;

    public Student(String name, int grade, double gpa) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getGpa() {
        return gpa;
    }
    public boolean equals(Student other){
        return this.getGrade()==other.getGrade();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        if(getGrade()> other.getGrade())
        return 1;
        else if (getGrade()< other.getGrade())
        return -1;
        else
            return 0;
    }
}
