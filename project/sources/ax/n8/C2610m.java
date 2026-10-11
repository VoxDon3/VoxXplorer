package ax.n8;

/* renamed from: ax.n8.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2610m {
    private final String a;

    public C2610m(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2610m) && ax.Gb.l.a(this.a, ((C2610m) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.a + ')';
    }
}
