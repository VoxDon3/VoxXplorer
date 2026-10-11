package ax.Dc;

import java.util.Date;
import java.util.zip.ZipException;

/* renamed from: ax.Dc.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0688x implements N {
    private static final W e0 = new W(10);
    private static final W f0 = new W(1);
    private static final W g0 = new W(24);
    private K c0;
    private K d0;
    private K q;

    public C0688x() {
        K k = K.c0;
        this.q = k;
        this.c0 = k;
        this.d0 = k;
    }

    private void k(byte[] bArr, int i, int i2) {
        if (i2 >= 26) {
            if (g0.equals(new W(bArr, i))) {
                this.q = new K(bArr, i + 2);
                this.c0 = new K(bArr, i + 10);
                this.d0 = new K(bArr, i + 18);
            }
        }
    }

    private void l() {
        K k = K.c0;
        this.q = k;
        this.c0 = k;
        this.d0 = k;
    }

    private static Date m(K k) {
        if (k == null || K.c0.equals(k)) {
            return null;
        }
        return new Date((k.d() - 116444736000000000L) / 10000);
    }

    public Date a() {
        return m(this.c0);
    }

    @Override // ax.Dc.N
    public W b() {
        return e0;
    }

    @Override // ax.Dc.N
    public W c() {
        return new W(32);
    }

    @Override // ax.Dc.N
    public void d(byte[] bArr, int i, int i2) throws ZipException {
        int i3 = i2 + i;
        int i4 = i + 4;
        while (i4 + 4 <= i3) {
            W w = new W(bArr, i4);
            int i5 = i4 + 2;
            if (w.equals(f0)) {
                k(bArr, i5, i3 - i5);
                return;
            }
            i4 = i5 + new W(bArr, i5).d() + 2;
        }
    }

    public Date e() {
        return m(this.d0);
    }

    public boolean equals(Object obj) {
        K k;
        K k2;
        if (!(obj instanceof C0688x)) {
            return false;
        }
        C0688x c0688x = (C0688x) obj;
        K k3 = this.q;
        K k4 = c0688x.q;
        if ((k3 == k4 || (k3 != null && k3.equals(k4))) && ((k = this.c0) == (k2 = c0688x.c0) || (k != null && k.equals(k2)))) {
            K k5 = this.d0;
            K k6 = c0688x.d0;
            if (k5 == k6) {
                return true;
            }
            if (k5 != null && k5.equals(k6)) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.Dc.N
    public byte[] f() {
        byte[] bArr = new byte[c().d()];
        System.arraycopy(f0.b(), 0, bArr, 4, 2);
        System.arraycopy(g0.b(), 0, bArr, 6, 2);
        System.arraycopy(this.q.a(), 0, bArr, 8, 8);
        System.arraycopy(this.c0.a(), 0, bArr, 16, 8);
        System.arraycopy(this.d0.a(), 0, bArr, 24, 8);
        return bArr;
    }

    public Date g() {
        return m(this.q);
    }

    @Override // ax.Dc.N
    public byte[] h() {
        return f();
    }

    public int hashCode() {
        K k = this.q;
        int hashCode = k != null ? (-123) ^ k.hashCode() : -123;
        K k2 = this.c0;
        if (k2 != null) {
            hashCode ^= Integer.rotateLeft(k2.hashCode(), 11);
        }
        K k3 = this.d0;
        return k3 != null ? Integer.rotateLeft(k3.hashCode(), 22) ^ hashCode : hashCode;
    }

    @Override // ax.Dc.N
    public W i() {
        return c();
    }

    @Override // ax.Dc.N
    public void j(byte[] bArr, int i, int i2) throws ZipException {
        l();
        d(bArr, i, i2);
    }

    public String toString() {
        return "0x000A Zip Extra Field: Modify:[" + g() + "]  Access:[" + a() + "]  Create:[" + e() + "] ";
    }
}
