package ax.I8;

import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;
import java.util.List;

/* loaded from: classes3.dex */
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

    /* renamed from: ax.I8.a$a, reason: collision with other inner class name */
    public enum EnumC0092a implements ax.Y8.c<EnumC0092a> {
        NameListReferral(2),
        TargetSetBoundary(4);

        private long q;

        EnumC0092a(long j) {
            this.q = j;
        }

        @Override // ax.Y8.c
        public long getValue() {
            return this.q;
        }
    }

    public enum b implements ax.Y8.c<b> {
        LINK(0),
        ROOT(1);

        private long q;

        b(long j) {
            this.q = j;
        }

        @Override // ax.Y8.c
        public long getValue() {
            return this.q;
        }
    }

    a() {
    }

    static a a(C2171b c2171b) throws a.b {
        int J = c2171b.J();
        c2171b.T(c2171b.S() - 2);
        if (J == 1) {
            return new ax.I8.b().j(c2171b);
        }
        if (J == 2) {
            return new c().j(c2171b);
        }
        if (J == 3 || J == 4) {
            return new d().j(c2171b);
        }
        throw new IllegalArgumentException("Incorrect version number " + J + " while parsing DFS Referrals");
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

    final a j(C2171b c2171b) throws a.b {
        int S = c2171b.S();
        this.a = c2171b.J();
        int J = c2171b.J();
        this.c = (b) c.a.f(c2171b.J(), b.class, null);
        this.d = c2171b.J();
        l(c2171b, S);
        c2171b.T(S + J);
        return this;
    }

    String k(C2171b c2171b, int i, int i2) throws a.b {
        int S = c2171b.S();
        c2171b.T(i + i2);
        String C = c2171b.C(ax.Y8.b.d);
        c2171b.T(S);
        return C;
    }

    protected abstract void l(C2171b c2171b, int i) throws a.b;

    public void m(String str) {
        this.f = str;
    }

    public String toString() {
        return "DFSReferral[path=" + this.e + ",dfsPath=" + this.f + ",dfsAlternatePath=" + this.g + ",specialName=" + this.h + ",ttl=" + this.b + "]";
    }
}
