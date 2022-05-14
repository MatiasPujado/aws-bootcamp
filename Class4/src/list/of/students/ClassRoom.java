package list.of.students;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class ClassRoom {

    private List<Student> studentsList;
    private List<Student> scoreList;
    private Map<Integer, List<Student>> studentsByScore;

    /**
     * No-argument constructor
     */
    public ClassRoom() {
        this.studentsList = new ArrayList<>();
        this.scoreList = new ArrayList<>();
        this.studentsByScore = new HashMap<>();
    }

    /**
     * Parameterized constructor
     *
     * @param studentsList
     * @param scoreList
     * @param studentsByScore
     */
    public ClassRoom(List<Student> studentsList, List<Student> scoreList, Map<Double, List<Student>> studentsByScore) {
        this.studentsList = new ArrayList<>();
        this.scoreList = new ArrayList<>();
        this.studentsByScore = new HashMap<>();
    }

    /**
     * Gets the students list
     *
     * @return studentsList
     */
    public List<Student> getStudentsList() {
        return studentsList;
    }

    /**
     * Sets the students list
     *
     * @param studentsList
     */
    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }


    /**
     * Gets a list of students filtered by score
     *
     * @return scoreList
     */
    public List<Student> getScoreList() {
        return scoreList;
    }

    /**
     * Sets the scoreList
     *
     * @param scoreList
     */
    public void setScoreList(List<Student> scoreList) {
        this.scoreList = scoreList;
    }

    /**
     * Gets the map of students filtered by score
     *
     * @return studentsByScore
     */
    public Map<Integer, List<Student>> getStudentsByScore() {
        return studentsByScore;
    }

    /**
     * Sets the map of studentsByScore
     *
     * @param studentsByScore
     */
    public void setStudentsByScore(Map<Integer, List<Student>> studentsByScore) {
        this.studentsByScore = studentsByScore;
    }

    /**
     * Returns a Student object
     *
     * @return Student
     */
    public Student createStudent() {
        return new Student(randomID(), randomIDCard(), Names.randomName(), LastNames.randomLastName(), Course.JAVA_BOOTCAMP, randomScore(), randomAge());
    }

    /**
     * Creates a random ID number
     *
     * @return id
     */
    public int randomID() {
        String idNum = "";
        int id = 0;
        while (idNum.length() < 5) {
            idNum += String.valueOf(Math.round(Math.random() * 10));
        }

        try {
            id += Integer.parseInt(idNum);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        return id;
    }

    /**
     * Returns a random IDCard
     *
     * @return idCardNumber
     */
    public String randomIDCard() {
        String idCardNum = "";
        while (idCardNum.length() < 9) {
            idCardNum += String.valueOf(Math.round(Math.random() * 10));
        }
        return idCardNum;
    }

    /**
     * Returns a random score
     *
     * @return score
     */
    public Double randomScore() {
        DecimalFormat df = new DecimalFormat("0.00");
        double score = 0.00;

        try {
            score += Double.parseDouble(df.format(Math.random() * 10));
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }

        return score;
    }

    /**
     * Returns a random age
     *
     * @return age
     */
    public int randomAge() {
        int age = (int) (Math.round(Math.random() * 30));
        if (age < 12) {
            age += 10;
        }
        return age;
    }

    /**
     * Adds a Student object to the list
     */
    public void addStudentToList() {
        studentsList.add(createStudent());
    }

    /**
     * Fills the list with a classroom of 20 students
     */
    public void fillStudentsList() {
        for (int i = 0; i < 20; i++) {
            addStudentToList();
        }
    }

    /**
     * Prints on screen the full list of students
     */
    public void printStudentsList() {
//        int i = 0;
//        for (Student student : studentsList) {
//            System.out.println(i + " - " + student);
//            i++;
//        }
        studentsList.forEach(System.out::println);
    }

    /**
     * Sorts students by age in ascending order
     */
    public void sortByAgeAsc() {
        studentsList.sort(CompareStudents.sortByAgeAsc);
    }

    /**
     * Filters students names based on a given letter
     *
     * @param letter
     */
    public void filterByChar(String letter) {
        Arrays.stream(Names.values())
                .filter(name -> String.valueOf(name.name().charAt(0)).equals(letter))
                .forEach(System.out::println);
    }

    /**
     * Returns the total of the sum of all student ages
     *
     * @return sumAges
     */
    public int sumOfAllAges() {
        int sumAges = 0;
        for (Student student : studentsList) {
            sumAges += student.getAge();
        }
        return sumAges;
    }

    /**
     * Filters the lists of students based on a given score and stores it on a new List
     *
     * @param score
     */
    public void filterByScore(int score) {
//        for (Student student : studentsList) {
//            if (student.getScore().equals(score)) {
//                scoreList.add(student);
//            }
//            studentsByScore.put(score, scoreList);
//        }

        studentsByScore.put(score, studentsList.stream()
                .filter(student -> Math.round(student.getScore()) == score)
                .collect(Collectors.toList()));
        System.out.println(studentsByScore);
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "studentsList=" + studentsList +
                ", scoreList=" + scoreList +
                ", studentsByScore=" + studentsByScore +
                '}';
    }
}