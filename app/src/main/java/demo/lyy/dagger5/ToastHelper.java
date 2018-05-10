package demo.lyy.dagger5;

import android.widget.Toast;

import javax.inject.Inject;

public class ToastHelper implements Helper {

    App context;

    @Inject
    public ToastHelper(App context) {
        this.context = context;
    }

    void show(String text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }

    void init(App context) {
        this.context = context;
    }


    @Override
    public String show() {
        return getClass().getName();
    }
}
