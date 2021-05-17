package devalbi.udemy.section_15_concurrency.challenge.debugging.partII;

public class Main {

    public static void main(String[] args) {
        Tutor tutor = new Tutor();
        Student student = new Student(tutor);
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
                try {
                    tutorThread.join();
                    student.handInAssignment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        tutorThread.start();
        studentThread.start();


    }
}

class Tutor {
    private Student student;
    private Object lock = new Object();

    public synchronized void setStudent(Student student) {
        this.student = student;
    }

    public void studyTime() {
        System.out.println("Tutor has arrived");
        try {
            // wait for student to arrive and hand in assignment
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            student.startStudy();
            System.out.println("Tutor is studying with student");
        }
    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class Student {

    private Tutor tutor;

    Student(Tutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public synchronized void handInAssignment() {
        tutor.getProgressReport();
        System.out.println("Student handed in assignment");
    }
}