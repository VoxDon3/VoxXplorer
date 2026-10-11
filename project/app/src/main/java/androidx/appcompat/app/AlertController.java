/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.B;
import androidx.core.widget.NestedScrollView;
import ax.c0.d0;
import ax.m.a;
import ax.m.j;
import ax.n.x;
import java.lang.ref.WeakReference;

class AlertController {
    NestedScrollView A;
    private int B = 0;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I = -1;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q = 0;
    Handler R;
    private final View.OnClickListener S = new View.OnClickListener(this){
        final AlertController a;
        {
            this.a = alertController;
        }

        public void onClick(View object) {
            Message message;
            AlertController alertController = this.a;
            if ((object = object == alertController.o && (message = alertController.q) != null ? Message.obtain((Message)message) : (object == alertController.s && (message = alertController.u) != null ? Message.obtain((Message)message) : (object == alertController.w && (object = alertController.y) != null ? Message.obtain((Message)object) : null))) != null) {
                object.sendToTarget();
            }
            object = this.a;
            object.R.obtainMessage(1, (Object)object.b).sendToTarget();
        }
    };
    private final Context a;
    final x b;
    private final Window c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    ListView g;
    private View h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n = false;
    Button o;
    private CharSequence p;
    Message q;
    private Drawable r;
    Button s;
    private CharSequence t;
    Message u;
    private Drawable v;
    Button w;
    private CharSequence x;
    Message y;
    private Drawable z;

    public AlertController(Context context, x x8, Window window) {
        this.a = context;
        this.b = x8;
        this.c = window;
        this.R = new g((DialogInterface)x8);
        context = context.obtainStyledAttributes(null, ax.m.j.F, ax.m.a.n, 0);
        this.J = context.getResourceId(ax.m.j.G, 0);
        this.K = context.getResourceId(ax.m.j.I, 0);
        this.L = context.getResourceId(ax.m.j.K, 0);
        this.M = context.getResourceId(ax.m.j.L, 0);
        this.N = context.getResourceId(ax.m.j.N, 0);
        this.O = context.getResourceId(ax.m.j.J, 0);
        this.P = context.getBoolean(ax.m.j.M, true);
        this.d = context.getDimensionPixelSize(ax.m.j.H, 0);
        context.recycle();
        x8.h(1);
    }

    private static boolean A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ax.m.a.m, typedValue, true);
        return typedValue.data != 0;
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        view = (ViewGroup)view;
        int n8 = view.getChildCount();
        while (n8 > 0) {
            int n9;
            n8 = n9 = n8 - 1;
            if (!AlertController.a(view.getChildAt(n9))) continue;
            return true;
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    }

    static void g(View view, View view2, View view3) {
        int n8;
        int n9 = 4;
        if (view2 != null) {
            n8 = view.canScrollVertically(-1) ? 0 : 4;
            view2.setVisibility(n8);
        }
        if (view3 != null) {
            n8 = n9;
            if (view.canScrollVertically(1)) {
                n8 = 0;
            }
            view3.setVisibility(n8);
        }
    }

    private ViewGroup j(View view, View view2) {
        ViewParent viewParent;
        if (view == null) {
            view = view2;
            if (view2 instanceof ViewStub) {
                view = ((ViewStub)view2).inflate();
            }
            return (ViewGroup)view;
        }
        if (view2 != null && (viewParent = view2.getParent()) instanceof ViewGroup) {
            ((ViewGroup)viewParent).removeView(view2);
        }
        view2 = view;
        if (view instanceof ViewStub) {
            view2 = ((ViewStub)view).inflate();
        }
        return (ViewGroup)view2;
    }

    private int k() {
        int n8 = this.K;
        if (n8 == 0) {
            return this.J;
        }
        if (this.Q == 1) {
            return n8;
        }
        return this.J;
    }

    private void q(ViewGroup viewGroup, View view, int n8, int n9) {
        View view2 = this.c.findViewById(ax.m.f.v);
        View view3 = this.c.findViewById(ax.m.f.u);
        if (Build.VERSION.SDK_INT >= 23) {
            d0.y0(view, n8, n9);
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
            if (view3 != null) {
                viewGroup.removeView(view3);
                return;
            }
        } else {
            view = view2;
            if (view2 != null) {
                view = view2;
                if ((n8 & 1) == 0) {
                    viewGroup.removeView(view2);
                    view = null;
                }
            }
            view2 = view3;
            if (view3 != null) {
                view2 = view3;
                if ((n8 & 2) == 0) {
                    viewGroup.removeView(view3);
                    view2 = null;
                }
            }
            if (view != null || view2 != null) {
                if (this.f != null) {
                    this.A.setOnScrollChangeListener(new NestedScrollView.d(){
                        final View a;
                        final View b;
                        final AlertController c;
                        {
                            this.c = alertController;
                            this.a = view;
                            this.b = view2;
                        }

                        @Override
                        public void a(NestedScrollView nestedScrollView, int n8, int n9, int n10, int n11) {
                            AlertController.g((View)nestedScrollView, this.a, this.b);
                        }
                    });
                    this.A.post(new Runnable(){
                        final View c0;
                        final AlertController d0;
                        final View q;
                        {
                            this.d0 = alertController;
                            this.q = view;
                            this.c0 = view2;
                        }

                        @Override
                        public void run() {
                            AlertController.g((View)this.d0.A, this.q, this.c0);
                        }
                    });
                    return;
                }
                view3 = this.g;
                if (view3 != null) {
                    view3.setOnScrollListener(new AbsListView.OnScrollListener(){
                        final View a;
                        final View b;
                        final AlertController c;
                        {
                            this.c = alertController;
                            this.a = view;
                            this.b = view2;
                        }

                        public void onScroll(AbsListView absListView, int n8, int n9, int n10) {
                            AlertController.g((View)absListView, this.a, this.b);
                        }

                        public void onScrollStateChanged(AbsListView absListView, int n8) {
                        }
                    });
                    this.g.post(new Runnable(){
                        final View c0;
                        final AlertController d0;
                        final View q;
                        {
                            this.d0 = alertController;
                            this.q = view;
                            this.c0 = view2;
                        }

                        @Override
                        public void run() {
                            AlertController.g((View)this.d0.g, this.q, this.c0);
                        }
                    });
                    return;
                }
                if (view != null) {
                    viewGroup.removeView(view);
                }
                if (view2 != null) {
                    viewGroup.removeView(view2);
                }
            }
        }
    }

    private void v(ViewGroup viewGroup) {
        int n8;
        int n9;
        Button button;
        this.o = button = (Button)viewGroup.findViewById(16908313);
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty((CharSequence)this.p) && this.r == null) {
            this.o.setVisibility(8);
            n9 = 0;
        } else {
            this.o.setText(this.p);
            button = this.r;
            if (button != null) {
                n9 = this.d;
                button.setBounds(0, 0, n9, n9);
                this.o.setCompoundDrawables(this.r, null, null, null);
            }
            this.o.setVisibility(0);
            n9 = 1;
        }
        this.s = button = (Button)viewGroup.findViewById(16908314);
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty((CharSequence)this.t) && this.v == null) {
            this.s.setVisibility(8);
        } else {
            this.s.setText(this.t);
            button = this.v;
            if (button != null) {
                n8 = this.d;
                button.setBounds(0, 0, n8, n8);
                this.s.setCompoundDrawables(this.v, null, null, null);
            }
            this.s.setVisibility(0);
            n9 |= 2;
        }
        this.w = button = (Button)viewGroup.findViewById(16908315);
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty((CharSequence)this.x) && this.z == null) {
            this.w.setVisibility(8);
        } else {
            this.w.setText(this.x);
            button = this.z;
            if (button != null) {
                n8 = this.d;
                button.setBounds(0, 0, n8, n8);
                this.w.setCompoundDrawables(this.z, null, null, null);
            }
            this.w.setVisibility(0);
            n9 |= 4;
        }
        if (AlertController.A(this.a)) {
            if (n9 == 1) {
                this.b(this.o);
            } else if (n9 == 2) {
                this.b(this.s);
            } else if (n9 == 4) {
                this.b(this.w);
            }
        }
        if (n9 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void w(ViewGroup viewGroup) {
        TextView textView;
        Object object = (NestedScrollView)this.c.findViewById(ax.m.f.w);
        this.A = object;
        object.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        this.F = textView = (TextView)viewGroup.findViewById(16908299);
        if (textView == null) {
            return;
        }
        object = this.f;
        if (object != null) {
            textView.setText((CharSequence)object);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView((View)this.F);
        if (this.g != null) {
            viewGroup = (ViewGroup)this.A.getParent();
            int n8 = viewGroup.indexOfChild((View)this.A);
            viewGroup.removeViewAt(n8);
            viewGroup.addView((View)this.g, n8, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        Object object = this.h;
        boolean bl = false;
        if (object == null) {
            object = this.i != 0 ? LayoutInflater.from((Context)this.a).inflate(this.i, viewGroup, false) : null;
        }
        if (object != null) {
            bl = true;
        }
        if (!bl || !AlertController.a(object)) {
            this.c.setFlags(131072, 131072);
        }
        if (bl) {
            FrameLayout frameLayout = (FrameLayout)this.c.findViewById(ax.m.f.n);
            frameLayout.addView(object, new ViewGroup.LayoutParams(-1, -1));
            if (this.n) {
                frameLayout.setPadding(this.j, this.k, this.l, this.m);
            }
            if (this.g != null) {
                ((B.a)viewGroup.getLayoutParams()).weight = 0.0f;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void y(ViewGroup viewGroup) {
        if (this.G != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            viewGroup.addView(this.G, 0, layoutParams);
            this.c.findViewById(ax.m.f.F).setVisibility(8);
            return;
        }
        this.D = (ImageView)this.c.findViewById(16908294);
        if (!TextUtils.isEmpty((CharSequence)this.e) && this.P) {
            viewGroup = (TextView)this.c.findViewById(ax.m.f.j);
            this.E = viewGroup;
            viewGroup.setText(this.e);
            int n8 = this.B;
            if (n8 != 0) {
                this.D.setImageResource(n8);
                return;
            }
            viewGroup = this.C;
            if (viewGroup != null) {
                this.D.setImageDrawable((Drawable)viewGroup);
                return;
            }
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
            return;
        }
        this.c.findViewById(ax.m.f.F).setVisibility(8);
        this.D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    private void z() {
        Object object = this.c.findViewById(ax.m.f.t);
        int n8 = ax.m.f.G;
        View view = object.findViewById(n8);
        int n9 = ax.m.f.m;
        View view2 = object.findViewById(n9);
        int n10 = ax.m.f.k;
        View view3 = object.findViewById(n10);
        object = (ViewGroup)object.findViewById(ax.m.f.o);
        this.x((ViewGroup)object);
        View view4 = object.findViewById(n8);
        View view5 = object.findViewById(n9);
        View view6 = object.findViewById(n10);
        view = this.j(view4, view);
        view2 = this.j(view5, view2);
        view3 = this.j(view6, view3);
        this.w((ViewGroup)view2);
        this.v((ViewGroup)view3);
        this.y((ViewGroup)view);
        n9 = object.getVisibility();
        n8 = 0;
        n9 = n9 != 8 ? 1 : 0;
        int n11 = view != null && view.getVisibility() != 8 ? 1 : 0;
        boolean bl = view3 != null && view3.getVisibility() != 8;
        if (!bl && view2 != null && (object = view2.findViewById(ax.m.f.B)) != null) {
            object.setVisibility(0);
        }
        if (n11 != 0) {
            object = this.A;
            if (object != null) {
                object.setClipToPadding(true);
            }
            object = this.f == null && this.g == null ? null : view.findViewById(ax.m.f.E);
            if (object != null) {
                object.setVisibility(0);
            }
        } else if (view2 != null && (object = view2.findViewById(ax.m.f.C)) != null) {
            object.setVisibility(0);
        }
        if ((object = this.g) instanceof RecycleListView) {
            ((RecycleListView)((Object)object)).a(n11 != 0, bl);
        }
        if (n9 == 0) {
            object = this.g;
            if (object == null) {
                object = this.A;
            }
            if (object != null) {
                n9 = n8;
                if (bl) {
                    n9 = 2;
                }
                this.q((ViewGroup)view2, (View)object, n11 | n9, 3);
            }
        }
        if ((object = this.g) != null && (view2 = this.H) != null) {
            object.setAdapter((ListAdapter)view2);
            n9 = this.I;
            if (n9 > -1) {
                object.setItemChecked(n9, true);
                object.setSelection(n9);
            }
        }
    }

    public Button c(int n8) {
        if (n8 != -3) {
            if (n8 != -2) {
                if (n8 != -1) {
                    return null;
                }
                return this.o;
            }
            return this.s;
        }
        return this.w;
    }

    public int d(int n8) {
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(n8, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.g;
    }

    public void f() {
        int n8 = this.k();
        this.b.setContentView(n8);
        this.z();
    }

    public boolean h(int n8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean i(int n8, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void l(int n8, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message message2 = message;
        if (message == null) {
            message2 = message;
            if (onClickListener != null) {
                message2 = this.R.obtainMessage(n8, (Object)onClickListener);
            }
        }
        if (n8 != -3) {
            if (n8 != -2) {
                if (n8 == -1) {
                    this.p = charSequence;
                    this.q = message2;
                    this.r = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.t = charSequence;
            this.u = message2;
            this.v = drawable;
            return;
        }
        this.x = charSequence;
        this.y = message2;
        this.z = drawable;
    }

    public void m(View view) {
        this.G = view;
    }

    public void n(int n8) {
        this.C = null;
        this.B = n8;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (n8 != 0) {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void o(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void p(CharSequence charSequence) {
        this.f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(int n8) {
        this.h = null;
        this.i = n8;
        this.n = false;
    }

    public void t(View view) {
        this.h = view;
        this.i = 0;
        this.n = false;
    }

    public void u(View view, int n8, int n9, int n10, int n11) {
        this.h = view;
        this.i = 0;
        this.n = true;
        this.j = n8;
        this.k = n9;
        this.l = n10;
        this.m = n11;
    }

    public static class RecycleListView
    extends ListView {
        private final int a;
        private final int b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, ax.m.j.c2);
            this.b = context.getDimensionPixelOffset(ax.m.j.d2, -1);
            this.a = context.getDimensionPixelOffset(ax.m.j.e2, -1);
        }

        public void a(boolean bl, boolean bl2) {
            if (bl2 && bl) {
                return;
            }
            int n8 = this.getPaddingLeft();
            int n9 = bl ? this.getPaddingTop() : this.a;
            int n10 = this.getPaddingRight();
            int n11 = bl2 ? this.getPaddingBottom() : this.b;
            this.setPadding(n8, n9, n10, n11);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;
        public boolean O = true;
        public final Context a;
        public final LayoutInflater b;
        public int c = 0;
        public Drawable d;
        public int e = 0;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public Drawable j;
        public DialogInterface.OnClickListener k;
        public CharSequence l;
        public Drawable m;
        public DialogInterface.OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface.OnClickListener q;
        public boolean r;
        public DialogInterface.OnCancelListener s;
        public DialogInterface.OnDismissListener t;
        public DialogInterface.OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface.OnClickListener x;
        public int y;
        public View z;

        public f(Context context) {
            this.a = context;
            this.r = true;
            this.b = (LayoutInflater)context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            Object object;
            RecycleListView recycleListView = (RecycleListView)this.b.inflate(alertController.L, null);
            if (this.G) {
                object = this.K == null ? new ArrayAdapter<CharSequence>(this, this.a, alertController.M, 16908308, this.v, recycleListView){
                    final RecycleListView a;
                    final f b;
                    {
                        this.b = f8;
                        this.a = recycleListView;
                        super(context, n8, n9, (Object[])charSequenceArray);
                    }

                    public View getView(int n8, View object, ViewGroup viewGroup) {
                        viewGroup = super.getView(n8, object, viewGroup);
                        object = this.b.F;
                        if (object != null && object[n8] != false) {
                            this.a.setItemChecked(n8, true);
                        }
                        return viewGroup;
                    }
                } : new CursorAdapter(this, this.a, this.K, false, recycleListView, alertController){
                    private final int a;
                    private final int b;
                    final RecycleListView c;
                    final AlertController d;
                    final f e;
                    {
                        this.e = f8;
                        this.c = recycleListView;
                        this.d = alertController;
                        super(context, cursor, bl);
                        context = this.getCursor();
                        this.a = context.getColumnIndexOrThrow(f8.L);
                        this.b = context.getColumnIndexOrThrow(f8.M);
                    }

                    public void bindView(View object, Context context, Cursor cursor) {
                        ((CheckedTextView)object.findViewById(16908308)).setText((CharSequence)cursor.getString(this.a));
                        object = this.c;
                        int n8 = cursor.getPosition();
                        int n9 = cursor.getInt(this.b);
                        boolean bl = true;
                        if (n9 != 1) {
                            bl = false;
                        }
                        object.setItemChecked(n8, bl);
                    }

                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return this.e.b.inflate(this.d.M, viewGroup, false);
                    }
                };
            } else {
                int n8 = this.H ? alertController.N : alertController.O;
                if (this.K != null) {
                    object = new SimpleCursorAdapter(this.a, n8, this.K, new String[]{this.L}, new int[]{16908308});
                } else {
                    object = this.w;
                    if (object == null) {
                        object = new h(this.a, n8, 16908308, this.v);
                    }
                }
            }
            alertController.H = object;
            alertController.I = this.I;
            if (this.x != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    final AlertController a;
                    final f b;
                    {
                        this.b = f8;
                        this.a = alertController;
                    }

                    public void onItemClick(AdapterView<?> adapterView, View view, int n8, long l8) {
                        this.b.x.onClick((DialogInterface)this.a.b, n8);
                        if (!this.b.H) {
                            this.a.b.dismiss();
                        }
                    }
                });
            } else if (this.J != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                    final RecycleListView a;
                    final AlertController b;
                    final f c;
                    {
                        this.c = f8;
                        this.a = recycleListView;
                        this.b = alertController;
                    }

                    public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                        object = this.c.F;
                        if (object != null) {
                            object[n8] = (AdapterView<?>)this.a.isItemChecked(n8);
                        }
                        this.c.J.onClick((DialogInterface)this.b.b, n8, this.a.isItemChecked(n8));
                    }
                });
            }
            object = this.N;
            if (object != null) {
                recycleListView.setOnItemSelectedListener((AdapterView.OnItemSelectedListener)object);
            }
            if (this.H) {
                recycleListView.setChoiceMode(1);
            } else if (this.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.g = recycleListView;
        }

        public void a(AlertController alertController) {
            int n8;
            Object object = this.g;
            if (object != null) {
                alertController.m((View)object);
            } else {
                object = this.f;
                if (object != null) {
                    alertController.r((CharSequence)object);
                }
                if ((object = this.d) != null) {
                    alertController.o((Drawable)object);
                }
                if ((n8 = this.c) != 0) {
                    alertController.n(n8);
                }
                if ((n8 = this.e) != 0) {
                    alertController.n(alertController.d(n8));
                }
            }
            object = this.h;
            if (object != null) {
                alertController.p((CharSequence)object);
            }
            if ((object = this.i) != null || this.j != null) {
                alertController.l(-1, (CharSequence)object, this.k, null, this.j);
            }
            object = this.l;
            if (object != null || this.m != null) {
                alertController.l(-2, (CharSequence)object, this.n, null, this.m);
            }
            if ((object = this.o) != null || this.p != null) {
                alertController.l(-3, (CharSequence)object, this.q, null, this.p);
            }
            if (this.v != null || this.K != null || this.w != null) {
                this.b(alertController);
            }
            if ((object = this.z) != null) {
                if (this.E) {
                    alertController.u((View)object, this.A, this.B, this.C, this.D);
                    return;
                }
                alertController.t((View)object);
                return;
            }
            n8 = this.y;
            if (n8 != 0) {
                alertController.s(n8);
            }
        }
    }

    private static final class g
    extends Handler {
        private WeakReference<DialogInterface> a;

        public g(DialogInterface dialogInterface) {
            this.a = new WeakReference<DialogInterface>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int n8 = message.what;
            if (n8 != -3 && n8 != -2 && n8 != -1) {
                if (n8 != 1) {
                    return;
                }
                ((DialogInterface)message.obj).dismiss();
                return;
            }
            ((DialogInterface.OnClickListener)message.obj).onClick((DialogInterface)this.a.get(), message.what);
        }
    }

    private static class h
    extends ArrayAdapter<CharSequence> {
        public h(Context context, int n8, int n9, CharSequence[] charSequenceArray) {
            super(context, n8, n9, (Object[])charSequenceArray);
        }

        public long getItemId(int n8) {
            return n8;
        }

        public boolean hasStableIds() {
            return true;
        }
    }
}

