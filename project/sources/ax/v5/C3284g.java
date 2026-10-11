package ax.v5;

import ax.ib.InterfaceC2296a;
import ax.r5.C2960d;
import ax.r5.InterfaceC2958b;
import ax.w5.AbstractC3352f;
import ax.z5.InterfaceC3550a;

/* renamed from: ax.v5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3284g implements InterfaceC2958b<AbstractC3352f> {
    private final InterfaceC2296a<InterfaceC3550a> a;

    public C3284g(InterfaceC2296a<InterfaceC3550a> interfaceC2296a) {
        this.a = interfaceC2296a;
    }

    public static AbstractC3352f a(InterfaceC3550a interfaceC3550a) {
        return (AbstractC3352f) C2960d.d(AbstractC3283f.a(interfaceC3550a));
    }

    public static C3284g b(InterfaceC2296a<InterfaceC3550a> interfaceC2296a) {
        return new C3284g(interfaceC2296a);
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC3352f get() {
        return a(this.a.get());
    }
}
