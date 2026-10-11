/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.O0;
import ax.W5.R0;
import ax.W5.S1;
import ax.W5.b2;
import ax.W5.e0;
import ax.W5.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class Q0
extends e0
implements RandomAccess,
R0 {
    private static final Q0 d0;
    @Deprecated
    public static final R0 e0;
    private final List c0;

    static {
        Q0 q02;
        d0 = q02 = new Q0(false);
        e0 = q02;
    }

    public Q0() {
        this(10);
    }

    public Q0(int n8) {
        ArrayList arrayList = new ArrayList(n8);
        super(true);
        this.c0 = arrayList;
    }

    private Q0(ArrayList arrayList) {
        super(true);
        this.c0 = arrayList;
    }

    private Q0(boolean bl) {
        super(false);
        this.c0 = Collections.EMPTY_LIST;
    }

    private static String h(Object object) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof t0) {
            return ((t0)object).s(O0.b);
        }
        return O0.d((byte[])object);
    }

    @Override
    public final boolean addAll(int n8, Collection collection) {
        this.e();
        Collection collection2 = collection;
        if (collection instanceof R0) {
            collection2 = ((R0)collection).j();
        }
        boolean bl = this.c0.addAll(n8, collection2);
        ++this.modCount;
        return bl;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return ((e0)this).addAll(this.size(), collection);
    }

    @Override
    public final void clear() {
        this.e();
        this.c0.clear();
        ++this.modCount;
    }

    @Override
    public final R0 f() {
        if (this.c()) {
            return new S1(this);
        }
        return this;
    }

    public final String g(int n8) {
        Object object = this.c0.get(n8);
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof t0) {
            object = (t0)object;
            String string = ((t0)object).s(O0.b);
            if (((t0)object).n()) {
                this.c0.set(n8, string);
            }
            return string;
        }
        object = (byte[])object;
        String string = O0.d(object);
        if (b2.b((byte[])object)) {
            this.c0.set(n8, string);
        }
        return string;
    }

    @Override
    public final List j() {
        return java.util.DesugarCollections.unmodifiableList((List)this.c0);
    }

    @Override
    public final int size() {
        return this.c0.size();
    }
}

