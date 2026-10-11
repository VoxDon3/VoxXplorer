/*
 * Decompiled with CFR 0.152.
 */
package ax.O4;

import ax.O4.g;
import ax.O4.h;
import java.io.IOException;

class b
extends g {
    private final String e0;

    b(String string) {
        this.e0 = string;
    }

    public boolean B() {
        return this == g.q || this == g.c0;
        {
        }
    }

    public boolean C() {
        return this == g.q;
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
        object = (b)object;
        return this.e0.equals(((b)object).e0);
    }

    @Override
    public boolean g() {
        if (this.B()) {
            return this.C();
        }
        return super.g();
    }

    @Override
    public int hashCode() {
        return this.e0.hashCode();
    }

    @Override
    public boolean p() {
        return this == g.d0;
    }

    @Override
    public String toString() {
        return this.e0;
    }

    @Override
    protected void z(h h8) throws IOException {
        h8.b(this.e0);
    }
}

