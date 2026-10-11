/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.G;
import ax.r0.c;
import ax.r0.h;
import ax.r0.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public class F
extends c<String>
implements G,
RandomAccess {
    private static final F d0;
    public static final G e0;
    private final List<Object> c0;

    static {
        F f8;
        d0 = f8 = new F();
        f8.F();
        e0 = f8;
    }

    public F() {
        this(10);
    }

    public F(int n8) {
        this(new ArrayList<Object>(n8));
    }

    private F(ArrayList<Object> arrayList) {
        this.c0 = arrayList;
    }

    private static String h(Object object) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof h) {
            return ((h)object).D();
        }
        return A.j((byte[])object);
    }

    @Override
    public G A0() {
        if (this.G0()) {
            return new r0(this);
        }
        return this;
    }

    @Override
    public void C0(h h8) {
        this.e();
        this.c0.add(h8);
        ++this.modCount;
    }

    @Override
    public Object D0(int n8) {
        return this.c0.get(n8);
    }

    @Override
    public boolean addAll(int n8, Collection<? extends String> collection) {
        this.e();
        Collection<? extends String> collection2 = collection;
        if (collection instanceof G) {
            collection2 = ((G)collection).d0();
        }
        boolean bl = this.c0.addAll(n8, collection2);
        ++this.modCount;
        return bl;
    }

    @Override
    public boolean addAll(Collection<? extends String> collection) {
        return this.addAll(this.size(), collection);
    }

    @Override
    public void clear() {
        this.e();
        this.c0.clear();
        ++this.modCount;
    }

    @Override
    public List<?> d0() {
        return java.util.DesugarCollections.unmodifiableList(this.c0);
    }

    public void g(int n8, String string) {
        this.e();
        this.c0.add(n8, string);
        ++this.modCount;
    }

    public String i(int n8) {
        Object object = this.c0.get(n8);
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof h) {
            h h8 = (h)object;
            object = h8.D();
            if (h8.r()) {
                this.c0.set(n8, object);
            }
            return object;
        }
        object = (byte[])object;
        String string = A.j((byte[])object);
        if (A.g((byte[])object)) {
            this.c0.set(n8, string);
        }
        return string;
    }

    public F k(int n8) {
        if (n8 >= this.size()) {
            ArrayList<Object> arrayList = new ArrayList<Object>(n8);
            arrayList.addAll(this.c0);
            return new F(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public String l(int n8) {
        this.e();
        Object object = this.c0.remove(n8);
        ++this.modCount;
        return F.h(object);
    }

    public String n(int n8, String string) {
        this.e();
        return F.h(this.c0.set(n8, string));
    }

    @Override
    public int size() {
        return this.c0.size();
    }
}

