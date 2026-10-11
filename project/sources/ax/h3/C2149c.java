package ax.h3;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import ax.Q2.f;
import ax.Z2.k;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1829q;
import ax.c3.C1835x;
import ax.d3.AbstractC1927n;
import ax.d3.E;
import ax.t3.e;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.InterfaceC3584c;
import com.example.android.uamp.MusicService;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: ax.h3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2149c {
    private static final Logger a = Logger.getLogger("FileManager.MusicPlayerControl");
    private static b b;

    /* renamed from: ax.h3.c$b */
    private static class b extends AbstractC3199q<Void, Integer, List<AbstractC3595n>> {
        private C3596o h;
        private k i;
        private C2148b j;
        private AbstractC3595n k;
        private Context l;
        private com.voxdon.xplorer.activity.b m;

        /* renamed from: ax.h3.c$b$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.h.k0(false);
            }
        }

        b(Context context, com.voxdon.xplorer.activity.b bVar, C3596o c3596o, C2148b c2148b, k kVar) {
            super(AbstractC3199q.e.HIGHER);
            this.h = c3596o;
            this.j = c2148b;
            this.i = kVar;
            this.l = context;
            this.m = bVar;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            b unused = C2149c.b = null;
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            this.h.n0();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public List<AbstractC3595n> g(Void... voidArr) {
            try {
                AbstractC3595n z = this.h.z(this.i.e());
                this.k = z;
                if (!z.n()) {
                    this.k = null;
                    return null;
                }
                String str = this.j.b;
                if (str != null) {
                    AbstractC3595n z2 = this.h.z(k.a(Uri.parse(str)).e());
                    if (z2.n()) {
                        List<AbstractC3595n> f0 = this.h.f0(z2);
                        if (f0 != null) {
                            f S = this.h.S();
                            int y = this.h.y();
                            f0 = C1809B.h(f0, null, e.h(this.l, S, y, z2.E(), false), C1809B.P(z2));
                            String F7 = E.F7(this.l, S, y, z2.E(), false);
                            if (F7 != null) {
                                return C1829q.g(f0, C1829q.c(F7));
                            }
                        }
                        return f0;
                    }
                }
                return null;
            } catch (C1495j e) {
                e = e;
                e.printStackTrace();
                return null;
            } catch (IllegalArgumentException e2) {
                e = e2;
                e.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(List<AbstractC3595n> list) {
            String str;
            if (this.k != null) {
                Logger logger = C2149c.a;
                StringBuilder sb = new StringBuilder();
                sb.append("media file info : ");
                sb.append(this.k.E());
                sb.append(",size=");
                if (list != null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET + list.size();
                } else {
                    str = "0";
                }
                sb.append(str);
                sb.append(",position:");
                sb.append(this.j.d);
                logger.fine(sb.toString());
                com.voxdon.xplorer.activity.b bVar = this.m;
                AbstractC3595n abstractC3595n = this.k;
                C2148b c2148b = this.j;
                bVar.A0(abstractC3595n, c2148b.b, list, c2148b.d);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new a(), 1500L);
            b unused = C2149c.b = null;
        }
    }

    public static void d(AbstractC1927n abstractC1927n, long j) {
        if (abstractC1927n.v3() == null || abstractC1927n.v3().f0() != null || MusicService.H()) {
            return;
        }
        f(abstractC1927n.v3(), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Context context, com.voxdon.xplorer.activity.b bVar, C3596o c3596o, C2148b c2148b, k kVar) {
        if (AbstractC3199q.n(b)) {
            return;
        }
        b bVar2 = new b(context, bVar, c3596o, c2148b, kVar);
        b = bVar2;
        bVar2.i(new Void[0]);
    }

    private static void f(com.voxdon.xplorer.activity.b bVar, long j) {
        k c;
        C2148b b2 = C2148b.b(bVar);
        b2.g();
        if (!b2.e() || b2.f(j) || (c = b2.c()) == null) {
            return;
        }
        C3596o e = C1835x.e(c.d());
        if (e.a()) {
            e(bVar, bVar, e, b2, c);
        } else {
            if (e.S() == f.X0) {
                return;
            }
            e.h(new a(bVar, bVar, e, b2, c));
        }
    }

    /* renamed from: ax.h3.c$a */
    class a implements InterfaceC3584c.a {
        final /* synthetic */ Context a;
        final /* synthetic */ com.voxdon.xplorer.activity.b b;
        final /* synthetic */ C3596o c;
        final /* synthetic */ C2148b d;
        final /* synthetic */ k e;

        a(Context context, com.voxdon.xplorer.activity.b bVar, C3596o c3596o, C2148b c2148b, k kVar) {
            this.a = context;
            this.b = bVar;
            this.c = c3596o;
            this.d = c2148b;
            this.e = kVar;
        }

        @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
        public void T(boolean z, Object obj) {
            if (z) {
                C2149c.e(this.a, this.b, this.c, this.d, this.e);
            }
        }

        @Override // com.voxdon.xplorer.file.InterfaceC3584c.a
        public void B() {
        }
    }
}
