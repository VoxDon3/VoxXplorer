package ax.v5;

import android.content.Context;
import ax.ib.InterfaceC2296a;
import ax.r5.C2960d;
import ax.r5.InterfaceC2958b;
import ax.w5.AbstractC3352f;
import ax.w5.InterfaceC3370x;
import ax.x5.InterfaceC3444d;
import ax.z5.InterfaceC3550a;

/* renamed from: ax.v5.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3286i implements InterfaceC2958b<InterfaceC3370x> {
    private final InterfaceC2296a<Context> a;
    private final InterfaceC2296a<InterfaceC3444d> b;
    private final InterfaceC2296a<AbstractC3352f> c;
    private final InterfaceC2296a<InterfaceC3550a> d;

    public C3286i(InterfaceC2296a<Context> interfaceC2296a, InterfaceC2296a<InterfaceC3444d> interfaceC2296a2, InterfaceC2296a<AbstractC3352f> interfaceC2296a3, InterfaceC2296a<InterfaceC3550a> interfaceC2296a4) {
        this.a = interfaceC2296a;
        this.b = interfaceC2296a2;
        this.c = interfaceC2296a3;
        this.d = interfaceC2296a4;
    }

    public static C3286i a(InterfaceC2296a<Context> interfaceC2296a, InterfaceC2296a<InterfaceC3444d> interfaceC2296a2, InterfaceC2296a<AbstractC3352f> interfaceC2296a3, InterfaceC2296a<InterfaceC3550a> interfaceC2296a4) {
        return new C3286i(interfaceC2296a, interfaceC2296a2, interfaceC2296a3, interfaceC2296a4);
    }

    public static InterfaceC3370x c(Context context, InterfaceC3444d interfaceC3444d, AbstractC3352f abstractC3352f, InterfaceC3550a interfaceC3550a) {
        return (InterfaceC3370x) C2960d.d(AbstractC3285h.a(context, interfaceC3444d, abstractC3352f, interfaceC3550a));
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC3370x get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
