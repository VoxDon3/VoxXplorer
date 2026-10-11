package ax.d3;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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
import androidx.viewpager.widget.ViewPager;
import ax.J0.a;
import ax.P.b;
import ax.Z2.a;
import ax.a3.C1361q;
import ax.a3.C1362s;
import ax.a3.C1365v;
import ax.d3.AbstractC1936x;
import ax.s.C3036c;
import ax.t3.C3098a;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3189g;
import ax.x3.C3421g;
import ax.x3.C3422h;
import ax.x3.C3423i;
import ax.x3.C3424j;
import ax.x3.C3425k;
import ax.x3.C3426l;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.activity.PaymentActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.C3603w;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.R;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: ax.d3.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1934v extends AbstractC1936x implements a.InterfaceC0095a<Void>, ax.g3.g, b.f, MainActivity.J, ax.g3.n, ax.g3.m, C3425k.b {
    private static final Logger l1 = ax.Q2.g.a(C1934v.class);
    private SwipeRefreshLayout P0;
    private View Q0;
    private View R0;
    private ViewPager S0;
    private TabLayout T0;
    private ViewPager U0;
    private GridView V0;
    private GridView W0;
    private GridView X0;
    private C3423i Y0;
    private C3423i Z0;
    private C3426l a1;
    private ax.Z2.d b1;
    private TabLayout c1;
    private n d1;
    private ax.V2.d e1;
    private C3603w f1;
    private Set<Integer> g1 = new HashSet();
    private boolean h1;
    private BroadcastReceiver i1;
    private boolean j1;
    private long k1;

    /* renamed from: ax.d3.v$a */
    class a implements AdapterView.OnItemLongClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (C1934v.this.f0() == null) {
                return false;
            }
            return C1934v.this.f6(view, C1934v.this.Z0.getItem(i));
        }
    }

    /* renamed from: ax.d3.v$b */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ax.Z2.s item = C1934v.this.a1.getItem(i);
            ax.c3.K e = item.e();
            if (e.d() == ax.Q2.f.W0 || e.d() == ax.Q2.f.Y0) {
                C1934v.this.d5(e);
            } else if (C1934v.this.f0() instanceof MainActivity) {
                ((MainActivity) C1934v.this.f0()).E1("home").e(item);
            }
        }
    }

    /* renamed from: ax.d3.v$c */
    class c implements AdapterView.OnItemLongClickListener {

        /* renamed from: ax.d3.v$c$a */
        class a implements MenuItem.OnMenuItemClickListener {
            final /* synthetic */ ax.c3.K a;

            a(ax.c3.K k) {
                this.a = k;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                C1934v.this.S5(this.a);
                return true;
            }
        }

        /* renamed from: ax.d3.v$c$b */
        class b implements MenuItem.OnMenuItemClickListener {
            final /* synthetic */ ax.c3.K a;

            b(ax.c3.K k) {
                this.a = k;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                C1934v.this.c6(this.a);
                return true;
            }
        }

        /* renamed from: ax.d3.v$c$c, reason: collision with other inner class name */
        class MenuItemOnMenuItemClickListenerC0286c implements MenuItem.OnMenuItemClickListener {
            final /* synthetic */ ax.c3.K a;

            MenuItemOnMenuItemClickListenerC0286c(ax.c3.K k) {
                this.a = k;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                C1934v.this.R5(this.a);
                return true;
            }
        }

        /* renamed from: ax.d3.v$c$d */
        class d implements MenuItem.OnMenuItemClickListener {
            final /* synthetic */ ax.c3.K a;
            final /* synthetic */ ax.Z2.s b;

            d(ax.c3.K k, ax.Z2.s sVar) {
                this.a = k;
                this.b = sVar;
            }

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                C1934v.this.S2(this.a, this.b, true);
                return true;
            }
        }

        c() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (C1934v.this.f0() == null) {
                return false;
            }
            ax.x3.v vVar = new ax.x3.v(new C3036c(C1934v.this.b(), R.style.ContextPopupMenu));
            ax.Z2.s item = C1934v.this.a1.getItem(i);
            vVar.g0(item.f());
            ax.c3.K e = item.e();
            ax.Q2.f d2 = e.d();
            if (d2 == ax.Q2.f.Y0) {
                return false;
            }
            boolean z = d2 != ax.Q2.f.W0;
            if (z) {
                C1934v.this.f0().getMenuInflater().inflate(R.menu.context_desktop2_network, vVar);
            } else {
                C1934v.this.f0().getMenuInflater().inflate(R.menu.context_desktop, vVar);
            }
            if (z) {
                if (ax.Q2.f.X(d2)) {
                    vVar.findItem(R.id.menu_edit).setVisible(false);
                }
                vVar.findItem(R.id.menu_edit).setOnMenuItemClickListener(new a(e));
                vVar.findItem(R.id.menu_rename).setOnMenuItemClickListener(new b(e));
                vVar.findItem(R.id.menu_remove).setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC0286c(e));
            }
            if (ax.t3.j.x(C1934v.this.o3())) {
                MenuItem findItem = vVar.findItem(R.id.menu_shortcut);
                findItem.setVisible(true);
                findItem.setOnMenuItemClickListener(new d(e, item));
            }
            if (!vVar.hasVisibleItems()) {
                return false;
            }
            vVar.h0(view, view.getWidth() / 2, (view.getHeight() * (-1)) / 2);
            return true;
        }
    }

    /* renamed from: ax.d3.v$d */
    class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if ("local.intent.action.USB_DETECTING_STARTED".equals(intent.getAction())) {
                if (C1934v.this.X0()) {
                    C1934v.this.g6(true);
                    return;
                }
                return;
            }
            if ("local.intent.action.USB_DETECTING_ENDED".equals(intent.getAction())) {
                if (C1934v.this.X0()) {
                    C1934v.this.g6(false);
                    return;
                }
                return;
            }
            if ("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED".equals(intent.getAction())) {
                if (C1934v.this.X0()) {
                    C1934v.this.Z5();
                    C1934v.this.a6(intent.getStringArrayListExtra("CHANGED_STORAGES"));
                    return;
                }
                return;
            }
            if ("local.intent.action.LICENSE_STATUS_CHANGED".equals(intent.getAction())) {
                if (C3098a.i()) {
                    return;
                }
                C1934v.this.g4();
            } else if ("local.intent.action.FILE_SIZE_UNIT_CHANGED".equals(intent.getAction()) && C1934v.this.X0()) {
                C1934v.this.c4(false);
            }
        }
    }

    /* renamed from: ax.d3.v$e */
    class e implements SwipeRefreshLayout.j {
        e() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            C1934v.this.c4(true);
        }
    }

    /* renamed from: ax.d3.v$f */
    class f implements Runnable {
        final /* synthetic */ boolean c0;
        final /* synthetic */ com.voxdon.xplorer.activity.b q;

        f(com.voxdon.xplorer.activity.b bVar, boolean z) {
            this.q = bVar;
            this.c0 = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.J0(this.c0);
        }
    }

    /* renamed from: ax.d3.v$g */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1934v.this.P0.setRefreshing(false);
        }
    }

    /* renamed from: ax.d3.v$h */
    class h implements C3603w.d {
        h() {
        }

        @Override // com.voxdon.xplorer.file.C3603w.d
        public void a(boolean z) {
            C1934v.this.h1 = false;
            if (C1934v.this.b() == null) {
                return;
            }
            if (z) {
                C1934v.this.h6(10000);
            }
            if (C1934v.this.g1.size() == 0) {
                C1934v.this.j5(false);
                C1934v.this.g6(false);
                C1934v.this.a5();
            }
            C1934v.this.Y5();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - C1934v.this.k1 > 3600000) {
                C1934v.this.k1 = currentTimeMillis;
                new a.b(C1934v.this.b()).i(new Void[0]);
            }
        }

        @Override // com.voxdon.xplorer.file.C3603w.d
        public void b(HashMap<ax.Q2.f, C3603w.f> hashMap) {
            Context b = C1934v.this.b();
            if (b == null || hashMap == null) {
                return;
            }
            C1934v c1934v = C1934v.this;
            c1934v.w5(b, c1934v.Z0, C1934v.this.b1, hashMap);
            C1934v.this.Z0.notifyDataSetChanged();
        }
    }

    /* renamed from: ax.d3.v$i */
    class i extends ViewPager.n {
        i() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void K(int i) {
            C1934v.this.e6(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void e(int i) {
            if (C1934v.this.P0 != null) {
                C1934v.this.P0.setEnabled(i == 0);
            }
        }
    }

    /* renamed from: ax.d3.v$j */
    class j implements AdapterView.OnItemClickListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ax.c3.K item = C1934v.this.Y0.getItem(i);
            if (item.d() == ax.Q2.f.b1 && C1934v.this.Y4(item)) {
                return;
            }
            C1934v.this.d5(item);
        }
    }

    /* renamed from: ax.d3.v$k */
    class k implements AdapterView.OnItemLongClickListener {
        k() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (C1934v.this.f0() == null) {
                return false;
            }
            return C1934v.this.f6(view, C1934v.this.Y0.getItem(i));
        }
    }

    /* renamed from: ax.d3.v$l */
    class l implements AdapterView.OnItemClickListener {
        l() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C1934v.this.d5(C1934v.this.Z0.getItem(i));
        }
    }

    /* renamed from: ax.d3.v$m */
    enum m {
        NOTIFICATION,
        MAINSTORAGE,
        SDCARD,
        LASTVISITED
    }

    /* renamed from: ax.d3.v$n */
    class n extends androidx.viewpager.widget.a {
        C3425k c;
        C3425k d;
        List<m> e = new ArrayList();
        Map<m, View> f = new HashMap();
        C3424j g;

        /* renamed from: ax.d3.v$n$a */
        class a implements AdapterView.OnItemClickListener {
            a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Bookmark item = n.this.g.getItem(i);
                if (item == null || C1934v.this.f0() == null) {
                    return;
                }
                ((MainActivity) C1934v.this.f0()).c2(item, "carousel", null, null, null);
            }
        }

        /* renamed from: ax.d3.v$n$b */
        class b implements AdapterView.OnItemLongClickListener {

            /* renamed from: ax.d3.v$n$b$a */
            class a implements MenuItem.OnMenuItemClickListener {
                final /* synthetic */ Bookmark a;

                a(Bookmark bookmark) {
                    this.a = bookmark;
                }

                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(MenuItem menuItem) {
                    C1934v.this.e1.r(this.a);
                    C1934v.this.e1.q(this.a);
                    C3424j c3424j = n.this.g;
                    if (c3424j == null) {
                        return true;
                    }
                    c3424j.notifyDataSetChanged();
                    return true;
                }
            }

            b() {
            }

            @Override // android.widget.AdapterView.OnItemLongClickListener
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (C1934v.this.f0() == null) {
                    return false;
                }
                ax.x3.v vVar = new ax.x3.v(new C3036c(C1934v.this.b(), R.style.ContextPopupMenu));
                C1934v.this.f0().getMenuInflater().inflate(R.menu.context_desktop2_lastvisited, vVar);
                Bookmark item = n.this.g.getItem(i);
                if (item == null) {
                    ax.Ha.c.h().f().d("Desktop2LastVisited context bookmark null").g("position:" + i).h();
                    return false;
                }
                vVar.g0(item.v());
                vVar.findItem(R.id.menu_remove).setOnMenuItemClickListener(new a(item));
                if (!vVar.hasVisibleItems()) {
                    return false;
                }
                vVar.h0(view, view.getWidth() / 2, (view.getHeight() * (-1)) / 2);
                return true;
            }
        }

        n(Context context) {
            v();
        }

        @Override // androidx.viewpager.widget.a
        public void b(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView(this.f.get(obj));
            this.f.remove(obj);
            if (obj == m.LASTVISITED) {
                C1934v.this.e1.t(this.g);
                this.g = null;
            }
        }

        @Override // androidx.viewpager.widget.a
        public int e() {
            return this.e.size();
        }

        @Override // androidx.viewpager.widget.a
        public int f(Object obj) {
            int indexOf = this.e.indexOf(obj);
            if (indexOf == -1) {
                return -2;
            }
            return indexOf;
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence g(int i) {
            return C1934v.this.N0(R.string.accessibility_pager, Integer.valueOf(i + 1), Integer.valueOf(e()));
        }

        @Override // androidx.viewpager.widget.a
        public Object j(ViewGroup viewGroup, int i) {
            View inflate;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            m mVar = this.e.get(i);
            int ordinal = mVar.ordinal();
            if (ordinal == 1) {
                inflate = from.inflate(R.layout.desktop2_caruosel_storage, viewGroup, false);
                this.c = new C3425k(inflate, C1934v.this.b1, ax.c3.K.e, C1934v.this);
            } else if (ordinal == 2) {
                inflate = from.inflate(R.layout.desktop2_caruosel_storage, viewGroup, false);
                this.d = new C3425k(inflate, C1934v.this.b1, ax.c3.K.f, C1934v.this);
            } else if (ordinal != 3) {
                inflate = null;
            } else {
                inflate = from.inflate(R.layout.desktop2_carousel_last_visited, viewGroup, false);
                GridView gridView = (GridView) inflate.findViewById(R.id.grid);
                this.g = new C3424j(viewGroup.getContext(), C1934v.this.e1);
                C1934v.this.e1.b(this.g);
                gridView.setAdapter((ListAdapter) this.g);
                gridView.setOnItemClickListener(new a());
                gridView.setOnItemLongClickListener(new b());
            }
            viewGroup.addView(inflate);
            inflate.setTag(mVar);
            this.f.put(mVar, inflate);
            return mVar;
        }

        @Override // androidx.viewpager.widget.a
        public boolean k(View view, Object obj) {
            return view.getTag() == obj;
        }

        public void v() {
            this.e.clear();
            this.e.add(m.MAINSTORAGE);
            if (ax.Z2.j.F().t0()) {
                this.e.add(m.SDCARD);
            }
            if (C1934v.this.e1 != null && C1934v.this.e1.j().size() > 0) {
                this.e.add(m.LASTVISITED);
            }
            C3425k c3425k = this.c;
            if (c3425k != null) {
                c3425k.a();
            }
            C3425k c3425k2 = this.d;
            if (c3425k2 != null) {
                c3425k2.a();
            }
        }

        public void w(int i) {
            C3425k c3425k = this.c;
            if (c3425k != null) {
                c3425k.c(i);
            }
            C3425k c3425k2 = this.d;
            if (c3425k2 != null) {
                c3425k2.c(i);
            }
        }
    }

    /* renamed from: ax.d3.v$o */
    public static class o extends androidx.viewpager.widget.a {
        Context c;

        o(Context context) {
            this.c = context;
        }

        @Override // androidx.viewpager.widget.a
        public void b(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.a
        public int e() {
            return 3;
        }

        @Override // androidx.viewpager.widget.a
        public CharSequence g(int i) {
            return i != 0 ? i != 1 ? i != 2 ? HttpUrl.FRAGMENT_ENCODE_SET : this.c.getString(R.string.location_network) : this.c.getString(R.string.location_library) : this.c.getString(R.string.location_local);
        }

        @Override // androidx.viewpager.widget.a
        public Object j(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return viewGroup.findViewById(R.id.grid1);
            }
            if (i == 1) {
                return viewGroup.findViewById(R.id.grid2);
            }
            if (i != 2) {
                return null;
            }
            return viewGroup.findViewById(R.id.grid3);
        }

        @Override // androidx.viewpager.widget.a
        public boolean k(View view, Object obj) {
            return view == obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R5(ax.c3.K k2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(k2);
        if (ax.Q2.f.X(k2.d())) {
            C1361q l3 = C1361q.l3(arrayList);
            l3.D2(this, 0);
            A(l3, "delete", true);
        } else {
            C1362s k3 = C1362s.k3(arrayList);
            k3.D2(this, 0);
            A(k3, "delete", true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S5(ax.c3.K k2) {
        if (CommandService.y(k2)) {
            E4(R.string.error_storage_in_use, 1);
            return;
        }
        C1365v C3 = C1365v.C3(k2);
        C3.D2(this, 0);
        A(C3, "edit", true);
    }

    private int T5() {
        return ax.t3.k.i(b());
    }

    private void U5() {
        this.S0.setOffscreenPageLimit(5);
        this.T0.R(this.S0, true);
        n nVar = new n(b());
        this.d1 = nVar;
        this.S0.setAdapter(nVar);
        i6();
    }

    private void V5(ViewPager viewPager) {
        o oVar = new o(b());
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(oVar);
        viewPager.c(new i());
        this.c1.R(viewPager, true);
        this.Y0 = new C3423i(f0(), this.b1, C3423i.a.LOCAL);
        this.V0.setOnItemClickListener(new j());
        this.V0.setOnItemLongClickListener(new k());
        this.Z0 = new C3423i(f0(), this.b1, C3423i.a.LIBRARY);
        this.W0.setOnItemClickListener(new l());
        this.W0.setOnItemLongClickListener(new a());
        this.a1 = new C3426l(f0());
        this.X0.setOnItemClickListener(new b());
        this.X0.setOnItemLongClickListener(new c());
        d6();
        viewPager.setCurrentItem(T5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y5() {
        this.d1.v();
        this.d1.l();
        i6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z5() {
        this.V0.setColumnWidth(G0().getDimensionPixelSize(R.dimen.desktop2_grid_column_width));
        this.W0.setColumnWidth(G0().getDimensionPixelSize(R.dimen.desktop2_grid_column_width));
        this.X0.setColumnWidth(G0().getDimensionPixelSize(R.dimen.desktop2_grid_column_width));
        this.Y0.b();
        this.Z0.b();
        this.a1.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a6(ArrayList<String> arrayList) {
        if (arrayList != null && X0()) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                String str = arrayList.get(i2);
                i2++;
                ax.c3.K h2 = ax.c3.K.h(str);
                if (h2 != null) {
                    this.b1.w(h2);
                    int j2 = this.b1.j(h2);
                    if (j2 >= 0 && this.b1.z(j2)) {
                        h6(j2);
                    }
                }
            }
            W5();
        }
    }

    private void b6(int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = this.R0.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Q0.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.S0.getLayoutParams();
        int i4 = G0().getConfiguration().smallestScreenWidthDp;
        if (i3 < 332) {
            layoutParams.height = C3180B.e(b(), 12);
            marginLayoutParams.topMargin = 0;
            this.Q0.setVisibility(8);
        } else if (i3 < 460 && i2 <= 486) {
            layoutParams.height = C3180B.e(b(), i3 - 320);
            marginLayoutParams.topMargin = 0;
            this.Q0.setVisibility(8);
        } else if (i3 < 400) {
            layoutParams.height = C3180B.e(b(), i3 - 240);
            marginLayoutParams.topMargin = 0;
            this.Q0.setVisibility(8);
        } else {
            int i5 = 134;
            int i6 = 620;
            if (i3 < 620) {
                layoutParams.height = C3180B.e(b(), 192);
                marginLayoutParams.topMargin = 0;
                this.d1.w(134);
                this.Q0.setVisibility(0);
            } else {
                if (i4 >= 600 && i2 <= 1000) {
                    i6 = 768;
                }
                int max = Math.max(i3 - i6, 0);
                int max2 = Math.max(((max * 8) / 10) / 2, 0);
                int max3 = Math.max((max + SubsamplingScaleImageView.ORIENTATION_180) - (max2 * 2), SubsamplingScaleImageView.ORIENTATION_180);
                layoutParams.height = C3180B.e(b(), max + 192);
                marginLayoutParams.topMargin = C3180B.e(b(), max2);
                marginLayoutParams.height = C3180B.e(b(), max3);
                int i7 = max3 - 40;
                layoutParams2.height = C3180B.e(b(), i7);
                if (i7 >= 170 && i2 >= 360) {
                    i5 = 160;
                } else if (i7 > 144 && i2 >= 360) {
                    i5 = max3 - 50;
                }
                this.d1.w(i5);
                this.Q0.setVisibility(0);
            }
        }
        this.R0.setLayoutParams(layoutParams);
        this.Q0.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c6(ax.c3.K k2) {
        ax.a3.O i3 = ax.a3.O.i3(k2);
        i3.D2(this, 0);
        A(i3, "rename", true);
    }

    private void d6() {
        Z5();
        this.V0.setAdapter((ListAdapter) this.Y0);
        this.W0.setAdapter((ListAdapter) this.Z0);
        this.X0.setAdapter((ListAdapter) this.a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e6(int i2) {
        ax.t3.k.C(b(), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f6(View view, ax.c3.K k2) {
        if (f0() == null) {
            return false;
        }
        ax.x3.v vVar = new ax.x3.v(new C3036c(b(), R.style.ContextPopupMenu));
        X4(vVar, k2);
        if (!vVar.hasVisibleItems()) {
            return false;
        }
        vVar.h0(view, view.getWidth() / 2, (view.getHeight() * (-1)) / 2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g6(boolean z) {
        com.voxdon.xplorer.activity.b bVar = (com.voxdon.xplorer.activity.b) f0();
        if (bVar == null) {
            return;
        }
        bVar.runOnUiThread(new f(bVar, z));
        if (z || !this.P0.m()) {
            return;
        }
        this.P0.post(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h6(int i2) {
        if (w0().d(i2) == null) {
            w0().e(i2, null, this);
        } else {
            w0().g(i2, null, this);
        }
    }

    private void i6() {
        for (int i2 = 0; i2 < this.T0.getTabCount(); i2++) {
            TabLayout.g C = this.T0.C(i2);
            if (C != null) {
                C.s(0);
            }
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
        }
        return super.B1(menuItem);
    }

    @Override // com.voxdon.xplorer.activity.MainActivity.J
    public void C() {
        this.a1.b();
    }

    @Override // ax.g3.n
    public void E(ax.Q2.f fVar, int i2) {
        this.a1.b();
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        Z5();
    }

    @Override // ax.g3.g
    public void J(String str) {
        if (f0() == null || this.b1 == null || this.Y0 == null) {
            return;
        }
        androidx.fragment.app.f f0 = f0();
        ax.Q2.f fVar = ax.Q2.f.V0;
        this.b1.x(ax.c3.K.a(fVar, 0), ax.U2.d.F(f0()).G(ax.t3.e.h(f0, fVar, 0, null, false)), 0L, 0.0f, null, null);
        this.Y0.notifyDataSetChanged();
    }

    @Override // ax.d3.AbstractC1936x, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.e1 = ((MainActivity) f0()).C1();
        this.b1 = new ax.Z2.d(f0());
        this.R0 = view.findViewById(R.id.carousel_container);
        this.Q0 = view.findViewById(R.id.carousel_content);
        this.S0 = (ViewPager) view.findViewById(R.id.carousel_viewpager);
        this.T0 = (TabLayout) view.findViewById(R.id.carousel_indicator);
        this.c1 = (TabLayout) view.findViewById(R.id.tab_layout);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.gridview_swipe_refresh_layout);
        this.P0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnChildScrollUpCallback(new C3421g());
        this.V0 = (GridView) view.findViewById(R.id.grid1);
        this.W0 = (GridView) view.findViewById(R.id.grid2);
        this.X0 = (GridView) view.findViewById(R.id.grid3);
        this.U0 = (ViewPager) view.findViewById(R.id.tab_view_pager);
        this.P0.setOnRefreshListener(new e());
        x2(true);
        if (!ax.t3.k.v() || B3()) {
            l5();
        }
        V5(this.U0);
        U5();
    }

    protected void W5() {
        this.Y0.notifyDataSetChanged();
        this.Z0.notifyDataSetChanged();
        this.a1.notifyDataSetChanged();
    }

    @Override // ax.J0.a.InterfaceC0095a
    /* renamed from: X5, reason: merged with bridge method [inline-methods] */
    public void v(ax.K0.c<Void> cVar, Void r10) {
        this.g1.remove(Integer.valueOf(cVar.k()));
        if (this.g1.isEmpty() && !this.h1) {
            j5(false);
            g6(false);
            a5();
        }
        AbstractC1936x.n nVar = (AbstractC1936x.n) cVar;
        this.b1.x(nVar.R(), nVar.N(), nVar.T(), nVar.V(), nVar.P(), nVar.S());
        W5();
        ax.Q2.f Q = nVar.Q();
        ax.Q2.f fVar = ax.Q2.f.o0;
        if (Q == fVar || nVar.Q() == ax.Q2.f.p0) {
            if (!nVar.W()) {
                Y5();
                return;
            }
            if (!X0() || Z0()) {
                return;
            }
            if (!(nVar.Q() == ax.Q2.f.p0 && this.j1) && nVar.Q() == fVar) {
                this.j1 = true;
                return;
            }
            return;
        }
        if (nVar.Q() == ax.Q2.f.p1 && X0() && !Z0()) {
            long Q2 = ax.Z2.j.F().Q();
            if (ax.Q2.e.L(nVar.T(), nVar.O())) {
                p5(nVar.T());
            } else if (ax.Q2.e.M(Q2)) {
                o5(Q2);
            }
        }
    }

    @Override // ax.d3.AbstractC1936x, ax.d3.AbstractC1927n
    public void Z3(String str) {
        if (!"/moveToHome".equals(str) || this.d1 == null || this.S0 == null) {
            return;
        }
        Y5();
        int f2 = this.d1.f(m.LASTVISITED);
        if (f2 >= 0) {
            this.S0.N(f2, true);
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void c4(boolean z) {
        if (z) {
            ax.Z2.j.F().K0();
        }
        this.b1.u();
        W5();
        for (ax.c3.K k2 : ax.c3.K.c()) {
            ax.Z2.b.k().s(k2, k2.e());
        }
        ax.c3.K a2 = ax.c3.K.a(ax.Q2.f.F0, 0);
        ax.Z2.b.k().s(a2, a2.e());
        if (b() != null && z) {
            C3603w.W(b());
        }
        g5(true);
    }

    @Override // ax.g3.m
    public void d(ax.Q2.f fVar, int i2) {
        if (f0() instanceof MainActivity) {
            ((MainActivity) f0()).E1("home").d(fVar, i2);
        }
    }

    @Override // ax.d3.AbstractC1936x
    protected void g5(boolean z) {
        this.j1 = false;
        if (X0()) {
            this.g1.clear();
            j5(true);
            g6(z);
            this.b1.h();
            int m2 = this.b1.m();
            for (int i2 = 0; i2 < m2; i2++) {
                if (this.b1.z(i2)) {
                    h6(i2);
                }
            }
            C3603w c3603w = this.f1;
            if (c3603w == null || c3603w.m() == AbstractC3199q.f.FINISHED) {
                this.h1 = true;
                C3603w C = C3603w.C(f0(), new h());
                this.f1 = C;
                if (C == null) {
                    this.h1 = false;
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
        ((MainActivity) activity).h1(this);
        this.i1 = new d();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED");
        intentFilter.addAction("local.intent.action.LICENSE_STATUS_CHANGED");
        intentFilter.addAction("local.intent.action.USB_DETECTING_STARTED");
        intentFilter.addAction("local.intent.action.USB_DETECTING_ENDED");
        intentFilter.addAction("local.intent.action.FILE_SIZE_UNIT_CHANGED");
        C3189g.a().c(intentFilter, this.i1);
        ax.Q2.b.h().e(this);
    }

    @Override // ax.d3.AbstractC1927n
    public void j3() {
        ViewPager viewPager = this.U0;
        if (viewPager != null) {
            try {
                viewPager.requestFocus();
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
        this.V0.setClipToPadding(false);
        GridView gridView = this.V0;
        gridView.setPadding(gridView.getPaddingLeft(), this.V0.getPaddingTop(), this.V0.getPaddingRight(), bVar.d);
        this.W0.setClipToPadding(false);
        GridView gridView2 = this.W0;
        gridView2.setPadding(gridView2.getPaddingLeft(), this.W0.getPaddingTop(), this.W0.getPaddingRight(), bVar.d);
        this.X0.setClipToPadding(false);
        GridView gridView3 = this.X0;
        gridView3.setPadding(gridView3.getPaddingLeft(), this.X0.getPaddingTop(), this.X0.getPaddingRight(), bVar.d);
    }

    @Override // androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_desktop);
        MenuItem findItem = menu.findItem(R.id.menu_analyze);
        if (findItem != null) {
            findItem.setVisible(false);
        }
        menu.findItem(R.id.menu_premium);
        if (ax.t3.c.n().B() && ax.t3.c.n().C()) {
            menu.findItem(R.id.menu_reward);
        } else {
            menu.findItem(R.id.menu_premium);
        }
    }

    @Override // ax.d3.AbstractC1927n
    protected int q3() {
        return ax.Q.b.c(f0(), R.color.desktop2_actionbar_color);
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_desktop2, (ViewGroup) null);
    }

    @Override // ax.d3.AbstractC1927n
    protected int r3() {
        return ax.Q.b.c(f0(), R.color.desktop2_statusbar_color);
    }

    @Override // ax.d3.AbstractC1927n
    protected C3422h.a s3() {
        return C3422h.a.DARK;
    }

    @Override // ax.d3.AbstractC1927n, ax.d3.Z
    public void t(int i2, int i3) {
        super.t(i2, i3);
        b6(i2, i3);
        d6();
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

    @Override // ax.d3.AbstractC1936x, androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        ((MainActivity) f0()).p2(this);
        if (this.i1 != null) {
            C3189g.a().h(this.i1);
            this.i1 = null;
        }
        ax.Q2.b.h().r(this);
    }

    @Override // ax.J0.a.InterfaceC0095a
    public ax.K0.c<Void> w(int i2, Bundle bundle) {
        if (i2 == 10000) {
            return new AbstractC1936x.n(f0(), this.b1, ax.c3.K.a(ax.Q2.f.F0, 0), this.g1);
        }
        androidx.fragment.app.f f0 = f0();
        ax.Z2.d dVar = this.b1;
        return new AbstractC1936x.n(f0, dVar, dVar.o(i2), this.g1);
    }

    @Override // ax.x3.C3425k.b
    public void x(ax.c3.K k2) {
        s5(k2, true, "carousel_analysis");
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
