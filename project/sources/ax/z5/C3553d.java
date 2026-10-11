package ax.z5;

import ax.r5.C2960d;
import ax.r5.InterfaceC2958b;

/* renamed from: ax.z5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3553d implements InterfaceC2958b<InterfaceC3550a> {

    /* renamed from: ax.z5.d$a */
    private static final class a {
        private static final C3553d a = new C3553d();
    }

    public static C3553d a() {
        return a.a;
    }

    public static InterfaceC3550a c() {
        return (InterfaceC3550a) C2960d.d(AbstractC3551b.b());
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3550a get() {
        return c();
    }
}
