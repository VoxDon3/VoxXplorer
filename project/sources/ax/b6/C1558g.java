package ax.b6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1558g implements InterfaceC1611m, InterfaceC1658s, Iterable<InterfaceC1658s> {
    private final Map<String, InterfaceC1658s> c0;
    private final SortedMap<Integer, InterfaceC1658s> q;

    public C1558g() {
        this.q = new TreeMap();
        this.c0 = new TreeMap();
    }

    public final List<InterfaceC1658s> A() {
        ArrayList arrayList = new ArrayList(t());
        for (int i = 0; i < t(); i++) {
            arrayList.add(q(i));
        }
        return arrayList;
    }

    public final void B() {
        this.q.clear();
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s c() {
        C1558g c1558g = new C1558g();
        for (Map.Entry<Integer, InterfaceC1658s> entry : this.q.entrySet()) {
            if (entry.getValue() instanceof InterfaceC1611m) {
                c1558g.q.put(entry.getKey(), entry.getValue());
            } else {
                c1558g.q.put(entry.getKey(), entry.getValue().c());
            }
        }
        return c1558g;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Boolean e() {
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1558g)) {
            return false;
        }
        C1558g c1558g = (C1558g) obj;
        if (t() != c1558g.t()) {
            return false;
        }
        if (this.q.isEmpty()) {
            return c1558g.q.isEmpty();
        }
        for (int intValue = this.q.firstKey().intValue(); intValue <= this.q.lastKey().intValue(); intValue++) {
            if (!q(intValue).equals(c1558g.q(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Double f() {
        return this.q.size() == 1 ? q(0).f() : this.q.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // ax.b6.InterfaceC1658s
    public final String g() {
        return toString();
    }

    @Override // ax.b6.InterfaceC1611m
    public final InterfaceC1658s h(String str) {
        InterfaceC1658s interfaceC1658s;
        return "length".equals(str) ? new C1594k(Double.valueOf(t())) : (!l(str) || (interfaceC1658s = this.c0.get(str)) == null) ? InterfaceC1658s.f : interfaceC1658s;
    }

    public final int hashCode() {
        return this.q.hashCode() * 31;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Iterator<InterfaceC1658s> i() {
        return new C1549f(this, this.q.keySet().iterator(), this.c0.keySet().iterator());
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1658s> iterator() {
        return new C1576i(this);
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? H.d(str, this, z2, list) : C1635p.a(this, new C1674u(str), z2, list);
    }

    @Override // ax.b6.InterfaceC1611m
    public final boolean l(String str) {
        return "length".equals(str) || this.c0.containsKey(str);
    }

    @Override // ax.b6.InterfaceC1611m
    public final void n(String str, InterfaceC1658s interfaceC1658s) {
        if (interfaceC1658s == null) {
            this.c0.remove(str);
        } else {
            this.c0.put(str, interfaceC1658s);
        }
    }

    public final int p() {
        return this.q.size();
    }

    public final InterfaceC1658s q(int i) {
        InterfaceC1658s interfaceC1658s;
        if (i < t()) {
            return (!y(i) || (interfaceC1658s = this.q.get(Integer.valueOf(i))) == null) ? InterfaceC1658s.f : interfaceC1658s;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void r(int i, InterfaceC1658s interfaceC1658s) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        }
        if (i >= t()) {
            x(i, interfaceC1658s);
            return;
        }
        for (int intValue = this.q.lastKey().intValue(); intValue >= i; intValue--) {
            InterfaceC1658s interfaceC1658s2 = this.q.get(Integer.valueOf(intValue));
            if (interfaceC1658s2 != null) {
                x(intValue + 1, interfaceC1658s2);
                this.q.remove(Integer.valueOf(intValue));
            }
        }
        x(i, interfaceC1658s);
    }

    public final void s(InterfaceC1658s interfaceC1658s) {
        x(t(), interfaceC1658s);
    }

    public final int t() {
        if (this.q.isEmpty()) {
            return 0;
        }
        return this.q.lastKey().intValue() + 1;
    }

    public final String toString() {
        return u(",");
    }

    public final String u(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        if (!this.q.isEmpty()) {
            for (int i = 0; i < t(); i++) {
                InterfaceC1658s q = q(i);
                sb.append(str);
                if (!(q instanceof C1714z) && !(q instanceof C1643q)) {
                    sb.append(q.g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void w(int i) {
        int intValue = this.q.lastKey().intValue();
        if (i > intValue || i < 0) {
            return;
        }
        this.q.remove(Integer.valueOf(i));
        if (i == intValue) {
            int i2 = i - 1;
            if (this.q.containsKey(Integer.valueOf(i2)) || i2 < 0) {
                return;
            }
            this.q.put(Integer.valueOf(i2), InterfaceC1658s.f);
            return;
        }
        while (true) {
            i++;
            if (i > this.q.lastKey().intValue()) {
                return;
            }
            InterfaceC1658s interfaceC1658s = this.q.get(Integer.valueOf(i));
            if (interfaceC1658s != null) {
                this.q.put(Integer.valueOf(i - 1), interfaceC1658s);
                this.q.remove(Integer.valueOf(i));
            }
        }
    }

    public final void x(int i, InterfaceC1658s interfaceC1658s) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        if (interfaceC1658s == null) {
            this.q.remove(Integer.valueOf(i));
        } else {
            this.q.put(Integer.valueOf(i), interfaceC1658s);
        }
    }

    public final boolean y(int i) {
        if (i >= 0 && i <= this.q.lastKey().intValue()) {
            return this.q.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    public final Iterator<Integer> z() {
        return this.q.keySet().iterator();
    }

    public C1558g(List<InterfaceC1658s> list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                x(i, list.get(i));
            }
        }
    }

    public C1558g(InterfaceC1658s... interfaceC1658sArr) {
        this((List<InterfaceC1658s>) Arrays.asList(interfaceC1658sArr));
    }
}
