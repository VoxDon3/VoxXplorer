package ax.d3;

import android.app.Activity;
import com.voxdon.xplorer.activity.MainActivity;

/* renamed from: ax.d3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1910a extends E {
    boolean s2 = false;

    @Override // ax.d3.E
    protected abstract String B7();

    @Override // ax.d3.E, androidx.fragment.app.Fragment
    public void j1(Activity activity) {
        super.j1(activity);
        if (this.s2) {
            this.s2 = false;
            ((MainActivity) activity).i2(z3(), x3());
        }
    }

    @Override // ax.d3.E
    protected void m8(boolean z, Object obj) {
        if (X0()) {
            c9(z, obj, ta());
        }
    }

    abstract String ta();

    public void ua() {
        this.W0.setRootTitle(B7());
        if (f0() != null) {
            ((MainActivity) f0()).i2(z3(), x3());
        } else {
            this.s2 = true;
        }
    }

    @Override // ax.d3.E, ax.d3.AbstractC1927n
    public abstract ax.Q2.f z3();
}
