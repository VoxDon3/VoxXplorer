package ax.d3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import ax.S2.b;
import ax.W2.h;
import ax.t3.C3098a;
import ax.u3.C3184b;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class f0 extends AbstractC1929p {
    private static final Logger U0 = ax.Q2.g.a(f0.class);
    private View P0;
    private CardView Q0;
    private boolean R0;
    private ax.T2.h S0;
    private e T0 = new e();

    class a extends ax.g3.c {
        a(long j) {
            super(j);
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (f0.this.x3() != 0) {
                if (f0.this.Z2(ax.T2.h.q(f0.this.x3()), null)) {
                    return;
                }
            }
            f0.this.s5();
        }
    }

    class b extends ax.g3.c {
        b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            ((MainActivity) f0.this.f0()).d2(f0.this.A3(), true, Bookmark.m(f0.this.f0(), ax.Q2.f.o1, f0.this.x3()), "recycle_bin_card");
        }
    }

    class d implements b.c {
        d() {
        }
    }

    static class e {
        boolean a;
        CountDownLatch b = new CountDownLatch(1);

        e() {
        }
    }

    public static class f extends ax.K0.a<Boolean> {
        ax.T2.h o;
        e p;

        public f(Context context, ax.T2.h hVar, e eVar) {
            super(context);
            this.o = hVar;
            this.p = eVar;
        }

        @Override // ax.K0.a
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public Boolean I() {
            if (j() == null) {
                return null;
            }
            boolean i = !this.o.k0() ? this.o.i() : true;
            e eVar = this.p;
            if (eVar.a) {
                try {
                    eVar.b.await(1500L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                this.p.a = false;
            }
            return Boolean.valueOf(i);
        }

        @Override // ax.K0.c
        protected void t() {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s5() {
        ax.Q2.a.i().m("menu_recycle_bin", "empty_recycle_bin").e();
        ax.W2.o.n(this, null, new c());
    }

    public static boolean t5(ax.T2.h hVar) {
        if (hVar.Z() != null) {
            return hVar.c0() == 0 && hVar.Z().size() == 0;
        }
        C3184b.g("no recycle bin info in analysis");
        return true;
    }

    private void u5() {
        if (b() == null || ax.u3.z.u(b()) || !C3098a.l()) {
            return;
        }
        this.T0.a = true;
        CardView cardView = (CardView) LayoutInflater.from(b()).inflate(R.layout.card_ads, (ViewGroup) f5(), false);
        this.Q0 = cardView;
        cardView.setVisibility(8);
        ax.S2.b.i(f0(), new d());
    }

    @Override // ax.d3.AbstractC1929p, ax.d3.AbstractC1927n
    public String C3() {
        return A3().e();
    }

    @Override // ax.d3.AbstractC1929p, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
    }

    @Override // ax.d3.AbstractC1929p, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        u5();
    }

    @Override // ax.d3.AbstractC1929p
    protected void U4() {
        V4();
        LinearLayout f5 = f5();
        f5.removeAllViews();
        ax.T2.h e5 = e5();
        LayoutInflater from = LayoutInflater.from(f0());
        View r5 = r5(from, f5, e5);
        r5.requestFocus();
        S4(r5);
        if (this.Q0 != null && C3098a.l()) {
            S4(this.Q0);
        }
        S4(from.inflate(R.layout.card_last_padding, (ViewGroup) f5, false));
    }

    @Override // ax.d3.AbstractC1927n
    protected boolean W2() {
        return false;
    }

    @Override // ax.d3.AbstractC1929p
    protected ax.T2.h e5() {
        return this.S0;
    }

    @Override // ax.d3.AbstractC1929p
    protected int h5() {
        return 1;
    }

    @Override // ax.d3.AbstractC1929p
    protected boolean i5() {
        ax.T2.h hVar = this.S0;
        return hVar != null && hVar.k0();
    }

    @Override // androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        this.R0 = true;
        ax.T2.h a0 = ax.T2.h.a0();
        this.S0 = a0;
        a0.J0();
    }

    @Override // ax.d3.AbstractC1929p
    protected ax.K0.a<Boolean> k5() {
        return new f(f0(), e5(), this.T0);
    }

    @Override // ax.d3.AbstractC1929p, ax.J0.a.InterfaceC0095a
    /* renamed from: l5, reason: merged with bridge method [inline-methods] */
    public void v(ax.K0.c<Boolean> cVar, Boolean bool) {
        super.v(cVar, bool);
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        if (t5(e5())) {
            if (this.R0 && X0()) {
                J4(R.string.recycle_bin_is_empty, 1);
            }
            i3("empty_recycle_bin");
        }
        this.R0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void q1(Menu menu, MenuInflater menuInflater) {
        G3(menuInflater, menu, R.menu.list_refresh);
    }

    View r5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h hVar) {
        View Y4 = t5(hVar) ? Y4(layoutInflater, viewGroup, hVar, R.string.recycle_bin, M0(R.string.recycle_bin_is_empty), hVar.c0(), hVar.Z(), 4, true) : Y4(layoutInflater, viewGroup, hVar, R.string.recycle_bin, null, hVar.c0(), hVar.Z(), 4, true);
        if (Y4 != null) {
            Button button = (Button) Y4.findViewById(R.id.clear);
            button.setVisibility(0);
            button.setText(R.string.menu_empty);
            button.setOnClickListener(new a(400L));
            b bVar = new b();
            Y4.findViewById(R.id.more).setOnClickListener(bVar);
            Y4.setOnClickListener(bVar);
        }
        return Y4;
    }

    @Override // ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void s1() {
        View view = this.P0;
        if (view != null) {
            ax.S2.b.a(view, b());
            this.Q0.removeView(this.P0);
            this.P0 = null;
        }
        super.s1();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        ax.T2.h hVar = this.S0;
        if (hVar != null) {
            hVar.G0();
        }
    }

    @Override // ax.d3.AbstractC1929p, ax.d3.AbstractC1927n, androidx.fragment.app.Fragment
    public void x1(boolean z) {
        super.x1(z);
        if (z) {
            e5().n();
        }
    }

    @Override // ax.d3.AbstractC1927n
    public ax.Q2.f z3() {
        return ax.Q2.f.p1;
    }

    class c implements h.a {
        c() {
        }

        @Override // ax.W2.h.a
        public void a(h.b bVar, String str, String str2, ArrayList<String> arrayList, Object obj) {
            if (bVar != h.b.FAILURE || !"NEED_STORAGE_PERMISSION".equals(str)) {
                f0.this.c4(false);
                return;
            }
            if (arrayList == null) {
                f0.this.Z2(ax.c3.K.f, null);
                return;
            }
            ax.c3.K h = ax.c3.K.h(arrayList.get(0));
            String str3 = arrayList.get(1);
            C3184b.c(arrayList.size() == 2);
            C3184b.c(h != null);
            f0.this.Z2(h, str3);
        }

        @Override // ax.W2.h.a
        public void b() {
        }
    }
}
