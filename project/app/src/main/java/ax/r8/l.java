/*
 * Decompiled with CFR 0.152.
 */
package ax.r8;

import ax.r8.f;
import ax.r8.i;
import ax.r8.k;
import ax.r8.o;
import ax.t8.g;
import java.util.Map;
import java.util.Set;

public final class l
extends i {
    private final g<String, i> q = new g();

    public boolean equals(Object object) {
        return object == this || object instanceof l && ((Object)((l)object).q).equals(this.q);
        {
        }
    }

    public int hashCode() {
        return ((Object)this.q).hashCode();
    }

    public void r(String string, i i8) {
        g<String, i> g8 = this.q;
        i i9 = i8;
        if (i8 == null) {
            i9 = k.q;
        }
        g8.put(string, i9);
    }

    public Set<Map.Entry<String, i>> s() {
        return this.q.entrySet();
    }

    public i t(String string) {
        return this.q.get(string);
    }

    public f u(String string) {
        return (f)this.q.get(string);
    }

    public o w(String string) {
        return (o)this.q.get(string);
    }

    public boolean x(String string) {
        return this.q.containsKey(string);
    }

    public i y(String string) {
        return this.q.remove(string);
    }
}

