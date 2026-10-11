/*
 * Decompiled with CFR 0.152.
 */
package ax.m5;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbRequest;
import ax.m5.b;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

class d
implements b {
    private UsbDeviceConnection a;
    private UsbRequest b;
    private UsbRequest c;
    private ByteBuffer d = ByteBuffer.allocate(131072);

    d(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
        this.a = usbDeviceConnection;
        UsbRequest usbRequest = new UsbRequest();
        usbRequest.initialize(usbDeviceConnection, usbEndpoint);
        this.b = usbRequest;
        usbEndpoint = new UsbRequest();
        usbEndpoint.initialize(usbDeviceConnection, usbEndpoint2);
        this.c = usbEndpoint;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int a(ByteBuffer object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                UsbRequest usbRequest;
                try {
                    int n8 = ((Buffer)object).remaining();
                    this.d.clear();
                    this.d.limit(n8);
                    if (!this.c.queue(this.d, n8)) {
                        object = new IOException("Error queueing request.");
                        throw object;
                    }
                    usbRequest = this.a.requestWait();
                    if (usbRequest == this.c) {
                        this.d.flip();
                        ((ByteBuffer)object).put(this.d);
                        return this.d.limit();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("requestWait failed! Request: ");
                ((StringBuilder)object).append(usbRequest);
                IOException iOException = new IOException(((StringBuilder)object).toString());
                throw iOException;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int b(ByteBuffer object) throws IOException {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                UsbRequest usbRequest;
                try {
                    int n8 = ((Buffer)object).remaining();
                    int n9 = ((Buffer)object).position();
                    this.d.clear();
                    this.d.put((ByteBuffer)object);
                    if (!this.b.queue(this.d, n8)) {
                        object = new IOException("Error queueing request.");
                        throw object;
                    }
                    usbRequest = this.a.requestWait();
                    if (usbRequest == this.b) {
                        ((ByteBuffer)object).position(n9 + this.d.position());
                        return this.d.position();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("requestWait failed! Request: ");
                stringBuilder.append(usbRequest);
                object = new IOException(stringBuilder.toString());
                throw object;
            }
            throw throwable2;
        }
    }
}

