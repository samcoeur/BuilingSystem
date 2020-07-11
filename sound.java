
package billing.managementsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class sound {
    InputStream in ;
    AudioStream audios ; 
    
    sound(String s){
    
    };
    
    public void playSound(String soundfile){
    try{
    in = new FileInputStream(new File(soundfile));
    AudioStream audios = new AudioStream(in);
    AudioPlayer.player.start(audios);
    }catch(Exception e ){System.out.print(e);}
    }
    
}
