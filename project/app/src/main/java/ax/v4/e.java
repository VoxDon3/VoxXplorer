/*
 * Decompiled with CFR 0.152.
 */
package ax.v4;

import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.v4.a;
import java.io.IOException;

public abstract class e<T>
extends a<T> {
    @Override
    public T a(j j8) throws IOException, i {
        return this.s(j8, false);
    }

    @Override
    public void k(T t8, g g8) throws IOException, f {
        this.t(t8, g8, false);
    }

    public abstract T s(j var1, boolean var2) throws IOException, i;

    public abstract void t(T var1, g var2, boolean var3) throws IOException, f;
}

