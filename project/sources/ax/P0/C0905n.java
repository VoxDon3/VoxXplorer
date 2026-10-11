package ax.P0;

import ax.S0.C0968a;
import ax.S0.d0;
import j$.util.Objects;

/* renamed from: ax.P0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905n {
    public static final C0905n e = new b(0).e();
    private static final String f = d0.G0(0);
    private static final String g = d0.G0(1);
    private static final String h = d0.G0(2);
    private static final String i = d0.G0(3);
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    /* renamed from: ax.P0.n$b */
    public static final class b {
        private final int a;
        private int b;
        private int c;
        private String d;

        public b(int i) {
            this.a = i;
        }

        public C0905n e() {
            C0968a.a(this.b <= this.c);
            return new C0905n(this);
        }

        public b f(int i) {
            this.c = i;
            return this;
        }

        public b g(int i) {
            this.b = i;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0905n)) {
            return false;
        }
        C0905n c0905n = (C0905n) obj;
        return this.a == c0905n.a && this.b == c0905n.b && this.c == c0905n.c && Objects.equals(this.d, c0905n.d);
    }

    public int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    private C0905n(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
    }
}
