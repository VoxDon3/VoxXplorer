/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.E;
import ax.b6.g;
import ax.b6.l;
import ax.b6.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Z2 {
    private final Z2 a;
    private E b;
    private Map<String, s> c = new HashMap<String, s>();
    private Map<String, Boolean> d = new HashMap<String, Boolean>();

    public Z2(Z2 z22, E e8) {
        this.a = z22;
        this.b = e8;
    }

    public final s a(g g8) {
        s s8 = s.f;
        Iterator<Integer> iterator = g8.z();
        while (iterator.hasNext()) {
            s s9;
            int n8 = iterator.next();
            s8 = s9 = this.b.a(this, g8.q(n8));
            if (!(s9 instanceof l)) continue;
            s8 = s9;
            break;
        }
        return s8;
    }

    public final s b(s s8) {
        return this.b.a(this, s8);
    }

    public final s c(String string) {
        Z2 z22 = this;
        do {
            if (!z22.c.containsKey(string)) continue;
            return z22.c.get(string);
        } while ((z22 = z22.a) != null);
        throw new IllegalArgumentException(String.format("%s is not defined", string));
    }

    public final Z2 d() {
        return new Z2(this, this.b);
    }

    public final void e(String string, s s8) {
        if (!this.d.containsKey(string)) {
            if (s8 == null) {
                this.c.remove(string);
                return;
            }
            this.c.put(string, s8);
        }
    }

    public final void f(String string, s s8) {
        this.e(string, s8);
        this.d.put(string, Boolean.TRUE);
    }

    public final boolean g(String string) {
        Z2 z22 = this;
        do {
            if (!z22.c.containsKey(string)) continue;
            return true;
        } while ((z22 = z22.a) != null);
        return false;
    }

    public final void h(String string, s s8) {
        Z2 z22;
        Z2 z23 = this;
        while (!z23.c.containsKey(string) && (z22 = z23.a) != null && z22.g(string)) {
            z23 = z23.a;
        }
        if (!z23.d.containsKey(string)) {
            if (s8 == null) {
                z23.c.remove(string);
                return;
            }
            z23.c.put(string, s8);
        }
    }
}

