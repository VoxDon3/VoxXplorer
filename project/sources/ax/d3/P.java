package ax.d3;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import ax.W2.C1011c;
import ax.W2.h;
import ax.a3.C1360p;
import ax.a3.EnumC1356l;
import ax.b3.C1488c;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1835x;
import ax.h3.C2149c;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3601u;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class P extends E {
    private static final Logger t2 = ax.Q2.g.a(E.class);
    private ax.Q2.f s2;

    class a implements h.a {
        final /* synthetic */ AtomicReference a;
        final /* synthetic */ ax.W2.m b;
        final /* synthetic */ String c;

        a(AtomicReference atomicReference, ax.W2.m mVar, String str) {
            this.a = atomicReference;
            this.b = mVar;
            this.c = str;
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            AbstractC3595n abstractC3595n;
            try {
                abstractC3595n = P.this.w7().z(ax.c3.d0.Q(this.c, (String) this.a.get()));
            } catch (C1495j unused) {
                abstractC3595n = null;
            }
            if (abstractC3595n != null && abstractC3595n.n()) {
                boolean va = P.this.va(abstractC3595n);
                P.this.j9();
                if (va) {
                    return;
                }
            }
            P.this.y4(bVar, str, str2, arrayList);
        }

        @Override // ax.W2.h.a
        public void b() {
            this.a.set(this.b.l());
        }
    }

    class b implements C1360p.d {
        final /* synthetic */ ax.W2.m a;
        final /* synthetic */ boolean b;

        b(ax.W2.m mVar, boolean z) {
            this.a = mVar;
            this.b = z;
        }

        @Override // ax.a3.C1360p.d
        public EnumC1356l a(String str) {
            AbstractC3595n abstractC3595n;
            C3184b.c(!TextUtils.isEmpty(str));
            String Q = ax.c3.d0.Q(this.a.m(), str);
            if (P.this.C3() != null && P.this.c1.X(Q)) {
                return EnumC1356l.FAILURE_FILENAME_CONFLICT;
            }
            try {
                abstractC3595n = P.this.w7().z(Q);
            } catch (C1495j unused) {
                abstractC3595n = null;
            }
            if (abstractC3595n != null && abstractC3595n.n() && this.b) {
                ((C3601u) P.this.w7().u()).U1(abstractC3595n);
                P.this.va(abstractC3595n);
                P.this.j9();
                return EnumC1356l.SUCCESS;
            }
            this.a.o(str);
            try {
                P.this.l(this.a, false);
                return EnumC1356l.SUCCESS;
            } catch (C1488c unused2) {
                return EnumC1356l.FAILURE_COMMAND_START;
            }
        }
    }

    class c implements d {
        final /* synthetic */ int a;

        c(int i) {
            this.a = i;
        }

        @Override // ax.d3.P.d
        public void a(List<AbstractC3595n> list) {
            P.super.c7(list, this.a);
        }
    }

    interface d {
        void a(List<AbstractC3595n> list);
    }

    private class e extends AbstractC3199q<Void, Integer, List<AbstractC3595n>> {
        List<AbstractC3595n> h;
        d i;

        e(List<AbstractC3595n> list, d dVar) {
            super(AbstractC3199q.e.HIGHER);
            this.h = list;
            this.i = dVar;
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            P.this.W9(true);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public List<AbstractC3595n> g(Void... voidArr) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC3595n abstractC3595n : this.h) {
                if (abstractC3595n.isDirectory()) {
                    try {
                        String E = abstractC3595n.E();
                        C3596o g = C1835x.g(E);
                        int size = g.f0(g.z(E)).size();
                        List<AbstractC3595n> f0 = P.this.w7().f0(abstractC3595n);
                        if (f0.size() == size) {
                            arrayList.add(abstractC3595n);
                        } else {
                            arrayList.addAll(f0);
                            C3601u.V1(P.this.w7().u(), abstractC3595n);
                        }
                    } catch (C1495j unused) {
                        arrayList.add(abstractC3595n);
                    }
                } else {
                    arrayList.add(abstractC3595n);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(List<AbstractC3595n> list) {
            P.this.W9(false);
            this.i.a(list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean va(AbstractC3595n abstractC3595n) {
        AbstractC3595n wa = wa();
        List<AbstractC3595n> g = ax.Z2.b.k().g(wa);
        if (g == null) {
            return false;
        }
        Iterator<AbstractC3595n> it = g.iterator();
        while (it.hasNext()) {
            if (it.next().E().equals(abstractC3595n.E())) {
                return false;
            }
        }
        ArrayList arrayList = new ArrayList(g);
        arrayList.add(abstractC3595n);
        ax.Z2.b.k().m(wa, arrayList);
        return true;
    }

    private AbstractC3595n wa() {
        if (v7() != null && ax.c3.d0.E(v7())) {
            return v7();
        }
        try {
            return w7().z(A3().e());
        } catch (C1495j unused) {
            ax.Ha.c.h().d("GET LIBRARY ROOT FAILED").h();
            return null;
        }
    }

    @Override // ax.d3.E
    protected String B7() {
        return A3().f(b());
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void F1(Menu menu) {
        super.F1(menu);
        MenuItem findItem = menu.findItem(R.id.menu_new_folder);
        if (findItem != null) {
            if (v7() == null || !ax.c3.d0.E(v7())) {
                findItem.setVisible(false);
            } else {
                findItem.setVisible(true);
            }
        }
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        G9(true);
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public boolean N3() {
        if (!super.N3()) {
            return false;
        }
        if (C3() == null || !C3().equals(A3().e())) {
            return C1011c.q().r(C1808A.h(z3()));
        }
        return false;
    }

    @Override // ax.d3.E
    protected void P9(ax.W2.m mVar, boolean z) {
        ax.Q2.a.i().m("menu_folder", z ? "new_folder" : "new_file").c("loc", z3().I()).e();
        C1360p c1360p = new C1360p();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isDirectory", z);
        c1360p.v2(bundle);
        c1360p.n3(new b(mVar, z));
        A(c1360p, "createFileName", true);
    }

    @Override // ax.d3.E
    protected void a7(boolean z) {
        if (z) {
            AtomicReference atomicReference = new AtomicReference();
            String c2 = C3601u.c2(z3());
            ax.W2.m n = ax.W2.m.n();
            n.k(w7(), c2, z, new a(atomicReference, n, c2));
            P9(n, z);
            return;
        }
        ax.Ha.c.h().f().d("CREATE NEW FILE IN LIBRARY").g("location:" + z3().I()).h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.d3.E
    public void c7(List<AbstractC3595n> list, int i) {
        Iterator<AbstractC3595n> it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().isDirectory()) {
                z = true;
            }
        }
        if (!z) {
            super.c7(list, i);
        } else if (O6(list)) {
            aa();
        } else {
            new e(list, new c(i)).i(new Void[0]);
        }
    }

    @Override // ax.d3.E
    protected void h8(h.b bVar) {
        if (bVar != h.b.SUCCESS) {
            c4(false);
        } else {
            j9();
        }
    }

    @Override // ax.d3.E
    protected void i8(boolean z) {
        super.i8(z);
        if (v3() != null && z && z3() == ax.Q2.f.A0) {
            C2149c.d(this, 0L);
        }
    }

    @Override // ax.d3.E
    protected void j8(boolean z) {
        super.j8(z);
    }

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_library);
        O7(menu);
        ia(menu);
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        if (this.s2 == null) {
            this.s2 = (ax.Q2.f) j0().getSerializable("location");
        }
        return this.s2;
    }
}
