package demo.lyy.dagger3;

import javax.inject.Inject;

public class FlowerPot {

    private Flower flower;

    @Inject
    public FlowerPot(@LilyPot Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }
}
