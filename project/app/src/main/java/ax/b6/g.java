/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.H;
import ax.b6.Z2;
import ax.b6.f;
import ax.b6.i;
import ax.b6.k;
import ax.b6.m;
import ax.b6.p;
import ax.b6.q;
import ax.b6.s;
import ax.b6.u;
import ax.b6.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class g
implements m,
s,
Iterable<s> {
    private final Map<String, s> c0;
    private final SortedMap<Integer, s> q = new TreeMap<Integer, s>();

    public g() {
        this.c0 = new TreeMap<String, s>();
    }

    public g(List<s> list) {
        this();
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); ++i8) {
                this.x(i8, list.get(i8));
            }
        }
    }

    public g(s ... sArray) {
        this(Arrays.asList(sArray));
    }

    public final List<s> A() {
        ArrayList<s> arrayList = new ArrayList<s>(this.t());
        for (int i8 = 0; i8 < this.t(); ++i8) {
            arrayList.add(this.q(i8));
        }
        return arrayList;
    }

    public final void B() {
        this.q.clear();
    }

    @Override
    public final s c() {
        g g8 = new g();
        for (Map.Entry<Integer, s> entry : this.q.entrySet()) {
            if (entry.getValue() instanceof m) {
                g8.q.put(entry.getKey(), entry.getValue());
                continue;
            }
            g8.q.put(entry.getKey(), entry.getValue().c());
        }
        return g8;
    }

    @Override
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof g)) {
            return false;
        }
        object = (g)object;
        if (this.t() != ((g)object).t()) {
            return false;
        }
        if (this.q.isEmpty()) {
            return ((g)object).q.isEmpty();
        }
        for (int i8 = this.q.firstKey().intValue(); i8 <= this.q.lastKey(); ++i8) {
            if (this.q(i8).equals(((g)object).q(i8))) continue;
            return false;
        }
        return true;
    }

    @Override
    public final Double f() {
        if (this.q.size() == 1) {
            return this.q(0).f();
        }
        if (this.q.size() <= 0) {
            return 0.0;
        }
        return Double.NaN;
    }

    @Override
    public final String g() {
        return this.toString();
    }

    @Override
    public final s h(String object) {
        if ("length".equals(object)) {
            return new k(Double.valueOf(this.t()));
        }
        if (this.l((String)object) && (object = this.c0.get(object)) != null) {
            return object;
        }
        return s.f;
    }

    public final int hashCode() {
        return this.q.hashCode() * 31;
    }

    @Override
    public final Iterator<s> i() {
        return new f(this, this.q.keySet().iterator(), this.c0.keySet().iterator());
    }

    @Override
    public final Iterator<s> iterator() {
        return new i(this);
    }

    @Override
    public final s k(String string, Z2 z22, List<s> list) {
        if (!("concat".equals(string) || "every".equals(string) || "filter".equals(string) || "forEach".equals(string) || "indexOf".equals(string) || "join".equals(string) || "lastIndexOf".equals(string) || "map".equals(string) || "pop".equals(string) || "push".equals(string) || "reduce".equals(string) || "reduceRight".equals(string) || "reverse".equals(string) || "shift".equals(string) || "slice".equals(string) || "some".equals(string) || "sort".equals(string) || "splice".equals(string) || "toString".equals(string) || "unshift".equals(string))) {
            return p.a(this, new u(string), z22, list);
        }
        return H.d(string, this, z22, list);
    }

    @Override
    public final boolean l(String string) {
        return "length".equals(string) || this.c0.containsKey(string);
        {
        }
    }

    @Override
    public final void n(String string, s s8) {
        if (s8 == null) {
            this.c0.remove(string);
            return;
        }
        this.c0.put(string, s8);
    }

    public final int p() {
        return this.q.size();
    }

    public final s q(int n8) {
        if (n8 < this.t()) {
            s s8;
            if (this.y(n8) && (s8 = (s)this.q.get(n8)) != null) {
                return s8;
            }
            return s.f;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void r(int n8, s object) {
        if (n8 >= 0) {
            if (n8 >= this.t()) {
                this.x(n8, (s)object);
                return;
            }
            for (int i8 = this.q.lastKey().intValue(); i8 >= n8; --i8) {
                s s8 = (s)this.q.get(i8);
                if (s8 == null) continue;
                this.x(i8 + 1, s8);
                this.q.remove(i8);
            }
            this.x(n8, (s)object);
            return;
        }
        object = new StringBuilder("Invalid value index: ");
        ((StringBuilder)object).append(n8);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public final void s(s s8) {
        this.x(this.t(), s8);
    }

    public final int t() {
        if (this.q.isEmpty()) {
            return 0;
        }
        return this.q.lastKey() + 1;
    }

    public final String toString() {
        return this.u(",");
    }

    public final String u(String object) {
        String string = object;
        if (object == null) {
            string = "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.q.isEmpty()) {
            for (int i8 = 0; i8 < this.t(); ++i8) {
                object = this.q(i8);
                stringBuilder.append(string);
                if (object instanceof z || object instanceof q) continue;
                stringBuilder.append(object.g());
            }
            stringBuilder.delete(0, string.length());
        }
        return stringBuilder.toString();
    }

    public final void w(int n8) {
        int n9 = this.q.lastKey();
        if (n8 <= n9 && n8 >= 0) {
            this.q.remove(n8);
            int n10 = n8;
            if (n8 == n9) {
                SortedMap<Integer, s> sortedMap = this.q;
                if (!sortedMap.containsKey(--n8) && n8 >= 0) {
                    this.q.put(n8, s.f);
                    return;
                }
            } else {
                while (++n10 <= this.q.lastKey()) {
                    s s8 = (s)this.q.get(n10);
                    if (s8 == null) continue;
                    this.q.put(n10 - 1, s8);
                    this.q.remove(n10);
                }
            }
        }
    }

    public final void x(int n8, s object) {
        if (n8 <= 32468) {
            if (n8 >= 0) {
                if (object == null) {
                    this.q.remove(n8);
                    return;
                }
                this.q.put(n8, (s)object);
                return;
            }
            object = new StringBuilder("Out of bounds index: ");
            ((StringBuilder)object).append(n8);
            throw new IndexOutOfBoundsException(((StringBuilder)object).toString());
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean y(int n8) {
        if (n8 >= 0 && n8 <= this.q.lastKey()) {
            return this.q.containsKey(n8);
        }
        StringBuilder stringBuilder = new StringBuilder("Out of bounds index: ");
        stringBuilder.append(n8);
        throw new IndexOutOfBoundsException(stringBuilder.toString());
    }

    public final Iterator<Integer> z() {
        return this.q.keySet().iterator();
    }
}

