package ro.ctrln.java.annotations;

public class NetworkingCourse implements BittnetCourse{
    private int totalCourses;
    private int completedCourses;
    private String name;

    public NetworkingCourse(String name, int total) {
        this.name=name;
        this.totalCourses=total;
    }

    @Override
    public String getProgress() {
        return "Programing" + name + "Progres" + completedCourses +'/'+ totalCourses;
    }
}
