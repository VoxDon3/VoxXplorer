/*
 * Decompiled with CFR 0.152.
 */
package ax.mb;

import ax.mb.b;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class a {
    int a;
    HashMap b;
    public byte[] c;
    public int d;
    public int e;
    public int f;
    public a g;

    public a(byte[] byArray, int n8) {
        this.c = byArray;
        this.e = n8;
        this.d = n8;
        this.f = 0;
        this.g = this;
    }

    private int m(Object object) {
        a a8;
        if (this.b == null) {
            this.b = new HashMap();
            this.a = 1;
        }
        a a9 = a8 = (a)this.b.get(object);
        if (a8 == null) {
            a9 = new a();
            int n8 = this.a;
            this.a = n8 + 1;
            a9.a = n8;
            a9.b = object;
            this.b.put(object, a9);
        }
        return a9.a;
    }

    public void a(int n8) {
        int n9;
        this.e = n9 = this.e + n8;
        n8 = this.d;
        a a8 = this.g;
        if (n9 - n8 > a8.f) {
            a8.f = n9 - n8;
        }
    }

    public int b(int n8) {
        int n9 = n8 - 1;
        n8 = this.e - this.d;
        n8 = (~n9 & n8 + n9) - n8;
        this.a(n8);
        return n8;
    }

    public int c() {
        this.b(4);
        int n8 = ax.qb.b.f(this.c, this.e);
        this.a(4);
        return n8;
    }

    public int d() {
        this.b(2);
        short s8 = ax.qb.b.d(this.c, this.e);
        this.a(2);
        return s8;
    }

    public int e() {
        byte by = this.c[this.e];
        this.a(1);
        return by & 0xFF;
    }

    /*
     * Unable to fully structure code
     */
    public String f() throws b {
        block4: {
            block5: {
                this.b(4);
                var1_1 = this.e;
                var2_2 = ax.qb.b.f(this.c, var1_1);
                var1_1 += 12;
                if (var2_2 == 0) break block4;
                if ((var2_2 = (var2_2 - 1) * 2) < 0 || var2_2 > 65535) break block5;
                var3_3 = new String(this.c, var1_1, var2_2, "UTF-16LE");
                var1_1 += var2_2 + 2;
                ** GOTO lbl21
            }
            try {
                var3_4 = new b("invalid array conformance");
                throw var3_4;
            }
            catch (UnsupportedEncodingException var3_5) {
                ** continue;
            }
        }
        while (true) {
            var3_3 = null;
lbl21:
            // 2 sources

            this.a(var1_1 - this.e);
            return var3_3;
        }
    }

    public a g(int n8) {
        a a8 = new a(this.c, this.d);
        a8.e = n8;
        a8.g = this.g;
        return a8;
    }

    public void h(int n8) {
        this.b(4);
        ax.qb.b.n(n8, this.c, this.e);
        this.a(4);
    }

    public void i(Object object, int n8) {
        if (object == null) {
            this.h(0);
            return;
        }
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return;
                }
            } else {
                this.h(this.m(object));
                return;
            }
        }
        this.h(System.identityHashCode(object));
    }

    public void j(int n8) {
        this.b(2);
        ax.qb.b.l((short)n8, this.c, this.e);
        this.a(2);
    }

    public void k(int n8) {
        this.c[this.e] = (byte)(n8 & 0xFF);
        this.a(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(String object) {
        this.b(4);
        int n8 = this.e;
        int n9 = ((String)object).length();
        int n10 = n9 + 1;
        ax.qb.b.n(n10, this.c, n8);
        ax.qb.b.n(0, this.c, n8 + 4);
        ax.qb.b.n(n10, this.c, n8 + 8);
        n8 += 12;
        try {
            System.arraycopy(((String)object).getBytes("UTF-16LE"), 0, this.c, n8, n9 * 2);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {}
        n9 = n8 + n9 * 2;
        object = this.c;
        object[n9] = false;
        object[n9 + 1] = false;
        this.a(n9 + 2 - this.e);
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

    public void q(int n8) {
        this.e = n8;
    }

    public void r(int n8) {
        this.g.f = n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("start=");
        stringBuilder.append(this.d);
        stringBuilder.append(",index=");
        stringBuilder.append(this.e);
        stringBuilder.append(",length=");
        stringBuilder.append(this.o());
        return stringBuilder.toString();
    }

    static class a {
        int a;
        Object b;

        a() {
        }
    }
}

