package homework30

public class User {
    private var id = 0
    private var name: String? = null
    private val videos = HashMap<Int, Video>()

    fun User(id: Int, name: String?) {
        this.id = id
        this.name = name
    }

    fun addVideo(video: Video) {
        video.user = this
        videos[video.id] = video
        println("Added video: " + video.title)
    }

    fun removeVideo(videoId: Int) {
        videos.remove(videoId)
        println("Removed video: $videoId")
    }

    fun getVideosInfo() {
        println("User " + name + " has " + videos.size + " videos")
        for (video in videos.values) {
            println(video)
        }
    }

    override fun toString(): String {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", videos=" + videos +
                '}'
    }

}