/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.os.Handler;
import android.view.View;
import ax.g3.c;
import ax.u3.B;
import ax.u3.b;
import com.android.ex.photo.PhotoViewPager;

public class E {
    private int a;
    private boolean b;
    private boolean c;
    private int d;
    private int e;
    private final View f;
    private final PhotoViewPager g;
    private final View h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final View m;
    private final View n;
    private final View o;
    private final View p;
    private final View q;
    private final View r;
    private final Handler s;
    private final d t;
    private boolean u;
    private Runnable v = new Runnable(this){
        final E q;
        {
            this.q = e8;
        }

        @Override
        public void run() {
            if (this.q.d != 2) {
                return;
            }
            int n8 = this.q.g.getAdapter().e();
            if (n8 == 0) {
                ax.u3.b.f();
                this.q.A(0);
                this.q.t.a(this.q.c);
                return;
            }
            int n9 = this.q.g.getCurrentItem();
            boolean bl = true;
            if ((n9 = (n9 + 1) % n8) == 0) {
                bl = false;
            }
            if (n9 != this.q.e) {
                this.q.g.N(n9, bl);
                this.q.s.removeCallbacks((Runnable)this);
                this.q.s.postDelayed((Runnable)this, (long)this.q.a);
                return;
            }
            if (this.q.b) {
                this.q.g.N(n9, bl);
                this.q.s.removeCallbacks((Runnable)this);
                this.q.s.postDelayed((Runnable)this, (long)this.q.a);
                return;
            }
            this.q.g.N(this.q.e, bl);
            this.q.A(0);
            this.q.t.a(this.q.c);
        }
    };

    public E(View view, PhotoViewPager photoViewPager, d d8) {
        this.f = view;
        this.t = d8;
        this.a = ax.t3.d.a(view.getContext());
        this.b = ax.t3.d.b(view.getContext());
        this.c = ax.t3.d.c(view.getContext());
        this.u = ax.t3.d.d(view.getContext());
        this.s = new Handler();
        this.g = photoViewPager;
        this.h = view.findViewById(2131362415);
        this.i = view.findViewById(2131362416);
        this.j = view.findViewById(2131362417);
        this.k = view.findViewById(2131362418);
        this.l = view.findViewById(2131362413);
        this.m = view.findViewById(2131362414);
        this.n = view.findViewById(2131363033);
        this.o = view.findViewById(2131363032);
        this.p = view.findViewById(2131362979);
        this.q = view.findViewById(2131362980);
        this.r = view.findViewById(2131362875);
        this.B();
    }

    private void A(int n8) {
        this.d = n8;
    }

    private void B() {
        c c8 = new c(this){
            final E c;
            {
                this.c = e8;
            }

            /*
             * Unable to fully structure code
             */
            @Override
            public void a(View var1_1) {
                var3_2 = var1_1.getId();
                var2_3 = true;
                var5_4 = false;
                var4_5 = false;
                block0 : switch (var3_2) {
                    default: {
                        switch (var3_2) {
                            default: {
                                switch (var3_2) {
                                    default: {
                                        var3_2 = 0;
lbl12:
                                        // 2 sources

                                        while (true) {
                                            var2_3 = false;
lbl14:
                                            // 3 sources

                                            while (true) {
                                                var5_4 = false;
                                                break block0;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    case 2131363033: {
                                        E.e(this.c, false);
lbl20:
                                        // 2 sources

                                        while (true) {
                                            var3_2 = 0;
                                            var2_3 = false;
                                            var6_6 = true;
                                            var4_5 = var5_4;
                                            var5_4 = var6_6;
                                            break block0;
                                            break;
                                        }
                                    }
                                    case 2131363032: 
                                }
                                E.e(this.c, true);
                                ** continue;
                            }
                            case 2131362980: {
                                var7_7 = this.c;
                                E.i(var7_7, E.h(var7_7) ^ true);
                                var3_2 = 1;
                                ** continue;
                            }
                            case 2131362979: 
                        }
                        var7_8 = this.c;
                        E.g(var7_8, E.f(var7_8) ^ true);
                        var3_2 = 0;
                        var2_3 = false;
                        var4_5 = true;
                        ** GOTO lbl14
                    }
                    case 2131362418: {
                        E.b(this.c, 5000);
lbl48:
                        // 6 sources

                        while (true) {
                            var3_2 = 0;
                            ** continue;
                            break;
                        }
                    }
                    case 2131362417: {
                        E.b(this.c, 4000);
                        ** GOTO lbl48
                    }
                    case 2131362416: {
                        E.b(this.c, 3000);
                        ** GOTO lbl48
                    }
                    case 2131362415: {
                        E.b(this.c, 2000);
                        ** GOTO lbl48
                    }
                    case 2131362414: {
                        E.b(this.c, 15000);
                        ** GOTO lbl48
                    }
                    case 2131362413: {
                        E.b(this.c, 10000);
                        ** continue;
                    }
                }
                if (var2_3) {
                    ax.t3.d.e(var1_1.getContext(), E.a(this.c));
                }
                if (var4_5) {
                    ax.t3.d.f(var1_1.getContext(), E.f(this.c));
                }
                if (var3_2 != 0) {
                    ax.t3.d.g(var1_1.getContext(), E.h(this.c));
                }
                if (var5_4) {
                    ax.t3.d.h(var1_1.getContext(), E.c(this.c));
                }
                E.j(this.c);
            }
        };
        this.h.setOnClickListener((View.OnClickListener)c8);
        this.i.setOnClickListener((View.OnClickListener)c8);
        this.j.setOnClickListener((View.OnClickListener)c8);
        this.k.setOnClickListener((View.OnClickListener)c8);
        this.l.setOnClickListener((View.OnClickListener)c8);
        this.m.setOnClickListener((View.OnClickListener)c8);
        this.n.setOnClickListener((View.OnClickListener)c8);
        this.o.setOnClickListener((View.OnClickListener)c8);
        this.p.setOnClickListener((View.OnClickListener)c8);
        this.q.setOnClickListener((View.OnClickListener)c8);
        this.E();
        this.r.setOnClickListener((View.OnClickListener)new c(this){
            final E c;
            {
                this.c = e8;
            }

            @Override
            public void a(View view) {
                this.c.C();
            }
        });
    }

    private void E() {
        View view = this.h;
        int n8 = this.a;
        boolean bl = false;
        boolean bl2 = n8 == 2000;
        view.setActivated(bl2);
        view = this.i;
        bl2 = this.a == 3000;
        view.setActivated(bl2);
        view = this.j;
        bl2 = this.a == 4000;
        view.setActivated(bl2);
        view = this.k;
        bl2 = this.a == 5000;
        view.setActivated(bl2);
        view = this.l;
        bl2 = this.a == 10000;
        view.setActivated(bl2);
        view = this.m;
        bl2 = this.a == 15000;
        view.setActivated(bl2);
        this.n.setActivated(this.u ^ true);
        view = this.o;
        bl2 = this.u;
        view.setActivated(bl2);
        view = this.p;
        bl2 = this.b;
        view.setActivated(bl2);
        if (this.b) {
            this.p.setContentDescription((CharSequence)this.f.getContext().getString(2131952539));
        } else {
            this.p.setContentDescription((CharSequence)this.f.getContext().getString(2131952537));
        }
        view = this.q;
        bl2 = bl;
        if (this.c) {
            bl2 = true;
        }
        view.setActivated(bl2);
        if (this.c) {
            this.q.setContentDescription((CharSequence)this.f.getContext().getString(2131952604));
            return;
        }
        this.q.setContentDescription((CharSequence)this.f.getContext().getString(2131952603));
    }

    static /* synthetic */ int b(E e8, int n8) {
        e8.a = n8;
        return n8;
    }

    static /* synthetic */ boolean c(E e8) {
        return e8.u;
    }

    static /* synthetic */ boolean e(E e8, boolean bl) {
        e8.u = bl;
        return bl;
    }

    static /* synthetic */ boolean g(E e8, boolean bl) {
        e8.b = bl;
        return bl;
    }

    static /* synthetic */ boolean i(E e8, boolean bl) {
        e8.c = bl;
        return bl;
    }

    static /* synthetic */ void j(E e8) {
        e8.E();
    }

    private void t() {
        this.t.c(this.c);
        this.e = this.g.getCurrentItem();
        this.s.postDelayed(this.v, (long)this.a);
    }

    public void C() {
        this.f.setVisibility(8);
        this.A(2);
        this.t();
    }

    public void D() {
        this.f.setVisibility(0);
        int n8 = ((View)this.f.getParent()).getWidth();
        int n9 = B.e(this.f.getContext(), 400);
        this.f.getLayoutParams().width = n8 >= n9 ? n9 : -1;
        this.r.requestFocus();
        this.A(1);
    }

    public void p() {
        this.s.removeCallbacks(this.v);
        int n8 = this.d;
        if (n8 != 0) {
            this.A(0);
            if (n8 != 1) {
                this.t.b(this.c);
            }
        }
        if (this.f.getVisibility() == 0) {
            this.f.setVisibility(8);
        }
    }

    public void q() {
        this.p();
    }

    public int r() {
        return this.a;
    }

    public boolean s() {
        return this.u;
    }

    public boolean u() {
        return this.f.getVisibility() == 0;
    }

    public boolean v() {
        return this.x() || this.d == 1;
        {
        }
    }

    public boolean w() {
        return this.d == 3;
    }

    public boolean x() {
        int n8 = this.d;
        return n8 == 2 || n8 == 3;
        {
        }
    }

    public void y() {
        this.A(3);
    }

    public void z() {
        this.A(2);
        this.v.run();
    }

    public static interface d {
        public void a(boolean var1);

        public void b(boolean var1);

        public void c(boolean var1);
    }
}

