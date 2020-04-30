package com.hubbado.primenumber.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.hubbado.primenumber.R
import com.hubbado.primenumber.injection.DaggerViewModelFactory
import com.hubbado.primenumber.injection.component.DaggerMainComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mViewModeFactory: DaggerViewModelFactory

    lateinit var mAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerMainComponent
            .builder()
            .build()
            .inject(this)

        val viewModel: MainViewModel by viewModels { mViewModeFactory }

        setContentView(R.layout.activity_main)

        btSubmit.setOnClickListener {
            if (tietArraySize.text?.isNotBlank() == true)
                try {
                    showArray(viewModel.getPrimeNumberArray(Integer.valueOf(tietArraySize.text.toString())))
                    tilArraySize.isErrorEnabled = false
                } catch (e: NumberFormatException) {
                    tilArraySize.error = getString(R.string.error_invalid_number)
                }
        }

        rvArray.layoutManager = LinearLayoutManager(this)
        mAdapter = MainAdapter(this, emptyList())
        rvArray.adapter = mAdapter
    }

    private fun showArray(primeNumberArray: Array<IntArray>) {
        val rowList = arrayListOf<String>()
        for (element in primeNumberArray)
            rowList.add(element.joinToString(separator = " "))

        mAdapter.setData(rowList)
    }
}
