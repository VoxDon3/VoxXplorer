package ax.xd;

import ax.Dd.k;
import ax.Dd.l;
import ax.Nd.h;
import ax.Nd.j;
import ax.vd.C3309f;
import ax.vd.C3316m;
import ax.vd.C3317n;
import ax.vd.InterfaceC3307d;
import ax.vd.t;

/* renamed from: ax.xd.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3493e implements t {
    private static final int[] j = h.k(j.e("expand 16-byte kexpand 32-byte k"), 0, 8);
    protected static final byte[] k = j.e("expand 32-byte k");
    protected static final byte[] l = j.e("expand 16-byte k");
    protected int a;
    private int b;
    protected int[] c;
    protected int[] d;
    private byte[] e;
    private boolean f;
    private int g;
    private int h;
    private int i;

    public C3493e() {
        this(20);
    }

    private boolean h(int i) {
        int i2 = this.g + i;
        this.g = i2;
        if (i2 < i && i2 >= 0) {
            int i3 = this.h + 1;
            this.h = i3;
            if (i3 == 0) {
                int i4 = this.i + 1;
                this.i = i4;
                if ((i4 & 32) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private void k() {
        this.g = 0;
        this.h = 0;
        this.i = 0;
    }

    public static void l(int i, int[] iArr, int[] iArr2) {
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (iArr2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (i % 2 != 0) {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = 7;
        int i10 = iArr[7];
        int i11 = iArr[8];
        int i12 = 9;
        int i13 = iArr[9];
        int i14 = iArr[10];
        int i15 = iArr[11];
        int i16 = iArr[12];
        int i17 = 13;
        int i18 = iArr[13];
        int i19 = iArr[14];
        int i20 = iArr[15];
        int i21 = i19;
        int i22 = i18;
        int i23 = i16;
        int i24 = i15;
        int i25 = i14;
        int i26 = i13;
        int i27 = i11;
        int i28 = i10;
        int i29 = i8;
        int i30 = i7;
        int i31 = i6;
        int i32 = i5;
        int i33 = i4;
        int i34 = i3;
        int i35 = i2;
        int i36 = i;
        while (i36 > 0) {
            int c = ax.Nd.d.c(i35 + i23, i9) ^ i31;
            int c2 = i27 ^ ax.Nd.d.c(c + i35, i12);
            int c3 = i23 ^ ax.Nd.d.c(c2 + c, i17);
            int c4 = i35 ^ ax.Nd.d.c(c3 + c2, 18);
            int c5 = i26 ^ ax.Nd.d.c(i30 + i34, i9);
            int c6 = i22 ^ ax.Nd.d.c(c5 + i30, i12);
            int c7 = ax.Nd.d.c(c6 + c5, i17) ^ i34;
            int c8 = ax.Nd.d.c(c7 + c6, 18) ^ i30;
            int c9 = i21 ^ ax.Nd.d.c(i25 + i29, 7);
            int c10 = i33 ^ ax.Nd.d.c(c9 + i25, 9);
            int c11 = i29 ^ ax.Nd.d.c(c10 + c9, 13);
            int c12 = i25 ^ ax.Nd.d.c(c11 + c10, 18);
            int c13 = i32 ^ ax.Nd.d.c(i20 + i24, 7);
            int c14 = i28 ^ ax.Nd.d.c(c13 + i20, 9);
            int c15 = i24 ^ ax.Nd.d.c(c14 + c13, 13);
            int c16 = i20 ^ ax.Nd.d.c(c15 + c14, 18);
            int c17 = c7 ^ ax.Nd.d.c(c4 + c13, 7);
            int c18 = ax.Nd.d.c(c17 + c4, 9) ^ c10;
            int c19 = c13 ^ ax.Nd.d.c(c18 + c17, 13);
            i35 = c4 ^ ax.Nd.d.c(c19 + c18, 18);
            int c20 = ax.Nd.d.c(c8 + c, 7) ^ c11;
            int c21 = ax.Nd.d.c(c20 + c8, 9) ^ c14;
            int c22 = c ^ ax.Nd.d.c(c21 + c20, 13);
            i30 = c8 ^ ax.Nd.d.c(c22 + c21, 18);
            i24 = c15 ^ ax.Nd.d.c(c12 + c5, 7);
            int c23 = ax.Nd.d.c(i24 + c12, 9) ^ c2;
            int c24 = ax.Nd.d.c(c23 + i24, 13) ^ c5;
            i25 = c12 ^ ax.Nd.d.c(c24 + c23, 18);
            i23 = c3 ^ ax.Nd.d.c(c16 + c9, 7);
            i22 = c6 ^ ax.Nd.d.c(i23 + c16, 9);
            i21 = c9 ^ ax.Nd.d.c(i22 + i23, 13);
            i20 = c16 ^ ax.Nd.d.c(i21 + i22, 18);
            i36 -= 2;
            i27 = c23;
            i34 = c17;
            i29 = c20;
            i31 = c22;
            i28 = c21;
            i26 = c24;
            i9 = 7;
            i33 = c18;
            i32 = c19;
            i12 = 9;
            i17 = 13;
        }
        iArr2[0] = i35 + iArr[0];
        iArr2[1] = i34 + iArr[1];
        iArr2[2] = i33 + iArr[2];
        iArr2[3] = i32 + iArr[3];
        iArr2[4] = i31 + iArr[4];
        iArr2[5] = i30 + iArr[5];
        iArr2[6] = i29 + iArr[6];
        iArr2[7] = i28 + iArr[7];
        iArr2[8] = i27 + iArr[8];
        iArr2[9] = i26 + iArr[9];
        iArr2[10] = i25 + iArr[10];
        iArr2[11] = i24 + iArr[11];
        iArr2[12] = i23 + iArr[12];
        iArr2[13] = i22 + iArr[13];
        iArr2[14] = i21 + iArr[14];
        iArr2[15] = i20 + iArr[15];
    }

    @Override // ax.vd.t
    public void a() {
        this.b = 0;
        k();
        j();
        c(this.e);
    }

    protected void b() {
        throw null;
    }

    protected void c(byte[] bArr) {
        throw null;
    }

    public String d() {
        throw null;
    }

    @Override // ax.vd.t
    public void e(boolean z, InterfaceC3307d interfaceC3307d) {
        if (!(interfaceC3307d instanceof l)) {
            throw new IllegalArgumentException(d() + " Init parameters must include an IV");
        }
        l lVar = (l) interfaceC3307d;
        byte[] a = lVar.a();
        if (a == null || a.length != f()) {
            throw new IllegalArgumentException(d() + " requires exactly " + f() + " bytes of IV");
        }
        InterfaceC3307d b = lVar.b();
        if (b == null) {
            if (!this.f) {
                throw new IllegalStateException(d() + " KeyParameter can not be null for first initialisation");
            }
            m(null, a);
        } else {
            if (!(b instanceof k)) {
                throw new IllegalArgumentException(d() + " Init parameters must contain a KeyParameter (or null for re-init)");
            }
            m(((k) b).a(), a);
        }
        a();
        this.f = true;
    }

    protected int f() {
        return 8;
    }

    @Override // ax.vd.t
    public int g(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (!this.f) {
            throw new IllegalStateException(d() + " not initialised");
        }
        if (i + i2 > bArr.length) {
            throw new C3309f("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new C3317n("output buffer too short");
        }
        if (h(i2)) {
            throw new C3316m("2^70 byte limit per IV would be exceeded; Change IV");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            byte[] bArr3 = this.e;
            int i5 = this.b;
            bArr2[i4 + i3] = (byte) (bArr3[i5] ^ bArr[i4 + i]);
            int i6 = (i5 + 1) & 63;
            this.b = i6;
            if (i6 == 0) {
                b();
                c(this.e);
            }
        }
        return i2;
    }

    protected void i(int i, int[] iArr, int i2) {
        int i3 = (i - 16) / 4;
        int[] iArr2 = j;
        iArr[i2] = iArr2[i3];
        iArr[i2 + 1] = iArr2[i3 + 1];
        iArr[i2 + 2] = iArr2[i3 + 2];
        iArr[i2 + 3] = iArr2[i3 + 3];
    }

    protected void j() {
        throw null;
    }

    protected void m(byte[] bArr, byte[] bArr2) {
        throw null;
    }

    public C3493e(int i) {
        this.b = 0;
        this.c = new int[16];
        this.d = new int[16];
        this.e = new byte[64];
        this.f = false;
        if (i <= 0 || (i & 1) != 0) {
            throw new IllegalArgumentException("'rounds' must be a positive, even number");
        }
        this.a = i;
    }
}
