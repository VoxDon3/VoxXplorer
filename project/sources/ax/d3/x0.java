package ax.d3;

import android.R;
import android.view.View;
import ax.c0.C1760d0;
import ax.c0.F0;
import ax.n.ActivityC2561c;
import ax.u3.C3184b;
import com.voxdon.xplorer.widget.WindowInsetsFrameLayout;

/* loaded from: classes.dex */
public class x0 {
    private a a;
    private ActivityC2561c b;
    private WindowInsetsFrameLayout c;
    private boolean d;
    private F0 e;

    public interface a extends Y {
        boolean isContentClipToPadding(boolean z);

        void onIMEVisibilityChanged(boolean z);
    }

    public x0(ActivityC2561c activityC2561c, a aVar) {
        this.b = activityC2561c;
        this.a = aVar;
    }

    public static /* synthetic */ F0 a(x0 x0Var, View view, F0 f0) {
        x0Var.f(x0Var.c(f0));
        x0Var.b(x0Var.c, f0);
        x0Var.e = f0;
        return F0.b;
    }

    private boolean c(F0 f0) {
        return f0.f(F0.m.c()).d > 0;
    }

    private boolean e() {
        return this.d;
    }

    private boolean f(boolean z) {
        boolean z2 = this.d;
        this.d = z;
        if (z2 != z) {
            this.a.onIMEVisibilityChanged(z);
        }
        return this.d;
    }

    public void b(WindowInsetsFrameLayout windowInsetsFrameLayout, F0 f0) {
        boolean isContentClipToPadding = this.a.isContentClipToPadding(e());
        windowInsetsFrameLayout.d(f0, isContentClipToPadding);
        ax.T.b appliedInsets = windowInsetsFrameLayout.getAppliedInsets();
        this.a.onApplyWindowsInsets(appliedInsets, isContentClipToPadding);
        for (ax.G0.h hVar : this.b.getSupportFragmentManager().v0()) {
            if (hVar instanceof Y) {
                ((Y) hVar).onApplyWindowsInsets(appliedInsets, isContentClipToPadding);
            }
        }
    }

    public void d(WindowInsetsFrameLayout windowInsetsFrameLayout) {
        this.c = windowInsetsFrameLayout;
        C3184b.d(windowInsetsFrameLayout != null);
        if (this.c != null && ax.X2.Q.W1()) {
            this.c.setNavigationBarColor(ax.u3.z.o(this.b, R.attr.colorBackground));
            C1760d0.v0(this.c, new ax.c0.I() { // from class: ax.d3.w0
                @Override // ax.c0.I
                public final F0 a(View view, F0 f0) {
                    return x0.a(x0.this, view, f0);
                }
            });
        }
    }

    public void g() {
        F0 f0;
        if (!ax.X2.Q.W1() || (f0 = this.e) == null) {
            return;
        }
        b(this.c, f0);
    }

    public void h(int i) {
        WindowInsetsFrameLayout windowInsetsFrameLayout = this.c;
        if (windowInsetsFrameLayout != null) {
            windowInsetsFrameLayout.setNavigationBarColor(i);
        }
    }

    public void i(int i) {
        WindowInsetsFrameLayout windowInsetsFrameLayout = this.c;
        if (windowInsetsFrameLayout != null) {
            windowInsetsFrameLayout.setStatusBarColor(i);
        }
    }
}
