package replit08_OOP._08ParkingMeter;

public class ParkingMeter {

    public int timeLeft = 0;
    public int maxTime;

    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }

    public boolean add(int num){
        if(num == 25 && (timeLeft + 30)<=maxTime){
            timeLeft += 30;
            return true;
        }
        return false;
    }

    public void tick(){
        if(timeLeft > 0) timeLeft-=1;
    }

    public boolean isExpired(){
        if(timeLeft == 0) return true;
        return false;
    }


}
