/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class v
implements s {
    private final ArrayList<s> c0;
    private final String q;

    public v(String object, List<s> list) {
        this.q = object;
        this.c0 = object = new ArrayList();
        ((ArrayList)object).addAll(list);
    }

    public final String a() {
        return this.q;
    }

    public final ArrayList<s> b() {
        return this.c0;
    }

    @Override
    public final s c() {
        return this;
    }

    @Override
    public final Boolean e() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object arrayList) {
        if (this == arrayList) {
            return true;
        }
        if (!(arrayList instanceof v)) {
            return false;
        }
        arrayList = (v)((Object)arrayList);
        Object object = this.q;
        if (object != null ? !((String)object).equals(((v)((Object)arrayList)).q) : ((v)((Object)arrayList)).q != null) {
            return false;
        }
        object = this.c0;
        arrayList = ((v)((Object)arrayList)).c0;
        if (object != null) {
            return ((ArrayList)object).equals(arrayList);
        }
        return arrayList == null;
    }

    @Override
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        ArrayList<s> arrayList = this.q;
        int n8 = 0;
        int n9 = arrayList != null ? ((String)((Object)arrayList)).hashCode() : 0;
        arrayList = this.c0;
        if (arrayList != null) {
            n8 = arrayList.hashCode();
        }
        return n9 * 31 + n8;
    }

    @Override
    public final Iterator<s> i() {
        return null;
    }

    @Override
    public final s k(String string, Z2 z22, List<s> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}

