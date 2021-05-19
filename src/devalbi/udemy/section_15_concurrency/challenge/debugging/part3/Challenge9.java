package devalbi.udemy.section_15_concurrency.challenge.debugging.part3;

/**
 * Created by timbuchalka on 16/08/2016.
 */
public class Challenge9 {
    public static void main(String[] args) {
        final NewTutor tutor = new NewTutor();
        final NewStudent student = new NewStudent(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });

        tutorThread.start();
        studentThread.start();
    }
}

/*
* Tutor has arrived
* Student is studying
* Tutor is studying with student
* Tutor gave progress report
* Student handed in assignment
* */

class NewTutor {
    private NewStudent student;
    private boolean studentLock = true;

    public void setStudent(NewStudent student) {
        this.student = student;
    }

    public void studyTime() {

        synchronized (this) {
            System.out.println("Tutor has arrived"); // 1
        }

        synchronized (student) { //1.2 student locked
            while(studentLock) {
                try {
                    studentLock = false;
                    student.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            studentLock = true;
            student.startStudy();
            System.out.println("Tutor is studying with student"); // 3
        }
    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report"); // 4
    }


    public boolean isStudentLock() {
        return studentLock;
    }

}

class NewStudent {

    private NewTutor tutor;

    NewStudent(NewTutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying"); // 2
    }

    public void handInAssignment() {
        synchronized (tutor) { //2.1 tutor locked
            tutor.getProgressReport();
        }

        while(true) {
            if (!tutor.isStudentLock()) {
                synchronized (this) {
                    System.out.println("Student handed in assignment");
                    notifyAll();
                    break;
                }
            }
        }
    }
}


