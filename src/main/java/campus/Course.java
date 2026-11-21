package campus;

import java.util.List;

public class Course {

    String code;

    String title;

    Faculty faculty;

    int credits;

    int semester;

    List<Student> students;

    public static class Student {

        String neptun;

        String name;

        int grade;
    }

    public enum Faculty {
        INFORMATICS,
        SCIENCE,
        ENGINEERING,
        ECONOMICS,
        HUMANITIES
    }
}
