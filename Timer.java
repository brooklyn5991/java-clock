public class Timer {
    private int sec;
    private int min;
    private int hour;

    public Timer(int sec, int min, int hour) {
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }

    public void advance() {
        this.sec++;

        if (this.sec >= 60) {
            this.min++;
            this.sec = 0;
            if(this.min >= 60) {
                this.hour++;
                this.min = 0;
                if(this.hour >= 60) {
                    this.hour = 0;
                }
            }
        }

    }

    @Override
    public String toString() {
        return String.format("%02d : %02d : %02d", this.hour, this.min, this.sec);
    }


}