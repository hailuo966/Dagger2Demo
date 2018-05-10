package demo.lyy.dagger5;

import android.util.Log;

import javax.inject.Inject;

public class Test5 {

    @Inject
    PreferenceHelper preferenceHelper;

    @Inject
    ToastHelper ToastHelper;

    public Test5() {

        DaggerAppComponent.create().plus(new HelperModule()).plus().inject(this);
        Log.d("5---------", preferenceHelper.show());
        Log.d("5---------", ToastHelper.show());
    }
}
