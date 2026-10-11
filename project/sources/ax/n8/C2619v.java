package ax.n8;

/* renamed from: ax.n8.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2619v {
    private final String a;
    private final int b;
    private final int c;
    private final boolean d;

    public C2619v(String str, int i, int i2, boolean z) {
        ax.Gb.l.f(str, "processName");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2619v)) {
            return false;
        }
        C2619v c2619v = (C2619v) obj;
        return ax.Gb.l.a(this.a, c2619v.a) && this.b == c2619v.b && this.c == c2619v.c && this.d == c2619v.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
