/*
 * Decompiled with CFR 0.152.
 */
package ax.o1;

import android.view.Surface;
import ax.f1.B;
import ax.f1.D;

public class j
extends B {
    public final int e0;
    public final boolean f0;

    public j(Throwable throwable, D d8, Surface surface) {
        super(throwable, d8);
        this.e0 = System.identityHashCode(surface);
        boolean bl = surface == null || surface.isValid();
        this.f0 = bl;
    }
}

