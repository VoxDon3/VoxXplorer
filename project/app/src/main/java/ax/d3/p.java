/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.Context;
import android.graphics.drawable.Drawable;
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
import ax.K0.a;
import ax.K0.c;
import ax.T.b;
import ax.T2.h;
import ax.c3.A;
import ax.c3.B;
import ax.c3.d0;
import ax.d3.n;
import ax.x3.e;
import java.util.ArrayList;
import java.util.List;

public abstract class p
extends n
implements a.a<Boolean> {
    TextView C0;
    TextView D0;
    View E0;
    LinearLayout F0;
    View G0;
    ViewPager H0;
    private e I0;
    boolean J0;
    private SwipeRefreshLayout K0;
    private int L0 = -1;
    boolean M0 = false;
    long N0;
    int O0;

    private e d5(int n8) {
        e e8 = new e(this.b());
        for (int i8 = 0; i8 < n8; ++i8) {
            ViewPager viewPager = this.H0;
            CharSequence charSequence = new StringBuilder();
            charSequence.append("TAG");
            charSequence.append(i8);
            charSequence = charSequence.toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TITLE");
            stringBuilder.append(i8);
            e8.v(viewPager, (String)charSequence, stringBuilder.toString());
        }
        return e8;
    }

    private void m5(boolean bl) {
        if (!this.X0()) {
            return;
        }
        this.o5(bl);
        if (this.w0().d(0) == null) {
            this.w0().e(0, null, this);
            return;
        }
        this.w0().g(0, null, this);
    }

    @Override
    public String C3() {
        return null;
    }

    @Override
    public void H1() {
        super.H1();
        if (this.M0) {
            this.M0 = false;
            this.Z3("");
        }
    }

    @Override
    public void L1(View object, Bundle object2) {
        super.L1((View)object, (Bundle)object2);
        this.D0 = (TextView)object.findViewById(2131362718);
        this.C0 = (TextView)object.findViewById(2131362716);
        this.E0 = object.findViewById(2131362179);
        this.F0 = (LinearLayout)object.findViewById(2131362989);
        this.G0 = object.findViewById(2131362984);
        this.H0 = (ViewPager)object.findViewById(2131363038);
        object2 = this.d5(this.h5());
        this.I0 = object2;
        this.H0.setAdapter((androidx.viewpager.widget.a)object2);
        object = (SwipeRefreshLayout)object.findViewById(2131362923);
        this.K0 = object;
        ((SwipeRefreshLayout)object).setOnRefreshListener(new SwipeRefreshLayout.j(this){
            final p a;
            {
                this.a = p8;
            }

            @Override
            public void a() {
                this.a.c4(true);
            }
        });
        this.K0.setOnChildScrollUpCallback(new SwipeRefreshLayout.i(this){
            final p a;
            {
                this.a = p8;
            }

            @Override
            public boolean a(SwipeRefreshLayout object, View view) {
                object = this.a;
                if (((p)object).J0) {
                    return true;
                }
                return ((p)object).I0.x(this.a.H0.getCurrentItem()).canScrollVertically(-1);
            }
        });
        this.H0.c(new ViewPager.j(this){
            final p a;
            {
                this.a = p8;
            }

            @Override
            public void K(int n8) {
            }

            @Override
            public void e(int n8) {
                p p8 = this.a;
                boolean bl = n8 != 0;
                p8.J0 = bl;
            }

            @Override
            public void h(int n8, float f8, int n9) {
            }
        });
        this.x2(true);
    }

    @Override
    public void M4() {
    }

    @Override
    public boolean N3() {
        return false;
    }

    protected void S4(View view) {
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup)view.getParent()).removeView(view);
            }
            this.f5().addView(view);
            ++this.O0;
        }
    }

    protected void T4() {
        LinearLayout linearLayout = this.f5();
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.f0());
        linearLayout.addView(this.Z4(layoutInflater, (ViewGroup)linearLayout, 2131951945, 0));
        linearLayout.addView(layoutInflater.inflate(2131558460, (ViewGroup)linearLayout, false));
    }

    protected abstract void U4();

    @Override
    public boolean V2() {
        return false;
    }

    protected void V4() {
        this.O0 = 0;
    }

    public void W4() {
        if (this.f0() == null) {
            return;
        }
        this.f0().runOnUiThread(new Runnable(this){
            final p q;
            {
                this.q = p8;
            }

            @Override
            public void run() {
                this.q.D0.setText((CharSequence)"");
                this.q.C0.setText((CharSequence)"");
            }
        });
    }

    protected View X4(LayoutInflater object, ViewGroup viewGroup, h object2, h.h h8) {
        viewGroup = object.inflate(2131558457, viewGroup, false);
        object2 = h8.a();
        object = h8.c() ? ax.s3.b.g(this.b(), null, true, false) : A.f(this.b(), (String)object2, false);
        ((ImageView)viewGroup.findViewById(2131362383)).setImageDrawable((Drawable)object);
        if ("/".equals(object2)) {
            ((TextView)viewGroup.findViewById(2131362593)).setText((CharSequence)"/");
        } else {
            ((TextView)viewGroup.findViewById(2131362593)).setText((CharSequence)d0.h((String)object2));
        }
        ((TextView)viewGroup.findViewById(2131362677)).setText((CharSequence)d0.r((String)object2));
        object = this.c5(h8.b());
        ((TextView)viewGroup.findViewById(2131362831)).setText((CharSequence)object);
        return viewGroup;
    }

    protected View Y4(LayoutInflater layoutInflater, ViewGroup viewGroup, h h8, int n8, String string, long l8, List<h.h> list, int n9, boolean bl) {
        if (!(l8 != 0L && list != null || bl)) {
            return null;
        }
        int n10 = 0;
        viewGroup = layoutInflater.inflate(2131558459, viewGroup, false);
        ((TextView)viewGroup.findViewById(2131362963)).setText(n8);
        Object object = this.b5(l8);
        ((TextView)viewGroup.findViewById(2131362838)).setText((CharSequence)object);
        if (string != null) {
            ((TextView)viewGroup.findViewById(2131362003)).setText((CharSequence)string);
        } else {
            ((TextView)viewGroup.findViewById(2131362003)).setVisibility(8);
        }
        string = (LinearLayout)viewGroup.findViewById(2131362308);
        for (n8 = n10; n8 < n9; ++n8) {
            if (list == null || list.size() <= n8) continue;
            object = list.get(n8);
            if (object != null) {
                string.addView(this.X4(layoutInflater, (ViewGroup)string, h8, (h.h)object));
                continue;
            }
            object = ax.Ha.c.h().f().b("!!!! CARD FRAGMENT LIST ITEM NULL !!!!");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("files : ");
            stringBuilder.append(list.size());
            stringBuilder.append(", i : ");
            stringBuilder.append(n8);
            ((ax.Ha.b)object).g(stringBuilder.toString()).h();
        }
        return viewGroup;
    }

    @Override
    public void Z3(String string) {
        if (!this.X0()) {
            this.M0 = true;
            return;
        }
        this.a5();
    }

    View Z4(LayoutInflater layoutInflater, ViewGroup viewGroup, int n8, int n9) {
        layoutInflater = layoutInflater.inflate(2131558461, viewGroup, false);
        ((TextView)layoutInflater.findViewById(2131362469)).setText(n8);
        viewGroup = (TextView)layoutInflater.findViewById(2131362907);
        if (n9 != 0) {
            viewGroup.setVisibility(0);
            viewGroup.setText(n8);
            return layoutInflater;
        }
        viewGroup.setVisibility(8);
        return layoutInflater;
    }

    protected void a5() {
        if (this.i5() && !this.e5().y0()) {
            this.U4();
            return;
        }
        this.c4(false);
    }

    String b5(long l8) {
        return B.i(this.o3(), l8);
    }

    @Override
    public void c4(boolean bl) {
        if (this.b() == null) {
            return;
        }
        this.e5().n();
        if (bl) {
            this.e5().H0(this.b());
        }
        this.f5().removeAllViews();
        this.m5(true);
    }

    String c5(long l8) {
        return B.k(this.o3(), l8);
    }

    protected abstract h e5();

    protected LinearLayout f5() {
        return this.I0.w(this.H0.getCurrentItem());
    }

    protected ArrayList<NestedScrollView> g5() {
        e e8 = this.I0;
        if (e8 == null) {
            return null;
        }
        return e8.y();
    }

    protected abstract int h5();

    protected abstract boolean i5();

    @Override
    public void j3() {
    }

    protected void j5() {
        this.G0.setVisibility(8);
    }

    protected abstract a<Boolean> k5();

    public void l5(c<Boolean> c8, Boolean bl) {
        this.o5(false);
        if (!this.X0()) {
            return;
        }
        if (bl != null && bl.booleanValue()) {
            this.U4();
            return;
        }
        this.T4();
    }

    public void n5(int n8) {
        if (this.f0() == null) {
            return;
        }
        this.f0().runOnUiThread(new Runnable(){
            final p c0;
            final int q;
            {
                this.c0 = p8;
                this.q = n8;
            }

            @Override
            public void run() {
                this.c0.C0.setText(this.q);
            }
        });
    }

    protected void o5(boolean bl) {
        if (this.X0()) {
            this.K0.post(new Runnable(){
                final p c0;
                final boolean q;
                {
                    this.c0 = p8;
                    this.q = bl;
                }

                @Override
                public void run() {
                    if (this.c0.K0.m() != this.q) {
                        this.c0.K0.setRefreshing(this.q);
                    }
                }
            });
        }
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        ArrayList<NestedScrollView> arrayList;
        super.onApplyWindowsInsets(b8, bl);
        if (!bl && (arrayList = this.g5()) != null) {
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                NestedScrollView nestedScrollView = arrayList.get(i8);
                nestedScrollView.setClipToPadding(false);
                nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), nestedScrollView.getPaddingTop(), nestedScrollView.getPaddingRight(), b8.d);
            }
        }
    }

    @Override
    public void p(c<Boolean> c8) {
    }

    public void p5(String string, boolean bl) {
        long l8;
        if (this.f0() == null || (l8 = System.currentTimeMillis()) - this.N0 <= 500L && !bl) {
            return;
        }
        this.N0 = l8;
        this.f0().runOnUiThread(new Runnable(){
            final p c0;
            final String q;
            {
                this.c0 = p8;
                this.q = string;
            }

            @Override
            public void run() {
                this.c0.D0.setText((CharSequence)this.q);
            }
        });
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558549, null);
    }

    @Override
    public c<Boolean> w(int n8, Bundle bundle) {
        return this.k5();
    }

    @Override
    public void x1(boolean bl) {
        super.x1(bl);
        if (!bl && this.i5()) {
            this.U4();
        }
    }

    @Override
    public int x3() {
        if (this.L0 < 0) {
            this.L0 = this.j0().getInt("location_key");
        }
        return this.L0;
    }
}

