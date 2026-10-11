package ax.h8;

import android.content.Context;
import ax.D7.C0661c;
import ax.D7.InterfaceC0663e;
import ax.D7.r;

/* loaded from: classes3.dex */
public class h {

    public interface a<T> {
        String a(T t);
    }

    public static C0661c<?> b(String str, String str2) {
        return C0661c.l(f.a(str, str2), f.class);
    }

    public static C0661c<?> c(final String str, final a<Context> aVar) {
        return C0661c.m(f.class).b(r.j(Context.class)).e(new ax.D7.h() { // from class: ax.h8.g
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                f a2;
                a2 = f.a(str, aVar.a((Context) interfaceC0663e.a(Context.class)));
                return a2;
            }
        }).c();
    }
}
