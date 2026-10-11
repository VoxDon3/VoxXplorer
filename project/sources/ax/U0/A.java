package ax.U0;

import android.net.Uri;
import ax.S0.C0968a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class A extends b {
    private final int e;
    private final byte[] f;
    private final DatagramPacket g;
    private Uri h;
    private DatagramSocket i;
    private MulticastSocket j;
    private InetAddress k;
    private boolean l;
    private int m;

    public static final class a extends h {
        public a(Throwable th, int i) {
            super(th, i);
        }
    }

    public A() {
        this(2000);
    }

    @Override // ax.U0.g
    public Uri b() {
        return this.h;
    }

    @Override // ax.P0.InterfaceC0902k
    public int c(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        if (this.m == 0) {
            try {
                ((DatagramSocket) C0968a.e(this.i)).receive(this.g);
                int length = this.g.getLength();
                this.m = length;
                q(length);
            } catch (SocketTimeoutException e) {
                throw new a(e, 2002);
            } catch (IOException e2) {
                throw new a(e2, 2001);
            }
        }
        int length2 = this.g.getLength();
        int i3 = this.m;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f, length2 - i3, bArr, i, min);
        this.m -= min;
        return min;
    }

    @Override // ax.U0.g
    public void close() {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C0968a.e(this.k));
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.m = 0;
        if (this.l) {
            this.l = false;
            r();
        }
    }

    @Override // ax.U0.g
    public long f(k kVar) throws a {
        Uri uri = kVar.a;
        this.h = uri;
        String str = (String) C0968a.e(uri.getHost());
        int port = this.h.getPort();
        s(kVar);
        try {
            this.k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                this.i = this.j;
            } else {
                this.i = new DatagramSocket(inetSocketAddress);
            }
            this.i.setSoTimeout(this.e);
            this.l = true;
            t(kVar);
            return -1L;
        } catch (IOException e) {
            throw new a(e, 2001);
        } catch (SecurityException e2) {
            throw new a(e2, 2006);
        }
    }

    public A(int i) {
        this(i, 8000);
    }

    public A(int i, int i2) {
        super(true);
        this.e = i2;
        byte[] bArr = new byte[i];
        this.f = bArr;
        this.g = new DatagramPacket(bArr, 0, i);
    }
}
