package ax.db;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class s {
    private static final z e;
    public static final s f;
    private final w a;
    private final t b;
    private final x c;
    private final z d;

    static {
        z b = z.b().b();
        e = b;
        f = new s(w.d0, t.c0, x.b, b);
    }

    private s(w wVar, t tVar, x xVar, z zVar) {
        this.a = wVar;
        this.b = tVar;
        this.c = xVar;
        this.d = zVar;
    }

    public t a() {
        return this.b;
    }

    public w b() {
        return this.a;
    }

    public x c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a.equals(sVar.a) && this.b.equals(sVar.b) && this.c.equals(sVar.c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        return "SpanContext{traceId=" + this.a + ", spanId=" + this.b + ", traceOptions=" + this.c + "}";
    }
}
