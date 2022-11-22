package Math_Lesson;

import java.util.HashSet;
import java.util.Set;

public class MathLessonMain {
    public static void main(String[] args) {
        MathLesson mathLesson = new MathLesson();
        System.out.println(mathLesson);
        Task task = new Task(3,4);
        Task task2 = new Task(4,3);
        Set<Task> set = new HashSet<>();
        set.add(task);
        set.add(task2);
        System.out.println(set);
    }
}
