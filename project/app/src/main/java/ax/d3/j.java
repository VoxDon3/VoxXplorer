/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.storage.StorageManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AndroidRuntimeException;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import ax.Q2.a;
import ax.T.b;
import ax.U2.d;
import ax.W2.h;
import ax.X2.Q;
import ax.a3.b;
import ax.a3.k;
import ax.a3.n;
import ax.b3.c;
import ax.c0.A;
import ax.c3.K;
import ax.c3.u;
import ax.d3.J;
import ax.d3.e;
import ax.d3.f;
import ax.d3.g;
import ax.d3.h;
import ax.d3.n;
import ax.u3.B;
import ax.u3.m;
import ax.u3.q;
import ax.u3.z;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.activity.ResultActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.widget.MyViewPager;
import com.voxdon.xplorer.widget.PathBar;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class j
extends n
implements ax.g3.g,
ViewPager.j,
ax.g3.a {
    private ax.Q2.f C0;
    private SwipeRefreshLayout D0;
    private boolean E0 = false;
    private MyViewPager F0;
    private TabLayout G0;
    protected PathBar H0;
    private ax.x3.c I0;
    private s J0;
    private HashMap<String, Boolean> K0 = new HashMap();
    private EditText L0;
    private MenuItem M0;
    private boolean N0;
    private ax.x3.d O0;
    private m P0;
    private RecyclerView Q0;
    private View R0;
    private ax.t3.i S0;
    private Handler T0 = new Handler();
    private Context U0;

    private void D5() {
        this.e4(false);
        if (this.K3()) {
            this.O0.y(0);
            this.F0.U(false);
            if (this.v5() != null) {
                ListView listView = this.v5().getListView();
                listView.post(new Runnable(){
                    final View c0;
                    final j d0;
                    final View q;
                    {
                        this.d0 = j8;
                        this.q = view;
                        this.c0 = view2;
                    }

                    @Override
                    public void run() {
                        if (this.d0.K3()) {
                            int n8 = this.d0.g3();
                            int n9 = this.d0.O0.i();
                            int n10 = n8;
                            if (n8 < 0) {
                                n10 = -1;
                            }
                            n8 = n9;
                            if (n9 < 0) {
                                n8 = -1;
                            }
                            this.q.setNextFocusLeftId(n10);
                            this.c0.setNextFocusLeftId(n10);
                            this.q.setNextFocusRightId(n8);
                            this.c0.setNextFocusRightId(n8);
                        }
                    }
                });
                return;
            }
        } else {
            this.O0.y(8);
            this.F0.U(true);
            if (this.v5() != null) {
                ListView listView = this.v5().getListView();
                GridView gridView = this.v5().getGridView();
                listView.setNextFocusLeftId(-1);
                gridView.setNextFocusLeftId(-1);
                listView.setNextFocusRightId(-1);
                gridView.setNextFocusRightId(-1);
            }
        }
    }

    private void E5() {
        try {
            m m8;
            u.r0(this, ax.u3.o.b(), 1005);
            if (this.P0 == null) {
                this.P0 = m8 = new m();
            }
            m8 = this.P0;
            Context context = this.o3();
            m.c c8 = new m.c(this){
                final j a;
                {
                    this.a = j8;
                }

                @Override
                public void a() {
                    if (this.a.b() == null) {
                        ax.Ha.c.h().f().b("USAGE STAT MON 2").j().h();
                        Intent intent = u.E(this.a.o3(), null, null);
                        this.a.o3().startActivity(intent);
                        return;
                    }
                    Intent intent = u.E(this.a.b(), null, null);
                    this.a.F2(intent);
                }
            };
            m8.f(context, c8);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            this.E4(2131951927, 1);
            return;
        }
    }

    private void G5(String string, boolean bl) {
        String string2 = this.I0.y(this.F0.getCurrentItem());
        this.K0.put(string, bl);
        if (string2.equals(string)) {
            this.N5(bl);
        }
    }

    private void H5() {
        if (this.u3() != null && !this.u3().e0) {
            return;
        }
        this.H0.setParentLocation(this.C0);
    }

    private void I5() {
        ax.g3.c c8 = new ax.g3.c(this){
            final j c;
            {
                this.c = j8;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public void a(View view) {
                if (ax.W2.c.q().v()) {
                    this.c.X2(false);
                }
                List<ax.U2.f> list = this.c.v5().getCheckedItems();
                switch (view.getId()) {
                    default: {
                        return;
                    }
                    case 2131361951: {
                        this.c.t5(list);
                        this.c.h3();
                        return;
                    }
                    case 2131361950: {
                        if (list == null || list.isEmpty()) return;
                        this.c.C5(list.get(0));
                        this.c.h3();
                        return;
                    }
                    case 2131361948: {
                        if (list == null || list.isEmpty()) return;
                        this.c.K5(list.get(0));
                        this.c.h3();
                        return;
                    }
                    case 2131361936: {
                        if (list == null || list.isEmpty()) return;
                        this.c.A5(list.get(0).r());
                        this.c.h3();
                        return;
                    }
                    case 2131361933: {
                        if (list == null || list.isEmpty()) return;
                        this.c.M5(list.get(0).r(), "bottombar");
                        this.c.h3();
                        return;
                    }
                    case 2131361925: 
                }
                if (list != null && !list.isEmpty()) {
                    this.c.u5(list, false);
                }
                this.c.h3();
            }
        };
        this.O0.d(2131361925, 2131952243, 2131231089, c8);
        this.O0.d(2131361951, 2131952311, 2131231124, c8);
        this.O0.d(2131361948, 2131952304, 2131231220, c8);
        this.O0.d(2131361936, 2131952279, 2131231181, c8);
        this.O0.d(2131361950, 2131952308, 2131231233, c8);
    }

    private void J5() {
        this.H5();
        this.H0.setLocationUnit(this.A3());
        this.H0.setRootInfo(this.A3().f(this.b()));
        this.H0.setPathBarListener(new PathBar.h(this){
            final j a;
            {
                this.a = j8;
            }

            @Override
            public void a(String string) {
                if (this.a.K3()) {
                    this.a.h3();
                }
                this.a.i3(string);
            }

            @Override
            public void b(String string) {
            }

            @Override
            public void c(String string) {
            }

            @Override
            public void d(String string) {
                if (this.a.K3()) {
                    this.a.h3();
                }
                this.a.U3(string);
            }

            @Override
            public void e() {
            }
        });
    }

    private void K5(ax.U2.f f8) {
        Serializable serializable;
        a.i().m("menu_app", "app_share").e();
        if (this.f0() != null && (serializable = f8.f()) != null && ((File)serializable).exists()) {
            if (f8.E()) {
                serializable = new ArrayList();
                serializable.add(f8);
                this.u5((List<ax.U2.f>)((Object)serializable), true);
                return;
            }
            serializable = u.u(this.b(), (File)serializable);
            u.l0((Context)this.f0(), "application/vnd.android.package-archive", (Uri)serializable, f8.q(), null);
        }
    }

    private void L5(ax.U2.f f8) {
        File file;
        androidx.fragment.app.f f9 = this.f0();
        if (f9 != null && (file = d.F((Context)f9).z(f8)).exists()) {
            u.l0((Context)f9, "application/vnd.android.package-archive", u.u((Context)f9, file), f8.q(), null);
        }
    }

    private void N5(boolean bl) {
        this.T0.post(new Runnable(){
            final j c0;
            final boolean q;
            {
                this.c0 = j8;
                this.q = bl;
            }

            @Override
            public void run() {
                if (this.c0.D0.getWindowToken() == null) {
                    j.S4(this.c0, this.q);
                    return;
                }
                if (this.c0.D0.m() != this.q) {
                    this.c0.D0.setRefreshing(this.q);
                }
            }
        });
    }

    private void P5() {
        ax.a3.n n8 = ax.a3.n.k3(2131952496, 2131952547, 17039370, 0x1040000);
        n8.n3(new n.c(this){
            final j a;
            {
                this.a = j8;
            }

            @Override
            public void G(ax.a3.n n8) {
            }

            @Override
            public void P(ax.a3.n n8) {
                if (this.a.f0() == null) {
                    return;
                }
                if (!Q.J1()) {
                    ax.u3.b.f();
                    return;
                }
                this.a.E5();
            }

            @Override
            public void Z(ax.a3.n n8) {
            }
        });
        B.d0(this.A0(), n8, "usage_access", true);
    }

    public static /* synthetic */ void Q4(j j8, Bundle bundle) {
        j8.getClass();
        if (bundle.getBoolean("result_pref_changed")) {
            j8.z5();
        }
    }

    private void Q5(boolean bl) {
        if (bl) {
            this.R0.setVisibility(0);
            this.S0.g();
            this.Q0.setAdapter(this.S0.f());
            return;
        }
        this.R0.setVisibility(8);
    }

    private void R5(boolean bl, ax.U2.f f8) {
        if (bl) {
            this.O0.o(2131361936, true);
        } else {
            this.O0.o(2131361936, false);
        }
        if (bl) {
            this.O0.o(2131361948, true);
            if (f8 != null && f8.B()) {
                this.O0.o(2131361950, true);
                return;
            }
            this.O0.o(2131361950, false);
            return;
        }
        this.O0.o(2131361948, false);
        this.O0.o(2131361950, false);
    }

    static /* synthetic */ boolean S4(j j8, boolean bl) {
        j8.E0 = bl;
        return bl;
    }

    static /* synthetic */ boolean Y4(j j8, boolean bl) {
        j8.N0 = bl;
        return bl;
    }

    private void p5() {
        Editable editable;
        if (this.N0 && !TextUtils.isEmpty((CharSequence)(editable = this.L0.getText()))) {
            this.S0.d(editable.toString());
        }
    }

    private void q5(Menu menu, boolean bl) {
        if (this.f0() != null) {
            if (bl) {
                menu.setGroupVisible(2131362357, false);
            } else {
                menu.setGroupVisible(2131362357, true);
            }
            menu = menu.findItem(2131362525);
            if (menu != null) {
                if (Q.J1()) {
                    if (!ax.u3.o.d((Context)this.f0())) {
                        if (B.K((Context)this.f0(), ax.u3.o.b())) {
                            menu.setVisible(true);
                            return;
                        }
                        menu.setVisible(false);
                        return;
                    }
                    menu.setVisible(false);
                    return;
                }
                menu.setVisible(false);
            }
        }
    }

    private void r5() {
        MenuItem menuItem = this.M0;
        if (menuItem != null && menuItem.isActionViewExpanded()) {
            this.M0.collapseActionView();
        }
    }

    private boolean s5(List<ax.U2.f> object) {
        if (object != null && !object.isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (((ax.U2.f)object.next()).C()) continue;
                return true;
            }
        }
        return false;
    }

    private void t5(List<ax.U2.f> object) {
        if (object != null && !object.isEmpty()) {
            if (this.s5((List<ax.U2.f>)object)) {
                this.E4(2131952107, 1);
                return;
            }
            a.i().m("menu_app", "uninstall").b("size", object.size()).e();
            object = object.iterator();
            while (object.hasNext()) {
                ax.U2.f f8 = (ax.U2.f)object.next();
                if (!f8.C()) continue;
                f8 = new Intent("android.intent.action.DELETE", Uri.fromParts((String)"package", (String)f8.r(), null));
                try {
                    u.p0(this, (Intent)f8);
                }
                catch (SecurityException securityException) {
                    this.E4(2131951927, 1);
                    ax.Ha.c.h().f().b("APP DELETE SECURITY EXCEPTION").h();
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    this.E4(2131951927, 1);
                    ax.Ha.c.h().f().d("APP DELETE ACTIVITY NOT FOUND").h();
                }
            }
        }
    }

    private ax.x3.b v5() {
        return this.I0.w(this.F0.getCurrentItem());
    }

    private String w5(Context context) {
        if (this.z3() != ax.Q2.f.q1 && this.z3() != ax.Q2.f.r1) {
            return ax.t3.e.j(context, this.z3(), 0, null, false);
        }
        return "SizeDown";
    }

    private void y5() {
        Object object = this.J0;
        if (object != null) {
            ((q)object).e();
        }
        if (this.f0() == null) {
            return;
        }
        object = this.K0;
        Boolean bl = Boolean.FALSE;
        ((HashMap)object).put("APPS_DOWNLOADED", bl);
        this.K0.put("APPS_ALL", bl);
        this.J0 = object = new s(this, this);
        ((q)object).i(new Void[0]);
    }

    public void A5(String string) {
        block8: {
            ActivityNotFoundException activityNotFoundException2;
            block10: {
                block9: {
                    block7: {
                        if (this.f0() == null) {
                            return;
                        }
                        PackageManager packageManager = this.f0().getPackageManager();
                        string = packageManager.getLaunchIntentForPackage(string);
                        if (string == null) break block7;
                        try {
                            u.p0(this, (Intent)string);
                            string = "success";
                            break block8;
                        }
                        catch (AndroidRuntimeException androidRuntimeException) {
                            break block9;
                        }
                        catch (NullPointerException nullPointerException) {
                            break block9;
                        }
                        catch (SecurityException securityException) {
                            break block9;
                        }
                        catch (ActivityNotFoundException activityNotFoundException2) {
                            break block10;
                        }
                    }
                    string = "failure";
                    break block8;
                }
                ((Throwable)((Object)string)).printStackTrace();
                this.E4(2131951927, 1);
                string = "failure3";
                break block8;
            }
            activityNotFoundException2.printStackTrace();
            this.E4(2131951927, 1);
            string = "failure2";
        }
        a.i().m("menu_app", "app_open").c("result", string).e();
    }

    @Override
    public boolean B1(MenuItem menuItem) {
        int n8 = menuItem.getItemId();
        if (n8 != 2131362525) {
            if (n8 != 2131362551) {
                return super.B1(menuItem);
            }
            a.i().m("menu_app", "view_settings").c("loc", this.z3().I()).e();
            this.B5();
            return true;
        }
        this.P5();
        return true;
    }

    public void B5() {
        this.A(ax.a3.d.i3(this, null, false), "settings", true);
        J.c(this, "view_settings_request", new ax.d3.i(this));
    }

    @Override
    public String C3() {
        return this.A3().e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void C5(ax.U2.f f8) {
        if (this.f0() == null) {
            return;
        }
        try {
            Intent intent = u.m(f8.r());
            String string = f8.m();
            if (string != null && !"com.google.android.packageinstaller".equals(string)) {
                intent.setPackage(string);
            }
            u.p0(this, intent);
            return;
        }
        catch (ActivityNotFoundException | NullPointerException throwable) {
            try {
                u.p0(this, u.m(f8.r()));
                return;
            }
            catch (ActivityNotFoundException | NullPointerException throwable2) {
                this.E4(2131952448, 1);
            }
        }
    }

    @Override
    public void D(List<ax.U2.f> list) {
        if (list == null) {
            return;
        }
        int n8 = list.size();
        boolean bl = false;
        ax.U2.f f8 = n8 == 1 ? list.get(0) : null;
        if (list.size() == 1) {
            bl = true;
        }
        this.R5(bl, f8);
    }

    @Override
    public void F1(Menu menu) {
        super.F1(menu);
        if (this.f0() == null) {
            return;
        }
        MenuItem menuItem = menu.findItem(2131362551);
        ax.n.a a8 = ((ax.n.c)this.f0()).getSupportActionBar();
        if (menuItem != null && a8 != null && menuItem.isVisible()) {
            int n8 = ax.t3.e.k(this.b(), this.z3(), 0, null, false);
            menuItem.setIcon(z.p(a8.m(), n8));
        }
        this.q5(menu, false);
    }

    void F5(String string) {
        this.Q5(false);
        int n8 = this.I0.x("APPS_ALL");
        if (n8 < 0) {
            ax.u3.b.f();
            return;
        }
        ax.x3.b b8 = this.I0.w(n8);
        if (b8 != null) {
            b8.k(string.toString());
        }
    }

    @Override
    public void H1() {
        super.H1();
        this.y5();
    }

    @Override
    public void I(ax.U2.f f8) {
        this.p5();
        if (f8 == null) {
            return;
        }
        this.A(ax.a3.b.k3(f8, new b.e(){
            final ax.U2.f a;
            final j b;
            {
                this.b = j8;
                this.a = f8;
            }

            @Override
            public void a() {
                if (this.b.f0() == null) {
                    return;
                }
                this.b.C5(this.a);
            }

            @Override
            public void b() {
                if (this.b.f0() == null) {
                    return;
                }
                this.b.M5(this.a.r(), "list_item");
            }

            @Override
            public void c() {
                if (this.b.f0() == null) {
                    return;
                }
                this.b.A5(this.a.r());
            }
        }), "appproperties", true);
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
    }

    @Override
    public void J(String string) {
        this.y5();
    }

    @Override
    public void K(int n8) {
    }

    @Override
    public boolean K3() {
        if (this.I0 == null) {
            return false;
        }
        for (int i8 = 0; i8 < this.I0.e(); ++i8) {
            ax.x3.b b8 = this.I0.w(i8);
            if (b8 == null || !b8.h()) continue;
            return true;
        }
        return false;
    }

    @Override
    public void L1(View view, Bundle object) {
        super.L1(view, (Bundle)object);
        object = (SwipeRefreshLayout)view.findViewById(2131361892);
        this.D0 = object;
        ((SwipeRefreshLayout)object).setEnabled(false);
        if (this.D0.getWindowToken() == null) {
            this.D0.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this){
                final j a;
                {
                    this.a = j8;
                }

                public void onViewAttachedToWindow(View view) {
                    if (this.a.E0) {
                        this.a.D0.setRefreshing(true);
                        j.S4(this.a, false);
                    }
                    this.a.D0.removeOnAttachStateChangeListener(this);
                }

                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
        this.F0 = (MyViewPager)view.findViewById(2131361894);
        this.G0 = (TabLayout)view.findViewById(2131362927);
        this.H0 = (PathBar)view.findViewById(2131362680);
        if (this.x5()) {
            this.G0.setVisibility(0);
            this.H0.setVisibility(8);
        } else {
            this.G0.setVisibility(8);
            this.H0.setVisibility(0);
            this.J5();
        }
        this.G0.R(this.F0, true);
        this.F0.c(this);
        this.I0 = object = new ax.x3.c(this.f0(), this.A3(), this);
        this.F0.setAdapter((androidx.viewpager.widget.a)object);
        this.G0.h(new TabLayout.d(this){
            final j a;
            {
                this.a = j8;
            }

            @Override
            public void a(TabLayout.g g8) {
            }

            @Override
            public void b(TabLayout.g object) {
                String string = this.a.I0.y(((TabLayout.g)object).g());
                string.getClass();
                if (!string.equals("APPS_DOWNLOADED") && !string.equals("APPS_ALL")) {
                    return;
                }
                this.a.F0.N(((TabLayout.g)object).g(), true);
                this.a.h3();
                this.a.r5();
                object = this.a;
                ((j)object).N5((Boolean)((j)object).K0.get(string));
            }

            @Override
            public void c(TabLayout.g g8) {
            }
        });
        this.F0.c(new TabLayout.h(this.G0));
        this.Q0 = object = (RecyclerView)view.findViewById(2131362377);
        ((RecyclerView)object).setLayoutManager(new LinearLayoutManager(this.b(), 1, false));
        object = view.findViewById(2131362376);
        this.R0 = object;
        object.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final j c;
            {
                this.c = j8;
            }

            @Override
            public void a(View view) {
                if (this.c.L0 != null && this.c.L0.isShown()) {
                    this.c.M0.collapseActionView();
                }
            }
        });
        this.S0 = object = new ax.t3.i(this.b(), "app");
        ((ax.t3.i)object).i(new ax.g3.d(this, 400L){
            final j c;
            {
                this.c = j8;
                super(l8);
            }

            @Override
            public void a(AdapterView<?> object, View view, int n8, long l8) {
                if (this.c.L0 != null) {
                    object = this.c.S0.e(n8);
                    this.c.L0.setText(object);
                    this.c.L0.setSelection(((String)object).length());
                    this.c.S0.d((String)object);
                    this.c.Q5(false);
                    if (this.c.f0() != null) {
                        ((InputMethodManager)this.c.f0().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
                    }
                }
            }
        });
        object = view.findViewById(2131361934);
        this.O0 = new ax.x3.d((ax.n.c)this.f0(), (View)object, view.findViewById(2131361945));
        this.I5();
        this.x2(true);
        ax.Q2.b.h().e(this);
    }

    @Override
    public void M4() {
    }

    public void M5(String string, String string2) {
        if (this.f0() == null) {
            return;
        }
        string = u.d(string);
        try {
            u.p0(this, (Intent)string);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            this.E4(2131952448, 1);
        }
        catch (AndroidRuntimeException | NullPointerException | SecurityException throwable) {
            this.E4(2131951927, 1);
        }
        a.i().m("menu_app", "app_info").c("by", string2).e();
    }

    @Override
    public boolean N3() {
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void O5(String string, String string2, String string3) {
        block7: {
            PendingIntent.CanceledException canceledException2;
            block9: {
                RuntimeException var1_5;
                block8: {
                    block5: {
                        block6: {
                            if (this.b() == null) {
                                return;
                            }
                            try {
                                string = e.a((StorageManager)this.o3().getSystemService("storage"), string, 0);
                                if (string == null) break block5;
                                if (!Q.i0()) break block6;
                                string2 = f.a();
                                g.a((ActivityOptions)string2, 1);
                                h.a((PendingIntent)string, string2.toBundle());
                                break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                break block8;
                            }
                            catch (SecurityException securityException) {
                                break block8;
                            }
                            catch (PendingIntent.CanceledException canceledException2) {
                                break block9;
                            }
                        }
                        string.send();
                        break block7;
                    }
                    this.E4(2131951927, 1);
                    break block7;
                }
                var1_5.printStackTrace();
                this.E4(2131951927, 1);
                break block7;
            }
            canceledException2.printStackTrace();
            this.E4(2131951927, 1);
        }
        a.i().m("menu_app", "app_manage_space").c("by", string3).e();
    }

    @Override
    public void Q() {
        if (this.f0() == null) {
            return;
        }
        EditText editText = this.L0;
        if (editText != null) {
            editText.setEnabled(true);
        }
        this.r4(this.r3());
        this.G0.setBackgroundResource(2131230860);
        this.D5();
        this.v3().L0();
    }

    @Override
    public boolean V2() {
        if (this.K3()) {
            this.h3();
            return true;
        }
        EditText editText = this.L0;
        if (editText != null && editText.isShown()) {
            this.M0.collapseActionView();
            return true;
        }
        return false;
    }

    @Override
    protected boolean V3() {
        ax.x3.d d8 = this.O0;
        if (d8 != null && d8.m()) {
            return true;
        }
        return super.V3();
    }

    @Override
    public void Z3(String string) {
    }

    @Override
    public void c4(boolean bl) {
    }

    @Override
    public void e(int n8) {
    }

    @Override
    public void h(int n8, float f8, int n9) {
    }

    @Override
    public void h1(Bundle bundle) {
        super.h1(bundle);
    }

    @Override
    public void h3() {
        for (int i8 = 0; i8 < this.I0.e(); ++i8) {
            ax.x3.b b8 = this.I0.w(i8);
            if (b8 == null || !b8.h()) continue;
            b8.e();
        }
    }

    @Override
    public void i1(int n8, int n9, Intent intent) {
        m m8 = this.P0;
        if (m8 != null) {
            m8.d(n8, n9, intent);
        }
        if (n8 == 1005 && ax.u3.o.d((Context)this.f0()) && this.f0() != null) {
            this.c4(false);
            this.J3();
        }
    }

    @Override
    public void j(ActionMode actionMode, Menu menu) {
        if (this.f0() == null) {
            return;
        }
        this.p5();
        this.D5();
        this.b3(actionMode, menu, 0x7F0F0000);
        this.O0.A();
        actionMode = this.L0;
        if (actionMode != null) {
            actionMode.setEnabled(false);
        }
        this.r4(ax.Q.b.c((Context)this.f0(), 2131100794));
        int n8 = ax.Q.b.c((Context)this.f0(), 2131100792);
        this.G0.setBackgroundColor(n8);
        this.v3().p0();
    }

    @Override
    public void j1(Activity object) {
        super.j1((Activity)object);
        this.U0 = object.getApplicationContext();
        this.C0 = (ax.Q2.f)((Object)this.j0().getSerializable("parent_location"));
        object = this.K0;
        Boolean bl = Boolean.FALSE;
        ((HashMap)object).put("APPS_DOWNLOADED", bl);
        this.K0.put("APPS_ALL", bl);
    }

    @Override
    public void j3() {
        MyViewPager myViewPager = this.F0;
        if (myViewPager != null) {
            myViewPager.requestFocus();
        }
    }

    @Override
    public Context o3() {
        return this.U0;
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        super.onApplyWindowsInsets(b8, bl);
        if (this.R0() != null && this.T3()) {
            this.I0.z(b8, bl);
        }
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689494);
        menuInflater = menu.findItem(2131362551);
        this.M0 = menu.findItem(2131362538);
        if (this.z3() != ax.Q2.f.q1 && this.z3() != ax.Q2.f.r1) {
            menuInflater = (EditText)this.M0.getActionView().findViewById(2131362168);
            this.L0 = menuInflater;
            menuInflater.setOnFocusChangeListener(new View.OnFocusChangeListener(this){
                final j a;
                {
                    this.a = j8;
                }

                public void onFocusChange(View view, boolean bl) {
                    if (this.a.f0() == null) {
                        return;
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager)this.a.f0().getSystemService("input_method");
                    if (bl) {
                        view.postDelayed(new Runnable(){
                            final View c0;
                            final p d0;
                            final InputMethodManager q;
                            {
                                this.d0 = p8;
                                this.q = inputMethodManager;
                                this.c0 = view;
                            }

                            @Override
                            public void run() {
                                this.q.showSoftInput(this.c0, 1);
                            }
                        }, 100L);
                        return;
                    }
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
                }
            });
            this.L0.setFocusable(true);
            this.M0.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener(this){
                final j a;
                {
                    this.a = j8;
                }

                public boolean onMenuItemClick(MenuItem menuItem) {
                    if (this.a.F0.getCurrentItem() == 0) {
                        this.a.F0.setCurrentItem(1);
                    }
                    return true;
                }
            });
            A.h(this.M0, new A.c(){
                final Menu a;
                final j b;
                {
                    this.b = j8;
                    this.a = menu;
                }

                @Override
                public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                    this.b.L0.clearComposingText();
                    this.b.L0.setText((CharSequence)"");
                    this.b.L0.clearFocus();
                    j.Y4(this.b, false);
                    this.b.Q5(false);
                    this.b.T0.post(new Runnable(this){
                        final r q;
                        {
                            this.q = r8;
                        }

                        @Override
                        public void run() {
                            if (this.q.b.f0() == null) {
                                return;
                            }
                            r r8 = this.q;
                            r8.b.q5(r8.a, false);
                        }
                    });
                    return true;
                }

                @Override
                public boolean onMenuItemActionExpand(MenuItem menuItem) {
                    a.i().m("menu_app", "search").c("loc", this.b.z3().I()).e();
                    this.b.L0.requestFocus();
                    this.b.Q5(true);
                    this.b.q5(this.a, true);
                    j.Y4(this.b, true);
                    return true;
                }
            });
            this.L0.addTextChangedListener(new TextWatcher(this){
                final j a;
                {
                    this.a = j8;
                }

                public void afterTextChanged(Editable editable) {
                }

                public void beforeTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
                }

                public void onTextChanged(CharSequence charSequence, int n8, int n9, int n10) {
                    this.a.F5(charSequence.toString());
                }
            });
            this.L0.setOnEditorActionListener(new TextView.OnEditorActionListener(this){
                final j a;
                {
                    this.a = j8;
                }

                public boolean onEditorAction(TextView textView, int n8, KeyEvent object) {
                    if (n8 != 0 && (n8 & 0xFF) == 0) {
                        return false;
                    }
                    if (this.a.f0() == null) {
                        return true;
                    }
                    object = this.a.L0.getText().toString();
                    this.a.S0.d((String)object);
                    ((InputMethodManager)this.a.f0().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 2);
                    return true;
                }
            });
            return;
        }
        this.M0.setVisible(false);
        menuInflater.setVisible(false);
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558548, null);
    }

    @Override
    public void s(ax.U2.f f8) {
        this.p5();
        this.O5(f8.r(), f8.o(), "button");
    }

    @Override
    public void u1() {
        ax.Q2.b.h().r(this);
        this.F0.J(this);
        super.u1();
    }

    void u5(List<ax.U2.f> list, boolean bl) {
        a.i().m("menu_app", "app_backup").e();
        ax.W2.a a8 = ax.W2.a.m();
        a8.l(list, bl, new h.a(){
            final boolean a;
            final List b;
            final j c;
            {
                this.c = j8;
                this.a = bl;
                this.b = list;
            }

            @Override
            public void a(h.b object, String string, String string2, ArrayList<String> arrayList, Object object2) {
                this.c.y5();
                int n8 = i.a[object.ordinal()];
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            return;
                        }
                        if (!this.c.L3()) {
                            object2 = new Intent(this.c.o3(), ResultActivity.class);
                            object2.putExtra(ResultActivity.a, (Serializable)object);
                            object2.putExtra(ResultActivity.b, string);
                            object2.putExtra(ResultActivity.c, string2);
                            object2.putExtra(ResultActivity.d, arrayList);
                            object2.setFlags(0x10000000);
                            this.c.o3().startActivity((Intent)object2);
                            return;
                        }
                        object = k.i3(2131951894, string, string2, arrayList);
                        this.c.A((androidx.fragment.app.e)object, "result", false);
                        return;
                    }
                    this.c.F4(string, 1);
                    return;
                }
                if (!this.a) {
                    this.c.G4(string, 1, 2131952279, new ax.g3.c(this){
                        final o c;
                        {
                            this.c = o8;
                        }

                        @Override
                        public void a(View object) {
                            if (this.c.c.f0() == null) {
                                return;
                            }
                            object = Bookmark.a((Context)this.c.c.f0());
                            ((MainActivity)this.c.c.f0()).c2((Bookmark)object, "apps", null, null, null);
                        }
                    });
                    return;
                }
                object = (ax.U2.f)this.b.get(0);
                this.c.L5((ax.U2.f)object);
            }

            @Override
            public void b() {
            }
        });
        try {
            this.l(a8, true);
            return;
        }
        catch (c c8) {
            this.J4(2131951927, 1);
            return;
        }
    }

    @Override
    public int x3() {
        return 0;
    }

    protected boolean x5() {
        return true;
    }

    @Override
    public ax.Q2.f z3() {
        return ax.Q2.f.V0;
    }

    public void z5() {
        this.y5();
        for (int i8 = 0; i8 < this.I0.e(); ++i8) {
            this.I0.w(i8).j();
        }
        if (this.f0() != null) {
            this.f0().supportInvalidateOptionsMenu();
        }
    }

    private class s
    extends q<Void, Object, Void> {
        j h;
        Context i;
        Map<String, d.e> j;
        final j k;

        public s(j j8, j j9) {
            this.k = j8;
            super(q.e.d0);
            this.h = j9;
            this.i = j9.o3();
        }

        private void w(String string, boolean bl) {
            d d8 = d.F(this.i);
            boolean bl2 = string == "APPS_UNUSED" ? ax.T2.h.S(K.e).y() : d8.R(string);
            if (bl2 && !bl) {
                return;
            }
            this.h.G5(string, true);
        }

        private List<ax.U2.f> y(String string, boolean bl) {
            Object object;
            if (string == "APPS_UNUSED") {
                object = K.e;
                if (ax.T2.h.S((K)object).B0()) {
                    List<ax.U2.f> list = d.F(this.i).B();
                    ax.T2.h.S(object).P0(list);
                }
                object = ax.T2.h.S((K)object).h0();
            } else {
                object = d.F(this.i).D(string);
            }
            if (bl && object != null) {
                d.F(this.i).i((List<ax.U2.f>)object, false);
            }
            if (object != null && !object.isEmpty()) {
                d.F(this.i).e0((List<ax.U2.f>)object, this.k.w5(this.i));
            }
            this.h.G5(string, false);
            this.v(string, object);
            return object;
        }

        private void z() {
            this.j = d.F(this.i).y();
        }

        protected void A(Void object) {
            if (this.k.F0 != null) {
                this.k.F0.requestFocus();
            }
            if (this.k.L0 != null && !TextUtils.isEmpty((CharSequence)(object = this.k.L0.getText().toString().trim()))) {
                this.k.F5((String)object);
            }
        }

        @Override
        protected void o() {
        }

        @Override
        protected void r() {
        }

        @Override
        protected void s(Object ... object) {
            String string = (String)object[0];
            if ((object = (List)object[1]) != null && !object.isEmpty()) {
                this.h.I0.A(string, (List<ax.U2.f>)object, this.j);
            }
        }

        protected Void x(Void ... object) {
            object = new Runnable(this){
                final s q;
                {
                    this.q = s8;
                }

                @Override
                public void run() {
                    this.q.h.N5(true);
                }
            };
            this.k.T0.postDelayed((Runnable)object, 20L);
            this.z();
            this.k.T0.removeCallbacks((Runnable)object);
            boolean bl = ax.u3.o.d(this.i);
            if (this.k.z3() == ax.Q2.f.q1) {
                this.w("APPS_DOWNLOADED", bl);
                this.y("APPS_DOWNLOADED", bl);
            } else if (this.k.z3() == ax.Q2.f.r1) {
                this.w("APPS_UNUSED", bl);
                this.y("APPS_UNUSED", bl);
            } else {
                this.w("APPS_DOWNLOADED", bl);
                this.w("APPS_ALL", bl);
                this.y("APPS_DOWNLOADED", bl);
                this.y("APPS_ALL", bl);
            }
            return null;
        }
    }
}

