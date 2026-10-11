package ax.m5;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;

/* renamed from: ax.m5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2519c {
    private static a a = a.DEVICE_CONNECTION_SYNC;

    /* renamed from: ax.m5.c$a */
    public enum a {
        USB_REQUEST_ASYNC,
        DEVICE_CONNECTION_SYNC
    }

    public static InterfaceC2518b a(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
        return a == a.DEVICE_CONNECTION_SYNC ? new C2517a(usbDeviceConnection, usbEndpoint, usbEndpoint2) : new C2520d(usbDeviceConnection, usbEndpoint, usbEndpoint2);
    }
}
