package ax.r0;

/* renamed from: ax.r0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2917d {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b;

    static {
        b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return a;
    }

    static boolean c() {
        return (a == null || b) ? false : true;
    }
}
