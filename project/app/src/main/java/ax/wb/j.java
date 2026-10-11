/*
 * Decompiled with CFR 0.152.
 */
package ax.wb;

import ax.Fb.p;
import ax.Gb.l;
import ax.wb.i;
import java.io.Serializable;

public final class j
implements i,
Serializable {
    public static final j q = new j();

    private j() {
    }

    @Override
    public <E extends i.b> E a(i.c<E> c8) {
        l.f(c8, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override
    public i m(i.c<?> c8) {
        l.f(c8, "key");
        return this;
    }

    @Override
    public i p(i i8) {
        l.f(i8, "context");
        return i8;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override
    public <R> R v(R r8, p<? super R, ? super i.b, ? extends R> p8) {
        l.f(p8, "operation");
        return r8;
    }
}

