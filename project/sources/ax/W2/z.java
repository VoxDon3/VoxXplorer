package ax.W2;

import android.text.TextUtils;
import ax.W2.h;
import ax.a3.C1347c;
import ax.a3.EnumC1356l;
import ax.a3.N;
import ax.b3.C1488c;
import ax.c3.d0;
import ax.d3.InterfaceC1931s;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class z extends h {
    private C3596o d;
    private List<AbstractC3595n> e;
    private List<String> f;
    private d g;
    private String h;

    class a implements C1347c.h {
        final /* synthetic */ List a;
        final /* synthetic */ c b;
        final /* synthetic */ z c;
        final /* synthetic */ InterfaceC1931s d;

        a(List list, c cVar, z zVar, InterfaceC1931s interfaceC1931s) {
            this.a = list;
            this.b = cVar;
            this.c = zVar;
            this.d = interfaceC1931s;
        }

        @Override // ax.a3.C1347c.h
        public EnumC1356l a(List<String> list) {
            if (this.a.size() != list.size()) {
                C3184b.f();
                return EnumC1356l.FAILURE_COMMAND_START;
            }
            for (int i = 0; i < this.a.size(); i++) {
                AbstractC3595n abstractC3595n = (AbstractC3595n) this.a.get(i);
                String str = list.get(i);
                String B = abstractC3595n.B();
                if (this.b.a(d0.Q(abstractC3595n.T(), str)) && !d0.F(B, str)) {
                    return EnumC1356l.FAILURE_FILENAME_CONFLICT;
                }
            }
            this.c.r(list);
            try {
                this.d.l(this.c, true);
                return EnumC1356l.SUCCESS;
            } catch (C1488c unused) {
                return EnumC1356l.FAILURE_COMMAND_START;
            }
        }
    }

    class b implements N.d {
        final /* synthetic */ AbstractC3595n a;
        final /* synthetic */ c b;
        final /* synthetic */ z c;
        final /* synthetic */ InterfaceC1931s d;

        b(AbstractC3595n abstractC3595n, c cVar, z zVar, InterfaceC1931s interfaceC1931s) {
            this.a = abstractC3595n;
            this.b = cVar;
            this.c = zVar;
            this.d = interfaceC1931s;
        }

        @Override // ax.a3.N.d
        public EnumC1356l a(String str) {
            C3184b.c(!TextUtils.isEmpty(str));
            String B = this.a.B();
            String Q = d0.Q(this.a.T(), str);
            if (B.equals(str)) {
                return EnumC1356l.SUCCESS;
            }
            if (this.b.a(Q) && !d0.F(B, str)) {
                return EnumC1356l.FAILURE_FILENAME_CONFLICT;
            }
            this.c.r(Collections.singletonList(str));
            try {
                this.d.l(this.c, false);
                return EnumC1356l.SUCCESS;
            } catch (C1488c unused) {
                return EnumC1356l.FAILURE_COMMAND_START;
            }
        }
    }

    public interface c {
        boolean a(String str);
    }

    public enum d {
        SINGLE,
        BATCH
    }

    public static z n() {
        return new z();
    }

    public static void o(C3596o c3596o, String str, List<AbstractC3595n> list, InterfaceC1931s interfaceC1931s, h.a aVar, c cVar) {
        z n = n();
        d dVar = list.size() == 1 ? d.SINGLE : d.BATCH;
        n.k(c3596o, str, list, dVar, aVar);
        if (dVar == d.SINGLE) {
            q(interfaceC1931s, n, cVar);
        } else {
            p(interfaceC1931s, n, cVar);
        }
    }

    private static void p(InterfaceC1931s interfaceC1931s, z zVar, c cVar) {
        C3596o m = zVar.m();
        List<AbstractC3595n> l = zVar.l();
        C1347c t3 = C1347c.t3(m.S(), l);
        t3.E3(new a(l, cVar, zVar, interfaceC1931s));
        interfaceC1931s.A(t3, "rename", true);
    }

    private static void q(InterfaceC1931s interfaceC1931s, z zVar, c cVar) {
        C3596o m = zVar.m();
        AbstractC3595n abstractC3595n = zVar.l().get(0);
        N k3 = N.k3(m.S(), abstractC3595n);
        k3.m3(new b(abstractC3595n, cVar, zVar, interfaceC1931s));
        interfaceC1931s.A(k3, "rename", true);
    }

    @Override // ax.W2.h
    protected j b() {
        return new A(f(), this.d, this.f, this.h, this.e, this.g);
    }

    public void k(C3596o c3596o, String str, List<AbstractC3595n> list, d dVar, h.a aVar) {
        this.d = c3596o;
        this.e = list;
        this.g = dVar;
        this.h = str;
        i(aVar);
        j(h.c.FILLED);
    }

    public List<AbstractC3595n> l() {
        return this.e;
    }

    public C3596o m() {
        return this.d;
    }

    public void r(List<String> list) {
        this.f = list;
    }
}
