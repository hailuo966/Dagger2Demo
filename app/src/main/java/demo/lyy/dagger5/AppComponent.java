package demo.lyy.dagger5;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    HelperComponent plus(HelperModule module);

}
