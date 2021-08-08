package Work3.Task1;

public class Student {
    private int id;
    private String name;
    private int Chinese;
    private int math;
    private int english;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        this.math = math;
        this.english = english;
    }
//id为自增类型，可以不用手动添加
    public Student(int id, String name, int chinese, int math, int english) {
        this.id = id;
        this.name = name;
        Chinese = chinese;
        this.math = math;
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Chinese=" + Chinese +
                ", math=" + math +
                ", english=" + english +
                '}';
    }
}
