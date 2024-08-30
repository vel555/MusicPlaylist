


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist {
    private final List<AudioTrack> tracks;

    public Playlist() {
        tracks = new ArrayList<>();
    }

    public void addTrack(AudioTrack track) {
        tracks.add(track);
    }

    public void removeTrack(AudioTrack track) {
        tracks.remove(track);
    }

    public List<AudioTrack> searchByTitle(String title) {
        return tracks.stream()
                .filter(track -> track.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    public List<AudioTrack> searchByArtist(String artist) {
        return tracks.stream()
                .filter(track -> track.getArtist().equalsIgnoreCase(artist))
                .collect(Collectors.toList());
    }

    public List<AudioTrack> getTracksByGenre(String genre) {
        return tracks.stream()
                .filter(track -> track.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public void printPlaylist() {
        for (AudioTrack track : tracks) {
            System.out.println(track);
        }
    }

    public int getTotalDuration() {
        return tracks.stream().mapToInt(AudioTrack::getDuration).sum();
    }

    public void sortByRating() {
        Collections.sort(tracks, Comparator.comparingInt(AudioTrack::getRating).reversed());
    }
}