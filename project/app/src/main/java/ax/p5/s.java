/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.n5.b;
import ax.n5.c;
import ax.n5.g;
import ax.n5.h;
import ax.n5.j;
import ax.p5.o;
import ax.p5.p;
import ax.p5.r;
import ax.p5.t;

final class s<T>
implements h<T> {
    private final p a;
    private final String b;
    private final b c;
    private final g<T, byte[]> d;
    private final t e;

    s(p p8, String string, b b8, g<T, byte[]> g8, t t8) {
        this.a = p8;
        this.b = string;
        this.c = b8;
        this.d = g8;
        this.e = t8;
    }

    public static /* synthetic */ void c(Exception exception) {
    }

    @Override
    public void a(c<T> c8) {
        this.b(c8, new r());
    }

    @Override
    public void b(c<T> c8, j j8) {
        this.e.a(o.a().e(this.a).c(c8).f(this.b).d(this.d).b(this.c).a(), j8);
    }

    p d() {
        return this.a;
    }
}

