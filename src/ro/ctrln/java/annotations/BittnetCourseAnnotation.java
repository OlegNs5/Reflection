package ro.ctrln.java.annotations;


import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BittnetCourseAnnotation {
        String location() default "bittnetAcademy";
        String category();
}

