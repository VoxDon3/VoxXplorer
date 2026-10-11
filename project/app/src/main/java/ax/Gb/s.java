/*
 * Decompiled with CFR 0.152.
 */
package ax.Gb;

import ax.Gb.c;
import ax.Gb.l;
import ax.Mb.a;
import ax.Mb.g;

public abstract class s
extends c
implements g {
    private final boolean i0;

    public s() {
        this.i0 = false;
    }

    public s(Object object, Class clazz, String string, String string2, int n8) {
        boolean bl = false;
        boolean bl2 = (n8 & 1) == 1;
        super(object, clazz, string, string2, bl2);
        bl2 = bl;
        if ((n8 & 2) == 2) {
            bl2 = true;
        }
        this.i0 = bl2;
    }

    @Override
    public a a() {
        if (this.i0) {
            return this;
        }
        return super.a();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof s) {
            object = (s)object;
            return this.f().equals(((c)object).f()) && this.e().equals(((c)object).e()) && this.k().equals(((c)object).k()) && l.a(this.d(), ((c)object).d());
        }
        if (object instanceof g) {
            return object.equals(this.a());
        }
        return false;
    }

    public int hashCode() {
        return (this.f().hashCode() * 31 + this.e().hashCode()) * 31 + this.k().hashCode();
    }

    protected g l() {
        if (!this.i0) {
            return (g)super.h();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    public String toString() {
        Object object = this.a();
        if (object != this) {
            return object.toString();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("property ");
        ((StringBuilder)object).append(this.e());
        ((StringBuilder)object).append(" (Kotlin reflection is not available)");
        return ((StringBuilder)object).toString();
    }
}

