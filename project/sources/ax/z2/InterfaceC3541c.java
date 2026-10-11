package ax.z2;

import android.app.Activity;
import android.content.Context;
import ax.Fb.l;
import ax.Gb.m;

/* renamed from: ax.z2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3541c {
    public static final a a = a.a;

    /* renamed from: ax.z2.c$a */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static l<? super InterfaceC3541c, ? extends InterfaceC3541c> b = C0506a.q;
        private static final C3542d c = new C3542d(null, 1, 0 == true ? 1 : 0);

        /* renamed from: ax.z2.c$a$a, reason: collision with other inner class name */
        static final class C0506a extends m implements l<InterfaceC3541c, InterfaceC3541c> {
            public static final C0506a q = new C0506a();

            C0506a() {
                super(1);
            }

            @Override // ax.Fb.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC3541c invoke(InterfaceC3541c interfaceC3541c) {
                ax.Gb.l.f(interfaceC3541c, "it");
                return interfaceC3541c;
            }
        }

        private a() {
        }

        public final InterfaceC3541c a() {
            return b.invoke(c);
        }
    }

    C3539a a(Context context);

    C3539a b(Activity activity);
}
