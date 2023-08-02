package org.example;

import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LessonDaoTest {



    @Test
    void getAllLessonsFirst() throws SQLException {
        List<Lesson> lessons = LessonDao.getAllLessons();
        assertNotNull(lessons);
        assertFalse(lessons.isEmpty());
    }


    @Test
    void getAllLessonsSecond() throws SQLException {
        List<Lesson> lessons = LessonDao.getAllLessons();

        assertEquals(12, lessons.size());

    }



    @Test
    void getLessonById() throws SQLException {
        Lesson lesson = LessonDao.getLessonById(2);

        assertNotNull(lesson);
        assertEquals(0, lesson.getId());
        assertEquals(0, lesson.getHomework().getId());

    }

}