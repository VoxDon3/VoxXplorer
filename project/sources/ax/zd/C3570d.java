package ax.zd;

import ax.Dd.k;
import ax.Dd.l;
import ax.Nd.h;
import ax.vd.C3309f;
import ax.vd.C3317n;
import ax.vd.InterfaceC3304a;
import ax.vd.InterfaceC3307d;
import ax.vd.InterfaceC3315l;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: ax.zd.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3570d implements InterfaceC3315l {
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private final byte[] b = new byte[1];
    private final byte[] p = new byte[16];
    private int q = 0;
    private final InterfaceC3304a a = null;

    private static final long f(int i, int i2) {
        return (i & 4294967295L) * i2;
    }

    private void g() {
        int i = this.q;
        if (i < 16) {
            this.p[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.p[i2] = 0;
            }
        }
        long h = h.h(this.p, 0);
        long j = h & 4294967295L;
        long h2 = h.h(this.p, 4) & 4294967295L;
        long h3 = h.h(this.p, 8) & 4294967295L;
        long h4 = 4294967295L & h.h(this.p, 12);
        int i3 = (int) (this.r + (h & 67108863));
        this.r = i3;
        this.s = (int) (this.s + ((((h2 << 32) | j) >>> 26) & 67108863));
        this.t = (int) (this.t + (((h2 | (h3 << 32)) >>> 20) & 67108863));
        this.u = (int) (this.u + ((((h4 << 32) | h3) >>> 14) & 67108863));
        int i4 = (int) (this.v + (h4 >>> 8));
        this.v = i4;
        if (this.q == 16) {
            this.v = i4 + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        long f = f(i3, this.c) + f(this.s, this.k) + f(this.t, this.j) + f(this.u, this.i) + f(this.v, this.h);
        long f2 = f(this.r, this.d) + f(this.s, this.c) + f(this.t, this.k) + f(this.u, this.j) + f(this.v, this.i);
        long f3 = f(this.r, this.e) + f(this.s, this.d) + f(this.t, this.c) + f(this.u, this.k) + f(this.v, this.j);
        long f4 = f(this.r, this.f) + f(this.s, this.e) + f(this.t, this.d) + f(this.u, this.c) + f(this.v, this.k);
        long f5 = f(this.r, this.g) + f(this.s, this.f) + f(this.t, this.e) + f(this.u, this.d) + f(this.v, this.c);
        long j2 = f2 + (f >>> 26);
        long j3 = f3 + (j2 >>> 26);
        this.t = ((int) j3) & 67108863;
        long j4 = f4 + (j3 >>> 26);
        this.u = ((int) j4) & 67108863;
        long j5 = f5 + (j4 >>> 26);
        this.v = ((int) j5) & 67108863;
        int i5 = (((int) f) & 67108863) + (((int) (j5 >>> 26)) * 5);
        this.s = (((int) j2) & 67108863) + (i5 >>> 26);
        this.r = i5 & 67108863;
    }

    private void i(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i = 16;
        if (this.a != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int h = h.h(bArr, 0);
        int h2 = h.h(bArr, 4);
        int h3 = h.h(bArr, 8);
        int h4 = h.h(bArr, 12);
        this.c = 67108863 & h;
        int i2 = ((h >>> 26) | (h2 << 6)) & 67108611;
        this.d = i2;
        int i3 = ((h2 >>> 20) | (h3 << 12)) & 67092735;
        this.e = i3;
        int i4 = ((h3 >>> 14) | (h4 << 18)) & 66076671;
        this.f = i4;
        int i5 = (h4 >>> 8) & 1048575;
        this.g = i5;
        this.h = i2 * 5;
        this.i = i3 * 5;
        this.j = i4 * 5;
        this.k = i5 * 5;
        InterfaceC3304a interfaceC3304a = this.a;
        if (interfaceC3304a != null) {
            byte[] bArr3 = new byte[16];
            interfaceC3304a.e(true, new k(bArr, 16, 16));
            this.a.h(bArr2, 0, bArr3, 0);
            bArr = bArr3;
            i = 0;
        }
        this.l = h.h(bArr, i);
        this.m = h.h(bArr, i + 4);
        this.n = h.h(bArr, i + 8);
        this.o = h.h(bArr, i + 12);
    }

    @Override // ax.vd.InterfaceC3315l
    public int a() {
        return 16;
    }

    @Override // ax.vd.InterfaceC3315l
    public void b(byte[] bArr, int i, int i2) throws C3309f, IllegalStateException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.q == 16) {
                g();
                this.q = 0;
            }
            int min = Math.min(i2 - i3, 16 - this.q);
            System.arraycopy(bArr, i3 + i, this.p, this.q, min);
            i3 += min;
            this.q += min;
        }
    }

    @Override // ax.vd.InterfaceC3315l
    public int c(byte[] bArr, int i) throws C3309f, IllegalStateException {
        if (i + 16 > bArr.length) {
            throw new C3317n("Output buffer is too short.");
        }
        if (this.q > 0) {
            g();
        }
        int i2 = this.s;
        int i3 = this.r;
        int i4 = i2 + (i3 >>> 26);
        int i5 = this.t + (i4 >>> 26);
        int i6 = this.u + (i5 >>> 26);
        int i7 = i5 & 67108863;
        int i8 = this.v + (i6 >>> 26);
        int i9 = i6 & 67108863;
        int i10 = (i3 & 67108863) + ((i8 >>> 26) * 5);
        int i11 = i8 & 67108863;
        int i12 = (i4 & 67108863) + (i10 >>> 26);
        int i13 = i10 & 67108863;
        int i14 = i13 + 5;
        int i15 = (i14 >>> 26) + i12;
        int i16 = (i15 >>> 26) + i7;
        int i17 = (i16 >>> 26) + i9;
        int i18 = 67108863 & i17;
        int i19 = ((i17 >>> 26) + i11) - 67108864;
        int i20 = (i19 >>> 31) - 1;
        int i21 = ~i20;
        this.r = (i13 & i21) | (i14 & 67108863 & i20);
        this.s = (i12 & i21) | (i15 & 67108863 & i20);
        this.t = (i7 & i21) | (i16 & 67108863 & i20);
        this.u = (i18 & i20) | (i9 & i21);
        this.v = (i11 & i21) | (i19 & i20);
        long j = ((r1 | (r0 << 26)) & 4294967295L) + (this.l & 4294967295L);
        long j2 = (((r3 >>> 12) | (r2 << 14)) & 4294967295L) + (this.n & 4294967295L);
        h.f((int) j, bArr, i);
        long j3 = (((r0 >>> 6) | (r3 << 20)) & 4294967295L) + (this.m & 4294967295L) + (j >>> 32);
        h.f((int) j3, bArr, i + 4);
        long j4 = j2 + (j3 >>> 32);
        h.f((int) j4, bArr, i + 8);
        h.f((int) ((((r2 >>> 18) | (r4 << 8)) & 4294967295L) + (4294967295L & this.o) + (j4 >>> 32)), bArr, i + 12);
        h();
        return 16;
    }

    @Override // ax.vd.InterfaceC3315l
    public void d(byte b) throws IllegalStateException {
        byte[] bArr = this.b;
        bArr[0] = b;
        b(bArr, 0, 1);
    }

    @Override // ax.vd.InterfaceC3315l
    public void e(InterfaceC3307d interfaceC3307d) throws IllegalArgumentException {
        byte[] bArr;
        if (this.a == null) {
            bArr = null;
        } else {
            if (!(interfaceC3307d instanceof l)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            l lVar = (l) interfaceC3307d;
            bArr = lVar.a();
            interfaceC3307d = lVar.b();
        }
        if (!(interfaceC3307d instanceof k)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        i(((k) interfaceC3307d).a(), bArr);
        h();
    }

    public void h() {
        this.q = 0;
        this.v = 0;
        this.u = 0;
        this.t = 0;
        this.s = 0;
        this.r = 0;
    }
}
