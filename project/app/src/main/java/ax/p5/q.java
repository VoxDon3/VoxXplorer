/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import ax.n5.b;
import ax.n5.g;
import ax.n5.h;
import ax.n5.i;
import ax.p5.p;
import ax.p5.s;
import ax.p5.t;
import java.util.Set;

final class q
implements i {
    private final Set<b> a;
    private final p b;
    private final t c;

    q(Set<b> set, p p8, t t8) {
        this.a = set;
        this.b = p8;
        this.c = t8;
    }

    @Override
    public <T> h<T> a(String string, Class<T> clazz, b b8, g<T, byte[]> g8) {
        if (this.a.contains(b8)) {
            return new s<T>(this.b, string, b8, g8, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", b8, this.a));
    }
}

