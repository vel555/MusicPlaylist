
public class MusicPlayer {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();


        Song song1 = new Song("песня раз", "шнур", 210, "Pop", "рыба");
        Song song2 = new Song("песня два", "шевчук", 180, "Rock", "ддт");
        Podcast podcast1 = new Podcast("подкаст раз", "шнур", 3600, "Talk", "Host A");
        Podcast podcast2 = new Podcast("подкаст два", "шевчук", 3000, "Education", "Host B");


        playlist.addTrack(song1);
        playlist.addTrack(song2);
        playlist.addTrack(podcast1);
        playlist.addTrack(podcast2);


        System.out.println("Плейлист:");
        playlist.printPlaylist();


        System.out.println("\nПоиск по названию 'песня раз':");
        System.out.println(playlist.searchByTitle("песня раз"));

        System.out.println("\nПоиск по исполнителю 'шнур':");
        System.out.println(playlist.searchByArtist("шнур"));


        System.out.println("\nТреки жанра 'Pop':");
        System.out.println(playlist.getTracksByGenre("Pop"));


        System.out.println("\nУдаление 'песня два' из плейлиста.");
        playlist.removeTrack(song2);
        System.out.println("Обновленный плейлист:");
        playlist.printPlaylist();


        System.out.println("\nОбщая длительность плейлиста: " + playlist.getTotalDuration() + " секунд");


        System.out.println("\nСортировка по рейтингу:");
        song1.setRating(4);
        song2.setRating(5);
        podcast1.setRating(3);
        podcast2.setRating(5);
        playlist.sortByRating();
        playlist.printPlaylist();
    }
}

