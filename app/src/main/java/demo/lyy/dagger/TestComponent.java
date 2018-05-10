package demo.lyy.dagger;

import dagger.Component;

@Component
public interface TestComponent {
    void inject(Test test);
}
