package ax.mb;

import ax.qb.C2894b;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* renamed from: ax.mb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2547a {
    int a;
    HashMap b;
    public byte[] c;
    public int d;
    public int e;
    public int f = 0;
    public C2547a g = this;

    /* renamed from: ax.mb.a$a, reason: collision with other inner class name */
    static class C0377a {
        int a;
        Object b;

        C0377a() {
        }
    }

    public C2547a(byte[] bArr, int i) {
        this.c = bArr;
        this.e = i;
        this.d = i;
    }

    private int m(Object obj) {
        if (this.b == null) {
            this.b = new HashMap();
            this.a = 1;
        }
        C0377a c0377a = (C0377a) this.b.get(obj);
        if (c0377a == null) {
            c0377a = new C0377a();
            int i = this.a;
            this.a = i + 1;
            c0377a.a = i;
            c0377a.b = obj;
            this.b.put(obj, c0377a);
        }
        return c0377a.a;
    }

    public void a(int i) {
        int i2 = this.e + i;
        this.e = i2;
        int i3 = this.d;
        int i4 = i2 - i3;
        C2547a c2547a = this.g;
        if (i4 > c2547a.f) {
            c2547a.f = i2 - i3;
        }
    }

    public int b(int i) {
        int i2 = i - 1;
        int i3 = this.e - this.d;
        int i4 = ((~i2) & (i3 + i2)) - i3;
        a(i4);
        return i4;
    }

    public int c() {
        b(4);
        int f = C2894b.f(this.c, this.e);
        a(4);
        return f;
    }

    public int d() {
        b(2);
        short d = C2894b.d(this.c, this.e);
        a(2);
        return d;
    }

    public int e() {
        int i = this.c[this.e] & 255;
        a(1);
        return i;
    }

    public String f() throws C2548b {
        String str;
        b(4);
        int i = this.e;
        int f = C2894b.f(this.c, i);
        int i2 = i + 12;
        if (f != 0) {
            int i3 = (f - 1) * 2;
            if (i3 < 0 || i3 > 65535) {
                throw new C2548b("invalid array conformance");
            }
            str = new String(this.c, i2, i3, "UTF-16LE");
            i2 += i3 + 2;
            a(i2 - this.e);
            return str;
        }
        str = null;
        a(i2 - this.e);
        return str;
    }

    public C2547a g(int i) {
        C2547a c2547a = new C2547a(this.c, this.d);
        c2547a.e = i;
        c2547a.g = this.g;
        return c2547a;
    }

    public void h(int i) {
        b(4);
        C2894b.n(i, this.c, this.e);
        a(4);
    }

    public void i(Object obj, int i) {
        if (obj == null) {
            h(0);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                h(m(obj));
                return;
            } else if (i != 3) {
                return;
            }
        }
        h(System.identityHashCode(obj));
    }

    public void j(int i) {
        b(2);
        C2894b.l((short) i, this.c, this.e);
        a(2);
    }

    public void k(int i) {
        this.c[this.e] = (byte) (i & 255);
        a(1);
    }

    public void l(String str) {
        b(4);
        int i = this.e;
        int length = str.length();
        int i2 = length + 1;
        C2894b.n(i2, this.c, i);
        C2894b.n(0, this.c, i + 4);
        C2894b.n(i2, this.c, i + 8);
        int i3 = i + 12;
        try {
            System.arraycopy(str.getBytes("UTF-16LE"), 0, this.c, i3, length * 2);
        } catch (UnsupportedEncodingException unused) {
        }
        int i4 = i3 + (length * 2);
        byte[] bArr = this.c;
        bArr[i4] = 0;
        bArr[i4 + 1] = 0;
        a((i4 + 2) - this.e);
    }

    public int n() {
        return this.e;
    }

    public int o() {
        return this.g.f;
    }

    public void p() {
        this.e = this.d;
        this.f = 0;
        this.g = this;
    }

    public void q(int i) {
        this.e = i;
    }

    public void r(int i) {
        this.g.f = i;
    }

    public String toString() {
        return "start=" + this.d + ",index=" + this.e + ",length=" + o();
    }
}
