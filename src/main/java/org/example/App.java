package org.example;



import org.hibernate.SessionFactory;


/**
 * Створити нову базу даних за допомогою MySQLWorkbench. Створити проєкт та налаштувати його правильно. Створити файл із налаштуваннями hibernate.cfg.xml.
 * Створити клас Animal (int age, String name, boolean tail) з методами get та set як сутність до нашої таблиці.
 * За допомогою hibernate створити нову таблицю з початковим значенням.
 */
public class App {
    public static void main(String[] args) {

        SessionFactory sessionFactory = null;

        try {
            sessionFactory = HibernateUtil.getSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }

    }
}
