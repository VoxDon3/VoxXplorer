package ax.m5;

import android.annotation.TargetApi;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import java.io.IOException;
import java.nio.ByteBuffer;

@TargetApi(18)
/* renamed from: ax.m5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2517a implements InterfaceC2518b {
    private UsbDeviceConnection a;
    private UsbEndpoint b;
    private UsbEndpoint c;

    C2517a(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
        this.a = usbDeviceConnection;
        this.b = usbEndpoint;
        this.c = usbEndpoint2;
    }

    @Override // ax.m5.InterfaceC2518b
    public int a(ByteBuffer byteBuffer) throws IOException {
        int bulkTransfer = this.a.bulkTransfer(this.c, byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining(), 5000);
        if (bulkTransfer < 0) {
            throw new IOException("Could not read from device, result == -1");
        }
        byteBuffer.position(byteBuffer.position() + bulkTransfer);
        return bulkTransfer;
    }

    @Override // ax.m5.InterfaceC2518b
    public int b(ByteBuffer byteBuffer) throws IOException {
        int bulkTransfer = this.a.bulkTransfer(this.b, byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining(), 5000);
        if (bulkTransfer == -1) {
            throw new IOException("Could not write to device, result == -1");
        }
        byteBuffer.position(byteBuffer.position() + bulkTransfer);
        return bulkTransfer;
    }
}
