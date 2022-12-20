package ro.ctrln.java.annotations;

public class BittnetCourseFactory {

    @BittnetCourseAnnotation(category = "programing")
    public BittnetCourse newProgramingCourses(String name, int total){
        return new ProgramingBitnetCourse(name,total);
    }
    @BittnetCourseAnnotation(location = "BittnetAcademyForNetworking",category = "networking")
    public NetworkingCourse newNetworkingCourse(String name, int total){
        return  new NetworkingCourse(name, total);
    }
    @BittnetCourseAnnotation(location = "BittnetAcademyForWebDevelopment",category = "webDevelopment")
    public WebCourse newWebCourse (String name, int total){
        return  new WebCourse(name, total);
    }
}
