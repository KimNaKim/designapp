package mock;

public class MeterService {

    private Meter meter;    //MockMeter, RealMeter를 받을 수 있음

    public MeterService(Meter meter) {
        this.meter = meter;
    }

    public void render(){
        int step = meter.getStep();
        System.out.println("걸음수 " + step +  "만큼 그림 그리기 완료");
    }
}
