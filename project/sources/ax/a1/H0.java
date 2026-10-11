package ax.a1;

import ax.Q0.o;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class H0 extends ax.Q0.q {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = ax.S0.d0.f;
    private int n;
    private long o;

    @Override // ax.Q0.q, ax.Q0.o
    public ByteBuffer b() {
        int i;
        if (super.c() && (i = this.n) > 0) {
            m(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.b();
    }

    @Override // ax.Q0.q, ax.Q0.o
    public boolean c() {
        return super.c() && this.n == 0;
    }

    @Override // ax.Q0.o
    public void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer m = m(length);
        int p = ax.S0.d0.p(length, 0, this.n);
        m.put(this.m, 0, p);
        int p2 = ax.S0.d0.p(length - p, 0, i2);
        byteBuffer.limit(byteBuffer.position() + p2);
        m.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - p2;
        int i4 = this.n - p;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, p, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        m.flip();
    }

    @Override // ax.Q0.q
    public o.a i(o.a aVar) throws o.b {
        if (!ax.S0.d0.L0(aVar.c)) {
            throw new o.b(aVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? o.a.e : aVar;
    }

    @Override // ax.Q0.q
    protected void j() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // ax.Q0.q
    protected void k() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // ax.Q0.q
    protected void l() {
        this.m = ax.S0.d0.f;
    }

    public long n() {
        return this.o;
    }

    public void o() {
        this.o = 0L;
    }

    public void p(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
