package ax.pb;

import ax.ob.C2740b;
import ax.ob.C2741c;
import ax.ob.C2742d;
import ax.qb.C2896d;
import ax.qb.C2897e;

/* renamed from: ax.pb.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2817q {
    r a;
    int b;
    String c;
    boolean d = false;
    byte[] e = null;
    byte[] f = null;
    String g = null;
    int h = 1;
    C2897e i;

    public C2817q(r rVar, boolean z) {
        this.a = rVar;
        int i = this.b;
        this.b = 537395204 | i;
        if (z) {
            this.b = i | 1611169812;
        }
        this.c = C2740b.k();
        this.i = C2897e.a();
    }

    public String a() {
        return this.g;
    }

    public byte[] b() {
        return this.f;
    }

    public byte[] c(byte[] bArr, int i, int i2) throws C2794a0 {
        int i3 = this.h;
        if (i3 == 1) {
            C2740b c2740b = new C2740b(this.b, this.a.d(), this.c);
            byte[] p = c2740b.p();
            C2897e c2897e = this.i;
            if (C2897e.c0 >= 4) {
                c2897e.println(c2740b);
                C2897e c2897e2 = this.i;
                if (C2897e.c0 >= 6) {
                    C2896d.a(c2897e2, p, 0, p.length);
                }
            }
            this.h++;
            return p;
        }
        if (i3 != 2) {
            throw new C2794a0("Invalid state");
        }
        try {
            C2741c c2741c = new C2741c(bArr);
            C2897e c2897e3 = this.i;
            if (C2897e.c0 >= 4) {
                c2897e3.println(c2741c);
                C2897e c2897e4 = this.i;
                if (C2897e.c0 >= 6) {
                    C2896d.a(c2897e4, bArr, 0, bArr.length);
                }
            }
            this.e = c2741c.j();
            this.b &= c2741c.a();
            C2742d c2742d = new C2742d(c2741c, this.a.i(), this.a.d(), this.a.n(), this.c, this.b);
            byte[] C = c2742d.C();
            C2897e c2897e5 = this.i;
            if (C2897e.c0 >= 4) {
                c2897e5.println(c2742d);
                C2897e c2897e6 = this.i;
                if (C2897e.c0 >= 6) {
                    C2896d.a(c2897e6, C, 0, C.length);
                }
            }
            if ((this.b & 16) != 0) {
                this.f = c2742d.p();
            }
            this.d = true;
            this.h++;
            return C;
        } catch (Exception e) {
            throw new C2794a0(e.getMessage(), e);
        }
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        String sb;
        String sb2;
        String str = "NtlmContext[auth=" + this.a + ",ntlmsspFlags=0x" + C2896d.c(this.b, 8) + ",workstation=" + this.c + ",isEstablished=" + this.d + ",state=" + this.h + ",serverChallenge=";
        if (this.e == null) {
            sb = str + "null";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            byte[] bArr = this.e;
            sb3.append(C2896d.d(bArr, 0, bArr.length * 2));
            sb = sb3.toString();
        }
        String str2 = sb + ",signingKey=";
        if (this.f == null) {
            sb2 = str2 + "null";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            byte[] bArr2 = this.f;
            sb4.append(C2896d.d(bArr2, 0, bArr2.length * 2));
            sb2 = sb4.toString();
        }
        return sb2 + "]";
    }
}
