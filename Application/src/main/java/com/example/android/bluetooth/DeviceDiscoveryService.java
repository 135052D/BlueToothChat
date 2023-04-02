package com.example.android.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;

import java.util.Set;

public interface DeviceDiscoveryService {
    boolean isDeviceDiscovery(BluetoothAdapter bluetoothAdapter);

    boolean startDeviceDiscovery(BluetoothAdapter bluetoothAdapter);

    boolean cancelDeviceDiscovery(BluetoothAdapter bluetoothAdapter);

    Set<BluetoothDevice> getPairedDevices(BluetoothAdapter bluetoothAdapter);

    void ensureDiscoverableForATime(BluetoothAdapter mBluetoothAdapter, int time );

    BluetoothDevice getRemoteDevice(String extraDeviceAddress);



}
