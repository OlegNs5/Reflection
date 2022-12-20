package ro.ctrln.java.annotations;

public class WebCourse implements BittnetCourse {
    private int totalCourses;
    private int completedCourses;
    private String name;

    public WebCourse(String name, int totalCourses) {
        this.name=name;
        this.totalCourses=totalCourses;
    }

    @Override
    public String getProgress() {
        return "Web developing" + name + "Progres" + completedCourses +'/'+ totalCourses;
    }
}
