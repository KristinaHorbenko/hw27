package org.example;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkDaoTest {

    @Test
    void addHomework() throws SQLException {
        Homework homework = new Homework("Test Homework", "Description for Test Homework");
        homework.setName("Test Homework");
        homework.setDescription("This is a test homework");

        HomeworkDao.addHomework(homework);
        assertDoesNotThrow(() -> HomeworkDao.addHomework(homework));

    }

    @Test
    void deleteHomework() throws SQLException {
        int idHomework = 1;
        HomeworkDao.deleteHomework(idHomework);
        assertTrue(true);

    }
}