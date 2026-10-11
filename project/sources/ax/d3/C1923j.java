package ax.d3;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
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
import ax.U2.d;
import ax.W2.C1009a;
import ax.W2.C1011c;
import ax.W2.h;
import ax.a3.C1346b;
import ax.a3.C1348d;
import ax.a3.C1355k;
import ax.a3.C1358n;
import ax.b3.C1488c;
import ax.c0.C1751A;
import ax.c3.C1832u;
import ax.g3.InterfaceC2111a;
import ax.n.AbstractC2559a;
import ax.n.ActivityC2561c;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3195m;
import ax.u3.C3197o;
import ax.x3.C3416b;
import ax.x3.C3417c;
import ax.x3.C3418d;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.activity.ResultActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.widget.MyViewPager;
import com.voxdon.xplorer.widget.PathBar;
import com.voxdon.xplorer.R;
import com.google.android.material.tabs.TabLayout;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import okhttp3.HttpUrl;
import okhttp3.internal.ws.WebSocketProtocol;

/* renamed from: ax.d3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1923j extends AbstractC1927n implements ax.g3.g, ViewPager.j, InterfaceC2111a {
    private ax.Q2.f C0;
    private SwipeRefreshLayout D0;
    private MyViewPager F0;
    private TabLayout G0;
    protected PathBar H0;
    private C3417c I0;
    private s J0;
    private EditText L0;
    private MenuItem M0;
    private boolean N0;
    private C3418d O0;
    private C3195m P0;
    private RecyclerView Q0;
    private View R0;
    private ax.t3.i S0;
    private Context U0;
    private boolean E0 = false;
    private HashMap<String, Boolean> K0 = new HashMap<>();
    private Handler T0 = new Handler();

    /* renamed from: ax.d3.j$b */
    class b implements TextView.OnEditorActionListener {
        b() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 0 && (i & 255) == 0) {
                return false;
            }
            if (C1923j.this.f0() == null) {
                return true;
            }
            C1923j.this.S0.d(C1923j.this.L0.getText().toString());
            ((InputMethodManager) C1923j.this.f0().getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 2);
            return true;
        }
    }

    /* renamed from: ax.d3.j$c */
    class c implements Runnable {
        final /* synthetic */ boolean q;

        c(boolean z) {
            this.q = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1923j.this.D0.getWindowToken() == null) {
                C1923j.this.E0 = this.q;
            } else if (C1923j.this.D0.m() != this.q) {
                C1923j.this.D0.setRefreshing(this.q);
            }
        }
    }

    /* renamed from: ax.d3.j$d */
    class d implements C1346b.e {
        final /* synthetic */ ax.U2.f a;

        d(ax.U2.f fVar) {
            this.a = fVar;
        }

        @Override // ax.a3.C1346b.e
        public void a() {
            if (C1923j.this.f0() == null) {
                return;
            }
            C1923j.this.C5(this.a);
        }

        @Override // ax.a3.C1346b.e
        public void b() {
            if (C1923j.this.f0() == null) {
                return;
            }
            C1923j.this.M5(this.a.r(), "list_item");
        }

        @Override // ax.a3.C1346b.e
        public void c() {
            if (C1923j.this.f0() == null) {
                return;
            }
            C1923j.this.A5(this.a.r());
        }
    }

    /* renamed from: ax.d3.j$e */
    class e extends ax.g3.c {
        e() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (C1011c.q().v()) {
                C1923j.this.X2(false);
            }
            List<ax.U2.f> checkedItems = C1923j.this.v5().getCheckedItems();
            switch (view.getId()) {
                case R.id.bottom_menu_backup /* 2131361925 */:
                    if (checkedItems != null && !checkedItems.isEmpty()) {
                        C1923j.this.u5(checkedItems, false);
                    }
                    C1923j.this.h3();
                    break;
                case R.id.bottom_menu_info /* 2131361933 */:
                    if (checkedItems != null && !checkedItems.isEmpty()) {
                        C1923j.this.M5(checkedItems.get(0).r(), "bottombar");
                        C1923j.this.h3();
                        break;
                    }
                    break;
                case R.id.bottom_menu_open /* 2131361936 */:
                    if (checkedItems != null && !checkedItems.isEmpty()) {
                        C1923j.this.A5(checkedItems.get(0).r());
                        C1923j.this.h3();
                        break;
                    }
                    break;
                case R.id.bottom_menu_share /* 2131361948 */:
                    if (checkedItems != null && !checkedItems.isEmpty()) {
                        C1923j.this.K5(checkedItems.get(0));
                        C1923j.this.h3();
                        break;
                    }
                    break;
                case R.id.bottom_menu_store /* 2131361950 */:
                    if (checkedItems != null && !checkedItems.isEmpty()) {
                        C1923j.this.C5(checkedItems.get(0));
                        C1923j.this.h3();
                        break;
                    }
                    break;
                case R.id.bottom_menu_uninstall /* 2131361951 */:
                    C1923j.this.t5(checkedItems);
                    C1923j.this.h3();
                    break;
            }
        }
    }

    /* renamed from: ax.d3.j$f */
    class f implements Runnable {
        final /* synthetic */ View c0;
        final /* synthetic */ View q;

        f(View view, View view2) {
            this.q = view;
            this.c0 = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1923j.this.K3()) {
                int g3 = C1923j.this.g3();
                int i = C1923j.this.O0.i();
                if (g3 < 0) {
                    g3 = -1;
                }
                if (i < 0) {
                    i = -1;
                }
                this.q.setNextFocusLeftId(g3);
                this.c0.setNextFocusLeftId(g3);
                this.q.setNextFocusRightId(i);
                this.c0.setNextFocusRightId(i);
            }
        }
    }

    /* renamed from: ax.d3.j$h */
    class h implements C3195m.c {
        h() {
        }

        @Override // ax.u3.C3195m.c
        public void a() {
            if (C1923j.this.b() != null) {
                C1923j.this.F2(C1832u.E(C1923j.this.b(), null, null));
            } else {
                ax.Ha.c.h().f().b("USAGE STAT MON 2").j().h();
                C1923j.this.o3().startActivity(C1832u.E(C1923j.this.o3(), null, null));
            }
        }
    }

    /* renamed from: ax.d3.j$i */
    static /* synthetic */ class i {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[h.b.values().length];
            a = iArr;
            try {
                iArr[h.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[h.b.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[h.b.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: ax.d3.j$l */
    class l extends ax.g3.c {
        l() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (C1923j.this.L0 == null || !C1923j.this.L0.isShown()) {
                return;
            }
            C1923j.this.M0.collapseActionView();
        }
    }

    /* renamed from: ax.d3.j$m */
    class m extends ax.g3.d {
        m(long j) {
            super(j);
        }

        @Override // ax.g3.d
        public void a(AdapterView<?> adapterView, View view, int i, long j) {
            if (C1923j.this.L0 != null) {
                String e = C1923j.this.S0.e(i);
                C1923j.this.L0.setText(e);
                C1923j.this.L0.setSelection(e.length());
                C1923j.this.S0.d(e);
                C1923j.this.Q5(false);
                if (C1923j.this.f0() != null) {
                    ((InputMethodManager) C1923j.this.f0().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
                }
            }
        }
    }

    /* renamed from: ax.d3.j$p */
    class p implements View.OnFocusChangeListener {

        /* renamed from: ax.d3.j$p$a */
        class a implements Runnable {
            final /* synthetic */ View c0;
            final /* synthetic */ InputMethodManager q;

            a(InputMethodManager inputMethodManager, View view) {
                this.q = inputMethodManager;
                this.c0 = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.q.showSoftInput(this.c0, 1);
            }
        }

        p() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (C1923j.this.f0() == null) {
                return;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) C1923j.this.f0().getSystemService("input_method");
            if (z) {
                view.postDelayed(new a(inputMethodManager, view), 100L);
            } else {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
            }
        }
    }

    /* renamed from: ax.d3.j$q */
    class q implements MenuItem.OnMenuItemClickListener {
        q() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (C1923j.this.F0.getCurrentItem() == 0) {
                C1923j.this.F0.setCurrentItem(1);
            }
            return true;
        }
    }

    /* renamed from: ax.d3.j$r */
    class r implements C1751A.c {
        final /* synthetic */ Menu a;

        /* renamed from: ax.d3.j$r$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C1923j.this.f0() == null) {
                    return;
                }
                r rVar = r.this;
                C1923j.this.q5(rVar.a, false);
            }
        }

        r(Menu menu) {
            this.a = menu;
        }

        @Override // ax.c0.C1751A.c
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            C1923j.this.L0.clearComposingText();
            C1923j.this.L0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            C1923j.this.L0.clearFocus();
            C1923j.this.N0 = false;
            C1923j.this.Q5(false);
            C1923j.this.T0.post(new a());
            return true;
        }

        @Override // ax.c0.C1751A.c
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            ax.Q2.a.i().m("menu_app", "search").c("loc", C1923j.this.z3().I()).e();
            C1923j.this.L0.requestFocus();
            C1923j.this.Q5(true);
            C1923j.this.q5(this.a, true);
            C1923j.this.N0 = true;
            return true;
        }
    }

    private void D5() {
        e4(false);
        if (K3()) {
            this.O0.y(0);
            this.F0.U(false);
            if (v5() != null) {
                ListView listView = v5().getListView();
                listView.post(new f(listView, v5().getGridView()));
                return;
            }
            return;
        }
        this.O0.y(8);
        this.F0.U(true);
        if (v5() != null) {
            ListView listView2 = v5().getListView();
            GridView gridView = v5().getGridView();
            listView2.setNextFocusLeftId(-1);
            gridView.setNextFocusLeftId(-1);
            listView2.setNextFocusRightId(-1);
            gridView.setNextFocusRightId(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E5() {
        try {
            C1832u.r0(this, C3197o.b(), WebSocketProtocol.CLOSE_NO_STATUS_CODE);
            if (this.P0 == null) {
                this.P0 = new C3195m();
            }
            this.P0.f(o3(), new h());
        } catch (ActivityNotFoundException unused) {
            E4(R.string.error, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G5(String str, boolean z) {
        String y = this.I0.y(this.F0.getCurrentItem());
        this.K0.put(str, Boolean.valueOf(z));
        if (y.equals(str)) {
            N5(z);
        }
    }

    private void H5() {
        if (u3() == null || u3().e0) {
            this.H0.setParentLocation(this.C0);
        }
    }

    private void I5() {
        e eVar = new e();
        this.O0.d(R.id.bottom_menu_backup, R.string.menu_backup, R.drawable.ic_app_backup, eVar);
        this.O0.d(R.id.bottom_menu_uninstall, R.string.menu_uninstall, R.drawable.ic_delete, eVar);
        this.O0.d(R.id.bottom_menu_share, R.string.menu_share, R.drawable.ic_share, eVar);
        this.O0.d(R.id.bottom_menu_open, R.string.menu_open, R.drawable.ic_open_in_new, eVar);
        this.O0.d(R.id.bottom_menu_store, R.string.menu_store, R.drawable.ic_store, eVar);
    }

    private void J5() {
        H5();
        this.H0.setLocationUnit(A3());
        this.H0.setRootInfo(A3().f(b()));
        this.H0.setPathBarListener(new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K5(ax.U2.f fVar) {
        File f2;
        ax.Q2.a.i().m("menu_app", "app_share").e();
        if (f0() == null || (f2 = fVar.f()) == null || !f2.exists()) {
            return;
        }
        if (!fVar.E()) {
            C1832u.l0(f0(), "application/vnd.android.package-archive", C1832u.u(b(), f2), fVar.q(), null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        u5(arrayList, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L5(ax.U2.f fVar) {
        androidx.fragment.app.f f0 = f0();
        if (f0 == null) {
            return;
        }
        File z = ax.U2.d.F(f0).z(fVar);
        if (z.exists()) {
            C1832u.l0(f0, "application/vnd.android.package-archive", C1832u.u(f0, z), fVar.q(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N5(boolean z) {
        this.T0.post(new c(z));
    }

    private void P5() {
        C1358n k3 = C1358n.k3(R.string.permit_usage_access, R.string.request_usage_stats_permissions, android.R.string.ok, android.R.string.cancel);
        k3.n3(new g());
        C3180B.d0(A0(), k3, "usage_access", true);
    }

    public static /* synthetic */ void Q4(C1923j c1923j, Bundle bundle) {
        c1923j.getClass();
        if (bundle.getBoolean("result_pref_changed")) {
            c1923j.z5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q5(boolean z) {
        if (!z) {
            this.R0.setVisibility(8);
            return;
        }
        this.R0.setVisibility(0);
        this.S0.g();
        this.Q0.setAdapter(this.S0.f());
    }

    private void R5(boolean z, ax.U2.f fVar) {
        if (z) {
            this.O0.o(R.id.bottom_menu_open, true);
        } else {
            this.O0.o(R.id.bottom_menu_open, false);
        }
        if (!z) {
            this.O0.o(R.id.bottom_menu_share, false);
            this.O0.o(R.id.bottom_menu_store, false);
            return;
        }
        this.O0.o(R.id.bottom_menu_share, true);
        if (fVar == null || !fVar.B()) {
            this.O0.o(R.id.bottom_menu_store, false);
        } else {
            this.O0.o(R.id.bottom_menu_store, true);
        }
    }

    private void p5() {
        if (this.N0) {
            Editable text = this.L0.getText();
            if (TextUtils.isEmpty(text)) {
                return;
            }
            this.S0.d(text.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q5(Menu menu, boolean z) {
        if (f0() == null) {
            return;
        }
        if (z) {
            menu.setGroupVisible(R.id.group_non_search, false);
        } else {
            menu.setGroupVisible(R.id.group_non_search, true);
        }
        MenuItem findItem = menu.findItem(R.id.menu_permit_usage_access);
        if (findItem != null) {
            if (!ax.X2.Q.J1()) {
                findItem.setVisible(false);
                return;
            }
            if (C3197o.d(f0())) {
                findItem.setVisible(false);
            } else if (C3180B.K(f0(), C3197o.b())) {
                findItem.setVisible(true);
            } else {
                findItem.setVisible(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r5() {
        MenuItem menuItem = this.M0;
        if (menuItem == null || !menuItem.isActionViewExpanded()) {
            return;
        }
        this.M0.collapseActionView();
    }

    private boolean s5(List<ax.U2.f> list) {
        if (list != null && !list.isEmpty()) {
            Iterator<ax.U2.f> it = list.iterator();
            while (it.hasNext()) {
                if (!it.next().C()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t5(List<ax.U2.f> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (s5(list)) {
            E4(R.string.include_system_apps, 1);
            return;
        }
        ax.Q2.a.i().m("menu_app", "uninstall").b("size", list.size()).e();
        for (ax.U2.f fVar : list) {
            if (fVar.C()) {
                try {
                    C1832u.p0(this, new Intent("android.intent.action.DELETE", Uri.fromParts("package", fVar.r(), null)));
                } catch (ActivityNotFoundException unused) {
                    E4(R.string.error, 1);
                    ax.Ha.c.h().f().d("APP DELETE ACTIVITY NOT FOUND").h();
                } catch (SecurityException unused2) {
                    E4(R.string.error, 1);
                    ax.Ha.c.h().f().b("APP DELETE SECURITY EXCEPTION").h();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C3416b v5() {
        return this.I0.w(this.F0.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String w5(Context context) {
        return (z3() == ax.Q2.f.q1 || z3() == ax.Q2.f.r1) ? "SizeDown" : ax.t3.e.j(context, z3(), 0, null, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y5() {
        s sVar = this.J0;
        if (sVar != null) {
            sVar.e();
        }
        if (f0() == null) {
            return;
        }
        HashMap<String, Boolean> hashMap = this.K0;
        Boolean bool = Boolean.FALSE;
        hashMap.put("APPS_DOWNLOADED", bool);
        this.K0.put("APPS_ALL", bool);
        s sVar2 = new s(this);
        this.J0 = sVar2;
        sVar2.i(new Void[0]);
    }

    public void A5(String str) {
        String str2;
        if (f0() == null) {
            return;
        }
        try {
            Intent launchIntentForPackage = f0().getPackageManager().getLaunchIntentForPackage(str);
            if (launchIntentForPackage != null) {
                C1832u.p0(this, launchIntentForPackage);
                str2 = "success";
            } else {
                str2 = "failure";
            }
        } catch (ActivityNotFoundException e2) {
            e2.printStackTrace();
            E4(R.string.error, 1);
            str2 = "failure2";
        } catch (AndroidRuntimeException e3) {
            e = e3;
            e.printStackTrace();
            E4(R.string.error, 1);
            str2 = "failure3";
        } catch (NullPointerException e4) {
            e = e4;
            e.printStackTrace();
            E4(R.string.error, 1);
            str2 = "failure3";
        } catch (SecurityException e5) {
            e = e5;
            e.printStackTrace();
            E4(R.string.error, 1);
            str2 = "failure3";
        }
        ax.Q2.a.i().m("menu_app", "app_open").c("result", str2).e();
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public boolean B1(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_permit_usage_access) {
            P5();
            return true;
        }
        if (itemId != R.id.menu_view_settings) {
            return super.B1(menuItem);
        }
        ax.Q2.a.i().m("menu_app", "view_settings").c("loc", z3().I()).e();
        B5();
        return true;
    }

    public void B5() {
        A(C1348d.i3(this, null, false), "settings", true);
        J.c(this, "view_settings_request", new Consumer() { // from class: ax.d3.i
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void s(Object obj) {
                C1923j.Q4(C1923j.this, (Bundle) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // ax.d3.AbstractC1927n
    public String C3() {
        return A3().e();
    }

    public void C5(ax.U2.f fVar) {
        if (f0() == null) {
            return;
        }
        try {
            try {
                Intent m2 = C1832u.m(fVar.r());
                String m3 = fVar.m();
                if (m3 != null && !"com.google.android.packageinstaller".equals(m3)) {
                    m2.setPackage(m3);
                }
                C1832u.p0(this, m2);
            } catch (ActivityNotFoundException | NullPointerException unused) {
                C1832u.p0(this, C1832u.m(fVar.r()));
            }
        } catch (ActivityNotFoundException | NullPointerException unused2) {
            E4(R.string.no_application, 1);
        }
    }

    @Override // ax.g3.InterfaceC2111a
    public void D(List<ax.U2.f> list) {
        if (list == null) {
            return;
        }
        R5(list.size() == 1, list.size() == 1 ? list.get(0) : null);
    }

    @Override // androidx.fragment.app.Fragment
    public void F1(Menu menu) {
        super.F1(menu);
        if (f0() == null) {
            return;
        }
        MenuItem findItem = menu.findItem(R.id.menu_view_settings);
        AbstractC2559a supportActionBar = ((ActivityC2561c) f0()).getSupportActionBar();
        if (findItem != null && supportActionBar != null && findItem.isVisible()) {
            findItem.setIcon(ax.u3.z.p(supportActionBar.m(), ax.t3.e.k(b(), z3(), 0, null, false)));
        }
        q5(menu, false);
    }

    void F5(String str) {
        Q5(false);
        int x = this.I0.x("APPS_ALL");
        if (x < 0) {
            C3184b.f();
            return;
        }
        C3416b w = this.I0.w(x);
        if (w != null) {
            w.k(str.toString());
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        y5();
    }

    public void I(ax.U2.f fVar) {
        p5();
        if (fVar == null) {
            return;
        }
        A(C1346b.k3(fVar, new d(fVar)), "appproperties", true);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
    }

    @Override // ax.g3.g
    public void J(String str) {
        y5();
    }

    @Override // ax.d3.AbstractC1927n
    public boolean K3() {
        if (this.I0 == null) {
            return false;
        }
        for (int i2 = 0; i2 < this.I0.e(); i2++) {
            C3416b w = this.I0.w(i2);
            if (w != null && w.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.app_list_swipe_refresh_layout);
        this.D0 = swipeRefreshLayout;
        swipeRefreshLayout.setEnabled(false);
        if (this.D0.getWindowToken() == null) {
            this.D0.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0280j());
        }
        this.F0 = (MyViewPager) view.findViewById(R.id.app_tabs_vp_pager);
        this.G0 = (TabLayout) view.findViewById(R.id.tab_layout);
        this.H0 = (PathBar) view.findViewById(R.id.pathbar);
        if (x5()) {
            this.G0.setVisibility(0);
            this.H0.setVisibility(8);
        } else {
            this.G0.setVisibility(8);
            this.H0.setVisibility(0);
            J5();
        }
        this.G0.R(this.F0, true);
        this.F0.c(this);
        C3417c c3417c = new C3417c(f0(), A3(), this);
        this.I0 = c3417c;
        this.F0.setAdapter(c3417c);
        this.G0.h(new k());
        this.F0.c(new TabLayout.h(this.G0));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.history_list);
        this.Q0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(b(), 1, false));
        View findViewById = view.findViewById(R.id.history_layout);
        this.R0 = findViewById;
        findViewById.setOnClickListener(new l());
        ax.t3.i iVar = new ax.t3.i(b(), "app");
        this.S0 = iVar;
        iVar.i(new m(400L));
        this.O0 = new C3418d((ActivityC2561c) f0(), view.findViewById(R.id.bottom_menu_layout), view.findViewById(R.id.bottom_menu_safe_area));
        I5();
        x2(true);
        ax.Q2.b.h().e(this);
    }

    public void M5(String str, String str2) {
        if (f0() == null) {
            return;
        }
        try {
            C1832u.p0(this, C1832u.d(str));
        } catch (ActivityNotFoundException unused) {
            E4(R.string.no_application, 1);
        } catch (AndroidRuntimeException | NullPointerException | SecurityException unused2) {
            E4(R.string.error, 1);
        }
        ax.Q2.a.i().m("menu_app", "app_info").c("by", str2).e();
    }

    @Override // ax.d3.AbstractC1927n
    public boolean N3() {
        return false;
    }

    public void O5(String str, String str2, String str3) {
        PendingIntent manageSpaceActivityIntent;
        ActivityOptions makeBasic;
        if (b() == null) {
            return;
        }
        try {
            manageSpaceActivityIntent = ((StorageManager) o3().getSystemService("storage")).getManageSpaceActivityIntent(str, 0);
            if (manageSpaceActivityIntent == null) {
                E4(R.string.error, 1);
            } else if (ax.X2.Q.i0()) {
                makeBasic = ActivityOptions.makeBasic();
                makeBasic.setPendingIntentBackgroundActivityStartMode(1);
                manageSpaceActivityIntent.send(makeBasic.toBundle());
            } else {
                manageSpaceActivityIntent.send();
            }
        } catch (PendingIntent.CanceledException e2) {
            e2.printStackTrace();
            E4(R.string.error, 1);
        } catch (IllegalArgumentException e3) {
            e = e3;
            e.printStackTrace();
            E4(R.string.error, 1);
        } catch (SecurityException e4) {
            e = e4;
            e.printStackTrace();
            E4(R.string.error, 1);
        }
        ax.Q2.a.i().m("menu_app", "app_manage_space").c("by", str3).e();
    }

    @Override // ax.g3.InterfaceC2111a
    public void Q() {
        if (f0() == null) {
            return;
        }
        EditText editText = this.L0;
        if (editText != null) {
            editText.setEnabled(true);
        }
        r4(r3());
        this.G0.setBackgroundResource(R.drawable.bg_path_bar);
        D5();
        v3().L0();
    }

    @Override // ax.d3.AbstractC1927n
    public boolean V2() {
        if (K3()) {
            h3();
            return true;
        }
        EditText editText = this.L0;
        if (editText == null || !editText.isShown()) {
            return false;
        }
        this.M0.collapseActionView();
        return true;
    }

    @Override // ax.d3.AbstractC1927n
    protected boolean V3() {
        C3418d c3418d = this.O0;
        if (c3418d == null || !c3418d.m()) {
            return super.V3();
        }
        return true;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void h1(Bundle bundle) {
        super.h1(bundle);
    }

    @Override // ax.d3.AbstractC1927n
    public void h3() {
        for (int i2 = 0; i2 < this.I0.e(); i2++) {
            C3416b w = this.I0.w(i2);
            if (w != null && w.h()) {
                w.e();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(int i2, int i3, Intent intent) {
        C3195m c3195m = this.P0;
        if (c3195m != null) {
            c3195m.d(i2, i3, intent);
        }
        if (i2 == 1005 && C3197o.d(f0()) && f0() != null) {
            c4(false);
            J3();
        }
    }

    @Override // ax.g3.InterfaceC2111a
    public void j(ActionMode actionMode, Menu menu) {
        if (f0() == null) {
            return;
        }
        p5();
        D5();
        b3(actionMode, menu, R.menu.action_mode);
        this.O0.A();
        EditText editText = this.L0;
        if (editText != null) {
            editText.setEnabled(false);
        }
        r4(ax.Q.b.c(f0(), R.color.selection_statusbar));
        this.G0.setBackgroundColor(ax.Q.b.c(f0(), R.color.selection_background));
        v3().p0();
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        this.U0 = activity.getApplicationContext();
        this.C0 = (ax.Q2.f) j0().getSerializable("parent_location");
        HashMap<String, Boolean> hashMap = this.K0;
        Boolean bool = Boolean.FALSE;
        hashMap.put("APPS_DOWNLOADED", bool);
        this.K0.put("APPS_ALL", bool);
    }

    @Override // ax.d3.AbstractC1927n
    public void j3() {
        MyViewPager myViewPager = this.F0;
        if (myViewPager != null) {
            myViewPager.requestFocus();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public Context o3() {
        return this.U0;
    }

    @Override // ax.d3.AbstractC1927n, ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        super.onApplyWindowsInsets(bVar, z);
        if (R0() == null || !T3()) {
            return;
        }
        this.I0.z(bVar, z);
    }

    @Override // androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_app);
        MenuItem findItem = menu.findItem(R.id.menu_view_settings);
        this.M0 = menu.findItem(R.id.menu_search);
        if (z3() == ax.Q2.f.q1 || z3() == ax.Q2.f.r1) {
            this.M0.setVisible(false);
            findItem.setVisible(false);
            return;
        }
        EditText editText = (EditText) this.M0.getActionView().findViewById(R.id.edit);
        this.L0 = editText;
        editText.setOnFocusChangeListener(new p());
        this.L0.setFocusable(true);
        this.M0.setOnMenuItemClickListener(new q());
        C1751A.h(this.M0, new r(menu));
        this.L0.addTextChangedListener(new a());
        this.L0.setOnEditorActionListener(new b());
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_app_tabs, (ViewGroup) null);
    }

    @Override // ax.g3.InterfaceC2111a
    public void s(ax.U2.f fVar) {
        p5();
        O5(fVar.r(), fVar.o(), "button");
    }

    @Override // androidx.fragment.app.Fragment
    public void u1() {
        ax.Q2.b.h().r(this);
        this.F0.J(this);
        super.u1();
    }

    void u5(List<ax.U2.f> list, boolean z) {
        ax.Q2.a.i().m("menu_app", "app_backup").e();
        C1009a m2 = C1009a.m();
        m2.l(list, z, new o(z, list));
        try {
            l(m2, true);
        } catch (C1488c unused) {
            J4(R.string.error, 1);
        }
    }

    @Override // ax.d3.AbstractC1927n
    public int x3() {
        return 0;
    }

    protected boolean x5() {
        return true;
    }

    @Override // ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.V0;
    }

    public void z5() {
        y5();
        for (int i2 = 0; i2 < this.I0.e(); i2++) {
            this.I0.w(i2).j();
        }
        if (f0() != null) {
            f0().supportInvalidateOptionsMenu();
        }
    }

    /* renamed from: ax.d3.j$n */
    class n implements PathBar.h {
        n() {
        }

        @Override // com.voxdon.xplorer.widget.PathBar.h
        public void a(String str) {
            if (C1923j.this.K3()) {
                C1923j.this.h3();
            }
            C1923j.this.i3(str);
        }

        @Override // com.voxdon.xplorer.widget.PathBar.h
        public void d(String str) {
            if (C1923j.this.K3()) {
                C1923j.this.h3();
            }
            C1923j.this.U3(str);
        }

        @Override // com.voxdon.xplorer.widget.PathBar.h
        public void e() {
        }

        @Override // com.voxdon.xplorer.widget.PathBar.h
        public void b(String str) {
        }

        @Override // com.voxdon.xplorer.widget.PathBar.h
        public void c(String str) {
        }
    }

    /* renamed from: ax.d3.j$o */
    class o implements h.a {
        final /* synthetic */ boolean a;
        final /* synthetic */ List b;

        /* renamed from: ax.d3.j$o$a */
        class a extends ax.g3.c {
            a() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                if (C1923j.this.f0() == null) {
                    return;
                }
                ((MainActivity) C1923j.this.f0()).c2(Bookmark.a(C1923j.this.f0()), "apps", null, null, null);
            }
        }

        o(boolean z, List list) {
            this.a = z;
            this.b = list;
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            C1923j.this.y5();
            int i = i.a[bVar.ordinal()];
            if (i == 1) {
                if (!this.a) {
                    C1923j.this.G4(str, 1, R.string.menu_open, new a());
                    return;
                } else {
                    C1923j.this.L5((ax.U2.f) this.b.get(0));
                    return;
                }
            }
            if (i == 2) {
                C1923j.this.F4(str, 1);
                return;
            }
            if (i != 3) {
                return;
            }
            if (C1923j.this.L3()) {
                C1923j.this.A(C1355k.i3(R.string.dialog_title_failure, str, str2, arrayList), "result", false);
                return;
            }
            Intent intent = new Intent(C1923j.this.o3(), (Class<?>) ResultActivity.class);
            intent.putExtra(ResultActivity.a, bVar);
            intent.putExtra(ResultActivity.b, str);
            intent.putExtra(ResultActivity.c, str2);
            intent.putExtra(ResultActivity.d, arrayList);
            intent.setFlags(268435456);
            C1923j.this.o3().startActivity(intent);
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }

    /* renamed from: ax.d3.j$s */
    private class s extends AbstractC3199q<Void, Object, Void> {
        C1923j h;
        Context i;
        Map<String, d.e> j;

        /* renamed from: ax.d3.j$s$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                s.this.h.N5(true);
            }
        }

        public s(C1923j c1923j) {
            super(AbstractC3199q.e.HIGHER);
            this.h = c1923j;
            this.i = c1923j.o3();
        }

        private void w(String str, boolean z) {
            if (!(str == "APPS_UNUSED" ? ax.T2.h.S(ax.c3.K.e).y() : ax.U2.d.F(this.i).R(str)) || z) {
                this.h.G5(str, true);
            }
        }

        private List<ax.U2.f> y(String str, boolean z) {
            List<ax.U2.f> D;
            if (str == "APPS_UNUSED") {
                ax.c3.K k = ax.c3.K.e;
                if (ax.T2.h.S(k).B0()) {
                    ax.T2.h.S(k).P0(ax.U2.d.F(this.i).B());
                }
                D = ax.T2.h.S(k).h0();
            } else {
                D = ax.U2.d.F(this.i).D(str);
            }
            if (z && D != null) {
                ax.U2.d.F(this.i).i(D, false);
            }
            if (D != null && !D.isEmpty()) {
                ax.U2.d.F(this.i).e0(D, C1923j.this.w5(this.i));
            }
            this.h.G5(str, false);
            v(str, D);
            return D;
        }

        private void z() {
            this.j = ax.U2.d.F(this.i).y();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public void q(Void r2) {
            if (C1923j.this.F0 != null) {
                C1923j.this.F0.requestFocus();
            }
            if (C1923j.this.L0 != null) {
                String trim = C1923j.this.L0.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                C1923j.this.F5(trim);
            }
        }

        @Override // ax.u3.AbstractC3199q
        protected void s(Object... objArr) {
            String str = (String) objArr[0];
            List<ax.U2.f> list = (List) objArr[1];
            if (list == null || list.isEmpty()) {
                return;
            }
            this.h.I0.A(str, list, this.j);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            a aVar = new a();
            C1923j.this.T0.postDelayed(aVar, 20L);
            z();
            C1923j.this.T0.removeCallbacks(aVar);
            boolean d = C3197o.d(this.i);
            if (C1923j.this.z3() == ax.Q2.f.q1) {
                w("APPS_DOWNLOADED", d);
                y("APPS_DOWNLOADED", d);
                return null;
            }
            if (C1923j.this.z3() == ax.Q2.f.r1) {
                w("APPS_UNUSED", d);
                y("APPS_UNUSED", d);
                return null;
            }
            w("APPS_DOWNLOADED", d);
            w("APPS_ALL", d);
            y("APPS_DOWNLOADED", d);
            y("APPS_ALL", d);
            return null;
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
        }
    }

    /* renamed from: ax.d3.j$a */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C1923j.this.F5(charSequence.toString());
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ax.d3.j$g */
    class g implements C1358n.c {
        g() {
        }

        @Override // ax.a3.C1358n.c
        public void P(C1358n c1358n) {
            if (C1923j.this.f0() == null) {
                return;
            }
            if (ax.X2.Q.J1()) {
                C1923j.this.E5();
            } else {
                C3184b.f();
            }
        }

        @Override // ax.a3.C1358n.c
        public void G(C1358n c1358n) {
        }

        @Override // ax.a3.C1358n.c
        public void Z(C1358n c1358n) {
        }
    }

    /* renamed from: ax.d3.j$j, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0280j implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0280j() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (C1923j.this.E0) {
                C1923j.this.D0.setRefreshing(true);
                C1923j.this.E0 = false;
            }
            C1923j.this.D0.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: ax.d3.j$k */
    class k implements TabLayout.d {
        k() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            String y = C1923j.this.I0.y(gVar.g());
            y.getClass();
            if (y.equals("APPS_DOWNLOADED") || y.equals("APPS_ALL")) {
                C1923j.this.F0.N(gVar.g(), true);
                C1923j.this.h3();
                C1923j.this.r5();
                C1923j c1923j = C1923j.this;
                c1923j.N5(((Boolean) c1923j.K0.get(y)).booleanValue());
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void M4() {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void K(int i2) {
    }

    @Override // ax.d3.AbstractC1927n
    public void Z3(String str) {
    }

    @Override // ax.d3.AbstractC1927n
    public void c4(boolean z) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void e(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void h(int i2, float f2, int i3) {
    }
}
