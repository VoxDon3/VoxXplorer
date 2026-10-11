package ax.W5;

/* loaded from: classes3.dex */
final class C0 {
    private static final A0 a = new B0();
    private static final A0 b;

    static {
        A0 a0 = null;
        try {
            a0 = (A0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = a0;
    }

    static A0 a() {
        A0 a0 = b;
        if (a0 != null) {
            return a0;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static A0 b() {
        return a;
    }
}
