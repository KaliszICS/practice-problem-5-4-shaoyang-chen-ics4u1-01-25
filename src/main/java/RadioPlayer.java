public class RadioPlayer implements Player{
    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;
    private int pos;
    public RadioPlayer(double[] stationList){
        this.stationList = new double[stationList.length];
        for (int i = 0; i < stationList.length; i++) {
            this.stationList[i] = stationList[i];
        }
        volume = 0;
        station = 0;
        onOff = false;
        pos = 0;
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
        for(int i = 0; i < stationList.length; i++){
            if(station == stationList[i]){
                this.pos = i;
                break;
            }
        }
        station = stationList[++this.pos];
    }
    public void previous(){
        for(int i = 0; i < stationList.length; i++){
            if(station == stationList[i]){
                this.pos = i;
                break;
            }
        }
        station = stationList[--this.pos];
    }
    public double getStation(){
        return station;
    }
}
