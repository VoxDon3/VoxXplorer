/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.view.MotionEvent;

public abstract class o<K> {
    private static boolean c(a<?> a8) {
        return a8 != null && a8.b() != null;
    }

    public abstract a<K> a(MotionEvent var1);

    final int b(MotionEvent object) {
        if ((object = this.a((MotionEvent)object)) != null) {
            return ((a)object).a();
        }
        return -1;
    }

    final boolean d(MotionEvent motionEvent) {
        return this.e(motionEvent) && this.a(motionEvent).d(motionEvent);
    }

    final boolean e(MotionEvent motionEvent) {
        return this.b(motionEvent) != -1;
    }

    protected boolean f(MotionEvent motionEvent) {
        return this.e(motionEvent) && o.c(this.a(motionEvent));
    }

    public static abstract class a<K> {
        private boolean f(a<?> a8) {
            K k8 = this.b();
            boolean bl = k8 == null ? a8.b() == null : k8.equals(a8.b());
            return bl && this.a() == a8.a();
        }

        public abstract int a();

        public abstract K b();

        public boolean c() {
            return this.b() != null;
        }

        public boolean d(MotionEvent motionEvent) {
            return false;
        }

        public boolean e(MotionEvent motionEvent) {
            return false;
        }

        public boolean equals(Object object) {
            return object instanceof a && this.f((a)object);
        }

        public int hashCode() {
            return this.a() >>> 8;
        }
    }
}

