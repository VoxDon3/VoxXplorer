package ax.n8;

/* renamed from: ax.n8.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2623z {
    private final String a;
    private final String b;
    private final int c;
    private final long d;

    public C2623z(String str, String str2, int i, long j) {
        ax.Gb.l.f(str, "sessionId");
        ax.Gb.l.f(str2, "firstSessionId");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final int c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2623z)) {
            return false;
        }
        C2623z c2623z = (C2623z) obj;
        return ax.Gb.l.a(this.a, c2623z.a) && ax.Gb.l.a(this.b, c2623z.b) && this.c == c2623z.c && this.d == c2623z.d;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + ax.K2.t.a(this.d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
