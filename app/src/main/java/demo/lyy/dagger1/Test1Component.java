package demo.lyy.dagger1;

import dagger.Component;

@Component(modules = LilyModule.class)
public interface Test1Component {
    void inject(Test1 test);
}
