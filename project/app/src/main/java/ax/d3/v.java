/*
 * Decompiled with CFR 0.152.
 */
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.f;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import ax.J0.a;
import ax.P.b;
import ax.T.b;
import ax.U2.d;
import ax.Z2.a;
import ax.Z2.j;
import ax.Z2.s;
import ax.a3.O;
import ax.a3.q;
import ax.c3.K;
import ax.d3.x;
import ax.t3.a;
import ax.t3.k;
import ax.u3.B;
import ax.u3.g;
import ax.u3.q;
import ax.x3.h;
import ax.x3.i;
import ax.x3.k;
import ax.x3.l;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.activity.PaymentActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.w;
import com.voxdon.xplorer.service.CommandService;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class v
extends x
implements a.a<Void>,
ax.g3.g,
b.f,
MainActivity.J,
ax.g3.n,
ax.g3.m,
k.b {
    private static final Logger l1 = ax.Q2.g.a(v.class);
    private SwipeRefreshLayout P0;
    private View Q0;
    private View R0;
    private ViewPager S0;
    private TabLayout T0;
    private ViewPager U0;
    private GridView V0;
    private GridView W0;
    private GridView X0;
    private i Y0;
    private i Z0;
    private l a1;
    private ax.Z2.d b1;
    private TabLayout c1;
    private n d1;
    private ax.V2.d e1;
    private w f1;
    private Set<Integer> g1 = new HashSet<Integer>();
    private boolean h1;
    private BroadcastReceiver i1;
    private boolean j1;
    private long k1;

    static /* synthetic */ long A5(v v8, long l8) {
        v8.k1 = l8;
        return l8;
    }

    static /* synthetic */ boolean N5(v v8, boolean bl) {
        v8.h1 = bl;
        return bl;
    }

    private void R5(K object) {
        ArrayList<K> arrayList = new ArrayList<K>();
        arrayList.add((K)object);
        if (ax.Q2.f.X(((K)object).d())) {
            object = q.l3(arrayList);
            ((Fragment)object).D2(this, 0);
            this.A((e)object, "delete", true);
            return;
        }
        object = ax.a3.s.k3(arrayList);
        ((Fragment)object).D2(this, 0);
        this.A((e)object, "delete", true);
    }

    private void S5(K object) {
        if (CommandService.y((K)object)) {
            this.E4(2131951966, 1);
            return;
        }
        object = ax.a3.v.C3((K)object);
        ((Fragment)object).D2(this, 0);
        this.A((e)object, "edit", true);
    }

    private int T5() {
        return k.i(this.b());
    }

    private void U5() {
        n n8;
        this.S0.setOffscreenPageLimit(5);
        this.T0.R(this.S0, true);
        this.d1 = n8 = new n(this, this.b());
        this.S0.setAdapter(n8);
        this.i6();
    }

    private void V5(ViewPager viewPager) {
        o o8 = new o(this.b());
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(o8);
        viewPager.c(new ViewPager.n(this){
            final v a;
            {
                this.a = v8;
            }

            @Override
            public void K(int n8) {
                this.a.e6(n8);
            }

            @Override
            public void e(int n8) {
                if (this.a.P0 != null) {
                    SwipeRefreshLayout swipeRefreshLayout = this.a.P0;
                    boolean bl = n8 == 0;
                    swipeRefreshLayout.setEnabled(bl);
                }
            }
        });
        this.c1.R(viewPager, true);
        this.Y0 = new i((Context)this.f0(), this.b1, i.a.q);
        this.V0.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final v a;
            {
                this.a = v8;
            }

            public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                object = this.a.Y0.a(n8);
                if (((K)object).d() == ax.Q2.f.b1 && this.a.Y4((K)object)) {
                    return;
                }
                this.a.d5((K)object);
            }
        });
        this.V0.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(this){
            final v a;
            {
                this.a = v8;
            }

            public boolean onItemLongClick(AdapterView<?> object, View view, int n8, long l8) {
                if (this.a.f0() == null) {
                    return false;
                }
                object = this.a.Y0.a(n8);
                return this.a.f6(view, object);
            }
        });
        this.Z0 = new i((Context)this.f0(), this.b1, i.a.c0);
        this.W0.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final v a;
            {
                this.a = v8;
            }

            public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                object = this.a.Z0.a(n8);
                this.a.d5((K)object);
            }
        });
        this.W0.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(this){
            final v a;
            {
                this.a = v8;
            }

            public boolean onItemLongClick(AdapterView<?> object, View view, int n8, long l8) {
                if (this.a.f0() == null) {
                    return false;
                }
                object = this.a.Z0.a(n8);
                return this.a.f6(view, object);
            }
        });
        this.a1 = new l((Context)this.f0());
        this.X0.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final v a;
            {
                this.a = v8;
            }

            public void onItemClick(AdapterView<?> object, View object2, int n8, long l8) {
                object = this.a.a1.a(n8);
                object2 = ((s)object).e();
                if (((K)object2).d() != ax.Q2.f.W0 && ((K)object2).d() != ax.Q2.f.Y0) {
                    if (this.a.f0() instanceof MainActivity) {
                        ((MainActivity)this.a.f0()).E1("home").e((s)object);
                    }
                    return;
                }
                this.a.d5((K)object2);
            }
        });
        this.X0.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(this){
            final v a;
            {
                this.a = v8;
            }

            public boolean onItemLongClick(AdapterView<?> object, View view, int n8, long l8) {
                if (this.a.f0() == null) {
                    return false;
                }
                object = new ax.x3.v((Context)new ax.s.c(this.a.b(), 2132017455));
                s s8 = this.a.a1.a(n8);
                ((ax.x3.v)object).g0(s8.f());
                K k8 = s8.e();
                ax.Q2.f f8 = k8.d();
                if (f8 == ax.Q2.f.Y0) {
                    return false;
                }
                n8 = f8 != ax.Q2.f.W0 ? 1 : 0;
                if (n8 != 0) {
                    this.a.f0().getMenuInflater().inflate(2131689485, (Menu)object);
                } else {
                    this.a.f0().getMenuInflater().inflate(2131689483, (Menu)object);
                }
                if (n8 != 0) {
                    if (ax.Q2.f.X(f8)) {
                        ((androidx.appcompat.view.menu.e)object).findItem(2131362507).setVisible(false);
                    }
                    ((androidx.appcompat.view.menu.e)object).findItem(2131362507).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                        final K a;
                        final c b;
                        {
                            this.b = c8;
                            this.a = k8;
                        }

                        public boolean onMenuItemClick(MenuItem menuItem) {
                            this.b.a.S5(this.a);
                            return true;
                        }
                    });
                    ((androidx.appcompat.view.menu.e)object).findItem(2131362532).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                        final K a;
                        final c b;
                        {
                            this.b = c8;
                            this.a = k8;
                        }

                        public boolean onMenuItemClick(MenuItem menuItem) {
                            this.b.a.c6(this.a);
                            return true;
                        }
                    });
                    ((androidx.appcompat.view.menu.e)object).findItem(2131362531).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                        final K a;
                        final c b;
                        {
                            this.b = c8;
                            this.a = k8;
                        }

                        public boolean onMenuItemClick(MenuItem menuItem) {
                            this.b.a.R5(this.a);
                            return true;
                        }
                    });
                }
                if (ax.t3.j.x(this.a.o3())) {
                    f8 = ((androidx.appcompat.view.menu.e)object).findItem(2131362546);
                    f8.setVisible(true);
                    f8.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                        final K a;
                        final s b;
                        final c c;
                        {
                            this.c = c8;
                            this.a = k8;
                            this.b = s8;
                        }

                        public boolean onMenuItemClick(MenuItem menuItem) {
                            this.c.a.S2(this.a, this.b, true);
                            return true;
                        }
                    });
                }
                if (((androidx.appcompat.view.menu.e)object).hasVisibleItems()) {
                    ((ax.x3.v)object).h0(view, view.getWidth() / 2, view.getHeight() * -1 / 2);
                    return true;
                }
                return false;
            }
        });
        this.d6();
        viewPager.setCurrentItem(this.T5());
    }

    private void Y5() {
        this.d1.v();
        this.d1.l();
        this.i6();
    }

    private void Z5() {
        this.V0.setColumnWidth(this.G0().getDimensionPixelSize(2131165344));
        this.W0.setColumnWidth(this.G0().getDimensionPixelSize(2131165344));
        this.X0.setColumnWidth(this.G0().getDimensionPixelSize(2131165344));
        this.Y0.b();
        this.Z0.b();
        this.a1.b();
    }

    private void a6(ArrayList<String> arrayList) {
        if (arrayList == null || !this.X0()) {
            return;
        }
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            Object object = arrayList.get(n9);
            int n10 = n9 + 1;
            object = K.h((String)object);
            n9 = n10;
            if (object == null) continue;
            this.b1.w((K)object);
            int n11 = this.b1.j((K)object);
            n9 = n10;
            if (n11 < 0) continue;
            n9 = n10;
            if (!this.b1.z(n11)) continue;
            this.h6(n11);
            n9 = n10;
        }
        this.W5();
    }

    private void b6(int n8, int n9) {
        ViewGroup.LayoutParams layoutParams = this.R0.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)this.Q0.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = this.S0.getLayoutParams();
        int n10 = this.G0().getConfiguration().smallestScreenWidthDp;
        if (n9 < 332) {
            layoutParams.height = B.e(this.b(), 12);
            marginLayoutParams.topMargin = 0;
            this.Q0.setVisibility(8);
        } else if (n9 < 460 && n8 <= 486) {
            layoutParams.height = B.e(this.b(), n9 - 320);
            marginLayoutParams.topMargin = 0;
            this.Q0.setVisibility(8);
        } else if (n9 < 400) {
            layoutParams.height = B.e(this.b(), n9 - 240);
            marginLayoutParams.topMargin = 0;
            this.Q0.setVisibility(8);
        } else {
            int n11 = 134;
            int n12 = 620;
            if (n9 < 620) {
                layoutParams.height = B.e(this.b(), 192);
                marginLayoutParams.topMargin = 0;
                this.d1.w(134);
                this.Q0.setVisibility(0);
            } else {
                int n13 = n12;
                if (n10 >= 600) {
                    n13 = n8 > 1000 ? n12 : 768;
                }
                n12 = Math.max(n9 - n13, 0);
                n9 = Math.max(n12 * 8 / 10 / 2, 0);
                n13 = Math.max(n12 + 180 - n9 * 2, 180);
                layoutParams.height = B.e(this.b(), n12 + 192);
                marginLayoutParams.topMargin = B.e(this.b(), n9);
                marginLayoutParams.height = B.e(this.b(), n13);
                n12 = n13 - 40;
                layoutParams2.height = B.e(this.b(), n12);
                if (n12 >= 170 && n8 >= 360) {
                    n9 = 160;
                } else {
                    n9 = n11;
                    if (n12 > 144) {
                        n9 = n11;
                        if (n8 >= 360) {
                            n9 = n13 - 50;
                        }
                    }
                }
                this.d1.w(n9);
                this.Q0.setVisibility(0);
            }
        }
        this.R0.setLayoutParams(layoutParams);
        this.Q0.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
    }

    private void c6(K object) {
        object = O.i3((K)object);
        ((Fragment)object).D2(this, 0);
        this.A((e)object, "rename", true);
    }

    private void d6() {
        this.Z5();
        this.V0.setAdapter((ListAdapter)this.Y0);
        this.W0.setAdapter((ListAdapter)this.Z0);
        this.X0.setAdapter((ListAdapter)this.a1);
    }

    private void e6(int n8) {
        k.C(this.b(), n8);
    }

    private boolean f6(View view, K k8) {
        if (this.f0() == null) {
            return false;
        }
        ax.x3.v v8 = new ax.x3.v((Context)new ax.s.c(this.b(), 2132017455));
        this.X4(v8, k8);
        if (v8.hasVisibleItems()) {
            v8.h0(view, view.getWidth() / 2, view.getHeight() * -1 / 2);
            return true;
        }
        return false;
    }

    private void g6(boolean bl) {
        com.voxdon.xplorer.activity.b b8 = (com.voxdon.xplorer.activity.b)this.f0();
        if (b8 != null) {
            b8.runOnUiThread(new Runnable(){
                final boolean c0;
                final v d0;
                final com.voxdon.xplorer.activity.b q;
                {
                    this.d0 = v8;
                    this.q = b8;
                    this.c0 = bl;
                }

                @Override
                public void run() {
                    this.q.J0(this.c0);
                }
            });
            if (!bl && this.P0.m()) {
                this.P0.post(new Runnable(this){
                    final v q;
                    {
                        this.q = v8;
                    }

                    @Override
                    public void run() {
                        this.q.P0.setRefreshing(false);
                    }
                });
            }
        }
    }

    private void h6(int n8) {
        if (this.w0().d(n8) == null) {
            this.w0().e(n8, null, this);
            return;
        }
        this.w0().g(n8, null, this);
    }

    private void i6() {
        for (int i8 = 0; i8 < this.T0.getTabCount(); ++i8) {
            TabLayout.g g8 = this.T0.C(i8);
            if (g8 == null) continue;
            g8.s(0);
        }
    }

    @Override
    public boolean B1(MenuItem menuItem) {
        int n8 = menuItem.getItemId();
        if (n8 != 2131362502) {
            if (n8 == 2131362527) {
                ax.Q2.a.i().m("menu_desktop", "go_premium").c("from", "desktop_menu").e();
                this.F2(new Intent(this.b(), PaymentActivity.class));
            }
        } else {
            ax.Q2.a.i().m("menu_desktop", "analyze").c("by", "desktop_menu").e();
            this.s5(null, false, "desktop_menu");
        }
        return super.B1(menuItem);
    }

    @Override
    public void C() {
        this.a1.b();
    }

    @Override
    public void E(ax.Q2.f f8, int n8) {
        this.a1.b();
    }

    @Override
    public void H1() {
        super.H1();
        this.Z5();
    }

    @Override
    public void J(String object) {
        if (this.f0() != null && this.b1 != null && this.Y0 != null) {
            f f8 = this.f0();
            object = ax.Q2.f.V0;
            boolean bl = ax.t3.e.h((Context)f8, (ax.Q2.f)((Object)object), 0, null, false);
            this.b1.x(K.a((ax.Q2.f)((Object)object), 0), d.F((Context)this.f0()).G(bl), 0L, 0.0f, null, null);
            this.Y0.notifyDataSetChanged();
        }
    }

    @Override
    public void L1(View view, Bundle object) {
        super.L1(view, (Bundle)object);
        this.e1 = ((MainActivity)this.f0()).C1();
        this.b1 = new ax.Z2.d((Context)this.f0());
        this.R0 = view.findViewById(2131362005);
        this.Q0 = view.findViewById(2131362006);
        this.S0 = (ViewPager)view.findViewById(2131362008);
        this.T0 = (TabLayout)view.findViewById(2131362007);
        this.c1 = (TabLayout)view.findViewById(2131362927);
        object = (SwipeRefreshLayout)view.findViewById(2131362355);
        this.P0 = object;
        ((SwipeRefreshLayout)object).setOnChildScrollUpCallback(new ax.x3.g());
        this.V0 = (GridView)view.findViewById(2131362351);
        this.W0 = (GridView)view.findViewById(2131362352);
        this.X0 = (GridView)view.findViewById(2131362353);
        this.U0 = (ViewPager)view.findViewById(2131362929);
        this.P0.setOnRefreshListener(new SwipeRefreshLayout.j(this){
            final v a;
            {
                this.a = v8;
            }

            @Override
            public void a() {
                this.a.c4(true);
            }
        });
        this.x2(true);
        if (!k.v() || this.B3()) {
            this.l5();
        }
        this.V5(this.U0);
        this.U5();
    }

    protected void W5() {
        this.Y0.notifyDataSetChanged();
        this.Z0.notifyDataSetChanged();
        this.a1.notifyDataSetChanged();
    }

    public void X5(ax.K0.c<Void> n8, Void object) {
        block13: {
            block12: {
                ax.Q2.f f8;
                block11: {
                    this.g1.remove(n8.k());
                    if (this.g1.isEmpty() && !this.h1) {
                        this.j5(false);
                        this.g6(false);
                        this.a5();
                    }
                    n8 = n8;
                    this.b1.x(n8.R(), n8.N(), n8.T(), n8.V(), n8.P(), n8.S());
                    this.W5();
                    object = n8.Q();
                    f8 = ax.Q2.f.o0;
                    if (object == f8 || n8.Q() == ax.Q2.f.p0) break block11;
                    if (n8.Q() == ax.Q2.f.p1 && this.X0() && !this.Z0()) {
                        long l8 = j.F().Q();
                        if (ax.Q2.e.L(n8.T(), n8.O())) {
                            this.p5(n8.T());
                            return;
                        }
                        if (ax.Q2.e.M(l8)) {
                            this.o5(l8);
                            return;
                        }
                    }
                    break block12;
                }
                if (!n8.W()) break block13;
                if (this.X0() && !this.Z0()) {
                    if (n8.Q() == ax.Q2.f.p0 && this.j1) {
                        return;
                    }
                    if (n8.Q() == f8) {
                        this.j1 = true;
                    }
                }
            }
            return;
        }
        this.Y5();
    }

    @Override
    public void Z3(String string) {
        if ("/moveToHome".equals(string) && this.d1 != null && this.S0 != null) {
            this.Y5();
            int n8 = this.d1.f((Object)m.e0);
            if (n8 >= 0) {
                this.S0.N(n8, true);
            }
        }
    }

    @Override
    public void c4(boolean bl) {
        if (bl) {
            j.F().K0();
        }
        this.b1.u();
        this.W5();
        for (K k8 : K.c()) {
            ax.Z2.b.k().s(k8, k8.e());
        }
        K k9 = K.a(ax.Q2.f.F0, 0);
        ax.Z2.b.k().s(k9, k9.e());
        if (this.b() != null && bl) {
            w.W(this.b());
        }
        this.g5(true);
    }

    @Override
    public void d(ax.Q2.f f8, int n8) {
        if (this.f0() instanceof MainActivity) {
            ((MainActivity)this.f0()).E1("home").d(f8, n8);
        }
    }

    @Override
    protected void g5(boolean bl) {
        this.j1 = false;
        if (this.X0()) {
            this.g1.clear();
            this.j5(true);
            this.g6(bl);
            this.b1.h();
            int n8 = this.b1.m();
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!this.b1.z(i8)) continue;
                this.h6(i8);
            }
            w w8 = this.f1;
            if (w8 == null || w8.m() == q.f.d0) {
                this.h1 = true;
                this.f1 = w8 = w.C((Context)this.f0(), new w.d(this){
                    final v a;
                    {
                        this.a = v8;
                    }

                    @Override
                    public void a(boolean bl) {
                        v.N5(this.a, false);
                        if (this.a.b() != null) {
                            if (bl) {
                                this.a.h6(10000);
                            }
                            if (this.a.g1.size() == 0) {
                                this.a.j5(false);
                                this.a.g6(false);
                                this.a.a5();
                            }
                            this.a.Y5();
                            long l8 = System.currentTimeMillis();
                            if (l8 - this.a.k1 > 3600000L) {
                                v.A5(this.a, l8);
                                new a.b(this.a.b()).i(new Void[0]);
                            }
                        }
                    }

                    @Override
                    public void b(HashMap<ax.Q2.f, w.f> hashMap) {
                        Context context = this.a.b();
                        if (context != null && hashMap != null) {
                            v v8 = this.a;
                            v8.w5(context, v8.Z0, this.a.b1, hashMap);
                            this.a.Z0.notifyDataSetChanged();
                        }
                    }
                });
                if (w8 == null) {
                    this.h1 = false;
                }
            }
        }
    }

    @Override
    public void h1(Bundle bundle) {
        super.h1(bundle);
        this.g5(true);
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        ((MainActivity)activity).h1(this);
        this.i1 = new BroadcastReceiver(this){
            final v a;
            {
                this.a = v8;
            }

            public void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    if ("local.intent.action.USB_DETECTING_STARTED".equals(intent.getAction())) {
                        if (this.a.X0()) {
                            this.a.g6(true);
                            return;
                        }
                    } else if ("local.intent.action.USB_DETECTING_ENDED".equals(intent.getAction())) {
                        if (this.a.X0()) {
                            this.a.g6(false);
                            return;
                        }
                    } else if ("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED".equals(intent.getAction())) {
                        if (this.a.X0()) {
                            this.a.Z5();
                            this.a.a6(intent.getStringArrayListExtra("CHANGED_STORAGES"));
                            return;
                        }
                    } else if ("local.intent.action.LICENSE_STATUS_CHANGED".equals(intent.getAction())) {
                        if (!a.i()) {
                            this.a.g4();
                            return;
                        }
                    } else if ("local.intent.action.FILE_SIZE_UNIT_CHANGED".equals(intent.getAction()) && this.a.X0()) {
                        this.a.c4(false);
                    }
                }
            }
        };
        activity = new IntentFilter();
        activity.addAction("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED");
        activity.addAction("local.intent.action.LICENSE_STATUS_CHANGED");
        activity.addAction("local.intent.action.USB_DETECTING_STARTED");
        activity.addAction("local.intent.action.USB_DETECTING_ENDED");
        activity.addAction("local.intent.action.FILE_SIZE_UNIT_CHANGED");
        g.a().c((IntentFilter)activity, this.i1);
        ax.Q2.b.h().e(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void j3() {
        ViewPager viewPager = this.U0;
        if (viewPager == null) return;
        try {
            viewPager.requestFocus();
            return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        super.onApplyWindowsInsets(b8, bl);
        if (this.R0() != null && this.T3() && !bl) {
            this.V0.setClipToPadding(false);
            GridView gridView = this.V0;
            gridView.setPadding(gridView.getPaddingLeft(), this.V0.getPaddingTop(), this.V0.getPaddingRight(), b8.d);
            this.W0.setClipToPadding(false);
            gridView = this.W0;
            gridView.setPadding(gridView.getPaddingLeft(), this.W0.getPaddingTop(), this.W0.getPaddingRight(), b8.d);
            this.X0.setClipToPadding(false);
            gridView = this.X0;
            gridView.setPadding(gridView.getPaddingLeft(), this.X0.getPaddingTop(), this.X0.getPaddingRight(), b8.d);
        }
    }

    @Override
    public void p(ax.K0.c<Void> c8) {
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689496);
        menuInflater = menu.findItem(2131362502);
        if (menuInflater != null) {
            menuInflater.setVisible(false);
        }
        menu.findItem(2131362527);
        if (ax.t3.c.n().B() && ax.t3.c.n().C()) {
            menu.findItem(2131362533);
            return;
        }
        menu.findItem(2131362527);
    }

    @Override
    protected int q3() {
        return ax.Q.b.c((Context)this.f0(), 2131099831);
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558552, null);
    }

    @Override
    protected int r3() {
        return ax.Q.b.c((Context)this.f0(), 2131099835);
    }

    @Override
    protected h.a s3() {
        return h.a.q;
    }

    @Override
    public void t(int n8, int n9) {
        super.t(n8, n9);
        this.b6(n8, n9);
        this.d6();
    }

    @Override
    public void u(int n8) {
        if (this.f0() != null) {
            this.F4(this.f0().getResources().getQuantityString(2131820553, n8, new Object[]{n8}), 1);
            if (n8 > 0) {
                this.c4(false);
            }
        }
    }

    @Override
    public void v1() {
        super.v1();
        ((MainActivity)this.f0()).p2(this);
        if (this.i1 != null) {
            g.a().h(this.i1);
            this.i1 = null;
        }
        ax.Q2.b.h().r(this);
    }

    @Override
    public ax.K0.c<Void> w(int n8, Bundle object) {
        if (n8 == 10000) {
            return new x.n((Context)this.f0(), this.b1, K.a(ax.Q2.f.F0, 0), this.g1);
        }
        f f8 = this.f0();
        object = this.b1;
        return new x.n((Context)f8, (ax.Z2.d)object, ((ax.Z2.d)object).o(n8), this.g1);
    }

    @Override
    public void x(K k8) {
        this.s5(k8, true, "carousel_analysis");
    }

    @Override
    public void x1(boolean bl) {
        super.x1(bl);
        if (!bl) {
            this.e5();
        }
    }

    static final class m
    extends Enum<m> {
        public static final /* enum */ m c0;
        public static final /* enum */ m d0;
        public static final /* enum */ m e0;
        private static final m[] f0;
        public static final /* enum */ m q;

        static {
            q = new m();
            c0 = new m();
            d0 = new m();
            e0 = new m();
            f0 = m.d();
        }

        private static /* synthetic */ m[] d() {
            return new m[]{q, c0, d0, e0};
        }

        public static m valueOf(String string) {
            return Enum.valueOf(m.class, string);
        }

        public static m[] values() {
            return (m[])f0.clone();
        }
    }

    class n
    extends androidx.viewpager.widget.a {
        ax.x3.k c;
        ax.x3.k d;
        List<m> e;
        Map<m, View> f;
        ax.x3.j g;
        final v h;

        n(v v8, Context context) {
            this.h = v8;
            this.e = new ArrayList<m>();
            this.f = new HashMap<m, View>();
            this.v();
        }

        @Override
        public void b(ViewGroup viewGroup, int n8, Object object) {
            viewGroup.removeView(this.f.get(object));
            this.f.remove(object);
            if (object == m.e0) {
                this.h.e1.t(this.g);
                this.g = null;
            }
        }

        @Override
        public int e() {
            return this.e.size();
        }

        @Override
        public int f(Object object) {
            int n8;
            int n9 = n8 = this.e.indexOf(object);
            if (n8 == -1) {
                n9 = -2;
            }
            return n9;
        }

        @Override
        public CharSequence g(int n8) {
            return this.h.N0(2131951648, n8 + 1, this.e());
        }

        @Override
        public Object j(ViewGroup viewGroup, int n8) {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
            m m8 = this.e.get(n8);
            if ((n8 = m8.ordinal()) != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        layoutInflater = null;
                    } else {
                        layoutInflater = layoutInflater.inflate(2131558480, viewGroup, false);
                        GridView gridView = (GridView)layoutInflater.findViewById(2131362350);
                        this.g = new ax.x3.j(viewGroup.getContext(), this.h.e1);
                        this.h.e1.b(this.g);
                        gridView.setAdapter((ListAdapter)this.g);
                        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
                            final n a;
                            {
                                this.a = n8;
                            }

                            public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                                object = this.a.g.b(n8);
                                if (object == null || this.a.h.f0() == null) {
                                    return;
                                }
                                ((MainActivity)this.a.h.f0()).c2((Bookmark)object, "carousel", null, null, null);
                            }
                        });
                        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(this){
                            final n a;
                            {
                                this.a = n8;
                            }

                            public boolean onItemLongClick(AdapterView<?> object, View object2, int n8, long l8) {
                                if (this.a.h.f0() == null) {
                                    return false;
                                }
                                ax.x3.v v8 = new ax.x3.v((Context)new ax.s.c(this.a.h.b(), 2132017455));
                                this.a.h.f0().getMenuInflater().inflate(2131689484, (Menu)v8);
                                object = this.a.g.b(n8);
                                if (object == null) {
                                    object2 = ax.Ha.c.h().f().d("Desktop2LastVisited context bookmark null");
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("position:");
                                    ((StringBuilder)object).append(n8);
                                    ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                                    return false;
                                }
                                v8.g0(((Bookmark)object).v());
                                v8.findItem(2131362531).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(){
                                    final Bookmark a;
                                    final b b;
                                    {
                                        this.b = b8;
                                        this.a = bookmark;
                                    }

                                    public boolean onMenuItemClick(MenuItem object) {
                                        this.b.a.h.e1.r(this.a);
                                        this.b.a.h.e1.q(this.a);
                                        object = this.b.a.g;
                                        if (object != null) {
                                            object.notifyDataSetChanged();
                                        }
                                        return true;
                                    }
                                });
                                if (v8.hasVisibleItems()) {
                                    v8.h0((View)object2, object2.getWidth() / 2, object2.getHeight() * -1 / 2);
                                    return true;
                                }
                                return false;
                            }
                        });
                    }
                } else {
                    layoutInflater = layoutInflater.inflate(2131558483, viewGroup, false);
                    this.d = new ax.x3.k((View)layoutInflater, this.h.b1, K.f, this.h);
                }
            } else {
                layoutInflater = layoutInflater.inflate(2131558483, viewGroup, false);
                this.c = new ax.x3.k((View)layoutInflater, this.h.b1, K.e, this.h);
            }
            viewGroup.addView((View)layoutInflater);
            layoutInflater.setTag((Object)m8);
            this.f.put(m8, (View)layoutInflater);
            return m8;
        }

        @Override
        public boolean k(View view, Object object) {
            return view.getTag() == object;
        }

        public void v() {
            ax.x3.k k8;
            this.e.clear();
            this.e.add(m.c0);
            if (j.F().t0()) {
                this.e.add(m.d0);
            }
            if (this.h.e1 != null && this.h.e1.j().size() > 0) {
                this.e.add(m.e0);
            }
            if ((k8 = this.c) != null) {
                k8.a();
            }
            if ((k8 = this.d) != null) {
                k8.a();
            }
        }

        public void w(int n8) {
            ax.x3.k k8 = this.c;
            if (k8 != null) {
                k8.c(n8);
            }
            if ((k8 = this.d) != null) {
                k8.c(n8);
            }
        }
    }

    public static class o
    extends androidx.viewpager.widget.a {
        Context c;

        o(Context context) {
            this.c = context;
        }

        @Override
        public void b(ViewGroup viewGroup, int n8, Object object) {
            viewGroup.removeView((View)object);
        }

        @Override
        public int e() {
            return 3;
        }

        @Override
        public CharSequence g(int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        return "";
                    }
                    return this.c.getString(2131952170);
                }
                return this.c.getString(2131952166);
            }
            return this.c.getString(2131952167);
        }

        @Override
        public Object j(ViewGroup viewGroup, int n8) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        return null;
                    }
                    return viewGroup.findViewById(2131362353);
                }
                return viewGroup.findViewById(2131362352);
            }
            return viewGroup.findViewById(2131362351);
        }

        @Override
        public boolean k(View view, Object object) {
            return view == object;
        }
    }
}

