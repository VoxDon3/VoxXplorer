package ax.Ad;

import ax.Dd.l;
import ax.vd.C3309f;
import ax.vd.C3314k;
import ax.vd.C3317n;
import ax.vd.InterfaceC3304a;
import ax.vd.InterfaceC3307d;
import ax.zd.C3567a;
import java.io.ByteArrayOutputStream;

/* loaded from: classes3.dex */
public class d implements ax.Ad.a {
    private InterfaceC3304a a;
    private int b;
    private boolean c;
    private byte[] d;
    private byte[] e;
    private int f;
    private InterfaceC3307d g;
    private byte[] h;
    private a i = new a();
    private a j = new a();

    private class a extends ByteArrayOutputStream {
        public a() {
        }

        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    public d(InterfaceC3304a interfaceC3304a) {
        this.a = interfaceC3304a;
        int d = interfaceC3304a.d();
        this.b = d;
        this.h = new byte[d];
        if (d != 16) {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
    }

    private int a(byte[] bArr, int i, int i2, byte[] bArr2) {
        C3567a c3567a = new C3567a(this.a, this.f * 8);
        c3567a.e(this.g);
        byte[] bArr3 = new byte[16];
        if (f()) {
            bArr3[0] = (byte) (bArr3[0] | 64);
        }
        int i3 = 2;
        byte a2 = (byte) (bArr3[0] | ((((c3567a.a() - 2) / 2) & 7) << 3));
        bArr3[0] = a2;
        byte[] bArr4 = this.d;
        bArr3[0] = (byte) (a2 | ((14 - bArr4.length) & 7));
        System.arraycopy(bArr4, 0, bArr3, 1, bArr4.length);
        int i4 = i2;
        int i5 = 1;
        while (i4 > 0) {
            bArr3[16 - i5] = (byte) (i4 & 255);
            i4 >>>= 8;
            i5++;
        }
        c3567a.b(bArr3, 0, 16);
        if (f()) {
            int b = b();
            if (b < 65280) {
                c3567a.d((byte) (b >> 8));
                c3567a.d((byte) b);
            } else {
                c3567a.d((byte) -1);
                c3567a.d((byte) -2);
                c3567a.d((byte) (b >> 24));
                c3567a.d((byte) (b >> 16));
                c3567a.d((byte) (b >> 8));
                c3567a.d((byte) b);
                i3 = 6;
            }
            byte[] bArr5 = this.e;
            if (bArr5 != null) {
                c3567a.b(bArr5, 0, bArr5.length);
            }
            if (this.i.size() > 0) {
                c3567a.b(this.i.a(), 0, this.i.size());
            }
            int i6 = (i3 + b) % 16;
            if (i6 != 0) {
                while (i6 != 16) {
                    c3567a.d((byte) 0);
                    i6++;
                }
            }
        }
        c3567a.b(bArr, i, i2);
        return c3567a.c(bArr2, 0);
    }

    private int b() {
        int size = this.i.size();
        byte[] bArr = this.e;
        return size + (bArr == null ? 0 : bArr.length);
    }

    private int d(boolean z, int i) {
        if (!z || (i >= 32 && i <= 128 && (i & 15) == 0)) {
            return i >>> 3;
        }
        throw new IllegalArgumentException("tag length in octets must be one of {4,6,8,10,12,14,16}");
    }

    private boolean f() {
        return b() > 0;
    }

    @Override // ax.Ad.b
    public int c(byte[] bArr, int i) throws IllegalStateException, C3314k {
        int k = k(this.j.a(), 0, this.j.size(), bArr, i);
        l();
        return k;
    }

    @Override // ax.Ad.b
    public void e(boolean z, InterfaceC3307d interfaceC3307d) throws IllegalArgumentException {
        InterfaceC3307d b;
        this.c = z;
        if (interfaceC3307d instanceof ax.Dd.a) {
            ax.Dd.a aVar = (ax.Dd.a) interfaceC3307d;
            this.d = aVar.d();
            this.e = aVar.a();
            this.f = d(z, aVar.c());
            b = aVar.b();
        } else {
            if (!(interfaceC3307d instanceof l)) {
                throw new IllegalArgumentException("invalid parameters passed to CCM: " + interfaceC3307d.getClass().getName());
            }
            l lVar = (l) interfaceC3307d;
            this.d = lVar.a();
            this.e = null;
            this.f = d(z, 64);
            b = lVar.b();
        }
        if (b != null) {
            this.g = b;
        }
        byte[] bArr = this.d;
        if (bArr == null || bArr.length < 7 || bArr.length > 13) {
            throw new IllegalArgumentException("nonce must have length from 7 to 13 octets");
        }
        l();
    }

    @Override // ax.Ad.b
    public int g(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws C3309f, IllegalStateException {
        if (bArr.length < i + i2) {
            throw new C3309f("Input buffer too short");
        }
        this.j.write(bArr, i, i2);
        return 0;
    }

    @Override // ax.Ad.b
    public int h(int i) {
        return 0;
    }

    @Override // ax.Ad.b
    public int i(int i) {
        int size = i + this.j.size();
        if (this.c) {
            return size + this.f;
        }
        int i2 = this.f;
        if (size < i2) {
            return 0;
        }
        return size - i2;
    }

    @Override // ax.Ad.b
    public void j(byte[] bArr, int i, int i2) {
        this.i.write(bArr, i, i2);
    }

    public int k(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalStateException, C3314k, C3309f {
        int i4;
        if (this.g == null) {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        byte[] bArr3 = this.d;
        int length = bArr3.length;
        int i5 = 15 - length;
        if (i5 < 4 && i2 >= (1 << (i5 * 8))) {
            throw new IllegalStateException("CCM packet too large for choice of q.");
        }
        byte[] bArr4 = new byte[this.b];
        bArr4[0] = (byte) ((14 - length) & 7);
        System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
        f fVar = new f(this.a);
        fVar.e(this.c, new l(this.g, bArr4));
        if (!this.c) {
            int i6 = this.f;
            if (i2 < i6) {
                throw new C3314k("data too short");
            }
            int i7 = i2 - i6;
            if (bArr2.length < i7 + i3) {
                throw new C3317n("Output buffer too short.");
            }
            int i8 = i + i7;
            System.arraycopy(bArr, i8, this.h, 0, i6);
            byte[] bArr5 = this.h;
            fVar.h(bArr5, 0, bArr5, 0);
            int i9 = this.f;
            while (true) {
                byte[] bArr6 = this.h;
                if (i9 == bArr6.length) {
                    break;
                }
                bArr6[i9] = 0;
                i9++;
            }
            int i10 = i;
            int i11 = i3;
            while (true) {
                i4 = this.b;
                if (i10 >= i8 - i4) {
                    break;
                }
                fVar.h(bArr, i10, bArr2, i11);
                int i12 = this.b;
                i11 += i12;
                i10 += i12;
            }
            byte[] bArr7 = new byte[i4];
            int i13 = i7 - (i10 - i);
            System.arraycopy(bArr, i10, bArr7, 0, i13);
            fVar.h(bArr7, 0, bArr7, 0);
            System.arraycopy(bArr7, 0, bArr2, i11, i13);
            byte[] bArr8 = new byte[this.b];
            a(bArr2, i3, i7, bArr8);
            if (ax.Nd.a.e(this.h, bArr8)) {
                return i7;
            }
            throw new C3314k("mac check in CCM failed");
        }
        int i14 = this.f + i2;
        if (bArr2.length < i14 + i3) {
            throw new C3317n("Output buffer too short.");
        }
        a(bArr, i, i2, this.h);
        byte[] bArr9 = new byte[this.b];
        fVar.h(this.h, 0, bArr9, 0);
        int i15 = i;
        int i16 = i3;
        while (true) {
            int i17 = i + i2;
            int i18 = this.b;
            if (i15 >= i17 - i18) {
                byte[] bArr10 = new byte[i18];
                int i19 = i17 - i15;
                System.arraycopy(bArr, i15, bArr10, 0, i19);
                fVar.h(bArr10, 0, bArr10, 0);
                System.arraycopy(bArr10, 0, bArr2, i16, i19);
                System.arraycopy(bArr9, 0, bArr2, i3 + i2, this.f);
                return i14;
            }
            fVar.h(bArr, i15, bArr2, i16);
            int i20 = this.b;
            i16 += i20;
            i15 += i20;
        }
    }

    public void l() {
        this.a.a();
        this.i.reset();
        this.j.reset();
    }
}
