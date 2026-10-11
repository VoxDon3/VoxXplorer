package ax.f8;

/* renamed from: ax.f8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2084b implements InterfaceC2083a {
    private static C2084b a;

    private C2084b() {
    }

    public static C2084b b() {
        if (a == null) {
            a = new C2084b();
        }
        return a;
    }

    @Override // ax.f8.InterfaceC2083a
    public long a() {
        return System.currentTimeMillis();
    }
}
