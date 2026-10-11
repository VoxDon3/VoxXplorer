package ax.zd;

import ax.vd.InterfaceC3304a;
import ax.vd.InterfaceC3307d;
import ax.vd.InterfaceC3315l;

/* renamed from: ax.zd.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3567a implements InterfaceC3315l {
    private byte[] a;
    private byte[] b;
    private int c;
    private InterfaceC3304a d;
    private ax.Cd.a e;
    private int f;

    public C3567a(InterfaceC3304a interfaceC3304a, int i) {
        this(interfaceC3304a, i, null);
    }

    @Override // ax.vd.InterfaceC3315l
    public int a() {
        return this.f;
    }

    @Override // ax.vd.InterfaceC3315l
    public void b(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int d = this.d.d();
        int i3 = this.c;
        int i4 = d - i3;
        if (i2 > i4) {
            System.arraycopy(bArr, i, this.b, i3, i4);
            this.d.h(this.b, 0, this.a, 0);
            this.c = 0;
            i2 -= i4;
            i += i4;
            while (i2 > d) {
                this.d.h(bArr, i, this.a, 0);
                i2 -= d;
                i += d;
            }
        }
        System.arraycopy(bArr, i, this.b, this.c, i2);
        this.c += i2;
    }

    @Override // ax.vd.InterfaceC3315l
    public int c(byte[] bArr, int i) {
        int d = this.d.d();
        if (this.e == null) {
            while (true) {
                int i2 = this.c;
                if (i2 >= d) {
                    break;
                }
                this.b[i2] = 0;
                this.c = i2 + 1;
            }
        } else {
            if (this.c == d) {
                this.d.h(this.b, 0, this.a, 0);
                this.c = 0;
            }
            this.e.a(this.b, this.c);
        }
        this.d.h(this.b, 0, this.a, 0);
        System.arraycopy(this.a, 0, bArr, i, this.f);
        f();
        return this.f;
    }

    @Override // ax.vd.InterfaceC3315l
    public void d(byte b) {
        int i = this.c;
        byte[] bArr = this.b;
        if (i == bArr.length) {
            this.d.h(bArr, 0, this.a, 0);
            this.c = 0;
        }
        byte[] bArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // ax.vd.InterfaceC3315l
    public void e(InterfaceC3307d interfaceC3307d) {
        f();
        this.d.e(true, interfaceC3307d);
    }

    public void f() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i >= bArr.length) {
                this.c = 0;
                this.d.a();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }

    public C3567a(InterfaceC3304a interfaceC3304a, int i, ax.Cd.a aVar) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.d = new ax.Ad.c(interfaceC3304a);
        this.e = aVar;
        this.f = i / 8;
        this.a = new byte[interfaceC3304a.d()];
        this.b = new byte[interfaceC3304a.d()];
        this.c = 0;
    }
}
