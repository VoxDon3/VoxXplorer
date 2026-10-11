package ax.x5;

import ax.r5.C2960d;
import ax.r5.InterfaceC2958b;

/* renamed from: ax.x5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3447g implements InterfaceC2958b<String> {

    /* renamed from: ax.x5.g$a */
    private static final class a {
        private static final C3447g a = new C3447g();
    }

    public static C3447g a() {
        return a.a;
    }

    public static String b() {
        return (String) C2960d.d(AbstractC3446f.a());
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
