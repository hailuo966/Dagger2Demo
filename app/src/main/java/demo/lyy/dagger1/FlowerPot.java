package demo.lyy.dagger1;

import javax.inject.Inject;

public class FlowerPot {

    private Flower flower;

    @Inject
    public FlowerPot(Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }
}
