/*
 * Decompiled with CFR 0.152.
 */
package ax.O4;

import ax.O4.g;
import ax.O4.h;
import java.io.IOException;

class c
extends g {
    private final String e0;

    c(String string) {
        if (string != null) {
            this.e0 = string;
            return;
        }
        throw new NullPointerException("string is null");
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
        object = (c)object;
        return this.e0.equals(((c)object).e0);
    }

    @Override
    public double h() {
        return Double.parseDouble(this.e0);
    }

    @Override
    public int hashCode() {
        return this.e0.hashCode();
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

