package ax.r8;

import java.util.Map;
import java.util.Set;

/* renamed from: ax.r8.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3003l extends AbstractC3000i {
    private final ax.t8.g<String, AbstractC3000i> q = new ax.t8.g<>();

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C3003l) && ((C3003l) obj).q.equals(this.q);
        }
        return true;
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    public void r(String str, AbstractC3000i abstractC3000i) {
        ax.t8.g<String, AbstractC3000i> gVar = this.q;
        if (abstractC3000i == null) {
            abstractC3000i = C3002k.q;
        }
        gVar.put(str, abstractC3000i);
    }

    public Set<Map.Entry<String, AbstractC3000i>> s() {
        return this.q.entrySet();
    }

    public AbstractC3000i t(String str) {
        return this.q.get(str);
    }

    public C2997f u(String str) {
        return (C2997f) this.q.get(str);
    }

    public C3006o w(String str) {
        return (C3006o) this.q.get(str);
    }

    public boolean x(String str) {
        return this.q.containsKey(str);
    }

    public AbstractC3000i y(String str) {
        return this.q.remove(str);
    }
}
