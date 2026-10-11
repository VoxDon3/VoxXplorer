package ax.i7;

import java.io.IOException;

/* loaded from: classes3.dex */
public class t extends IOException {
    private final String c0;
    private final transient m d0;
    private final String e0;
    private final int f0;
    private final int q;

    public t(s sVar) {
        this(new a(sVar));
    }

    public static StringBuilder a(s sVar) {
        StringBuilder sb = new StringBuilder();
        int h = sVar.h();
        if (h != 0) {
            sb.append(h);
        }
        String i = sVar.i();
        if (i != null) {
            if (h != 0) {
                sb.append(' ');
            }
            sb.append(i);
        }
        p g = sVar.g();
        if (g != null) {
            if (sb.length() > 0) {
                sb.append('\n');
            }
            String i2 = g.i();
            if (i2 != null) {
                sb.append(i2);
                sb.append(' ');
            }
            sb.append(g.p());
        }
        return sb;
    }

    public final int b() {
        return this.q;
    }

    public final String c() {
        return this.c0;
    }

    protected t(a aVar) {
        super(aVar.e);
        this.q = aVar.a;
        this.c0 = aVar.b;
        this.d0 = aVar.c;
        this.e0 = aVar.d;
        this.f0 = aVar.f;
    }

    public static class a {
        int a;
        String b;
        m c;
        String d;
        String e;
        int f;

        public a(int i, String str, m mVar) {
            f(i);
            g(str);
            d(mVar);
        }

        public t a() {
            return new t(this);
        }

        public a b(int i) {
            ax.m7.v.a(i >= 0);
            this.f = i;
            return this;
        }

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a d(m mVar) {
            this.c = (m) ax.m7.v.d(mVar);
            return this;
        }

        public a e(String str) {
            this.e = str;
            return this;
        }

        public a f(int i) {
            ax.m7.v.a(i >= 0);
            this.a = i;
            return this;
        }

        public a g(String str) {
            this.b = str;
            return this;
        }

        public a(s sVar) {
            this(sVar.h(), sVar.i(), sVar.f());
            try {
                String n = sVar.n();
                this.d = n;
                if (n.length() == 0) {
                    this.d = null;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
            StringBuilder a = t.a(sVar);
            if (this.d != null) {
                a.append(ax.m7.z.a);
                a.append(this.d);
            }
            this.e = a.toString();
        }
    }
}
