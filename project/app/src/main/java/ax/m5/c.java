/*
 * Decompiled with CFR 0.152.
 */
package ax.m5;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import ax.m5.b;
import ax.m5.d;

public class c {
    private static a a = ax.m5.c$a.c0;

    public static b a(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
        if (a == ax.m5.c$a.c0) {
            return new ax.m5.a(usbDeviceConnection, usbEndpoint, usbEndpoint2);
        }
        return new d(usbDeviceConnection, usbEndpoint, usbEndpoint2);
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        private static final a[] d0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = ax.m5.c$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])d0.clone();
        }
    }
}

