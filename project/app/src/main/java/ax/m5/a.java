/*
 * Decompiled with CFR 0.152.
 */
package ax.m5;

import android.annotation.TargetApi;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import ax.m5.b;
import java.io.IOException;
import java.nio.ByteBuffer;

@TargetApi(value=18)
class a
implements b {
    private UsbDeviceConnection a;
    private UsbEndpoint b;
    private UsbEndpoint c;

    a(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
        this.a = usbDeviceConnection;
        this.b = usbEndpoint;
        this.c = usbEndpoint2;
    }

    @Override
    public int a(ByteBuffer byteBuffer) throws IOException {
        int n8 = this.a.bulkTransfer(this.c, byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining(), 5000);
        if (n8 >= 0) {
            byteBuffer.position(byteBuffer.position() + n8);
            return n8;
        }
        throw new IOException("Could not read from device, result == -1");
    }

    @Override
    public int b(ByteBuffer byteBuffer) throws IOException {
        int n8 = this.a.bulkTransfer(this.b, byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining(), 5000);
        if (n8 != -1) {
            byteBuffer.position(byteBuffer.position() + n8);
            return n8;
        }
        throw new IOException("Could not write to device, result == -1");
    }
}

