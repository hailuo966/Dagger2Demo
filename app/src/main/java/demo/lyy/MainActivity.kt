package demo.lyy;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import demo.lyy.dagger.Test
import demo.lyy.dagger1.Test1
import demo.lyy.dagger2.Test2
import demo.lyy.dagger3.Test3
import demo.lyy.dagger4.Test4
import demo.lyy.dagger5.Test5

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //普通注入，注意一个具体的实现
        Test()

        //通过module注入
        Test1()

        //通过module、name注入一个基类的子类实例，子类类型依据name
        Test2()

        //通过module、@Qualifier注入一个基类的子类实例，子类类型依据@Qualifier
        Test3()

        //通过module、dependencies注入
        Test4()

        //通过module、Subcomponent注入
        Test5()

        //注释不是很多，原理和用法也没有过多的讲解，可以结合 https://www.jianshu.com/p/24af4c102f62 和本Demo进行研究
        //还有几个知识点没有做Demo，@Scope，@MapKey，Lazy，后续抽时间补充
    }
}
