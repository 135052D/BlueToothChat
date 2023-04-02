package com.example.android.bluetooth;

import android.bluetooth.BluetoothAdapter;

public interface ConnectionService {
    boolean bluetoothIsEnable(BluetoothAdapter mBluetoothAdapter);

    void enableBluetooth();
}
