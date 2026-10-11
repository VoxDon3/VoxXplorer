/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.A0;
import ax.pb.K;
import ax.pb.L;
import ax.pb.Z;
import ax.pb.a0;
import ax.pb.b0;
import ax.pb.g0;
import ax.pb.k0;
import ax.pb.s;
import ax.pb.z0;
import ax.qb.e;
import ax.rb.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

public class d0
extends InputStream
implements j.InputStreamRetargetInterface,
AutoCloseable {
    private int c0;
    private int d0;
    private int e0;
    private byte[] f0 = new byte[1];
    b0 g0;
    private long q;

    public d0(b0 b02) throws a0, MalformedURLException, UnknownHostException {
        this(b02, 1);
    }

    d0(b0 z8, int n8) throws a0, MalformedURLException, UnknownHostException {
        int n9;
        this.g0 = z8;
        this.d0 = n8 & 0xFFFF;
        this.e0 = n9 = 0xFFFF & n8 >>> 16;
        if (z8.r0 != 16) {
            z8.Q(n8, n9, 128, 0);
            this.d0 &= 0xFFFFFFAF;
        } else {
            z8.g();
        }
        z8 = z8.o0.f.h;
        this.c0 = Math.min(((k0)z8).A0 - 70, ((k0)z8).w0.b - 70);
    }

    public d0(String string) throws a0, MalformedURLException, UnknownHostException {
        this(new b0(string));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int a(byte[] object, int n8, int n9) throws IOException {
        a0 a022;
        block10: {
            long l8;
            int n10;
            Object object2;
            if (n9 <= 0) {
                return 0;
            }
            long l9 = this.q;
            if (this.f0 == null) throw new IOException("Bad file descriptor");
            this.g0.Q(this.d0, this.e0, 128, 0);
            Object object3 = b0.D0;
            if (e.c0 >= 4) {
                object3 = b0.A0;
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("read: fid=");
                ((StringBuilder)object2).append(this.g0.q0);
                ((StringBuilder)object2).append(",off=");
                ((StringBuilder)object2).append(n8);
                ((StringBuilder)object2).append(",len=");
                ((StringBuilder)object2).append(n9);
                ((PrintStream)object3).println(((StringBuilder)object2).toString());
            }
            object = new L((byte[])object, n8);
            n8 = n9;
            if (this.g0.r0 == 16) {
                object.t0 = 0L;
                n8 = n9;
            }
            do {
                block9: {
                    if (n8 <= (n9 = this.c0)) {
                        n9 = n8;
                    }
                    object3 = b0.D0;
                    if (e.c0 >= 4) {
                        object2 = b0.A0;
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("read: len=");
                        ((StringBuilder)object3).append(n8);
                        ((StringBuilder)object3).append(",r=");
                        ((StringBuilder)object3).append(n9);
                        ((StringBuilder)object3).append(",fp=");
                        ((StringBuilder)object3).append(this.q);
                        ((PrintStream)object2).println(((StringBuilder)object3).toString());
                    }
                    try {
                        object3 = new K(this.g0.q0, this.q, n9, null);
                        object2 = this.g0;
                        if (((b0)object2).r0 != 16) break block9;
                        ((K)object3).K0 = 1024;
                        ((K)object3).I0 = 1024;
                        ((K)object3).J0 = 1024;
                    }
                    catch (a0 a022) {
                        break block10;
                    }
                }
                ((b0)object2).Y((s)object3, (s)object);
                n10 = object.I0;
                if (n10 <= 0) {
                    l8 = this.q;
                    if (l8 - l9 <= 0L) return -1;
                    l9 = l8 - l9;
                    return (int)l9;
                }
                this.q = l8 = this.q + (long)n10;
                object.G0 += n10;
                if ((n8 -= n10) <= 0) return (int)(l8 - l9);
            } while (n10 == n9);
            return (int)(l8 - l9);
        }
        if (this.g0.r0 != 16) throw this.b(a022);
        if (a022.c() != -1073741493) throw this.b(a022);
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int available() throws IOException {
        Z z8 = this.g0;
        if (z8.r0 != 16) {
            return 0;
        }
        try {
            g0 g02 = (g0)z8;
            z8.Q(32, g02.G0 & 0xFF0000, 128, 0);
            Z z9 = this.g0;
            z8 = new z0(z9.p0, z9.q0);
            z9 = new A0(g02);
            g02.Y((s)z8, (s)z9);
            int n8 = ((A0)z9).a1;
            if (n8 != 1) {
                if (n8 != 4) return ((A0)z9).b1;
            }
        }
        catch (a0 a02) {
            throw this.b(a02);
        }
        this.g0.s0 = false;
        return 0;
    }

    protected IOException b(a0 iOException) {
        Throwable throwable;
        Throwable throwable2 = throwable = ((a0)iOException).d();
        if (throwable instanceof d) {
            iOException = (d)throwable;
            throwable2 = ((d)iOException).a();
        }
        if (throwable2 instanceof InterruptedException) {
            iOException = new InterruptedIOException(throwable2.getMessage());
            iOException.initCause(throwable2);
        }
        return iOException;
    }

    @Override
    public void close() throws IOException {
        try {
            this.g0.d();
            this.f0 = null;
            return;
        }
        catch (a0 a02) {
            throw this.b(a02);
        }
    }

    @Override
    public int read() throws IOException {
        if (this.read(this.f0, 0, 1) == -1) {
            return -1;
        }
        return this.f0[0] & 0xFF;
    }

    @Override
    public int read(byte[] byArray) throws IOException {
        return this.read(byArray, 0, byArray.length);
    }

    @Override
    public int read(byte[] byArray, int n8, int n9) throws IOException {
        return this.a(byArray, n8, n9);
    }

    @Override
    public long skip(long l8) throws IOException {
        if (l8 > 0L) {
            this.q += l8;
            return l8;
        }
        return 0L;
    }

    @Override
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return java.io.DesugarInputStream.transferTo((InputStream)this, (OutputStream)outputStream);
    }
}

