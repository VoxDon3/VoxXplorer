package ax.W5;

/* renamed from: ax.W5.f1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1029f1 {
    private static final C1026e1 a;
    private static final C1026e1 b;

    static {
        C1026e1 c1026e1 = null;
        try {
            c1026e1 = (C1026e1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c1026e1;
        b = new C1026e1();
    }

    static C1026e1 a() {
        return a;
    }

    static C1026e1 b() {
        return b;
    }
}
