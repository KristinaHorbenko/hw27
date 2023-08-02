package org.example;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import org.example.Homework;
import org.example.Lesson;

public class Main {
    public static void main(String[] args) throws SQLException {

        LessonDao lessonDao = new LessonDao();
        //lessonDao.deleteLesson(1);
        HomeworkDao homeworkDao = new HomeworkDao();
//        homeworkDao.deleteLesson(1);


        //   try {
//
//            // Создаем объект Homework и добавляем его в базу данных
//        //  Homework homework = new Homework( 1,"Українська мова", "Вивчити правила");
//            Homework homework1 = new Homework( 7,"Історія", "Підготуватися до тесту");
//            Homework homework2 = new Homework( 3,"Українська література", "Прочитати твір");
//            Homework homework3 = new Homework( 4,"Англійська мова", "Зробити вправи");
//            Homework homework4 = new Homework( 5,"Малювання", "Завершити пейзаж");
//            Homework homework5 = new Homework( 6,"Математика", "Вирішити задачі");
//////            homeworkDao.addHomework(homework);
//////            homeworkDao.addHomework(homework1);
////            homeworkDao.addHomework(homework2);
////            homeworkDao.addHomework(homework3);
////            homeworkDao.addHomework(homework4);
////            homeworkDao.addHomework(homework5);
//
//
//
//            //Создаем объект Lesson с использованием добавленного в базу данных homeworkId
//       // Lesson lesson = new Lesson( 2,"Українська мова",  homework);
//            Lesson lesson1 = new Lesson( 7,"Історія", homework1);
//            Lesson lesson2 = new Lesson( 3,"Українська література",  homework2);
//            Lesson lesson3 = new Lesson( 4,"Англійська мова",  homework3);
//            Lesson lesson4 = new Lesson( 5,"Малювання",  homework4);
//            Lesson lesson5 = new Lesson( 6,"Математика",  homework5);
//
//           // lessonDao.addLesson(lesson);
//            lessonDao.addLesson(lesson1);
//            lessonDao.addLesson(lesson2);
//            lessonDao.addLesson(lesson3);
//            lessonDao.addLesson(lesson4);
//            lessonDao.addLesson(lesson5);
//
//
//            System.out.println("Урок успішно доданий до бази даних.");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Помилка при додаванні уроку або домашнього завдання до бази даних: " + e.getMessage());
//        }
//    }
        int lessonId = 2;
        Lesson lessonById = lessonDao.getLessonById(lessonId);
        if (lessonById != null) {
            System.out.println("Lesson ID: " + lessonById.getId());
            System.out.println("Lesson Name: " + lessonById.getName());
            System.out.println("Homework ID: " + lessonById.getHomework().getId());
            System.out.println("Homework Name: " + lessonById.getHomework().getName());
            System.out.println("Homework Description: " + lessonById.getHomework().getDescription());
        } else {
            System.out.println("Lesson with ID " + lessonId + " not found.");
        }
    }
}
















