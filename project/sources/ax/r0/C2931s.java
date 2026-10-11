package ax.r0;

/* renamed from: ax.r0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2931s {
    private static final AbstractC2930q<?> a = new r();
    private static final AbstractC2930q<?> b = c();

    static AbstractC2930q<?> a() {
        AbstractC2930q<?> abstractC2930q = b;
        if (abstractC2930q != null) {
            return abstractC2930q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static AbstractC2930q<?> b() {
        return a;
    }

    private static AbstractC2930q<?> c() {
        try {
            return (AbstractC2930q) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
