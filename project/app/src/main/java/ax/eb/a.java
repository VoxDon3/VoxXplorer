/*
 * Decompiled with CFR 0.152.
 */
package ax.eb;

import ax.db.u;
import ax.eb.c;
import java.util.Map;

final class a
extends c.c {
    private final Map<Object, Integer> a;
    private final Map<u.a, Integer> b;

    a(Map<Object, Integer> map, Map<u.a, Integer> map2) {
        if (map != null) {
            this.a = map;
            if (map2 != null) {
                this.b = map2;
                return;
            }
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        throw new NullPointerException("Null numbersOfLatencySampledSpans");
    }

    @Override
    public Map<u.a, Integer> b() {
        return this.b;
    }

    @Override
    public Map<Object, Integer> c() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        return object instanceof c.c && this.a.equals(((c.c)(object = (c.c)object)).c()) && this.b.equals(((c.c)object).b());
    }

    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PerSpanNameSummary{numbersOfLatencySampledSpans=");
        stringBuilder.append(this.a);
        stringBuilder.append(", numbersOfErrorSampledSpans=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

