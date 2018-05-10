package demo.lyy.dagger2;

import javax.inject.Inject;
import javax.inject.Named;

public class FlowerPot {

    private Flower flower;

    @Inject
    public FlowerPot(@Named("rose") Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }
}
