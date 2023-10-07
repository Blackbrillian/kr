import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.Radio;

public class RadioTest {


    @Test
    public void setCurrentStationRegular() {

        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int actual = radio.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationOver9() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(11);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentStationBellow0() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRegular() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextAfterNine() {

        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRegular() {

        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevPreviosZero() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testSetVolumeOver100() {

        Radio radio = new Radio();
        radio.setCurrentVolume(34);
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();
        int expected = 34;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetVolumeBelloZero() {

        Radio radio = new Radio();
        radio.setCurrentVolume(34);
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 34;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testDecreaseVolumeRegular() {

        Radio radio = new Radio();
        radio.setCurrentVolume(34);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 33;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void testDecreaseVolumeBellowZero() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testIncreaseVolume() {

        Radio radio = new Radio();
        radio.setCurrentStation(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected =1;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testIncreaseVolumeOver100() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testDecreaseVolume() {

        Radio radio = new Radio();
        radio.setCurrentStation(34);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testDecreaseVolumeZero() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

}
