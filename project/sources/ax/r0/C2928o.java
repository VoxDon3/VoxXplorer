package ax.r0;

/* renamed from: ax.r0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2928o {
    static final Class<?> a = c();

    public static C2929p a() {
        if (a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C2929p.e;
    }

    private static final C2929p b(String str) throws Exception {
        return (C2929p) a.getDeclaredMethod(str, null).invoke(null, null);
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
