/*
 * Decompiled with CFR 0.152.
 */
package ax.O4;

import ax.O4.g;
import ax.O4.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class a
extends g
implements Iterable<g> {
    private final List<g> e0 = new ArrayList<g>();

    public a B(g g8) {
        if (g8 != null) {
            this.e0.add(g8);
            return this;
        }
        throw new NullPointerException("value is null");
    }

    @Override
    public a e() {
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (a)object;
        return this.e0.equals(((a)object).e0);
    }

    @Override
    public int hashCode() {
        return this.e0.hashCode();
    }

    @Override
    public Iterator<g> iterator() {
        return new Iterator<g>(this, this.e0.iterator()){
            final a c0;
            final Iterator q;
            {
                this.c0 = a8;
                this.q = iterator;
            }

            public g b() {
                return (g)this.q.next();
            }

            @Override
            public boolean hasNext() {
                return this.q.hasNext();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public boolean n() {
        return true;
    }

    public int size() {
        return this.e0.size();
    }

    @Override
    protected void z(h h8) throws IOException {
        h8.c(this);
    }
}

