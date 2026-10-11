/*
 * Decompiled with CFR 0.152.
 */
package ax.a2;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;

public final class t {
    public static /* bridge */ /* synthetic */ boolean a(AttachedSurfaceControl attachedSurfaceControl, SurfaceControl.Transaction transaction) {
        return attachedSurfaceControl.applyTransactionOnDraw(transaction);
    }
}

