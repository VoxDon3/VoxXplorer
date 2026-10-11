package ax.zd;

import ax.Dd.k;
import ax.Nd.h;
import ax.vd.InterfaceC3304a;
import ax.vd.InterfaceC3307d;
import ax.vd.InterfaceC3315l;

/* renamed from: ax.zd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3568b implements InterfaceC3315l {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private byte[] d;
    private int e;
    private InterfaceC3304a f;
    private int g;
    private byte[] h;
    private byte[] i;

    public C3568b(InterfaceC3304a interfaceC3304a) {
        this(interfaceC3304a, interfaceC3304a.d() * 8);
    }

    private byte[] f(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = (-i(bArr, bArr2)) & 255;
        int length = bArr.length - 3;
        byte b = bArr2[length];
        byte[] bArr3 = this.a;
        bArr2[length] = (byte) (b ^ (bArr3[1] & i));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((bArr3[2] & i) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    private static byte[] g(int i) {
        int i2 = i * 8;
        int i3 = 135;
        switch (i2) {
            case 64:
            case 320:
                i3 = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i3 = 45;
                break;
            case 224:
                i3 = 777;
                break;
            case 256:
                i3 = 1061;
                break;
            case 384:
                i3 = 4109;
                break;
            case 448:
                i3 = 2129;
                break;
            case 512:
                i3 = 293;
                break;
            case 768:
                i3 = 655377;
                break;
            case 1024:
                i3 = 524355;
                break;
            case 2048:
                i3 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + i2);
        }
        return h.e(i3);
    }

    private static int i(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int i2 = bArr[length] & 255;
            bArr2[length] = (byte) (i | (i2 << 1));
            i = (i2 >>> 7) & 1;
        }
    }

    @Override // ax.vd.InterfaceC3315l
    public int a() {
        return this.g;
    }

    @Override // ax.vd.InterfaceC3315l
    public void b(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int d = this.f.d();
        int i3 = this.e;
        int i4 = d - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, this.d, i3, i4);
            this.f.h(this.d, 0, this.c, 0);
            this.e = 0;
            i2 -= i4;
            i += i4;
            while (i2 > d) {
                this.f.h(bArr, i, this.c, 0);
                i2 -= d;
                i += d;
            }
        }
        System.arraycopy(bArr, i, this.d, this.e, i2);
        this.e += i2;
    }

    @Override // ax.vd.InterfaceC3315l
    public int c(byte[] bArr, int i) {
        byte[] bArr2;
        if (this.e == this.f.d()) {
            bArr2 = this.h;
        } else {
            new ax.Cd.b().a(this.d, this.e);
            bArr2 = this.i;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.c;
            if (i2 >= bArr3.length) {
                this.f.h(this.d, 0, bArr3, 0);
                System.arraycopy(this.c, 0, bArr, i, this.g);
                h();
                return this.g;
            }
            byte[] bArr4 = this.d;
            bArr4[i2] = (byte) (bArr4[i2] ^ bArr2[i2]);
            i2++;
        }
    }

    @Override // ax.vd.InterfaceC3315l
    public void d(byte b) {
        int i = this.e;
        byte[] bArr = this.d;
        if (i == bArr.length) {
            this.f.h(bArr, 0, this.c, 0);
            this.e = 0;
        }
        byte[] bArr2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // ax.vd.InterfaceC3315l
    public void e(InterfaceC3307d interfaceC3307d) {
        j(interfaceC3307d);
        this.f.e(true, interfaceC3307d);
        byte[] bArr = this.b;
        byte[] bArr2 = new byte[bArr.length];
        this.f.h(bArr, 0, bArr2, 0);
        byte[] f = f(bArr2);
        this.h = f;
        this.i = f(f);
        h();
    }

    public void h() {
        int i = 0;
        while (true) {
            byte[] bArr = this.d;
            if (i >= bArr.length) {
                this.e = 0;
                this.f.a();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    void j(InterfaceC3307d interfaceC3307d) {
        if (interfaceC3307d != null && !(interfaceC3307d instanceof k)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }

    public C3568b(InterfaceC3304a interfaceC3304a, int i) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        if (i > interfaceC3304a.d() * 8) {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (interfaceC3304a.d() * 8));
        }
        this.f = new ax.Ad.c(interfaceC3304a);
        this.g = i / 8;
        this.a = g(interfaceC3304a.d());
        this.c = new byte[interfaceC3304a.d()];
        this.d = new byte[interfaceC3304a.d()];
        this.b = new byte[interfaceC3304a.d()];
        this.e = 0;
    }
}
