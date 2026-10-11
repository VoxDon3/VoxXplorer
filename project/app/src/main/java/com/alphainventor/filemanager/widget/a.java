/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import ax.Q2.p;
import ax.S4.c;
import ax.T2.h;
import ax.U2.f;
import ax.X2.Q;
import ax.Z2.e;
import ax.Z2.q;
import ax.c3.A;
import ax.c3.B;
import ax.c3.C;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.n;
import ax.c3.z;
import ax.t3.j;
import ax.t3.k;
import ax.u3.q;
import ax.u3.u;
import ax.x3.r;
import com.alphainventor.filemanager.file.J;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.file.y;
import com.alphainventor.filemanager.widget.ActivatableFrameLayout;
import com.alphainventor.filemanager.widget.FileListView;
import com.alphainventor.filemanager.widget.GridFilenameTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class a
extends ArrayAdapter<com.alphainventor.filemanager.file.n> {
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
    private o d;
    private ax.r3.d e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private ax.x3.z m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private ax.Q2.f s;
    private boolean t;
    private int u;
    private String v;
    private int w;
    private int x;
    private boolean y;
    private boolean z;

    public a(Context context, List<com.alphainventor.filemanager.file.n> object, o o8, ax.r3.d d8, int n8, ax.x3.z z8, boolean bl, boolean bl2) {
        block5: {
            block4: {
                boolean bl3 = false;
                super(context, 0, object);
                this.a = new Object();
                this.h = false;
                this.i = false;
                this.j = false;
                this.o = false;
                this.p = false;
                this.F = new TreeMap();
                this.b = context;
                this.d = o8;
                this.e = d8;
                this.m = z8;
                this.p = bl;
                object = o8.S();
                this.s = object;
                this.E = bl2;
                if (ax.Q2.f.k0(object) || ax.Q2.f.g0(this.s)) break block4;
                bl = bl3;
                if (this.s != ax.Q2.f.t0) break block5;
            }
            bl = true;
        }
        this.t = bl;
        if (O == null) {
            O = ax.Q.b.d(context, 2131100722);
            N = ax.Q.b.d(context, 2131100723);
        }
        this.f0();
        this.o0(n8);
        this.Y();
    }

    static /* synthetic */ boolean A(a a8) {
        return a8.y;
    }

    private boolean C0() {
        return this.f == 2;
    }

    static /* synthetic */ int H(a a8, int n8) {
        a8.w = n8;
        return n8;
    }

    private void K() {
        this.F.clear();
        com.alphainventor.filemanager.file.n n8 = null;
        int n9 = 0;
        String string = null;
        int n10 = -1;
        int n11 = -1;
        while (n9 < this.getCount()) {
            int n12;
            String string2;
            com.alphainventor.filemanager.file.n n13;
            block7: {
                block6: {
                    n13 = (com.alphainventor.filemanager.file.n)this.getItem(n9);
                    if (n8 == null) break block6;
                    string2 = string;
                    n12 = n11;
                    if (this.d0(n13, n8)) break block7;
                }
                if (n10 >= 0 && n11 >= 0) {
                    this.F.put(n11, new q(n11, n10, string));
                }
                string2 = this.Q(n13);
                n12 = n9;
            }
            n10 = n9++;
            n8 = n13;
            string = string2;
            n11 = n12;
        }
        if (n10 >= 0 && n11 >= 0) {
            this.F.put(n11, new q(n11, n10, string));
        }
    }

    private String Q(com.alphainventor.filemanager.file.n n8) {
        if (n8 instanceof n) {
            return n8.B();
        }
        int n9 = this.r;
        if (n9 == 1) {
            return n8.H(this.L);
        }
        if (n9 == 2) {
            return n8.A();
        }
        return null;
    }

    private Drawable R(com.alphainventor.filemanager.file.n n8, boolean bl, int n9) {
        if (bl) {
            if (this.a0(this.f)) {
                return ax.s3.b.i(this.getContext(), n8.P());
            }
            Context context = this.getContext();
            bl = n9 != 0;
            return ax.s3.b.g(context, n8, bl, this.C0());
        }
        n9 = this.f;
        if (n9 == 2) {
            return n8.M(this.getContext());
        }
        if (n9 == 10) {
            return new InsetDrawable(n8.M(this.getContext()), ax.u3.B.e(this.getContext(), 4));
        }
        if (n9 != 12 && n9 != 16) {
            return n8.Y(this.getContext());
        }
        return new InsetDrawable(n8.M(this.getContext()), ax.u3.B.e(this.getContext(), 8));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int T() {
        int n8 = this.f;
        if (n8 != 0 && n8 != 1) {
            if (n8 == 2) return 2131558540;
            if (n8 == 3) return 2131558689;
            if (n8 == 10) return 2131558538;
            if (n8 == 12 || n8 == 16) return 2131558537;
            if (n8 != 20) {
                return 0;
            }
        }
        if (!this.q) return 2131558542;
        return 2131558547;
    }

    private void Y() {
        ax.Q2.f f8 = this.s;
        if (f8 == ax.Q2.f.F0) {
            this.q = true;
            this.r = 1;
            return;
        }
        if (f8 != ax.Q2.f.m1 && f8 != ax.Q2.f.n1) {
            this.q = false;
            this.r = 0;
            return;
        }
        this.q = true;
        this.r = 3;
    }

    private boolean Z() {
        int n8 = this.f;
        return n8 == 2 || n8 == 16;
        {
        }
    }

    private boolean a0(int n8) {
        return n8 == 10 || n8 == 12 || n8 == 16;
        {
        }
    }

    private boolean b0(com.alphainventor.filemanager.file.n n8) {
        Set<String> set = this.M;
        if (set != null) {
            return set.contains(n8.B());
        }
        return false;
    }

    private boolean c0(long l8, long l9) {
        if (this.H == null) {
            this.H = new Date();
        }
        if (this.I == null) {
            this.I = new Date();
        }
        this.H.setTime(l8);
        this.I.setTime(l9);
        return this.H.getYear() == this.I.getYear() && this.H.getMonth() == this.I.getMonth() && this.H.getDate() == this.I.getDate();
    }

    private boolean d0(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
        if (n8 instanceof n) {
            boolean bl = this.r == 3;
            ax.u3.b.d(bl);
            return ((n)n8).z1() == ((n)n9).z1();
        }
        int n10 = this.r;
        if (n10 == 1) {
            return this.c0(n8.q(), n9.q());
        }
        if (n10 == 2) {
            return n8.A().equals(n9.A());
        }
        ax.u3.b.f();
        return true;
    }

    static /* synthetic */ int p(a a8) {
        return a8.A;
    }

    static /* synthetic */ int q(a a8) {
        return a8.B;
    }

    static /* synthetic */ boolean s(a a8, com.alphainventor.filemanager.file.n n8) {
        return a8.b0(n8);
    }

    static /* synthetic */ boolean t(a a8) {
        return a8.q;
    }

    static /* synthetic */ TreeMap u(a a8) {
        return a8.F;
    }

    static /* synthetic */ boolean v(a a8) {
        return a8.G;
    }

    static /* synthetic */ boolean w(a a8) {
        return a8.K;
    }

    static /* synthetic */ int x(a a8) {
        return a8.L;
    }

    static /* synthetic */ o z(a a8) {
        return a8.d;
    }

    public void A0() {
        this.L = ax.t3.j.g(this.b);
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int M(int n8, String string) {
        int n9 = 0;
        int n10 = n8;
        if (n8 < 0) {
            n10 = 0;
        }
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                String string2;
                n8 = n10;
                while (true) {
                    try {
                        if (n8 >= this.getCount()) break;
                        string2 = ((com.alphainventor.filemanager.file.n)this.getItem(n8)).B();
                        if (string2 != null && string2.toLowerCase().startsWith(string.toLowerCase())) {
                            return n8;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    ++n8;
                }
                {
                    for (int i8 = n9; i8 < n10 && i8 < this.getCount(); ++i8) {
                        string2 = ((com.alphainventor.filemanager.file.n)this.getItem(i8)).B();
                        if (string2 == null || !string2.toLowerCase().startsWith(string.toLowerCase())) continue;
                        return i8;
                    }
                }
                return -1;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ArrayList<com.alphainventor.filemanager.file.n> N() {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                ArrayList<com.alphainventor.filemanager.file.n> arrayList;
                try {
                    arrayList = new ArrayList<com.alphainventor.filemanager.file.n>();
                    for (int i8 = 0; i8 < this.getCount(); ++i8) {
                        arrayList.add((com.alphainventor.filemanager.file.n)this.getItem(i8));
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return arrayList;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int O(String string) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                int n8 = 0;
                while (true) {
                    try {
                        if (n8 >= this.getCount()) break;
                        String string2 = ((com.alphainventor.filemanager.file.n)this.getItem(n8)).B();
                        if (string2 != null && string2.equals(string)) {
                            return n8;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    ++n8;
                }
                return -1;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ArrayList<com.alphainventor.filemanager.file.n> P() {
        ArrayList<com.alphainventor.filemanager.file.n> arrayList = new ArrayList<com.alphainventor.filemanager.file.n>();
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                int n8 = 0;
                while (true) {
                    block5: {
                        try {
                            if (n8 >= this.getCount()) break;
                            com.alphainventor.filemanager.file.n n9 = (com.alphainventor.filemanager.file.n)this.getItem(n8);
                            if (!ax.c3.A.B(n9, true)) break block5;
                            arrayList.add(n9);
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    ++n8;
                }
                return arrayList;
            }
            throw throwable2;
        }
    }

    public int S() {
        return this.g;
    }

    public q U(int n8) {
        Object object = this.F.get(n8);
        if (object == null) {
            object = this.F.floorKey(n8);
            if (object == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("position : ");
                ((StringBuilder)object).append(n8);
                ((StringBuilder)object).append(":");
                ((StringBuilder)object).append(this.getCount());
                ax.u3.b.g(((StringBuilder)object).toString());
                return null;
            }
            return this.F.get(object);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public com.alphainventor.filemanager.file.n V(com.alphainventor.filemanager.file.n object) {
        String string = ((com.alphainventor.filemanager.file.n)object).E();
        object = this.a;
        synchronized (object) {
            try {
                string = d0.l(string);
                for (int i8 = 0; i8 < this.getCount(); ++i8) {
                    String string2;
                    com.alphainventor.filemanager.file.n n8 = (com.alphainventor.filemanager.file.n)this.getItem(i8);
                    if (n8 == null || !n8.E().startsWith(string) || !ax.c3.A.R(string2 = n8.A())) continue;
                    CharSequence charSequence = new StringBuilder();
                    charSequence.append(string);
                    charSequence.append(".");
                    charSequence.append(string2);
                    charSequence = charSequence.toString();
                    if (!n8.E().equals(charSequence)) continue;
                    return n8;
                }
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public ax.r3.d W() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean X(String string) {
        Object object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block9: {
                int n8 = 0;
                while (true) {
                    block8: {
                        String string2;
                        block7: {
                            try {
                                if (n8 >= this.getCount()) break;
                                string2 = ((com.alphainventor.filemanager.file.n)this.getItem(n8)).E();
                                if (!((com.alphainventor.filemanager.file.n)this.getItem(n8)).P().W()) break block7;
                                if (string2.equalsIgnoreCase(string)) {
                                    return true;
                                }
                                break block8;
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        if (string2.equals(string)) {
                            return true;
                        }
                    }
                    ++n8;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void addAll(Collection<? extends com.alphainventor.filemanager.file.n> collection) {
        Object object = this.a;
        // MONITORENTER : object
        super.addAll(collection);
        // MONITOREXIT : object
        if (!this.q) return;
        this.K();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void clear() {
        Object object = this.a;
        // MONITORENTER : object
        super.clear();
        // MONITOREXIT : object
        if (!this.q) return;
        this.K();
    }

    public boolean e0() {
        return this.c;
    }

    public void f0() {
        this.u = ax.Q.b.c(this.b, 2131100812);
        this.A = ax.Q.b.c(this.b, 2131100497);
        this.B = ax.u3.z.n(this.b);
    }

    public void g0(boolean bl) {
        this.C = bl;
    }

    public View getView(int n8, View view, ViewGroup object) {
        if (view == null) {
            view = LayoutInflater.from((Context)this.b).inflate(this.T(), (ViewGroup)object, false);
            object = new c(this, view, (ViewGroup)object);
            view.setTag(object);
        } else {
            object = (c)view.getTag();
        }
        try {
            ((c)object).y((com.alphainventor.filemanager.file.n)this.getItem(n8), n8);
            return view;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            ax.Ha.c.h().f().d("!! INDEX OUT OF BOUND !!").l(indexOutOfBoundsException).h();
            return view;
        }
    }

    public void h0(long l8, long l9) {
        this.h = true;
        this.i = true;
        this.k = l8;
        this.l = l9;
    }

    public void i0(Set<String> set) {
        this.M = set;
    }

    public void j0(boolean bl) {
        this.z = bl;
    }

    public void k0(String string) {
        this.J = string;
    }

    public void l0(String string) {
        this.v = string;
    }

    public void m0(int n8) {
        this.g = n8;
    }

    public void n0(boolean bl) {
        this.n = bl;
    }

    public void o0(int n8) {
        this.f = n8;
        this.x = this.a0(n8) ? ax.u3.B.e(this.getContext(), 1) : ax.u3.B.e(this.getContext(), 0);
        this.notifyDataSetChanged();
    }

    public void p0(AdapterView.OnItemClickListener onItemClickListener) {
        this.D = onItemClickListener;
    }

    public void q0(boolean bl) {
        boolean bl2 = this.c != bl;
        this.c = bl;
        if (bl2 && !bl) {
            this.notifyDataSetChanged();
        }
    }

    public void r0(boolean bl, int n8) {
        this.q = bl;
        if (bl) {
            this.r = n8;
            this.K();
            return;
        }
        this.r = 0;
        this.F.clear();
    }

    public void s0(boolean bl) {
        this.K = bl;
    }

    public void t0(K k8, String string) {
        if (ax.Q2.f.C0(k8.d())) {
            if (!ax.i3.a.e(this.getContext()).m()) {
                this.y = false;
                return;
            }
            if (!ax.t3.e.i(this.b, k8.d(), k8.b(), string, false)) {
                this.y = false;
                return;
            }
            this.y = true;
            return;
        }
        this.y = true;
    }

    public void u0(boolean bl) {
        if (this.q) {
            this.G = bl;
            return;
        }
        this.G = false;
    }

    public void v0() {
        this.i = true;
    }

    boolean w0() {
        return !this.z || !this.Z();
        {
        }
    }

    public void x0(boolean bl) {
        this.j = bl;
    }

    public void y0(boolean bl) {
        this.o = bl;
    }

    public boolean z0(List<com.alphainventor.filemanager.file.n> object, View view, int n8, int n9, int n10) {
        if (!Q.M0()) {
            return false;
        }
        if (n8 >= this.getCount()) {
            object = new StringBuilder();
            ((StringBuilder)object).append("index : ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(",count:");
            ((StringBuilder)object).append(this.getCount());
            ax.Q2.d.c("start darg", new Exception(((StringBuilder)object).toString()));
            return false;
        }
        com.alphainventor.filemanager.file.n n11 = (com.alphainventor.filemanager.file.n)this.getItem(n8);
        if (n11 == null) {
            return false;
        }
        if (object == null) {
            return false;
        }
        if (view == null) {
            return false;
        }
        if (!ax.u3.u.a((List<com.alphainventor.filemanager.file.n>)object)) {
            return false;
        }
        ax.x3.p.a(view, ax.u3.u.b((List<com.alphainventor.filemanager.file.n>)object, n11), new View.DragShadowBuilder(this, view, n9, n10){
            final int a;
            final int b;
            final a c;
            {
                this.c = a8;
                this.a = n8;
                this.b = n9;
                super(view);
            }

            public void onDrawShadow(Canvas canvas) {
                canvas.drawColor(ax.x3.q.a(this.c.getContext(), 2131100494));
                super.onDrawShadow(canvas);
            }

            public void onProvideShadowMetrics(Point point, Point point2) {
                View view = this.getView();
                if (view != null) {
                    point.set(view.getWidth(), view.getHeight());
                    point2.set(this.a, this.b);
                }
            }
        }, new e(true), 257);
        return true;
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
        private C.a J;
        private int K;
        private boolean L;
        private int M;
        private int N;
        private int O;
        final Runnable P;
        final a Q;
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
        private z z;

        public c(a a8, View view, ViewGroup viewGroup) {
            this.Q = a8;
            this.K = -1;
            this.L = false;
            this.M = 0;
            this.P = new Runnable(this){
                final c q;
                {
                    this.q = c8;
                }

                @Override
                public void run() {
                    if (this.q.z == ax.c3.z.n0) {
                        com.alphainventor.filemanager.widget.a$c.f(this.q, true);
                        com.alphainventor.filemanager.widget.a$c.g(this.q, 2131231245);
                        this.q.r.setImageResource(2131231245);
                        this.q.r.setVisibility(0);
                        this.q.r.setBackgroundResource(0);
                        return;
                    }
                    if ("epub".equals(this.q.A)) {
                        com.alphainventor.filemanager.widget.a$c.f(this.q, true);
                        com.alphainventor.filemanager.widget.a$c.g(this.q, 2131231244);
                        this.q.r.setImageResource(2131231244);
                        this.q.r.setVisibility(0);
                        this.q.r.setBackgroundResource(0);
                        return;
                    }
                    if (!(this.q.z == ax.c3.z.e0 || this.q.B != null && this.q.B.startsWith("video"))) {
                        if (this.q.z == ax.c3.z.f0 && ax.c3.A.O(this.q.A)) {
                            com.alphainventor.filemanager.widget.a$c.f(this.q, true);
                            com.alphainventor.filemanager.widget.a$c.g(this.q, 2131231246);
                            this.q.r.setImageResource(2131231246);
                            this.q.r.setVisibility(0);
                            this.q.r.setBackgroundResource(0);
                        }
                        return;
                    }
                    this.q.o.setVisibility(0);
                }
            };
            this.E(view, viewGroup);
        }

        private String B(com.alphainventor.filemanager.file.n object) {
            if (this.Q.f == 20 && object.isDirectory()) {
                String string = d0.v(ax.T2.h.q(((com.alphainventor.filemanager.file.n)object).L()), ((com.alphainventor.filemanager.file.n)object).E(), Boolean.TRUE);
                if (ax.U2.d.Q(string)) {
                    string = ax.U2.d.g(string);
                    object = ax.U2.d.F(this.Q.getContext()).x(string);
                    if (object == null) {
                        return string;
                    }
                    return ((f)object).q();
                }
                return ((com.alphainventor.filemanager.file.n)object).B();
            }
            if (this.Q.f == 12 && object.isDirectory()) {
                if (this.F >= 0) {
                    return this.Q.getContext().getString(2131952236, new Object[]{((com.alphainventor.filemanager.file.n)object).B(), this.F});
                }
                return ((com.alphainventor.filemanager.file.n)object).B();
            }
            return ((com.alphainventor.filemanager.file.n)object).B();
        }

        private CharSequence D(com.alphainventor.filemanager.file.n object) {
            int n8;
            String string = this.B((com.alphainventor.filemanager.file.n)object);
            if (string == null) {
                return null;
            }
            object = this.Q.J != null && this.Q.J.equals(((com.alphainventor.filemanager.file.n)object).B()) ? string : this.Q.v;
            if (object == null || (n8 = string.toLowerCase().indexOf(((String)object).toLowerCase())) < 0) {
                return string;
            }
            if (this.Q.w == 0) {
                a a8 = this.Q;
                com.alphainventor.filemanager.widget.a.H(a8, ax.Q.b.c(a8.getContext(), 2131100781));
            }
            string = new SpannableString((CharSequence)string);
            int n9 = ((String)object).length();
            string.setSpan((Object)new BackgroundColorSpan(this.Q.w), n8, n9 + n8, 0);
            return string;
        }

        private void E(View view, ViewGroup viewGroup) {
            block22: {
                block17: {
                    block18: {
                        block19: {
                            block20: {
                                block21: {
                                    int n8;
                                    View view2;
                                    this.b = view2 = view.findViewById(2131362364);
                                    if (view2 != null) {
                                        this.c = (TextView)view.findViewById(2131362363);
                                        this.d = (CheckBox)view.findViewById(2131362362);
                                    }
                                    this.l = view;
                                    this.u = view.findViewById(2131362428);
                                    this.t = view.findViewById(2131362780);
                                    this.e = view.findViewById(2131362075);
                                    this.g = (TextView)view.findViewById(2131362304);
                                    this.m = view.findViewById(2131362384);
                                    this.n = (ImageView)view.findViewById(2131362383);
                                    this.o = (ImageView)view.findViewById(2131362472);
                                    this.p = (ImageView)view.findViewById(2131362326);
                                    this.q = (ImageView)view.findViewById(2131362824);
                                    this.r = (ImageView)view.findViewById(2131362908);
                                    this.s = (ImageView)view.findViewById(2131362458);
                                    view2 = this.l;
                                    if (view2 instanceof ActivatableFrameLayout) {
                                        ((ActivatableFrameLayout)view2).setOnActivatedListener(new ActivatableFrameLayout.a(this){
                                            final c a;
                                            {
                                                this.a = c8;
                                            }

                                            @Override
                                            public void a(boolean bl) {
                                                if (this.a.t != null) {
                                                    if (bl) {
                                                        this.a.t.setVisibility(0);
                                                        return;
                                                    }
                                                    this.a.t.setVisibility(8);
                                                }
                                            }
                                        });
                                    }
                                    if (this.Q.m != null) {
                                        n8 = this.Q.p && (this.Q.f == 0 || this.Q.f == 1 || this.Q.f == 20 || this.Q.f == 3) ? 1 : 0;
                                        if (this.b != null && (view2 = this.d) != null) {
                                            view2.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                                                final c c;
                                                {
                                                    this.c = c8;
                                                }

                                                @Override
                                                public void a(View view) {
                                                    this.c.Q.m.a(this.c.G);
                                                }
                                            });
                                        }
                                        if (n8 != 0) {
                                            view2 = (ViewStub)view.findViewById(2131362905);
                                            if (view2 != null) {
                                                view2 = view2.inflate();
                                                view2.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                                                    final c c;
                                                    {
                                                        this.c = c8;
                                                    }

                                                    @Override
                                                    public void a(View view) {
                                                        this.c.Q.m.b(this.c.G);
                                                    }
                                                });
                                                view2.setOnLongClickListener(new View.OnLongClickListener(){
                                                    final ViewGroup a;
                                                    final View b;
                                                    final c c;
                                                    {
                                                        this.c = c8;
                                                        this.a = viewGroup;
                                                        this.b = view;
                                                    }

                                                    public boolean onLongClick(View view) {
                                                        view = this.a;
                                                        if (view instanceof r) {
                                                            ((r)view).a();
                                                        }
                                                        int n8 = (int)this.b.getX();
                                                        int n9 = (int)this.b.getY();
                                                        this.c.Q.m.c(this.c.G, this.c.u, n8, n9);
                                                        return true;
                                                    }
                                                });
                                                if (ax.Q2.p.a(this.Q.b)) {
                                                    view2.setImportantForAccessibility(2);
                                                }
                                            }
                                            if ((view2 = view.findViewById(2131362187)) != null) {
                                                view2.setVisibility(8);
                                            }
                                        }
                                        if (this.Q.E && ax.t3.k.J() && this.Q.f != 10) {
                                            view2 = this.m;
                                            if (view2 == null) {
                                                view2 = this.n;
                                            }
                                            view2.setContentDescription((CharSequence)this.Q.b.getString(2131951746));
                                            view2.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                                                final c c;
                                                {
                                                    this.c = c8;
                                                }

                                                @Override
                                                public void a(View view) {
                                                    this.c.Q.m.b(this.c.G);
                                                }
                                            });
                                            view2.setOnLongClickListener(new View.OnLongClickListener(){
                                                final ViewGroup a;
                                                final View b;
                                                final c c;
                                                {
                                                    this.c = c8;
                                                    this.a = viewGroup;
                                                    this.b = view;
                                                }

                                                public boolean onLongClick(View view) {
                                                    view = this.a;
                                                    if (view instanceof FileListView) {
                                                        ((FileListView)view).a();
                                                    }
                                                    int n8 = (int)(this.b.getX() + (float)this.b.getWidth() / 2.0f);
                                                    int n9 = (int)(this.b.getY() + (float)this.b.getHeight() / 2.0f);
                                                    this.c.Q.m.c(this.c.G, this.c.u, n8, n9);
                                                    return true;
                                                }
                                            });
                                            if (ax.Q2.p.a(this.Q.b)) {
                                                view2.setImportantForAccessibility(2);
                                            }
                                        }
                                        if (!ax.Q2.p.a(this.Q.b)) {
                                            this.u.setOnTouchListener(new View.OnTouchListener(this){
                                                final c a;
                                                {
                                                    this.a = c8;
                                                }

                                                public boolean onTouch(View view, MotionEvent motionEvent) {
                                                    if (motionEvent.getActionMasked() == 0) {
                                                        com.alphainventor.filemanager.widget.a$c.r(this.a, (int)motionEvent.getX());
                                                        com.alphainventor.filemanager.widget.a$c.b(this.a, (int)motionEvent.getY());
                                                    } else if (motionEvent.getActionMasked() == 1) {
                                                        com.alphainventor.filemanager.widget.a$c.r(this.a, 0);
                                                        com.alphainventor.filemanager.widget.a$c.b(this.a, 0);
                                                    }
                                                    return false;
                                                }
                                            });
                                            this.u.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                                                final c c;
                                                {
                                                    this.c = c8;
                                                }

                                                @Override
                                                public void a(View view) {
                                                    if (this.c.Q.C) {
                                                        this.c.Q.m.b(this.c.G);
                                                        return;
                                                    }
                                                    this.c.Q.D.onItemClick(null, this.c.l, this.c.G, (long)this.c.G);
                                                }
                                            });
                                            this.u.setOnLongClickListener(new View.OnLongClickListener(){
                                                final ViewGroup a;
                                                final c b;
                                                {
                                                    this.b = c8;
                                                    this.a = viewGroup;
                                                }

                                                public boolean onLongClick(View view) {
                                                    view = this.a;
                                                    if (view instanceof r) {
                                                        ((r)view).a();
                                                    }
                                                    this.b.Q.m.c(this.b.G, this.b.u, this.b.N, this.b.O);
                                                    return true;
                                                }
                                            });
                                        }
                                    }
                                    if ((n8 = this.Q.f) == 0 || n8 == 1) break block17;
                                    if (n8 == 3) break block18;
                                    if (n8 == 10) break block19;
                                    if (n8 == 12) break block20;
                                    if (n8 == 16) break block21;
                                    if (n8 == 20) break block17;
                                    break block22;
                                }
                                this.g.setMinLines(2);
                                this.g.setMaxLines(2);
                                break block22;
                            }
                            this.g.setMinLines(1);
                            this.g.setMaxLines(1);
                            break block22;
                        }
                        this.a = view.findViewById(2131361913);
                        this.k = (TextView)view.findViewById(2131362302);
                        break block22;
                    }
                    this.a = view.findViewById(2131361913);
                    this.h = (TextView)view.findViewById(2131362267);
                    this.i = (TextView)view.findViewById(2131362268);
                    this.k = (TextView)view.findViewById(2131362302);
                    this.f = (TextView)view.findViewById(2131362275);
                    break block22;
                }
                this.a = view.findViewById(2131361913);
                this.h = (TextView)view.findViewById(2131362267);
                this.i = (TextView)view.findViewById(2131362268);
                this.j = (TextView)view.findViewById(2131362272);
                this.k = (TextView)view.findViewById(2131362302);
                this.f = (TextView)view.findViewById(2131362275);
            }
            if (this.f != null) {
                if (this.Q.j) {
                    this.f.setVisibility(0);
                } else {
                    this.f.setVisibility(8);
                }
            }
            if (this.i != null) {
                if (this.Q.f == 1) {
                    this.i.setVisibility(0);
                    return;
                }
                this.i.setVisibility(8);
            }
        }

        private boolean F() {
            return this.K == 4;
        }

        private void G(String string) {
            TextView textView = this.f;
            if (textView != null) {
                textView.setText((CharSequence)string);
            }
        }

        private void H(ImageView imageView, boolean bl) {
            float f8 = bl ? 0.5f : 1.0f;
            imageView.setAlpha(f8);
        }

        private void I(Resources resources, View view, int n8, int n9) {
            n8 = this.F() ? resources.getDimensionPixelSize(n9) : resources.getDimensionPixelSize(n8);
            resources = view.getLayoutParams();
            resources.height = n8;
            resources.width = n8;
            view.setLayoutParams((ViewGroup.LayoutParams)resources);
        }

        private void J(Resources resources, View view, int n8, int n9) {
            n8 = this.F() ? resources.getDimensionPixelSize(n9) : resources.getDimensionPixelSize(n8);
            resources = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
            resources.topMargin = n8;
            view.setLayoutParams((ViewGroup.LayoutParams)resources);
        }

        private void K(com.alphainventor.filemanager.file.n object, boolean bl) {
            object = bl ? ax.c3.C.c((com.alphainventor.filemanager.file.n)object) : ax.c3.C.b((com.alphainventor.filemanager.file.n)object);
            if (object != null) {
                int n8 = ((C.a)object).b;
                if (n8 != 0) {
                    if (bl) {
                        this.O(n8);
                        return;
                    }
                    this.M(n8);
                    return;
                }
                String[] stringArray = ((C.a)object).a;
                if (stringArray != null) {
                    this.J = object;
                    int n9 = stringArray.length;
                    for (n8 = 0; n8 < n9; ++n8) {
                        if (!this.P(stringArray[n8], bl)) continue;
                        this.J = null;
                        return;
                    }
                }
            } else if (bl) {
                this.O(2131231524);
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private void L(com.alphainventor.filemanager.file.n n8, boolean bl, c.a a8) {
            boolean bl2;
            block6: {
                block7: {
                    block4: {
                        block5: {
                            if (!this.Q.o) break block4;
                            if (!((y)n8).X0()) break block5;
                            this.r.setImageResource(2131231215);
                            this.r.setVisibility(0);
                            bl2 = true;
                            break block6;
                        }
                        this.r.setVisibility(8);
                        break block7;
                    }
                    this.r.setVisibility(8);
                }
                bl2 = false;
            }
            if (this.L) {
                this.r.setVisibility(0);
                this.r.setImageResource(this.M);
                this.r.setBackgroundResource(0);
            } else {
                this.r.setBackgroundResource(2131230868);
            }
            if (a8 == null) return;
            int n9 = com.alphainventor.filemanager.widget.a$b.a[a8.ordinal()];
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) return;
                    n8 = (AnimationDrawable)ax.s3.a.c(this.Q.getContext(), 2131231134);
                    a8 = ax.U.a.r((Drawable)n8);
                    ax.U.a.o((Drawable)a8, N);
                    n8.start();
                    this.r.setVisibility(0);
                    this.r.setImageDrawable((Drawable)a8);
                    return;
                }
                n8 = ax.U.a.r(ax.s3.a.c(this.Q.getContext(), 2131231131));
                ax.U.a.o((Drawable)n8, O);
                this.r.setVisibility(0);
                this.r.setImageDrawable((Drawable)n8);
                return;
            }
            if (bl2) return;
            this.r.setVisibility(8);
        }

        private void M(int n8) {
            this.p.setImageResource(n8);
            ax.h0.e.c(this.p, ColorStateList.valueOf((int)this.Q.u));
            this.p.setPadding(this.Q.x, this.Q.x, this.Q.x, this.Q.x);
            this.p.setVisibility(0);
            this.v = true;
        }

        private void N(String object) {
            object = ax.U2.d.F(this.Q.b).x((String)object);
            if (object != null) {
                this.p.setImageDrawable(null);
                this.Q.W().s((f)object, this.p);
                ax.h0.e.c(this.p, null);
                this.p.setVisibility(0);
                this.p.setBackgroundDrawable(null);
                this.p.setPadding(this.Q.x, this.Q.x, this.Q.x, this.Q.x);
                this.v = true;
            }
        }

        private void O(int n8) {
            this.p.setImageResource(n8);
            this.p.setBackgroundResource(2131230868);
            this.p.setVisibility(0);
            this.v = true;
        }

        private boolean P(String object, boolean bl) {
            object = ax.U2.d.F(this.Q.b).x((String)object);
            if (object != null) {
                if (this.Q.W().y((f)object, this.p)) {
                    ax.h0.e.c(this.p, null);
                    this.p.setBackgroundDrawable(null);
                    this.p.setPadding(this.Q.x, this.Q.x, this.Q.x, this.Q.x);
                    this.p.setVisibility(0);
                    this.v = true;
                    return true;
                }
                return false;
            }
            if (bl) {
                this.O(2131231524);
                return true;
            }
            return false;
        }

        static /* synthetic */ int b(c c8, int n8) {
            c8.O = n8;
            return n8;
        }

        static /* synthetic */ boolean f(c c8, boolean bl) {
            c8.L = bl;
            return bl;
        }

        static /* synthetic */ int g(c c8, int n8) {
            c8.M = n8;
            return n8;
        }

        static /* synthetic */ int r(c c8, int n8) {
            c8.N = n8;
            return n8;
        }

        private void s() {
            if (this.K != this.Q.g) {
                Resources resources = this.l.getResources();
                this.K = this.Q.g;
                if (this.Q.f == 2) {
                    ImageView imageView = this.p;
                    if (imageView != null) {
                        this.I(resources, (View)imageView, 2131165409, 2131165408);
                        this.J(resources, (View)this.p, 2131165407, 2131165406);
                        return;
                    }
                } else if (this.Q.f != 1 && this.Q.f != 0) {
                    View view;
                    if (this.Q.f == 10 && (view = this.m) != null) {
                        this.I(resources, view, 2131165428, 2131165427);
                        return;
                    }
                } else {
                    View view = this.m;
                    if (view != null) {
                        float f8;
                        int n8;
                        this.I(resources, view, 0x7F0700F0, 2131165423);
                        if (this.F()) {
                            n8 = resources.getDimensionPixelSize(2131165425);
                            f8 = resources.getDimension(2131165416);
                        } else {
                            n8 = resources.getDimensionPixelSize(2131165426);
                            f8 = resources.getDimension(2131165417);
                        }
                        this.u.setMinimumHeight(n8);
                        this.g.setTextSize(0, f8);
                    }
                    if ((view = this.p) != null) {
                        this.I(resources, view, 2131165421, 2131165420);
                        this.J(resources, (View)this.p, 2131165419, 2131165418);
                    }
                }
            }
        }

        private void u(long l8) {
            View view = this.a;
            if (view != null) {
                view = (LayerDrawable)view.getBackground().mutate();
                if (this.Q.h) {
                    if (this.Q.l > 0L) {
                        view.getDrawable(0).mutate().setLevel((int)(l8 * 10000L / this.Q.l));
                    } else {
                        view.getDrawable(0).setLevel(0);
                    }
                    if (this.Q.k > 0L) {
                        view.getDrawable(1).setLevel((int)(l8 * 10000L / this.Q.k));
                        return;
                    }
                    view.getDrawable(1).setLevel(0);
                    return;
                }
                view.getDrawable(0).setLevel(0);
                view.getDrawable(1).setLevel(0);
            }
        }

        private void v(com.alphainventor.filemanager.file.n n8) {
            if (n8.isDirectory()) {
                this.F = n8.r(this.Q.n);
                if (this.n.getTag() == null) {
                    if (this.F == 0 && ax.c3.B.P(n8)) {
                        if (((y)n8).S0()) {
                            this.n.setImageDrawable(this.Q.R(n8, true, 1));
                            return;
                        }
                        this.n.setImageDrawable(this.Q.R(n8, true, this.F));
                        return;
                    }
                    this.n.setImageDrawable(this.Q.R(n8, true, this.F));
                }
            }
        }

        private void w(com.alphainventor.filemanager.file.n comparable) {
            if (this.Q.f == 12) {
                if (comparable.isDirectory()) {
                    this.g.setText(this.D((com.alphainventor.filemanager.file.n)comparable));
                    return;
                }
            } else if (this.k != null) {
                if (comparable.isDirectory()) {
                    if (this.Q.f == 10) {
                        if (this.F >= 0) {
                            comparable = new StringBuilder();
                            ((StringBuilder)comparable).append("(");
                            ((StringBuilder)comparable).append(this.F);
                            ((StringBuilder)comparable).append(")");
                            comparable = new SpannableString((CharSequence)((StringBuilder)comparable).toString());
                            this.k.setText(comparable);
                            return;
                        }
                        this.k.setText((CharSequence)"");
                        return;
                    }
                    if (this.Q.i) {
                        TextView textView = this.k;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(((com.alphainventor.filemanager.file.n)comparable).I(this.Q.n));
                        stringBuilder.append(String.format(" (%s)", ax.c3.B.i(this.Q.getContext(), this.H)));
                        textView.setText((CharSequence)stringBuilder.toString());
                        return;
                    }
                    this.k.setText((CharSequence)((com.alphainventor.filemanager.file.n)comparable).I(this.Q.n));
                    return;
                }
                this.k.setText((CharSequence)((com.alphainventor.filemanager.file.n)comparable).I(this.Q.n));
            }
        }

        private void x(com.alphainventor.filemanager.file.n n8, boolean bl, long l8, boolean bl2) {
            block15: {
                block18: {
                    block17: {
                        block16: {
                            boolean bl3;
                            block14: {
                                Object object;
                                this.w = bl;
                                this.y = l8;
                                this.z = n8.G();
                                this.A = d0.j(n8.B());
                                this.B = n8.s();
                                this.x = n8.Q();
                                this.C = ax.c3.A.q(n8);
                                this.D = bl2;
                                this.o.setVisibility(8);
                                this.J = null;
                                if (this.v && (object = this.p) != null) {
                                    object.setVisibility(8);
                                    this.Q.W().g(this.p);
                                    this.v = false;
                                }
                                this.Q.W().g(this.n);
                                object = this.I;
                                if (object != null) {
                                    ((ax.u3.q)object).e();
                                    this.I = null;
                                }
                                this.n.setTag(null);
                                this.H = 0L;
                                this.L = false;
                                object = this.g;
                                if (object instanceof GridFilenameTextView) {
                                    if (bl) {
                                        ((GridFilenameTextView)object).setUseFilenameEllipsize(false);
                                    } else {
                                        ((GridFilenameTextView)object).setUseFilenameEllipsize(true);
                                    }
                                }
                                if (bl) break block14;
                                bl2 = this.Q.W().z(n8, this.n, this.P);
                                break block15;
                            }
                            if (!ax.Q2.f.m0(this.Q.s)) break block16;
                            bl2 = bl3 = this.Q.W().z(n8, this.n, this.P);
                            if (this.p != null) {
                                bl2 = bl3;
                                if (this.Q.t) {
                                    this.K(n8, true);
                                    bl2 = bl3;
                                }
                            }
                            break block15;
                        }
                        if (this.Q.s != ax.Q2.f.l1) break block17;
                        if (!com.alphainventor.filemanager.file.a.U1(n8)) break block18;
                        bl2 = this.Q.W().z(n8, this.n, this.P);
                        break block15;
                    }
                    if (this.p != null && this.Q.t) {
                        this.K(n8, false);
                    }
                }
                bl2 = false;
            }
            this.F = -1;
            if (!bl2) {
                this.n.setImageDrawable(this.Q.R(n8, bl, -1));
            }
            if (n8.l()) {
                this.q.setVisibility(0);
            } else {
                this.q.setVisibility(4);
            }
            if (this.g != null) {
                if (this.Q.w0()) {
                    this.g.setVisibility(0);
                    this.E = true;
                } else {
                    this.g.setVisibility(8);
                    this.E = false;
                }
            }
            this.H(this.n, n8.h());
        }

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        private void z(com.alphainventor.filemanager.file.n var1_1, int var2_2, boolean var3_3) {
            block56: {
                block57: {
                    if (com.alphainventor.filemanager.widget.a.o(this.Q)) {
                        this.H = var3_3 ? (com.alphainventor.filemanager.file.J.g2((com.alphainventor.filemanager.file.n)var1_1) ? var1_1.p() : ax.T2.h.T((com.alphainventor.filemanager.file.n)var1_1).E((com.alphainventor.filemanager.file.n)var1_1)) : var1_1.p();
                    }
                    this.u(this.H);
                    var6_4 /* !! */  = this.C != false ? ax.S4.c.d(this.Q.getContext(), var1_1.Q()) : null;
                    if (this.r != null) {
                        this.L((com.alphainventor.filemanager.file.n)var1_1, var3_3, (c.a)var6_4 /* !! */ );
                    }
                    if (this.s != null) {
                        if (!var3_3 && !ax.c3.B.P((com.alphainventor.filemanager.file.n)var1_1)) {
                            if (ax.c3.B.G(var1_1.N(), (com.alphainventor.filemanager.file.n)var1_1)) {
                                this.s.setImageResource(2131231213);
                                this.s.setVisibility(0);
                            } else {
                                this.s.setVisibility(8);
                            }
                        } else {
                            this.s.setVisibility(8);
                        }
                    }
                    if (var6_4 /* !! */  != null && var6_4 /* !! */  != c.a.q) {
                        this.g.setTextColor(com.alphainventor.filemanager.widget.a.q(this.Q));
                    } else {
                        this.g.setTextColor(com.alphainventor.filemanager.widget.a.p(this.Q));
                    }
                    if (ax.c3.B.P((com.alphainventor.filemanager.file.n)var1_1) && !((y)var1_1).W0()) {
                        var5_5 = true;
                    } else {
                        if (var3_3) {
                            this.F = var1_1.r(com.alphainventor.filemanager.widget.a.r(this.Q));
                        }
                        var5_5 = false;
                    }
                    if (com.alphainventor.filemanager.widget.a.o(this.Q) && var1_1.P() == ax.Q2.f.l1) {
                        var6_4 /* !! */  = this.k;
                        if (var6_4 /* !! */  != null) {
                            var6_4 /* !! */ .setText((CharSequence)ax.c3.B.i(this.Q.getContext(), this.H));
                        }
lbl30:
                        // 5 sources

                        while (true) {
                            var5_5 = false;
                            break block56;
                            break;
                        }
                    }
                    if (!com.alphainventor.filemanager.widget.a.o(this.Q) || !com.alphainventor.filemanager.file.J.g2((com.alphainventor.filemanager.file.n)var1_1)) break block57;
                    var6_4 /* !! */  = this.k;
                    if (var6_4 /* !! */  == null) ** GOTO lbl30
                    var6_4 /* !! */ .setText((CharSequence)ax.c3.B.i(this.Q.getContext(), this.H));
                    ** while (true)
                }
                if (!var5_5) {
                    this.v((com.alphainventor.filemanager.file.n)var1_1);
                    this.w((com.alphainventor.filemanager.file.n)var1_1);
                }
            }
            this.g.setText(this.D((com.alphainventor.filemanager.file.n)var1_1));
            if (this.e != null) {
                if (com.alphainventor.filemanager.widget.a.s(this.Q, (com.alphainventor.filemanager.file.n)var1_1)) {
                    this.e.setVisibility(0);
                } else {
                    this.e.setVisibility(8);
                }
            }
            if (this.b != null) {
                if (com.alphainventor.filemanager.widget.a.t(this.Q)) {
                    var6_4 /* !! */  = (q)com.alphainventor.filemanager.widget.a.u(this.Q).get(var2_2);
                    if (var6_4 /* !! */  != null && var6_4 /* !! */ .b() != null) {
                        this.b.setVisibility(0);
                        this.c.setText((CharSequence)var6_4 /* !! */ .b());
                    } else {
                        this.b.setVisibility(8);
                    }
                    if (com.alphainventor.filemanager.widget.a.v(this.Q) && var6_4 /* !! */  != null && var6_4 /* !! */ .e()) {
                        this.d.setChecked(true);
                    } else {
                        this.d.setChecked(false);
                    }
                } else {
                    this.b.setVisibility(8);
                }
                if (com.alphainventor.filemanager.widget.a.c(this.Q) && com.alphainventor.filemanager.widget.a.v(this.Q)) {
                    this.d.setVisibility(0);
                } else {
                    this.d.setVisibility(8);
                }
            }
            if (var1_1 instanceof n) {
                if (((n)var1_1).A1()) {
                    this.j.setText(2131952125);
                    this.j.setVisibility(0);
                } else {
                    this.j.setVisibility(8);
                }
            }
            if (com.alphainventor.filemanager.widget.a.e(this.Q)) {
                this.G(this.C((com.alphainventor.filemanager.file.n)var1_1));
            }
            if ((var2_2 = com.alphainventor.filemanager.widget.a.b(this.Q)) != 0) {
                if (var2_2 != 1) {
                    if (var2_2 != 3) {
                        if (var2_2 != 10) {
                            if (var2_2 == 20) {
                                this.h.setVisibility(8);
                            }
                        } else if (var3_3) {
                            this.k.setVisibility(0);
                        } else {
                            this.k.setVisibility(4);
                        }
                    } else {
                        this.h.setText((CharSequence)var1_1.H(com.alphainventor.filemanager.widget.a.x(this.Q)));
                        this.G(this.C((com.alphainventor.filemanager.file.n)var1_1));
                    }
                } else {
                    if (com.alphainventor.filemanager.widget.a.w(this.Q) && var1_1 instanceof y) {
                        this.h.setText((CharSequence)((y)var1_1).G0(com.alphainventor.filemanager.widget.a.x(this.Q)));
                    } else {
                        this.h.setText((CharSequence)var1_1.H(com.alphainventor.filemanager.widget.a.x(this.Q)));
                    }
                    this.i.setText((CharSequence)"");
                }
            } else {
                this.h.setText((CharSequence)"");
            }
            if (!this.Q.e0()) {
                if (this.n.getTag() == null || !this.n.getTag().equals(var1_1.Q())) {
                    if (var3_3 && !ax.Q2.f.m0(com.alphainventor.filemanager.widget.a.z(this.Q).S())) {
                        if (com.alphainventor.filemanager.widget.a.z(this.Q).S() == ax.Q2.f.l1 && com.alphainventor.filemanager.file.a.U1((com.alphainventor.filemanager.file.n)var1_1)) {
                            this.Q.W().u((com.alphainventor.filemanager.file.n)var1_1, this.n, this.P);
                        }
                    } else if (com.alphainventor.filemanager.widget.a.A(this.Q)) {
                        this.Q.W().u((com.alphainventor.filemanager.file.n)var1_1, this.n, this.P);
                    } else {
                        this.Q.W().x((com.alphainventor.filemanager.file.n)var1_1, this.n, this.P);
                    }
                }
                if (this.n.getTag() == null && var3_3 && !ax.c3.B.P((com.alphainventor.filemanager.file.n)var1_1)) {
                    this.n.setImageDrawable(com.alphainventor.filemanager.widget.a.h(this.Q, (com.alphainventor.filemanager.file.n)var1_1, true, this.F));
                }
                if ((var6_4 /* !! */  = this.J) != null && (var6_4 /* !! */  = var6_4 /* !! */ .a) != null && this.p != null) {
                    var4_6 = var6_4 /* !! */ .length;
                    for (var2_2 = 0; var2_2 < var4_6; ++var2_2) {
                        this.N(var6_4 /* !! */ [var2_2]);
                    }
                    this.J = null;
                }
            }
            if (!var5_5) {
                return;
            }
            var6_4 /* !! */  = com.alphainventor.filemanager.widget.a.z(this.Q).S();
            this.I = var1_1 = new d(this, com.alphainventor.filemanager.widget.a.z(this.Q), (ax.Q2.f)var6_4 /* !! */ , (com.alphainventor.filemanager.file.n)var1_1, com.alphainventor.filemanager.widget.a.r(this.Q), false, var5_5);
            var1_1.i(new Void[0]);
        }

        public String A() {
            return this.x;
        }

        String C(com.alphainventor.filemanager.file.n object) {
            if ("/".equals(object = d0.s((com.alphainventor.filemanager.file.n)object))) {
                return "/";
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append("/");
            return stringBuilder.toString();
        }

        public void t() {
            this.x = null;
        }

        public void y(com.alphainventor.filemanager.file.n n8, int n9) {
            this.G = n9;
            if (n8 == null) {
                return;
            }
            this.s();
            boolean bl = n8.isDirectory();
            long l8 = n8.q();
            boolean bl2 = n8.h();
            String string = this.x;
            if (string == null || !string.equals(n8.Q()) || this.w != bl || this.y != l8 || this.D != bl2 || this.E != this.Q.w0()) {
                this.x(n8, bl, l8, bl2);
            }
            this.z(n8, n9, bl);
        }
    }

    static class d
    extends ax.u3.q<Void, Void, Void> {
        c h;
        com.alphainventor.filemanager.file.n i;
        ax.Q2.f j;
        boolean k;
        String l;
        boolean m;
        boolean n;
        o o;

        d(c c8, o o8, ax.Q2.f f8, com.alphainventor.filemanager.file.n n8, boolean bl, boolean bl2, boolean bl3) {
            super(q.e.e0);
            this.o = o8;
            this.h = c8;
            this.j = f8;
            this.i = n8;
            this.k = bl;
            this.m = bl2;
            this.n = bl3;
        }

        protected Void w(Void ... voidArray) {
            if (this.m && ax.c3.B.P(this.i)) {
                this.l = ((y)this.i).E0();
            }
            if (this.n) {
                if (this.i.isDirectory()) {
                    if (ax.c3.B.P(this.i)) {
                        ((y)this.i).g1(this.k);
                    }
                } else {
                    this.i.p();
                }
            }
            return null;
        }

        protected void x(Void void_) {
            if (this.i.Q().equals(this.h.A())) {
                if (this.m) {
                    this.h.i.setText((CharSequence)this.l);
                }
                if (this.n) {
                    this.h.v(this.i);
                    this.h.w(this.i);
                }
            }
        }
    }
}

