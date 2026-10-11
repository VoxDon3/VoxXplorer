/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ax.Z2.s;
import ax.g3.c;
import ax.i2.I;
import ax.s3.b;
import ax.t3.k;
import ax.x3.F;
import ax.x3.t;
import ax.x3.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H
extends RecyclerView.h<a>
implements t.a {
    private Context d;
    private List<s> e;
    private List<s> f;
    private List<s> g;
    private boolean h;
    private y i;
    private boolean j;
    private I<Long> k;
    private boolean l;
    private AdapterView.OnItemClickListener m;
    private AdapterView.OnItemLongClickListener n;
    private boolean o;
    private F p;

    public H(Context context, y y8, boolean bl) {
        this.d = context;
        this.i = y8;
        this.e = new ArrayList<s>();
        this.j = bl;
        this.K(true);
    }

    public s U(int n8) {
        return this.e.get(n8);
    }

    public int V(long l8) {
        for (int i8 = 0; i8 < this.e.size(); ++i8) {
            if (this.e.get(i8).h() != l8) continue;
            return i8;
        }
        return -1;
    }

    public List<s> W() {
        return this.g;
    }

    public int X() {
        return this.e.size();
    }

    public List<s> Y() {
        return this.e;
    }

    public boolean Z() {
        return this.h;
    }

    public void a0(a a8, int n8) {
        a8.R();
        s s8 = this.e.get(n8);
        I<Long> i8 = this.k;
        if (i8 != null) {
            if (i8.m(s8.h())) {
                a8.a.setActivated(true);
            } else {
                a8.a.setActivated(false);
            }
        }
        a8.v.setImageResource(b.k(s8.e().d(), null));
        a8.w.setText((CharSequence)s8.f());
        a8.x.setText((CharSequence)s8.b());
        if (this.o) {
            a8.z.setVisibility(0);
            return;
        }
        a8.z.setVisibility(8);
    }

    @Override
    public void b(RecyclerView.F f8) {
        f8.a.setBackgroundResource(2131099673);
    }

    public a b0(ViewGroup viewGroup, int n8) {
        return new a(this, LayoutInflater.from((Context)viewGroup.getContext()).inflate(2131558694, viewGroup, false));
    }

    @Override
    public void c(int n8, int n9) {
        this.h = true;
        if (n8 < n9) {
            int n10 = n8;
            while (n10 < n9) {
                List<s> list = this.e;
                int n11 = n10 + 1;
                Collections.swap(list, n10, n11);
                n10 = n11;
            }
        } else {
            for (int i8 = n8; i8 > n9; --i8) {
                Collections.swap(this.e, i8, i8 - 1);
            }
        }
        this.v(n8, n9);
    }

    public void c0(boolean bl) {
        if (bl) {
            this.f = new ArrayList<s>(this.e);
            this.g = new ArrayList<s>();
        }
        this.o = bl;
        this.r();
    }

    public void d0(List<s> list) {
        this.e = list;
        this.h = false;
        list = this.g;
        if (list != null) {
            list.clear();
        }
        this.r();
    }

    @Override
    public void e(RecyclerView.F f8) {
        f8.a.setBackgroundColor(0);
    }

    public void e0(AdapterView.OnItemClickListener onItemClickListener) {
        this.m = onItemClickListener;
    }

    public void f0(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.n = onItemLongClickListener;
    }

    @Override
    public void g(RecyclerView.F object) {
        this.h = true;
        int n8 = ((RecyclerView.F)object).k();
        if (n8 < 0) {
            return;
        }
        object = this.e.remove(n8);
        this.g.add((s)object);
        this.z(n8);
    }

    public void g0(RecyclerView recyclerView, boolean bl) {
        this.l = bl;
        for (int i8 = 0; i8 < recyclerView.getChildCount(); ++i8) {
            RecyclerView.F f8 = recyclerView.m0(recyclerView.getChildAt(i8));
            if (!(f8 instanceof a)) continue;
            ((a)f8).R();
        }
    }

    public void h0(F f8) {
        this.p = f8;
    }

    public void i0(I<Long> i8) {
        this.k = i8;
    }

    @Override
    public int l() {
        return this.e.size();
    }

    @Override
    public long m(int n8) {
        if (n8 == -1) {
            return -1L;
        }
        return this.e.get(n8).h();
    }

    public class a
    extends RecyclerView.F {
        final H A;
        private View u;
        private ImageView v;
        private TextView w;
        private TextView x;
        private View y;
        private View z;

        a(H h8, View view) {
            View view2;
            this.A = h8;
            super(view);
            this.v = (ImageView)view.findViewById(2131362383);
            this.w = (TextView)view.findViewById(2131362593);
            this.x = (TextView)view.findViewById(2131362109);
            this.y = view.findViewById(2131362028);
            this.z = view2 = view.findViewById(2131362157);
            view2.setOnTouchListener(new View.OnTouchListener(){
                final H a;
                final a b;
                {
                    this.b = a8;
                    this.a = h8;
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0 && this.b.A.p != null) {
                        this.b.A.p.a(this.b);
                    }
                    return false;
                }
            });
            this.u = view = view.findViewById(2131361913);
            view.setOnClickListener((View.OnClickListener)new c(this, h8){
                final H c;
                final a d;
                {
                    this.d = a8;
                    this.c = h8;
                }

                @Override
                public void a(View view) {
                    int n8;
                    if (this.d.A.l) {
                        if (this.d.A.i != null) {
                            this.d.A.i.a(this.d.l());
                            return;
                        }
                    } else if (this.d.A.m != null && (n8 = this.d.k()) >= 0) {
                        this.d.A.m.onItemClick(null, view, n8, this.d.l());
                    }
                }
            });
            this.u.setOnLongClickListener(new View.OnLongClickListener(){
                final H a;
                final a b;
                {
                    this.b = a8;
                    this.a = h8;
                }

                public boolean onLongClick(View view) {
                    if (this.b.A.l) {
                        return false;
                    }
                    if (this.b.A.n != null) {
                        int n8 = this.b.k();
                        if (n8 < 0) {
                            return false;
                        }
                        this.b.A.n.onItemLongClick(null, view, n8, this.b.l());
                        return true;
                    }
                    return false;
                }
            });
            if (h8.i != null) {
                if (h8.j && (view = this.y) != null) {
                    view.setVisibility(0);
                    this.y.setOnClickListener(new View.OnClickListener(){
                        final H a;
                        final a b;
                        {
                            this.b = a8;
                            this.a = h8;
                        }

                        public void onClick(View view) {
                            this.b.A.i.a(this.b.l());
                        }
                    });
                }
                if (ax.t3.k.J()) {
                    this.v.setContentDescription((CharSequence)h8.d.getString(2131952299));
                    this.v.setOnClickListener(new View.OnClickListener(){
                        final H a;
                        final a b;
                        {
                            this.b = a8;
                            this.a = h8;
                        }

                        public void onClick(View view) {
                            this.b.A.i.a(this.b.l());
                        }
                    });
                }
            }
        }

        void R() {
        }
    }
}

