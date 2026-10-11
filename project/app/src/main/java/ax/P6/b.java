/*
 * Decompiled with CFR 0.152.
 */
package ax.P6;

import com.google.android.material.sidesheet.SideSheetBehavior;

public final class b
implements Runnable {
    public final int c0;
    public final SideSheetBehavior q;

    public /* synthetic */ b(SideSheetBehavior sideSheetBehavior, int n8) {
        this.q = sideSheetBehavior;
        this.c0 = n8;
    }

    @Override
    public final void run() {
        SideSheetBehavior.J(this.q, this.c0);
    }
}

