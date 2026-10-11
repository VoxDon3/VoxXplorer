package ax.wd;

/* renamed from: ax.wd.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3390g extends AbstractC3385b {
    static final int[] n = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int[] l;
    private int m;

    public C3390g() {
        this.l = new int[64];
        a();
    }

    private static int p(int i, int i2, int i3) {
        return ((~i) & i3) ^ (i2 & i);
    }

    private static int q(int i, int i2, int i3) {
        return ((i ^ i2) & i3) | (i & i2);
    }

    private static int r(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private static int s(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    private static int t(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    private static int u(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    private void v(C3390g c3390g) {
        super.k(c3390g);
        this.d = c3390g.d;
        this.e = c3390g.e;
        this.f = c3390g.f;
        this.g = c3390g.g;
        this.h = c3390g.h;
        this.i = c3390g.i;
        this.j = c3390g.j;
        this.k = c3390g.k;
        int[] iArr = c3390g.l;
        System.arraycopy(iArr, 0, this.l, 0, iArr.length);
        this.m = c3390g.m;
    }

    @Override // ax.wd.AbstractC3385b, ax.vd.InterfaceC3312i
    public void a() {
        super.a();
        this.d = 1779033703;
        this.e = -1150833019;
        this.f = 1013904242;
        this.g = -1521486534;
        this.h = 1359893119;
        this.i = -1694144372;
        this.j = 528734635;
        this.k = 1541459225;
        this.m = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.l;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    @Override // ax.vd.InterfaceC3312i
    public int c(byte[] bArr, int i) {
        l();
        ax.Nd.h.d(this.d, bArr, i);
        ax.Nd.h.d(this.e, bArr, i + 4);
        ax.Nd.h.d(this.f, bArr, i + 8);
        ax.Nd.h.d(this.g, bArr, i + 12);
        ax.Nd.h.d(this.h, bArr, i + 16);
        ax.Nd.h.d(this.i, bArr, i + 20);
        ax.Nd.h.d(this.j, bArr, i + 24);
        ax.Nd.h.d(this.k, bArr, i + 28);
        a();
        return 32;
    }

    @Override // ax.vd.InterfaceC3312i
    public String f() {
        return "SHA-256";
    }

    @Override // ax.Nd.f
    public ax.Nd.f g() {
        return new C3390g(this);
    }

    @Override // ax.vd.InterfaceC3312i
    public int i() {
        return 32;
    }

    @Override // ax.Nd.f
    public void j(ax.Nd.f fVar) {
        v((C3390g) fVar);
    }

    @Override // ax.wd.AbstractC3385b
    protected void m() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.l;
            int u = u(iArr[i - 2]);
            int[] iArr2 = this.l;
            iArr[i] = u + iArr2[i - 7] + t(iArr2[i - 15]) + this.l[i - 16];
        }
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        int i5 = this.g;
        int i6 = this.h;
        int i7 = this.i;
        int i8 = this.j;
        int i9 = this.k;
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            int s = s(i6) + p(i6, i7, i8);
            int[] iArr3 = n;
            int i12 = i9 + s + iArr3[i10] + this.l[i10];
            int i13 = i5 + i12;
            int r = i12 + r(i2) + q(i2, i3, i4);
            int i14 = i10 + 1;
            int s2 = i8 + s(i13) + p(i13, i6, i7) + iArr3[i14] + this.l[i14];
            int i15 = i4 + s2;
            int r2 = s2 + r(r) + q(r, i2, i3);
            int i16 = i10 + 2;
            int s3 = i7 + s(i15) + p(i15, i13, i6) + iArr3[i16] + this.l[i16];
            int i17 = i3 + s3;
            int r3 = s3 + r(r2) + q(r2, r, i2);
            int i18 = i10 + 3;
            int s4 = i6 + s(i17) + p(i17, i15, i13) + iArr3[i18] + this.l[i18];
            int i19 = i2 + s4;
            int r4 = s4 + r(r3) + q(r3, r2, r);
            int i20 = i10 + 4;
            int s5 = i13 + s(i19) + p(i19, i17, i15) + iArr3[i20] + this.l[i20];
            i9 = r + s5;
            i5 = s5 + r(r4) + q(r4, r3, r2);
            int i21 = i10 + 5;
            int s6 = i15 + s(i9) + p(i9, i19, i17) + iArr3[i21] + this.l[i21];
            i8 = r2 + s6;
            i4 = s6 + r(i5) + q(i5, r4, r3);
            int i22 = i10 + 6;
            int s7 = i17 + s(i8) + p(i8, i9, i19) + iArr3[i22] + this.l[i22];
            i7 = r3 + s7;
            i3 = s7 + r(i4) + q(i4, i5, r4);
            int i23 = i10 + 7;
            int s8 = i19 + s(i7) + p(i7, i8, i9) + iArr3[i23] + this.l[i23];
            i6 = r4 + s8;
            i2 = s8 + r(i3) + q(i3, i4, i5);
            i10 += 8;
        }
        this.d += i2;
        this.e += i3;
        this.f += i4;
        this.g += i5;
        this.h += i6;
        this.i += i7;
        this.j += i8;
        this.k += i9;
        this.m = 0;
        for (int i24 = 0; i24 < 16; i24++) {
            this.l[i24] = 0;
        }
    }

    @Override // ax.wd.AbstractC3385b
    protected void n(long j) {
        if (this.m > 14) {
            m();
        }
        int[] iArr = this.l;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // ax.wd.AbstractC3385b
    protected void o(byte[] bArr, int i) {
        int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        int[] iArr = this.l;
        int i3 = this.m;
        iArr[i3] = i2;
        int i4 = i3 + 1;
        this.m = i4;
        if (i4 == 16) {
            m();
        }
    }

    public C3390g(C3390g c3390g) {
        super(c3390g);
        this.l = new int[64];
        v(c3390g);
    }
}
