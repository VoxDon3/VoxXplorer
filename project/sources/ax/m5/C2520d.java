package ax.m5;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbRequest;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ax.m5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2520d implements InterfaceC2518b {
    private UsbDeviceConnection a;
    private UsbRequest b;
    private UsbRequest c;
    private ByteBuffer d = ByteBuffer.allocate(131072);

    C2520d(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
        this.a = usbDeviceConnection;
        UsbRequest usbRequest = new UsbRequest();
        usbRequest.initialize(usbDeviceConnection, usbEndpoint);
        this.b = usbRequest;
        UsbRequest usbRequest2 = new UsbRequest();
        usbRequest2.initialize(usbDeviceConnection, usbEndpoint2);
        this.c = usbRequest2;
    }

    @Override // ax.m5.InterfaceC2518b
    public synchronized int a(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        this.d.clear();
        this.d.limit(remaining);
        if (!this.c.queue(this.d, remaining)) {
            throw new IOException("Error queueing request.");
        }
        UsbRequest requestWait = this.a.requestWait();
        if (requestWait != this.c) {
            throw new IOException("requestWait failed! Request: " + requestWait);
        }
        this.d.flip();
        byteBuffer.put(this.d);
        return this.d.limit();
    }

    @Override // ax.m5.InterfaceC2518b
    public synchronized int b(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        int position = byteBuffer.position();
        this.d.clear();
        this.d.put(byteBuffer);
        if (!this.b.queue(this.d, remaining)) {
            throw new IOException("Error queueing request.");
        }
        UsbRequest requestWait = this.a.requestWait();
        if (requestWait != this.b) {
            throw new IOException("requestWait failed! Request: " + requestWait);
        }
        byteBuffer.position(position + this.d.position());
        return this.d.position();
    }
}
