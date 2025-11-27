package Personal_projects.pacman;

import javax.sound.sampled.*;

public class SoundUtil {
    private static final float SAMPLE_RATE = 44100f;
    private SourceDataLine line;

    public void init() throws LineUnavailableException {
        AudioFormat fmt = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, fmt);
        line = (SourceDataLine) AudioSystem.getLine(info);
        line.open(fmt, 4096);
        line.start();
    }

    private void tone(double freq, int ms) {
        if (line == null) return;
        int len = (int)(SAMPLE_RATE * ms / 1000.0);
        byte[] buf = new byte[len];
        for (int i=0;i<len;i++) buf[i]=(byte)(Math.sin(2*Math.PI*i*freq/SAMPLE_RATE)*127);
        line.write(buf,0,len);
    }

    public void playPellet() { new Thread(() -> tone(1200,40)).start(); }
    public void playPowerPellet() { new Thread(() -> { tone(800,60); tone(1000,60); }).start(); }
    public void playEatGhost() { new Thread(() -> { tone(1400,80); tone(1800,80); }).start(); }
    public void playDeath() { new Thread(() -> { tone(200,300); tone(120,300); }).start(); }
    public void playLevelUp() { new Thread(() -> { tone(1000,120); tone(1300,120); tone(1700,120); }).start(); }
}
