package ch_1.factory.abstractfactory;

/**
 * Created by Tom.
 */
public class JavaCourseFactory implements CourseFactory {

    public INote createNote() {
        return new JavaNote();
    }

    public IVideo createVideo() {
        System.out.println();
        return new JavaVideo();
    }
}
