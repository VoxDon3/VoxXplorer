package com.voxdon.xplorer.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import ax.Q2.f;
import ax.S4.c;
import ax.X2.Q;
import ax.Z2.q;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1810C;
import ax.c3.C1826n;
import ax.c3.EnumC1837z;
import ax.c3.K;
import ax.c3.d0;
import ax.i3.C2265a;
import ax.r3.C2947d;
import ax.t3.e;
import ax.t3.j;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3203u;
import ax.x3.r;
import ax.x3.z;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3582a;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.widget.ActivatableFrameLayout;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class a extends ArrayAdapter<AbstractC3595n> {
    private static ColorStateList N;
    private static ColorStateList O;
    private int A;
    private int B;
    private boolean C;
    private AdapterView.OnItemClickListener D;
    private boolean E;
    private TreeMap<Integer, q> F;
    private boolean G;
    private Date H;
    private Date I;
    private String J;
    private boolean K;
    private int L;
    private Set<String> M;
    private final Object a;
    private Context b;
    private boolean c;
    private C3596o d;
    private C2947d e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private z m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private f s;
    private boolean t;
    private int u;
    private String v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    /* renamed from: com.voxdon.xplorer.widget.a$a, reason: collision with other inner class name */
    class C0537a extends View.DragShadowBuilder {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0537a(View view, int i, int i2) {
            super(view);
            this.a = i;
            this.b = i2;
        }

        @Override // android.view.View.DragShadowBuilder
        public void onDrawShadow(Canvas canvas) {
            int color;
            color = a.this.getContext().getColor(R.color.main_background);
            canvas.drawColor(color);
            super.onDrawShadow(canvas);
        }

        @Override // android.view.View.DragShadowBuilder
        public void onProvideShadowMetrics(Point point, Point point2) {
            View view = getView();
            if (view != null) {
                point.set(view.getWidth(), view.getHeight());
                point2.set(this.a, this.b);
            }
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.a.values().length];
            a = iArr;
            try {
                iArr[c.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.a.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[c.a.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class c {
        private String A;
        private String B;
        private boolean C;
        private boolean D;
        private boolean E;
        private int F;
        private int G;
        private long H;
        private d I;
        private C1810C.a J;
        private int N;
        private int O;
        private View a;
        private View b;
        private TextView c;
        private CheckBox d;
        private View e;
        private TextView f;
        private TextView g;
        private TextView h;
        private TextView i;
        private TextView j;
        private TextView k;
        private View l;
        private View m;
        private ImageView n;
        private ImageView o;
        private ImageView p;
        private ImageView q;
        private ImageView r;
        private ImageView s;
        private View t;
        private View u;
        private boolean v;
        private boolean w;
        private String x;
        private long y;
        private EnumC1837z z;
        private int K = -1;
        private boolean L = false;
        private int M = 0;
        final Runnable P = new RunnableC0538a();

        /* renamed from: com.voxdon.xplorer.widget.a$c$a, reason: collision with other inner class name */
        class RunnableC0538a implements Runnable {
            RunnableC0538a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.this.z == EnumC1837z.PDF) {
                    c.this.L = true;
                    c.this.M = R.drawable.ic_v_pdf;
                    c.this.r.setImageResource(R.drawable.ic_v_pdf);
                    c.this.r.setVisibility(0);
                    c.this.r.setBackgroundResource(0);
                    return;
                }
                if ("epub".equals(c.this.A)) {
                    c.this.L = true;
                    c.this.M = R.drawable.ic_v_epub;
                    c.this.r.setImageResource(R.drawable.ic_v_epub);
                    c.this.r.setVisibility(0);
                    c.this.r.setBackgroundResource(0);
                    return;
                }
                if (c.this.z == EnumC1837z.VIDEO || (c.this.B != null && c.this.B.startsWith("video"))) {
                    c.this.o.setVisibility(0);
                    return;
                }
                if (c.this.z == EnumC1837z.IMAGE && C1808A.O(c.this.A)) {
                    c.this.L = true;
                    c.this.M = R.drawable.ic_v_raw;
                    c.this.r.setImageResource(R.drawable.ic_v_raw);
                    c.this.r.setVisibility(0);
                    c.this.r.setBackgroundResource(0);
                }
            }
        }

        class b implements ActivatableFrameLayout.a {
            b() {
            }

            @Override // com.voxdon.xplorer.widget.ActivatableFrameLayout.a
            public void a(boolean z) {
                if (c.this.t != null) {
                    if (z) {
                        c.this.t.setVisibility(0);
                    } else {
                        c.this.t.setVisibility(8);
                    }
                }
            }
        }

        /* renamed from: com.voxdon.xplorer.widget.a$c$c, reason: collision with other inner class name */
        class C0539c extends ax.g3.c {
            C0539c() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                a.this.m.a(c.this.G);
            }
        }

        class d extends ax.g3.c {
            d() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                a.this.m.b(c.this.G);
            }
        }

        class e implements View.OnLongClickListener {
            final /* synthetic */ ViewGroup a;
            final /* synthetic */ View b;

            e(ViewGroup viewGroup, View view) {
                this.a = viewGroup;
                this.b = view;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                ViewParent viewParent = this.a;
                if (viewParent instanceof r) {
                    ((r) viewParent).a();
                }
                a.this.m.c(c.this.G, c.this.u, (int) this.b.getX(), (int) this.b.getY());
                return true;
            }
        }

        class f extends ax.g3.c {
            f() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                a.this.m.b(c.this.G);
            }
        }

        class g implements View.OnLongClickListener {
            final /* synthetic */ ViewGroup a;
            final /* synthetic */ View b;

            g(ViewGroup viewGroup, View view) {
                this.a = viewGroup;
                this.b = view;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                ViewGroup viewGroup = this.a;
                if (viewGroup instanceof FileListView) {
                    ((FileListView) viewGroup).a();
                }
                a.this.m.c(c.this.G, c.this.u, (int) (this.b.getX() + (this.b.getWidth() / 2.0f)), (int) (this.b.getY() + (this.b.getHeight() / 2.0f)));
                return true;
            }
        }

        class h implements View.OnTouchListener {
            h() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0) {
                    c.this.N = (int) motionEvent.getX();
                    c.this.O = (int) motionEvent.getY();
                } else if (motionEvent.getActionMasked() == 1) {
                    c.this.N = 0;
                    c.this.O = 0;
                }
                return false;
            }
        }

        class i extends ax.g3.c {
            i() {
            }

            @Override // ax.g3.c
            public void a(View view) {
                if (a.this.C) {
                    a.this.m.b(c.this.G);
                } else {
                    a.this.D.onItemClick(null, c.this.l, c.this.G, c.this.G);
                }
            }
        }

        class j implements View.OnLongClickListener {
            final /* synthetic */ ViewGroup a;

            j(ViewGroup viewGroup) {
                this.a = viewGroup;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                ViewParent viewParent = this.a;
                if (viewParent instanceof r) {
                    ((r) viewParent).a();
                }
                a.this.m.c(c.this.G, c.this.u, c.this.N, c.this.O);
                return true;
            }
        }

        public c(View view, ViewGroup viewGroup) {
            E(view, viewGroup);
        }

        private String B(AbstractC3595n abstractC3595n) {
            if (a.this.f != 20 || !abstractC3595n.isDirectory()) {
                return (a.this.f == 12 && abstractC3595n.isDirectory()) ? this.F >= 0 ? a.this.getContext().getString(R.string.media_thumbnail_name, abstractC3595n.B(), Integer.valueOf(this.F)) : abstractC3595n.B() : abstractC3595n.B();
            }
            String v = d0.v(ax.T2.h.q(abstractC3595n.L()), abstractC3595n.E(), Boolean.TRUE);
            if (!ax.U2.d.Q(v)) {
                return abstractC3595n.B();
            }
            String g2 = ax.U2.d.g(v);
            ax.U2.f x = ax.U2.d.F(a.this.getContext()).x(g2);
            return x == null ? g2 : x.q();
        }

        private CharSequence D(AbstractC3595n abstractC3595n) {
            int indexOf;
            String B = B(abstractC3595n);
            if (B == null) {
                return null;
            }
            String str = (a.this.J == null || !a.this.J.equals(abstractC3595n.B())) ? a.this.v : B;
            if (str == null || (indexOf = B.toLowerCase().indexOf(str.toLowerCase())) < 0) {
                return B;
            }
            if (a.this.w == 0) {
                a aVar = a.this;
                aVar.w = ax.Q.b.c(aVar.getContext(), R.color.search_highlight_color);
            }
            SpannableString spannableString = new SpannableString(B);
            spannableString.setSpan(new BackgroundColorSpan(a.this.w), indexOf, str.length() + indexOf, 0);
            return spannableString;
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x01c8, code lost:
        
            if (r14 != 20) goto L68;
         */
        /* JADX WARN: Removed duplicated region for block: B:62:0x024d  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0264  */
        /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void E(android.view.View r13, android.view.ViewGroup r14) {
            /*
                Method dump skipped, instructions count: 632
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.widget.a.c.E(android.view.View, android.view.ViewGroup):void");
        }

        private boolean F() {
            return this.K == 4;
        }

        private void G(String str) {
            TextView textView = this.f;
            if (textView != null) {
                textView.setText(str);
            }
        }

        private void H(ImageView imageView, boolean z) {
            imageView.setAlpha(z ? 0.5f : 1.0f);
        }

        private void I(Resources resources, View view, int i2, int i3) {
            int dimensionPixelSize = F() ? resources.getDimensionPixelSize(i3) : resources.getDimensionPixelSize(i2);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = dimensionPixelSize;
            layoutParams.width = dimensionPixelSize;
            view.setLayoutParams(layoutParams);
        }

        private void J(Resources resources, View view, int i2, int i3) {
            int dimensionPixelSize = F() ? resources.getDimensionPixelSize(i3) : resources.getDimensionPixelSize(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = dimensionPixelSize;
            view.setLayoutParams(marginLayoutParams);
        }

        private void K(AbstractC3595n abstractC3595n, boolean z) {
            C1810C.a c = z ? C1810C.c(abstractC3595n) : C1810C.b(abstractC3595n);
            if (c == null) {
                if (z) {
                    O(R.drawable.v_shape_folder_dir);
                    return;
                }
                return;
            }
            int i2 = c.b;
            if (i2 != 0) {
                if (z) {
                    O(i2);
                    return;
                } else {
                    M(i2);
                    return;
                }
            }
            String[] strArr = c.a;
            if (strArr != null) {
                this.J = c;
                for (String str : strArr) {
                    if (P(str, z)) {
                        this.J = null;
                        return;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void L(com.voxdon.xplorer.file.AbstractC3595n r5, boolean r6, ax.S4.c.a r7) {
            /*
                r4 = this;
                com.voxdon.xplorer.widget.a r6 = com.voxdon.xplorer.widget.a.this
                boolean r6 = com.voxdon.xplorer.widget.a.k(r6)
                r0 = 1
                r1 = 8
                r2 = 0
                if (r6 == 0) goto L29
                com.voxdon.xplorer.file.y r5 = (com.voxdon.xplorer.file.C3605y) r5
                boolean r5 = r5.X0()
                if (r5 == 0) goto L23
                android.widget.ImageView r5 = r4.r
                r6 = 2131231215(0x7f0801ef, float:1.8078505E38)
                r5.setImageResource(r6)
                android.widget.ImageView r5 = r4.r
                r5.setVisibility(r2)
                r5 = 1
                goto L2f
            L23:
                android.widget.ImageView r5 = r4.r
                r5.setVisibility(r1)
                goto L2e
            L29:
                android.widget.ImageView r5 = r4.r
                r5.setVisibility(r1)
            L2e:
                r5 = 0
            L2f:
                boolean r6 = r4.L
                if (r6 == 0) goto L45
                android.widget.ImageView r6 = r4.r
                r6.setVisibility(r2)
                android.widget.ImageView r6 = r4.r
                int r3 = r4.M
                r6.setImageResource(r3)
                android.widget.ImageView r6 = r4.r
                r6.setBackgroundResource(r2)
                goto L4d
            L45:
                android.widget.ImageView r6 = r4.r
                r3 = 2131230868(0x7f080094, float:1.80778E38)
                r6.setBackgroundResource(r3)
            L4d:
                if (r7 == 0) goto Lb2
                int[] r6 = com.voxdon.xplorer.widget.a.b.a
                int r7 = r7.ordinal()
                r6 = r6[r7]
                if (r6 == r0) goto Lab
                r5 = 2
                if (r6 == r5) goto L88
                r5 = 3
                if (r6 == r5) goto L60
                goto Lb2
            L60:
                com.voxdon.xplorer.widget.a r5 = com.voxdon.xplorer.widget.a.this
                android.content.Context r5 = r5.getContext()
                r6 = 2131231134(0x7f08019e, float:1.807834E38)
                android.graphics.drawable.Drawable r5 = ax.s3.C3045a.c(r5, r6)
                android.graphics.drawable.AnimationDrawable r5 = (android.graphics.drawable.AnimationDrawable) r5
                android.graphics.drawable.Drawable r6 = ax.U.a.r(r5)
                android.content.res.ColorStateList r7 = com.voxdon.xplorer.widget.a.m()
                ax.U.a.o(r6, r7)
                r5.start()
                android.widget.ImageView r5 = r4.r
                r5.setVisibility(r2)
                android.widget.ImageView r5 = r4.r
                r5.setImageDrawable(r6)
                return
            L88:
                com.voxdon.xplorer.widget.a r5 = com.voxdon.xplorer.widget.a.this
                android.content.Context r5 = r5.getContext()
                r6 = 2131231131(0x7f08019b, float:1.8078334E38)
                android.graphics.drawable.Drawable r5 = ax.s3.C3045a.c(r5, r6)
                android.graphics.drawable.Drawable r5 = ax.U.a.r(r5)
                android.content.res.ColorStateList r6 = com.voxdon.xplorer.widget.a.l()
                ax.U.a.o(r5, r6)
                android.widget.ImageView r6 = r4.r
                r6.setVisibility(r2)
                android.widget.ImageView r6 = r4.r
                r6.setImageDrawable(r5)
                return
            Lab:
                if (r5 != 0) goto Lb2
                android.widget.ImageView r5 = r4.r
                r5.setVisibility(r1)
            Lb2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.widget.a.c.L(com.voxdon.xplorer.file.n, boolean, ax.S4.c$a):void");
        }

        private void M(int i2) {
            this.p.setImageResource(i2);
            ax.h0.e.c(this.p, ColorStateList.valueOf(a.this.u));
            this.p.setPadding(a.this.x, a.this.x, a.this.x, a.this.x);
            this.p.setVisibility(0);
            this.v = true;
        }

        private void N(String str) {
            ax.U2.f x = ax.U2.d.F(a.this.b).x(str);
            if (x != null) {
                this.p.setImageDrawable(null);
                a.this.W().s(x, this.p);
                ax.h0.e.c(this.p, null);
                this.p.setVisibility(0);
                this.p.setBackgroundDrawable(null);
                this.p.setPadding(a.this.x, a.this.x, a.this.x, a.this.x);
                this.v = true;
            }
        }

        private void O(int i2) {
            this.p.setImageResource(i2);
            this.p.setBackgroundResource(R.drawable.bg_subicon);
            this.p.setVisibility(0);
            this.v = true;
        }

        private boolean P(String str, boolean z) {
            ax.U2.f x = ax.U2.d.F(a.this.b).x(str);
            if (x == null) {
                if (!z) {
                    return false;
                }
                O(R.drawable.v_shape_folder_dir);
                return true;
            }
            if (!a.this.W().y(x, this.p)) {
                return false;
            }
            ax.h0.e.c(this.p, null);
            this.p.setBackgroundDrawable(null);
            this.p.setPadding(a.this.x, a.this.x, a.this.x, a.this.x);
            this.p.setVisibility(0);
            this.v = true;
            return true;
        }

        private void s() {
            int dimensionPixelSize;
            float dimension;
            View view;
            if (this.K != a.this.g) {
                Resources resources = this.l.getResources();
                this.K = a.this.g;
                if (a.this.f == 2) {
                    ImageView imageView = this.p;
                    if (imageView != null) {
                        I(resources, imageView, R.dimen.file_grid_folder_icon_size_medium, R.dimen.file_grid_folder_icon_size_large);
                        J(resources, this.p, R.dimen.file_grid_folder_icon_margintop_medium, R.dimen.file_grid_folder_icon_margintop_large);
                        return;
                    }
                    return;
                }
                if (a.this.f != 1 && a.this.f != 0) {
                    if (a.this.f != 10 || (view = this.m) == null) {
                        return;
                    }
                    I(resources, view, R.dimen.file_media_list_icon_size_medium, R.dimen.file_media_list_icon_size_large);
                    return;
                }
                View view2 = this.m;
                if (view2 != null) {
                    I(resources, view2, R.dimen.file_list_icon_size_medium, R.dimen.file_list_icon_size_large);
                    if (F()) {
                        dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.file_list_min_height_large);
                        dimension = resources.getDimension(R.dimen.file_list_filename_size_large);
                    } else {
                        dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.file_list_min_height_medium);
                        dimension = resources.getDimension(R.dimen.file_list_filename_size_normal);
                    }
                    this.u.setMinimumHeight(dimensionPixelSize);
                    this.g.setTextSize(0, dimension);
                }
                ImageView imageView2 = this.p;
                if (imageView2 != null) {
                    I(resources, imageView2, R.dimen.file_list_folder_icon_size_medium, R.dimen.file_list_folder_icon_size_large);
                    J(resources, this.p, R.dimen.file_list_folder_icon_margintop_medium, R.dimen.file_list_folder_icon_margintop_large);
                }
            }
        }

        private void u(long j2) {
            View view = this.a;
            if (view != null) {
                LayerDrawable layerDrawable = (LayerDrawable) view.getBackground().mutate();
                if (!a.this.h) {
                    layerDrawable.getDrawable(0).setLevel(0);
                    layerDrawable.getDrawable(1).setLevel(0);
                    return;
                }
                if (a.this.l > 0) {
                    layerDrawable.getDrawable(0).mutate().setLevel((int) ((j2 * 10000) / a.this.l));
                } else {
                    layerDrawable.getDrawable(0).setLevel(0);
                }
                if (a.this.k > 0) {
                    layerDrawable.getDrawable(1).setLevel((int) ((j2 * 10000) / a.this.k));
                } else {
                    layerDrawable.getDrawable(1).setLevel(0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v(AbstractC3595n abstractC3595n) {
            if (abstractC3595n.isDirectory()) {
                this.F = abstractC3595n.r(a.this.n);
                if (this.n.getTag() == null) {
                    if (this.F != 0 || !C1809B.P(abstractC3595n)) {
                        this.n.setImageDrawable(a.this.R(abstractC3595n, true, this.F));
                    } else if (((C3605y) abstractC3595n).S0()) {
                        this.n.setImageDrawable(a.this.R(abstractC3595n, true, 1));
                    } else {
                        this.n.setImageDrawable(a.this.R(abstractC3595n, true, this.F));
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void w(AbstractC3595n abstractC3595n) {
            if (a.this.f == 12) {
                if (abstractC3595n.isDirectory()) {
                    this.g.setText(D(abstractC3595n));
                    return;
                }
                return;
            }
            if (this.k != null) {
                if (!abstractC3595n.isDirectory()) {
                    this.k.setText(abstractC3595n.I(a.this.n));
                    return;
                }
                if (a.this.f == 10) {
                    if (this.F < 0) {
                        this.k.setText(HttpUrl.FRAGMENT_ENCODE_SET);
                        return;
                    }
                    this.k.setText(new SpannableString("(" + this.F + ")"));
                    return;
                }
                if (!a.this.i) {
                    this.k.setText(abstractC3595n.I(a.this.n));
                    return;
                }
                this.k.setText(abstractC3595n.I(a.this.n) + String.format(" (%s)", C1809B.i(a.this.getContext(), this.H)));
            }
        }

        private void x(AbstractC3595n abstractC3595n, boolean z, long j2, boolean z2) {
            boolean z3;
            ImageView imageView;
            this.w = z;
            this.y = j2;
            this.z = abstractC3595n.G();
            this.A = d0.j(abstractC3595n.B());
            this.B = abstractC3595n.s();
            this.x = abstractC3595n.Q();
            this.C = C1808A.q(abstractC3595n);
            this.D = z2;
            this.o.setVisibility(8);
            this.J = null;
            if (this.v && (imageView = this.p) != null) {
                imageView.setVisibility(8);
                a.this.W().g(this.p);
                this.v = false;
            }
            a.this.W().g(this.n);
            d dVar = this.I;
            if (dVar != null) {
                dVar.e();
                this.I = null;
            }
            this.n.setTag(null);
            this.H = 0L;
            this.L = false;
            TextView textView = this.g;
            if (textView instanceof GridFilenameTextView) {
                if (z) {
                    ((GridFilenameTextView) textView).setUseFilenameEllipsize(false);
                } else {
                    ((GridFilenameTextView) textView).setUseFilenameEllipsize(true);
                }
            }
            if (!z) {
                z3 = a.this.W().z(abstractC3595n, this.n, this.P);
            } else if (ax.Q2.f.m0(a.this.s)) {
                z3 = a.this.W().z(abstractC3595n, this.n, this.P);
                if (this.p != null && a.this.t) {
                    K(abstractC3595n, true);
                }
            } else {
                if (a.this.s == ax.Q2.f.l1) {
                    if (C3582a.U1(abstractC3595n)) {
                        z3 = a.this.W().z(abstractC3595n, this.n, this.P);
                    }
                } else if (this.p != null && a.this.t) {
                    K(abstractC3595n, false);
                }
                z3 = false;
            }
            this.F = -1;
            if (!z3) {
                this.n.setImageDrawable(a.this.R(abstractC3595n, z, -1));
            }
            if (abstractC3595n.l()) {
                this.q.setVisibility(0);
            } else {
                this.q.setVisibility(4);
            }
            if (this.g != null) {
                if (a.this.w0()) {
                    this.g.setVisibility(0);
                    this.E = true;
                } else {
                    this.g.setVisibility(8);
                    this.E = false;
                }
            }
            H(this.n, abstractC3595n.h());
        }

        /* JADX WARN: Removed duplicated region for block: B:127:0x02fb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:129:0x02fc  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x0245  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01c6  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0252  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void z(com.voxdon.xplorer.file.AbstractC3595n r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 802
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.widget.a.c.z(com.voxdon.xplorer.file.n, int, boolean):void");
        }

        public String A() {
            return this.x;
        }

        String C(AbstractC3595n abstractC3595n) {
            String s = d0.s(abstractC3595n);
            if ("/".equals(s)) {
                return "/";
            }
            return s + "/";
        }

        public void t() {
            this.x = null;
        }

        public void y(AbstractC3595n abstractC3595n, int i2) {
            AbstractC3595n abstractC3595n2;
            this.G = i2;
            if (abstractC3595n == null) {
                return;
            }
            s();
            boolean isDirectory = abstractC3595n.isDirectory();
            long q = abstractC3595n.q();
            boolean h2 = abstractC3595n.h();
            String str = this.x;
            if (str != null && str.equals(abstractC3595n.Q()) && this.w == isDirectory && this.y == q && this.D == h2 && this.E == a.this.w0()) {
                abstractC3595n2 = abstractC3595n;
            } else {
                abstractC3595n2 = abstractC3595n;
                x(abstractC3595n2, isDirectory, q, h2);
            }
            z(abstractC3595n2, i2, isDirectory);
        }
    }

    static class d extends AbstractC3199q<Void, Void, Void> {
        c h;
        AbstractC3595n i;
        f j;
        boolean k;
        String l;
        boolean m;
        boolean n;
        C3596o o;

        d(c cVar, C3596o c3596o, f fVar, AbstractC3595n abstractC3595n, boolean z, boolean z2, boolean z3) {
            super(AbstractC3199q.e.HIGH);
            this.o = c3596o;
            this.h = cVar;
            this.j = fVar;
            this.i = abstractC3595n;
            this.k = z;
            this.m = z2;
            this.n = z3;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Void g(Void... voidArr) {
            if (this.m && C1809B.P(this.i)) {
                this.l = ((C3605y) this.i).E0();
            }
            if (!this.n) {
                return null;
            }
            if (!this.i.isDirectory()) {
                this.i.p();
                return null;
            }
            if (!C1809B.P(this.i)) {
                return null;
            }
            ((C3605y) this.i).g1(this.k);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Void r2) {
            if (this.i.Q().equals(this.h.A())) {
                if (this.m) {
                    this.h.i.setText(this.l);
                }
                if (this.n) {
                    this.h.v(this.i);
                    this.h.w(this.i);
                }
            }
        }
    }

    public a(Context context, List<AbstractC3595n> list, C3596o c3596o, C2947d c2947d, int i, z zVar, boolean z, boolean z2) {
        super(context, 0, list);
        this.a = new Object();
        this.h = false;
        this.i = false;
        this.j = false;
        this.o = false;
        this.p = false;
        this.F = new TreeMap<>();
        this.b = context;
        this.d = c3596o;
        this.e = c2947d;
        this.m = zVar;
        this.p = z;
        f S = c3596o.S();
        this.s = S;
        this.E = z2;
        this.t = f.k0(S) || f.g0(this.s) || this.s == f.t0;
        if (O == null) {
            O = ax.Q.b.d(context, R.color.music_icon_not_playing);
            N = ax.Q.b.d(context, R.color.music_icon_playing);
        }
        f0();
        o0(i);
        Y();
    }

    private boolean C0() {
        return this.f == 2;
    }

    private void K() {
        this.F.clear();
        AbstractC3595n abstractC3595n = null;
        int i = 0;
        String str = null;
        int i2 = -1;
        int i3 = -1;
        while (i < getCount()) {
            AbstractC3595n abstractC3595n2 = (AbstractC3595n) getItem(i);
            if (abstractC3595n == null || !d0(abstractC3595n2, abstractC3595n)) {
                if (i2 >= 0 && i3 >= 0) {
                    this.F.put(Integer.valueOf(i3), new q(i3, i2, str));
                }
                str = Q(abstractC3595n2);
                i3 = i;
            }
            i2 = i;
            i++;
            abstractC3595n = abstractC3595n2;
        }
        if (i2 < 0 || i3 < 0) {
            return;
        }
        this.F.put(Integer.valueOf(i3), new q(i3, i2, str));
    }

    private String Q(AbstractC3595n abstractC3595n) {
        if (abstractC3595n instanceof C1826n) {
            return abstractC3595n.B();
        }
        int i = this.r;
        if (i == 1) {
            return abstractC3595n.H(this.L);
        }
        if (i == 2) {
            return abstractC3595n.A();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable R(AbstractC3595n abstractC3595n, boolean z, int i) {
        if (!z) {
            int i2 = this.f;
            return i2 == 2 ? abstractC3595n.M(getContext()) : i2 == 10 ? new InsetDrawable(abstractC3595n.M(getContext()), C3180B.e(getContext(), 4)) : (i2 == 12 || i2 == 16) ? new InsetDrawable(abstractC3595n.M(getContext()), C3180B.e(getContext(), 8)) : abstractC3595n.Y(getContext());
        }
        if (a0(this.f)) {
            return ax.s3.b.i(getContext(), abstractC3595n.P());
        }
        return ax.s3.b.g(getContext(), abstractC3595n, i != 0, C0());
    }

    private int T() {
        int i = this.f;
        if (i != 0 && i != 1) {
            if (i == 2) {
                return R.layout.filegrid_item;
            }
            if (i == 3) {
                return R.layout.searchlist_item;
            }
            if (i == 10) {
                return R.layout.file_media_list_item;
            }
            if (i == 12 || i == 16) {
                return R.layout.file_media_grid_item;
            }
            if (i != 20) {
                return 0;
            }
        }
        return this.q ? R.layout.filelist_item_with_section : R.layout.filelist_item;
    }

    private void Y() {
        f fVar = this.s;
        if (fVar == f.F0) {
            this.q = true;
            this.r = 1;
        } else if (fVar == f.m1 || fVar == f.n1) {
            this.q = true;
            this.r = 3;
        } else {
            this.q = false;
            this.r = 0;
        }
    }

    private boolean Z() {
        int i = this.f;
        return i == 2 || i == 16;
    }

    private boolean a0(int i) {
        return i == 10 || i == 12 || i == 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b0(AbstractC3595n abstractC3595n) {
        Set<String> set = this.M;
        if (set != null) {
            return set.contains(abstractC3595n.B());
        }
        return false;
    }

    private boolean c0(long j, long j2) {
        if (this.H == null) {
            this.H = new Date();
        }
        if (this.I == null) {
            this.I = new Date();
        }
        this.H.setTime(j);
        this.I.setTime(j2);
        return this.H.getYear() == this.I.getYear() && this.H.getMonth() == this.I.getMonth() && this.H.getDate() == this.I.getDate();
    }

    private boolean d0(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
        if (abstractC3595n instanceof C1826n) {
            C3184b.d(this.r == 3);
            return ((C1826n) abstractC3595n).z1() == ((C1826n) abstractC3595n2).z1();
        }
        int i = this.r;
        if (i == 1) {
            return c0(abstractC3595n.q(), abstractC3595n2.q());
        }
        if (i == 2) {
            return abstractC3595n.A().equals(abstractC3595n2.A());
        }
        C3184b.f();
        return true;
    }

    public void A0() {
        this.L = j.g(this.b);
    }

    public boolean B0() {
        return this.G && this.q;
    }

    public void L() {
        this.h = false;
        this.i = false;
        this.k = 0L;
        this.l = 0L;
    }

    public int M(int i, String str) {
        if (i < 0) {
            i = 0;
        }
        synchronized (this.a) {
            for (int i2 = i; i2 < getCount(); i2++) {
                try {
                    String B = ((AbstractC3595n) getItem(i2)).B();
                    if (B != null && B.toLowerCase().startsWith(str.toLowerCase())) {
                        return i2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i3 = 0; i3 < i && i3 < getCount(); i3++) {
                String B2 = ((AbstractC3595n) getItem(i3)).B();
                if (B2 != null && B2.toLowerCase().startsWith(str.toLowerCase())) {
                    return i3;
                }
            }
            return -1;
        }
    }

    public ArrayList<AbstractC3595n> N() {
        ArrayList<AbstractC3595n> arrayList;
        synchronized (this.a) {
            try {
                arrayList = new ArrayList<>();
                for (int i = 0; i < getCount(); i++) {
                    arrayList.add((AbstractC3595n) getItem(i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public int O(String str) {
        synchronized (this.a) {
            for (int i = 0; i < getCount(); i++) {
                try {
                    String B = ((AbstractC3595n) getItem(i)).B();
                    if (B != null && B.equals(str)) {
                        return i;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return -1;
        }
    }

    public ArrayList<AbstractC3595n> P() {
        ArrayList<AbstractC3595n> arrayList = new ArrayList<>();
        synchronized (this.a) {
            for (int i = 0; i < getCount(); i++) {
                try {
                    AbstractC3595n abstractC3595n = (AbstractC3595n) getItem(i);
                    if (C1808A.B(abstractC3595n, true)) {
                        arrayList.add(abstractC3595n);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public int S() {
        return this.g;
    }

    public q U(int i) {
        q qVar = this.F.get(Integer.valueOf(i));
        if (qVar != null) {
            return qVar;
        }
        Integer floorKey = this.F.floorKey(Integer.valueOf(i));
        if (floorKey != null) {
            return this.F.get(floorKey);
        }
        C3184b.g("position : " + i + ":" + getCount());
        return null;
    }

    public AbstractC3595n V(AbstractC3595n abstractC3595n) {
        String E = abstractC3595n.E();
        synchronized (this.a) {
            try {
                String l = d0.l(E);
                for (int i = 0; i < getCount(); i++) {
                    AbstractC3595n abstractC3595n2 = (AbstractC3595n) getItem(i);
                    if (abstractC3595n2 != null && abstractC3595n2.E().startsWith(l)) {
                        String A = abstractC3595n2.A();
                        if (C1808A.R(A)) {
                            if (abstractC3595n2.E().equals(l + "." + A)) {
                                return abstractC3595n2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C2947d W() {
        return this.e;
    }

    public boolean X(String str) {
        synchronized (this.a) {
            for (int i = 0; i < getCount(); i++) {
                try {
                    String E = ((AbstractC3595n) getItem(i)).E();
                    if (((AbstractC3595n) getItem(i)).P().W()) {
                        if (E.equalsIgnoreCase(str)) {
                            return true;
                        }
                    } else if (E.equals(str)) {
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return false;
        }
    }

    @Override // android.widget.ArrayAdapter
    public void addAll(Collection<? extends AbstractC3595n> collection) {
        synchronized (this.a) {
            super.addAll(collection);
        }
        if (this.q) {
            K();
        }
    }

    @Override // android.widget.ArrayAdapter
    public void clear() {
        synchronized (this.a) {
            super.clear();
        }
        if (this.q) {
            K();
        }
    }

    public boolean e0() {
        return this.c;
    }

    public void f0() {
        this.u = ax.Q.b.c(this.b, R.color.shape_invert);
        this.A = ax.Q.b.c(this.b, R.color.main_primary_text);
        this.B = ax.u3.z.n(this.b);
    }

    public void g0(boolean z) {
        this.C = z;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar;
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(T(), viewGroup, false);
            cVar = new c(view, viewGroup);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        try {
            cVar.y((AbstractC3595n) getItem(i), i);
            return view;
        } catch (IndexOutOfBoundsException e) {
            ax.Ha.c.h().f().d("!! INDEX OUT OF BOUND !!").l(e).h();
            return view;
        }
    }

    public void h0(long j, long j2) {
        this.h = true;
        this.i = true;
        this.k = j;
        this.l = j2;
    }

    public void i0(Set<String> set) {
        this.M = set;
    }

    public void j0(boolean z) {
        this.z = z;
    }

    public void k0(String str) {
        this.J = str;
    }

    public void l0(String str) {
        this.v = str;
    }

    public void m0(int i) {
        this.g = i;
    }

    public void n0(boolean z) {
        this.n = z;
    }

    public void o0(int i) {
        this.f = i;
        if (a0(i)) {
            this.x = C3180B.e(getContext(), 1);
        } else {
            this.x = C3180B.e(getContext(), 0);
        }
        notifyDataSetChanged();
    }

    public void p0(AdapterView.OnItemClickListener onItemClickListener) {
        this.D = onItemClickListener;
    }

    public void q0(boolean z) {
        boolean z2 = this.c != z;
        this.c = z;
        if (!z2 || z) {
            return;
        }
        notifyDataSetChanged();
    }

    public void r0(boolean z, int i) {
        this.q = z;
        if (z) {
            this.r = i;
            K();
        } else {
            this.r = 0;
            this.F.clear();
        }
    }

    public void s0(boolean z) {
        this.K = z;
    }

    public void t0(K k, String str) {
        if (!f.C0(k.d())) {
            this.y = true;
            return;
        }
        if (!C2265a.e(getContext()).m()) {
            this.y = false;
        } else if (e.i(this.b, k.d(), k.b(), str, false)) {
            this.y = true;
        } else {
            this.y = false;
        }
    }

    public void u0(boolean z) {
        if (this.q) {
            this.G = z;
        } else {
            this.G = false;
        }
    }

    public void v0() {
        this.i = true;
    }

    boolean w0() {
        return (this.z && Z()) ? false : true;
    }

    public void x0(boolean z) {
        this.j = z;
    }

    public void y0(boolean z) {
        this.o = z;
    }

    public boolean z0(List<AbstractC3595n> list, View view, int i, int i2, int i3) {
        if (!Q.M0()) {
            return false;
        }
        if (i >= getCount()) {
            ax.Q2.d.c("start darg", new Exception("index : " + i + ",count:" + getCount()));
            return false;
        }
        AbstractC3595n abstractC3595n = (AbstractC3595n) getItem(i);
        if (abstractC3595n == null || list == null || view == null || !C3203u.a(list)) {
            return false;
        }
        view.startDragAndDrop(C3203u.b(list, abstractC3595n), new C0537a(view, i2, i3), new ax.Z2.e(true), 257);
        return true;
    }
}
