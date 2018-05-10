package demo.lyy.dagger;

import android.util.Log;

import javax.inject.Inject;


public class Test {

    @Inject
    Pot pot;

    public Test() {

        DaggerTestComponent.create().inject(this);
        Log.d("---------", pot.show());

    }


}
