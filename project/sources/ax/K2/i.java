package ax.K2;

/* loaded from: classes.dex */
public final class i {
    public final String a;
    private final int b;
    public final int c;

    public i(String str, int i, int i2) {
        ax.Gb.l.f(str, "workSpecId");
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return ax.Gb.l.a(this.a, iVar.a) && this.b == iVar.b && this.c == iVar.c;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
