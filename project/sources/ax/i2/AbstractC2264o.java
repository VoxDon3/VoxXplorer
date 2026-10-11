package ax.i2;

import android.view.MotionEvent;

/* renamed from: ax.i2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2264o<K> {

    /* renamed from: ax.i2.o$a */
    public static abstract class a<K> {
        private boolean f(a<?> aVar) {
            K b = b();
            return (b == null ? aVar.b() == null : b.equals(aVar.b())) && a() == aVar.a();
        }

        public abstract int a();

        public abstract K b();

        public boolean c() {
            return b() != null;
        }

        public boolean d(MotionEvent motionEvent) {
            return false;
        }

        public boolean e(MotionEvent motionEvent) {
            return false;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && f((a) obj);
        }

        public int hashCode() {
            return a() >>> 8;
        }
    }

    private static boolean c(a<?> aVar) {
        return (aVar == null || aVar.b() == null) ? false : true;
    }

    public abstract a<K> a(MotionEvent motionEvent);

    final int b(MotionEvent motionEvent) {
        a<K> a2 = a(motionEvent);
        if (a2 != null) {
            return a2.a();
        }
        return -1;
    }

    final boolean d(MotionEvent motionEvent) {
        return e(motionEvent) && a(motionEvent).d(motionEvent);
    }

    final boolean e(MotionEvent motionEvent) {
        return b(motionEvent) != -1;
    }

    protected boolean f(MotionEvent motionEvent) {
        return e(motionEvent) && c(a(motionEvent));
    }
}
