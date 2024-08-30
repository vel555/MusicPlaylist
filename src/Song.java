

public class Song implements AudioTrack {
    private final String title;
    private final String artist;
    private final int duration; // в секундах
    private final String genre;
    private int rating;
    private final String album;

    public Song(String title, String artist, int duration, String genre, String album) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.album = album;
        this.rating = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Рейтинг должен быть от 1 до 5");
        }
    }

    @Override
    public String toString() {
        return "Song: " + title + " by " + artist + " | Duration: " + duration + " sec | Genre: " + genre + " | Album: "
                + album + " | Rating: " + rating;
    }
}
