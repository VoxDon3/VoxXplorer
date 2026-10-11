package ax.Ad;

import ax.Dd.k;
import ax.Dd.l;
import ax.Nd.h;
import ax.vd.C3309f;
import ax.vd.C3314k;
import ax.vd.C3317n;
import ax.vd.InterfaceC3304a;
import ax.vd.InterfaceC3307d;

/* loaded from: classes3.dex */
public class e implements a {
    private InterfaceC3304a a;
    private ax.Bd.c b;
    private ax.Bd.b c;
    private boolean d;
    private boolean e;
    private int f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;
    private byte[] q;
    private int r;
    private int s;
    private long t;
    private byte[] u;
    private int v;
    private long w;
    private long x;

    public e(InterfaceC3304a interfaceC3304a) {
        this(interfaceC3304a, null);
    }

    private void a() {
        if (this.e) {
            return;
        }
        if (!this.d) {
            throw new IllegalStateException("GCM cipher needs to be initialised");
        }
        throw new IllegalStateException("GCM cipher cannot be reused for encryption");
    }

    private void b(byte[] bArr, byte[] bArr2, int i) {
        for (int i2 = 0; i2 < i; i2 += 16) {
            k(bArr, bArr2, i2, Math.min(i - i2, 16));
        }
    }

    private void d(byte[] bArr, byte[] bArr2) {
        ax.Bd.d.p(bArr, bArr2);
        this.b.b(bArr);
    }

    private void f(byte[] bArr, byte[] bArr2, int i) {
        ax.Bd.d.q(bArr, bArr2, i);
        this.b.b(bArr);
    }

    private void k(byte[] bArr, byte[] bArr2, int i, int i2) {
        ax.Bd.d.r(bArr, bArr2, i, i2);
        this.b.b(bArr);
    }

    private void l(byte[] bArr) {
        int i = this.r;
        if (i == 0) {
            throw new IllegalStateException("Attempt to process too many blocks");
        }
        this.r = i - 1;
        byte[] bArr2 = this.q;
        int i2 = (bArr2[15] & 255) + 1;
        bArr2[15] = (byte) i2;
        int i3 = (i2 >>> 8) + (bArr2[14] & 255);
        bArr2[14] = (byte) i3;
        int i4 = (i3 >>> 8) + (bArr2[13] & 255);
        bArr2[13] = (byte) i4;
        bArr2[12] = (byte) ((i4 >>> 8) + (bArr2[12] & 255));
        this.a.h(bArr2, 0, bArr, 0);
    }

    private void m() {
        if (this.w > 0) {
            System.arraycopy(this.o, 0, this.p, 0, 16);
            this.x = this.w;
        }
        int i = this.v;
        if (i > 0) {
            k(this.p, this.u, 0, i);
            this.x += this.v;
        }
        if (this.x > 0) {
            System.arraycopy(this.p, 0, this.n, 0, 16);
        }
    }

    private void n(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length - i2 < 16) {
            throw new C3317n("Output buffer too short");
        }
        if (this.t == 0) {
            m();
        }
        byte[] bArr3 = new byte[16];
        l(bArr3);
        if (this.d) {
            ax.Bd.d.q(bArr3, bArr, i);
            d(this.n, bArr3);
            System.arraycopy(bArr3, 0, bArr2, i2, 16);
        } else {
            f(this.n, bArr, i);
            ax.Bd.d.o(bArr3, 0, bArr, i, bArr2, i2);
        }
        this.t += 16;
    }

    private void o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = new byte[16];
        l(bArr3);
        if (this.d) {
            ax.Bd.d.n(bArr, i, bArr3, 0, i2);
            k(this.n, bArr, i, i2);
        } else {
            k(this.n, bArr, i, i2);
            ax.Bd.d.n(bArr, i, bArr3, 0, i2);
        }
        System.arraycopy(bArr, i, bArr2, i3, i2);
        this.t += i2;
    }

    private void p(boolean z) {
        this.a.a();
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0L;
        this.x = 0L;
        this.q = ax.Nd.a.d(this.k);
        this.r = -2;
        this.s = 0;
        this.t = 0L;
        byte[] bArr = this.l;
        if (bArr != null) {
            ax.Nd.a.g(bArr, (byte) 0);
        }
        if (z) {
            this.m = null;
        }
        if (this.d) {
            this.e = false;
            return;
        }
        byte[] bArr2 = this.i;
        if (bArr2 != null) {
            j(bArr2, 0, bArr2.length);
        }
    }

    @Override // ax.Ad.b
    public int c(byte[] bArr, int i) throws IllegalStateException, C3314k {
        a();
        if (this.t == 0) {
            m();
        }
        int i2 = this.s;
        if (!this.d) {
            int i3 = this.f;
            if (i2 < i3) {
                throw new C3314k("data too short");
            }
            i2 -= i3;
            if (bArr.length - i < i2) {
                throw new C3317n("Output buffer too short");
            }
        } else if (bArr.length - i < this.f + i2) {
            throw new C3317n("Output buffer too short");
        }
        int i4 = i2;
        if (i4 > 0) {
            o(this.l, 0, i4, bArr, i);
        }
        long j = this.w;
        int i5 = this.v;
        long j2 = j + i5;
        this.w = j2;
        if (j2 > this.x) {
            if (i5 > 0) {
                k(this.o, this.u, 0, i5);
            }
            if (this.x > 0) {
                ax.Bd.d.p(this.o, this.p);
            }
            long j3 = ((this.t * 8) + 127) >>> 7;
            byte[] bArr2 = new byte[16];
            if (this.c == null) {
                ax.Bd.a aVar = new ax.Bd.a();
                this.c = aVar;
                aVar.a(this.j);
            }
            this.c.b(j3, bArr2);
            ax.Bd.d.i(this.o, bArr2);
            ax.Bd.d.p(this.n, this.o);
        }
        byte[] bArr3 = new byte[16];
        h.n(this.w * 8, bArr3, 0);
        h.n(this.t * 8, bArr3, 8);
        d(this.n, bArr3);
        byte[] bArr4 = new byte[16];
        this.a.h(this.k, 0, bArr4, 0);
        ax.Bd.d.p(bArr4, this.n);
        int i6 = this.f;
        byte[] bArr5 = new byte[i6];
        this.m = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, i6);
        if (this.d) {
            System.arraycopy(this.m, 0, bArr, i + this.s, this.f);
            i4 += this.f;
        } else {
            int i7 = this.f;
            byte[] bArr6 = new byte[i7];
            System.arraycopy(this.l, i4, bArr6, 0, i7);
            if (!ax.Nd.a.e(this.m, bArr6)) {
                throw new C3314k("mac check in GCM failed");
            }
        }
        p(false);
        return i4;
    }

    @Override // ax.Ad.b
    public void e(boolean z, InterfaceC3307d interfaceC3307d) throws IllegalArgumentException {
        byte[] a;
        k kVar;
        byte[] bArr;
        this.d = z;
        this.m = null;
        this.e = true;
        if (interfaceC3307d instanceof ax.Dd.a) {
            ax.Dd.a aVar = (ax.Dd.a) interfaceC3307d;
            a = aVar.d();
            this.i = aVar.a();
            int c = aVar.c();
            if (c < 32 || c > 128 || c % 8 != 0) {
                throw new IllegalArgumentException("Invalid value for MAC size: " + c);
            }
            this.f = c / 8;
            kVar = aVar.b();
        } else {
            if (!(interfaceC3307d instanceof l)) {
                throw new IllegalArgumentException("invalid parameters passed to GCM");
            }
            l lVar = (l) interfaceC3307d;
            a = lVar.a();
            this.i = null;
            this.f = 16;
            kVar = (k) lVar.b();
        }
        this.l = new byte[z ? 16 : this.f + 16];
        if (a == null || a.length < 1) {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (z && (bArr = this.h) != null && ax.Nd.a.b(bArr, a)) {
            if (kVar == null) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
            byte[] bArr2 = this.g;
            if (bArr2 != null && ax.Nd.a.b(bArr2, kVar.a())) {
                throw new IllegalArgumentException("cannot reuse nonce for GCM encryption");
            }
        }
        this.h = a;
        if (kVar != null) {
            this.g = kVar.a();
        }
        if (kVar != null) {
            this.a.e(true, kVar);
            byte[] bArr3 = new byte[16];
            this.j = bArr3;
            this.a.h(bArr3, 0, bArr3, 0);
            this.b.a(this.j);
            this.c = null;
        } else if (this.j == null) {
            throw new IllegalArgumentException("Key must be specified in initial init");
        }
        byte[] bArr4 = new byte[16];
        this.k = bArr4;
        byte[] bArr5 = this.h;
        if (bArr5.length == 12) {
            System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
            this.k[15] = 1;
        } else {
            b(bArr4, bArr5, bArr5.length);
            byte[] bArr6 = new byte[16];
            h.n(this.h.length * 8, bArr6, 8);
            d(this.k, bArr6);
        }
        this.n = new byte[16];
        this.o = new byte[16];
        this.p = new byte[16];
        this.u = new byte[16];
        this.v = 0;
        this.w = 0L;
        this.x = 0L;
        this.q = ax.Nd.a.d(this.k);
        this.r = -2;
        this.s = 0;
        this.t = 0L;
        byte[] bArr7 = this.i;
        if (bArr7 != null) {
            j(bArr7, 0, bArr7.length);
        }
    }

    @Override // ax.Ad.b
    public int g(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws C3309f {
        int i4;
        a();
        if (bArr.length - i < i2) {
            throw new C3309f("Input buffer too short");
        }
        if (!this.d) {
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte[] bArr3 = this.l;
                int i7 = this.s;
                bArr3[i7] = bArr[i + i6];
                int i8 = i7 + 1;
                this.s = i8;
                if (i8 == bArr3.length) {
                    n(bArr3, 0, bArr2, i3 + i5);
                    byte[] bArr4 = this.l;
                    System.arraycopy(bArr4, 16, bArr4, 0, this.f);
                    this.s = this.f;
                    i5 += 16;
                }
            }
            return i5;
        }
        if (this.s != 0) {
            while (i2 > 0) {
                i2--;
                byte[] bArr5 = this.l;
                int i9 = this.s;
                int i10 = i + 1;
                bArr5[i9] = bArr[i];
                int i11 = i9 + 1;
                this.s = i11;
                if (i11 == 16) {
                    n(bArr5, 0, bArr2, i3);
                    this.s = 0;
                    i = i10;
                    i4 = 16;
                    break;
                }
                i = i10;
            }
        }
        i4 = 0;
        while (i2 >= 16) {
            n(bArr, i, bArr2, i3 + i4);
            i += 16;
            i2 -= 16;
            i4 += 16;
        }
        if (i2 > 0) {
            System.arraycopy(bArr, i, this.l, 0, i2);
            this.s = i2;
        }
        return i4;
    }

    @Override // ax.Ad.b
    public int h(int i) {
        int i2 = i + this.s;
        if (!this.d) {
            int i3 = this.f;
            if (i2 < i3) {
                return 0;
            }
            i2 -= i3;
        }
        return i2 - (i2 % 16);
    }

    @Override // ax.Ad.b
    public int i(int i) {
        int i2 = i + this.s;
        if (this.d) {
            return i2 + this.f;
        }
        int i3 = this.f;
        if (i2 < i3) {
            return 0;
        }
        return i2 - i3;
    }

    @Override // ax.Ad.b
    public void j(byte[] bArr, int i, int i2) {
        a();
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.u;
            int i4 = this.v;
            bArr2[i4] = bArr[i + i3];
            int i5 = i4 + 1;
            this.v = i5;
            if (i5 == 16) {
                d(this.o, bArr2);
                this.v = 0;
                this.w += 16;
            }
        }
    }

    public e(InterfaceC3304a interfaceC3304a, ax.Bd.c cVar) {
        if (interfaceC3304a.d() != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        cVar = cVar == null ? new ax.Bd.e() : cVar;
        this.a = interfaceC3304a;
        this.b = cVar;
    }
}
