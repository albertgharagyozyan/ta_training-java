import java.time.LocalDate;

public class StudentList {
    public static void main(String[] args) {


        Student[] student = new Student[20];
        student[0] = new Student(1, "Poghosyan", "Poghos", "Poghosi", LocalDate.parse("1990-03-19"), "Bakunc 3", "123345", "Mechanical", 4, "M-812");
        student[1] = new Student(2, "Petrosyan", "Petros", "Petrosi", LocalDate.parse("1992-04-30"), "Mravyan 56", "9754365", "Electrical", 2, "E-612");
        student[2] = new Student(3, "Abgaryan", "Abgar", "Abgari", LocalDate.parse("1993-05-23"), "Ankaxutyan 67", "34762345", "Mechanical", 3, "M-514");
        student[3] = new Student(4, "Grigoryan", "Grigor", "Grigori", LocalDate.parse("1994-05-29"), "Bakunc 3", "123345", "Electrical", 1, "E-812");
        student[4] = new Student(5, "Arshakyan", "Arshak", "Arshaki", LocalDate.parse("1991-03-19"), "Bakunc 3", "123345", "Mechanical", 1, "M-514");
        student[5] = new Student(6, "Sergeyan", "Sergey", "Sergeyi", LocalDate.parse("1995-03-19"), "Bakunc 3", "123345", "Electrical", 5, "E-812");
        student[6] = new Student(7, "Ashotyan", "Ashot", "Ashoti", LocalDate.parse("1992-03-19"), "Bakunc 3", "123345", "Mechanical", 2, "M-514");
        student[7] = new Student(8, "Sargsyan", "Sargis", "Sargisi", LocalDate.parse("1994-03-19"), "Bakunc 3", "123345", "Electrical", 3, "E-812");
        student[8] = new Student(9, "Mestropyan", "Anna", "Poghosi", LocalDate.parse("1991-03-19"), "Bakunc 3", "123345", "Mechanical", 5, "M-514");
        student[9] = new Student(10, "Baghdasaryan", "Karen", "Poghosi", LocalDate.parse("1990-03-19"), "Bakunc 3", "123345", "Electrical", 1, "E-812");
        student[10] = new Student(11, "Vardanyan", "Artush", "Poghosi", LocalDate.parse("1993-03-19"), "Bakunc 3", "123345", "Mechanical", 4, "M-514");
        student[11] = new Student(12, "Davtyan", "Slavik", "Poghosi", LocalDate.parse("1996-03-19"), "Bakunc 3", "123345", "Electrical", 5, "E-812");
        student[12] = new Student(13, "Galstyan", "Narek", "Poghosi", LocalDate.parse("1989-03-19"), "Bakunc 3", "123345", "Mechanical", 2, "M-514");
        student[13] = new Student(14, "Atayan", "Arman", "Poghosi", LocalDate.parse("1988-03-19"), "Bakunc 3", "123345", "Electrical", 3, "E-812");
        student[14] = new Student(15, "Hovsepyan", "Meliq", "Poghosi", LocalDate.parse("1987-03-19"), "Bakunc 3", "123345", "Mechanical", 5, "M-514");
        student[15] = new Student(16, "Ghazaryan", "Gurgen", "Poghosi", LocalDate.parse("1996-03-19"), "Bakunc 3", "123345", "Electrical", 4, "E-812");
        student[16] = new Student(17, "Tangyan", "Armen", "Poghosi", LocalDate.parse("1986-03-19"), "Bakunc 3", "123345", "Mechanical", 3, "M-514");
        student[17] = new Student(18, "Movsisyan", "Hovik", "Poghosi", LocalDate.parse("1991-03-19"), "Bakunc 3", "123345", "Electrical", 2, "E-812");
        student[18] = new Student(19, "Manvelyan", "Daniel", "Poghosi", LocalDate.parse("1992-03-19"), "Bakunc 3", "123345", "Mechanical", 1, "M-514");
        student[19] = new Student(20, "Gevorgyan", "Shushan", "Poghosi", LocalDate.parse("1991-03-19"), "Bakunc 3", "123345", "Electrical", 4, "E-812");


        String faculty = "Electrical";

        System.out.println("list of students " + faculty + " faculty");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if (faculty.equals(student[i].getFaculty())) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students Mechanical faculty 1 course");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if ("Mechanical".equals(student[i].getFaculty()) && student[i].getCourse() == 1) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students Mechanical faculty 2 course");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if ("Mechanical".equals(student[i].getFaculty()) && student[i].getCourse() == 2) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students Mechanical faculty 3 course");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if ("Mechanical".equals(student[i].getFaculty()) && student[i].getCourse() == 3) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students Mechanical faculty 4 course");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if ("Mechanical".equals(student[i].getFaculty()) && student[i].getCourse() == 4) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students Mechanical faculty 5 course");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if ("Mechanical".equals(student[i].getFaculty()) && student[i].getCourse() == 5) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students Electrical faculty 1 course");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if ("Electrical".equals(student[i].getFaculty()) && student[i].getCourse() == 1) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students Electrical faculty 2 course");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if ("Electrical".equals(student[i].getFaculty()) && student[i].getCourse() == 2) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students Electrical faculty 3 course");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if ("Electrical".equals(student[i].getFaculty()) && student[i].getCourse() == 3) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students Electrical faculty 4 course");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if ("Electrical".equals(student[i].getFaculty()) && student[i].getCourse() == 4) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students Electrical faculty 5 course");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if ("Electrical".equals(student[i].getFaculty()) && student[i].getCourse() == 5) {
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());
            }
        }
        System.out.println();
        System.out.println("List of students borned after 1991");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            if (student[i].getBirthDate().getYear() > 1991)
                System.out.println(student[i].getName() + " " + student[i].getSurname() + " " + student[i].getMiddleName());

        }

    }
}