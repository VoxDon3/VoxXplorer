package ax.d3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import androidx.appcompat.view.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import ax.a3.C1362s;
import ax.a3.C1365v;
import ax.d3.AbstractC1927n;
import ax.i2.AbstractC2244I;
import ax.i2.C2239D;
import ax.n.ActivityC2561c;
import ax.x3.C3411G;
import ax.x3.C3412H;
import ax.x3.C3413I;
import ax.x3.C3418d;
import ax.x3.InterfaceC3410F;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h0 extends AbstractC1927n implements MainActivity.J, ax.g3.n, ax.g3.m {
    private RecyclerView C0;
    private RecyclerView D0;
    private C3412H E0;
    private C3412H F0;
    private C3411G G0;
    private boolean H0;
    private ax.x3.t I0;
    private C3413I J0;
    private C3418d K0;
    private a.InterfaceC0007a L0;

    class a extends ax.g3.c {
        a() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ax.Q2.a.i().m("menu_network", "rename_location").c("loc", h0.this.z3().I()).e();
            h0 h0Var = h0.this;
            h0Var.g5(h0Var.e5());
            h0.this.h3();
        }
    }

    class b extends ax.g3.c {
        b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ax.Q2.a.i().m("menu_network", "delete_location").c("loc", h0.this.z3().I()).e();
            h0 h0Var = h0.this;
            h0Var.c5(h0Var.e5());
            h0.this.h3();
        }
    }

    class c implements C3418d.f {
        c() {
        }

        @Override // ax.x3.C3418d.f
        public boolean a(int i) {
            if (i == R.id.menu_bookmark) {
                h0 h0Var = h0.this;
                h0Var.a5(h0Var.e5());
                h0.this.h3();
                return false;
            }
            if (i != R.id.menu_shortcut) {
                return false;
            }
            h0 h0Var2 = h0.this;
            h0Var2.b5(h0Var2.e5());
            h0.this.h3();
            return false;
        }
    }

    class d implements a.InterfaceC0007a {
        d() {
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public void a(androidx.appcompat.view.a aVar) {
            h0.this.a3();
            h0.this.W3(AbstractC1927n.o.SUBLOCATION);
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean b(androidx.appcompat.view.a aVar, Menu menu) {
            h0.this.d3(aVar, menu, R.menu.action_mode);
            h0.this.X3(AbstractC1927n.o.SUBLOCATION);
            return true;
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean c(androidx.appcompat.view.a aVar, Menu menu) {
            C2239D<Long> j = h0.this.J0.c().j();
            if (j.size() == 1) {
                Iterator<Long> it = j.iterator();
                Long l = null;
                int i = 0;
                while (it.hasNext()) {
                    l = it.next();
                    i++;
                }
                if (i != 1) {
                    h0.this.h3();
                    return false;
                }
                if (l == null) {
                    h0.this.h3();
                    return false;
                }
                h0.this.K0.o(R.id.bottom_menu_edit, true);
                h0.this.K0.o(R.id.bottom_menu_rename, true);
                h0.this.K0.o(R.id.bottom_menu_more, true);
            } else {
                h0.this.K0.o(R.id.bottom_menu_edit, false);
                h0.this.K0.o(R.id.bottom_menu_rename, false);
                h0.this.K0.o(R.id.bottom_menu_more, false);
            }
            return false;
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean d(androidx.appcompat.view.a aVar, MenuItem menuItem) {
            return h0.this.f5(menuItem.getItemId());
        }
    }

    class e implements ax.x3.y {
        e() {
        }

        @Override // ax.x3.y
        public void a(long j) {
            AbstractC2244I<Long> c = h0.this.J0.c();
            if (c.m(Long.valueOf(j))) {
                c.f(Long.valueOf(j));
            } else {
                c.o(Long.valueOf(j));
            }
        }
    }

    class f extends AbstractC2244I.b {
        f() {
        }

        @Override // ax.i2.AbstractC2244I.b
        public void b() {
            if (h0.this.f0() == null) {
                return;
            }
            int size = h0.this.J0.c().j().size();
            if (size <= 0) {
                h0.this.h3();
                return;
            }
            androidx.appcompat.view.a startSupportActionMode = !h0.this.K3() ? ((ActivityC2561c) h0.this.f0()).startSupportActionMode(h0.this.L0) : h0.this.E3();
            if (startSupportActionMode != null) {
                startSupportActionMode.r(size + "/" + h0.this.F0.X());
                startSupportActionMode.k();
            }
        }
    }

    class g extends ax.g3.d {
        g() {
        }

        @Override // ax.g3.d
        public void a(AdapterView<?> adapterView, View view, int i, long j) {
            ax.Q2.a.i().m("menu_network", "add_remote").c("by", "footer").e();
            if (h0.this.f0() instanceof MainActivity) {
                ((MainActivity) h0.this.f0()).C2();
            }
        }
    }

    class h extends ax.g3.d {
        h() {
        }

        @Override // ax.g3.d
        public void a(AdapterView<?> adapterView, View view, int i, long j) {
            if (i > h0.this.F0.l()) {
                return;
            }
            ax.Z2.s U = h0.this.F0.U(i);
            if (h0.this.f0() instanceof MainActivity) {
                ((MainActivity) h0.this.f0()).g2(U, null, "remote_fragment");
            }
        }
    }

    class i implements AdapterView.OnItemLongClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i > h0.this.F0.l() || j == -1) {
                return false;
            }
            h0.this.J0.c().p(Collections.singletonList(Long.valueOf(j)), true);
            return true;
        }
    }

    class j implements InterfaceC3410F {
        final /* synthetic */ androidx.recyclerview.widget.i a;

        j(androidx.recyclerview.widget.i iVar) {
            this.a = iVar;
        }

        @Override // ax.x3.InterfaceC3410F
        public void a(RecyclerView.F f) {
            this.a.H(f);
        }
    }

    class k implements a.InterfaceC0007a {
        k() {
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public void a(androidx.appcompat.view.a aVar) {
            h0.this.a3();
            h0.this.W3(AbstractC1927n.o.SUBLOCATION_EDIT);
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean b(androidx.appcompat.view.a aVar, Menu menu) {
            h0.this.d3(aVar, menu, R.menu.action_mode_sublocation_edit);
            h0.this.X3(AbstractC1927n.o.SUBLOCATION_EDIT);
            return true;
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean c(androidx.appcompat.view.a aVar, Menu menu) {
            return false;
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean d(androidx.appcompat.view.a aVar, MenuItem menuItem) {
            return false;
        }
    }

    class l extends ax.g3.c {
        l() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ax.Q2.a.i().m("menu_network", "edit_location").c("loc", h0.this.z3().I()).e();
            h0 h0Var = h0.this;
            h0Var.d5(h0Var.e5());
            h0.this.h3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a5(List<ax.Z2.s> list) {
        if (list.size() == 0) {
            return;
        }
        U2(list.get(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b5(List<ax.Z2.s> list) {
        if (list.size() == 0) {
            return;
        }
        ax.Z2.s sVar = list.get(0);
        S2(sVar.e(), sVar, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c5(List<ax.Z2.s> list) {
        if (list.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ax.Z2.s> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().e());
        }
        C1362s k3 = C1362s.k3(arrayList);
        k3.D2(this, 0);
        A(k3, "delete", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d5(List<ax.Z2.s> list) {
        if (list.size() == 0) {
            return;
        }
        ax.c3.K e2 = list.get(0).e();
        if (CommandService.y(e2)) {
            E4(R.string.error_storage_in_use, 1);
            return;
        }
        C1365v C3 = C1365v.C3(e2);
        C3.D2(this, 0);
        A(C3, "edit", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f5(int i2) {
        if (i2 != R.id.menu_select_all) {
            return false;
        }
        if (e5().size() == this.F0.X()) {
            h3();
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < this.F0.X(); i3++) {
            arrayList.add(Long.valueOf(this.F0.m(i3)));
        }
        this.J0.c().p(arrayList, true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g5(List<ax.Z2.s> list) {
        if (list.size() == 0) {
            return;
        }
        ax.a3.O i3 = ax.a3.O.i3(list.get(0).e());
        i3.D2(this, 0);
        A(i3, "rename", true);
    }

    private void h5() {
        this.K0.d(R.id.bottom_menu_edit, R.string.menu_edit, R.drawable.ic_edit, new l());
        this.K0.d(R.id.bottom_menu_rename, R.string.menu_rename, R.drawable.ic_rename, new a());
        this.K0.d(R.id.bottom_menu_remove, R.string.menu_remove, R.drawable.ic_delete, new b());
        this.K0.e();
        this.K0.l(R.menu.more_sublocation);
        this.K0.n(new c());
    }

    private void i5(boolean z) {
        if (f0() == null) {
            return;
        }
        this.H0 = z;
        if (!z) {
            if (this.E0.Z()) {
                com.voxdon.xplorer.file.T.i(f0(), this.E0.Y(), this.E0.W());
                this.E0.c0(false);
            }
            this.C0.setVisibility(0);
            this.D0.setVisibility(4);
            this.F0.d0(com.voxdon.xplorer.file.T.e(f0()));
            return;
        }
        this.C0.setVisibility(4);
        this.D0.setVisibility(0);
        if (this.E0 == null) {
            C3412H c3412h = new C3412H(f0(), null, false);
            this.E0 = c3412h;
            this.D0.setAdapter(c3412h);
            ax.x3.t tVar = new ax.x3.t(this.E0, true, false);
            this.I0 = tVar;
            androidx.recyclerview.widget.i iVar = new androidx.recyclerview.widget.i(tVar);
            iVar.m(this.D0);
            this.E0.h0(new j(iVar));
        }
        this.E0.d0(com.voxdon.xplorer.file.T.e(f0()));
        this.E0.c0(true);
        ((ActivityC2561c) f0()).startSupportActionMode(new k());
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    @SuppressLint({"NewApi"})
    public boolean B1(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_add_location) {
            ax.Q2.a.i().m("menu_network", "add_remote").c("by", "actionbar").e();
            ((MainActivity) f0()).C2();
            return true;
        }
        if (itemId != R.id.menu_edit_location) {
            return super.B1(menuItem);
        }
        i5(true);
        return true;
    }

    @Override // com.voxdon.xplorer.activity.MainActivity.J
    public void C() {
        c4(false);
    }

    @Override // ax.d3.AbstractC1927n
    public String C3() {
        return null;
    }

    @Override // ax.g3.n
    public void E(ax.Q2.f fVar, int i2) {
        c4(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void F1(Menu menu) {
        super.F1(menu);
        MenuItem findItem = menu.findItem(R.id.menu_add_location);
        MenuItem findItem2 = menu.findItem(R.id.menu_edit_location);
        if (findItem == null || findItem2 == null) {
            return;
        }
        if (this.F0.l() > 0) {
            findItem.setVisible(false);
            findItem2.setVisible(true);
        } else {
            findItem.setVisible(true);
            findItem2.setVisible(false);
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        c4(false);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.K0 = new C3418d((ActivityC2561c) f0(), view.findViewById(R.id.bottom_menu_layout), view.findViewById(R.id.bottom_menu_safe_area));
        h5();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        this.C0 = recyclerView;
        recyclerView.setItemAnimator(null);
        this.C0.setHasFixedSize(true);
        this.C0.setLayoutManager(new LinearLayoutManager(b(), 1, false));
        this.C0.j(new androidx.recyclerview.widget.f(b(), 1));
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recycler_edit);
        this.D0 = recyclerView2;
        recyclerView2.setHasFixedSize(true);
        this.D0.setLayoutManager(new LinearLayoutManager(b(), 1, false));
        this.D0.j(new androidx.recyclerview.widget.f(b(), 1));
        this.L0 = new d();
        this.F0 = new C3412H(f0(), new e(), ax.t3.k.I());
        this.G0 = new C3411G(f0(), R.string.menu_add_remote);
        this.C0.setAdapter(new androidx.recyclerview.widget.c(new c.a.C0039a().b(true).c(c.a.b.SHARED_STABLE_IDS).a(), (RecyclerView.h<? extends RecyclerView.F>[]) new RecyclerView.h[]{this.F0, this.G0}));
        C3413I a2 = C3413I.a(this.C0, this.F0);
        this.J0 = a2;
        this.F0.i0(a2.c());
        this.J0.c().b(new f());
        this.G0.S(new g());
        this.F0.e0(new h());
        this.F0.f0(new i());
        x2(true);
    }

    @Override // ax.d3.AbstractC1927n
    public boolean N3() {
        return false;
    }

    @Override // ax.d3.AbstractC1927n
    public boolean V2() {
        if (!K3()) {
            return false;
        }
        h3();
        return true;
    }

    @Override // ax.d3.AbstractC1927n
    protected boolean V3() {
        C3418d c3418d = this.K0;
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
        if (oVar == AbstractC1927n.o.SUBLOCATION) {
            this.F0.g0(this.C0, false);
            this.G0.T(this.C0, false);
            this.J0.c().e();
            this.K0.y(8);
        } else if (oVar == AbstractC1927n.o.SUBLOCATION_EDIT) {
            i5(false);
        }
        e4(false);
    }

    @Override // ax.d3.AbstractC1927n
    protected void X3(AbstractC1927n.o oVar) {
        super.X3(oVar);
        if (f0() != null && oVar == AbstractC1927n.o.SUBLOCATION) {
            this.F0.g0(this.C0, true);
            this.G0.T(this.C0, true);
            this.K0.y(0);
            this.K0.A();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void c4(boolean z) {
        if (f0() == null) {
            return;
        }
        this.F0.d0(com.voxdon.xplorer.file.T.e(f0()));
        C3412H c3412h = this.E0;
        if (c3412h != null) {
            c3412h.d0(com.voxdon.xplorer.file.T.e(f0()));
        }
    }

    @Override // ax.g3.m
    public void d(ax.Q2.f fVar, int i2) {
        if (f0() instanceof MainActivity) {
            ((MainActivity) f0()).E1("remote_fragment").d(fVar, i2);
        }
    }

    public List<ax.Z2.s> e5() {
        ArrayList arrayList = new ArrayList();
        Iterator<Long> it = this.J0.c().j().iterator();
        while (it.hasNext()) {
            Long next = it.next();
            if (next != null) {
                try {
                    arrayList.add(this.F0.U(this.J0.b(next.longValue())));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        ((MainActivity) activity).h1(this);
    }

    @Override // ax.d3.AbstractC1927n
    public void j3() {
        RecyclerView recyclerView = this.C0;
        if (recyclerView != null) {
            recyclerView.requestFocus();
        }
    }

    @Override // ax.d3.AbstractC1927n, ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        super.onApplyWindowsInsets(bVar, z);
        if (R0() == null || !T3() || z) {
            return;
        }
        this.C0.setClipToPadding(false);
        RecyclerView recyclerView = this.C0;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), this.C0.getPaddingTop(), this.C0.getPaddingRight(), bVar.d);
    }

    @Override // androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_network);
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_sublocation_list, (ViewGroup) null);
    }

    @Override // ax.g3.m
    public void u(int i2) {
        if (f0() == null) {
            return;
        }
        F4(f0().getResources().getQuantityString(R.plurals.msg_deleted_items_plurals, i2, Integer.valueOf(i2)), 1);
        if (i2 > 0) {
            c4(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        ((MainActivity) f0()).p2(this);
        super.v1();
    }

    @Override // ax.d3.AbstractC1927n
    public int x3() {
        return 0;
    }

    @Override // ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.G0;
    }

    @Override // ax.d3.AbstractC1927n
    public void M4() {
    }

    @Override // ax.d3.AbstractC1927n
    public void Z3(String str) {
    }
}
