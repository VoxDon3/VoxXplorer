/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.media.MediaDrm;

public final class H {
    public static /* bridge */ /* synthetic */ int a(MediaDrm mediaDrm, byte[] byArray) {
        return mediaDrm.getSecurityLevel(byArray);
    }
}

