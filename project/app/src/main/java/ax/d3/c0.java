/*
 * Decompiled with CFR 0.152.
 */
package ax.d3;

import ax.Q2.f;
import ax.d3.E;
import com.alphainventor.filemanager.file.I;

public class c0
extends E {
    @Override
    protected String B7() {
        return I.r0(this.o3()).f(this.x3()).b();
    }

    @Override
    protected void m8(boolean bl, Object object) {
        if (!this.X0()) {
            return;
        }
        if (!bl && object instanceof I.e) {
            this.X6();
            return;
        }
        this.Z8(bl, object);
    }

    @Override
    public f z3() {
        return f.R0;
    }
}

