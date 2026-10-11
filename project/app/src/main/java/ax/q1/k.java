/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.z;
import ax.S0.d0;
import ax.q1.s;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class k
implements s {
    private final byte[] a;
    private final ax.P0.k b;
    private final long c;
    private long d;
    private byte[] e;
    private int f;
    private int g;

    static {
        z.a("media3.extractor");
    }

    public k(ax.P0.k k8, long l8, long l9) {
        this.b = k8;
        this.d = l8;
        this.c = l9;
        this.e = new byte[65536];
        this.a = new byte[4096];
    }

    private void q(int n8) {
        if (n8 != -1) {
            this.d += (long)n8;
        }
    }

    private void r(int n8) {
        byte[] byArray = this.e;
        if ((n8 = this.f + n8) > byArray.length) {
            n8 = d0.p(byArray.length * 2, 65536 + n8, n8 + 524288);
            this.e = Arrays.copyOf(this.e, n8);
        }
    }

    private int s(byte[] byArray, int n8, int n9) {
        int n10 = this.g;
        if (n10 == 0) {
            return 0;
        }
        n9 = Math.min(n10, n9);
        System.arraycopy(this.e, 0, byArray, n8, n9);
        this.v(n9);
        return n9;
    }

    private int t(byte[] byArray, int n8, int n9, int n10, boolean bl) throws IOException {
        if (!Thread.interrupted()) {
            if ((n8 = this.b.c(byArray, n8 + n10, n9 - n10)) == -1) {
                if (n10 == 0 && bl) {
                    return -1;
                }
                throw new EOFException();
            }
            return n10 + n8;
        }
        throw new InterruptedIOException();
    }

    private int u(int n8) {
        n8 = Math.min(this.g, n8);
        this.v(n8);
        return n8;
    }

    private void v(int n8) {
        int n9;
        this.g = n9 = this.g - n8;
        this.f = 0;
        byte[] byArray = this.e;
        byte[] byArray2 = n9 < byArray.length - 524288 ? new byte[65536 + n9] : byArray;
        System.arraycopy(byArray, n8, byArray2, 0, n9);
        this.e = byArray2;
    }

    @Override
    public int a(int n8) throws IOException {
        int n9 = this.u(n8);
        if (n9 == 0) {
            byte[] byArray = this.a;
            n8 = this.t(byArray, 0, Math.min(n8, byArray.length), 0, true);
        } else {
            n8 = n9;
        }
        this.q(n8);
        return n8;
    }

    @Override
    public int c(byte[] byArray, int n8, int n9) throws IOException {
        int n10 = this.s(byArray, n8, n9);
        n8 = n10 == 0 ? this.t(byArray, n8, n9, 0, true) : n10;
        this.q(n8);
        return n8;
    }

    @Override
    public boolean e(byte[] byArray, int n8, int n9, boolean bl) throws IOException {
        int n10 = this.s(byArray, n8, n9);
        while (n10 < n9 && n10 != -1) {
            n10 = this.t(byArray, n8, n9, n10, bl);
        }
        this.q(n10);
        return n10 != -1;
    }

    @Override
    public boolean g(int n8, boolean bl) throws IOException {
        int n9 = this.u(n8);
        while (n9 < n8 && n9 != -1) {
            int n10 = Math.min(n8, this.a.length + n9);
            n9 = this.t(this.a, -n9, n10, n9, bl);
        }
        this.q(n9);
        return n9 != -1;
    }

    @Override
    public long getLength() {
        return this.c;
    }

    @Override
    public long getPosition() {
        return this.d;
    }

    @Override
    public boolean h(byte[] byArray, int n8, int n9, boolean bl) throws IOException {
        if (!this.o(n9, bl)) {
            return false;
        }
        System.arraycopy(this.e, this.f - n9, byArray, n8, n9);
        return true;
    }

    @Override
    public long i() {
        return this.d + (long)this.f;
    }

    @Override
    public void j(int n8) throws IOException {
        this.o(n8, false);
    }

    @Override
    public int k(byte[] byArray, int n8, int n9) throws IOException {
        this.r(n9);
        int n10 = this.g;
        int n11 = this.f;
        if ((n10 -= n11) == 0) {
            byte[] byArray2 = this.e;
            if ((n9 = this.t(byArray2, n11, n9, 0, true)) == -1) {
                return -1;
            }
            this.g += n9;
        } else {
            n9 = Math.min(n9, n10);
        }
        System.arraycopy(this.e, this.f, byArray, n8, n9);
        this.f += n9;
        return n9;
    }

    @Override
    public void m() {
        this.f = 0;
    }

    @Override
    public void n(int n8) throws IOException {
        this.g(n8, false);
    }

    @Override
    public boolean o(int n8, boolean bl) throws IOException {
        this.r(n8);
        int n9 = this.g - this.f;
        while (n9 < n8) {
            if ((n9 = this.t(this.e, this.f, n8, n9, bl)) == -1) {
                return false;
            }
            this.g = this.f + n9;
        }
        this.f += n8;
        return true;
    }

    @Override
    public void p(byte[] byArray, int n8, int n9) throws IOException {
        this.h(byArray, n8, n9, false);
    }

    @Override
    public void readFully(byte[] byArray, int n8, int n9) throws IOException {
        this.e(byArray, n8, n9, false);
    }
}

