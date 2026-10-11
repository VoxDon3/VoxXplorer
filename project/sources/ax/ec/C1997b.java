package ax.ec;

/* renamed from: ax.ec.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1997b extends RuntimeException {
    private String q;

    private C1997b(String str) {
        this.q = str;
    }

    public static C1997b a(Class<? extends InterfaceC1998c> cls) {
        return new C1997b("The expected feature " + cls + " was missing. Use addFeature() in IBusConfiguration to add features.");
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.q;
    }
}
