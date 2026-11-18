/*
 * Decompiled with CFR 0.152.
 */
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
import ax.K0.a;
import ax.K0.c;
import ax.Q2.g;
import ax.S2.b;
import ax.T2.h;
import ax.W2.h;
import ax.W2.o;
import ax.c3.K;
import ax.d3.p;
import ax.u3.b;
import ax.u3.z;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class f0
extends p {
    private static final Logger U0 = g.a(f0.class);
    private View P0;
    private CardView Q0;
    private boolean R0;
    private h S0;
    private e T0 = new e();

    private void s5() {
        ax.Q2.a.i().m("menu_recycle_bin", "empty_recycle_bin").e();
        o.n(this, null, new h.a(this){
            final f0 a;
            {
                this.a = f02;
            }

            @Override
            public void a(h.b object, String string, String object2, ArrayList<String> arrayList, Object object3) {
                object2 = h.b.d0;
                boolean bl = false;
                if (object == object2 && "NEED_STORAGE_PERMISSION".equals(string)) {
                    if (arrayList != null) {
                        object = K.h(arrayList.get(0));
                        string = arrayList.get(1);
                        boolean bl2 = arrayList.size() == 2;
                        b.c(bl2);
                        bl2 = bl;
                        if (object != null) {
                            bl2 = true;
                        }
                        b.c(bl2);
                        this.a.Z2((K)object, string);
                        return;
                    }
                    this.a.Z2(K.f, null);
                    return;
                }
                this.a.c4(false);
            }

            @Override
            public void b() {
            }
        });
    }

    public static boolean t5(h h8) {
        if (h8.Z() == null) {
            b.g("no recycle bin info in analysis");
            return true;
        }
        return h8.c0() == 0L && h8.Z().size() == 0;
    }

    private void u5() {
        if (this.b() != null && !z.u(this.b()) && ax.t3.a.l()) {
            CardView cardView;
            this.T0.a = true;
            this.Q0 = cardView = (CardView)LayoutInflater.from((Context)this.b()).inflate(2131558453, (ViewGroup)this.f5(), false);
            cardView.setVisibility(8);
            ax.S2.b.i(this.f0(), new b.c(this){
                final f0 a;
                {
                    this.a = f02;
                }
            });
        }
    }

    @Override
    public String C3() {
        return this.A3().e();
    }

    @Override
    public void H1() {
        super.H1();
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.u5();
    }

    @Override
    protected void U4() {
        this.V4();
        LinearLayout linearLayout = this.f5();
        linearLayout.removeAllViews();
        h h8 = this.e5();
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.f0());
        h8 = this.r5(layoutInflater, (ViewGroup)linearLayout, h8);
        h8.requestFocus();
        this.S4((View)h8);
        if (this.Q0 != null && ax.t3.a.l()) {
            this.S4((View)this.Q0);
        }
        this.S4(layoutInflater.inflate(2131558460, (ViewGroup)linearLayout, false));
    }

    @Override
    protected boolean W2() {
        return false;
    }

    @Override
    protected h e5() {
        return this.S0;
    }

    @Override
    protected int h5() {
        return 1;
    }

    @Override
    protected boolean i5() {
        h h8 = this.S0;
        return h8 != null && h8.k0();
    }

    @Override
    public void j1(Activity object) {
        super.j1((Activity)object);
        this.R0 = true;
        object = h.a0();
        this.S0 = object;
        ((h)object).J0();
    }

    @Override
    protected a<Boolean> k5() {
        return new f((Context)this.f0(), this.e5(), this.T0);
    }

    @Override
    public void l5(c<Boolean> c8, Boolean bl) {
        super.l5(c8, bl);
        if (bl != null && bl.booleanValue()) {
            if (f0.t5(this.e5())) {
                if (this.R0 && this.X0()) {
                    this.J4(2131952531, 1);
                }
                this.i3("empty_recycle_bin");
            }
            this.R0 = false;
        }
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689500);
    }

    View r5(LayoutInflater layoutInflater, ViewGroup object, h h8) {
        layoutInflater = f0.t5(h8) ? this.Y4(layoutInflater, (ViewGroup)object, h8, 2131952529, this.M0(2131952531), h8.c0(), h8.Z(), 4, true) : this.Y4(layoutInflater, (ViewGroup)object, h8, 2131952529, null, h8.c0(), h8.Z(), 4, true);
        if (layoutInflater != null) {
            object = (Button)layoutInflater.findViewById(2131362039);
            object.setVisibility(0);
            object.setText(2131952260);
            object.setOnClickListener((View.OnClickListener)new ax.g3.c(this, 400L){
                final f0 c;
                {
                    this.c = f02;
                    super(l8);
                }

                @Override
                public void a(View object) {
                    if (this.c.x3() != 0 && this.c.Z2((K)(object = h.q(this.c.x3())), null)) {
                        return;
                    }
                    this.c.s5();
                }
            });
            object = new ax.g3.c(this){
                final f0 c;
                {
                    this.c = f02;
                }

                @Override
                public void a(View object) {
                    object = Bookmark.m((Context)this.c.f0(), ax.Q2.f.o1, this.c.x3());
                    ((MainActivity)this.c.f0()).d2(this.c.A3(), true, (Bookmark)object, "recycle_bin_card");
                }
            };
            layoutInflater.findViewById(2131362565).setOnClickListener((View.OnClickListener)object);
            layoutInflater.setOnClickListener((View.OnClickListener)object);
        }
        return layoutInflater;
    }

    @Override
    public void s1() {
        View view = this.P0;
        if (view != null) {
            ax.S2.b.a(view, this.b());
            this.Q0.removeView(this.P0);
            this.P0 = null;
        }
        super.s1();
    }

    @Override
    public void v1() {
        super.v1();
        h h8 = this.S0;
        if (h8 != null) {
            h8.G0();
        }
    }

    @Override
    public void x1(boolean bl) {
        super.x1(bl);
        if (bl) {
            this.e5().n();
        }
    }

    @Override
    public ax.Q2.f z3() {
        return ax.Q2.f.p1;
    }

    static class e {
        boolean a;
        CountDownLatch b = new CountDownLatch(1);

        e() {
        }
    }

    public static class f
    extends a<Boolean> {
        h o;
        e p;

        public f(Context context, h h8, e e8) {
            super(context);
            this.o = h8;
            this.p = e8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public Boolean L() {
            if (this.j() == null) {
                return null;
            }
            boolean bl = !this.o.k0() ? this.o.i() : true;
            e e8 = this.p;
            if (e8.a) {
                try {
                    e8.b.await(1500L, TimeUnit.MILLISECONDS);
                }
                catch (InterruptedException interruptedException) {}
                this.p.a = false;
            }
            return bl;
        }

        @Override
        protected void t() {
            this.a();
        }
    }
}

