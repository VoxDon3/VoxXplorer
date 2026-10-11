/*
 * Decompiled with CFR 0.152.
 */
package ax.k7;

import ax.l7.c;
import ax.l7.d;
import ax.m7.v;
import java.io.IOException;
import java.io.OutputStream;

public class a
extends ax.i7.a {
    private final Object c;
    private final c d;
    private String e;

    public a(c c8, Object object) {
        super("application/json; charset=UTF-8");
        this.d = v.d(c8);
        this.c = v.d(object);
    }

    @Override
    public void b(OutputStream closeable) throws IOException {
        closeable = this.d.a((OutputStream)closeable, this.f());
        if (this.e != null) {
            ((d)closeable).F();
            ((d)closeable).g(this.e);
        }
        ((d)closeable).b(this.c);
        if (this.e != null) {
            ((d)closeable).f();
        }
        ((d)closeable).flush();
    }

    public a h(String string) {
        this.e = string;
        return this;
    }
}

