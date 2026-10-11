/*
 * Decompiled with CFR 0.152.
 */
package ax.I8;

import ax.I8.c;
import ax.I8.d;
import ax.Y8.c;
import ax.Z8.a;
import java.util.List;

public abstract class a {
    private int a;
    int b;
    private b c;
    long d;
    protected String e;
    String f;
    String g;
    String h;
    List<String> i;

    a() {
    }

    static a a(ax.h9.b object) throws a.b {
        int n8 = ((ax.Z8.a)object).J();
        ((ax.Z8.a)object).T(((ax.Z8.a)object).S() - 2);
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3 && n8 != 4) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Incorrect version number ");
                    ((StringBuilder)object).append(n8);
                    ((StringBuilder)object).append(" while parsing DFS Referrals");
                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                }
                return new d().j((ax.h9.b)object);
            }
            return new c().j((ax.h9.b)object);
        }
        return new ax.I8.b().j((ax.h9.b)object);
    }

    public String b() {
        return this.f;
    }

    public List<String> c() {
        return this.i;
    }

    public String d() {
        return this.e;
    }

    public long e() {
        return this.d;
    }

    public b f() {
        return this.c;
    }

    public String g() {
        return this.h;
    }

    public int h() {
        return this.b;
    }

    public int i() {
        return this.a;
    }

    final a j(ax.h9.b b8) throws a.b {
        int n8 = b8.S();
        this.a = b8.J();
        int n9 = b8.J();
        this.c = c.a.f(b8.J(), b.class, null);
        this.d = b8.J();
        this.l(b8, n8);
        b8.T(n8 + n9);
        return this;
    }

    String k(ax.h9.b b8, int n8, int n9) throws a.b {
        int n10 = b8.S();
        b8.T(n8 + n9);
        String string = b8.C(ax.Y8.b.d);
        b8.T(n10);
        return string;
    }

    protected abstract void l(ax.h9.b var1, int var2) throws a.b;

    public void m(String string) {
        this.f = string;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DFSReferral[path=");
        stringBuilder.append(this.e);
        stringBuilder.append(",dfsPath=");
        stringBuilder.append(this.f);
        stringBuilder.append(",dfsAlternatePath=");
        stringBuilder.append(this.g);
        stringBuilder.append(",specialName=");
        stringBuilder.append(this.h);
        stringBuilder.append(",ttl=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static final class a
    extends Enum<a>
    implements ax.Y8.c<a> {
        public static final /* enum */ a c0 = new a(2L);
        public static final /* enum */ a d0 = new a(4L);
        private static final a[] e0 = ax.I8.a$a.d();
        private long q;

        private a(long l8) {
            this.q = l8;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }

        @Override
        public long getValue() {
            return this.q;
        }
    }

    public static final class b
    extends Enum<b>
    implements ax.Y8.c<b> {
        public static final /* enum */ b c0 = new b(0L);
        public static final /* enum */ b d0 = new b(1L);
        private static final b[] e0 = ax.I8.a$b.d();
        private long q;

        private b(long l8) {
            this.q = l8;
        }

        private static /* synthetic */ b[] d() {
            return new b[]{c0, d0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])e0.clone();
        }

        @Override
        public long getValue() {
            return this.q;
        }
    }
}

