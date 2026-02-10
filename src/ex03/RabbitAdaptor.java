package ex03;

import ex03.lib.OuterRabbit;

public class RabbitAdaptor extends Animal{
    //OuterRabbit을 변환하기 위한 코드
    private OuterRabbit outerRabbit;    //has

    public RabbitAdaptor(OuterRabbit rabbit) {
        this.outerRabbit = rabbit;
    }

    @Override
    public String getName() {
        return outerRabbit.getFullname();
    }
}
