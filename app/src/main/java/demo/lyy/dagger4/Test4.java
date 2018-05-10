package demo.lyy.dagger4;

import android.util.Log;

import javax.inject.Inject;

public class Test4 {

    @Inject
    @RosePot
    FlowerPot flowerPot;

    @Inject
    @LilyFlower
    Flower lily;


    public Test4() {
        DaggerTest4Component.builder().potComponent(
                DaggerPotComponent.builder().flowerComponent(
                        DaggerFlowerComponent.create()).build()).build().inject(this);
        Log.d("4---------", flowerPot.show());
        Log.d("4---------", lily.whisper());
    }


}
