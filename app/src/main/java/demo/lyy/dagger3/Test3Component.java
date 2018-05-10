package demo.lyy.dagger3;

import dagger.Component;

@Component(modules = {FlowerModule.class, PotModule.class})
public interface Test3Component {
    void inject(Test3 test);
}
