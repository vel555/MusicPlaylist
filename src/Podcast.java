


public class Podcast implements AudioTrack {
    private final String title;
    private final String artist;
    private final int duration; // в секундах
    private final String genre;
    private int rating;
    private final String host;

    public Podcast(String title, String artist, int duration, String genre, String host) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.host = host;
        this.rating = 0; // Начальный рейтинг
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
        return "Podcast: " + title + " by " + artist + " | Duration: " + duration + " sec | Genre: " + genre +
                " | Host: " + host + " | Rating: " + rating;
    }
}