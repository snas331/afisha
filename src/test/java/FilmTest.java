import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmTest {
    @Test
    public void testFindAll() {
        Film manager = new Film();

        String movie1 = "Вперед";
        String movie2 =  "Бладшот";
        String movie3 = "Отель";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] actual = manager.findAll();
        String[] expected = {"Вперед", "Бладшот", "Отель"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitLessTenSize1() {
        Film manager = new Film();

        String movie1 = "Вперед";
        String movie2 =  "Бладшот";
        String movie3 = "Отель";
        String movie4 = "Джентельмены";
        String movie5 = "Тролли";
        String movie6 = "Номер";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] actual = manager.findLast();
        String[] expected = {"Номер", "Тролли", "Джентельмены", "Отель", "Бладшот"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitLessTenSize2() {
        Film manager = new Film(3);

        String movie1 = "Вперед";
        String movie2 =  "Бладшот";
        String movie3 = "Отель";
        String movie4 = "Джентельмены";
        String movie5 = "Тролли";
        String movie6 = "Номер";

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] actual = manager.findLast();
        String[] expected = {"Номер", "Тролли", "Джентельмены"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitMoreTenSize1() {
        Film manager = new Film();

        String movie1 = "Вперед";
        String movie2 =  "Бладшот";
        String movie3 = "Отель";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);


        String[] actual = manager.findLast();
        String[] expected = {"Отель", "Бладшот", "Вперед"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLastWhenLimitMoreTenSize2() {
        Film manager = new Film(4);

        String movie1 = "Вперед";
        String movie2 =  "Бладшот";
        String movie3 = "Отель";


        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);


        String[] actual = manager.findLast();
        String[] expected = {"Отель", "Бладшот", "Вперед"};

        Assertions.assertArrayEquals(expected, actual);

    }


}