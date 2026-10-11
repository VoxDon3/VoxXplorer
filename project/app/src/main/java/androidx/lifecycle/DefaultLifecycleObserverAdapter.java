/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import ax.G0.c;
import ax.G0.h;
import ax.Gb.l;

public final class DefaultLifecycleObserverAdapter
implements f {
    private final f c0;
    private final c q;

    public DefaultLifecycleObserverAdapter(c c8, f f8) {
        l.f(c8, "defaultLifecycleObserver");
        this.q = c8;
        this.c0 = f8;
    }

    @Override
    public void b(h h8, d.a a8) {
        l.f(h8, "source");
        l.f((Object)a8, "event");
        switch (a.a[a8.ordinal()]) {
            default: {
                break;
            }
            case 7: {
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            }
            case 6: {
                this.q.f(h8);
                break;
            }
            case 5: {
                this.q.a(h8);
                break;
            }
            case 4: {
                this.q.e(h8);
                break;
            }
            case 3: {
                this.q.d(h8);
                break;
            }
            case 2: {
                this.q.g(h8);
                break;
            }
            case 1: {
                this.q.c(h8);
            }
        }
        f f8 = this.c0;
        if (f8 != null) {
            f8.b(h8, a8);
        }
    }

    public final class a {
        public static final int[] a;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            int[] nArray = new int[d.a.values().length];
            try {
                nArray[d.a.ON_CREATE.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[d.a.ON_START.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[d.a.ON_RESUME.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[d.a.ON_PAUSE.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[d.a.ON_STOP.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[d.a.ON_DESTROY.ordinal()] = 6;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            try {
                nArray[d.a.ON_ANY.ordinal()] = 7;
            }
            catch (NoSuchFieldError noSuchFieldError) {}
            a = nArray;
        }
    }
}

