

public interface AudioTrack {
    String getTitle();
    String getArtist();
    int getDuration(); // длительность в секундах
    String getGenre();
    int getRating(); // рейтинг от 1 до 5
    void setRating(int rating);
}
