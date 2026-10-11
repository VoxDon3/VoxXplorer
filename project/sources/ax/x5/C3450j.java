package ax.x5;

import ax.r5.C2960d;
import ax.r5.InterfaceC2958b;

/* renamed from: ax.x5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3450j implements InterfaceC2958b<AbstractC3445e> {

    /* renamed from: ax.x5.j$a */
    private static final class a {
        private static final C3450j a = new C3450j();
    }

    public static C3450j a() {
        return a.a;
    }

    public static AbstractC3445e c() {
        return (AbstractC3445e) C2960d.d(AbstractC3446f.d());
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC3445e get() {
        return c();
    }
}
