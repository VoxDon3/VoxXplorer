package ax.n8;

/* renamed from: ax.n8.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2590D {
    private final String a;
    private final String b;
    private final int c;
    private final long d;
    private final C2603f e;
    private final String f;
    private final String g;

    public C2590D(String str, String str2, int i, long j, C2603f c2603f, String str3, String str4) {
        ax.Gb.l.f(str, "sessionId");
        ax.Gb.l.f(str2, "firstSessionId");
        ax.Gb.l.f(c2603f, "dataCollectionStatus");
        ax.Gb.l.f(str3, "firebaseInstallationId");
        ax.Gb.l.f(str4, "firebaseAuthenticationToken");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = c2603f;
        this.f = str3;
        this.g = str4;
    }

    public final C2603f a() {
        return this.e;
    }

    public final long b() {
        return this.d;
    }

    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2590D)) {
            return false;
        }
        C2590D c2590d = (C2590D) obj;
        return ax.Gb.l.a(this.a, c2590d.a) && ax.Gb.l.a(this.b, c2590d.b) && this.c == c2590d.c && this.d == c2590d.d && ax.Gb.l.a(this.e, c2590d.e) && ax.Gb.l.a(this.f, c2590d.f) && ax.Gb.l.a(this.g, c2590d.g);
    }

    public final String f() {
        return this.a;
    }

    public final int g() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + ax.K2.t.a(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ", firebaseAuthenticationToken=" + this.g + ')';
    }
}
