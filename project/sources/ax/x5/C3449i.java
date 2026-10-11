package ax.x5;

import ax.r5.InterfaceC2958b;

/* renamed from: ax.x5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3449i implements InterfaceC2958b<Integer> {

    /* renamed from: ax.x5.i$a */
    private static final class a {
        private static final C3449i a = new C3449i();
    }

    public static C3449i a() {
        return a.a;
    }

    public static int c() {
        return AbstractC3446f.c();
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer get() {
        return Integer.valueOf(c());
    }
}
