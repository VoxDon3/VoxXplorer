package ax.q5;

import android.content.Context;
import ax.ib.InterfaceC2296a;
import ax.r5.InterfaceC2958b;

/* loaded from: classes.dex */
public final class l implements InterfaceC2958b<k> {
    private final InterfaceC2296a<Context> a;
    private final InterfaceC2296a<i> b;

    public l(InterfaceC2296a<Context> interfaceC2296a, InterfaceC2296a<i> interfaceC2296a2) {
        this.a = interfaceC2296a;
        this.b = interfaceC2296a2;
    }

    public static l a(InterfaceC2296a<Context> interfaceC2296a, InterfaceC2296a<i> interfaceC2296a2) {
        return new l(interfaceC2296a, interfaceC2296a2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.a.get(), this.b.get());
    }
}
