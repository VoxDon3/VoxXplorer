/*
 * Decompiled with CFR 0.152.
 */
package ax.Wc;

import ax.Wc.g;
import ax.Wc.p;
import ax.Wc.t;
import ax.Wc.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public abstract class A
extends t {
    A() {
    }

    public static A z(byte[] object) throws IOException {
        block3: {
            p p8 = new p((byte[])object);
            try {
                object = p8.m();
                if (((InputStream)p8).available() != 0) break block3;
                return object;
            }
            catch (ClassCastException classCastException) {
                throw new IOException("cannot recognise object in stream");
            }
        }
        object = new IOException;
        object("Extra data detected in stream");
        throw object;
    }

    A A() {
        return this;
    }

    A B() {
        return this;
    }

    @Override
    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object instanceof g && this.r(((g)object).g());
    }

    @Override
    public final A g() {
        return this;
    }

    @Override
    public abstract int hashCode();

    @Override
    public void n(OutputStream object, String string) throws IOException {
        object = y.b((OutputStream)object, string);
        ((y)object).u(this, true);
        ((y)object).c();
    }

    abstract boolean r(A var1);

    abstract void s(y var1, boolean var2) throws IOException;

    abstract boolean t();

    public void u(OutputStream object) throws IOException {
        object = y.a((OutputStream)object);
        ((y)object).u(this, true);
        ((y)object).c();
    }

    abstract int w(boolean var1) throws IOException;

    public final boolean x(g g8) {
        return this == g8 || g8 != null && this.r(g8.g());
        {
        }
    }

    public final boolean y(A a8) {
        return this == a8 || this.r(a8);
        {
        }
    }
}

