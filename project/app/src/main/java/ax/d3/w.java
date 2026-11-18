/*
 * Decompiled with CFR 0.152.
 */
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
import ax.Q2.a;
import ax.Q2.b;
import ax.Q2.e;
import ax.Q2.f;
import ax.U2.d;
import ax.Z2.a;
import ax.Z2.j;
import ax.c3.K;
import ax.d3.x;
import ax.s.c;
import ax.t3.k;
import ax.u3.g;
import ax.u3.q;
import ax.u3.z;
import ax.x3.m;
import ax.x3.v;
import com.voxdon.xplorer.activity.PaymentActivity;
import com.voxdon.xplorer.file.w;
import com.voxdon.xplorer.widget.RefreshProgressBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class w
extends x
implements a.a<Void>,
ax.g3.g,
b.f {
    private static final Logger a1 = ax.Q2.g.a(w.class);
    private SwipeRefreshLayout P0;
    private GridView Q0;
    private m R0;
    private ax.Z2.d S0;
    private com.voxdon.xplorer.file.w T0;
    private RefreshProgressBar U0;
    private boolean V0;
    private BroadcastReceiver W0;
    private boolean X0;
    private Set<Integer> Y0 = new HashSet<Integer>();
    private long Z0;

    static /* synthetic */ long A5(w w8, long l8) {
        w8.Z0 = l8;
        return l8;
    }

    static /* synthetic */ boolean G5(w w8, boolean bl) {
        w8.V0 = bl;
        return bl;
    }

    private void L5() {
        k.k();
        if (this.f0() == null) {
            return;
        }
        int n8 = this.G0().getDimensionPixelSize(2131165350);
        this.Q0.setColumnWidth(n8);
        this.R0.c();
    }

    private void M5(ArrayList<String> arrayList) {
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
            this.S0.w((K)object);
            int n11 = this.S0.j((K)object);
            n9 = n10;
            if (n11 < 0) continue;
            n9 = n10;
            if (!this.S0.z(n11)) continue;
            this.P5(n11);
            n9 = n10;
        }
        this.J5();
    }

    private void N5() {
        this.L5();
        this.Q0.setAdapter((ListAdapter)this.R0);
    }

    private void O5(boolean bl) {
        this.U0.post(new Runnable(){
            final w c0;
            final boolean q;
            {
                this.c0 = w8;
                this.q = bl;
            }

            @Override
            public void run() {
                RefreshProgressBar refreshProgressBar = this.c0.U0;
                int n8 = this.q ? 0 : 8;
                refreshProgressBar.setVisibility(n8);
            }
        });
        if (!bl && this.P0.m()) {
            this.P0.post(new Runnable(this){
                final w q;
                {
                    this.q = w8;
                }

                @Override
                public void run() {
                    this.q.P0.setRefreshing(false);
                }
            });
        }
    }

    private void P5(int n8) {
        if (this.w0().d(n8) == null) {
            this.w0().e(n8, null, this);
            return;
        }
        this.w0().g(n8, null, this);
    }

    @Override
    public boolean B1(MenuItem menuItem) {
        int n8 = menuItem.getItemId();
        if (n8 != 2131362502) {
            if (n8 != 2131362527) {
                if (n8 == 2131362533) {
                    a.i().m("menu_desktop", "rewarded_ad").c("from", "desktop_menu").e();
                    if (this.f0() != null) {
                        this.C4(true, "toolbar");
                    }
                }
            } else {
                a.i().m("menu_desktop", "go_premium").c("from", "desktop_menu").e();
                this.F2(new Intent(this.b(), PaymentActivity.class));
            }
        } else {
            a.i().m("menu_desktop", "analyze").c("by", "desktop_menu").e();
            this.s5(null, false, "desktop_menu");
        }
        return super.B1(menuItem);
    }

    @Override
    public void H1() {
        super.H1();
        this.L5();
    }

    @Override
    public void J(String object) {
        if (this.f0() != null && this.S0 != null && this.R0 != null) {
            object = this.f0();
            f f8 = f.V0;
            boolean bl = ax.t3.e.h((Context)object, f8, 0, null, false);
            this.S0.x(K.a(f8, 0), d.F((Context)this.f0()).G(bl), 0L, 0.0f, null, null);
            this.J5();
        }
    }

    protected void J5() {
        this.R0.notifyDataSetChanged();
    }

    public void K5(ax.K0.c<Void> n8, Void object) {
        this.Y0.remove(n8.k());
        if (this.Y0.isEmpty() && !this.V0) {
            this.j5(false);
            this.O5(false);
            if (this.f0() != null) {
                z.c(this.v3());
            }
            this.R0.d();
            this.a5();
        }
        n8 = n8;
        this.S0.x(n8.R(), n8.N(), n8.T(), n8.V(), n8.P(), n8.S());
        this.J5();
        f f8 = n8.Q();
        object = f.o0;
        if ((f8 == object || n8.Q() == f.p0) && n8.W()) {
            if (this.X0() && !this.Z0()) {
                if (n8.Q() == f.p0 && this.X0) {
                    return;
                }
                if (n8.Q() == object) {
                    this.X0 = true;
                }
                this.k5(n8.R(), n8.V());
                return;
            }
        } else {
            f8 = n8.Q();
            if (f8 == (object = f.p1) && this.X0() && !this.Z0()) {
                boolean bl = j.F().p0();
                long l8 = j.F().Q();
                if (e.L(n8.T(), n8.O())) {
                    this.p5(n8.T());
                } else if (e.M(l8)) {
                    this.o5(l8);
                }
                boolean bl2 = j.F().p0();
                boolean bl3 = this.R0.b(K.a((f)((Object)object), 0));
                if (bl != bl2 || bl3 == bl2) {
                    this.L5();
                }
            }
        }
    }

    @Override
    public void L1(View view, Bundle object) {
        super.L1(view, (Bundle)object);
        this.S0 = new ax.Z2.d((Context)this.f0());
        this.U0 = (RefreshProgressBar)view.findViewById(2131362720);
        object = (SwipeRefreshLayout)view.findViewById(2131362355);
        this.P0 = object;
        ((SwipeRefreshLayout)object).setOnChildScrollUpCallback(new ax.x3.g());
        this.Q0 = (GridView)view.findViewById(2131362350);
        this.R0 = new m((Context)this.f0(), this.S0);
        this.Q0.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final w a;
            {
                this.a = w8;
            }

            public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                object = this.a.R0.a(n8);
                if (((K)object).d() == f.b1 && this.a.Y4((K)object)) {
                    return;
                }
                this.a.d5((K)object);
            }
        });
        this.Q0.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(this){
            final w a;
            {
                this.a = w8;
            }

            public boolean onItemLongClick(AdapterView<?> object, View view, int n8, long l8) {
                if (this.a.f0() == null) {
                    return false;
                }
                object = new v((Context)new c(this.a.b(), 2132017455));
                K k8 = this.a.R0.a(n8);
                this.a.X4((v)object, k8);
                if (((androidx.appcompat.view.menu.e)object).hasVisibleItems()) {
                    ((v)object).h0(view, view.getWidth() / 2, view.getHeight() * -1 / 2);
                    return true;
                }
                return false;
            }
        });
        this.N5();
        this.P0.setOnRefreshListener(new SwipeRefreshLayout.j(this){
            final w a;
            {
                this.a = w8;
            }

            @Override
            public void a() {
                this.a.c4(true);
            }
        });
        this.x2(true);
        if (k.v() && !this.B3()) {
            return;
        }
        this.l5();
    }

    @Override
    public void c4(boolean bl) {
        K k82;
        if (bl) {
            j.F().K0();
        }
        this.S0.u();
        this.J5();
        for (K k82 : K.c()) {
            ax.Z2.b.k().s(k82, k82.e());
        }
        k82 = K.a(f.F0, 0);
        ax.Z2.b.k().s(k82, k82.e());
        if (this.b() != null && bl) {
            com.voxdon.xplorer.file.w.W(this.b());
            d.F(this.b()).Z();
        }
        this.g5(true);
    }

    @Override
    protected void g5(boolean bl) {
        this.X0 = false;
        if (this.X0()) {
            this.Y0.clear();
            this.j5(true);
            this.O5(bl);
            this.S0.h();
            int n8 = this.S0.m();
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!this.S0.z(i8)) continue;
                this.P5(i8);
            }
            com.voxdon.xplorer.file.w w8 = this.T0;
            if (w8 == null || w8.m() == q.f.d0) {
                this.V0 = true;
                this.T0 = w8 = com.voxdon.xplorer.file.w.C((Context)this.f0(), new w.d(this){
                    final w a;
                    {
                        this.a = w8;
                    }

                    @Override
                    public void a(boolean bl) {
                        w.G5(this.a, false);
                        if (this.a.b() != null) {
                            long l8;
                            if (bl) {
                                this.a.P5(10000);
                            }
                            if (this.a.Y0.size() == 0) {
                                this.a.j5(false);
                                this.a.O5(false);
                                this.a.a5();
                            }
                            if ((l8 = System.currentTimeMillis()) - this.a.Z0 > 3600000L) {
                                w.A5(this.a, l8);
                                new a.b(this.a.b()).i(new Void[0]);
                            }
                        }
                    }

                    @Override
                    public void b(HashMap<f, w.f> hashMap) {
                        Context context = this.a.b();
                        if (context != null && hashMap != null) {
                            w w8 = this.a;
                            w8.w5(context, w8.R0, this.a.S0, hashMap);
                            this.a.J5();
                        }
                    }
                });
                if (w8 == null) {
                    this.V0 = false;
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
        this.W0 = new BroadcastReceiver(this){
            final w a;
            {
                this.a = w8;
            }

            public void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    if ("local.intent.action.USB_DETECTING_STARTED".equals(intent.getAction())) {
                        if (this.a.X0()) {
                            this.a.O5(true);
                            return;
                        }
                    } else if ("local.intent.action.USB_DETECTING_ENDED".equals(intent.getAction())) {
                        if (this.a.X0()) {
                            this.a.O5(false);
                            return;
                        }
                    } else if ("local.intent.action.LOCAL_STORAGE_STATUS_CHANGED".equals(intent.getAction())) {
                        if (this.a.X0()) {
                            this.a.L5();
                            this.a.M5(intent.getStringArrayListExtra("CHANGED_STORAGES"));
                            return;
                        }
                    } else if ("local.intent.action.LICENSE_STATUS_CHANGED".equals(intent.getAction())) {
                        if (!ax.t3.a.i()) {
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
        activity.addAction("local.intent.action.USB_DETECTING_STARTED");
        activity.addAction("local.intent.action.USB_DETECTING_ENDED");
        activity.addAction("local.intent.action.LICENSE_STATUS_CHANGED");
        activity.addAction("local.intent.action.FILE_SIZE_UNIT_CHANGED");
        g.a().c((IntentFilter)activity, this.W0);
        b.h().e(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void j3() {
        GridView gridView = this.Q0;
        if (gridView == null) return;
        try {
            gridView.requestFocus();
            return;
        }
        catch (RuntimeException runtimeException) {
            return;
        }
    }

    @Override
    public void onApplyWindowsInsets(ax.T.b b8, boolean bl) {
        super.onApplyWindowsInsets(b8, bl);
        if (this.R0() != null && this.T3() && !bl) {
            this.Q0.setClipToPadding(false);
            GridView gridView = this.Q0;
            gridView.setPadding(gridView.getPaddingLeft(), this.Q0.getPaddingTop(), this.Q0.getPaddingRight(), b8.d);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.N5();
    }

    @Override
    public void p(ax.K0.c<Void> c8) {
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689496);
        menuInflater = menu.findItem(2131362502);
        if (menuInflater != null && ax.t3.c.n().f() == 1) {
            menuInflater.setShowAsAction(1);
        }
        if ((menuInflater = menu.findItem(2131362527)) != null && !ax.t3.g.c()) {
            menuInflater.setVisible(true);
        }
        if (ax.t3.c.n().B() && ax.t3.c.n().C()) {
            if ((menu = menu.findItem(2131362533)) != null && !ax.t3.g.c()) {
                menu.setVisible(true);
                menu.setShowAsAction(1);
                return;
            }
        } else {
            menuInflater = menu.findItem(2131362527);
            if (menuInflater != null && !ax.t3.g.c() && ax.t3.c.n().r() == 2) {
                menuInflater.setShowAsAction(1);
            }
            if (this.Q3() && ax.t3.c.n().p() == 2 && (menu = menu.findItem(2131362533)) != null && !ax.t3.g.c()) {
                menu.setVisible(true);
                menu.setShowAsAction(1);
            }
        }
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558551, null);
    }

    @Override
    public void v1() {
        super.v1();
        if (this.W0 != null) {
            g.a().h(this.W0);
            this.W0 = null;
        }
        b.h().r(this);
    }

    @Override
    public ax.K0.c<Void> w(int n8, Bundle object) {
        if (n8 == 10000) {
            return new x.n((Context)this.f0(), this.S0, K.a(f.F0, 0), this.Y0);
        }
        object = this.f0();
        ax.Z2.d d8 = this.S0;
        return new x.n((Context)object, d8, d8.o(n8), this.Y0);
    }

    @Override
    public void x1(boolean bl) {
        super.x1(bl);
        if (!bl) {
            this.e5();
        }
    }
}

