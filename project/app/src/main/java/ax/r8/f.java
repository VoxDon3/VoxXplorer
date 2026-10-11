/*
 * Decompiled with CFR 0.152.
 */
package ax.r8;

import ax.r8.i;
import ax.r8.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f
extends i
implements Iterable<i> {
    private final List<i> q = new ArrayList<i>();

    @Override
    public boolean e() {
        if (this.q.size() == 1) {
            return this.q.get(0).e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object object) {
        return object == this || object instanceof f && ((f)object).q.equals(this.q);
        {
        }
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    @Override
    public Iterator<i> iterator() {
        return this.q.iterator();
    }

    @Override
    public String k() {
        if (this.q.size() == 1) {
            return this.q.get(0).k();
        }
        throw new IllegalStateException();
    }

    public void r(i i8) {
        i i9 = i8;
        if (i8 == null) {
            i9 = k.q;
        }
        this.q.add(i9);
    }

    public i s(int n8) {
        return this.q.get(n8);
    }

    public int size() {
        return this.q.size();
    }
}

