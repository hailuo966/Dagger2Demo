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
        Test()
        Test1()
        Test2()
        Test3()
        Test4()
        Test5()
    }
}
