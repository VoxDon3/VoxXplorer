package ax.b6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ax.b6.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1619n implements InterfaceC1611m, InterfaceC1658s {
    protected final Map<String, InterfaceC1658s> c0 = new HashMap();
    protected final String q;

    public AbstractC1619n(String str) {
        this.q = str;
    }

    public abstract InterfaceC1658s a(Z2 z2, List<InterfaceC1658s> list);

    public final String b() {
        return this.q;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1619n)) {
            return false;
        }
        AbstractC1619n abstractC1619n = (AbstractC1619n) obj;
        String str = this.q;
        if (str != null) {
            return str.equals(abstractC1619n.q);
        }
        return false;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Double f() {
        return Double.valueOf(Double.NaN);
    }

    @Override // ax.b6.InterfaceC1658s
    public final String g() {
        return this.q;
    }

    @Override // ax.b6.InterfaceC1611m
    public final InterfaceC1658s h(String str) {
        return this.c0.containsKey(str) ? this.c0.get(str) : InterfaceC1658s.f;
    }

    public int hashCode() {
        String str = this.q;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Iterator<InterfaceC1658s> i() {
        return C1635p.b(this.c0);
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        return "toString".equals(str) ? new C1674u(this.q) : C1635p.a(this, new C1674u(str), z2, list);
    }

    @Override // ax.b6.InterfaceC1611m
    public final boolean l(String str) {
        return this.c0.containsKey(str);
    }

    @Override // ax.b6.InterfaceC1611m
    public final void n(String str, InterfaceC1658s interfaceC1658s) {
        if (interfaceC1658s == null) {
            this.c0.remove(str);
        } else {
            this.c0.put(str, interfaceC1658s);
        }
    }

    @Override // ax.b6.InterfaceC1658s
    public InterfaceC1658s c() {
        return this;
    }
}
