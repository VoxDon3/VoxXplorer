package ax.d3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;
import ax.J5.C0747h;
import ax.S2.b;
import ax.T2.h;
import ax.W2.h;
import ax.a3.C1358n;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1832u;
import ax.c3.C1835x;
import ax.c3.EnumC1837z;
import ax.t3.C3098a;
import ax.u3.C3180B;
import ax.u3.C3195m;
import ax.u3.C3197o;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.receiver.StorageCheckReceiver;
import com.voxdon.xplorer.R;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* renamed from: ax.d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1912b extends AbstractC1929p {
    private static final Logger a1 = ax.Q2.g.a(C1912b.class);
    private View P0;
    private CardView Q0;
    private View R0;
    private ax.c3.K S0;
    private ax.T2.h T0;
    private boolean V0;
    private long W0;
    private C3195m X0;
    private boolean Z0;
    private List<ax.T2.h> U0 = new ArrayList();
    private int Y0 = -1;

    /* renamed from: ax.d3.b$b, reason: collision with other inner class name */
    class C0279b extends ax.g3.c {
        final /* synthetic */ ax.T2.h c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0279b(long j, ax.T2.h hVar) {
            super(j);
            this.c = hVar;
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1912b c1912b = C1912b.this;
            if (c1912b.Z2(c1912b.T5(), null)) {
                return;
            }
            if (!ax.X2.Q.z0() || !C3197o.c()) {
                C1912b.this.P5(this.c);
                return;
            }
            try {
                C1832u.r0(C1912b.this, new Intent("android.os.storage.action.CLEAR_APP_CACHE"), 38001);
            } catch (ActivityNotFoundException unused) {
                C1912b.this.E4(R.string.error, 1);
            }
        }
    }

    /* renamed from: ax.d3.b$c */
    class c extends ax.g3.c {
        c() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ((MainActivity) C1912b.this.f0()).d2(C1912b.this.A3(), true, Bookmark.m(C1912b.this.f0(), ax.Q2.f.l1, C1912b.this.U5()), "analysis");
        }
    }

    /* renamed from: ax.d3.b$d */
    class d extends ax.g3.c {
        d(long j) {
            super(j);
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1912b c1912b = C1912b.this;
            if (c1912b.Z2(c1912b.T5(), null)) {
                return;
            }
            C1912b.this.S5();
        }
    }

    /* renamed from: ax.d3.b$e */
    class e extends ax.g3.c {
        e() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ((MainActivity) C1912b.this.f0()).d2(C1912b.this.A3(), true, Bookmark.m(C1912b.this.f0(), ax.Q2.f.o1, C1912b.this.U5()), "analysis");
        }
    }

    /* renamed from: ax.d3.b$k */
    class k extends ax.g3.c {
        k() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ((MainActivity) C1912b.this.f0()).d2(C1912b.this.A3(), true, Bookmark.m(C1912b.this.f0(), ax.Q2.f.r1, 0), "analysis");
        }
    }

    /* renamed from: ax.d3.b$l */
    class l extends ax.g3.c {
        l() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ((MainActivity) C1912b.this.f0()).d2(C1912b.this.A3(), true, Bookmark.m(C1912b.this.f0(), ax.Q2.f.m1, C1912b.this.U5()), "analysis");
        }
    }

    /* renamed from: ax.d3.b$m */
    class m extends ax.g3.c {
        m() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ((MainActivity) C1912b.this.f0()).d2(C1912b.this.A3(), true, Bookmark.m(C1912b.this.f0(), ax.Q2.f.n1, C1912b.this.U5()), "analysis");
        }
    }

    /* renamed from: ax.d3.b$n */
    class n extends ax.g3.c {
        final /* synthetic */ ax.T2.h c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j, ax.T2.h hVar) {
            super(j);
            this.c = hVar;
        }

        @Override // ax.g3.c
        public void a(View view) {
            C1912b c1912b = C1912b.this;
            if (c1912b.Z2(c1912b.T5(), null)) {
                return;
            }
            C1912b.this.Q5(this.c);
        }
    }

    /* renamed from: ax.d3.b$o */
    class o implements b.c {
        o() {
        }
    }

    /* renamed from: ax.d3.b$p */
    class p implements InterfaceC3185c {
        p() {
        }

        @Override // ax.u3.InterfaceC3185c
        public boolean isCancelled() {
            return C1912b.this.Z0;
        }
    }

    /* renamed from: ax.d3.b$s */
    class s extends ax.g3.c {
        final /* synthetic */ ax.c3.K c;

        s(ax.c3.K k) {
            this.c = k;
        }

        @Override // ax.g3.c
        public void a(View view) {
            ((MainActivity) C1912b.this.f0()).d2(C1912b.this.A3(), true, Bookmark.n(C1912b.this.f0(), this.c), "analysis");
        }
    }

    /* renamed from: ax.d3.b$t */
    class t extends ax.g3.c {
        t() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (C1912b.this.f0() == null) {
                return;
            }
            C1912b.this.a6();
        }
    }

    /* renamed from: ax.d3.b$u */
    class u implements C3195m.c {
        u() {
        }

        @Override // ax.u3.C3195m.c
        public void a() {
            if (C1912b.this.b() != null) {
                C1912b.this.F2(C1832u.E(C1912b.this.b(), null, null));
            } else {
                ax.Ha.c.h().f().b("USAGE STAT MON 1").j().h();
                C1912b.this.o3().startActivity(C1832u.E(C1912b.this.o3(), null, null));
            }
        }
    }

    /* renamed from: ax.d3.b$v */
    class v extends ax.g3.c {
        v() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ((MainActivity) C1912b.this.f0()).d2(C1912b.this.A3(), true, Bookmark.m(C1912b.this.f0(), ax.Q2.f.q1, 0), "analysis");
        }
    }

    /* renamed from: ax.d3.b$w */
    class w extends ax.g3.c {
        w() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ((MainActivity) C1912b.this.f0()).d2(C1912b.this.A3(), true, Bookmark.m(C1912b.this.f0(), ax.Q2.f.j1, C1912b.this.U5()), "analysis");
        }
    }

    /* renamed from: ax.d3.b$x */
    public static class x extends ax.K0.a<Boolean> {
        ax.c3.K o;
        h.g p;
        InterfaceC3185c q;

        public x(Context context, ax.c3.K k, h.g gVar, InterfaceC3185c interfaceC3185c) {
            super(context);
            this.o = k;
            this.p = gVar;
            this.q = interfaceC3185c;
        }

        @Override // ax.K0.a
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public Boolean I() {
            if (j() == null) {
                return null;
            }
            if (ax.T2.h.S(this.o).m0()) {
                return Boolean.TRUE;
            }
            try {
                ax.T2.h S = ax.T2.h.S(this.o);
                if (S.w0()) {
                    S.A0(this.p);
                } else {
                    S.f(true, this.p, this.q);
                }
                return Boolean.TRUE;
            } catch (C1486a unused) {
                return Boolean.FALSE;
            } catch (C1495j unused2) {
                return Boolean.FALSE;
            }
        }

        @Override // ax.K0.c
        protected void t() {
            a();
        }
    }

    private void A5() {
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.analysis_tab, (ViewGroup) this.F0, false);
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.tab_layout);
        TabLayout.g F = tabLayout.F();
        F.u(R.string.label_analyze);
        F.t(0);
        tabLayout.i(F);
        TabLayout.g F2 = tabLayout.F();
        F2.u(R.string.label_clean);
        F2.t(1);
        tabLayout.i(F2);
        tabLayout.h(new r());
        this.F0.addView(inflate, 0);
        this.H0.c(new TabLayout.h(tabLayout));
        if (V5() == 1) {
            F2.m();
        } else if (V5() == -1) {
            this.Y0 = 0;
        }
        j5();
    }

    private void B5() {
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.analysis_tab, (ViewGroup) this.F0, false);
        TabLayout tabLayout = (TabLayout) inflate.findViewById(R.id.tab_layout);
        TabLayout.g F = tabLayout.F();
        F.u(R.string.location_mainstorage);
        F.t(ax.c3.K.e);
        tabLayout.i(F);
        TabLayout.g F2 = tabLayout.F();
        F2.u(R.string.location_sdcard);
        ax.c3.K k2 = ax.c3.K.f;
        F2.t(k2);
        tabLayout.i(F2);
        tabLayout.h(new q());
        this.F0.addView(inflate, 0);
        this.H0.c(new TabLayout.h(tabLayout));
        if (T5() == k2) {
            F2.m();
        }
        j5();
    }

    private List<AbstractC3595n> C5(C3596o c3596o, String str, List<h.C0194h> list, boolean z) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            h.C0194h c0194h = (h.C0194h) obj;
            if (z || c0194h.b() > 0) {
                try {
                    arrayList2.add(c3596o.z(ax.c3.d0.P(str, c0194h.a())));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P5(ax.T2.h hVar) {
        ax.Q2.a.i().m("menu_analysis", "delete_all_cache").c("loc", z3().I()).e();
        ax.c3.K X = hVar.X();
        C3596o e2 = C1835x.e(X);
        List<AbstractC3595n> C5 = C5(e2, X.e(), hVar.N(), false);
        if (ax.X2.Q.L() && hVar.X() == ax.c3.K.e) {
            try {
                File t2 = ax.Q2.e.t(o3());
                if (t2 != null && t2.exists()) {
                    C5.add(e2.z(t2.getAbsolutePath()));
                }
            } catch (Exception unused) {
            }
            try {
                File o2 = ax.Q2.e.o(o3());
                if (o2.exists()) {
                    C5.add(e2.z(o2.getAbsolutePath()));
                }
            } catch (Exception unused2) {
            }
        }
        ax.W2.o.l(this, e2, C5, 1, true, false, R.string.clear_cache_title, R.string.clear_cache_message, new h(hVar), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q5(ax.T2.h hVar) {
        ax.Q2.a.i().m("menu_analysis", "delete_duplicate_downloads").c("loc", z3().I()).e();
        if (hVar.H() == null) {
            E4(R.string.error, 1);
            return;
        }
        ax.c3.K X = hVar.X();
        C3596o e2 = C1835x.e(X);
        ax.W2.o.l(this, e2, C5(e2, X.e(), hVar.H(), true), 1, true, false, R.string.menu_clear, R.string.msg_delete_duplicates, new i(hVar), null);
    }

    private void R5() {
        ArrayList arrayList = new ArrayList();
        C3596o e2 = C1835x.e(ax.c3.K.e);
        if (ax.X2.Q.L()) {
            try {
                File t2 = ax.Q2.e.t(o3());
                if (t2 != null && t2.exists()) {
                    arrayList.add(e2.z(t2.getAbsolutePath()));
                }
            } catch (Exception unused) {
            }
            try {
                File o2 = ax.Q2.e.o(o3());
                if (o2.exists()) {
                    arrayList.add(e2.z(o2.getAbsolutePath()));
                }
            } catch (Exception unused2) {
            }
        }
        if (arrayList.size() <= 0) {
            U4();
        } else {
            ax.W2.o.l(this, e2, arrayList, 1, false, true, R.string.clear_cache_title, R.string.clear_cache_message, new g(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S5() {
        ax.Q2.a.i().m("menu_analysis", "empty_recycle_bin").e();
        ax.W2.o.n(this, T5(), new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ax.c3.K T5() {
        if (X5()) {
            if (this.S0 == null) {
                this.S0 = ax.c3.K.e;
            }
            return this.S0;
        }
        if (this.S0 == null) {
            this.S0 = ax.T2.h.q(x3());
        }
        return this.S0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int U5() {
        return ax.T2.h.r(T5());
    }

    private int V5() {
        return this.Y0;
    }

    private boolean X5() {
        return x3() == 0;
    }

    private void Y5() {
        ax.T2.h S = ax.T2.h.S(T5());
        this.T0 = S;
        if (this.U0.contains(S)) {
            return;
        }
        this.T0.J0();
        this.U0.add(this.T0);
    }

    private boolean Z5() {
        return X5() && ax.Z2.j.F().t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a6() {
        try {
            C1832u.r0(this, C3197o.b(), 38004);
            if (this.X0 == null) {
                this.X0 = new C3195m();
            }
            this.X0.f(o3(), new u());
        } catch (ActivityNotFoundException unused) {
            E4(R.string.error, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b6(ax.c3.K k2) {
        this.S0 = k2;
        Y5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c6(int i2) {
        this.Y0 = i2;
    }

    private void d6() {
        if (b() == null || ax.u3.z.u(b()) || !C3098a.g()) {
            return;
        }
        CardView cardView = (CardView) LayoutInflater.from(b()).inflate(R.layout.card_ads, (ViewGroup) f5(), false);
        this.Q0 = cardView;
        this.R0 = cardView.findViewById(R.id.ads_progress);
        if (C0747h.o().g(b()) != 0) {
            this.V0 = false;
        }
        if (this.V0) {
            this.Q0.setVisibility(0);
            View view = this.R0;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            this.Q0.setVisibility(8);
        }
        ax.S2.b.d(f0(), new o());
    }

    View D5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar, String str, long j2) {
        return E5(layoutInflater, viewGroup, hVar, ax.U2.d.g(str), j2);
    }

    View E5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar, String str, long j2) {
        View inflate = layoutInflater.inflate(R.layout.card_component_app_item, viewGroup, false);
        ax.U2.f x2 = ax.U2.d.F(b()).x(str);
        if (x2 != null) {
            ((ImageView) inflate.findViewById(R.id.icon)).setImageDrawable(x2.l());
            ((TextView) inflate.findViewById(R.id.name)).setText(x2.q());
        } else {
            ((ImageView) inflate.findViewById(R.id.icon)).setImageResource(R.drawable.icon_folder_full_s);
            ((TextView) inflate.findViewById(R.id.name)).setText(str);
        }
        ((TextView) inflate.findViewById(R.id.size)).setText(c5(j2));
        return inflate;
    }

    View F5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar) {
        LayoutInflater layoutInflater2;
        ax.T2.h hVar2;
        if (hVar.D() == 0) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.card_files, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title)).setText(R.string.location_app);
        ((TextView) inflate.findViewById(R.id.size_info)).setText(b5(hVar.D()));
        ((TextView) inflate.findViewById(R.id.card_description)).setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.files_container);
        List<ax.U2.f> C = hVar.C();
        if (C == null || C.size() <= 0) {
            layoutInflater2 = layoutInflater;
            hVar2 = hVar;
        } else {
            ax.U2.f fVar = C.get(0);
            layoutInflater2 = layoutInflater;
            hVar2 = hVar;
            linearLayout.addView(E5(layoutInflater2, linearLayout, hVar2, fVar.r(), fVar.s()));
        }
        if (C != null && C.size() > 1) {
            ax.U2.f fVar2 = C.get(1);
            if (fVar2.s() > 0) {
                linearLayout.addView(E5(layoutInflater2, linearLayout, hVar2, fVar2.r(), fVar2.s()));
                v vVar = new v();
                inflate.findViewById(R.id.more).setOnClickListener(vVar);
                inflate.setOnClickListener(vVar);
                return inflate;
            }
        }
        v vVar2 = new v();
        inflate.findViewById(R.id.more).setOnClickListener(vVar2);
        inflate.setOnClickListener(vVar2);
        return inflate;
    }

    View G5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar) {
        View Y4 = Y4(layoutInflater, viewGroup, hVar, R.string.duplicate_downloads, null, hVar.J(), hVar.G(), 2, false);
        if (Y4 != null) {
            m mVar = new m();
            Y4.findViewById(R.id.more).setOnClickListener(mVar);
            Y4.setOnClickListener(mVar);
            Button button = (Button) Y4.findViewById(R.id.clear);
            button.setVisibility(0);
            button.setText(R.string.menu_clear);
            button.setOnClickListener(new n(400L, hVar));
        }
        return Y4;
    }

    @Override // ax.d3.AbstractC1929p, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        StorageCheckReceiver.a(b(), T5());
    }

    View H5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar) {
        View Y4 = Y4(layoutInflater, viewGroup, hVar, R.string.duplicate_files, null, hVar.M(), hVar.K(), 2, false);
        if (Y4 != null) {
            l lVar = new l();
            Y4.findViewById(R.id.more).setOnClickListener(lVar);
            Y4.setOnClickListener(lVar);
        }
        return Y4;
    }

    View I5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar) {
        long O = hVar.O();
        List<h.C0194h> N = hVar.N();
        if (O == 0 || N == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.card_files, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title)).setText(R.string.app_caches);
        ((TextView) inflate.findViewById(R.id.size_info)).setText(b5(O));
        ((TextView) inflate.findViewById(R.id.card_description)).setText(R.string.app_caches_desc);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.files_container);
        if (N.size() > 0) {
            h.C0194h c0194h = N.get(0);
            linearLayout.addView(D5(layoutInflater, linearLayout, hVar, c0194h.a(), c0194h.b()));
        }
        if (N.size() > 1) {
            h.C0194h c0194h2 = N.get(1);
            if (c0194h2.b() > 0) {
                linearLayout.addView(D5(layoutInflater, linearLayout, hVar, c0194h2.a(), c0194h2.b()));
            }
        }
        Button button = (Button) inflate.findViewById(R.id.clear);
        button.setVisibility(0);
        button.setText(R.string.menu_clear);
        button.setOnClickListener(new C0279b(400L, hVar));
        c cVar = new c();
        inflate.findViewById(R.id.more).setOnClickListener(cVar);
        inflate.setOnClickListener(cVar);
        return inflate;
    }

    View J5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar) {
        View Y4 = Y4(layoutInflater, viewGroup, hVar, R.string.large_files, N0(R.string.large_files_desc, c5(10485760L)), hVar.W(), hVar.V(), 2, false);
        if (Y4 != null) {
            w wVar = new w();
            Y4.findViewById(R.id.more).setOnClickListener(wVar);
            Y4.setOnClickListener(wVar);
        }
        return Y4;
    }

    View K5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar) {
        View Y4 = Y4(layoutInflater, viewGroup, hVar, R.string.recycle_bin, null, hVar.c0(), hVar.Z(), 2, false);
        if (Y4 != null) {
            Button button = (Button) Y4.findViewById(R.id.clear);
            button.setVisibility(0);
            button.setText(R.string.menu_empty);
            button.setOnClickListener(new d(400L));
            e eVar = new e();
            Y4.findViewById(R.id.more).setOnClickListener(eVar);
            Y4.setOnClickListener(eVar);
        }
        return Y4;
    }

    @Override // ax.d3.AbstractC1929p, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        d6();
        if (Z5()) {
            B5();
        } else {
            A5();
        }
    }

    View L5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar) {
        if (this.W0 + 600000 > System.currentTimeMillis() || hVar.X() != ax.c3.K.e) {
            return null;
        }
        long j0 = (ax.X2.Q.V0() && C3197o.d(f0())) ? hVar.j0() : 0L;
        View inflate = layoutInflater.inflate(R.layout.card_files, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title)).setText(R.string.app_caches);
        ((TextView) inflate.findViewById(R.id.size_info)).setText(j0 > 0 ? b5(j0) : HttpUrl.FRAGMENT_ENCODE_SET);
        ((TextView) inflate.findViewById(R.id.card_description)).setText(R.string.app_caches_desc);
        List<ax.U2.f> P = hVar.P();
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.files_container);
        if (P != null && P.size() > 0) {
            ax.U2.f fVar = P.get(0);
            if (fVar.e() > 0) {
                linearLayout.addView(E5(layoutInflater, linearLayout, hVar, fVar.r(), fVar.e()));
            }
        }
        if (P != null && P.size() > 1) {
            ax.U2.f fVar2 = P.get(1);
            if (fVar2.e() > 0) {
                linearLayout.addView(E5(layoutInflater, linearLayout, hVar, fVar2.r(), fVar2.e()));
            }
        }
        Button button = (Button) inflate.findViewById(R.id.clear);
        button.setVisibility(0);
        button.setText(R.string.menu_clear);
        button.setOnClickListener(new a(400L));
        inflate.findViewById(R.id.more).setVisibility(8);
        return inflate;
    }

    View M5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar) {
        long j2;
        long j3;
        ax.c3.K X = hVar.X();
        View inflate = layoutInflater.inflate(R.layout.card_analysis_type_size, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title)).setText(X.f(o3()));
        ax.c3.k0 f0 = hVar.f0();
        if (f0 == null) {
            j2 = 0;
            j3 = 0;
        } else {
            j2 = f0.b;
            j3 = f0.a;
        }
        long j4 = j2 - j3;
        int i2 = j2 != 0 ? (int) ((1000 * j3) / j2) : 0;
        String P = C3180B.P((float) ((j3 * 100.0d) / j2));
        ((TextView) inflate.findViewById(R.id.size_info)).setText(C1809B.l(o3(), j4, C1809B.a.NORMAL));
        ((ProgressBar) inflate.findViewById(R.id.used_progress)).setMax(1000);
        ((ProgressBar) inflate.findViewById(R.id.used_progress)).setProgress(i2);
        ((TextView) inflate.findViewById(R.id.used_percent)).setText(P);
        ((TextView) inflate.findViewById(R.id.size_image)).setText(c5(hVar.Q(EnumC1837z.IMAGE)));
        ((TextView) inflate.findViewById(R.id.size_music)).setText(c5(hVar.Q(EnumC1837z.AUDIO)));
        ((TextView) inflate.findViewById(R.id.size_video)).setText(c5(hVar.Q(EnumC1837z.VIDEO)));
        ((TextView) inflate.findViewById(R.id.size_document)).setText(c5(hVar.Q(EnumC1837z.GROUP_DOCUMENT)));
        ((TextView) inflate.findViewById(R.id.size_archive)).setText(c5(hVar.Q(EnumC1837z.ARCHIVE)));
        ((TextView) inflate.findViewById(R.id.size_others)).setText(c5(hVar.Q(EnumC1837z.OTHERS)));
        s sVar = new s(X);
        inflate.findViewById(R.id.more).setOnClickListener(sVar);
        inflate.setOnClickListener(sVar);
        return inflate;
    }

    View N5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar) {
        LayoutInflater layoutInflater2;
        ax.T2.h hVar2;
        if (!hVar.o0()) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.card_files, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title)).setText(R.string.location_unused_apps);
        ((TextView) inflate.findViewById(R.id.size_info)).setText(b5(hVar.i0()));
        ((TextView) inflate.findViewById(R.id.card_description)).setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.files_container);
        List<ax.U2.f> h0 = hVar.h0();
        if (h0 == null || h0.size() <= 0) {
            layoutInflater2 = layoutInflater;
            hVar2 = hVar;
        } else {
            ax.U2.f fVar = h0.get(0);
            layoutInflater2 = layoutInflater;
            hVar2 = hVar;
            linearLayout.addView(E5(layoutInflater2, linearLayout, hVar2, fVar.r(), fVar.s()));
        }
        if (h0 != null && h0.size() > 1) {
            ax.U2.f fVar2 = h0.get(1);
            if (fVar2.s() > 0) {
                linearLayout.addView(E5(layoutInflater2, linearLayout, hVar2, fVar2.r(), fVar2.s()));
                k kVar = new k();
                inflate.findViewById(R.id.more).setOnClickListener(kVar);
                inflate.setOnClickListener(kVar);
                return inflate;
            }
        }
        k kVar2 = new k();
        inflate.findViewById(R.id.more).setOnClickListener(kVar2);
        inflate.setOnClickListener(kVar2);
        return inflate;
    }

    View O5(LayoutInflater layoutInflater, ViewGroup viewGroup, int i2) {
        View inflate = layoutInflater.inflate(R.layout.card_permission, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.title)).setText(i2);
        ((TextView) inflate.findViewById(R.id.card_description)).setText(R.string.request_usage_stats_permissions);
        Button button = (Button) inflate.findViewById(R.id.button);
        button.setText(R.string.permit_usage_access);
        button.setOnClickListener(new t());
        return inflate;
    }

    @Override // ax.d3.AbstractC1929p
    protected void U4() {
        ax.T2.h e5 = e5();
        if (e5.m0() && f0() != null) {
            int V5 = V5();
            LinearLayout f5 = f5();
            f5.removeAllViews();
            LayoutInflater from = LayoutInflater.from(f0());
            this.E0.setVisibility(8);
            V4();
            if (V5 == 0 || V5 == -1) {
                View M5 = M5(from, f5, e5);
                M5.requestFocus();
                S4(M5);
                if (this.Q0 != null && C3098a.g()) {
                    S4(this.Q0);
                }
                if (ax.X2.Q.J1() && e5.X() == ax.c3.K.e && f0() != null) {
                    if (C3197o.d(f0())) {
                        S4(F5(from, f5, e5));
                    } else if (C3180B.K(f0(), C3197o.b())) {
                        S4(O5(from, f5, R.string.location_app));
                    }
                }
                S4(J5(from, f5, e5));
                if (V5 == -1) {
                    S4(K5(from, f5, e5));
                    if (!ax.X2.Q.z0() || e5.l0()) {
                        S4(I5(from, f5, e5));
                    } else {
                        S4(L5(from, f5, e5));
                    }
                    S4(G5(from, f5, e5));
                    S4(H5(from, f5, e5));
                }
            } else if (V5 == 1) {
                S4(K5(from, f5, e5));
                if (!ax.X2.Q.z0() || e5.l0()) {
                    S4(I5(from, f5, e5));
                } else {
                    S4(L5(from, f5, e5));
                }
                S4(G5(from, f5, e5));
                if (ax.X2.Q.J1() && e5.X() == ax.c3.K.e && f0() != null) {
                    if (C3197o.d(f0())) {
                        S4(N5(from, f5, e5));
                    } else if (C3180B.K(f0(), C3197o.b())) {
                        S4(O5(from, f5, R.string.location_unused_apps));
                    }
                }
                S4(H5(from, f5, e5));
                if (this.O0 == 0) {
                    this.E0.setVisibility(0);
                }
            }
            S4(from.inflate(R.layout.card_last_padding, (ViewGroup) f5, false));
        }
    }

    @Override // ax.d3.AbstractC1927n
    protected boolean W2() {
        return false;
    }

    public void W5() {
        ViewPager viewPager = this.H0;
        if (viewPager == null || viewPager.getAdapter().e() != 2) {
            c6(1);
        } else {
            this.H0.setCurrentItem(1);
            c6(1);
        }
    }

    @Override // ax.d3.AbstractC1929p
    protected ax.T2.h e5() {
        return this.T0;
    }

    @Override // ax.d3.AbstractC1929p
    protected int h5() {
        Z5();
        return 2;
    }

    @Override // androidx.fragment.app.Fragment
    public void i1(int i2, int i3, Intent intent) {
        C3195m c3195m = this.X0;
        if (c3195m != null) {
            c3195m.d(i2, i3, intent);
        }
        if (i2 == 38001) {
            if (i3 == -1) {
                this.W0 = System.currentTimeMillis();
                ax.T2.h e5 = e5();
                if (e5 != null) {
                    e5.o();
                }
                R5();
                return;
            }
            return;
        }
        if (i2 == 38003) {
            if (ax.X2.Q.z0() && C3197o.c()) {
                C1832u.r0(this, new Intent("android.os.storage.action.CLEAR_APP_CACHE"), 38001);
            }
        } else if (i2 == 38004 && b() != null && C3197o.d(b())) {
            c4(false);
        }
        super.i1(i2, i3, intent);
    }

    @Override // ax.d3.AbstractC1929p
    protected boolean i5() {
        ax.T2.h hVar = this.T0;
        return hVar != null && hVar.m0();
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        Y5();
        this.V0 = ax.t3.c.n().c();
    }

    @Override // ax.d3.AbstractC1929p
    protected ax.K0.a<Boolean> k5() {
        return new x(f0(), T5(), new j(), new p());
    }

    @Override // androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_refresh);
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void s1() {
        View view = this.P0;
        if (view != null) {
            ax.S2.b.a(view, b());
            this.Q0.removeView(this.P0);
            this.P0 = null;
        }
        this.Z0 = true;
        super.s1();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        Iterator<ax.T2.h> it = this.U0.iterator();
        while (it.hasNext()) {
            it.next().G0();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.i1;
    }

    /* renamed from: ax.d3.b$a */
    class a extends ax.g3.c {
        a(long j) {
            super(j);
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (C1912b.this.f0() == null) {
                return;
            }
            try {
                if (C3197o.c()) {
                    C1832u.r0(C1912b.this, new Intent("android.os.storage.action.CLEAR_APP_CACHE"), 38001);
                } else {
                    C1358n k3 = C1358n.k3(R.string.title_access_request, R.string.request_all_files_access_to_clear_cache, android.R.string.ok, android.R.string.cancel);
                    k3.n3(new C0278a());
                    C3180B.d0(C1912b.this.A0(), k3, "allfilesconfirm", true);
                }
            } catch (Exception e) {
                e.printStackTrace();
                C1912b.this.E4(R.string.error, 1);
            }
        }

        /* renamed from: ax.d3.b$a$a, reason: collision with other inner class name */
        class C0278a implements C1358n.c {
            C0278a() {
            }

            @Override // ax.a3.C1358n.c
            public void P(C1358n c1358n) {
                if (C1912b.this.f0() == null) {
                    return;
                }
                try {
                    C1832u.r0(C1912b.this, C3197o.a(C1912b.this.f0()), 38003);
                } catch (ActivityNotFoundException unused) {
                    ax.Ha.c.h().f().b("no all files access activity 2").h();
                    C1912b.this.E4(R.string.error, 1);
                }
            }

            @Override // ax.a3.C1358n.c
            public void G(C1358n c1358n) {
            }

            @Override // ax.a3.C1358n.c
            public void Z(C1358n c1358n) {
            }
        }
    }

    /* renamed from: ax.d3.b$f */
    class f implements h.a {
        f() {
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            C1912b.this.c4(false);
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }

    /* renamed from: ax.d3.b$g */
    class g implements h.a {
        g() {
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            if (bVar == h.b.SUCCESS) {
                C1912b.this.W0 = System.currentTimeMillis();
            }
            C1912b.this.U4();
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }

    /* renamed from: ax.d3.b$h */
    class h implements h.a {
        final /* synthetic */ ax.T2.h a;

        h(ax.T2.h hVar) {
            this.a = hVar;
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            if (bVar != h.b.SUCCESS) {
                C1912b.this.c4(false);
                return;
            }
            C1912b.this.W0 = System.currentTimeMillis();
            this.a.o();
            C1912b.this.U4();
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }

    /* renamed from: ax.d3.b$i */
    class i implements h.a {
        final /* synthetic */ ax.T2.h a;

        i(ax.T2.h hVar) {
            this.a = hVar;
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            if (bVar != h.b.SUCCESS) {
                C1912b.this.c4(false);
            } else {
                this.a.x();
                C1912b.this.U4();
            }
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }

    /* renamed from: ax.d3.b$j */
    class j implements h.g {
        j() {
        }

        @Override // ax.T2.h.g
        public void b() {
            if (C1912b.this.X0()) {
                C1912b.this.W4();
            }
        }

        @Override // ax.T2.h.g
        public void c(String str, boolean z) {
            if (C1912b.this.X0()) {
                C1912b.this.p5(str, z);
            }
        }

        @Override // ax.T2.h.g
        public void d(int i) {
            if (C1912b.this.X0()) {
                C1912b.this.n5(i);
            }
        }

        @Override // ax.T2.h.g
        public void a() {
        }
    }

    /* renamed from: ax.d3.b$q */
    class q implements TabLayout.d {
        q() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            C1912b.this.H0.N(gVar.g(), true);
            C1912b.this.b6((ax.c3.K) gVar.i());
            C1912b.this.a5();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }

    /* renamed from: ax.d3.b$r */
    class r implements TabLayout.d {
        r() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            C1912b.this.H0.N(gVar.g(), true);
            C1912b.this.c6(((Integer) gVar.i()).intValue());
            C1912b.this.a5();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }
}
