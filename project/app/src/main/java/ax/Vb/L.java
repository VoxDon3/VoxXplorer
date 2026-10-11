/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Gb.l;
import ax.Vb.M;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class L<T extends M & Comparable<? super T>> {
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(L.class, "_size");
    private volatile int _size;
    private T[] a;

    private final T[] f() {
        T[] TArray = this.a;
        if (TArray == null) {
            M[] mArray = new M[4];
            this.a = mArray;
            return mArray;
        }
        Object[] objectArray = TArray;
        if (this.c() >= TArray.length) {
            objectArray = Arrays.copyOf(TArray, this.c() * 2);
            l.e(objectArray, "copyOf(this, newSize)");
            this.a = objectArray = (M[])objectArray;
        }
        return objectArray;
    }

    private final void j(int n8) {
        b.set(this, n8);
    }

    private final void k(int n8) {
        int n9 = n8;
        while (true) {
            block7: {
                block6: {
                    Object object;
                    int n10;
                    if ((n8 = (n10 = n9 * 2) + 1) >= this.c()) break block6;
                    Object object2 = this.a;
                    l.c(object2);
                    if ((n10 += 2) < this.c()) {
                        object = object2[n10];
                        l.c(object);
                        object = (Comparable)object;
                        T t8 = object2[n8];
                        l.c(t8);
                        if (object.compareTo(t8) < 0) {
                            n8 = n10;
                        }
                    }
                    object = object2[n9];
                    l.c(object);
                    object = (Comparable)object;
                    object2 = object2[n8];
                    l.c(object2);
                    if (object.compareTo(object2) > 0) break block7;
                }
                return;
            }
            this.m(n9, n8);
            n9 = n8;
        }
    }

    private final void l(int n8) {
        while (true) {
            int n9;
            block4: {
                block3: {
                    if (n8 <= 0) break block3;
                    Object object = this.a;
                    l.c(object);
                    n9 = (n8 - 1) / 2;
                    Object object2 = object[n9];
                    l.c(object2);
                    object2 = (Comparable)object2;
                    object = object[n8];
                    l.c(object);
                    if (object2.compareTo(object) > 0) break block4;
                }
                return;
            }
            this.m(n8, n9);
            n8 = n9;
        }
    }

    private final void m(int n8, int n9) {
        T[] TArray = this.a;
        l.c(TArray);
        T t8 = TArray[n9];
        l.c(t8);
        T t9 = TArray[n8];
        l.c(t9);
        TArray[n8] = t8;
        TArray[n9] = t9;
        t8.n(n8);
        t9.n(n9);
    }

    public final void a(T t8) {
        t8.l(this);
        M[] mArray = this.f();
        int n8 = this.c();
        this.j(n8 + 1);
        mArray[n8] = t8;
        t8.n(n8);
        this.l(n8);
    }

    public final T b() {
        T[] TArray = this.a;
        if (TArray != null) {
            return TArray[0];
        }
        return null;
    }

    public final int c() {
        return b.get(this);
    }

    public final boolean d() {
        return this.c() == 0;
    }

    public final T e() {
        synchronized (this) {
            T t8 = this.b();
            return t8;
        }
    }

    public final boolean g(T t8) {
        synchronized (this) {
            boolean bl;
            block5: {
                block4: {
                    if (t8.j() != null) break block4;
                    bl = false;
                    break block5;
                }
                this.h(t8.p());
                bl = true;
            }
            return bl;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final T h(int var1_1) {
        block2: {
            var3_2 = this.a;
            l.c(var3_2);
            this.j(this.c() - 1);
            if (var1_1 >= this.c()) break block2;
            this.m(var1_1, this.c());
            var2_3 = (var1_1 - 1) / 2;
            if (var1_1 <= 0) ** GOTO lbl-1000
            var4_4 = var3_2[var1_1];
            l.c(var4_4);
            var4_4 = (Comparable)var4_4;
            var5_5 = var3_2[var2_3];
            l.c(var5_5);
            if (var4_4.compareTo(var5_5) < 0) {
                this.m(var1_1, var2_3);
                this.l(var2_3);
            } else lbl-1000:
            // 2 sources

            {
                this.k(var1_1);
            }
        }
        var4_4 = var3_2[this.c()];
        l.c(var4_4);
        var4_4.l(null);
        var4_4.n(-1);
        var3_2[this.c()] = null;
        return (T)var4_4;
    }

    public final T i() {
        synchronized (this) {
            Throwable throwable2;
            block3: {
                T t8;
                try {
                    t8 = this.c() > 0 ? (T)this.h(0) : null;
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                return t8;
            }
            throw throwable2;
        }
    }
}

