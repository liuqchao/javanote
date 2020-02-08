package OOP和设计模式.ch_1.factory.abstractfactory;

/**
 * Created by Tom.
 */
public class PythonCourseFactory implements CourseFactory {

    public INote createNote() {
        return new PythonNote();
    }


    public IVideo createVideo() {
        return new PythonVideo();
    }
}
