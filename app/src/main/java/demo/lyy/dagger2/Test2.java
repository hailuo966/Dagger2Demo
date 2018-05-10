package demo.lyy.dagger2;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Test2 {

    @Inject
    FlowerPot flowerPot;
    @Inject
    @Named("rose")
    Flower flower;

    public Test2() {
        DaggerTest2Component.create().inject(this);
        Log.d("2---------", flowerPot.show());
        Log.d("2---------", flower.whisper());
    }


}
