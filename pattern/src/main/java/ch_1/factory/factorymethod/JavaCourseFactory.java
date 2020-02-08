package ch_1.factory.factorymethod;


import ch_1.factory.ICourse;
import ch_1.factory.JavaCourse;

/**
 * Created by Tom.
 */
public class JavaCourseFactory implements ICourseFactory {
    public ICourse create() {
        return new JavaCourse();
    }
}
