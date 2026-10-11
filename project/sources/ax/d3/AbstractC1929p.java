package ax.d3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import ax.J0.a;
import ax.T2.h;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.x3.C3419e;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.d3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1929p extends AbstractC1927n implements a.InterfaceC0095a<Boolean> {
    TextView C0;
    TextView D0;
    View E0;
    LinearLayout F0;
    View G0;
    ViewPager H0;
    private C3419e I0;
    boolean J0;
    private SwipeRefreshLayout K0;
    private int L0 = -1;
    boolean M0 = false;
    long N0;
    int O0;

    /* renamed from: ax.d3.p$a */
    class a implements SwipeRefreshLayout.j {
        a() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            AbstractC1929p.this.c4(true);
        }
    }

    /* renamed from: ax.d3.p$b */
    class b implements SwipeRefreshLayout.i {
        b() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.i
        public boolean a(SwipeRefreshLayout swipeRefreshLayout, View view) {
            AbstractC1929p abstractC1929p = AbstractC1929p.this;
            if (abstractC1929p.J0) {
                return true;
            }
            return abstractC1929p.I0.x(AbstractC1929p.this.H0.getCurrentItem()).canScrollVertically(-1);
        }
    }

    /* renamed from: ax.d3.p$d */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1929p.this.D0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            AbstractC1929p.this.C0.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    /* renamed from: ax.d3.p$e */
    class e implements Runnable {
        final /* synthetic */ int q;

        e(int i) {
            this.q = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1929p.this.C0.setText(this.q);
        }
    }

    /* renamed from: ax.d3.p$f */
    class f implements Runnable {
        final /* synthetic */ String q;

        f(String str) {
            this.q = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1929p.this.D0.setText(this.q);
        }
    }

    /* renamed from: ax.d3.p$g */
    class g implements Runnable {
        final /* synthetic */ boolean q;

        g(boolean z) {
            this.q = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC1929p.this.K0.m() != this.q) {
                AbstractC1929p.this.K0.setRefreshing(this.q);
            }
        }
    }

    private C3419e d5(int i) {
        C3419e c3419e = new C3419e(b());
        for (int i2 = 0; i2 < i; i2++) {
            c3419e.v(this.H0, "TAG" + i2, "TITLE" + i2);
        }
        return c3419e;
    }

    private void m5(boolean z) {
        if (X0()) {
            o5(z);
            if (w0().d(0) == null) {
                w0().e(0, null, this);
            } else {
                w0().g(0, null, this);
            }
        }
    }

    @Override // ax.d3.AbstractC1927n
    public String C3() {
        return null;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        if (this.M0) {
            this.M0 = false;
            Z3(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.D0 = (TextView) view.findViewById(R.id.progress_message);
        this.C0 = (TextView) view.findViewById(R.id.progress_current_task);
        this.E0 = view.findViewById(R.id.empty_message);
        this.F0 = (LinearLayout) view.findViewById(R.id.top_container);
        this.G0 = view.findViewById(R.id.toolbar_separator);
        this.H0 = (ViewPager) view.findViewById(R.id.view_pager);
        C3419e d5 = d5(h5());
        this.I0 = d5;
        this.H0.setAdapter(d5);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_layout);
        this.K0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new a());
        this.K0.setOnChildScrollUpCallback(new b());
        this.H0.c(new c());
        x2(true);
    }

    @Override // ax.d3.AbstractC1927n
    public boolean N3() {
        return false;
    }

    protected void S4(View view) {
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            f5().addView(view);
            this.O0++;
        }
    }

    protected void T4() {
        LinearLayout f5 = f5();
        f5.removeAllViews();
        LayoutInflater from = LayoutInflater.from(f0());
        f5.addView(Z4(from, f5, R.string.error_loading, 0));
        f5.addView(from.inflate(R.layout.card_last_padding, (ViewGroup) f5, false));
    }

    protected abstract void U4();

    @Override // ax.d3.AbstractC1927n
    public boolean V2() {
        return false;
    }

    protected void V4() {
        this.O0 = 0;
    }

    public void W4() {
        if (f0() == null) {
            return;
        }
        f0().runOnUiThread(new d());
    }

    protected View X4(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar, h.C0194h c0194h) {
        View inflate = layoutInflater.inflate(R.layout.card_component_file_item, viewGroup, false);
        String a2 = c0194h.a();
        ((ImageView) inflate.findViewById(R.id.icon)).setImageDrawable(c0194h.c() ? ax.s3.b.g(b(), null, true, false) : C1808A.f(b(), a2, false));
        if ("/".equals(a2)) {
            ((TextView) inflate.findViewById(R.id.name)).setText("/");
        } else {
            ((TextView) inflate.findViewById(R.id.name)).setText(ax.c3.d0.h(a2));
        }
        ((TextView) inflate.findViewById(R.id.path)).setText(ax.c3.d0.r(a2));
        ((TextView) inflate.findViewById(R.id.size)).setText(c5(c0194h.b()));
        return inflate;
    }

    protected View Y4(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar, int i, String str, long j, List<h.C0194h> list, int i2, boolean z) {
        if ((j == 0 || list == null) && !z) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.card_files, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title)).setText(i);
        ((TextView) inflate.findViewById(R.id.size_info)).setText(b5(j));
        if (str != null) {
            ((TextView) inflate.findViewById(R.id.card_description)).setText(str);
        } else {
            ((TextView) inflate.findViewById(R.id.card_description)).setVisibility(8);
        }
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.files_container);
        for (int i3 = 0; i3 < i2; i3++) {
            if (list != null && list.size() > i3) {
                h.C0194h c0194h = list.get(i3);
                if (c0194h != null) {
                    linearLayout.addView(X4(layoutInflater, linearLayout, hVar, c0194h));
                } else {
                    ax.Ha.c.h().f().b("!!!! CARD FRAGMENT LIST ITEM NULL !!!!").g("files : " + list.size() + ", i : " + i3).h();
                }
            }
        }
        return inflate;
    }

    @Override // ax.d3.AbstractC1927n
    public void Z3(String str) {
        if (X0()) {
            a5();
        } else {
            this.M0 = true;
        }
    }

    View Z4(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        View inflate = layoutInflater.inflate(R.layout.card_message, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.main_message)).setText(i);
        TextView textView = (TextView) inflate.findViewById(R.id.sub_message);
        if (i2 == 0) {
            textView.setVisibility(8);
            return inflate;
        }
        textView.setVisibility(0);
        textView.setText(i);
        return inflate;
    }

    protected void a5() {
        if (!i5() || e5().y0()) {
            c4(false);
        } else {
            U4();
        }
    }

    String b5(long j) {
        return C1809B.i(o3(), j);
    }

    @Override // ax.d3.AbstractC1927n
    public void c4(boolean z) {
        if (b() == null) {
            return;
        }
        e5().n();
        if (z) {
            e5().H0(b());
        }
        f5().removeAllViews();
        m5(true);
    }

    String c5(long j) {
        return C1809B.k(o3(), j);
    }

    protected abstract ax.T2.h e5();

    protected LinearLayout f5() {
        return this.I0.w(this.H0.getCurrentItem());
    }

    protected ArrayList<NestedScrollView> g5() {
        C3419e c3419e = this.I0;
        if (c3419e == null) {
            return null;
        }
        return c3419e.y();
    }

    protected abstract int h5();

    protected abstract boolean i5();

    protected void j5() {
        this.G0.setVisibility(8);
    }

    protected abstract ax.K0.a<Boolean> k5();

    @Override // ax.J0.a.InterfaceC0095a
    /* renamed from: l5 */
    public void v(ax.K0.c<Boolean> cVar, Boolean bool) {
        o5(false);
        if (X0()) {
            if (bool == null || !bool.booleanValue()) {
                T4();
            } else {
                U4();
            }
        }
    }

    public void n5(int i) {
        if (f0() == null) {
            return;
        }
        f0().runOnUiThread(new e(i));
    }

    protected void o5(boolean z) {
        if (X0()) {
            this.K0.post(new g(z));
        }
    }

    @Override // ax.d3.AbstractC1927n, ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        ArrayList<NestedScrollView> g5;
        super.onApplyWindowsInsets(bVar, z);
        if (z || (g5 = g5()) == null) {
            return;
        }
        int size = g5.size();
        int i = 0;
        while (i < size) {
            NestedScrollView nestedScrollView = g5.get(i);
            i++;
            NestedScrollView nestedScrollView2 = nestedScrollView;
            nestedScrollView2.setClipToPadding(false);
            nestedScrollView2.setPadding(nestedScrollView2.getPaddingLeft(), nestedScrollView2.getPaddingTop(), nestedScrollView2.getPaddingRight(), bVar.d);
        }
    }

    public void p5(String str, boolean z) {
        if (f0() == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.N0 > 500 || z) {
            this.N0 = currentTimeMillis;
            f0().runOnUiThread(new f(str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_card, (ViewGroup) null);
    }

    @Override // ax.J0.a.InterfaceC0095a
    public ax.K0.c<Boolean> w(int i, Bundle bundle) {
        return k5();
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void x1(boolean z) {
        super.x1(z);
        if (z || !i5()) {
            return;
        }
        U4();
    }

    @Override // ax.d3.AbstractC1927n
    public int x3() {
        if (this.L0 < 0) {
            this.L0 = j0().getInt("location_key");
        }
        return this.L0;
    }

    /* renamed from: ax.d3.p$c */
    class c implements ViewPager.j {
        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void e(int i) {
            AbstractC1929p.this.J0 = i != 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void K(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void h(int i, float f, int i2) {
        }
    }

    @Override // ax.d3.AbstractC1927n
    public void M4() {
    }

    @Override // ax.d3.AbstractC1927n
    public void j3() {
    }

    @Override // ax.J0.a.InterfaceC0095a
    public void p(ax.K0.c<Boolean> cVar) {
    }
}
