package ax.p9;

import ax.Q8.h;
import ax.Q8.j;
import ax.Q8.q;
import ax.k9.e;
import ax.p9.InterfaceC2785c;
import ax.r9.C3016b;
import ax.s9.n;
import ax.x9.C3476a;
import java.util.List;

/* renamed from: ax.p9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2786d implements InterfaceC2785c {
    private InterfaceC2785c b;
    private n c;

    /* renamed from: ax.p9.d$a */
    class a implements n {
        final /* synthetic */ InterfaceC2785c b;

        a(InterfaceC2785c interfaceC2785c) {
            this.b = interfaceC2785c;
        }

        @Override // ax.s9.n
        public boolean a(long j) {
            return j == ax.K8.a.STATUS_STOPPED_ON_SYMLINK.getValue() || this.b.a().a(j);
        }
    }

    public C2786d(InterfaceC2785c interfaceC2785c) {
        this.b = interfaceC2785c;
        this.c = new a(interfaceC2785c);
    }

    private static h.d d(h hVar) {
        if (hVar == null) {
            return null;
        }
        for (h.c cVar : hVar.a()) {
            if (cVar instanceof h.d) {
                return (h.d) cVar;
            }
        }
        return null;
    }

    private String e(String str, int i) {
        byte[] a2 = j.a(str);
        return new String(a2, 0, a2.length - i, ax.Y8.b.c);
    }

    private String f(String str, int i) {
        byte[] a2 = j.a(str);
        return new String(a2, a2.length - i, i, ax.Y8.b.c);
    }

    private String g(String str) {
        List<String> d = C3476a.d(str, '\\');
        int i = 0;
        while (i < d.size()) {
            String str2 = d.get(i);
            if (".".equals(str2)) {
                d.remove(i);
            } else if ("..".equals(str2)) {
                if (i > 0) {
                    d.remove(i);
                    i--;
                }
                d.remove(i);
            } else {
                i++;
            }
        }
        return C3476a.b(d, '\\');
    }

    private String h(String str, h.d dVar) {
        String sb;
        int c = dVar.c();
        String f = f(str, c);
        String b = dVar.b();
        if (dVar.d()) {
            sb = b + f;
        } else {
            String e = e(str, c);
            StringBuilder sb2 = new StringBuilder();
            int lastIndexOf = e.lastIndexOf("\\");
            if (lastIndexOf != -1) {
                sb2.append((CharSequence) e, 0, lastIndexOf);
                sb2.append('\\');
            }
            sb2.append(b);
            sb2.append(f);
            sb = sb2.toString();
        }
        return g(sb);
    }

    @Override // ax.p9.InterfaceC2785c
    public n a() {
        return this.c;
    }

    @Override // ax.p9.InterfaceC2785c
    public <T> T b(C3016b c3016b, e eVar, InterfaceC2785c.b<T> bVar) throws C2784b {
        return (T) this.b.b(c3016b, eVar, bVar);
    }

    @Override // ax.p9.InterfaceC2785c
    public <T> T c(C3016b c3016b, q qVar, e eVar, InterfaceC2785c.b<T> bVar) throws C2784b {
        if (qVar.c().m() != ax.K8.a.STATUS_STOPPED_ON_SYMLINK.getValue()) {
            return (T) this.b.c(c3016b, qVar, eVar, bVar);
        }
        h.d d = d(qVar.e());
        if (d != null) {
            return bVar.a(new e(eVar.a(), eVar.c(), h(eVar.b(), d)));
        }
        throw new C2784b(qVar.c().m(), "Create failed for " + eVar + ": missing symlink data");
    }
}
