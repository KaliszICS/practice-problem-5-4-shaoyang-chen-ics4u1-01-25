public class MusicPlayer implements Player{
    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;
    public MusicPlayer(String[] mL){
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
        this.musicList = new String[mL.length];
        for (int i = 0; i < mL.length; i++) {
            this.musicList[i] = mL[i];
        }
    }
    @Override
    public void start(){
        this.onOff = true;
        currentSong = this.musicList[0];
    }
    @Override
    public void stop(){
        this.onOff = false;
        currentSong = "";
    }
    public boolean getOnOff(){
        return this.onOff;
    }
    @Override
    public void volumeUp(){
        this.volume++;
    }
    @Override
    public void volumeDown(){
        this.volume--;
    }
    @Override
    public int getVolume(){
        return this.volume;
    }
    public void next(){
        int pos = -2;
        for(int i = 0; i < musicList.length; i++){
            if(musicList[i].equals(currentSong)){
                pos = i;
                break;
            }
        }
        currentSong = musicList[++pos];
    }
    public void previous(){
        int pos = 0;
        for(int i = 0; i < musicList.length; i++){
            if(musicList[i].equals(currentSong)){
                pos = i;
                break;
            }
        }
        currentSong = musicList[--pos];
    }
    public String getCurrentSong(){
        return currentSong;
    }
}
