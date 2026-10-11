/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.i7.g;
import ax.i7.i;
import ax.i7.p;
import ax.i7.r;
import ax.i7.w;
import java.io.IOException;

public final class q {
    private final w a;
    private final r b;

    q(w w8, r r8) {
        this.a = w8;
        this.b = r8;
    }

    public p a(g g8) throws IOException {
        return this.c("GET", g8, null);
    }

    public p b(g g8, i i8) throws IOException {
        return this.c("PUT", g8, i8);
    }

    public p c(String string, g object, i i8) throws IOException {
        p p8 = this.a.a();
        if (object != null) {
            p8.E((g)object);
        }
        if ((object = this.b) != null) {
            object.b(p8);
        }
        p8.z(string);
        if (i8 != null) {
            p8.t(i8);
        }
        return p8;
    }

    public r d() {
        return this.b;
    }

    public w e() {
        return this.a;
    }
}

