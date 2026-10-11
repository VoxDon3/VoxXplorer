package ax.q1;

import ax.P0.C0916z;
import ax.P0.InterfaceC0902k;
import ax.S0.d0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: ax.q1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2851k implements InterfaceC2858s {
    private final InterfaceC0902k b;
    private final long c;
    private long d;
    private int f;
    private int g;
    private byte[] e = new byte[65536];
    private final byte[] a = new byte[4096];

    static {
        C0916z.a("media3.extractor");
    }

    public C2851k(InterfaceC0902k interfaceC0902k, long j, long j2) {
        this.b = interfaceC0902k;
        this.d = j;
        this.c = j2;
    }

    private void q(int i) {
        if (i != -1) {
            this.d += i;
        }
    }

    private void r(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, d0.p(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int s(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        v(min);
        return min;
    }

    private int t(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int c = this.b.c(bArr, i + i3, i2 - i3);
        if (c != -1) {
            return i3 + c;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    private int u(int i) {
        int min = Math.min(this.g, i);
        v(min);
        return min;
    }

    private void v(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // ax.q1.InterfaceC2858s
    public int a(int i) throws IOException {
        int u = u(i);
        if (u == 0) {
            byte[] bArr = this.a;
            u = t(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        q(u);
        return u;
    }

    @Override // ax.q1.InterfaceC2858s, ax.P0.InterfaceC0902k
    public int c(byte[] bArr, int i, int i2) throws IOException {
        int s = s(bArr, i, i2);
        if (s == 0) {
            s = t(bArr, i, i2, 0, true);
        }
        q(s);
        return s;
    }

    @Override // ax.q1.InterfaceC2858s
    public boolean e(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int s = s(bArr, i, i2);
        while (s < i2 && s != -1) {
            s = t(bArr, i, i2, s, z);
        }
        q(s);
        return s != -1;
    }

    @Override // ax.q1.InterfaceC2858s
    public boolean g(int i, boolean z) throws IOException {
        int u = u(i);
        while (u < i && u != -1) {
            u = t(this.a, -u, Math.min(i, this.a.length + u), u, z);
        }
        q(u);
        return u != -1;
    }

    @Override // ax.q1.InterfaceC2858s
    public long getLength() {
        return this.c;
    }

    @Override // ax.q1.InterfaceC2858s
    public long getPosition() {
        return this.d;
    }

    @Override // ax.q1.InterfaceC2858s
    public boolean h(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!o(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // ax.q1.InterfaceC2858s
    public long i() {
        return this.d + this.f;
    }

    @Override // ax.q1.InterfaceC2858s
    public void j(int i) throws IOException {
        o(i, false);
    }

    @Override // ax.q1.InterfaceC2858s
    public int k(byte[] bArr, int i, int i2) throws IOException {
        C2851k c2851k;
        int min;
        r(i2);
        int i3 = this.g;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            c2851k = this;
            min = c2851k.t(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            c2851k.g += min;
        } else {
            c2851k = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(c2851k.e, c2851k.f, bArr, i, min);
        c2851k.f += min;
        return min;
    }

    @Override // ax.q1.InterfaceC2858s
    public void m() {
        this.f = 0;
    }

    @Override // ax.q1.InterfaceC2858s
    public void n(int i) throws IOException {
        g(i, false);
    }

    @Override // ax.q1.InterfaceC2858s
    public boolean o(int i, boolean z) throws IOException {
        r(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            int i3 = i;
            boolean z2 = z;
            i2 = t(this.e, this.f, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
            i = i3;
            z = z2;
        }
        this.f += i;
        return true;
    }

    @Override // ax.q1.InterfaceC2858s
    public void p(byte[] bArr, int i, int i2) throws IOException {
        h(bArr, i, i2, false);
    }

    @Override // ax.q1.InterfaceC2858s
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        e(bArr, i, i2, false);
    }
}
