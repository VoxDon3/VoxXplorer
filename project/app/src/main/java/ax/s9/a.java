/*
 * Decompiled with CFR 0.152.
 */
package ax.s9;

import ax.N8.h;
import ax.N8.o;
import ax.N8.p;
import ax.Q8.i;
import ax.Q8.t;
import ax.R8.n;
import ax.R8.o;
import ax.h9.d;
import ax.k9.e;
import ax.s9.b;
import ax.s9.c;
import ax.s9.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class a
extends b
implements Iterable<ax.N8.m> {
    a(i i8, c c8, e e8) {
        super(i8, c8, e8);
    }

    public <F extends h> Iterator<F> F0(Class<F> clazz) {
        return this.L0(clazz, null);
    }

    public <F extends h> Iterator<F> L0(Class<F> clazz, String string) {
        return new a<F>(this, clazz, string);
    }

    public <F extends h> List<F> M0(Class<F> object, String string) {
        ArrayList<h> arrayList = new ArrayList<h>();
        object = this.L0((Class<F>)object, string);
        while (object.hasNext()) {
            arrayList.add((h)object.next());
        }
        return arrayList;
    }

    @Override
    public Iterator<ax.N8.m> iterator() {
        return this.F0(ax.N8.m.class);
    }

    public String toString() {
        return String.format("Directory{fileId=%s, fileName='%s'}", this.d0, this.e0.h());
    }

    public i u0() {
        return this.d0;
    }

    private class a<F extends h>
    implements Iterator<F> {
        private Iterator<F> c0;
        private byte[] d0;
        private F e0;
        private String f0;
        final a g0;
        private final o.a<F> q;

        a(a a8, Class<F> clazz, String string) {
            this.g0 = a8;
            this.q = p.k(clazz);
            this.f0 = string;
            this.e(true);
            this.e0 = this.c();
        }

        private F c() {
            Iterator<F> iterator;
            while ((iterator = this.c0) != null) {
                if (iterator.hasNext()) {
                    return (F)((h)this.c0.next());
                }
                this.e(false);
            }
            return null;
        }

        private void e(boolean bl) {
            Object object = (c)this.g0.c0;
            EnumSet<n.a> enumSet = bl ? EnumSet.of(n.a.c0) : EnumSet.noneOf(n.a.class);
            ax.L8.b b8 = this.q.a();
            enumSet = ((m)object).u(this.g0.d0, enumSet, b8, this.f0);
            long l8 = ((t)((d)((Object)enumSet)).c()).m();
            enumSet = (EnumSet<n.a>)((o)((Object)enumSet)).n();
            if (!(l8 == ax.K8.a.j0.getValue() || l8 == ax.K8.a.o0.getValue() || (object = (Object)this.d0) != null && Arrays.equals((byte[])object, (byte[])enumSet))) {
                this.d0 = (byte[])enumSet;
                this.c0 = p.j((byte[])enumSet, this.q);
                return;
            }
            this.c0 = null;
            this.d0 = null;
        }

        public F b() {
            if (this.hasNext()) {
                F f8 = this.e0;
                this.e0 = this.c();
                return f8;
            }
            throw new NoSuchElementException();
        }

        @Override
        public boolean hasNext() {
            return this.e0 != null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

