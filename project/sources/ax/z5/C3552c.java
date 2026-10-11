package ax.z5;

import ax.r5.C2960d;
import ax.r5.InterfaceC2958b;

/* renamed from: ax.z5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3552c implements InterfaceC2958b<InterfaceC3550a> {

    /* renamed from: ax.z5.c$a */
    private static final class a {
        private static final C3552c a = new C3552c();
    }

    public static C3552c a() {
        return a.a;
    }

    public static InterfaceC3550a b() {
        return (InterfaceC3550a) C2960d.d(AbstractC3551b.a());
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC3550a get() {
        return b();
    }
}
