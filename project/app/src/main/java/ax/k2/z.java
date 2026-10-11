/*
 * Decompiled with CFR 0.152.
 */
package ax.k2;

import ax.Gb.l;
import ax.k2.y;
import ax.o2.h;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class z
implements h.c {
    private final String a;
    private final File b;
    private final Callable<InputStream> c;
    private final h.c d;

    public z(String string, File file, Callable<InputStream> callable, h.c c8) {
        l.f(c8, "mDelegate");
        this.a = string;
        this.b = file;
        this.c = callable;
        this.d = c8;
    }

    @Override
    public h a(h.b b8) {
        l.f(b8, "configuration");
        return new y(b8.a, this.a, this.b, this.c, b8.c.a, this.d.a(b8));
    }
}

