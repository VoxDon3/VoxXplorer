package ax.d3;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.fragment.app.Fragment;
import ax.c0.C1760d0;
import ax.c0.F0;
import ax.n.ActivityC2561c;
import ax.u3.C3180B;
import ax.u3.C3184b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class C0 {
    private ActivityC2561c a;
    private View b;
    private boolean c;
    private boolean d;
    private boolean e;
    private Configuration f;
    private int h;
    private int i;
    private ArrayList<Z> j;
    private boolean k;
    private Point g = new Point();
    ViewTreeObserver.OnGlobalLayoutListener l = new a();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean y;
            C0.this.e = false;
            if (!C0.this.a.isDestroyed() && C0.this.b.getViewTreeObserver().isAlive()) {
                C0.this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (!C0.this.c || C0.this.d) {
                    C0 c0 = C0.this;
                    y = c0.y(c0.b, C0.this.f);
                    C0.this.d = false;
                    C0.this.f = null;
                } else {
                    y = false;
                }
                if (y || C0.this.k) {
                    C0.this.p();
                    C0.this.k = false;
                }
            }
        }
    }

    public C0(ActivityC2561c activityC2561c) {
        this.a = activityC2561c;
        this.b = activityC2561c.findViewById(R.id.content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        ax.i.q qVar = this.a;
        if (qVar instanceof Z) {
            ((Z) qVar).t(this.h, this.i);
        }
        q(this.h, this.i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void q(int i, int i2) {
        ArrayList<Z> arrayList = this.j;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Z z = arrayList.get(i3);
            i3++;
            Z z2 = z;
            if (z2 instanceof Fragment) {
                Fragment fragment = (Fragment) z2;
                if (fragment.f0() != null && fragment.R0() != null) {
                    z2.t(i, i2);
                }
            } else {
                z2.t(i, i2);
            }
        }
    }

    public static Point r(Context context) {
        Point s = s(context);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        float f = s.x;
        float f2 = displayMetrics.density;
        s.x = (int) (f / f2);
        s.y = (int) (s.y / f2);
        return s;
    }

    public static Point s(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        int i;
        int i2;
        int i3;
        int i4;
        Rect bounds;
        if (!ax.X2.Q.E0()) {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            return new Point((int) (context.getResources().getConfiguration().screenWidthDp * displayMetrics.density), (int) (context.getResources().getConfiguration().screenHeightDp * displayMetrics.density));
        }
        currentWindowMetrics = ((WindowManager) context.getSystemService("window")).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        navigationBars = WindowInsets.Type.navigationBars();
        displayCutout = WindowInsets.Type.displayCutout();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
        i = insetsIgnoringVisibility.right;
        i2 = insetsIgnoringVisibility.left;
        int i5 = i + i2;
        i3 = insetsIgnoringVisibility.top;
        i4 = insetsIgnoringVisibility.bottom;
        bounds = currentWindowMetrics.getBounds();
        return new Point(bounds.width() - i5, bounds.height() - (i3 + i4));
    }

    private void w(Z z) {
        this.k = true;
        if (this.e) {
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this.l);
        }
        this.b.getViewTreeObserver().addOnGlobalLayoutListener(this.l);
        this.e = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y(View view, Configuration configuration) {
        int i;
        int i2;
        if (configuration == null) {
            configuration = this.a.getResources().getConfiguration();
        }
        if (ax.X2.Q.Z()) {
            F0 G = C1760d0.G(view);
            if (G == null) {
                C3184b.e("window insets null?");
                return false;
            }
            ax.T.b m = ax.u3.z.m(G);
            i = configuration.screenWidthDp - C3180B.f(this.a, m.a + m.c);
            i2 = configuration.screenHeightDp - C3180B.f(this.a, m.b + m.d);
        } else {
            int i3 = configuration.screenHeightDp;
            i = configuration.screenWidthDp;
            i2 = i3;
        }
        if (!this.c) {
            this.c = true;
        }
        if (i == this.h && i2 == this.i) {
            return false;
        }
        this.h = i;
        this.i = i2;
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

    public void n(Z z) {
        if (z == null) {
            C3184b.g("null?");
        }
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(z);
        w(z);
    }

    public void o() {
        this.c = false;
    }

    public Point t(Context context) {
        if (!u()) {
            Point r = r(context);
            this.h = r.x;
            this.i = r.y;
            this.c = true;
        }
        Point point = this.g;
        point.x = this.h;
        point.y = this.i;
        return point;
    }

    public boolean u() {
        return this.c;
    }

    public void v(Configuration configuration) {
        o();
        m(configuration);
    }

    public void x(Z z) {
        ArrayList<Z> arrayList = this.j;
        if (arrayList != null) {
            arrayList.remove(z);
        }
    }
}
