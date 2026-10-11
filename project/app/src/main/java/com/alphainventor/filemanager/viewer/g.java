/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.viewer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.P0.H;
import ax.P0.P;
import ax.P0.Q;
import ax.P0.T;
import ax.P0.V;
import ax.P0.v;
import ax.S0.a;
import ax.S0.d0;
import ax.r7.z;
import ax.w3.i;
import ax.w3.j;
import ax.w3.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class g {
    private final PopupWindow a;
    private final RecyclerView b;
    private final Context c;
    private final c d;
    private final e e;
    private final b f;
    private final ax.a2.f g;
    private final int h;
    private boolean i;
    private h j;

    g(Context object, c c8) {
        this.c = object;
        this.d = c8;
        this.h = object.getResources().getDimensionPixelSize(2131165382);
        this.e = new e(this, (Context)object, c8);
        this.f = new b(this, (Context)object, c8);
        this.g = new ax.a2.f(object.getResources());
        object = (RecyclerView)LayoutInflater.from((Context)this.g()).inflate(2131558531, null);
        this.b = object;
        ((RecyclerView)object).setLayoutManager(new LinearLayoutManager(this.g()));
        object = new PopupWindow((View)object, -2, -2, true);
        this.a = object;
        if (d0.a < 23) {
            object.setBackgroundDrawable((Drawable)new ColorDrawable(0));
        }
        object.setOnDismissListener(new PopupWindow.OnDismissListener(this){
            final g a;
            {
                this.a = g8;
            }

            public void onDismiss() {
            }
        });
    }

    private void e(RecyclerView.h<?> h8, View view) {
        this.b.setAdapter(h8);
        this.p();
        this.i = false;
        this.a.dismiss();
        this.i = true;
        int n8 = -this.a.getHeight();
        int n9 = this.h;
        int n10 = view.getHeight();
        this.a.showAsDropDown(view, 0, n8 - n9 - n10);
    }

    private z<f> f(V v8, int n8) {
        z.a<f> a8 = new z.a<f>();
        z<V.a> z8 = v8.a();
        for (int i8 = 0; i8 < z8.size(); ++i8) {
            V.a a9 = (V.a)z8.get(i8);
            if (a9.d() != n8) continue;
            for (int i9 = 0; i9 < a9.a; ++i9) {
                if (!a9.j(i9)) continue;
                v v9 = a9.b(i9);
                if ((v9.e & 2) != 0) continue;
                a8.h(new f(v8, i8, i9, this.g.a(v9)));
            }
        }
        return a8.k();
    }

    private Context g() {
        return this.c;
    }

    private void j() {
        Object object = this.h();
        if (object == null) {
            ax.u3.b.g("player is null when init trackselectionadapter");
        }
        this.e.O();
        this.f.O();
        if (object != null && object.c0(30) && object.c0(29)) {
            object = object.X();
            this.f.W(this.f((V)object, 1));
            this.e.V(this.f((V)object, 3));
        }
    }

    private void m(H h8, f f8) {
        if (!h8.c0(29)) {
            return;
        }
        h8.w(h8.k0().I().N(new Q(f8.a.a(), z.A(f8.b))).U(f8.a.d(), false).F());
    }

    private void p() {
        androidx.media3.ui.d d8 = this.i();
        this.b.measure(0, 0);
        int n8 = d8.getWidth();
        int n9 = this.h;
        n8 = Math.min(this.b.getMeasuredWidth(), n8 - n9 * 2);
        this.a.setWidth(n8);
        n8 = Math.min(d8.getHeight() - this.h * 2, this.b.getMeasuredHeight());
        this.a.setHeight(n8);
    }

    public void d() {
        this.i = false;
        this.a.dismiss();
        this.i = true;
    }

    protected H h() {
        return this.d.h();
    }

    protected androidx.media3.ui.d i() {
        return this.d.k();
    }

    public void k() {
        H h8 = this.h();
        if (h8 == null) {
            return;
        }
        z<f> z8 = this.f(h8.X(), 3);
        if (z8.size() == 0) {
            ax.u3.b.g("no subtitle track");
            return;
        }
        if (z8.size() != 1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("subtitle count : ");
            stringBuilder.append(z8.size());
            ax.u3.b.g(stringBuilder.toString());
        }
        this.m(h8, (f)z8.get(0));
    }

    public void l() {
        H h8 = this.h();
        if (h8 != null && h8.c0(29)) {
            h8.w(h8.k0().I().G(3).M(-3).U(3, true).F());
        }
    }

    public void n(View view) {
        this.e(this.f, view);
    }

    public void o(View view, h h8) {
        this.e(this.e, view);
        this.j = h8;
    }

    public void q() {
        this.j();
    }

    public final class b
    extends g {
        final g h;

        public b(g g8, Context context, c c8) {
            this.h = g8;
            super(g8, context, c8);
        }

        public static /* synthetic */ void U(b b8, H h8, View object) {
            b8.getClass();
            if (h8 != null && h8.c0(29)) {
                object = h8.k0();
                d0.i(h8).w(((T)object).I().G(1).U(1, false).F());
                b8.h.a.dismiss();
            }
        }

        private boolean V(T t8) {
            for (int i8 = 0; i8 < this.d.size(); ++i8) {
                P p8 = this.d.get((int)i8).a.a();
                if (!t8.D.containsKey(p8)) continue;
                return true;
            }
            return false;
        }

        @Override
        public void R(d d8) {
            d8.u.setText(2131952015);
            H h8 = this.h.h();
            if (h8 == null) {
                return;
            }
            boolean bl = this.V(ax.S0.a.e(h8).k0());
            View view = d8.v;
            int n8 = bl ? 4 : 0;
            view.setVisibility(n8);
            d8.a.setOnClickListener((View.OnClickListener)new i(this, h8));
        }

        @Override
        public void T(String string) {
        }

        public void W(List<f> list) {
            this.d = list;
        }
    }

    public static interface c {
        public H h();

        public androidx.media3.ui.d k();
    }

    public static class d
    extends RecyclerView.F {
        public final TextView u;
        public final View v;

        public d(View view) {
            super(view);
            if (d0.a < 26) {
                view.setFocusable(true);
            }
            this.u = (TextView)view.findViewById(2131362246);
            this.v = view.findViewById(2131362207);
        }
    }

    public final class e
    extends g {
        final g h;

        public e(g g8, Context context, c c8) {
            this.h = g8;
            super(g8, context, c8);
        }

        public static /* synthetic */ void U(e e8, View view) {
            e8.h.l();
            if (e8.h.j != null) {
                e8.h.j.a(false);
            }
            e8.h.a.dismiss();
        }

        @Override
        public void Q(d d8, int n8) {
            super.Q(d8, n8);
            if (n8 > 0) {
                f f8 = this.d.get(n8 - 1);
                d8 = d8.v;
                n8 = f8.a() ? 0 : 4;
                d8.setVisibility(n8);
            }
        }

        @Override
        public void R(d d8) {
            int n8;
            int n9;
            block1: {
                d8.u.setText(2131952016);
                n9 = 0;
                for (n8 = 0; n8 < this.d.size(); ++n8) {
                    if (!this.d.get(n8).a()) continue;
                    n8 = 0;
                    break block1;
                }
                n8 = 1;
            }
            View view = d8.v;
            n8 = n8 != 0 ? n9 : 4;
            view.setVisibility(n8);
            d8.a.setOnClickListener((View.OnClickListener)new j(this));
        }

        @Override
        public void T(String string) {
            if (this.h.j != null) {
                this.h.j.a(true);
            }
        }

        public void V(List<f> list) {
            this.d = list;
        }
    }

    public static final class f {
        public final V.a a;
        public final int b;
        public final String c;

        public f(V v8, int n8, int n9, String string) {
            this.a = (V.a)v8.a().get(n8);
            this.b = n9;
            this.c = string;
        }

        public boolean a() {
            return this.a.i(this.b);
        }
    }

    public abstract class g
    extends RecyclerView.h<d> {
        protected List<f> d;
        protected Context e;
        protected c f;
        final g g;

        protected g(g g8, Context context, c c8) {
            this.g = g8;
            this.d = new ArrayList<f>();
            this.e = context;
            this.f = c8;
        }

        public static /* synthetic */ void N(g g8, H h8, f f8, View view) {
            g8.g.m(h8, f8);
            g8.T(f8.c);
            g8.g.a.dismiss();
        }

        protected void O() {
            this.d = Collections.EMPTY_LIST;
        }

        protected Context P() {
            return this.e;
        }

        public void Q(d d8, int n8) {
            H h8 = this.g.h();
            if (h8 == null) {
                return;
            }
            if (n8 == 0) {
                this.R(d8);
                return;
            }
            Object object = this.d;
            int n9 = 1;
            object = object.get(n8 - 1);
            Object object2 = ((f)object).a.a();
            object2 = h8.k0().D.get(object2);
            int n10 = 0;
            n8 = object2 != null && ((f)object).a() ? n9 : 0;
            d8.u.setText((CharSequence)((f)object).c);
            object2 = d8.v;
            n8 = n8 != 0 ? n10 : 4;
            object2.setVisibility(n8);
            d8.a.setOnClickListener((View.OnClickListener)new k(this, h8, (f)object));
        }

        protected abstract void R(d var1);

        public d S(ViewGroup viewGroup, int n8) {
            return new d(LayoutInflater.from((Context)this.P()).inflate(2131558533, viewGroup, false));
        }

        protected abstract void T(String var1);

        @Override
        public int l() {
            if (this.d.isEmpty()) {
                return 0;
            }
            return this.d.size() + 1;
        }
    }

    public static interface h {
        public void a(boolean var1);
    }
}

