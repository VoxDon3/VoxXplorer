/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import ax.Q2.f;
import ax.d3.E;
import com.alphainventor.filemanager.activity.MainActivity;

public abstract class a
extends E {
    boolean s2 = false;

    @Override
    protected abstract String B7();

    @Override
    public void j1(Activity activity) {
        super.j1(activity);
        if (this.s2) {
            this.s2 = false;
            ((MainActivity)activity).i2(this.z3(), this.x3());
        }
    }

    @Override
    protected void m8(boolean bl, Object object) {
        if (!this.X0()) {
            return;
        }
        this.c9(bl, object, this.ta());
    }

    abstract String ta();

    public void ua() {
        this.W0.setRootTitle(this.B7());
        if (this.f0() != null) {
            ((MainActivity)this.f0()).i2(this.z3(), this.x3());
            return;
        }
        this.s2 = true;
    }

    @Override
    public abstract f z3();
}

