package com.voxdon.xplorer.widget;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ax.X2.P;
import ax.c3.C1809B;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.k0;
import ax.s3.C3045a;
import ax.t3.k;
import ax.u3.C3180B;
import com.voxdon.xplorer.file.Q;
import com.voxdon.xplorer.R;
import java.io.File;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class PathBar extends FrameLayout {
    private k0 A;
    private RelativeLayout a;
    private HorizontalScrollView b;
    private LinearLayout c;
    private ViewGroup d;
    private TextView e;
    private View f;
    private TextView g;
    private View h;
    private View i;
    private TextView j;
    private PieProgress k;
    private h l;
    private TextView m;
    private View n;
    private String o;
    private String p;
    private String q;
    private boolean r;
    private K s;
    private int t;
    private int u;
    private boolean v;
    private ax.Q2.f w;
    private int x;
    private int y;
    private boolean z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ax.Q2.a.i().m("navigation", "open_folder_back").c("loc", PathBar.this.s.d().I()).c("by", "pathbar_root").e();
            PathBar.this.l.b(PathBar.this.s.e());
        }
    }

    class b extends ax.g3.c {
        b() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            PathBar.this.l.e();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PathBar pathBar = PathBar.this;
            if (pathBar.l(pathBar.q) && k.K()) {
                PathBar.this.l.a("pathbar_up");
            } else {
                PathBar.this.l.c(PathBar.this.p);
                ax.Q2.a.i().m("navigation", "open_folder_back").c("loc", PathBar.this.s.d().I()).c("by", "pathbar_up").e();
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PathBar.this.b.fullScroll(66);
        }
    }

    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PathBar.this.l.a("pathbar_home");
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PathBar.this.l.d("pathbar_home");
        }
    }

    class g implements View.OnClickListener {
        final /* synthetic */ String a;

        g(String str) {
            this.a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PathBar.this.l.b(this.a);
            ax.Q2.a.i().m("navigation", "open_folder_back").c("loc", PathBar.this.s.d().I()).c("by", "pathbar_directory").e();
        }
    }

    public interface h {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e();
    }

    public PathBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = 0;
        this.v = false;
        this.z = true;
        k(context);
    }

    private void g(String str, String str2, boolean z) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
        ViewGroup viewGroup = this.u == 2 ? (ViewGroup) layoutInflater.inflate(R.layout.pathbar_item_2, (ViewGroup) this.c, false) : (ViewGroup) layoutInflater.inflate(R.layout.pathbar_item, (ViewGroup) this.c, false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.button);
        textView.setText(str);
        textView.setTextColor(z ? this.x : this.y);
        textView.setOnClickListener(new g(str2));
        this.c.addView(viewGroup);
    }

    private void j() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l(String str) {
        if (this.s.e() != null) {
            return this.s.e().equals(str);
        }
        if (this.s.d() == ax.Q2.f.v0) {
            return false;
        }
        ax.Ha.c.h().f().d("ISROOT!! ROOTPATH NULL").g(this.s.toString()).h();
        return false;
    }

    private void m() {
        if (this.n != null) {
            if (l(this.q) && ax.Q2.f.w0(this.s.d())) {
                this.n.setVisibility(0);
            } else {
                this.n.setVisibility(8);
            }
        }
    }

    private void n() {
        k0 k0Var;
        if (ax.Q2.f.T(this.s.d())) {
            if (l(this.q) && this.w == null && this.z && this.A != null) {
                this.i.setVisibility(0);
                return;
            } else {
                this.i.setVisibility(8);
                return;
            }
        }
        if (this.s.d() == ax.Q2.f.F0) {
            this.i.setVisibility(0);
            if (P.b()) {
                this.j.setText(R.string.menu_empty);
                View view = this.i;
                view.setContentDescription(view.getContext().getString(R.string.menu_empty));
            } else {
                this.j.setText(R.string.menu_clear);
                View view2 = this.i;
                view2.setContentDescription(view2.getContext().getString(R.string.menu_clear));
            }
            this.k.setVisibility(8);
            return;
        }
        if (ax.Q2.f.v0(this.s.d())) {
            if (!l(this.q) || (k0Var = this.A) == null || k0Var.b == 0) {
                this.m.setVisibility(8);
                return;
            } else {
                this.m.setVisibility(0);
                return;
            }
        }
        if (ax.Q2.f.J0 == this.s.d()) {
            k0 k0Var2 = this.A;
            if (k0Var2 == null || k0Var2.b == 0 || !Q.B0(this.q)) {
                this.m.setVisibility(8);
            } else {
                this.m.setVisibility(0);
            }
        }
    }

    private void o(Context context, View view) {
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        view.setBackgroundDrawable(C3045a.c(context, R.drawable.btn_border_material));
        view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    private void p(String str, boolean z) {
        this.p = str;
        if (k.b()) {
            this.h.setVisibility(8);
        } else if (z) {
            this.h.setVisibility(0);
        } else {
            this.h.setVisibility(8);
        }
    }

    private void q() {
        this.e.setCompoundDrawables(ax.s3.b.j(getContext(), ax.Q2.f.l0, true), null, null, null);
        this.e.setCompoundDrawablePadding(0);
        this.e.setVisibility(0);
        this.e.setContentDescription(getContext().getString(R.string.location_home));
        int i = this.u;
        if (i == 2 || i == 3) {
            this.f.setVisibility(0);
        }
        this.e.setOnClickListener(new f());
    }

    private void r() {
        this.e.setCompoundDrawables(ax.s3.b.j(getContext(), this.w, true), null, null, null);
        this.e.setCompoundDrawablePadding(0);
        this.e.setContentDescription(this.w.M(getContext()));
        this.e.setVisibility(0);
        int i = this.u;
        if (i == 2 || i == 3) {
            this.f.setVisibility(0);
        }
        this.e.setOnClickListener(new e());
    }

    private void setAnalyzeButtonProgress(float f2) {
        this.j.setText(C3180B.P(f2));
        this.k.setProgressPercent((int) f2);
    }

    private void t(boolean z) {
        if (ax.s3.b.k(this.s.d(), null) > 0) {
            this.g.setCompoundDrawables(ax.s3.b.j(getContext(), this.s.d(), z), null, null, null);
            if (z) {
                String str = this.o;
                if (str == null || HttpUrl.FRAGMENT_ENCODE_SET.equals(str)) {
                    this.g.setCompoundDrawablePadding(0);
                } else {
                    this.g.setCompoundDrawablePadding(0);
                }
            } else {
                this.g.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                this.g.setCompoundDrawablePadding(0);
            }
        } else {
            this.g.setText(this.o);
            this.g.setTextColor(z ? this.x : this.y);
            this.g.setCompoundDrawablePadding(0);
        }
        this.g.setContentDescription(getContext().getString(R.string.label_root_folder));
    }

    public int getParentButtonId() {
        return R.id.home;
    }

    public void h(String str) {
        String sb;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            ax.Ha.c.h().d("CD!!!").j().g(this.s.toString()).h();
        }
        if (str == null) {
            return;
        }
        this.c.removeAllViews();
        this.c.addView(this.d);
        if (this.s.e() == null) {
            return;
        }
        String v = d0.v(this.s, str, Boolean.TRUE);
        if (v == null) {
            ax.Ha.c.h().d("PTHBNU!!").j().g(this.s.toString() + ":" + this.s.e()).h();
            return;
        }
        String[] split = v.split(File.separator);
        if (split.length <= 0 || !this.r) {
            StringBuilder sb2 = new StringBuilder(this.s.e());
            int i = 0;
            while (i < split.length) {
                String str2 = split[i];
                if (str2.length() != 0) {
                    if (sb2.toString().endsWith("/")) {
                        sb2.append(str2);
                        sb = sb2.toString();
                    } else {
                        sb2.append(File.separator);
                        sb2.append(str2);
                        sb = sb2.toString();
                    }
                    g(str2, sb, i == split.length - 1);
                }
                i++;
            }
        } else {
            g(split[split.length - 1], str, true);
        }
        String e2 = this.r ? this.s.e() : d0.r(str);
        this.q = str;
        if (l(str)) {
            if (k.K()) {
                p(str, true);
            } else {
                p(str, false);
            }
            t(true);
        } else {
            p(e2, true);
            t(false);
        }
        n();
        m();
        post(new d());
    }

    public void i() {
        this.A = null;
        n();
    }

    public void k(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        RelativeLayout relativeLayout = (RelativeLayout) from.inflate(R.layout.pathbar, (ViewGroup) this, false);
        this.a = relativeLayout;
        addView(relativeLayout);
        this.x = ax.Q.b.c(context, R.color.pathbar_text_selected);
        this.y = ax.Q.b.c(context, R.color.pathbar_text_normal);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.a.findViewById(R.id.scroller);
        this.b = horizontalScrollView;
        this.c = (LinearLayout) horizontalScrollView.findViewById(R.id.content);
        int k = k.k();
        this.t = k;
        int o = k.o(k);
        this.u = o;
        if (o == 2) {
            this.d = (ViewGroup) from.inflate(R.layout.pathbar_root_2, (ViewGroup) this.c, false);
        } else {
            this.d = (ViewGroup) from.inflate(R.layout.pathbar_root, (ViewGroup) this.c, false);
        }
        this.e = (TextView) this.d.findViewById(R.id.home);
        this.f = this.d.findViewById(R.id.root_devider);
        q();
        TextView textView = (TextView) this.d.findViewById(R.id.root);
        this.g = textView;
        textView.setOnClickListener(new a());
        this.c.addView(this.d);
        this.b.setHorizontalScrollBarEnabled(false);
        this.b.setHorizontalFadingEdgeEnabled(true);
        View findViewById = this.a.findViewById(R.id.button_action);
        this.i = findViewById;
        findViewById.setOnClickListener(new b());
        boolean z = context instanceof com.voxdon.xplorer.activity.a;
        this.j = (TextView) this.a.findViewById(R.id.button_action_text);
        this.k = (PieProgress) this.a.findViewById(R.id.pie_progress);
        o(context, this.i);
        this.m = (TextView) this.a.findViewById(R.id.storage_space);
        View findViewById2 = this.a.findViewById(R.id.button_up);
        this.h = findViewById2;
        findViewById2.setOnClickListener(new c());
        this.p = "/";
    }

    public void s(boolean z) {
        this.z = z;
        n();
    }

    public void setActionButtonEnabled(boolean z) {
        View findViewById;
        for (int i = 0; i < this.c.getChildCount(); i++) {
            View childAt = this.c.getChildAt(i);
            if ((childAt instanceof ViewGroup) && (findViewById = ((ViewGroup) childAt).findViewById(R.id.button)) != null) {
                findViewById.setEnabled(z);
            }
        }
        this.e.setEnabled(z);
        this.g.setEnabled(z);
        this.b.setEnabled(z);
        if (z) {
            n();
        } else {
            this.i.setVisibility(8);
        }
        this.i.setEnabled(z);
        View view = this.n;
        if (view != null) {
            if (z) {
                m();
            } else {
                view.setVisibility(8);
            }
            this.n.setEnabled(z);
        }
    }

    public void setIsArchiveFile(boolean z) {
        this.v = z;
        if (z) {
            j();
        }
    }

    public void setIsTwoDepth(boolean z) {
        this.r = z;
    }

    public void setLocationUnit(K k) {
        this.s = k;
    }

    public void setParentLocation(ax.Q2.f fVar) {
        this.w = fVar;
        if (fVar != null) {
            r();
        } else {
            q();
        }
    }

    public void setPathBarListener(h hVar) {
        this.l = hVar;
    }

    public void setRootInfo(String str) {
        this.o = str;
        t(true);
    }

    public void setRootTitle(String str) {
        this.o = str;
    }

    public void setStorageSpace(k0 k0Var) {
        if (k0Var == null) {
            return;
        }
        this.A = k0Var;
        if (ax.Q2.f.T(this.s.d())) {
            long j = this.A.b;
            setAnalyzeButtonProgress(j != 0 ? (float) ((r7.a * 100.0d) / j) : -1.0f);
        } else if (this.A.b != 0) {
            Context context = getContext();
            k0 k0Var2 = this.A;
            this.m.setText(C1809B.m(context, k0Var2.b, k0Var2.a, C1809B.a.SHORT));
        } else {
            this.m.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        n();
    }
}
