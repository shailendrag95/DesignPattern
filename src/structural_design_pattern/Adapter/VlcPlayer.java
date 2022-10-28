package structural_design_pattern.Adapter;

public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVld(String fileName   ) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String filename) {

    }
}
