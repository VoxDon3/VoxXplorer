/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.fragment.app.Fragment;
import ax.X2.Q;
import ax.c0.F0;
import ax.c0.Y0;
import ax.c0.d0;
import ax.c0.d1;
import ax.d3.A0;
import ax.d3.B0;
import ax.d3.Z;
import ax.d3.y0;
import ax.d3.z0;
import ax.n.c;
import ax.u.m;
import ax.u.n;
import ax.u.o;
import ax.u.p;
import ax.u3.B;
import ax.u3.b;
import ax.u3.z;
import java.util.ArrayList;

public class C0 {
    private c a;
    private View b;
    private boolean c;
    private boolean d;
    private boolean e;
    private Configuration f;
    private Point g = new Point();
    private int h;
    private int i;
    private ArrayList<Z> j;
    private boolean k;
    ViewTreeObserver.OnGlobalLayoutListener l = new ViewTreeObserver.OnGlobalLayoutListener(this){
        final C0 a;
        {
            this.a = c02;
        }

        public void onGlobalLayout() {
            block6: {
                block5: {
                    boolean bl;
                    C0.a(this.a, false);
                    if (this.a.a.isDestroyed() || !this.a.b.getViewTreeObserver().isAlive()) break block5;
                    this.a.b.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                    if (this.a.c && !this.a.d) {
                        bl = false;
                    } else {
                        C0 c02 = this.a;
                        bl = c02.y(c02.b, this.a.f);
                        C0.f(this.a, false);
                        C0.h(this.a, null);
                    }
                    if (bl || this.a.k) break block6;
                }
                return;
            }
            this.a.p();
            C0.k(this.a, false);
        }
    };

    public C0(c c8) {
        this.a = c8;
        this.b = c8.findViewById(0x1020002);
    }

    static /* synthetic */ boolean a(C0 c02, boolean bl) {
        c02.e = bl;
        return bl;
    }

    static /* synthetic */ boolean f(C0 c02, boolean bl) {
        c02.d = bl;
        return bl;
    }

    static /* synthetic */ Configuration h(C0 c02, Configuration configuration) {
        c02.f = configuration;
        return configuration;
    }

    static /* synthetic */ boolean k(C0 c02, boolean bl) {
        c02.k = bl;
        return bl;
    }

    private void p() {
        c c8 = this.a;
        if (c8 instanceof Z) {
            ((Z)((Object)c8)).t(this.h, this.i);
        }
        this.q(this.h, this.i);
    }

    private void q(int n8, int n9) {
        ArrayList<Z> arrayList = this.j;
        if (arrayList != null) {
            int n10 = arrayList.size();
            int n11 = 0;
            while (n11 < n10) {
                Object object = arrayList.get(n11);
                int n12 = n11 + 1;
                Object object2 = object;
                if (object2 instanceof Fragment) {
                    object = (Fragment)object2;
                    n11 = n12;
                    if (((Fragment)object).f0() == null) continue;
                    n11 = n12;
                    if (((Fragment)object).R0() == null) continue;
                    object2.t(n8, n9);
                    n11 = n12;
                    continue;
                }
                object2.t(n8, n9);
                n11 = n12;
            }
        }
    }

    public static Point r(Context context) {
        Point point = C0.s(context);
        Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        context = new DisplayMetrics();
        display.getMetrics((DisplayMetrics)context);
        float f8 = point.x;
        float f9 = context.density;
        point.x = (int)(f8 / f9);
        point.y = (int)((float)point.y / f9);
        return point;
    }

    public static Point s(Context context) {
        if (Q.E0()) {
            context = y0.a((WindowManager)context.getSystemService("window"));
            Insets insets = A0.a(z0.a((WindowMetrics)context), Y0.a() | d1.a());
            int n8 = o.a(insets);
            int n9 = m.a(insets);
            int n10 = n.a(insets);
            int n11 = p.a(insets);
            context = B0.a((WindowMetrics)context);
            return new Point(context.width() - (n8 + n9), context.height() - (n10 + n11));
        }
        Display display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        return new Point((int)((float)context.getResources().getConfiguration().screenWidthDp * displayMetrics.density), (int)((float)context.getResources().getConfiguration().screenHeightDp * displayMetrics.density));
    }

    private void w(Z z8) {
        this.k = true;
        if (this.e) {
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this.l);
        }
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(this.l);
        this.e = true;
    }

    private boolean y(View object, Configuration configuration) {
        int n8;
        int n9;
        Configuration configuration2 = configuration;
        if (configuration == null) {
            configuration2 = this.a.getResources().getConfiguration();
        }
        if (Q.Z()) {
            if ((object = d0.G(object)) == null) {
                ax.u3.b.e("window insets null?");
                return false;
            }
            object = z.m((F0)object);
            n9 = configuration2.screenWidthDp - B.f((Context)this.a, object.a + object.c);
            n8 = configuration2.screenHeightDp - B.f((Context)this.a, object.b + object.d);
        } else {
            n8 = configuration2.screenHeightDp;
            n9 = configuration2.screenWidthDp;
        }
        if (!this.c) {
            this.c = true;
        }
        if (n9 == this.h && n8 == this.i) {
            return false;
        }
        this.h = n9;
        this.i = n8;
        return true;
    }

    public void m(Configuration configuration) {
        this.d = true;
        this.f = configuration;
        if (this.e) {
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this.l);
        }
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(this.l);
        this.e = true;
    }

    public void n(Z z8) {
        if (z8 == null) {
            ax.u3.b.g("null?");
        }
        if (this.j == null) {
            this.j = new ArrayList();
        }
        this.j.add(z8);
        this.w(z8);
    }

    public void o() {
        this.c = false;
    }

    public Point t(Context context) {
        if (!this.u()) {
            context = C0.r(context);
            this.h = context.x;
            this.i = context.y;
            this.c = true;
        }
        context = this.g;
        context.x = this.h;
        context.y = this.i;
        return context;
    }

    public boolean u() {
        return this.c;
    }

    public void v(Configuration configuration) {
        this.o();
        this.m(configuration);
    }

    public void x(Z z8) {
        ArrayList<Z> arrayList = this.j;
        if (arrayList != null) {
            arrayList.remove(z8);
        }
    }
}

