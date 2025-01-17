package WVH_1418;

abstract class SchoolMember {
    String id;
    String name;

    public SchoolMember(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void printInfo();
}

class Teacher extends SchoolMember {
    private String subject;
    private int experience;

    public Teacher(String id, String name, String subject, int experience) {
        super(id, name);
        this.subject = subject;
        this.experience = experience;
    }

    public void printInfo() {
        System.out.printf("%-10s %-10s %-15s %d%n", id, name, subject, experience);
    }
}

class Student extends SchoolMember {
    private String major;
    private int grade;

    public Student(String id, String name, String majorCode, int grade) {
        super(id, name);
        this.major = majorCode.equals("D") ? "Design" : "Software";
        this.grade = grade;
    }

    public void printInfo() {
        if (grade >= 1 && grade <= 3) {
            System.out.printf("%-10s %-10s %-15s %d%n", id, name, major, grade);
        } else {
            System.out.printf("%-10s %-10s %-15s Error(%d)%n", id, name, major, grade);
        }
    }
}

class Admin extends SchoolMember {
    private String duty;
    private int experience;

    public Admin(String id, String name, String duty, int experience) {
        super(id, name);
        this.duty = duty;
        this.experience = experience;
    }

    public void printInfo() {
        System.out.printf("%-10s %-10s %-15s %d%n", id, name, duty, experience);
    }
}

public class Ex4 {
    public static void main(String args[]) {
        String data[][] = {
            {"MT1", "강민준", "디자인일반", "25"},
            {"MA1", "송서준", "행정", "16"},
            {"MS1", "고서윤", "S", "1"},
            {"MS1", "강서연", "D", "10"}
        };

        int n = data.length;
        SchoolMember[] job = new SchoolMember[n];

        for (int i = 0; i < n; i++) { // 객체 생성
            String id = data[i][0];
            String name = data[i][1];
            String department = data[i][2];
            int years = Integer.parseInt(data[i][3]);

            if (id.charAt(1) == 'T') {
            	job[i] = new Teacher(id, name, department, years);
            } else if (id.charAt(1) == 'S') {
            	job[i] = new Student(id, name, department, years);
            } else if (id.charAt(1) == 'A') {
            	job[i] = new Admin(id, name, department, years);
            }
        }

        for (int i = 0; i < n; i++) { // 객체 출력
            String title;
            if (job[i] instanceof Teacher) {
                title = "Teacher";
            } else if (job[i] instanceof Student) {
                title = "Student";
            } else if (job[i] instanceof Admin) {
                title = "Administrator";
            } else {
                title = "Unknown";	
            }

            System.out.println(title + "***************************************");
            job[i].printInfo();
            System.out.println("************************************************");
        }
    }
}
