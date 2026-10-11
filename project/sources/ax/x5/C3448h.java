package ax.x5;

import android.content.Context;
import ax.ib.InterfaceC2296a;
import ax.r5.C2960d;
import ax.r5.InterfaceC2958b;

/* renamed from: ax.x5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3448h implements InterfaceC2958b<String> {
    private final InterfaceC2296a<Context> a;

    public C3448h(InterfaceC2296a<Context> interfaceC2296a) {
        this.a = interfaceC2296a;
    }

    public static C3448h a(InterfaceC2296a<Context> interfaceC2296a) {
        return new C3448h(interfaceC2296a);
    }

    public static String c(Context context) {
        return (String) C2960d.d(AbstractC3446f.b(context));
    }

    @Override // ax.ib.InterfaceC2296a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.a.get());
    }
}
