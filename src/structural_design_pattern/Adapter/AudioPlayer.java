package structural_design_pattern.Adapter;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AudioPlayer implements MediaPlayer{

    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if("MP3".equals(audioType)){
            System.out.println("playing mp3 , filename :"+ fileName);
        }else if (Arrays.asList(new String[]{"MP4", "VLC"}).contains(audioType)){
            mediaPlayer= new MediaAdapter(audioType);
            mediaPlayer.play(audioType,fileName);
        } else {
            System.out.println("Invalid media type: "+ audioType);
        }
    }
}
