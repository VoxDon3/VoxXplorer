package ax.vd;

/* renamed from: ax.vd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3305b {
    protected byte[] a;
    protected int b = 0;
    protected boolean c;
    protected InterfaceC3304a d;
    protected boolean e;
    protected boolean f;

    public C3305b(InterfaceC3304a interfaceC3304a) {
        this.d = interfaceC3304a;
        this.a = new byte[interfaceC3304a.d()];
        boolean z = false;
        String f = interfaceC3304a.f();
        int indexOf = f.indexOf(47) + 1;
        boolean z2 = indexOf > 0 && f.startsWith("PGP", indexOf);
        this.f = z2;
        if (z2 || (interfaceC3304a instanceof t)) {
            this.e = true;
            return;
        }
        if (indexOf > 0 && f.startsWith("OpenPGP", indexOf)) {
            z = true;
        }
        this.e = z;
    }

    public int a(byte[] bArr, int i) throws C3309f, IllegalStateException, C3314k {
        try {
            int i2 = this.b;
            if (i + i2 > bArr.length) {
                throw new C3317n("output buffer too short for doFinal()");
            }
            int i3 = 0;
            if (i2 != 0) {
                if (!this.e) {
                    throw new C3309f("data not block size aligned");
                }
                InterfaceC3304a interfaceC3304a = this.d;
                byte[] bArr2 = this.a;
                interfaceC3304a.h(bArr2, 0, bArr2, 0);
                int i4 = this.b;
                this.b = 0;
                System.arraycopy(this.a, 0, bArr, i, i4);
                i3 = i4;
            }
            f();
            return i3;
        } catch (Throwable th) {
            f();
            throw th;
        }
    }

    public int b() {
        return this.d.d();
    }

    public int c(int i) {
        int length;
        int i2;
        int i3 = i + this.b;
        if (!this.f) {
            length = this.a.length;
        } else {
            if (this.c) {
                i2 = (i3 % this.a.length) - (this.d.d() + 2);
                return i3 - i2;
            }
            length = this.a.length;
        }
        i2 = i3 % length;
        return i3 - i2;
    }

    public void d(boolean z, InterfaceC3307d interfaceC3307d) throws IllegalArgumentException {
        this.c = z;
        f();
        this.d.e(z, interfaceC3307d);
    }

    public int e(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws C3309f, IllegalStateException {
        int i4;
        if (i2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int b = b();
        int c = c(i2);
        if (c > 0 && c + i3 > bArr2.length) {
            throw new C3317n("output buffer too short");
        }
        byte[] bArr3 = this.a;
        int length = bArr3.length;
        int i5 = this.b;
        int i6 = length - i5;
        if (i2 > i6) {
            System.arraycopy(bArr, i, bArr3, i5, i6);
            i4 = this.d.h(this.a, 0, bArr2, i3);
            this.b = 0;
            i2 -= i6;
            i += i6;
            while (i2 > this.a.length) {
                i4 += this.d.h(bArr, i, bArr2, i3 + i4);
                i2 -= b;
                i += b;
            }
        } else {
            i4 = 0;
        }
        System.arraycopy(bArr, i, this.a, this.b, i2);
        int i7 = this.b + i2;
        this.b = i7;
        byte[] bArr4 = this.a;
        if (i7 != bArr4.length) {
            return i4;
        }
        int h = i4 + this.d.h(bArr4, 0, bArr2, i3 + i4);
        this.b = 0;
        return h;
    }

    public void f() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                this.b = 0;
                this.d.a();
                return;
            } else {
                bArr[i] = 0;
                i++;
            }
        }
    }
}
