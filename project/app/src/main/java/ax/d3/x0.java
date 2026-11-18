/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import ax.T.b;
import ax.X2.Q;
import ax.c0.F0;
import ax.c0.d0;
import ax.d3.Y;
import ax.d3.w0;
import ax.n.c;
import ax.u3.z;
import com.voxdon.xplorer.widget.WindowInsetsFrameLayout;
import java.util.Iterator;

public class x0 {
    private a a;
    private c b;
    private WindowInsetsFrameLayout c;
    private boolean d;
    private F0 e;

    public x0(c c8, a a8) {
        this.b = c8;
        this.a = a8;
    }

    public static /* synthetic */ F0 a(x0 x02, View view, F0 f02) {
        x02.f(x02.c(f02));
        x02.b(x02.c, f02);
        x02.e = f02;
        return F0.b;
    }

    private boolean c(F0 f02) {
        return f02.f((int)F0.m.c()).d > 0;
    }

    private boolean e() {
        return this.d;
    }

    private boolean f(boolean bl) {
        boolean bl2 = this.d;
        this.d = bl;
        if (bl2 != bl) {
            this.a.onIMEVisibilityChanged(bl);
        }
        return this.d;
    }

    public void b(WindowInsetsFrameLayout object3, F0 object2) {
        Iterator<Fragment> iterator;
        boolean bl = this.a.isContentClipToPadding(this.e());
        ((WindowInsetsFrameLayout)((Object)object3)).d((F0)((Object)iterator), bl);
        b b8 = ((WindowInsetsFrameLayout)((Object)object3)).getAppliedInsets();
        this.a.onApplyWindowsInsets(b8, bl);
        for (Fragment fragment : this.b.getSupportFragmentManager().v0()) {
            if (!(fragment instanceof Y)) continue;
            ((Y)((Object)fragment)).onApplyWindowsInsets(b8, bl);
        }
    }

    public void d(WindowInsetsFrameLayout windowInsetsFrameLayout) {
        this.c = windowInsetsFrameLayout;
        boolean bl = windowInsetsFrameLayout != null;
        ax.u3.b.d(bl);
        if (this.c != null && Q.W1()) {
            int n8 = z.o((Context)this.b, 0x1010031);
            this.c.setNavigationBarColor(n8);
            d0.v0((View)this.c, new w0(this));
        }
    }

    public void g() {
        F0 f02;
        if (Q.W1() && (f02 = this.e) != null) {
            this.b(this.c, f02);
        }
    }

    public void h(int n8) {
        WindowInsetsFrameLayout windowInsetsFrameLayout = this.c;
        if (windowInsetsFrameLayout != null) {
            windowInsetsFrameLayout.setNavigationBarColor(n8);
        }
    }

    public void i(int n8) {
        WindowInsetsFrameLayout windowInsetsFrameLayout = this.c;
        if (windowInsetsFrameLayout != null) {
            windowInsetsFrameLayout.setStatusBarColor(n8);
        }
    }

    public static interface a
    extends Y {
        public boolean isContentClipToPadding(boolean var1);

        public void onIMEVisibilityChanged(boolean var1);
    }
}

