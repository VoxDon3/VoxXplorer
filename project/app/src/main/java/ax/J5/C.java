/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import ax.J5.A;
import java.lang.ref.WeakReference;

abstract class C
extends A {
    private static final WeakReference g = new WeakReference<Object>(null);
    private WeakReference f = g;

    C(byte[] byArray) {
        super(byArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    final byte[] a2() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                byte[] byArray;
                block3: {
                    try {
                        Object object;
                        byArray = object = (byte[])this.f.get();
                        if (object != null) break block3;
                        byArray = this.b2();
                        object = new WeakReference;
                        object(byArray);
                        this.f = object;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return byArray;
            }
            throw throwable2;
        }
    }

    protected abstract byte[] b2();
}

