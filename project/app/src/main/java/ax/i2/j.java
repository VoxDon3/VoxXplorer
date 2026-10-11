/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import ax.i2.o;

public abstract class j<K> {
    static <K> j<K> e() {
        return new j<K>(){

            @Override
            public void a() {
            }

            @Override
            public void b(o.a<K> a8) {
            }

            @Override
            public int c() {
                return -1;
            }

            @Override
            public boolean d() {
                return false;
            }
        };
    }

    public abstract void a();

    public abstract void b(o.a<K> var1);

    public abstract int c();

    public abstract boolean d();
}

