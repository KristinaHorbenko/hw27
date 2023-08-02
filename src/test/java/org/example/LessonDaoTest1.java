package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LessonDaoTest1 {

    @Test
    void addLesson() throws SQLException {
    Homework homework = new Homework("Test Homework", "Description for Test Homework");
    Lesson lesson = new Lesson("Test Lesson", homework);
    LessonDao.addLesson(lesson);
    assertDoesNotThrow(() -> LessonDao.addLesson(lesson));

    }

    @Test
    void deleteLesson() throws SQLException {
        int idLesson = 1;
        LessonDao.deleteLesson(idLesson);
        assertTrue(true);


    }
}
