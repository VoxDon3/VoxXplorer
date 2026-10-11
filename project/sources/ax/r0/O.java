package ax.r0;

/* loaded from: classes.dex */
final class O {
    private static final M a = c();
    private static final M b = new N();

    static M a() {
        return a;
    }

    static M b() {
        return b;
    }

    private static M c() {
        try {
            return (M) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
