package structural_design_pattern.Adapter;

public class MediaAdapter implements MediaPlayer{


    AdvanceMediaPlayer advanceMediaPlayer;

    MediaAdapter(String mediaType){
        if("VLC".equals(mediaType))
            advanceMediaPlayer = new VlcPlayer();
        else
            advanceMediaPlayer = new MP4player();
    }
    @Override
    public void play(String audioType, String fileName) {
        if("VLC".equals(audioType))
            advanceMediaPlayer.playVld(fileName);
        else
            advanceMediaPlayer.playMp4(fileName);
    }
}
