/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.pb.D0;
import ax.pb.E0;
import ax.pb.V;
import ax.pb.W;
import ax.pb.X;
import ax.pb.Y;
import ax.pb.a0;
import ax.pb.b0;
import ax.pb.g0;
import ax.pb.k0;
import ax.pb.s;
import ax.pb.u;
import ax.qb.e;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.UnknownHostException;

public class e0
extends OutputStream
implements AutoCloseable {
    private boolean c0;
    private boolean d0;
    private int e0;
    private int f0;
    private int g0;
    private long h0;
    private byte[] i0;
    private W j0;
    private X k0;
    private V l0;
    private Y m0;
    private b0 q;

    public e0(b0 b02) throws a0, MalformedURLException, UnknownHostException {
        this(b02, false);
    }

    public e0(b0 b02, boolean bl) throws a0, MalformedURLException, UnknownHostException {
        int n8 = bl ? 22 : 82;
        this(b02, bl, n8);
    }

    e0(b0 z8, boolean bl, int n8) throws a0, MalformedURLException, UnknownHostException {
        block7: {
            this.i0 = new byte[1];
            this.q = z8;
            this.c0 = bl;
            this.e0 = n8;
            this.f0 = n8 >>> 16 & 0xFFFF;
            if (bl) {
                try {
                    this.h0 = ((b0)z8).L();
                    break block7;
                }
                catch (u u8) {
                }
                catch (a0 a02) {
                    this.h0 = 0L;
                    break block7;
                }
                throw u8;
            }
        }
        if (z8 instanceof g0 && ((b0)z8).p0.startsWith("\\pipe\\")) {
            ((b0)z8).p0 = ((b0)z8).p0.substring(5);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\pipe");
            stringBuilder.append(((b0)z8).p0);
            ((b0)z8).Y(new D0(stringBuilder.toString()), new E0());
        }
        ((b0)z8).Q(n8, this.f0 | 2, 128, 0);
        this.e0 &= 0xFFFFFFAF;
        z8 = ((b0)z8).o0.f.h;
        this.g0 = ((k0)z8).z0 - 70;
        this.d0 = bl = ((k0)z8).u(16);
        if (bl) {
            this.j0 = new W();
            this.k0 = new X();
        } else {
            this.l0 = new V();
            this.m0 = new Y();
        }
    }

    public static e0 a(b0 b02) throws a0, MalformedURLException, UnknownHostException {
        return new e0(b02, false, 50);
    }

    public static e0 b(b0 b02) throws a0, MalformedURLException, UnknownHostException {
        return new e0(b02, false, 82);
    }

    void c() throws IOException {
        if (!this.q.I()) {
            this.q.Q(this.e0, this.f0 | 2, 128, 0);
            if (this.c0) {
                this.h0 = this.q.L();
            }
        }
    }

    @Override
    public void close() throws IOException {
        this.q.d();
        this.i0 = null;
    }

    public int d() {
        return this.g0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void e(byte[] byArray, int n8, int n9, int n10) throws IOException {
        if (n9 <= 0) {
            return;
        }
        if (this.i0 == null) throw new IOException("Bad file descriptor");
        this.c();
        Object object = b0.D0;
        if (e.c0 >= 4) {
            e e8 = b0.A0;
            object = new StringBuilder();
            ((StringBuilder)object).append("write: fid=");
            ((StringBuilder)object).append(this.q.q0);
            ((StringBuilder)object).append(",off=");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(",len=");
            ((StringBuilder)object).append(n9);
            e8.println(((StringBuilder)object).toString());
        }
        while (true) {
            long l8;
            long l9;
            int n11;
            if (n9 <= (n11 = this.g0)) {
                n11 = n9;
            }
            if (this.d0) {
                object = this.j0;
                int n12 = this.q.q0;
                l9 = this.h0;
                ((W)object).H(n12, l9, n9 - n11, byArray, n8, n11);
                if ((n10 & 1) != 0) {
                    this.j0.H(this.q.q0, this.h0, n9, byArray, n8, n11);
                    this.j0.N0 = 8;
                } else {
                    this.j0.N0 = 0;
                }
                this.q.Y(this.j0, this.k0);
                l9 = this.h0;
                l8 = this.k0.F0;
                this.h0 = l9 + l8;
                n9 = (int)((long)n9 - l8);
                n11 = (int)((long)n8 + l8);
                n8 = n9;
                n9 = n11;
            } else {
                this.l0.E(this.q.q0, this.h0, n9 - n11, byArray, n8, n11);
                l9 = this.h0;
                object = this.m0;
                l8 = ((Y)object).C0;
                this.h0 = l9 + l8;
                n11 = (int)((long)n9 - l8);
                n9 = (int)((long)n8 + l8);
                this.q.Y(this.l0, (s)object);
                n8 = n11;
            }
            n11 = n8;
            if (n11 <= 0) {
                return;
            }
            n8 = n9;
            n9 = n11;
        }
    }

    public boolean isOpen() {
        return this.q.I();
    }

    @Override
    public void write(int n8) throws IOException {
        byte[] byArray = this.i0;
        byArray[0] = (byte)n8;
        this.write(byArray, 0, 1);
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.write(byArray, 0, byArray.length);
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        b0 b02;
        if (!this.q.I() && (b02 = this.q) instanceof g0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\\pipe");
            stringBuilder.append(this.q.p0);
            b02.Y(new D0(stringBuilder.toString()), new E0());
        }
        this.e(byArray, n8, n9, 0);
    }
}

