package ax.K5;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import ax.J5.C0744e;
import ax.K5.a.d;
import ax.K5.g;
import ax.L5.InterfaceC0791c;
import ax.L5.InterfaceC0797i;
import ax.M5.AbstractC0808c;
import ax.M5.C0809d;
import ax.M5.C0821p;
import ax.M5.InterfaceC0815j;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a<O extends d> {
    private final AbstractC0107a a;
    private final g b;
    private final String c;

    /* renamed from: ax.K5.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0107a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, C0809d c0809d, O o, g.a aVar, g.b bVar) {
            return b(context, looper, c0809d, o, aVar, bVar);
        }

        public T b(Context context, Looper looper, C0809d c0809d, O o, InterfaceC0791c interfaceC0791c, InterfaceC0797i interfaceC0797i) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {
        public static final c a = new c(null);

        /* renamed from: ax.K5.a$d$a, reason: collision with other inner class name */
        public interface InterfaceC0108a extends d {
            Account i();
        }

        public interface b extends d {
            GoogleSignInAccount g();
        }

        public static final class c implements d {
            private c() {
            }

            /* synthetic */ c(o oVar) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        boolean a();

        void b();

        void c(InterfaceC0815j interfaceC0815j, Set<Scope> set);

        Set<Scope> d();

        void e(String str);

        boolean f();

        String g();

        void h(AbstractC0808c.InterfaceC0151c interfaceC0151c);

        void i(AbstractC0808c.e eVar);

        boolean j();

        int k();

        C0744e[] l();

        String m();

        boolean o();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public <C extends f> a(String str, AbstractC0107a<C, O> abstractC0107a, g<C> gVar) {
        C0821p.m(abstractC0107a, "Cannot construct an Api with a null ClientBuilder");
        C0821p.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.c = str;
        this.a = abstractC0107a;
        this.b = gVar;
    }

    public final AbstractC0107a a() {
        return this.a;
    }

    public final c b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }
}
