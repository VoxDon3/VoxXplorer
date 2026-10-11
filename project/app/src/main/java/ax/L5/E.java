/*
 * Decompiled with CFR 0.152.
 */
package ax.L5;

import ax.B.a;
import ax.K5.c;
import ax.L5.b;
import ax.j6.k;
import java.util.Set;

public final class E {
    private final a a;
    private final a b;
    private final k c;
    private int d;
    private boolean e;

    public final Set a() {
        return this.a.keySet();
    }

    public final void b(b object, ax.J5.c c8, String string) {
        this.a.put(object, c8);
        this.b.put(object, string);
        --this.d;
        if (!c8.C()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                object = new c(this.a);
                this.c.b((Exception)object);
                return;
            }
            this.c.c(this.b);
        }
    }
}

