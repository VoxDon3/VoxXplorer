/*
 * Decompiled with CFR 0.152.
 */
package ax.b7;

import ax.i7.E;
import ax.i7.e;
import ax.i7.l;
import ax.i7.p;
import ax.i7.r;
import java.io.IOException;

public final class a
implements l,
r {
    private final boolean a;

    public a() {
        this(false);
    }

    a(boolean bl) {
        this.a = bl;
    }

    private boolean c(p p8) throws IOException {
        String string = p8.i();
        if (string.equals("POST")) {
            return false;
        }
        if (string.equals("GET") ? p8.p().l().length() > 2048 : this.a) {
            return true;
        }
        return p8.n().f(string) ^ true;
    }

    @Override
    public void a(p p8) throws IOException {
        if (this.c(p8)) {
            String string = p8.i();
            p8.z("POST");
            p8.f().B("X-HTTP-Method-Override", string);
            if (string.equals("GET")) {
                p8.t(new E(p8.p().o()));
                p8.p().clear();
                return;
            }
            if (p8.c() == null) {
                p8.t(new e());
            }
        }
    }

    @Override
    public void b(p p8) {
        p8.w(this);
    }
}

