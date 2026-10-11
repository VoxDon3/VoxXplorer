package ax.K2;

/* loaded from: classes.dex */
public final class m {
    private final String a;
    private final int b;

    public m(String str, int i) {
        ax.Gb.l.f(str, "workSpecId");
        this.a = str;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return ax.Gb.l.a(this.a, mVar.a) && this.b == mVar.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
