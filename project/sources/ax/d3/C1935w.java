package ax.d3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ax.J0.a;
import ax.P.b;
import ax.Z2.a;
import ax.d3.AbstractC1936x;
import ax.s.C3036c;
import ax.t3.C3098a;
import ax.u3.AbstractC3199q;
import ax.u3.C3189g;
import ax.x3.C3421g;
import ax.x3.C3427m;
import com.voxdon.xplorer.activity.PaymentActivity;
import com.voxdon.xplorer.file.C3603w;
import com.voxdon.xplorer.widget.RefreshProgressBar;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/* renamed from: ax.d3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1935w extends AbstractC1936x implements a.InterfaceC0095a<Void>, ax.g3.g, b.f {
    private static final Logger a1 = ax.Q2.g.a(C1935w.class);
    private SwipeRefreshLayout P0;
    private GridView Q0;
    private C3427m R0;
    private ax.Z2.d S0;
    private C3603w T0;
    private RefreshProgressBar U0;
    private boolean V0;
    private BroadcastReceiver W0;
    private boolean X0;
    private Set<Integer> Y0 = new HashSet();
    private long Z0;

    /* renamed from: ax.d3.w$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if ("local.intent.action.USB_DETECTING_STARTED".equals(intent.getAction())) {
                if (C1935w.this.X0()) {
                    C1935w.this.O5(true);
                    return;
                }
                return;
            }
            if ("local.intent.action.USB_DETECTING_ENDED".equals(intent.getAction())) {
                if (C1935w.this.X0()) {
                    C1935w.this.O5(false);
                    return;
                }
                return;
            }
            if ("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED".equals(intent.getAction())) {
                if (C1935w.this.X0()) {
                    C1935w.this.L5();
                    C1935w.this.M5(intent.getStringArrayListExtra("CHANGED_STORAGES"));
                    return;
                }
                return;
            }
            if ("local.intent.action.LICENSE_STATUS_CHANGED".equals(intent.getAction())) {
                if (C3098a.i()) {
                    return;
                }
                C1935w.this.g4();
            } else if ("local.intent.action.FILE_SIZE_UNIT_CHANGED".equals(intent.getAction()) && C1935w.this.X0()) {
                C1935w.this.c4(false);
            }
        }
    }

    /* renamed from: ax.d3.w$b */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ax.c3.K item = C1935w.this.R0.getItem(i);
            if (item.d() == ax.Q2.f.b1 && C1935w.this.Y4(item)) {
                return;
            }
            C1935w.this.d5(item);
        }
    }

    /* renamed from: ax.d3.w$c */
    class c implements AdapterView.OnItemLongClickListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (C1935w.this.f0() == null) {
                return false;
            }
            ax.x3.v vVar = new ax.x3.v(new C3036c(C1935w.this.b(), R.style.ContextPopupMenu));
            C1935w.this.X4(vVar, C1935w.this.R0.getItem(i));
            if (!vVar.hasVisibleItems()) {
                return false;
            }
            vVar.h0(view, view.getWidth() / 2, (view.getHeight() * (-1)) / 2);
            return true;
        }
    }

    /* renamed from: ax.d3.w$d */
    class d implements SwipeRefreshLayout.j {
        d() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            C1935w.this.c4(true);
        }
    }

    /* renamed from: ax.d3.w$e */
    class e implements Runnable {
        final /* synthetic */ boolean q;

        e(boolean z) {
            this.q = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1935w.this.U0.setVisibility(this.q ? 0 : 8);
        }
    }

    /* renamed from: ax.d3.w$f */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1935w.this.P0.setRefreshing(false);
        }
    }

    /* renamed from: ax.d3.w$g */
    class g implements C3603w.d {
        g() {
        }

        @Override // com.voxdon.xplorer.file.C3603w.d
        public void a(boolean z) {
            C1935w.this.V0 = false;
            if (C1935w.this.b() == null) {
                return;
            }
            if (z) {
                C1935w.this.P5(10000);
            }
            if (C1935w.this.Y0.size() == 0) {
                C1935w.this.j5(false);
                C1935w.this.O5(false);
                C1935w.this.a5();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - C1935w.this.Z0 > 3600000) {
                C1935w.this.Z0 = currentTimeMillis;
                new a.b(C1935w.this.b()).i(new Void[0]);
            }
        }

        @Override // com.voxdon.xplorer.file.C3603w.d
        public void b(HashMap<ax.Q2.f, C3603w.f> hashMap) {
            Context b = C1935w.this.b();
            if (b == null || hashMap == null) {
                return;
            }
            C1935w c1935w = C1935w.this;
            c1935w.w5(b, c1935w.R0, C1935w.this.S0, hashMap);
            C1935w.this.J5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L5() {
        ax.t3.k.k();
        if (f0() == null) {
            return;
        }
        this.Q0.setColumnWidth(G0().getDimensionPixelSize(R.dimen.desktop_grid_column_width));
        this.R0.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M5(ArrayList<String> arrayList) {
        if (arrayList != null && X0()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                String str = arrayList.get(i);
                i++;
                ax.c3.K h = ax.c3.K.h(str);
                if (h != null) {
                    this.S0.w(h);
                    int j = this.S0.j(h);
                    if (j >= 0 && this.S0.z(j)) {
                        P5(j);
                    }
                }
            }
            J5();
        }
    }

    private void N5() {
        L5();
        this.Q0.setAdapter((ListAdapter) this.R0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O5(boolean z) {
        this.U0.post(new e(z));
        if (z || !this.P0.m()) {
            return;
        }
        this.P0.post(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P5(int i) {
        if (w0().d(i) == null) {
            w0().e(i, null, this);
        } else {
            w0().g(i, null, this);
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public boolean B1(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_analyze) {
            ax.Q2.a.i().m("menu_desktop", "analyze").c("by", "desktop_menu").e();
            s5(null, false, "desktop_menu");
        } else if (itemId == R.id.menu_premium) {
            ax.Q2.a.i().m("menu_desktop", "go_premium").c("from", "desktop_menu").e();
            F2(new Intent(b(), (Class<?>) PaymentActivity.class));
        } else if (itemId == R.id.menu_reward) {
            ax.Q2.a.i().m("menu_desktop", "rewarded_ad").c("from", "desktop_menu").e();
            if (f0() != null) {
                C4(true, "toolbar");
            }
        }
        return super.B1(menuItem);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        L5();
    }

    @Override // ax.g3.g
    public void J(String str) {
        if (f0() == null || this.S0 == null || this.R0 == null) {
            return;
        }
        androidx.fragment.app.f f0 = f0();
        ax.Q2.f fVar = ax.Q2.f.V0;
        this.S0.x(ax.c3.K.a(fVar, 0), ax.U2.d.F(f0()).G(ax.t3.e.h(f0, fVar, 0, null, false)), 0L, 0.0f, null, null);
        J5();
    }

    protected void J5() {
        this.R0.notifyDataSetChanged();
    }

    @Override // ax.J0.a.InterfaceC0095a
    /* renamed from: K5, reason: merged with bridge method [inline-methods] */
    public void v(ax.K0.c<Void> cVar, Void r11) {
        this.Y0.remove(Integer.valueOf(cVar.k()));
        if (this.Y0.isEmpty() && !this.V0) {
            j5(false);
            O5(false);
            if (f0() != null) {
                ax.u3.z.c(v3());
            }
            this.R0.d();
            a5();
        }
        AbstractC1936x.n nVar = (AbstractC1936x.n) cVar;
        this.S0.x(nVar.R(), nVar.N(), nVar.T(), nVar.V(), nVar.P(), nVar.S());
        J5();
        ax.Q2.f Q = nVar.Q();
        ax.Q2.f fVar = ax.Q2.f.o0;
        if ((Q == fVar || nVar.Q() == ax.Q2.f.p0) && nVar.W()) {
            if (!X0() || Z0()) {
                return;
            }
            if (nVar.Q() == ax.Q2.f.p0 && this.X0) {
                return;
            }
            if (nVar.Q() == fVar) {
                this.X0 = true;
            }
            k5(nVar.R(), nVar.V());
            return;
        }
        ax.Q2.f Q2 = nVar.Q();
        ax.Q2.f fVar2 = ax.Q2.f.p1;
        if (Q2 == fVar2 && X0() && !Z0()) {
            boolean p0 = ax.Z2.j.F().p0();
            long Q3 = ax.Z2.j.F().Q();
            if (ax.Q2.e.L(nVar.T(), nVar.O())) {
                p5(nVar.T());
            } else if (ax.Q2.e.M(Q3)) {
                o5(Q3);
            }
            boolean p02 = ax.Z2.j.F().p0();
            boolean b2 = this.R0.b(ax.c3.K.a(fVar2, 0));
            if (p0 != p02 || b2 == p02) {
                L5();
            }
        }
    }

    @Override // ax.d3.AbstractC1936x, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.S0 = new ax.Z2.d(f0());
        this.U0 = (RefreshProgressBar) view.findViewById(R.id.progressbar);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.gridview_swipe_refresh_layout);
        this.P0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnChildScrollUpCallback(new C3421g());
        this.Q0 = (GridView) view.findViewById(R.id.grid);
        this.R0 = new C3427m(f0(), this.S0);
        this.Q0.setOnItemClickListener(new b());
        this.Q0.setOnItemLongClickListener(new c());
        N5();
        this.P0.setOnRefreshListener(new d());
        x2(true);
        if (!ax.t3.k.v() || B3()) {
            l5();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void c4(boolean z) {
        if (z) {
            ax.Z2.j.F().K0();
        }
        this.S0.u();
        J5();
        for (ax.c3.K k : ax.c3.K.c()) {
            ax.Z2.b.k().s(k, k.e());
        }
        ax.c3.K a2 = ax.c3.K.a(ax.Q2.f.F0, 0);
        ax.Z2.b.k().s(a2, a2.e());
        if (b() != null && z) {
            C3603w.W(b());
            ax.U2.d.F(b()).Z();
        }
        g5(true);
    }

    @Override // ax.d3.AbstractC1936x
    protected void g5(boolean z) {
        this.X0 = false;
        if (X0()) {
            this.Y0.clear();
            j5(true);
            O5(z);
            this.S0.h();
            int m = this.S0.m();
            for (int i = 0; i < m; i++) {
                if (this.S0.z(i)) {
                    P5(i);
                }
            }
            C3603w c3603w = this.T0;
            if (c3603w == null || c3603w.m() == AbstractC3199q.f.FINISHED) {
                this.V0 = true;
                C3603w C = C3603w.C(f0(), new g());
                this.T0 = C;
                if (C == null) {
                    this.V0 = false;
                }
            }
        }
    }

    @Override // ax.d3.AbstractC1936x, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void h1(Bundle bundle) {
        super.h1(bundle);
        g5(true);
    }

    @Override // ax.d3.AbstractC1936x, androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        this.W0 = new a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED");
        intentFilter.addAction("local.intent.action.USB_DETECTING_STARTED");
        intentFilter.addAction("local.intent.action.USB_DETECTING_ENDED");
        intentFilter.addAction("local.intent.action.LICENSE_STATUS_CHANGED");
        intentFilter.addAction("local.intent.action.FILE_SIZE_UNIT_CHANGED");
        C3189g.a().c(intentFilter, this.W0);
        ax.Q2.b.h().e(this);
    }

    @Override // ax.d3.AbstractC1927n
    public void j3() {
        GridView gridView = this.Q0;
        if (gridView != null) {
            try {
                gridView.requestFocus();
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // ax.d3.AbstractC1927n, ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        super.onApplyWindowsInsets(bVar, z);
        if (R0() == null || !T3() || z) {
            return;
        }
        this.Q0.setClipToPadding(false);
        GridView gridView = this.Q0;
        gridView.setPadding(gridView.getPaddingLeft(), this.Q0.getPaddingTop(), this.Q0.getPaddingRight(), bVar.d);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        N5();
    }

    @Override // androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        MenuItem findItem;
        G3(menuInflater, menu, R.menu.list_desktop);
        MenuItem findItem2 = menu.findItem(R.id.menu_analyze);
        if (findItem2 != null && ax.t3.c.n().f() == 1) {
            findItem2.setShowAsAction(1);
        }
        MenuItem findItem3 = menu.findItem(R.id.menu_premium);
        if (findItem3 != null && !ax.t3.g.c()) {
            findItem3.setVisible(true);
        }
        if (ax.t3.c.n().B() && ax.t3.c.n().C()) {
            MenuItem findItem4 = menu.findItem(R.id.menu_reward);
            if (findItem4 == null || ax.t3.g.c()) {
                return;
            }
            findItem4.setVisible(true);
            findItem4.setShowAsAction(1);
            return;
        }
        MenuItem findItem5 = menu.findItem(R.id.menu_premium);
        if (findItem5 != null && !ax.t3.g.c() && ax.t3.c.n().r() == 2) {
            findItem5.setShowAsAction(1);
        }
        if (!Q3() || ax.t3.c.n().p() != 2 || (findItem = menu.findItem(R.id.menu_reward)) == null || ax.t3.g.c()) {
            return;
        }
        findItem.setVisible(true);
        findItem.setShowAsAction(1);
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_desktop, (ViewGroup) null);
    }

    @Override // ax.d3.AbstractC1936x, androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        if (this.W0 != null) {
            C3189g.a().h(this.W0);
            this.W0 = null;
        }
        ax.Q2.b.h().r(this);
    }

    @Override // ax.J0.a.InterfaceC0095a
    public ax.K0.c<Void> w(int i, Bundle bundle) {
        if (i == 10000) {
            return new AbstractC1936x.n(f0(), this.S0, ax.c3.K.a(ax.Q2.f.F0, 0), this.Y0);
        }
        androidx.fragment.app.f f0 = f0();
        ax.Z2.d dVar = this.S0;
        return new AbstractC1936x.n(f0, dVar, dVar.o(i), this.Y0);
    }

    @Override // ax.d3.AbstractC1936x, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void x1(boolean z) {
        super.x1(z);
        if (z) {
            return;
        }
        e5();
    }

    @Override // ax.J0.a.InterfaceC0095a
    public void p(ax.K0.c<Void> cVar) {
    }
}
