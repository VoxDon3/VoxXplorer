/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import android.app.Activity;
import ax.Q2.f;
import ax.d3.E;
import com.alphainventor.filemanager.activity.MainActivity;
import com.alphainventor.filemanager.file.OneDriveFileHelper;

public class a0
extends E {
    boolean s2 = false;

    @Override
    protected String B7() {
        return OneDriveFileHelper.G0(this.o3()).f(this.x3()).b();
    }

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
        this.Z8(bl, object);
    }

    public void ta() {
        this.W0.setRootTitle(this.B7());
        if (this.f0() != null) {
            ((MainActivity)this.f0()).i2(this.z3(), this.x3());
            return;
        }
        this.s2 = true;
    }

    @Override
    public f z3() {
        return f.P0;
    }
}

