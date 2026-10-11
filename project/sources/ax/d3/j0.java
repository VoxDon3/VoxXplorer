package ax.d3;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import ax.Q2.a;
import ax.W2.C1011c;
import ax.W2.h;
import ax.W2.z;
import ax.a3.S;
import ax.a3.V;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1829q;
import ax.c3.C1835x;
import ax.d3.AbstractC1927n;
import ax.n3.C2577a;
import ax.r3.C2947d;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.x3.C3405A;
import ax.x3.C3418d;
import ax.x3.C3422h;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.widget.FileListView;
import com.voxdon.xplorer.R;
import com.google.android.material.snackbar.Snackbar;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class j0 extends H implements ax.g3.h {
    private String D0;
    private ax.c3.K E0;
    private List<AbstractC3595n> F0;
    private Set<AbstractC3595n> G0;
    private Map<String, AbstractC3595n> H0;
    private C1829q I0;
    private com.voxdon.xplorer.widget.a K0;
    private String L0;
    private int M0;
    private int N0;
    private u O0;
    private C3596o P0;
    private C2947d Q0;
    private FileListView R0;
    private View S0;
    private View T0;
    private View U0;
    private TextView V0;
    protected C3418d W0;
    private boolean X0;
    private boolean Y0;
    private long c1;
    private boolean d1;
    private int C0 = -1;
    private String J0 = "None";
    private Handler Z0 = new Handler(Looper.getMainLooper());
    private AbstractC1927n.r a1 = new AbstractC1927n.r();
    private final Object b1 = new Object();
    private ax.Z2.p e1 = new ax.Z2.p();
    AdapterView.OnItemClickListener f1 = new o();
    AbsListView.MultiChoiceModeListener g1 = new r();
    private Runnable h1 = new g();
    AbsListView.MultiChoiceModeListener i1 = new h();

    class b implements z.c {
        b() {
        }

        @Override // ax.W2.z.c
        public boolean a(String str) {
            return j0.this.K0 != null && j0.this.K0.X(str);
        }
    }

    class c extends ax.g3.c {
        c() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (j0.this.W0.k() != 0) {
                return;
            }
            j0.this.O5(view.getId(), false, false);
        }
    }

    class d implements C3418d.f {
        d() {
        }

        @Override // ax.x3.C3418d.f
        public boolean a(int i) {
            j0.this.O5(i, false, false);
            return false;
        }
    }

    class e implements ax.x3.z {
        e() {
        }

        @Override // ax.x3.z
        public void a(int i) {
            ax.Z2.q U;
            if (i < 0 || i >= j0.this.K0.getCount() || (U = j0.this.K0.U(i)) == null) {
                return;
            }
            boolean z = !ax.Z2.q.d(j0.this.R0, U);
            for (int c = U.c(); c <= U.a(); c++) {
                j0.this.R0.setItemChecked(c, z);
            }
        }

        @Override // ax.x3.z
        public void b(int i) {
            if (i < 0 || i >= j0.this.K0.getCount()) {
                return;
            }
            j0.this.R0.setItemChecked(i, !j0.this.R0.isItemChecked(i));
        }

        @Override // ax.x3.z
        public void c(int i, View view, int i2, int i3) {
            if (i < 0 || i >= j0.this.K0.getCount()) {
                return;
            }
            b(i);
            if (j0.this.K3() && j0.this.a1.b()) {
                j0.this.a1.e(j0.this.R0);
                j0.this.I3();
            }
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.A5();
        }
    }

    class h implements AbsListView.MultiChoiceModeListener {
        h() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            if (!j0.this.K3()) {
                return false;
            }
            List J5 = j0.this.J5(false);
            switch (menuItem.getItemId()) {
                case R.id.menu_select_all /* 2131362540 */:
                    if (J5.size() != j0.this.K0.getCount()) {
                        ax.Q2.a.i().m("menu_folder", "select_all").c("loc", j0.this.z3().I()).e();
                        j0.this.a1.d(j0.this.R0);
                        break;
                    } else {
                        ax.Q2.a.i().m("menu_folder", "deselect").c("loc", j0.this.z3().I()).e();
                        j0.this.h3();
                        break;
                    }
                case R.id.menu_select_range /* 2131362541 */:
                    j0.this.a1.e(j0.this.R0);
                    j0.this.I3();
                    break;
            }
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            if (j0.this.K0 == null) {
                return false;
            }
            j0.this.b3(actionMode, menu, R.menu.action_mode_search_result);
            j0.this.a1.c();
            j0.this.V5();
            j0.this.K0.u0(true);
            j0.this.X3(AbstractC1927n.o.FILE_NORMAL);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            if (j0.this.v3() == null) {
                return;
            }
            j0.this.a3();
            j0.this.W3(AbstractC1927n.o.FILE_NORMAL);
            j0.this.a1.c();
            j0.this.K0.u0(false);
            j0.this.V5();
        }

        @Override // android.widget.AbsListView.MultiChoiceModeListener
        public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
            j0.this.a1.f(i, z);
            j0.this.f6(i);
            actionMode.setTitle(j0.this.R0.getCheckedItemCount() + "/" + j0.this.R0.getCount());
            actionMode.invalidate();
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            if (j0.this.K0.getCount() == 0) {
                return false;
            }
            MenuItem findItem = menu.findItem(R.id.menu_select_range);
            if (findItem != null) {
                ax.u3.z.C(j0.this.o3(), findItem, R.color.action_mode_icon);
                if (j0.this.a1.b()) {
                    findItem.setEnabled(true);
                } else {
                    findItem.setEnabled(false);
                }
            }
            j0.this.P5();
            return false;
        }
    }

    class i implements V.b {
        i() {
        }

        @Override // ax.a3.V.b
        public void a(String str) {
            j0.this.Z5(str);
        }
    }

    class j implements S.k {
        j() {
        }

        @Override // ax.a3.S.k
        public void a() {
            j0.this.V0.setText(j0.this.B5());
            j0.this.A5();
        }
    }

    class l implements MainActivity.G {
        l() {
        }

        @Override // com.voxdon.xplorer.activity.MainActivity.G
        public void a(AbstractC1927n abstractC1927n) {
            if (abstractC1927n instanceof E) {
                ((E) abstractC1927n).U8(j0.this.L0);
            }
        }
    }

    class m implements MainActivity.H {
        final /* synthetic */ AbstractC3595n a;

        m(AbstractC3595n abstractC3595n) {
            this.a = abstractC3595n;
        }

        @Override // com.voxdon.xplorer.activity.MainActivity.H
        public void a(AbstractC1927n abstractC1927n) {
            AbstractC3595n abstractC3595n;
            if (!(abstractC1927n instanceof E) || (abstractC3595n = this.a) == null) {
                return;
            }
            ((E) abstractC1927n).V8(abstractC3595n);
        }
    }

    class n implements MainActivity.G {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        n(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // com.voxdon.xplorer.activity.MainActivity.G
        public void a(AbstractC1927n abstractC1927n) {
            if (abstractC1927n instanceof E) {
                ((E) abstractC1927n).e9(j0.this.D0, j0.this.L0, j0.this.e1, j0.this.J0, this.a, this.b);
            }
        }
    }

    class o implements AdapterView.OnItemClickListener {
        o() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (j0.this.F0 != null && i >= 0 && i < j0.this.K0.getCount()) {
                AbstractC3595n abstractC3595n = (AbstractC3595n) j0.this.K0.getItem(i);
                if (!j0.this.Y0 || abstractC3595n.isDirectory()) {
                    j0.this.Q5(abstractC3595n);
                } else {
                    j0.this.R0.setItemChecked(i, true);
                }
            }
        }
    }

    class p extends ax.g3.c {
        p() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            j0.this.S5();
        }
    }

    class q extends ax.g3.c {
        q() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            j0.this.S5();
        }
    }

    class r implements AbsListView.MultiChoiceModeListener {
        private boolean a;
        private ax.Q2.j b;

        r() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            ax.Q2.j g0 = j0.this.v3().g0();
            this.b = g0;
            this.a = g0.e();
            j0.this.b3(actionMode, menu, 0);
            j0.this.X3(AbstractC1927n.o.FILE_PICKER);
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            if (j0.this.v3() == null) {
                return;
            }
            j0.this.v3().h0().F(false);
            j0.this.a3();
            j0.this.W3(AbstractC1927n.o.FILE_PICKER);
        }

        @Override // android.widget.AbsListView.MultiChoiceModeListener
        public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
            j0.this.e6(actionMode);
            actionMode.invalidate();
            AbstractC3595n abstractC3595n = (AbstractC3595n) j0.this.K0.getItem(i);
            if (z) {
                if (abstractC3595n.isDirectory()) {
                    j0.this.R0.setItemChecked(i, false);
                    return;
                } else if (!this.b.h(abstractC3595n.s())) {
                    j0.this.R0.setItemChecked(i, false);
                    return;
                }
            }
            if (this.a || j0.this.R0.getCheckedItemCount() <= 1) {
                return;
            }
            SparseBooleanArray checkedItemPositions = j0.this.R0.getCheckedItemPositions();
            for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
                if (checkedItemPositions.valueAt(i2) && i != checkedItemPositions.keyAt(i2)) {
                    j0.this.R0.setItemChecked(checkedItemPositions.keyAt(i2), false);
                    return;
                }
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            if (j0.this.K0.getCount() == 0) {
                return false;
            }
            C3405A h0 = j0.this.v3().h0();
            if (!j0.this.N5()) {
                h0.F(false);
            } else if (j0.this.R0.getCheckedItemCount() <= 0) {
                h0.F(false);
            } else {
                h0.F(true);
            }
            return false;
        }
    }

    class t extends AbstractC3199q<Void, Void, Boolean> {
        private String h;
        private String i;
        private String j;
        private ax.c3.K k;
        private C3596o l;

        t(C3596o c3596o, String str, String str2, ax.c3.K k, String str3) {
            super(AbstractC3199q.e.HIGHER);
            this.l = c3596o;
            this.i = str;
            this.j = str2;
            this.k = k;
            this.h = str3;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            C3596o c3596o = this.l;
            if (c3596o != null) {
                c3596o.k0(false);
            }
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            C3596o c3596o = this.l;
            if (c3596o != null) {
                c3596o.n0();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            try {
                AbstractC3595n z = this.l.z(this.h);
                if (z != null && z.n()) {
                    j0.this.z5(Collections.singletonList(z));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            } catch (C1495j unused) {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            if (bool.booleanValue()) {
                j0.this.A5();
                j0.this.Y5(this.k, this.j, this.i);
            } else {
                j0.this.W5();
            }
            C3596o c3596o = this.l;
            if (c3596o != null) {
                c3596o.k0(false);
            }
        }
    }

    class u extends AbstractC3199q<Void, Void, Void> {
        private C2577a h;
        private String i;
        private String j;
        private ax.c3.K k;
        private C3596o l;
        private boolean m;

        public u(String str, String str2, ax.c3.K k, C3596o c3596o) {
            super(AbstractC3199q.e.HIGHER);
            this.i = str;
            this.j = str2;
            this.k = k;
            this.l = c3596o;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            C3596o c3596o = this.l;
            if (c3596o != null) {
                c3596o.k0(false);
            }
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            C3596o c3596o = this.l;
            if (c3596o != null) {
                c3596o.n0();
            }
        }

        public void w() {
            C2577a c2577a = this.h;
            if (c2577a != null) {
                c2577a.a();
            }
            e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            List<AbstractC3595n> l = (j0.this.M0 < 0 || j0.this.N0 < 0) ? null : ax.Z2.b.k().l(this.k, this.j, this.i);
            if (l != null) {
                synchronized (j0.this.b1) {
                    j0.this.G0.addAll(l);
                    this.m = true;
                }
                return null;
            }
            C2577a c2577a = new C2577a(j0.this.o3(), this.k, j0.this);
            this.h = c2577a;
            c2577a.b(this.j, this.i, j0.this.d1);
            this.m = false;
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Void r4) {
            C3596o c3596o = this.l;
            if (c3596o != null) {
                c3596o.k0(false);
            }
            j0.this.O0 = null;
            j0.this.U0.setVisibility(8);
            j0.this.A5();
            j0.this.c1 = 0L;
            if (j0.this.M0 >= 0 && j0.this.N0 != 0) {
                j0.this.R0.setSelectionFromTop(j0.this.M0, j0.this.N0);
            }
            if (this.m) {
                return;
            }
            j0.this.Y5(this.k, this.j, this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A5() {
        int keyAt;
        if (f0() == null) {
            return;
        }
        boolean z = this.K0.getCount() == 0;
        synchronized (this.b1) {
            try {
                List a2 = ax.x3.u.a(this.R0, this.K0, false);
                this.R0.getCheckedItemCount();
                this.K0.clear();
                if (this.e1.a()) {
                    this.K0.addAll(this.G0);
                } else {
                    this.K0.addAll(I5(this.G0));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    try {
                        int position = this.K0.getPosition((AbstractC3595n) it.next());
                        this.R0.setItemChecked(position, true);
                        arrayList.add(Integer.valueOf(position));
                    } catch (Exception unused) {
                    }
                }
                SparseBooleanArray checkedItemPositions = this.R0.getCheckedItemPositions();
                for (int i2 = 0; i2 < checkedItemPositions.size(); i2++) {
                    if (checkedItemPositions.valueAt(i2) && (keyAt = checkedItemPositions.keyAt(i2)) < this.K0.getCount() && !arrayList.contains(Integer.valueOf(keyAt))) {
                        try {
                            this.R0.setItemChecked(keyAt, false);
                        } catch (Exception unused2) {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.K0.notifyDataSetChanged();
        if (k3() != null) {
            e6(k3());
        }
        if (z) {
            this.R0.requestFocus();
        }
        if (this.K0.getCount() != 0) {
            this.S0.setVisibility(8);
            return;
        }
        this.S0.setVisibility(0);
        Set<AbstractC3595n> set = this.G0;
        if (set == null || set.isEmpty()) {
            this.T0.setVisibility(0);
        } else {
            this.T0.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String B5() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        sb.append(this.L0);
        sb.append("\"");
        ax.Z2.p pVar = this.e1;
        if (pVar != null && pVar.j0 != null) {
            sb.append(", \"");
            sb.append(this.e1.j0);
            sb.append("\"");
        }
        ax.Z2.p pVar2 = this.e1;
        if (pVar2 != null && pVar2.k0 != null) {
            sb.append(", \"");
            sb.append(this.e1.k0);
            sb.append("\"");
        }
        return sb.toString();
    }

    private void C5() {
        D5();
        i3("search_result");
    }

    private void D5() {
        u uVar = this.O0;
        if (uVar == null || uVar.isCancelled()) {
            return;
        }
        this.O0.w();
    }

    private Set<AbstractC3595n> E5(Comparator<AbstractC3595n> comparator) {
        return DesugarCollections.synchronizedSet(new TreeSet(comparator));
    }

    private void F5(List<AbstractC3595n> list, int i2) {
        ax.Q2.a.i().m("menu_folder", "delete").c("loc", z3().I()).c("type", a.e.a(list)).e();
        ax.W2.o.m(this.P0, list, i2, ax.Q2.f.l(this.E0.d()), this, true, new s(), null);
    }

    private void G5() {
        this.V0.setText(B5());
        this.U0.setVisibility(0);
        this.F0 = new ArrayList();
        C3184b.a(this.I0.d());
        this.G0 = E5(this.I0.b());
        this.H0 = DesugarCollections.synchronizedMap(new HashMap());
        C3596o c3596o = this.P0;
        if (c3596o != null) {
            c3596o.k0(false);
        }
        C3596o e2 = C1835x.e(this.E0);
        this.P0 = e2;
        e2.n0();
        if (this.Q0 == null) {
            this.Q0 = new C2947d(o3(), this.P0);
        }
        com.voxdon.xplorer.widget.a aVar = new com.voxdon.xplorer.widget.a(f0(), this.F0, this.P0, this.Q0, 3, new e(), c6(), true);
        this.K0 = aVar;
        aVar.l0(this.L0);
        this.K0.p0(this.f1);
        this.K0.t0(this.E0, this.D0);
        this.K0.y0(false);
        this.K0.x0(this.d1);
        g6();
        this.R0.setAdapter((ListAdapter) this.K0);
        if (!this.P0.a()) {
            C5();
            return;
        }
        u uVar = new u(this.L0, this.D0, this.E0, this.P0);
        this.O0 = uVar;
        uVar.h(new Void[0]);
    }

    private void H5(List<AbstractC3595n> list, boolean z) {
        a.e.a(list);
        C1011c.q().m(this.P0, null, list, z);
        f0().supportInvalidateOptionsMenu();
        e4(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<AbstractC3595n> J5(boolean z) {
        return ax.x3.u.a(this.R0, this.K0, z);
    }

    private List<AbstractC3595n> K5(boolean z) {
        List<AbstractC3595n> a2 = ax.x3.u.a(this.R0, this.K0, z);
        ArrayList arrayList = new ArrayList();
        for (AbstractC3595n abstractC3595n : a2) {
            if (abstractC3595n.isDirectory()) {
                arrayList.add(abstractC3595n);
            }
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            AbstractC3595n abstractC3595n2 = (AbstractC3595n) obj;
            Iterator<AbstractC3595n> it = a2.iterator();
            while (it.hasNext()) {
                AbstractC3595n next = it.next();
                if (next.E().length() > abstractC3595n2.E().length() && ax.c3.d0.I(abstractC3595n2.E(), next.E())) {
                    it.remove();
                }
            }
        }
        return a2;
    }

    private ax.B.b<String> L5() {
        ax.B.b<String> bVar = new ax.B.b<>();
        synchronized (this.b1) {
            try {
                Set<AbstractC3595n> set = this.G0;
                if (set != null) {
                    for (AbstractC3595n abstractC3595n : set) {
                        if (!abstractC3595n.isDirectory()) {
                            String A = abstractC3595n.A();
                            if (A != null && A.length() > 8) {
                                String B = abstractC3595n.B();
                                int i2 = 0;
                                for (int i3 = 0; i3 < B.length(); i3++) {
                                    if (B.charAt(i3) == '.') {
                                        i2++;
                                    }
                                }
                                if (i2 > 1) {
                                }
                            }
                            bVar.add(A);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private void M5(View view) {
        String N0 = N0(R.string.search_location, this.E0.f(o3()));
        MainActivity mainActivity = (MainActivity) f0();
        if (ax.c3.d0.D(this.E0, this.D0)) {
            mainActivity.z2(N0, null);
        } else {
            mainActivity.z2(N0, ax.c3.d0.v(this.E0, this.D0, Boolean.TRUE));
        }
        this.U0 = view.findViewById(R.id.progressbar);
        this.V0 = (TextView) view.findViewById(R.id.query);
        this.W0 = new C3418d(v3(), view.findViewById(R.id.bottom_menu_layout), view.findViewById(R.id.bottom_menu_safe_area));
        a6();
        this.R0 = (FileListView) view.findViewById(R.id.list);
        this.S0 = view.findViewById(R.id.empty);
        View findViewById = view.findViewById(R.id.btn_try_another_keyword);
        this.T0 = findViewById;
        findViewById.setOnClickListener(new p());
        this.V0.setOnClickListener(new q());
        this.R0.setChoiceMode(3);
        this.R0.setOnItemClickListener(this.f1);
        if (v3().g0().g()) {
            this.Y0 = true;
            this.R0.setMultiChoiceModeListener(this.g1);
        } else {
            this.Y0 = false;
            this.R0.setMultiChoiceModeListener(this.i1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N5() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O5(int i2, boolean z, boolean z2) {
        if (C1011c.q().v()) {
            X2(false);
        }
        List<AbstractC3595n> K5 = K5(z2 && this.R0.hasFocus() && this.R0.getSelectedItemPosition() != -1);
        if (K5.size() <= 0) {
            ax.Ha.c.h().f().d("NO SELECTED ITEM").g("size:" + K5.size()).h();
            h3();
        }
        switch (i2) {
            case R.id.bottom_menu_copy /* 2131361928 */:
                H5(K5, false);
                h3();
                break;
            case R.id.bottom_menu_cut /* 2131361930 */:
                H5(K5, true);
                h3();
                break;
            case R.id.bottom_menu_delete /* 2131361931 */:
                F5(K5, 0);
                h3();
                break;
            case R.id.bottom_menu_open_parent /* 2131361937 */:
                R5(K5.get(0));
                h3();
                break;
            case R.id.bottom_menu_properties /* 2131361940 */:
            case R.id.menu_properties /* 2131362528 */:
                B4(this.P0, K5);
                h3();
                break;
            case R.id.bottom_menu_rename /* 2131361943 */:
            case R.id.menu_rename /* 2131362532 */:
                X5(K5);
                h3();
                break;
            case R.id.bottom_menu_share /* 2131361948 */:
            case R.id.menu_share /* 2131362545 */:
                t4(this.P0, K5);
                h3();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P5() {
        int checkedItemCount = this.R0.getCheckedItemCount();
        if (checkedItemCount != 0) {
            if (checkedItemCount == 1) {
                this.W0.o(R.id.bottom_menu_open_parent, true);
                this.W0.t(R.id.menu_rename, true);
            } else {
                this.W0.o(R.id.bottom_menu_open_parent, false);
                this.W0.t(R.id.menu_rename, false);
            }
            if (C1809B.B(K5(false))) {
                this.W0.t(R.id.menu_share, false);
            } else {
                this.W0.t(R.id.menu_share, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q5(AbstractC3595n abstractC3595n) {
        T5(Uri.parse(abstractC3595n.Q()), null);
    }

    private void R5(AbstractC3595n abstractC3595n) {
        ax.Q2.a.i().m("menu_search", "search_open_parent").c("loc", this.E0.d().I()).e();
        T5(Uri.parse(abstractC3595n.S()), abstractC3595n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S5() {
        MainActivity mainActivity = (MainActivity) f0();
        if (mainActivity == null) {
            return;
        }
        mainActivity.c2(Bookmark.d(o3(), this.E0, this.D0), null, null, new k(), new l());
        C5();
    }

    private void T5(Uri uri, AbstractC3595n abstractC3595n) {
        MainActivity mainActivity = (MainActivity) f0();
        if (mainActivity == null) {
            return;
        }
        Bookmark c2 = Bookmark.c(o3(), uri);
        int firstVisiblePosition = this.R0.getFirstVisiblePosition();
        View childAt = this.R0.getChildAt(0);
        mainActivity.c2(c2, null, null, new m(abstractC3595n), new n(firstVisiblePosition, childAt != null ? childAt.getTop() - this.R0.getPaddingTop() : 0));
        C5();
    }

    private void U5() {
        this.D0 = j0().getString("ROOT");
        this.E0 = ax.c3.K.a((ax.Q2.f) j0().getSerializable("LOCATION"), j0().getInt("LOCATION_KEY", 0));
        this.L0 = j0().getString("query");
        this.d1 = j0().getBoolean("INCLUDE_SUBFOLDER");
        ax.Z2.p pVar = (ax.Z2.p) j0().getSerializable("FILTER_INFO");
        if (pVar != null) {
            this.e1.f(pVar);
        }
        String string = j0().getString("SORT_METHOD");
        this.M0 = j0().getInt("INDEX");
        this.N0 = j0().getInt("TOP");
        if (string != null) {
            this.J0 = string;
        } else if (this.d1) {
            this.J0 = "None";
        } else {
            this.J0 = E.F7(o3(), this.E0.d(), this.E0.b(), this.D0, false);
        }
        if ("None".equals(this.J0)) {
            this.I0 = C1829q.a("SearchPath");
        } else {
            this.I0 = C1829q.a(this.J0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V5() {
        e4(false);
        if (!K3()) {
            this.W0.y(8);
        } else {
            this.W0.y(0);
            this.W0.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W5() {
        if (this.G0 == null || f0() == null) {
            return;
        }
        synchronized (this.b1) {
            try {
                this.G0.clear();
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        this.H0.clear();
        this.K0.clear();
        u uVar = new u(this.L0, this.D0, this.E0, this.P0);
        this.O0 = uVar;
        uVar.h(new Void[0]);
        View view = this.S0;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void X5(List<AbstractC3595n> list) {
        if (list.size() <= 0) {
            return;
        }
        ax.Q2.a.i().m("menu_folder", "rename").c("loc", z3().I()).c("type", a.e.a(list)).e();
        if (list.size() != 1) {
            C3184b.f();
        } else {
            AbstractC3595n abstractC3595n = list.get(0);
            ax.W2.z.o(this.P0, abstractC3595n.T(), list, this, new a(abstractC3595n), new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y5(ax.c3.K k2, String str, String str2) {
        if (k2 == null || str == null || str2 == null) {
            return;
        }
        ax.Z2.b.k().o(k2, str, str2, new ArrayList(this.G0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z5(String str) {
        if ("None".equals(str)) {
            this.I0 = C1829q.a("SearchPath");
        } else {
            this.I0 = C1829q.a(str);
        }
        if (this.P0 == null) {
            C3184b.g("no sort method : " + str);
            return;
        }
        synchronized (this.b1) {
            this.J0 = str;
            Set<AbstractC3595n> E5 = E5(this.I0.b());
            E5.addAll(this.G0);
            this.G0 = E5;
            C1829q.h(this.F0, this.I0);
        }
        g6();
        this.K0.notifyDataSetChanged();
    }

    private void b6() {
        ax.a3.S B3 = ax.a3.S.B3();
        B3.M3(L5());
        B3.N3(this.e1, new j());
        A(B3, "option", true);
    }

    private void d6() {
        ax.a3.V l3 = ax.a3.V.l3(this.J0);
        l3.m3(new i());
        A(l3, "option", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e6(ActionMode actionMode) {
        actionMode.setTitle(this.R0.getCheckedItemCount() + "/" + this.R0.getCount());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f6(int i2) {
        ax.Z2.q U;
        boolean d2;
        if (i2 < 0 || i2 >= this.K0.getCount() || !this.K0.B0() || (U = this.K0.U(i2)) == null || (d2 = ax.Z2.q.d(this.R0, U)) == U.e()) {
            return;
        }
        U.f(d2);
        this.K0.notifyDataSetChanged();
    }

    private void g6() {
        if ("DateDown".equals(this.J0) || "DateUp".equals(this.J0)) {
            this.K0.r0(true, 1);
        } else if ("TypeDown".equals(this.J0) || "TypeUp".equals(this.J0)) {
            this.K0.r0(true, 2);
        } else {
            this.K0.r0(false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z5(List<AbstractC3595n> list) {
        synchronized (this.b1) {
            try {
                for (AbstractC3595n abstractC3595n : list) {
                    String lowerCase = abstractC3595n.E().toLowerCase(Locale.ROOT);
                    if (this.H0.containsKey(lowerCase)) {
                        this.G0.remove(this.H0.get(lowerCase));
                    }
                    this.H0.put(lowerCase, abstractC3595n);
                }
                this.G0.addAll(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public boolean B1(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_filter) {
            b6();
            return true;
        }
        if (itemId != R.id.menu_sort) {
            return super.B1(menuItem);
        }
        d6();
        return true;
    }

    @Override // ax.d3.AbstractC1927n
    public String C3() {
        return "/";
    }

    @Override // androidx.fragment.app.Fragment
    public void F1(Menu menu) {
        super.F1(menu);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        if (this.X0) {
            return;
        }
        this.X0 = true;
        G5();
    }

    List<AbstractC3595n> I5(Set<AbstractC3595n> set) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC3595n abstractC3595n : set) {
            if (this.e1.e(abstractC3595n)) {
                arrayList.add(abstractC3595n);
            }
        }
        return arrayList;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        x2(true);
    }

    @Override // ax.d3.AbstractC1927n
    public boolean N3() {
        return false;
    }

    @Override // ax.d3.AbstractC1927n
    public boolean V2() {
        D5();
        return false;
    }

    @Override // ax.d3.AbstractC1927n
    protected boolean V3() {
        C3418d c3418d = this.W0;
        if (c3418d == null || !c3418d.m()) {
            return super.V3();
        }
        return true;
    }

    @Override // ax.d3.AbstractC1927n
    protected void W3(AbstractC1927n.o oVar) {
        super.W3(oVar);
        if (f0() == null) {
            return;
        }
        this.V0.setBackgroundResource(R.drawable.bg_search_query);
        this.K0.g0(false);
    }

    @Override // ax.d3.AbstractC1927n
    protected void X3(AbstractC1927n.o oVar) {
        super.X3(oVar);
        if (f0() == null) {
            return;
        }
        this.V0.setBackgroundColor(ax.Q.b.c(f0(), R.color.selection_background));
        this.K0.g0(true);
    }

    @Override // ax.g3.h
    public void Y(List<AbstractC3595n> list, boolean z) {
        if (f0() == null || list == null) {
            return;
        }
        if (!list.isEmpty()) {
            z5(list);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z || currentTimeMillis - this.c1 >= 250) {
            this.c1 = currentTimeMillis;
            this.Z0.post(this.h1);
        }
    }

    protected void a6() {
        c cVar = new c();
        this.W0.d(R.id.bottom_menu_copy, R.string.menu_copy, R.drawable.ic_content_copy, cVar);
        this.W0.d(R.id.bottom_menu_cut, R.string.menu_move, R.drawable.ic_file_move, cVar);
        this.W0.d(R.id.bottom_menu_delete, R.string.menu_delete, R.drawable.ic_delete, cVar);
        this.W0.d(R.id.bottom_menu_open_parent, R.string.menu_open_parent, R.drawable.ic_folder_open, cVar);
        this.W0.e();
        this.W0.n(new d());
        this.W0.l(R.menu.more_search_result);
    }

    @Override // ax.d3.AbstractC1927n
    public void c4(boolean z) {
        W5();
    }

    protected boolean c6() {
        return ax.t3.k.I();
    }

    @Override // ax.g3.h
    public void i() {
        View findViewById;
        if (R0() == null || (findViewById = R0().findViewById(android.R.id.content)) == null) {
            return;
        }
        Snackbar q0 = C3180B.S(findViewById, R.string.error_file_search, -2).q0(android.R.string.ok, new f());
        ((TextView) q0.H().findViewById(R.id.snackbar_text)).setTextColor(-256);
        D4(q0);
    }

    @Override // ax.d3.AbstractC1927n
    public void j3() {
        FileListView fileListView = this.R0;
        if (fileListView != null) {
            fileListView.requestFocus();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void j4() {
        if (f0() == null) {
            return;
        }
        k4(this.P0, K5(false));
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void k1(Context context) {
        super.k1(context);
        U5();
    }

    @Override // ax.d3.AbstractC1927n, ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        super.onApplyWindowsInsets(bVar, z);
        if (R0() == null || !T3() || z) {
            return;
        }
        this.R0.setClipToPadding(false);
        FileListView fileListView = this.R0;
        fileListView.setPadding(fileListView.getPaddingLeft(), this.R0.getPaddingTop(), this.R0.getPaddingRight(), bVar.d);
    }

    @Override // androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_search);
    }

    @Override // ax.d3.AbstractC1927n
    protected int q3() {
        if (b() == null) {
            return 0;
        }
        return ax.Q.b.c(b(), R.color.search_actionbar_color);
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_search, (ViewGroup) null);
        M5(inflate);
        return inflate;
    }

    @Override // ax.d3.AbstractC1927n
    protected int r3() {
        if (b() == null) {
            return 0;
        }
        return Build.VERSION.SDK_INT < 23 ? ax.Q.b.c(b(), R.color.statusbar_color_before_23) : ax.Q.b.c(b(), R.color.search_statusbar_color);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void s1() {
        D5();
        if (this.F0 != null) {
            this.K0.clear();
            synchronized (this.b1) {
                this.G0.clear();
            }
            this.H0.clear();
        }
        C3596o c3596o = this.P0;
        if (c3596o != null) {
            c3596o.k0(false);
            this.P0 = null;
        }
        super.s1();
    }

    @Override // ax.d3.AbstractC1927n
    protected C3422h.a s3() {
        return C3422h.a.DARK;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void x1(boolean z) {
        super.x1(z);
        if (z) {
            C5();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public int x3() {
        if (this.C0 < 0) {
            this.C0 = j0().getInt("location_key");
        }
        return this.C0;
    }

    @Override // ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.s1;
    }

    class a implements h.a {
        final /* synthetic */ AbstractC3595n a;

        a(AbstractC3595n abstractC3595n) {
            this.a = abstractC3595n;
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            if (bVar == h.b.SUCCESS) {
                if (arrayList == null || arrayList.size() != 1) {
                    j0.this.W5();
                } else {
                    synchronized (j0.this.b1) {
                        j0.this.G0.remove(this.a);
                    }
                    String Q = ax.c3.d0.Q(this.a.T(), arrayList.get(0));
                    if (j0.this.f0() != null && j0.this.P0 != null) {
                        j0 j0Var = j0.this;
                        j0Var.new t(j0Var.P0, j0.this.L0, j0.this.D0, j0.this.E0, Q).h(new Void[0]);
                    }
                }
            }
            j0.this.y4(bVar, str, str2, arrayList);
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }

    class s implements h.a {
        s() {
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            j0.this.W5();
            if (bVar != h.b.SUCCESS || arrayList == null || arrayList.size() <= 0) {
                j0.this.y4(bVar, str, str2, arrayList);
            } else {
                j0.this.z4(str, arrayList);
            }
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    class k implements MainActivity.H {
        k() {
        }

        @Override // com.voxdon.xplorer.activity.MainActivity.H
        public void a(AbstractC1927n abstractC1927n) {
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void M4() {
    }

    @Override // ax.g3.h
    public void o() {
    }

    @Override // ax.d3.AbstractC1927n
    public void Z3(String str) {
    }
}
