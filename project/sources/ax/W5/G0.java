package ax.W5;

/* loaded from: classes3.dex */
final class G0 implements InterfaceC1035h1 {
    private static final G0 a = new G0();

    private G0() {
    }

    public static G0 a() {
        return a;
    }

    @Override // ax.W5.InterfaceC1035h1
    public final InterfaceC1032g1 b(Class cls) {
        if (!J0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC1032g1) J0.b(cls.asSubclass(J0.class)).o(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // ax.W5.InterfaceC1035h1
    public final boolean c(Class cls) {
        return J0.class.isAssignableFrom(cls);
    }
}
