/*
 * Decompiled with CFR 0.152.
 */
package ax.P6;

import android.view.View;
import ax.d0.M;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class a
implements M {
    public final SideSheetBehavior a;
    public final int b;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int n8) {
        this.a = sideSheetBehavior;
        this.b = n8;
    }

    @Override
    public final boolean a(View view, M.a a8) {
        return SideSheetBehavior.I(this.a, this.b, view, a8);
    }
}

