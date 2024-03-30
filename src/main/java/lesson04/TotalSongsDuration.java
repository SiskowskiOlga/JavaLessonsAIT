package lesson04;

public class TotalSongsDuration {
    /*
    Рассчитайте общую продолжительность трех песен,
    если известна продолжительность каждой из них в секундах.
    Преобразуйте продолжительность каждой песни из секунд
    в минуты и секунды.
     */
    public static void main(String[] args) {
        float songOne = 130f;
        float songTwo = 120f;
        float songThree = 240f;

        float out = songOne + songTwo + songThree;
        float outsongOne = songOne/60;
        float outsongTwo = songTwo/60;
        float outsongThree = songThree/60;

        System.out.println(out);
        System.out.println(outsongOne);
        System.out.println(outsongTwo);
        System.out.println(outsongThree);

        //В минутах и секундах
        int firstSong = 100;
        int minutesFirstSong = firstSong / 60;
        int secondsFirstSong = firstSong - minutesFirstSong*60;
        System.out.println("Minutes " + minutesFirstSong + " Seconds " + secondsFirstSong);


    }
}
