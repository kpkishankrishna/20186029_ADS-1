class Student implements Comparable<Student> {
    String studentname;
    String dateofbirth;
    int subject1marks;
    int subject2marks;
    int subject3marks;
    int totalmarks;
    String reservation;
    Student(String studentname, String dateofbirth,
     int subject1marks, int subject2marks, int subject3marks, int totalmarks,
     String reservation) {
        this.studentname = studentname;
        this.dateofbirth = dateofbirth;
        this.subject1marks = subject1marks;
        this.subject2marks = subject2marks;
        this.subject3marks = subject3marks;
        this.totalmarks = totalmarks;
        this.reservation = reservation;
    }
    public int compareTo(Student that) {
        if (this.totalmarks > that.totalmarks) {
            return -1;
        }
        if (this.totalmarks < that.totalmarks) {
            return 1;
        }
        if (this.subject3marks > that.subject3marks) {
            return -1;
        }
        if (this.subject2marks < that.subject2marks) {
            return 1;
        }
        if (this.subject1marks > that.subject1marks) {
            return -1;
        }
        if (this.dateofbirth.compareTo(that.dateofbirth) < 0) {
            return 1;
        }
        if (this.dateofbirth.compareTo(that.dateofbirth) > 0) {
            return -1;
        }
        else {
            return 0;
        }
    }
}