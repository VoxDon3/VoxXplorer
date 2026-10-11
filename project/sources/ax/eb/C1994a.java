package ax.eb;

import ax.db.u;
import ax.eb.c;
import java.util.Map;

/* renamed from: ax.eb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1994a extends c.AbstractC0308c {
    private final Map<Object, Integer> a;
    private final Map<u.a, Integer> b;

    C1994a(Map<Object, Integer> map, Map<u.a, Integer> map2) {
        if (map == null) {
            throw new NullPointerException("Null numbersOfLatencySampledSpans");
        }
        this.a = map;
        if (map2 == null) {
            throw new NullPointerException("Null numbersOfErrorSampledSpans");
        }
        this.b = map2;
    }

    @Override // ax.eb.c.AbstractC0308c
    public Map<u.a, Integer> b() {
        return this.b;
    }

    @Override // ax.eb.c.AbstractC0308c
    public Map<Object, Integer> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c.AbstractC0308c) {
            c.AbstractC0308c abstractC0308c = (c.AbstractC0308c) obj;
            if (this.a.equals(abstractC0308c.c()) && this.b.equals(abstractC0308c.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "PerSpanNameSummary{numbersOfLatencySampledSpans=" + this.a + ", numbersOfErrorSampledSpans=" + this.b + "}";
    }
}
