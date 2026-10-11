package ax.r0;

/* loaded from: classes.dex */
final class Z {
    private static final X a = c();
    private static final X b = new Y();

    static X a() {
        return a;
    }

    static X b() {
        return b;
    }

    private static X c() {
        try {
            return (X) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
