package base;

import lombok.NonNull;

import java.util.List;
import java.util.Map;

/**
 * Defines queries for your {@link Repository} implementation.
 *
 * @param <T> the type of your top-level class
 * @param <U> the type of your static nested class
 * @param <V> the type of your enumerated class
 */
public interface Queries<T, U, V extends Enum<V>> {

    /**
     * Returns the greatest length of the title of the courses.
     *
     * @return the result
     * @throws NotFoundException if there are no <i>courses</i>
     */
    int query1() throws NotFoundException;

    /**
     * Returns the sorted copy of the courses using the {@link Comparable} interface.
     *
     * <p>
     * The stages:
     * <ol>
     *     <li> the credits of the <i>course</i> (descending)
     *     <li> the recommended semester of the <i>course</i> (ascending)
     *     <li> the course code of the <i>course</i> (ascending)
     * </ol>
     * </p>
     *
     * <p>
     * Notes:
     * <ol>
     *     <li>The method cannot modify the original list.
     *     <li>This task includes the implementation of the {@link Comparable} interface in your model class due to its nature.
     * </ol>
     * </p>
     *
     * @return the result
     */
    List<T> query2();

    /**
     * Returns the sorted copy of the courses using the {@link java.util.Comparator} interface.
     *
     * <p>
     * The stages:
     * <ol>
     *     <li> the title of the <i>course</i> (descending)
     *     <li> the recommended semester of the <i>course</i> (ascending)
     *     <li> the course code of the <i>course</i> (ascending)
     * </ol>
     * </p>
     *
     * <p>
     * Notes:
     * <ol>
     *     <li>The method cannot modify the original list.
     *     <li>The {@link java.util.Comparator} interface must be implemented as a static nested class of the class representing the <i>course</i>.
     * </ol>
     * </p>
     *
     * @return the result
     */
    List<T> query3();

    /**
     * Returns the first course that has any student with the given Neptun code.
     * Returns <code>null</code> if no <i>course</i> matches the condition.
     *
     * @param neptun the Neptun code of the student
     * @return the result
     */
    T query4(
            @NonNull String neptun);

    /**
     * Returns all the courses that contain the given student.
     *
     * @param student the student
     * @return the result
     */
    List<T> query5(
            @NonNull U student);

    /**
     * Returns a dictionary that maps each faculty to the course code of the first corresponding course.
     * The faculties without courses are not included.
     *
     * @return the result
     */
    Map<V, String> query6();
}
