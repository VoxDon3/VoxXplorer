/*
 * Decompiled with CFR 0.152.
 */
package ax.l7;

import ax.l7.c;
import ax.m7.B;
import ax.m7.k;
import java.io.IOException;

public class b
extends k
implements Cloneable {
    private c e0;

    public b i() {
        return (b)super.b();
    }

    public b j(String string, Object object) {
        return (b)super.f(string, object);
    }

    public final void k(c c8) {
        this.e0 = c8;
    }

    public String l() throws IOException {
        c c8 = this.e0;
        if (c8 != null) {
            return c8.f(this);
        }
        return super.toString();
    }

    @Override
    public String toString() {
        Object object = this.e0;
        if (object != null) {
            try {
                object = ((c)object).g(this);
                return object;
            }
            catch (IOException iOException) {
                throw B.a(iOException);
            }
        }
        return super.toString();
    }
}

