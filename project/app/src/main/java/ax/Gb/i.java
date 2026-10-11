/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Gb.c;
import ax.Gb.h;
import ax.Gb.l;
import ax.Gb.w;
import ax.Mb.a;
import ax.Mb.d;

public class i
extends c
implements h,
d {
    private final int i0;
    private final int j0;

    public i(int n8, Object object, Class clazz, String string, String string2, int n9) {
        boolean bl = (n9 & 1) == 1;
        super(object, clazz, string, string2, bl);
        this.i0 = n8;
        this.j0 = n9 >> 1;
    }

    @Override
    protected a b() {
        return w.a(this);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof i) {
            object = (i)object;
            return this.e().equals(((c)object).e()) && this.k().equals(((c)object).k()) && this.j0 == ((i)object).j0 && this.i0 == ((i)object).i0 && l.a(this.d(), ((c)object).d()) && l.a(this.f(), ((c)object).f());
        }
        if (object instanceof d) {
            return object.equals(this.a());
        }
        return false;
    }

    @Override
    public int getArity() {
        return this.i0;
    }

    public int hashCode() {
        int n8 = this.f() == null ? 0 : this.f().hashCode() * 31;
        return (n8 + this.e().hashCode()) * 31 + this.k().hashCode();
    }

    public String toString() {
        Object object = this.a();
        if (object != this) {
            return object.toString();
        }
        if ("<init>".equals(this.e())) {
            return "constructor (Kotlin reflection is not available)";
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("function ");
        ((StringBuilder)object).append(this.e());
        ((StringBuilder)object).append(" (Kotlin reflection is not available)");
        return ((StringBuilder)object).toString();
    }
}

