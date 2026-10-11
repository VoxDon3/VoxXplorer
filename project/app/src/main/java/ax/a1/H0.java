/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import ax.Q0.o;
import ax.Q0.q;
import ax.S0.d0;
import java.nio.ByteBuffer;

public final class H0
extends q {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = d0.f;
    private int n;
    private long o;

    @Override
    public ByteBuffer b() {
        int n8;
        if (super.c() && (n8 = this.n) > 0) {
            this.m(n8).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override
    public boolean c() {
        return super.c() && this.n == 0;
    }

    @Override
    public void d(ByteBuffer byteBuffer) {
        int n8;
        int n9;
        int n10;
        int n11;
        block3: {
            block2: {
                n11 = byteBuffer.position();
                n10 = byteBuffer.limit();
                n9 = n10 - n11;
                if (n9 == 0) break block2;
                n8 = Math.min(n9, this.l);
                this.o += (long)(n8 / this.b.d);
                this.l -= n8;
                byteBuffer.position(n11 + n8);
                if (this.l <= 0) break block3;
            }
            return;
        }
        n8 = n9 - n8;
        n9 = this.n + n8 - this.m.length;
        ByteBuffer byteBuffer2 = this.m(n9);
        n11 = d0.p(n9, 0, this.n);
        byteBuffer2.put(this.m, 0, n11);
        n9 = d0.p(n9 - n11, 0, n8);
        byteBuffer.limit(byteBuffer.position() + n9);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(n10);
        this.n = n10 = this.n - n11;
        byte[] byArray = this.m;
        System.arraycopy(byArray, n11, byArray, 0, n10);
        byteBuffer.get(this.m, this.n, n8 -= n9);
        this.n += n8;
        byteBuffer2.flip();
    }

    @Override
    public o.a i(o.a a8) throws o.b {
        if (d0.L0(a8.c)) {
            this.k = true;
            o.a a9 = a8;
            if (this.i == 0) {
                a9 = this.j != 0 ? a8 : o.a.e;
            }
            return a9;
        }
        throw new o.b(a8);
    }

    @Override
    protected void j() {
        if (this.k) {
            this.k = false;
            int n8 = this.j;
            int n9 = this.b.d;
            this.m = new byte[n8 * n9];
            this.l = this.i * n9;
        }
        this.n = 0;
    }

    @Override
    protected void k() {
        if (this.k) {
            int n8 = this.n;
            if (n8 > 0) {
                this.o += (long)(n8 / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override
    protected void l() {
        this.m = d0.f;
    }

    public long n() {
        return this.o;
    }

    public void o() {
        this.o = 0L;
    }

    public void p(int n8, int n9) {
        this.i = n8;
        this.j = n9;
    }
}

