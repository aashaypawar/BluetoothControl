package com.example.bluetoothcontrol

import android.bluetooth.BluetoothAdapter
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBt = findViewById<Button>(R.id.BtBtn)
        val tvBt = findViewById<TextView>(R.id.BtTv)

        val mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter()

        btnBt.setOnClickListener {

            if (mBluetoothAdapter.isEnabled) {
                mBluetoothAdapter.disable()
                tvBt.text = "Bluetooth is OFF"
            }else{
                mBluetoothAdapter.enable()
                tvBt.text = "Bluetooth is ON"
            }
        }




    }
}