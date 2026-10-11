package ax.b6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class r implements InterfaceC1611m, InterfaceC1658s {
    private final Map<String, InterfaceC1658s> q = new HashMap();

    public final List<String> a() {
        return new ArrayList(this.q.keySet());
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s c() {
        r rVar = new r();
        for (Map.Entry<String, InterfaceC1658s> entry : this.q.entrySet()) {
            if (entry.getValue() instanceof InterfaceC1611m) {
                rVar.q.put(entry.getKey(), entry.getValue());
            } else {
                rVar.q.put(entry.getKey(), entry.getValue().c());
            }
        }
        return rVar;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.q.equals(((r) obj).q);
        }
        return false;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // ax.b6.InterfaceC1658s
    public final String g() {
        return "[object Object]";
    }

    @Override // ax.b6.InterfaceC1611m
    public final InterfaceC1658s h(String str) {
        return this.q.containsKey(str) ? this.q.get(str) : InterfaceC1658s.f;
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    @Override // ax.b6.InterfaceC1658s
    public final Iterator<InterfaceC1658s> i() {
        return C1635p.b(this.q);
    }

    public InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        return "toString".equals(str) ? new C1674u(toString()) : C1635p.a(this, new C1674u(str), z2, list);
    }

    @Override // ax.b6.InterfaceC1611m
    public final boolean l(String str) {
        return this.q.containsKey(str);
    }

    @Override // ax.b6.InterfaceC1611m
    public final void n(String str, InterfaceC1658s interfaceC1658s) {
        if (interfaceC1658s == null) {
            this.q.remove(str);
        } else {
            this.q.put(str, interfaceC1658s);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.q.isEmpty()) {
            for (String str : this.q.keySet()) {
                sb.append(String.format("%s: %s,", str, this.q.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
