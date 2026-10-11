package ax.x3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.KeyEvent;
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
import ax.X2.Q;
import ax.r3.C2947d;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: ax.x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3415a extends ArrayAdapter<ax.U2.f> {
    Filter a;
    List<ax.U2.f> b;
    Map<String, d.e> c;
    private int d;
    private int e;
    private int f;
    C2947d g;
    private View.OnClickListener h;
    private z i;
    private boolean j;
    private int k;
    private int l;
    private boolean m;
    private AdapterView.OnItemClickListener n;
    private boolean o;

    /* renamed from: ax.x3.a$b */
    private class b extends Filter {
        private b() {
        }

        @Override // android.widget.Filter
        @SuppressLint({"DefaultLocale"})
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            int i = 0;
            if (C3415a.this.b == null) {
                filterResults.values = null;
                filterResults.count = 0;
                return filterResults;
            }
            if (charSequence == null || charSequence.length() == 0) {
                ArrayList arrayList = new ArrayList(C3415a.this.b);
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }
            String lowerCase = charSequence.toString().toLowerCase();
            ArrayList arrayList2 = new ArrayList(C3415a.this.b);
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ax.U2.f fVar = (ax.U2.f) obj;
                if (fVar.q().toLowerCase().contains(lowerCase)) {
                    arrayList3.add(fVar);
                }
            }
            filterResults.values = arrayList3;
            filterResults.count = arrayList3.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (filterResults.values != null) {
                C3415a.this.clear();
                C3415a.this.addAll((ArrayList) filterResults.values);
            }
        }
    }

    /* renamed from: ax.x3.a$c */
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
        private int o = -1;
        private int p;
        private int q;

        /* renamed from: ax.x3.a$c$a, reason: collision with other inner class name */
        class ViewOnClickListenerC0490a implements View.OnClickListener {
            final /* synthetic */ C3415a a;

            ViewOnClickListenerC0490a(C3415a c3415a) {
                this.a = c3415a;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3415a.this.i.b(c.this.m);
            }
        }

        /* renamed from: ax.x3.a$c$b */
        class b implements View.OnClickListener {
            final /* synthetic */ C3415a a;

            b(C3415a c3415a) {
                this.a = c3415a;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3415a.this.i.b(c.this.m);
            }
        }

        /* renamed from: ax.x3.a$c$c, reason: collision with other inner class name */
        class ViewOnLongClickListenerC0491c implements View.OnLongClickListener {
            final /* synthetic */ C3415a a;
            final /* synthetic */ View b;
            final /* synthetic */ View c;

            ViewOnLongClickListenerC0491c(C3415a c3415a, View view, View view2) {
                this.a = c3415a;
                this.b = view;
                this.c = view2;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                KeyEvent.Callback callback = this.b;
                if (callback instanceof r) {
                    ((r) callback).a();
                }
                int x = (int) (this.c.getX() + (this.c.getWidth() / 2.0f));
                int y = (int) (this.c.getY() + (this.c.getHeight() / 2.0f));
                z zVar = C3415a.this.i;
                c cVar = c.this;
                zVar.c(cVar.m, cVar.b, x, y);
                return true;
            }
        }

        /* renamed from: ax.x3.a$c$d */
        class d implements View.OnTouchListener {
            final /* synthetic */ C3415a a;

            d(C3415a c3415a) {
                this.a = c3415a;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    c.this.p = (int) motionEvent.getX();
                    c.this.q = (int) motionEvent.getY();
                } else if (motionEvent.getActionMasked() == 1) {
                    c.this.p = 0;
                    c.this.q = 0;
                }
                return false;
            }
        }

        /* renamed from: ax.x3.a$c$e */
        class e extends ax.g3.c {
            final /* synthetic */ C3415a c;

            e(C3415a c3415a) {
                this.c = c3415a;
            }

            @Override // ax.g3.c
            public void a(View view) {
                if (C3415a.this.m) {
                    C3415a.this.i.b(c.this.m);
                    return;
                }
                AdapterView.OnItemClickListener onItemClickListener = C3415a.this.n;
                View view2 = c.this.a;
                int i = c.this.m;
                onItemClickListener.onItemClick(null, view2, i, i);
            }
        }

        /* renamed from: ax.x3.a$c$f */
        class f implements View.OnLongClickListener {
            final /* synthetic */ C3415a a;
            final /* synthetic */ View b;

            f(C3415a c3415a, View view) {
                this.a = c3415a;
                this.b = view;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                KeyEvent.Callback callback = this.b;
                if (callback instanceof r) {
                    ((r) callback).a();
                }
                z zVar = C3415a.this.i;
                c cVar = c.this;
                zVar.c(cVar.m, cVar.b, c.this.p, c.this.q);
                return true;
            }
        }

        c(View view, View view2) {
            this.n = false;
            this.a = view;
            this.b = view.findViewById(R.id.item_container);
            this.c = view.findViewById(R.id.icon_container);
            this.d = (ImageView) view.findViewById(R.id.icon);
            this.e = (TextView) view.findViewById(R.id.filename);
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.stub_info);
            if (viewStub != null) {
                this.f = (LinearLayout) viewStub.inflate();
            }
            this.g = (ImageButton) view.findViewById(R.id.info);
            this.h = (TextView) view.findViewById(R.id.file_size);
            this.i = (TextView) view.findViewById(R.id.file_date);
            this.j = (TextView) view.findViewById(R.id.file_details);
            this.k = (ImageView) view.findViewById(R.id.subicon);
            this.l = view.findViewById(R.id.end_padding);
            LinearLayout linearLayout = this.f;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                if (Q.C0()) {
                    this.g.setImageResource(R.drawable.ic_folder_settings);
                }
            }
            if (C3415a.this.i != null) {
                if (C3415a.this.j) {
                    ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.stub_checkbox);
                    if (viewStub2 != null) {
                        View inflate = viewStub2.inflate();
                        inflate.setOnClickListener(new ViewOnClickListenerC0490a(C3415a.this));
                        inflate.setVisibility(0);
                        this.n = true;
                    }
                    View view3 = this.l;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                }
                if (C3415a.this.o && ax.t3.k.J()) {
                    View view4 = this.c;
                    view4 = view4 == null ? this.d : view4;
                    view4.setContentDescription(view.getContext().getString(R.string.button_toggle_selection));
                    view4.setOnClickListener(new b(C3415a.this));
                    view4.setOnLongClickListener(new ViewOnLongClickListenerC0491c(C3415a.this, view2, view4));
                }
                this.b.setOnTouchListener(new d(C3415a.this));
                this.b.setOnClickListener(new e(C3415a.this));
                this.b.setOnLongClickListener(new f(C3415a.this, view2));
            }
        }

        private void g() {
            View view;
            int dimensionPixelSize;
            float dimension;
            if (this.o != C3415a.this.e) {
                Resources resources = this.a.getResources();
                this.o = C3415a.this.e;
                if (C3415a.this.d == 2) {
                    View view2 = this.c;
                    if (view2 != null) {
                        j(resources, view2, R.dimen.file_grid_icon_size_medium, R.dimen.file_grid_icon_size_large);
                        return;
                    }
                    return;
                }
                if ((C3415a.this.d == 0 || C3415a.this.d == 1) && (view = this.c) != null) {
                    j(resources, view, R.dimen.file_list_icon_size_medium, R.dimen.file_list_icon_size_large);
                    if (i()) {
                        dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.file_list_min_height_large);
                        dimension = resources.getDimension(R.dimen.file_list_filename_size_large);
                    } else {
                        dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.file_list_min_height_medium);
                        dimension = resources.getDimension(R.dimen.file_list_filename_size_normal);
                    }
                    this.a.setMinimumHeight(dimensionPixelSize);
                    this.e.setTextSize(0, dimension);
                }
            }
        }

        private boolean i() {
            return this.o == 4;
        }

        private void j(Resources resources, View view, int i, int i2) {
            int dimensionPixelSize = i() ? resources.getDimensionPixelSize(i2) : resources.getDimensionPixelSize(i);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = dimensionPixelSize;
            layoutParams.width = dimensionPixelSize;
            view.setLayoutParams(layoutParams);
        }

        private void k(boolean z) {
            if (z) {
                this.f.setVisibility(0);
                this.g.setOnClickListener(C3415a.this.h);
            } else {
                this.f.setVisibility(8);
            }
            View view = this.l;
            if (view != null) {
                if (z) {
                    view.setVisibility(8);
                } else if (C3415a.this.i == null || !C3415a.this.j) {
                    this.l.setVisibility(0);
                } else {
                    this.l.setVisibility(8);
                }
            }
        }

        public void h(ax.U2.f fVar, int i) {
            this.m = i;
            this.d.setImageDrawable(null);
            g();
            C3415a.this.g.s(fVar, this.d);
            this.e.setText(fVar.q());
            if (this.f != null && Q.C0()) {
                if (fVar.o() != null) {
                    k(true);
                } else {
                    k(false);
                }
            }
            if (C3415a.this.d == 0 || C3415a.this.d == 1) {
                ImageButton imageButton = this.g;
                if (imageButton != null) {
                    imageButton.setTag(Integer.valueOf(i));
                }
                this.h.setText(fVar.i(C3415a.this.getContext()));
                if (C3415a.this.d == 0) {
                    this.i.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                } else {
                    this.i.setText(fVar.h(C3415a.this.getContext(), C3415a.this.f));
                }
                this.j.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                if (this.k != null) {
                    Map<String, d.e> map = C3415a.this.c;
                    d.e eVar = map != null ? map.get(fVar.r()) : null;
                    if (eVar == null) {
                        this.k.setVisibility(8);
                        return;
                    }
                    long j = eVar.b;
                    this.k.setImageResource(R.drawable.ic_save_black);
                    this.k.setVisibility(0);
                    if (j < fVar.y()) {
                        ax.h0.e.c(this.k, ColorStateList.valueOf(C3415a.this.k));
                    } else {
                        ax.h0.e.c(this.k, ColorStateList.valueOf(C3415a.this.l));
                    }
                }
            }
        }
    }

    public C3415a(Context context, int i, View.OnClickListener onClickListener, z zVar, boolean z, boolean z2) {
        super(context, 0);
        this.d = i;
        this.g = new C2947d(context, null);
        this.h = onClickListener;
        this.i = zVar;
        this.j = z;
        m();
        this.o = z2;
    }

    private int l() {
        int i = this.d;
        if (i == 0 || i == 1) {
            return R.layout.filelist_item;
        }
        if (i != 2) {
            return 0;
        }
        return R.layout.filegrid_item;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar;
        ax.U2.f fVar = (ax.U2.f) getItem(i);
        if (view != null) {
            cVar = (c) view.getTag();
        } else {
            view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(l(), (ViewGroup) null);
            c cVar2 = new c(view, viewGroup);
            view.setTag(cVar2);
            cVar = cVar2;
        }
        cVar.h(fVar, i);
        return view;
    }

    public void m() {
        this.k = ax.Q.b.c(getContext(), R.color.backup_color_old);
        this.l = ax.Q.b.c(getContext(), R.color.backup_color_normal);
    }

    public void n(boolean z) {
        this.m = z;
    }

    public void o(List<ax.U2.f> list, Map<String, d.e> map) {
        m();
        this.b = list;
        clear();
        if (list != null) {
            addAll(list);
        }
        this.c = map;
    }

    public void p(int i) {
        this.e = i;
    }

    public void q(int i) {
        this.d = i;
        notifyDataSetChanged();
    }

    public void r(AdapterView.OnItemClickListener onItemClickListener) {
        this.n = onItemClickListener;
    }

    public void s() {
        this.f = ax.t3.j.g(getContext());
    }
}
