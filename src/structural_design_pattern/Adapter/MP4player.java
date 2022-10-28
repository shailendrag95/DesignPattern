package structural_design_pattern.Adapter;

public class MP4player implements AdvanceMediaPlayer{
    @Override
    public void playVld(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
