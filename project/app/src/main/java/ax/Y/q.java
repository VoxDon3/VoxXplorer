/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import android.os.LocaleList;
import ax.Y.j;
import ax.Y.k;
import ax.Y.l;
import ax.Y.m;
import ax.Y.n;
import ax.Y.o;
import ax.Y.p;
import java.util.Locale;

final class q
implements j {
    private final LocaleList a;

    q(Object object) {
        this.a = p.a(object);
    }

    @Override
    public String a() {
        return ax.n.n.a(this.a);
    }

    @Override
    public Object b() {
        return this.a;
    }

    public boolean equals(Object object) {
        return ax.n.j.a(this.a, ((j)object).b());
    }

    @Override
    public Locale get(int n8) {
        return n.a(this.a, n8);
    }

    public int hashCode() {
        return o.a(this.a);
    }

    @Override
    public boolean isEmpty() {
        return l.a(this.a);
    }

    @Override
    public int size() {
        return k.a(this.a);
    }

    public String toString() {
        return m.a(this.a);
    }
}

