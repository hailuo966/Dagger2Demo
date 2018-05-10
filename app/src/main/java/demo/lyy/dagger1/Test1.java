package demo.lyy.dagger1;

import android.util.Log;

import javax.inject.Inject;

public class Test1 {

    @Inject
    FlowerPot pot;

    public Test1() {
        DaggerTest1Component.create().inject(this);
        Log.d("1---------", pot.show());
    }


}
