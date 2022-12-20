package ro.ctrln.java.annotations;

public class ProgramingBitnetCourse implements BittnetCourse{

    private int totalCourses;
    private int completedCourses;
    private String name;

    public ProgramingBitnetCourse( String name,int totalCourses) {
        this.name=name;
        this.totalCourses=totalCourses;

    }

    @Override
    public String getProgress() {
        return "Programing" + name + "Progres" + completedCourses +'/'+ totalCourses;
    }
}
