/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ax.U2.d;
import ax.U2.f;
import ax.X2.Q;
import ax.h0.e;
import ax.r3.d;
import ax.t3.j;
import ax.t3.k;
import ax.x3.r;
import ax.x3.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class a
extends ArrayAdapter<f> {
    Filter a;
    List<f> b;
    Map<String, d.e> c;
    private int d;
    private int e;
    private int f;
    d g;
    private View.OnClickListener h;
    private z i;
    private boolean j;
    private int k;
    private int l;
    private boolean m;
    private AdapterView.OnItemClickListener n;
    private boolean o;

    public a(Context context, int n8, View.OnClickListener onClickListener, z z8, boolean bl, boolean bl2) {
        super(context, 0);
        this.d = n8;
        this.g = new d(context, null);
        this.h = onClickListener;
        this.i = z8;
        this.j = bl;
        this.m();
        this.o = bl2;
    }

    private int l() {
        int n8 = this.d;
        if (n8 != 0 && n8 != 1) {
            if (n8 != 2) {
                return 0;
            }
            return 2131558540;
        }
        return 2131558542;
    }

    public Filter getFilter() {
        if (this.a == null) {
            this.a = new b(this);
        }
        return this.a;
    }

    public View getView(int n8, View object, ViewGroup viewGroup) {
        f f8 = (f)this.getItem(n8);
        if (object != null) {
            c c8 = (c)object.getTag();
            viewGroup = object;
            object = c8;
        } else {
            View view = ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(this.l(), null);
            object = new c(this, view, (View)viewGroup);
            view.setTag(object);
            viewGroup = view;
        }
        ((c)object).h(f8, n8);
        return viewGroup;
    }

    public void m() {
        this.k = ax.Q.b.c(this.getContext(), 2131099705);
        this.l = ax.Q.b.c(this.getContext(), 2131099704);
    }

    public void n(boolean bl) {
        this.m = bl;
    }

    public void o(List<f> list, Map<String, d.e> map) {
        this.m();
        this.b = list;
        this.clear();
        if (list != null) {
            this.addAll(list);
        }
        this.c = map;
    }

    public void p(int n8) {
        this.e = n8;
    }

    public void q(int n8) {
        this.d = n8;
        this.notifyDataSetChanged();
    }

    public void r(AdapterView.OnItemClickListener onItemClickListener) {
        this.n = onItemClickListener;
    }

    public void s() {
        this.f = ax.t3.j.g(this.getContext());
    }

    private class b
    extends Filter {
        final a a;

        private b(a a8) {
            this.a = a8;
        }

        @SuppressLint(value={"DefaultLocale"})
        protected Filter.FilterResults performFiltering(CharSequence arrayList) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            Object object = this.a.b;
            int n8 = 0;
            if (object == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            if (arrayList != null && arrayList.length() != 0) {
                object = arrayList.toString().toLowerCase();
                arrayList = new ArrayList<f>(this.a.b);
                ArrayList<f> arrayList2 = new ArrayList<f>();
                int n9 = arrayList.size();
                while (n8 < n9) {
                    int n10;
                    f f8 = arrayList.get(n8);
                    n8 = n10 = n8 + 1;
                    if (!f8.q().toLowerCase().contains((CharSequence)object)) continue;
                    arrayList2.add(f8);
                    n8 = n10;
                }
                filterResults.values = arrayList2;
                filterResults.count = arrayList2.size();
                return filterResults;
            }
            arrayList = new ArrayList<f>(this.a.b);
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }

        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (filterResults.values != null) {
                this.a.clear();
                this.a.addAll((ArrayList)filterResults.values);
            }
        }
    }

    public class c {
        private View a;
        private View b;
        private View c;
        ImageView d;
        TextView e;
        LinearLayout f;
        ImageButton g;
        TextView h;
        TextView i;
        TextView j;
        private ImageView k;
        View l;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        final a r;

        c(a a8, View view, View view2) {
            this.r = a8;
            this.n = false;
            this.o = -1;
            this.a = view;
            this.b = view.findViewById(2131362428);
            this.c = view.findViewById(2131362384);
            this.d = (ImageView)view.findViewById(2131362383);
            this.e = (TextView)view.findViewById(2131362304);
            ViewStub viewStub = (ViewStub)view.findViewById(2131362906);
            if (viewStub != null) {
                this.f = (LinearLayout)viewStub.inflate();
            }
            this.g = (ImageButton)view.findViewById(2131362401);
            this.h = (TextView)view.findViewById(2131362302);
            this.i = (TextView)view.findViewById(2131362267);
            this.j = (TextView)view.findViewById(2131362268);
            this.k = (ImageView)view.findViewById(2131362908);
            this.l = view.findViewById(2131362187);
            viewStub = this.f;
            if (viewStub != null) {
                viewStub.setVisibility(8);
                if (Q.C0()) {
                    this.g.setImageResource(2131231146);
                }
            }
            if (a8.i != null) {
                if (a8.j) {
                    viewStub = (ViewStub)view.findViewById(2131362905);
                    if (viewStub != null) {
                        viewStub = viewStub.inflate();
                        viewStub.setOnClickListener(new View.OnClickListener(){
                            final a a;
                            final c b;
                            {
                                this.b = c8;
                                this.a = a8;
                            }

                            public void onClick(View view) {
                                this.b.r.i.b(this.b.m);
                            }
                        });
                        viewStub.setVisibility(0);
                        this.n = true;
                    }
                    if ((viewStub = this.l) != null) {
                        viewStub.setVisibility(8);
                    }
                }
                if (a8.o && ax.t3.k.J()) {
                    viewStub = this.c;
                    if (viewStub == null) {
                        viewStub = this.d;
                    }
                    viewStub.setContentDescription((CharSequence)view.getContext().getString(2131951746));
                    viewStub.setOnClickListener(new View.OnClickListener(){
                        final a a;
                        final c b;
                        {
                            this.b = c8;
                            this.a = a8;
                        }

                        public void onClick(View view) {
                            this.b.r.i.b(this.b.m);
                        }
                    });
                    viewStub.setOnLongClickListener(new View.OnLongClickListener(){
                        final a a;
                        final View b;
                        final View c;
                        final c d;
                        {
                            this.d = c8;
                            this.a = a8;
                            this.b = view;
                            this.c = view2;
                        }

                        public boolean onLongClick(View object) {
                            object = this.b;
                            if (object instanceof r) {
                                ((r)object).a();
                            }
                            int n8 = (int)(this.c.getX() + (float)this.c.getWidth() / 2.0f);
                            int n9 = (int)(this.c.getY() + (float)this.c.getHeight() / 2.0f);
                            object = this.d.r.i;
                            c c8 = this.d;
                            object.c(c8.m, c8.b, n8, n9);
                            return true;
                        }
                    });
                }
                this.b.setOnTouchListener(new View.OnTouchListener(){
                    final a a;
                    final c b;
                    {
                        this.b = c8;
                        this.a = a8;
                    }

                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getActionMasked() == 0) {
                            ax.x3.a$c.c(this.b, (int)motionEvent.getX());
                            ax.x3.a$c.e(this.b, (int)motionEvent.getY());
                        } else if (motionEvent.getActionMasked() == 1) {
                            ax.x3.a$c.c(this.b, 0);
                            ax.x3.a$c.e(this.b, 0);
                        }
                        return false;
                    }
                });
                this.b.setOnClickListener((View.OnClickListener)new ax.g3.c(this, a8){
                    final a c;
                    final c d;
                    {
                        this.d = c8;
                        this.c = a8;
                    }

                    @Override
                    public void a(View view) {
                        if (this.d.r.m) {
                            this.d.r.i.b(this.d.m);
                            return;
                        }
                        AdapterView.OnItemClickListener onItemClickListener = this.d.r.n;
                        view = this.d.a;
                        int n8 = this.d.m;
                        onItemClickListener.onItemClick(null, view, n8, (long)n8);
                    }
                });
                this.b.setOnLongClickListener(new View.OnLongClickListener(){
                    final a a;
                    final View b;
                    final c c;
                    {
                        this.c = c8;
                        this.a = a8;
                        this.b = view;
                    }

                    public boolean onLongClick(View object) {
                        object = this.b;
                        if (object instanceof r) {
                            ((r)object).a();
                        }
                        z z8 = this.c.r.i;
                        object = this.c;
                        z8.c(object.m, ((c)object).b, this.c.p, this.c.q);
                        return true;
                    }
                });
            }
        }

        static /* synthetic */ int c(c c8, int n8) {
            c8.p = n8;
            return n8;
        }

        static /* synthetic */ int e(c c8, int n8) {
            c8.q = n8;
            return n8;
        }

        private void g() {
            if (this.o != this.r.e) {
                View view;
                Resources resources = this.a.getResources();
                this.o = this.r.e;
                if (this.r.d == 2) {
                    View view2 = this.c;
                    if (view2 != null) {
                        this.j(resources, view2, 2131165412, 2131165411);
                        return;
                    }
                } else if ((this.r.d == 0 || this.r.d == 1) && (view = this.c) != null) {
                    float f8;
                    int n8;
                    this.j(resources, view, 0x7F0700F0, 2131165423);
                    if (this.i()) {
                        n8 = resources.getDimensionPixelSize(2131165425);
                        f8 = resources.getDimension(2131165416);
                    } else {
                        n8 = resources.getDimensionPixelSize(2131165426);
                        f8 = resources.getDimension(2131165417);
                    }
                    this.a.setMinimumHeight(n8);
                    this.e.setTextSize(0, f8);
                }
            }
        }

        private boolean i() {
            return this.o == 4;
        }

        private void j(Resources resources, View view, int n8, int n9) {
            n8 = this.i() ? resources.getDimensionPixelSize(n9) : resources.getDimensionPixelSize(n8);
            resources = view.getLayoutParams();
            resources.height = n8;
            resources.width = n8;
            view.setLayoutParams((ViewGroup.LayoutParams)resources);
        }

        private void k(boolean bl) {
            if (bl) {
                this.f.setVisibility(0);
                this.g.setOnClickListener(this.r.h);
            } else {
                this.f.setVisibility(8);
            }
            View view = this.l;
            if (view != null) {
                if (bl) {
                    view.setVisibility(8);
                    return;
                }
                if (this.r.i != null && this.r.j) {
                    this.l.setVisibility(8);
                    return;
                }
                this.l.setVisibility(0);
            }
        }

        public void h(f f8, int n8) {
            this.m = n8;
            Object object = this.d;
            d.e e8 = null;
            object.setImageDrawable(null);
            this.g();
            this.r.g.s(f8, this.d);
            this.e.setText((CharSequence)f8.q());
            if (this.f != null && Q.C0()) {
                if (f8.o() != null) {
                    this.k(true);
                } else {
                    this.k(false);
                }
            }
            if (this.r.d == 0 || this.r.d == 1) {
                object = this.g;
                if (object != null) {
                    object.setTag((Object)n8);
                }
                this.h.setText((CharSequence)f8.i(this.r.getContext()));
                if (this.r.d == 0) {
                    this.i.setText((CharSequence)"");
                } else {
                    this.i.setText((CharSequence)f8.h(this.r.getContext(), this.r.f));
                }
                this.j.setText((CharSequence)"");
                if (this.k != null) {
                    object = this.r.c;
                    if (object != null) {
                        e8 = (d.e)object.get(f8.r());
                    }
                    if (e8 != null) {
                        long l8 = e8.b;
                        this.k.setImageResource(2131231213);
                        this.k.setVisibility(0);
                        if (l8 < f8.y()) {
                            ax.h0.e.c(this.k, ColorStateList.valueOf((int)this.r.k));
                            return;
                        }
                        ax.h0.e.c(this.k, ColorStateList.valueOf((int)this.r.l));
                        return;
                    }
                    this.k.setVisibility(8);
                }
            }
        }
    }
}

