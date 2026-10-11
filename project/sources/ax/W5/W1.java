package ax.W5;

import sun.misc.Unsafe;

/* loaded from: classes3.dex */
abstract class W1 {
    final Unsafe a;

    W1(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(Object obj, long j);

    public abstract float b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z);

    public abstract void d(Object obj, long j, double d);

    public abstract void e(Object obj, long j, float f);

    public abstract boolean f(Object obj, long j);
}
