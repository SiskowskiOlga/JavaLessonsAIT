package homework30;

public class YouTubeTest {
    public static void main(String[] args) {
        User user = new User(1,"Olga");
        User userYouTube = new User(2,"Helga");
        Video video = new Video("07.05.2024", 1,"Star wars",20);
        user.addVideo(video);
        video.addDislike();
        video.addLike();
        video.addView();
        video.addComment(userYouTube,"08.05.2024", "😜🥸");

        user.getVideosInfo();
        System.out.println(user);
    }

}
