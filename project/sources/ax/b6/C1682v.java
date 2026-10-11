package ax.b6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.b6.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1682v implements InterfaceC1658s {
    private final ArrayList<InterfaceC1658s> c0;
    private final String q;

    public C1682v(String str, List<InterfaceC1658s> list) {
        this.q = str;
        ArrayList<InterfaceC1658s> arrayList = new ArrayList<>();
        this.c0 = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.q;
    }

    public final ArrayList<InterfaceC1658s> b() {
        return this.c0;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Boolean e() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1682v)) {
            return false;
        }
        C1682v c1682v = (C1682v) obj;
        String str = this.q;
        if (str == null ? c1682v.q != null : !str.equals(c1682v.q)) {
            return false;
        }
        ArrayList<InterfaceC1658s> arrayList = this.c0;
        ArrayList<InterfaceC1658s> arrayList2 = c1682v.c0;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // ax.b6.InterfaceC1658s
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.q;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<InterfaceC1658s> arrayList = this.c0;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @Override // ax.b6.InterfaceC1658s
    public final Iterator<InterfaceC1658s> i() {
        return null;
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s c() {
        return this;
    }
}
