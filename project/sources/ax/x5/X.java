package ax.x5;

import android.content.Context;
import ax.ib.InterfaceC2296a;
import ax.r5.InterfaceC2958b;

/* loaded from: classes.dex */
public final class X implements InterfaceC2958b<W> {
    private final InterfaceC2296a<Context> a;
    private final InterfaceC2296a<String> b;
    private final InterfaceC2296a<Integer> c;

    public X(InterfaceC2296a<Context> interfaceC2296a, InterfaceC2296a<String> interfaceC2296a2, InterfaceC2296a<Integer> interfaceC2296a3) {
        this.a = interfaceC2296a;
        this.b = interfaceC2296a2;
        this.c = interfaceC2296a3;
    }

    public static X a(InterfaceC2296a<Context> interfaceC2296a, InterfaceC2296a<String> interfaceC2296a2, InterfaceC2296a<Integer> interfaceC2296a3) {
        return new X(interfaceC2296a, interfaceC2296a2, interfaceC2296a3);
    }

    public static W c(Context context, String str, int i) {
        return new W(context, str, i);
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public W get() {
        return c(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
