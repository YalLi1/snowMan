import javax.swing.*;
import java.awt.*;

// Класс, представляющий снеговика
public class SnowMan extends JPanel {

    // Конструктор класса SnowMan
    public SnowMan() {
        // Устанавливаем цвет фона для панели
        setBackground(new Color(214, 255, 250));
    }

    // Переопределяем метод paintComponent для рисования элементов
    @Override
    protected void paintComponent(Graphics g) {
        // Вызываем метод родительского класса
        super.paintComponent(g);

        // Создаем объект Graphics2D для улучшенной графики
        Graphics2D g2d = (Graphics2D) g;

        // Устанавливаем сглаживание для рисования
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Устанавливаем толщину линий
        float thickness = 5.0f;
        g2d.setStroke(new BasicStroke(thickness));

        // Рисуем основное тело снеговика (три больших овала)
        g.setColor(new Color(250, 255, 255));
        g.fillOval(225, 570, 520, 415); // Нижний овал
        g.fillOval(295, 380, 410, 320); // Средний овал
        g.fillOval(385, 210, 250, 215); // Голова

        // Рисуем шляпу снеговика
        g.setColor(new Color(0, 0, 0)); // Черный цвет
        g.fillOval(345, 195, 340, 60); // Верх шляпы
        g.fillRoundRect(420, 70, 190, 140, 20, 20); // Часть шляпы

        // Рисуем линию для обозначения нижней части шляпы
        g.setColor(new Color(255, 255, 255, 255));
        g.drawLine(420, 160, 610, 160); // Линия между верхом шляпы и головой

        // Задаем массивы для координат левой руки
        int[] xPointsLeftArm = {350, 355, 135, 100, 80, 110, 40, 35, 105, 65, 80, 135}; // Координаты X вершин
        int[] yPointsLeftArm = {550, 520, 445, 380, 390, 445, 435, 455, 470, 500, 520, 470}; // Координаты Y вершин
        g.fillPolygon(xPointsLeftArm, yPointsLeftArm, xPointsLeftArm.length); // Рисуем левую руку

        // Задаем массивы для координат правой руки
        int[] xPointsRightArm = {700, 926, 975, 990, 950, 1020, 1015, 940, 970, 955, 920, 695}; // Координаты X вершин
        int[] yPointsRightArm = {550, 475, 516, 505, 470, 455, 430, 445, 390, 380, 450, 520}; // Координаты Y вершин
        g.fillPolygon(xPointsRightArm, yPointsRightArm, xPointsRightArm.length); // Рисуем правую руку

        // Рисуем глаза снеговика
        g.setColor(Color.BLACK); // Черный цвет для глаз
        g.fillOval(490, 290, 25, 25); // Левый глаз
        g.fillOval(560, 290, 25, 25); // Правый глаз

        // Рисуем рот
        g.fillOval(470, 375, 20, 20);
        g.fillOval(505, 390, 20, 20);
        g.fillOval(545, 390, 20, 20);
        g.fillOval(580, 375, 20, 20);

        // Рисуем пуговицы на нижней части тела снеговика
        g.fillOval(530, 520, 20, 20);
        g.fillOval(530, 575, 20, 20);
        g.fillOval(530, 625, 20, 20);

        // Рисуем морковный нос
        int[] xPointNose = {530, 695, 535}; // Координаты X носа
        int[] yPointNose = {330, 330, 360}; // Координаты Y носа
        g.setColor(new Color(243, 98, 35)); // Цвет морковного носа
        g.fillPolygon(xPointNose, yPointNose, xPointNose.length); // Рисуем нос
    }
}