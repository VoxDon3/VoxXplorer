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
import ax.i2.AbstractC2244I;
import ax.x3.t;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: ax.x3.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3412H extends RecyclerView.h<a> implements t.a {
    private Context d;
    private List<ax.Z2.s> e = new ArrayList();
    private List<ax.Z2.s> f;
    private List<ax.Z2.s> g;
    private boolean h;
    private y i;
    private boolean j;
    private AbstractC2244I<Long> k;
    private boolean l;
    private AdapterView.OnItemClickListener m;
    private AdapterView.OnItemLongClickListener n;
    private boolean o;
    private InterfaceC3410F p;

    public C3412H(Context context, y yVar, boolean z) {
        this.d = context;
        this.i = yVar;
        this.j = z;
        K(true);
    }

    public ax.Z2.s U(int i) {
        return this.e.get(i);
    }

    public int V(long j) {
        for (int i = 0; i < this.e.size(); i++) {
            if (this.e.get(i).h() == j) {
                return i;
            }
        }
        return -1;
    }

    public List<ax.Z2.s> W() {
        return this.g;
    }

    public int X() {
        return this.e.size();
    }

    public List<ax.Z2.s> Y() {
        return this.e;
    }

    public boolean Z() {
        return this.h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void B(a aVar, int i) {
        aVar.R();
        ax.Z2.s sVar = this.e.get(i);
        AbstractC2244I<Long> abstractC2244I = this.k;
        if (abstractC2244I != null) {
            if (abstractC2244I.m(Long.valueOf(sVar.h()))) {
                aVar.a.setActivated(true);
            } else {
                aVar.a.setActivated(false);
            }
        }
        aVar.v.setImageResource(ax.s3.b.k(sVar.e().d(), null));
        aVar.w.setText(sVar.f());
        aVar.x.setText(sVar.b());
        if (this.o) {
            aVar.z.setVisibility(0);
        } else {
            aVar.z.setVisibility(8);
        }
    }

    @Override // ax.x3.t.a
    public void b(RecyclerView.F f) {
        f.a.setBackgroundResource(R.color.accent_background);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public a D(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sublocation_item, viewGroup, false));
    }

    @Override // ax.x3.t.a
    public void c(int i, int i2) {
        this.h = true;
        if (i < i2) {
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                Collections.swap(this.e, i3, i4);
                i3 = i4;
            }
        } else {
            for (int i5 = i; i5 > i2; i5--) {
                Collections.swap(this.e, i5, i5 - 1);
            }
        }
        v(i, i2);
    }

    public void c0(boolean z) {
        if (z) {
            this.f = new ArrayList(this.e);
            this.g = new ArrayList();
        }
        this.o = z;
        r();
    }

    public void d0(List<ax.Z2.s> list) {
        this.e = list;
        this.h = false;
        List<ax.Z2.s> list2 = this.g;
        if (list2 != null) {
            list2.clear();
        }
        r();
    }

    @Override // ax.x3.t.a
    public void e(RecyclerView.F f) {
        f.a.setBackgroundColor(0);
    }

    public void e0(AdapterView.OnItemClickListener onItemClickListener) {
        this.m = onItemClickListener;
    }

    public void f0(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.n = onItemLongClickListener;
    }

    @Override // ax.x3.t.a
    public void g(RecyclerView.F f) {
        this.h = true;
        int k = f.k();
        if (k < 0) {
            return;
        }
        this.g.add(this.e.remove(k));
        z(k);
    }

    public void g0(RecyclerView recyclerView, boolean z) {
        this.l = z;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            RecyclerView.F m0 = recyclerView.m0(recyclerView.getChildAt(i));
            if (m0 instanceof a) {
                ((a) m0).R();
            }
        }
    }

    public void h0(InterfaceC3410F interfaceC3410F) {
        this.p = interfaceC3410F;
    }

    public void i0(AbstractC2244I<Long> abstractC2244I) {
        this.k = abstractC2244I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int l() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long m(int i) {
        if (i == -1) {
            return -1L;
        }
        return this.e.get(i).h();
    }

    /* renamed from: ax.x3.H$a */
    public class a extends RecyclerView.F {
        private View u;
        private ImageView v;
        private TextView w;
        private TextView x;
        private View y;
        private View z;

        /* renamed from: ax.x3.H$a$a, reason: collision with other inner class name */
        class ViewOnTouchListenerC0487a implements View.OnTouchListener {
            final /* synthetic */ C3412H a;

            ViewOnTouchListenerC0487a(C3412H c3412h) {
                this.a = c3412h;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0 || C3412H.this.p == null) {
                    return false;
                }
                C3412H.this.p.a(a.this);
                return false;
            }
        }

        /* renamed from: ax.x3.H$a$b */
        class b extends ax.g3.c {
            final /* synthetic */ C3412H c;

            b(C3412H c3412h) {
                this.c = c3412h;
            }

            @Override // ax.g3.c
            public void a(View view) {
                int k;
                if (C3412H.this.l) {
                    if (C3412H.this.i != null) {
                        C3412H.this.i.a(a.this.l());
                    }
                } else {
                    if (C3412H.this.m == null || (k = a.this.k()) < 0) {
                        return;
                    }
                    C3412H.this.m.onItemClick(null, view, k, a.this.l());
                }
            }
        }

        /* renamed from: ax.x3.H$a$c */
        class c implements View.OnLongClickListener {
            final /* synthetic */ C3412H a;

            c(C3412H c3412h) {
                this.a = c3412h;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                int k;
                if (C3412H.this.l || C3412H.this.n == null || (k = a.this.k()) < 0) {
                    return false;
                }
                C3412H.this.n.onItemLongClick(null, view, k, a.this.l());
                return true;
            }
        }

        /* renamed from: ax.x3.H$a$d */
        class d implements View.OnClickListener {
            final /* synthetic */ C3412H a;

            d(C3412H c3412h) {
                this.a = c3412h;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3412H.this.i.a(a.this.l());
            }
        }

        /* renamed from: ax.x3.H$a$e */
        class e implements View.OnClickListener {
            final /* synthetic */ C3412H a;

            e(C3412H c3412h) {
                this.a = c3412h;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3412H.this.i.a(a.this.l());
            }
        }

        a(View view) {
            super(view);
            View view2;
            this.v = (ImageView) view.findViewById(R.id.icon);
            this.w = (TextView) view.findViewById(R.id.name);
            this.x = (TextView) view.findViewById(R.id.description);
            this.y = view.findViewById(R.id.checkbox);
            View findViewById = view.findViewById(R.id.drag_handle);
            this.z = findViewById;
            findViewById.setOnTouchListener(new ViewOnTouchListenerC0487a(C3412H.this));
            View findViewById2 = view.findViewById(R.id.background_layer);
            this.u = findViewById2;
            findViewById2.setOnClickListener(new b(C3412H.this));
            this.u.setOnLongClickListener(new c(C3412H.this));
            if (C3412H.this.i != null) {
                if (C3412H.this.j && (view2 = this.y) != null) {
                    view2.setVisibility(0);
                    this.y.setOnClickListener(new d(C3412H.this));
                }
                if (ax.t3.k.J()) {
                    this.v.setContentDescription(C3412H.this.d.getString(R.string.menu_select));
                    this.v.setOnClickListener(new e(C3412H.this));
                }
            }
        }

        void R() {
        }
    }
}
