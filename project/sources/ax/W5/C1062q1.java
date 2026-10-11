package ax.W5;

/* renamed from: ax.W5.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1062q1 {
    private static final C1059p1 a;
    private static final C1059p1 b;

    static {
        C1059p1 c1059p1 = null;
        try {
            c1059p1 = (C1059p1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = c1059p1;
        b = new C1059p1();
    }

    static C1059p1 a() {
        return a;
    }

    static C1059p1 b() {
        return b;
    }
}
