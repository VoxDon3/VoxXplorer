/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.t;
import ax.db.w;
import ax.db.x;
import ax.db.z;
import java.util.Arrays;

public final class s {
    private static final z e;
    public static final s f;
    private final w a;
    private final t b;
    private final x c;
    private final z d;

    static {
        z z8;
        e = z8 = z.b().b();
        f = new s(w.d0, t.c0, x.b, z8);
    }

    private s(w w8, t t8, x x8, z z8) {
        this.a = w8;
        this.b = t8;
        this.c = x8;
        this.d = z8;
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

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof s)) {
            return false;
        }
        object = (s)object;
        return this.a.equals(((s)object).a) && this.b.equals(((s)object).b) && this.c.equals(((s)object).c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpanContext{traceId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", spanId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", traceOptions=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

