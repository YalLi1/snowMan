import javax.swing.*;
import java.awt.*;

// Главный класс программы
public class Main {
    public static void main(String[] args) {
        // Создаем объект снеговика
        SnowMan snowMan = new SnowMan();

        // Создаем окно с заголовком
        JFrame frame = new JFrame("This is SnowMan");

        // Добавляем снеговика в окно
        frame.add(snowMan);

        // Устанавливаем размер окна
        frame.setSize(1080, 1920);

        // Закрываем приложение при закрытии окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Делаем окно видимым
        frame.setVisible(true);
    }
}