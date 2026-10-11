package ax.q5;

import android.content.Context;
import ax.ib.InterfaceC2296a;
import ax.r5.InterfaceC2958b;
import ax.z5.InterfaceC3550a;

/* loaded from: classes.dex */
public final class j implements InterfaceC2958b<i> {
    private final InterfaceC2296a<Context> a;
    private final InterfaceC2296a<InterfaceC3550a> b;
    private final InterfaceC2296a<InterfaceC3550a> c;

    public j(InterfaceC2296a<Context> interfaceC2296a, InterfaceC2296a<InterfaceC3550a> interfaceC2296a2, InterfaceC2296a<InterfaceC3550a> interfaceC2296a3) {
        this.a = interfaceC2296a;
        this.b = interfaceC2296a2;
        this.c = interfaceC2296a3;
    }

    public static j a(InterfaceC2296a<Context> interfaceC2296a, InterfaceC2296a<InterfaceC3550a> interfaceC2296a2, InterfaceC2296a<InterfaceC3550a> interfaceC2296a3) {
        return new j(interfaceC2296a, interfaceC2296a2, interfaceC2296a3);
    }

    public static i c(Context context, InterfaceC3550a interfaceC3550a, InterfaceC3550a interfaceC3550a2) {
        return new i(context, interfaceC3550a, interfaceC3550a2);
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
