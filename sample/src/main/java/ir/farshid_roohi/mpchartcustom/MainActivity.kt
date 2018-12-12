package ir.farshid_roohi.mpchartcustom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ir.farshid_roohi.mpchart.model.Entry
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chart1 = ArrayList<Entry>()
        val chart2 = ArrayList<Entry>()

        for (i in 0..60) {
            val entry = Entry(i.toFloat(), (Math.random() * 7).toFloat() + 300)
            if (i < 30) {
                chart1.add(entry)
            } else {
                chart2.add(entry)
            }
        }

        chart.setTitle("Title")
        chart.setTitleDataSetFirst("title 1")
        chart.setTitleDataSetSecond("title 2")
        chart.setListDataSetFirst(chart1)
        chart.setListDataSetSecond(chart2)
    }
}
