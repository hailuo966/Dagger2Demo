package demo.lyy.dagger2;

import dagger.Component;

@Component(modules = FlowerModule.class)
public interface Test2Component {
    void inject(Test2 test);
}
