/*
 * Decompiled with CFR 0.152.
 */
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
import ax.J5.h;
import ax.Q2.e;
import ax.Q2.f;
import ax.Q2.g;
import ax.S2.b;
import ax.T2.h;
import ax.U2.d;
import ax.W2.h;
import ax.X2.Q;
import ax.Z2.j;
import ax.a3.n;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.u;
import ax.c3.z;
import ax.d3.n;
import ax.d3.p;
import ax.u3.c;
import ax.u3.m;
import ax.u3.o;
import com.voxdon.xplorer.activity.MainActivity;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.receiver.StorageCheckReceiver;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class b
extends p {
    private static final Logger a1 = g.a(b.class);
    private View P0;
    private CardView Q0;
    private View R0;
    private K S0;
    private ax.T2.h T0;
    private List<ax.T2.h> U0 = new ArrayList<ax.T2.h>();
    private boolean V0;
    private long W0;
    private m X0;
    private int Y0 = -1;
    private boolean Z0;

    private void A5() {
        View view = LayoutInflater.from((Context)this.f0()).inflate(2131558442, (ViewGroup)this.F0, false);
        TabLayout tabLayout = (TabLayout)view.findViewById(2131362927);
        TabLayout.g g8 = tabLayout.F();
        g8.u(2131952112);
        g8.t(0);
        tabLayout.i(g8);
        g8 = tabLayout.F();
        g8.u(2131952113);
        g8.t(1);
        tabLayout.i(g8);
        tabLayout.h(new TabLayout.d(this){
            final b a;
            {
                this.a = b8;
            }

            @Override
            public void a(TabLayout.g g8) {
            }

            @Override
            public void b(TabLayout.g object) {
                this.a.H0.N(((TabLayout.g)object).g(), true);
                object = (Integer)((TabLayout.g)object).i();
                this.a.c6((Integer)object);
                this.a.a5();
            }

            @Override
            public void c(TabLayout.g g8) {
            }
        });
        this.F0.addView(view, 0);
        this.H0.c(new TabLayout.h(tabLayout));
        if (this.V5() == 1) {
            g8.m();
        } else if (this.V5() == -1) {
            this.Y0 = 0;
        }
        this.j5();
    }

    private void B5() {
        View view = LayoutInflater.from((Context)this.f0()).inflate(2131558442, (ViewGroup)this.F0, false);
        TabLayout tabLayout = (TabLayout)view.findViewById(2131362927);
        Object object = tabLayout.F();
        ((TabLayout.g)object).u(2131952168);
        ((TabLayout.g)object).t(K.e);
        tabLayout.i((TabLayout.g)object);
        TabLayout.g g8 = tabLayout.F();
        g8.u(2131952181);
        object = K.f;
        g8.t(object);
        tabLayout.i(g8);
        tabLayout.h(new TabLayout.d(this){
            final b a;
            {
                this.a = b8;
            }

            @Override
            public void a(TabLayout.g g8) {
            }

            @Override
            public void b(TabLayout.g object) {
                this.a.H0.N(((TabLayout.g)object).g(), true);
                object = (K)((TabLayout.g)object).i();
                this.a.b6((K)object);
                this.a.a5();
            }

            @Override
            public void c(TabLayout.g g8) {
            }
        });
        this.F0.addView(view, 0);
        this.H0.c(new TabLayout.h(tabLayout));
        if (this.T5() == object) {
            g8.m();
        }
        this.j5();
    }

    private List<com.voxdon.xplorer.file.n> C5(com.voxdon.xplorer.file.o o8, String string, List<h.h> list, boolean bl) {
        list = new ArrayList<h.h>(list);
        ArrayList<com.voxdon.xplorer.file.n> arrayList = new ArrayList<com.voxdon.xplorer.file.n>();
        int n8 = ((ArrayList)list).size();
        int n9 = 0;
        while (n9 < n8) {
            Object object = ((ArrayList)list).get(n9);
            int n10 = n9 + 1;
            object = (h.h)object;
            if (!bl) {
                n9 = n10;
                if (((h.h)object).b() <= 0L) continue;
            }
            try {
                arrayList.add(o8.z(d0.P(string, ((h.h)object).a())));
                n9 = n10;
            }
            catch (Exception exception) {
                n9 = n10;
            }
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void P5(ax.T2.h h8) {
        ax.Q2.a.i().m("menu_analysis", "delete_all_cache").c("loc", this.z3().I()).e();
        Object object = h8.X();
        com.voxdon.xplorer.file.o o8 = ax.c3.x.e((K)object);
        object = this.C5(o8, ((K)object).e(), h8.N(), false);
        if (Q.L() && h8.X() == K.e) {
            File file;
            try {
                file = e.t(this.o3());
                if (file != null && file.exists()) {
                    object.add(o8.z(file.getAbsolutePath()));
                }
            }
            catch (Exception exception) {}
            try {
                file = e.o(this.o3());
                if (file.exists()) {
                    object.add(o8.z(file.getAbsolutePath()));
                }
            }
            catch (Exception exception) {}
        }
        ax.W2.o.l(this, o8, (List<com.voxdon.xplorer.file.n>)object, 1, true, false, 2131951761, 2131951760, new h.a(){
            final ax.T2.h a;
            final b b;
            {
                this.b = b8;
                this.a = h8;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                if (b8 == h.b.c0) {
                    b.y5(this.b, System.currentTimeMillis());
                    this.a.o();
                    this.b.U4();
                    return;
                }
                this.b.c4(false);
            }

            @Override
            public void b() {
            }
        }, null);
    }

    private void Q5(ax.T2.h h8) {
        ax.Q2.a.i().m("menu_analysis", "delete_duplicate_downloads").c("loc", this.z3().I()).e();
        if (h8.H() == null) {
            this.E4(2131951927, 1);
            return;
        }
        K k8 = h8.X();
        com.voxdon.xplorer.file.o o8 = ax.c3.x.e(k8);
        ax.W2.o.l(this, o8, this.C5(o8, k8.e(), h8.H(), true), 1, true, false, 2131952248, 2131952334, new h.a(){
            final ax.T2.h a;
            final b b;
            {
                this.b = b8;
                this.a = h8;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                if (b8 == h.b.c0) {
                    this.a.x();
                    this.b.U4();
                    return;
                }
                this.b.c4(false);
            }

            @Override
            public void b() {
            }
        }, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void R5() {
        ArrayList<com.voxdon.xplorer.file.n> arrayList = new ArrayList<com.voxdon.xplorer.file.n>();
        com.voxdon.xplorer.file.o o8 = ax.c3.x.e(K.e);
        if (Q.L()) {
            File file;
            try {
                file = e.t(this.o3());
                if (file != null && file.exists()) {
                    arrayList.add(o8.z(file.getAbsolutePath()));
                }
            }
            catch (Exception exception) {}
            try {
                file = e.o(this.o3());
                if (file.exists()) {
                    arrayList.add(o8.z(file.getAbsolutePath()));
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (arrayList.size() <= 0) {
            this.U4();
            return;
        }
        ax.W2.o.l(this, o8, arrayList, 1, false, true, 2131951761, 2131951760, new h.a(this){
            final b a;
            {
                this.a = b8;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                if (b8 == h.b.c0) {
                    b.y5(this.a, System.currentTimeMillis());
                }
                this.a.U4();
            }

            @Override
            public void b() {
            }
        }, null);
    }

    private void S5() {
        ax.Q2.a.i().m("menu_analysis", "empty_recycle_bin").e();
        ax.W2.o.n(this, this.T5(), new h.a(this){
            final b a;
            {
                this.a = b8;
            }

            @Override
            public void a(h.b b8, String string, String string2, ArrayList<String> arrayList, Object object) {
                this.a.c4(false);
            }

            @Override
            public void b() {
            }
        });
    }

    private K T5() {
        if (this.X5()) {
            if (this.S0 == null) {
                this.S0 = K.e;
            }
            return this.S0;
        }
        if (this.S0 == null) {
            this.S0 = ax.T2.h.q(this.x3());
        }
        return this.S0;
    }

    private int U5() {
        return ax.T2.h.r(this.T5());
    }

    private int V5() {
        return this.Y0;
    }

    private boolean X5() {
        return this.x3() == 0;
    }

    private void Y5() {
        ax.T2.h h8;
        this.T0 = h8 = ax.T2.h.S(this.T5());
        if (!this.U0.contains(h8)) {
            this.T0.J0();
            this.U0.add(this.T0);
        }
    }

    private boolean Z5() {
        return this.X5() && j.F().t0();
    }

    private void a6() {
        try {
            m m8;
            u.r0(this, o.b(), 38004);
            if (this.X0 == null) {
                this.X0 = m8 = new m();
            }
            m8 = this.X0;
            Context context = this.o3();
            m.c c8 = new m.c(this){
                final b a;
                {
                    this.a = b8;
                }

                @Override
                public void a() {
                    if (this.a.b() == null) {
                        ax.Ha.c.h().f().b("USAGE STAT MON 1").j().h();
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

    private void b6(K k8) {
        this.S0 = k8;
        this.Y5();
    }

    private void c6(int n8) {
        this.Y0 = n8;
    }

    private void d6() {
        if (this.b() != null && !ax.u3.z.u(this.b()) && ax.t3.a.g()) {
            CardView cardView;
            this.Q0 = cardView = (CardView)LayoutInflater.from((Context)this.b()).inflate(2131558453, (ViewGroup)this.f5(), false);
            this.R0 = cardView.findViewById(2131361875);
            if (h.o().g(this.b()) != 0) {
                this.V0 = false;
            }
            if (this.V0) {
                this.Q0.setVisibility(0);
                cardView = this.R0;
                if (cardView != null) {
                    cardView.setVisibility(0);
                }
            } else {
                this.Q0.setVisibility(8);
            }
            ax.S2.b.d(this.f0(), new b.c(this){
                final b a;
                {
                    this.a = b8;
                }
            });
        }
    }

    static /* synthetic */ long y5(b b8, long l8) {
        b8.W0 = l8;
        return l8;
    }

    View D5(LayoutInflater layoutInflater, ViewGroup viewGroup, ax.T2.h h8, String string, long l8) {
        return this.E5(layoutInflater, viewGroup, h8, d.g(string), l8);
    }

    View E5(LayoutInflater layoutInflater, ViewGroup object, ax.T2.h h8, String string, long l8) {
        layoutInflater = layoutInflater.inflate(2131558455, (ViewGroup)object, false);
        object = d.F(this.b()).x(string);
        if (object != null) {
            ((ImageView)layoutInflater.findViewById(2131362383)).setImageDrawable(((ax.U2.f)object).l());
            ((TextView)layoutInflater.findViewById(2131362593)).setText((CharSequence)((ax.U2.f)object).q());
        } else {
            ((ImageView)layoutInflater.findViewById(2131362383)).setImageResource(2131231320);
            ((TextView)layoutInflater.findViewById(2131362593)).setText((CharSequence)string);
        }
        object = this.c5(l8);
        ((TextView)layoutInflater.findViewById(2131362831)).setText((CharSequence)object);
        return layoutInflater;
    }

    View F5(LayoutInflater object, ViewGroup viewGroup, ax.T2.h h8) {
        if (h8.D() == 0L) {
            return null;
        }
        viewGroup = object.inflate(2131558459, viewGroup, false);
        ((TextView)viewGroup.findViewById(2131362963)).setText(2131952147);
        String string = this.b5(h8.D());
        ((TextView)viewGroup.findViewById(2131362838)).setText((CharSequence)string);
        ((TextView)viewGroup.findViewById(2131362003)).setVisibility(8);
        string = (LinearLayout)viewGroup.findViewById(2131362308);
        Object object2 = h8.C();
        if (object2 != null && object2.size() > 0) {
            ax.U2.f f8 = object2.get(0);
            string.addView(this.E5((LayoutInflater)object, (ViewGroup)string, h8, f8.r(), f8.s()));
        }
        if (object2 != null && object2.size() > 1 && ((ax.U2.f)(object2 = object2.get(1))).s() > 0L) {
            string.addView(this.E5((LayoutInflater)object, (ViewGroup)string, h8, ((ax.U2.f)object2).r(), ((ax.U2.f)object2).s()));
        }
        object = new ax.g3.c(this){
            final b c;
            {
                this.c = b8;
            }

            @Override
            public void a(View object) {
                object = Bookmark.m((Context)this.c.f0(), f.q1, 0);
                ((MainActivity)this.c.f0()).d2(this.c.A3(), true, (Bookmark)object, "analysis");
            }
        };
        viewGroup.findViewById(2131362565).setOnClickListener((View.OnClickListener)object);
        viewGroup.setOnClickListener((View.OnClickListener)object);
        return viewGroup;
    }

    View G5(LayoutInflater layoutInflater, ViewGroup object, ax.T2.h h8) {
        if ((layoutInflater = this.Y4(layoutInflater, (ViewGroup)object, h8, 2131951920, null, h8.J(), h8.G(), 2, false)) != null) {
            object = new ax.g3.c(this){
                final b c;
                {
                    this.c = b8;
                }

                @Override
                public void a(View object) {
                    object = Bookmark.m((Context)this.c.f0(), f.n1, this.c.U5());
                    ((MainActivity)this.c.f0()).d2(this.c.A3(), true, (Bookmark)object, "analysis");
                }
            };
            layoutInflater.findViewById(2131362565).setOnClickListener((View.OnClickListener)object);
            layoutInflater.setOnClickListener((View.OnClickListener)object);
            object = (Button)layoutInflater.findViewById(2131362039);
            object.setVisibility(0);
            object.setText(2131952248);
            object.setOnClickListener((View.OnClickListener)new ax.g3.c(this, 400L, h8){
                final ax.T2.h c;
                final b d;
                {
                    this.d = b8;
                    this.c = h8;
                    super(l8);
                }

                @Override
                public void a(View object) {
                    object = this.d;
                    if (((n)object).Z2(((b)object).T5(), null)) {
                        return;
                    }
                    this.d.Q5(this.c);
                }
            });
        }
        return layoutInflater;
    }

    @Override
    public void H1() {
        super.H1();
        StorageCheckReceiver.a(this.b(), this.T5());
    }

    View H5(LayoutInflater object, ViewGroup viewGroup, ax.T2.h h8) {
        if ((viewGroup = this.Y4((LayoutInflater)object, viewGroup, h8, 2131951921, null, h8.M(), h8.K(), 2, false)) != null) {
            object = new ax.g3.c(this){
                final b c;
                {
                    this.c = b8;
                }

                @Override
                public void a(View object) {
                    object = Bookmark.m((Context)this.c.f0(), f.m1, this.c.U5());
                    ((MainActivity)this.c.f0()).d2(this.c.A3(), true, (Bookmark)object, "analysis");
                }
            };
            viewGroup.findViewById(2131362565).setOnClickListener((View.OnClickListener)object);
            viewGroup.setOnClickListener((View.OnClickListener)object);
        }
        return viewGroup;
    }

    View I5(LayoutInflater object, ViewGroup viewGroup, ax.T2.h h8) {
        long l8 = h8.O();
        Object object2 = h8.N();
        if (l8 != 0L && object2 != null) {
            viewGroup = object.inflate(2131558459, viewGroup, false);
            ((TextView)viewGroup.findViewById(2131362963)).setText(2131951670);
            String string = this.b5(l8);
            ((TextView)viewGroup.findViewById(2131362838)).setText((CharSequence)string);
            ((TextView)viewGroup.findViewById(2131362003)).setText(2131951671);
            string = (LinearLayout)viewGroup.findViewById(2131362308);
            if (object2.size() > 0) {
                h.h h9 = object2.get(0);
                string.addView(this.D5((LayoutInflater)object, (ViewGroup)string, h8, h9.a(), h9.b()));
            }
            if (object2.size() > 1 && ((h.h)(object2 = object2.get(1))).b() > 0L) {
                string.addView(this.D5((LayoutInflater)object, (ViewGroup)string, h8, ((h.h)object2).a(), ((h.h)object2).b()));
            }
            object = (Button)viewGroup.findViewById(2131362039);
            object.setVisibility(0);
            object.setText(2131952248);
            object.setOnClickListener((View.OnClickListener)new ax.g3.c(this, 400L, h8){
                final ax.T2.h c;
                final b d;
                {
                    this.d = b8;
                    this.c = h8;
                    super(l8);
                }

                @Override
                public void a(View object) {
                    block5: {
                        block4: {
                            object = this.d;
                            if (((n)object).Z2(((b)object).T5(), null)) break block4;
                            if (!Q.z0() || !o.c()) break block5;
                            try {
                                object = new Intent("android.os.storage.action.CLEAR_APP_CACHE");
                                u.r0(this.d, (Intent)object, 38001);
                                return;
                            }
                            catch (ActivityNotFoundException activityNotFoundException) {
                                this.d.E4(2131951927, 1);
                            }
                        }
                        return;
                    }
                    this.d.P5(this.c);
                }
            });
            object = new ax.g3.c(this){
                final b c;
                {
                    this.c = b8;
                }

                @Override
                public void a(View object) {
                    object = Bookmark.m((Context)this.c.f0(), f.l1, this.c.U5());
                    ((MainActivity)this.c.f0()).d2(this.c.A3(), true, (Bookmark)object, "analysis");
                }
            };
            viewGroup.findViewById(2131362565).setOnClickListener((View.OnClickListener)object);
            viewGroup.setOnClickListener((View.OnClickListener)object);
            return viewGroup;
        }
        return null;
    }

    View J5(LayoutInflater layoutInflater, ViewGroup object, ax.T2.h h8) {
        if ((layoutInflater = this.Y4(layoutInflater, (ViewGroup)object, h8, 2131952139, this.N0(2131952140, this.c5(0xA00000L)), h8.W(), h8.V(), 2, false)) != null) {
            object = new ax.g3.c(this){
                final b c;
                {
                    this.c = b8;
                }

                @Override
                public void a(View object) {
                    object = Bookmark.m((Context)this.c.f0(), f.j1, this.c.U5());
                    ((MainActivity)this.c.f0()).d2(this.c.A3(), true, (Bookmark)object, "analysis");
                }
            };
            layoutInflater.findViewById(2131362565).setOnClickListener((View.OnClickListener)object);
            layoutInflater.setOnClickListener((View.OnClickListener)object);
        }
        return layoutInflater;
    }

    View K5(LayoutInflater layoutInflater, ViewGroup object, ax.T2.h h8) {
        if ((layoutInflater = this.Y4(layoutInflater, (ViewGroup)object, h8, 2131952529, null, h8.c0(), h8.Z(), 2, false)) != null) {
            object = (Button)layoutInflater.findViewById(2131362039);
            object.setVisibility(0);
            object.setText(2131952260);
            object.setOnClickListener((View.OnClickListener)new ax.g3.c(this, 400L){
                final b c;
                {
                    this.c = b8;
                    super(l8);
                }

                @Override
                public void a(View object) {
                    object = this.c;
                    if (((n)object).Z2(((b)object).T5(), null)) {
                        return;
                    }
                    this.c.S5();
                }
            });
            object = new ax.g3.c(this){
                final b c;
                {
                    this.c = b8;
                }

                @Override
                public void a(View object) {
                    object = Bookmark.m((Context)this.c.f0(), f.o1, this.c.U5());
                    ((MainActivity)this.c.f0()).d2(this.c.A3(), true, (Bookmark)object, "analysis");
                }
            };
            layoutInflater.findViewById(2131362565).setOnClickListener((View.OnClickListener)object);
            layoutInflater.setOnClickListener((View.OnClickListener)object);
        }
        return layoutInflater;
    }

    @Override
    public void L1(View view, Bundle bundle) {
        super.L1(view, bundle);
        this.d6();
        if (this.Z5()) {
            this.B5();
            return;
        }
        this.A5();
    }

    View L5(LayoutInflater layoutInflater, ViewGroup object, ax.T2.h h8) {
        ax.U2.f f8;
        if (this.W0 + 600000L > System.currentTimeMillis()) {
            return null;
        }
        if (h8.X() != K.e) {
            return null;
        }
        long l8 = Q.V0() && o.d((Context)this.f0()) ? h8.j0() : 0L;
        View view = layoutInflater.inflate(2131558459, object, false);
        ((TextView)view.findViewById(2131362963)).setText(2131951670);
        object = l8 > 0L ? this.b5(l8) : "";
        ((TextView)view.findViewById(2131362838)).setText((CharSequence)object);
        ((TextView)view.findViewById(2131362003)).setText(2131951671);
        Object object2 = h8.P();
        object = (LinearLayout)view.findViewById(2131362308);
        if (object2 != null && object2.size() > 0 && (f8 = object2.get(0)).e() > 0L) {
            object.addView(this.E5(layoutInflater, (ViewGroup)object, h8, f8.r(), f8.e()));
        }
        if (object2 != null && object2.size() > 1 && ((ax.U2.f)(object2 = object2.get(1))).e() > 0L) {
            object.addView(this.E5(layoutInflater, (ViewGroup)object, h8, ((ax.U2.f)object2).r(), ((ax.U2.f)object2).e()));
        }
        layoutInflater = (Button)view.findViewById(2131362039);
        layoutInflater.setVisibility(0);
        layoutInflater.setText(2131952248);
        layoutInflater.setOnClickListener((View.OnClickListener)new ax.g3.c(this, 400L){
            final b c;
            {
                this.c = b8;
                super(l8);
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void a(View object) {
                Exception exception2;
                block4: {
                    if (this.c.f0() == null) {
                        return;
                    }
                    try {
                        if (o.c()) {
                            object = new Intent("android.os.storage.action.CLEAR_APP_CACHE");
                            u.r0(this.c, (Intent)object, 38001);
                            return;
                        }
                    }
                    catch (Exception exception2) {
                        break block4;
                    }
                    object = ax.a3.n.k3(2131952653, 2131952544, 17039370, 0x1040000);
                    n.c c8 = new n.c(this){
                        final a a;
                        {
                            this.a = a8;
                        }

                        @Override
                        public void G(ax.a3.n n8) {
                        }

                        @Override
                        public void P(ax.a3.n n8) {
                            if (this.a.c.f0() != null) {
                                n8 = o.a((Context)this.a.c.f0());
                                try {
                                    u.r0(this.a.c, (Intent)n8, 38003);
                                    return;
                                }
                                catch (ActivityNotFoundException activityNotFoundException) {
                                    ax.Ha.c.h().f().b("no all files access activity 2").h();
                                    this.a.c.E4(2131951927, 1);
                                }
                            }
                        }

                        @Override
                        public void Z(ax.a3.n n8) {
                        }
                    };
                    ((ax.a3.n)object).n3(c8);
                    ax.u3.B.d0(this.c.A0(), (androidx.fragment.app.e)object, "allfilesconfirm", true);
                    return;
                }
                exception2.printStackTrace();
                this.c.E4(2131951927, 1);
            }
        });
        view.findViewById(2131362565).setVisibility(8);
        return view;
    }

    View M5(LayoutInflater layoutInflater, ViewGroup object, ax.T2.h h8) {
        long l8;
        long l9;
        K k8 = h8.X();
        int n8 = 0;
        layoutInflater = layoutInflater.inflate(2131558454, object, false);
        ((TextView)layoutInflater.findViewById(2131362963)).setText((CharSequence)k8.f(this.o3()));
        object = h8.f0();
        if (object == null) {
            l9 = 0L;
            l8 = 0L;
        } else {
            l9 = object.b;
            l8 = object.a;
        }
        if (l9 != 0L) {
            n8 = (int)(1000L * l8 / l9);
        }
        String string = ax.u3.B.P((float)((double)l8 * 100.0 / (double)l9));
        object = B.l(this.o3(), l9 - l8, B.a.q);
        ((TextView)layoutInflater.findViewById(2131362838)).setText((CharSequence)object);
        ((ProgressBar)layoutInflater.findViewById(2131363020)).setMax(1000);
        ((ProgressBar)layoutInflater.findViewById(2131363020)).setProgress(n8);
        ((TextView)layoutInflater.findViewById(2131363019)).setText((CharSequence)string);
        ((TextView)layoutInflater.findViewById(2131362837)).setText((CharSequence)this.c5(h8.Q(z.f0)));
        ((TextView)layoutInflater.findViewById(2131362840)).setText((CharSequence)this.c5(h8.Q(z.c0)));
        ((TextView)layoutInflater.findViewById(2131362842)).setText((CharSequence)this.c5(h8.Q(z.e0)));
        ((TextView)layoutInflater.findViewById(2131362836)).setText((CharSequence)this.c5(h8.Q(z.v0)));
        ((TextView)layoutInflater.findViewById(2131362832)).setText((CharSequence)this.c5(h8.Q(z.r0)));
        ((TextView)layoutInflater.findViewById(2131362841)).setText((CharSequence)this.c5(h8.Q(z.u0)));
        object = new ax.g3.c(this, k8){
            final K c;
            final b d;
            {
                this.d = b8;
                this.c = k8;
            }

            @Override
            public void a(View object) {
                object = Bookmark.n((Context)this.d.f0(), this.c);
                ((MainActivity)this.d.f0()).d2(this.d.A3(), true, (Bookmark)object, "analysis");
            }
        };
        layoutInflater.findViewById(2131362565).setOnClickListener((View.OnClickListener)object);
        layoutInflater.setOnClickListener((View.OnClickListener)object);
        return layoutInflater;
    }

    View N5(LayoutInflater object, ViewGroup viewGroup, ax.T2.h h8) {
        ax.U2.f f8;
        if (!h8.o0()) {
            return null;
        }
        viewGroup = object.inflate(2131558459, viewGroup, false);
        ((TextView)viewGroup.findViewById(2131362963)).setText(2131952190);
        String string = this.b5(h8.i0());
        ((TextView)viewGroup.findViewById(2131362838)).setText((CharSequence)string);
        ((TextView)viewGroup.findViewById(2131362003)).setVisibility(8);
        string = (LinearLayout)viewGroup.findViewById(2131362308);
        List<ax.U2.f> list = h8.h0();
        if (list != null && list.size() > 0) {
            f8 = list.get(0);
            string.addView(this.E5((LayoutInflater)object, (ViewGroup)string, h8, f8.r(), f8.s()));
        }
        if (list != null && list.size() > 1 && (f8 = list.get(1)).s() > 0L) {
            string.addView(this.E5((LayoutInflater)object, (ViewGroup)string, h8, f8.r(), f8.s()));
        }
        object = new ax.g3.c(this){
            final b c;
            {
                this.c = b8;
            }

            @Override
            public void a(View object) {
                object = Bookmark.m((Context)this.c.f0(), f.r1, 0);
                ((MainActivity)this.c.f0()).d2(this.c.A3(), true, (Bookmark)object, "analysis");
            }
        };
        viewGroup.findViewById(2131362565).setOnClickListener((View.OnClickListener)object);
        viewGroup.setOnClickListener((View.OnClickListener)object);
        return viewGroup;
    }

    View O5(LayoutInflater layoutInflater, ViewGroup viewGroup, int n8) {
        layoutInflater = layoutInflater.inflate(2131558462, viewGroup, false);
        ((TextView)layoutInflater.findViewById(2131362963)).setText(n8);
        ((TextView)layoutInflater.findViewById(2131362003)).setText(2131952547);
        viewGroup = (Button)layoutInflater.findViewById(2131361983);
        viewGroup.setText(2131952496);
        viewGroup.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final b c;
            {
                this.c = b8;
            }

            @Override
            public void a(View view) {
                if (this.c.f0() == null) {
                    return;
                }
                this.c.a6();
            }
        });
        return layoutInflater;
    }

    @Override
    protected void U4() {
        ax.T2.h h8 = this.e5();
        if (!h8.m0() || this.f0() == null) {
            return;
        }
        int n8 = this.V5();
        LinearLayout linearLayout = this.f5();
        linearLayout.removeAllViews();
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.f0());
        this.E0.setVisibility(8);
        this.V4();
        if (n8 != 0 && n8 != -1) {
            if (n8 == 1) {
                this.S4(this.K5(layoutInflater, (ViewGroup)linearLayout, h8));
                if (Q.z0() && !h8.l0()) {
                    this.S4(this.L5(layoutInflater, (ViewGroup)linearLayout, h8));
                } else {
                    this.S4(this.I5(layoutInflater, (ViewGroup)linearLayout, h8));
                }
                this.S4(this.G5(layoutInflater, (ViewGroup)linearLayout, h8));
                if (Q.J1() && h8.X() == K.e && this.f0() != null) {
                    if (!o.d((Context)this.f0())) {
                        if (ax.u3.B.K((Context)this.f0(), o.b())) {
                            this.S4(this.O5(layoutInflater, (ViewGroup)linearLayout, 2131952190));
                        }
                    } else {
                        this.S4(this.N5(layoutInflater, (ViewGroup)linearLayout, h8));
                    }
                }
                this.S4(this.H5(layoutInflater, (ViewGroup)linearLayout, h8));
                if (this.O0 == 0) {
                    this.E0.setVisibility(0);
                }
            }
        } else {
            View view = this.M5(layoutInflater, (ViewGroup)linearLayout, h8);
            view.requestFocus();
            this.S4(view);
            if (this.Q0 != null && ax.t3.a.g()) {
                this.S4((View)this.Q0);
            }
            if (Q.J1() && h8.X() == K.e && this.f0() != null) {
                if (!o.d((Context)this.f0())) {
                    if (ax.u3.B.K((Context)this.f0(), o.b())) {
                        this.S4(this.O5(layoutInflater, (ViewGroup)linearLayout, 2131952147));
                    }
                } else {
                    this.S4(this.F5(layoutInflater, (ViewGroup)linearLayout, h8));
                }
            }
            this.S4(this.J5(layoutInflater, (ViewGroup)linearLayout, h8));
            if (n8 == -1) {
                this.S4(this.K5(layoutInflater, (ViewGroup)linearLayout, h8));
                if (Q.z0() && !h8.l0()) {
                    this.S4(this.L5(layoutInflater, (ViewGroup)linearLayout, h8));
                } else {
                    this.S4(this.I5(layoutInflater, (ViewGroup)linearLayout, h8));
                }
                this.S4(this.G5(layoutInflater, (ViewGroup)linearLayout, h8));
                this.S4(this.H5(layoutInflater, (ViewGroup)linearLayout, h8));
            }
        }
        this.S4(layoutInflater.inflate(2131558460, (ViewGroup)linearLayout, false));
    }

    @Override
    protected boolean W2() {
        return false;
    }

    public void W5() {
        ViewPager viewPager = this.H0;
        if (viewPager != null && viewPager.getAdapter().e() == 2) {
            this.H0.setCurrentItem(1);
            this.c6(1);
            return;
        }
        this.c6(1);
    }

    @Override
    protected ax.T2.h e5() {
        return this.T0;
    }

    @Override
    protected int h5() {
        this.Z5();
        return 2;
    }

    @Override
    public void i1(int n8, int n9, Intent object) {
        m m8 = this.X0;
        if (m8 != null) {
            m8.d(n8, n9, (Intent)object);
        }
        if (n8 == 38001) {
            if (n9 == -1) {
                this.W0 = System.currentTimeMillis();
                object = this.e5();
                if (object != null) {
                    ((ax.T2.h)object).o();
                }
                this.R5();
            }
            return;
        }
        if (n8 == 38003) {
            if (Q.z0() && o.c()) {
                u.r0(this, new Intent("android.os.storage.action.CLEAR_APP_CACHE"), 38001);
            }
        } else if (n8 == 38004 && this.b() != null && o.d(this.b())) {
            this.c4(false);
        }
        super.i1(n8, n9, (Intent)object);
    }

    @Override
    protected boolean i5() {
        ax.T2.h h8 = this.T0;
        return h8 != null && h8.m0();
    }

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        this.Y5();
        this.V0 = ax.t3.c.n().c();
    }

    @Override
    protected ax.K0.a<Boolean> k5() {
        return new x((Context)this.f0(), this.T5(), new h.g(this){
            final b a;
            {
                this.a = b8;
            }

            @Override
            public void a() {
            }

            @Override
            public void b() {
                if (!this.a.X0()) {
                    return;
                }
                this.a.W4();
            }

            @Override
            public void c(String string, boolean bl) {
                if (!this.a.X0()) {
                    return;
                }
                this.a.p5(string, bl);
            }

            @Override
            public void d(int n8) {
                if (!this.a.X0()) {
                    return;
                }
                this.a.n5(n8);
            }
        }, new c(this){
            final b a;
            {
                this.a = b8;
            }

            @Override
            public boolean isCancelled() {
                return this.a.Z0;
            }
        });
    }

    @Override
    public void q1(Menu menu, MenuInflater menuInflater) {
        this.G3(menuInflater, menu, 2131689500);
    }

    @Override
    public void s1() {
        View view = this.P0;
        if (view != null) {
            ax.S2.b.a(view, this.b());
            this.Q0.removeView(this.P0);
            this.P0 = null;
        }
        this.Z0 = true;
        super.s1();
    }

    @Override
    public void v1() {
        super.v1();
        Iterator<ax.T2.h> iterator = this.U0.iterator();
        while (iterator.hasNext()) {
            iterator.next().G0();
        }
    }

    @Override
    public f z3() {
        return f.i1;
    }

    public static class x
    extends ax.K0.a<Boolean> {
        K o;
        h.g p;
        c q;

        public x(Context context, K k8, h.g g8, c c8) {
            super(context);
            this.o = k8;
            this.p = g8;
            this.q = c8;
        }

        public Boolean L() {
            if (this.j() == null) {
                return null;
            }
            if (!ax.T2.h.S(this.o).m0()) {
                try {
                    Object object = ax.T2.h.S(this.o);
                    if (((ax.T2.h)object).w0()) {
                        ((ax.T2.h)object).A0(this.p);
                    } else {
                        ((ax.T2.h)object).f(true, this.p, this.q);
                    }
                    object = Boolean.TRUE;
                    return object;
                }
                catch (ax.b3.a a8) {
                    return Boolean.FALSE;
                }
                catch (ax.b3.j j8) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }

        @Override
        protected void t() {
            this.a();
        }
    }
}

