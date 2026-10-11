/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import sun.misc.Unsafe;

abstract class W1 {
    final Unsafe a;

    W1(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(Object var1, long var2);

    public abstract float b(Object var1, long var2);

    public abstract void c(Object var1, long var2, boolean var4);

    public abstract void d(Object var1, long var2, double var4);

    public abstract void e(Object var1, long var2, float var4);

    public abstract boolean f(Object var1, long var2);
}

