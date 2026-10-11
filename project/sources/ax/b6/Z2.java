package ax.b6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Z2 {
    private final Z2 a;
    private E b;
    private Map<String, InterfaceC1658s> c = new HashMap();
    private Map<String, Boolean> d = new HashMap();

    public Z2(Z2 z2, E e) {
        this.a = z2;
        this.b = e;
    }

    public final InterfaceC1658s a(C1558g c1558g) {
        InterfaceC1658s interfaceC1658s = InterfaceC1658s.f;
        Iterator<Integer> z = c1558g.z();
        while (z.hasNext()) {
            interfaceC1658s = this.b.a(this, c1558g.q(z.next().intValue()));
            if (interfaceC1658s instanceof C1603l) {
                break;
            }
        }
        return interfaceC1658s;
    }

    public final InterfaceC1658s b(InterfaceC1658s interfaceC1658s) {
        return this.b.a(this, interfaceC1658s);
    }

    public final InterfaceC1658s c(String str) {
        Z2 z2 = this;
        while (!z2.c.containsKey(str)) {
            z2 = z2.a;
            if (z2 == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return z2.c.get(str);
    }

    public final Z2 d() {
        return new Z2(this, this.b);
    }

    public final void e(String str, InterfaceC1658s interfaceC1658s) {
        if (this.d.containsKey(str)) {
            return;
        }
        if (interfaceC1658s == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, interfaceC1658s);
        }
    }

    public final void f(String str, InterfaceC1658s interfaceC1658s) {
        e(str, interfaceC1658s);
        this.d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        Z2 z2 = this;
        while (!z2.c.containsKey(str)) {
            z2 = z2.a;
            if (z2 == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, InterfaceC1658s interfaceC1658s) {
        Z2 z2;
        Z2 z22 = this;
        while (!z22.c.containsKey(str) && (z2 = z22.a) != null && z2.g(str)) {
            z22 = z22.a;
        }
        if (z22.d.containsKey(str)) {
            return;
        }
        if (interfaceC1658s == null) {
            z22.c.remove(str);
        } else {
            z22.c.put(str, interfaceC1658s);
        }
    }
}
