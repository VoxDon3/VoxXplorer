package ax.r7;

/* renamed from: ax.r7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2975i {
    static void a(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    static int b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    static void c(boolean z) {
        ax.q7.n.u(z, "no calls to next() since the last call to remove()");
    }
}
