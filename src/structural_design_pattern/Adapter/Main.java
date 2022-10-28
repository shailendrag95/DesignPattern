package structural_design_pattern.Adapter;

public class Main {
    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("AKP","InvalidFile");
        audioPlayer.play("MP3","MP3");
        audioPlayer.play("MP4","MP4");
        audioPlayer.play("VLC","VLC");
    }
}
