/*
 * Decompiled with CFR 0.152.
 */
package ax.a2;

import android.view.AttachedSurfaceControl;
import android.window.SurfaceSyncGroup;

public final class s {
    public static /* bridge */ /* synthetic */ boolean a(SurfaceSyncGroup surfaceSyncGroup, AttachedSurfaceControl attachedSurfaceControl, Runnable runnable2) {
        return surfaceSyncGroup.add(attachedSurfaceControl, runnable2);
    }
}

