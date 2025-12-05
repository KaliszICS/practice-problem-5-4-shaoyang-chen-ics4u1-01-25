public class RadioPlayer implements Player{
    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;
    public RadioPlayer(double[] sl){
        for (int i = 0; i < sl.length; i++) {
            stationList[i] = sl[i];
        }
        volume = 0;
        station = 0;
        onOff = false;
    }
    @Override
    public void start() {
        onOff = true;
        station = stationList[0];
    }
    @Override
    public void stop() {
        onOff = false;
        station = 0;
    }
    public boolean getOnOff(){
        return onOff;
    }
    @Override
    public void volumeUp() {
        volume+=2;
    }
    @Override
    public void volumeDown() {
        volume-=2;
    }
    @Override
    public int getVolume() {
        return volume;
    }
    public void next(){
        int pos = -2;
        for(int i = 0; i < stationList.length; i++){
            if(stationList[i] == station){
                pos = i;
            }
        }
        station = stationList[pos++];
    }
    public void previous(){
        int pos = -2;
        for(int i = 0; i < stationList.length; i++){
            if(stationList[i] == station){
                pos = i;
            }
        }
        station = stationList[pos--];
    }
    public double getStation(){
        return station;
    }
}
