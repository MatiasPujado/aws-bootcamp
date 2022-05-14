package list.of.students;

public class Student {

    private Integer id;
    private String idCard;
    private Names name;
    private LastNames lastName;
    private Course course;
    private Double score;
    private Integer age;


    /**
     * No-argument constructor
     */
    public Student() {
    }

    /**
     * Parameterized constructor
     *
     * @param id
     * @param idCard
     * @param randomName
     * @param randomLastName
     * @param course
     * @param score
     * @param age
     */
    public Student(Integer id, String idCard, Names randomName, LastNames randomLastName, Course course, Double score, Integer age) {
        this.id = id;
        this.idCard = idCard;
        this.name = randomName;
        this.lastName = randomLastName;
        this.course = course;
        this.score = score;
        this.age = age;
    }

    /**
     * Gets ID
     *
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets ID
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets IdCard Number
     *
     * @return idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * Sets idCard Number
     *
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * Gets the Enum name
     *
     * @return name
     */
    public Names getName() {
        return name;
    }

    /**
     * Sets the Enum name
     *
     * @param name
     */
    public void setName(Names name) {
        this.name = name;
    }

    /**
     * Gets the Enum last name
     *
     * @return lastName
     */
    public LastNames getLastName() {
        return lastName;
    }

    /**
     * Sets the Enum last name
     *
     * @param lastName
     */
    public void setLastName(LastNames lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the Enum Course name
     *
     * @return course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * Sets the Enum Course name
     *
     * @param course
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    /**
     * Gets the students score
     *
     * @return score
     */
    public Double getScore() {
        return score;
    }

    /**
     * Sets the students score
     *
     * @param score
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * Gets the students age
     *
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets the students age
     *
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * To String method
     *
     * @return
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", idCard='" + idCard + '\'' +
                ", name=" + name +
                ", lastName=" + lastName +
                ", course='" + course + '\'' +
                ", score=" + score +
                ", age=" + age +
                '}';
    }
}
