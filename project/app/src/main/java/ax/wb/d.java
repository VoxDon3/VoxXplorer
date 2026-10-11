/*
 * Decompiled with CFR 0.152.
 */
package ax.wb;

import ax.Fb.p;
import ax.Gb.l;
import ax.wb.c;
import ax.wb.i;
import ax.wb.j;
import java.io.Serializable;

public final class d
implements i,
Serializable {
    private final i.b c0;
    private final i q;

    public d(i i8, i.b b8) {
        l.f(i8, "left");
        l.f(b8, "element");
        this.q = i8;
        this.c0 = b8;
    }

    public static /* synthetic */ String b(String string, i.b b8) {
        return d.i(string, b8);
    }

    private final boolean d(i.b b8) {
        return l.a(this.a(b8.getKey()), b8);
    }

    private final boolean f(d i8) {
        do {
            if (this.d(i8.c0)) continue;
            return false;
        } while ((i8 = i8.q) instanceof d);
        l.d(i8, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
        return this.d((i.b)i8);
    }

    private final int h() {
        int n8 = 2;
        i i8 = this;
        while (true) {
            if (!((i8 = i8.q) instanceof d)) {
                i8 = null;
            }
            if (i8 == null) {
                return n8;
            }
            ++n8;
        }
    }

    private static final String i(String string, i.b b8) {
        l.f(string, "acc");
        l.f(b8, "element");
        if (string.length() == 0) {
            return b8.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append(b8);
        return stringBuilder.toString();
    }

    @Override
    public <E extends i.b> E a(i.c<E> c8) {
        l.f(c8, "key");
        i i8 = this;
        do {
            E e8;
            if ((e8 = ((d)i8).c0.a(c8)) == null) continue;
            return e8;
        } while ((i8 = ((d)i8).q) instanceof d);
        return i8.a(c8);
    }

    public boolean equals(Object object) {
        return this == object || object instanceof d && super.h() == this.h() && super.f(this);
        {
        }
    }

    public int hashCode() {
        return this.q.hashCode() + this.c0.hashCode();
    }

    @Override
    public i m(i.c<?> object) {
        l.f(object, "key");
        if (this.c0.a(object) != null) {
            return this.q;
        }
        if ((object = this.q.m((i.c<?>)object)) == this.q) {
            return this;
        }
        if (object == j.q) {
            return this.c0;
        }
        return new d((i)object, this.c0);
    }

    @Override
    public i p(i i8) {
        return i.a.b(this, i8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(this.v("", new c()));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    @Override
    public <R> R v(R r8, p<? super R, ? super i.b, ? extends R> p8) {
        l.f(p8, "operation");
        return p8.j(this.q.v(r8, p8), this.c0);
    }
}

