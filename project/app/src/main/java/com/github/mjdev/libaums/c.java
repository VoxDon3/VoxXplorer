/*
 * Decompiled with CFR 0.152.
 */
package com.github.mjdev.libaums;

import android.content.Context;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.util.Log;
import ax.e5.a;
import ax.e5.b;
import ax.j5.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class c {
    private static final String l = "c";
    private UsbManager a;
    private UsbDeviceConnection b;
    private UsbDevice c;
    private UsbInterface d;
    private UsbEndpoint e;
    private UsbEndpoint f;
    private a g;
    private ax.j5.b h;
    private List<ax.j5.a> i = new ArrayList<ax.j5.a>();
    private boolean j = false;
    private boolean k = false;

    private c(UsbManager usbManager, UsbDevice usbDevice, UsbInterface usbInterface, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
        this.a = usbManager;
        this.c = usbDevice;
        this.d = usbInterface;
        this.e = usbEndpoint;
        this.f = usbEndpoint2;
    }

    public static c[] b(Context object) {
        UsbManager usbManager = (UsbManager)object.getSystemService("usb");
        ArrayList<c> arrayList = new ArrayList<c>();
        for (UsbDevice usbDevice : usbManager.getDeviceList().values()) {
            object = l;
            CharSequence charSequence = new StringBuilder();
            charSequence.append("found usb device: ");
            charSequence.append(usbDevice);
            Log.i((String)object, (String)charSequence.toString());
            int n8 = usbDevice.getInterfaceCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                UsbInterface usbInterface = usbDevice.getInterface(i8);
                charSequence = l;
                object = new StringBuilder();
                ((StringBuilder)object).append("found usb interface: ");
                ((StringBuilder)object).append(usbInterface);
                Log.i((String)charSequence, (String)((StringBuilder)object).toString());
                if (usbInterface.getInterfaceClass() == 8 && usbInterface.getInterfaceSubclass() == 6 && usbInterface.getInterfaceProtocol() == 80) {
                    int n9 = usbInterface.getEndpointCount();
                    if (n9 != 2) {
                        Log.w((String)charSequence, (String)"inteface endpoint count != 2");
                    }
                    charSequence = null;
                    object = null;
                    for (int i9 = 0; i9 < n9; ++i9) {
                        UsbEndpoint usbEndpoint = usbInterface.getEndpoint(i9);
                        CharSequence charSequence2 = l;
                        Object object2 = new StringBuilder();
                        ((StringBuilder)object2).append("found usb endpoint: ");
                        ((StringBuilder)object2).append(usbEndpoint);
                        Log.i((String)charSequence2, (String)((StringBuilder)object2).toString());
                        charSequence2 = charSequence;
                        object2 = object;
                        if (usbEndpoint.getType() == 2) {
                            if (usbEndpoint.getDirection() == 0) {
                                charSequence2 = usbEndpoint;
                                object2 = object;
                            } else {
                                object2 = usbEndpoint;
                                charSequence2 = charSequence;
                            }
                        }
                        charSequence = charSequence2;
                        object = object2;
                    }
                    if (charSequence != null && object != null) {
                        arrayList.add(new c(usbManager, usbDevice, usbInterface, (UsbEndpoint)object, (UsbEndpoint)charSequence));
                        continue;
                    }
                    Log.e((String)l, (String)"Not all needed endpoints found!");
                    continue;
                }
                Log.i((String)charSequence, (String)"device interface not suitable!");
            }
        }
        return arrayList.toArray(new c[0]);
    }

    private void g() throws IOException {
        for (ax.j5.c c8 : this.h.a()) {
            ax.j5.a a8 = ax.j5.a.a(c8, this.g);
            if (a8 != null) {
                this.i.add(a8);
                continue;
            }
            if (c8.b() != 6) continue;
            this.k = true;
        }
    }

    private void i() throws IOException {
        Object object;
        Object object2 = l;
        Log.d((String)object2, (String)"setup device");
        this.b = object = this.a.openDevice(this.c);
        if (object != null) {
            if (object.claimInterface(this.d, true)) {
                object = ax.m5.c.a(this.b, this.f, this.e);
                byte[] byArray = new byte[1];
                this.b.controlTransfer(161, 254, 0, this.d.getId(), byArray, 1, 5000);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("MAX LUN ");
                stringBuilder.append(byArray[0]);
                Log.i((String)object2, (String)stringBuilder.toString());
                this.g = object2 = ax.e5.b.a((ax.m5.b)object);
                object2.e();
                this.h = ax.j5.d.a(this.g);
                this.g();
                return;
            }
            throw new IOException("could not claim interface!");
        }
        throw new IOException("deviceConnection is null!");
    }

    public void a() {
        String string = l;
        Log.d((String)string, (String)"close device");
        UsbDeviceConnection usbDeviceConnection = this.b;
        if (usbDeviceConnection == null) {
            return;
        }
        if (!usbDeviceConnection.releaseInterface(this.d)) {
            Log.e((String)string, (String)"could not release interface!");
        }
        this.b.close();
        this.j = false;
    }

    public List<ax.j5.a> c() {
        return this.i;
    }

    public UsbDevice d() {
        return this.c;
    }

    public boolean e() {
        return this.k;
    }

    public void f() throws IOException {
        if (this.a.hasPermission(this.c)) {
            this.i();
            this.j = true;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Missing permission to access usb device: ");
        stringBuilder.append(this.c);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void h() {
        UsbDeviceConnection usbDeviceConnection = this.b;
        if (usbDeviceConnection == null) {
            return;
        }
        usbDeviceConnection.claimInterface(this.d, true);
    }
}

