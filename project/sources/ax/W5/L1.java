package ax.W5;

/* loaded from: classes3.dex */
public final class L1 extends RuntimeException {
    public L1(InterfaceC1041j1 interfaceC1041j1) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final P0 a() {
        return new P0(getMessage());
    }
}
