package demo.lyy.dagger3;

import android.util.Log;

import javax.inject.Inject;

public class Test3 {

    @Inject
    @RosePot
    FlowerPot flowerPot;

    @Inject
    Lily lily;

    @Inject
    @RoseFlower
    Flower flower;

    public Test3() {
        DaggerTest3Component.create().inject(this);
        Log.d("3---------", flowerPot.show());
        Log.d("3---------", lily.whisper());
        Log.d("3---------", flower.whisper());
    }


}
