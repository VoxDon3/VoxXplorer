/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import android.net.Uri;
import ax.U0.b;
import ax.U0.h;
import ax.U0.k;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

public final class A
extends b {
    private final int e;
    private final byte[] f;
    private final DatagramPacket g;
    private Uri h;
    private DatagramSocket i;
    private MulticastSocket j;
    private InetAddress k;
    private boolean l;
    private int m;

    public A() {
        this(2000);
    }

    public A(int n8) {
        this(n8, 8000);
    }

    public A(int n8, int n9) {
        super(true);
        this.e = n9;
        byte[] byArray = new byte[n8];
        this.f = byArray;
        this.g = new DatagramPacket(byArray, 0, n8);
    }

    @Override
    public Uri b() {
        return this.h;
    }

    @Override
    public int c(byte[] byArray, int n8, int n9) throws a {
        int n10;
        block5: {
            if (n9 == 0) {
                return 0;
            }
            if (this.m == 0) {
                SocketTimeoutException socketTimeoutException2;
                block6: {
                    try {
                        ax.S0.a.e(this.i).receive(this.g);
                        this.m = n10 = this.g.getLength();
                        this.q(n10);
                        break block5;
                    }
                    catch (IOException iOException) {
                    }
                    catch (SocketTimeoutException socketTimeoutException2) {
                        break block6;
                    }
                    throw new a(iOException, 2001);
                }
                throw new a(socketTimeoutException2, 2002);
            }
        }
        int n11 = this.g.getLength();
        n10 = this.m;
        n9 = Math.min(n10, n9);
        System.arraycopy(this.f, n11 - n10, byArray, n8, n9);
        this.m -= n9;
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void close() {
        this.h = null;
        DatagramSocket datagramSocket = this.j;
        if (datagramSocket != null) {
            try {
                ((MulticastSocket)datagramSocket).leaveGroup(ax.S0.a.e(this.k));
            }
            catch (IOException iOException) {}
            this.j = null;
        }
        if ((datagramSocket = this.i) != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.m = 0;
        if (this.l) {
            this.l = false;
            this.r();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public long f(k k8) throws a {
        block4: {
            DatagramSocket datagramSocket;
            Object object;
            block3: {
                this.h = object = k8.a;
                object = ax.S0.a.e(object.getHost());
                int n8 = this.h.getPort();
                this.s(k8);
                try {
                    MulticastSocket multicastSocket;
                    this.k = InetAddress.getByName((String)object);
                    object = new InetSocketAddress(this.k, n8);
                    if (!this.k.isMulticastAddress()) break block3;
                    this.j = multicastSocket = new MulticastSocket((SocketAddress)object);
                    multicastSocket.joinGroup(this.k);
                    this.i = this.j;
                    break block4;
                }
                catch (IOException iOException) {
                    throw new a(iOException, 2001);
                }
                catch (SecurityException securityException) {
                    throw new a(securityException, 2006);
                }
            }
            this.i = datagramSocket = new DatagramSocket((SocketAddress)object);
        }
        this.i.setSoTimeout(this.e);
        this.l = true;
        this.t(k8);
        return -1L;
    }

    public static final class a
    extends h {
        public a(Throwable throwable, int n8) {
            super(throwable, n8);
        }
    }
}

