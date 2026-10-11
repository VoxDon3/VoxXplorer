/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.media.MediaDrm;

public final class N {
    public static /* bridge */ /* synthetic */ boolean a(MediaDrm mediaDrm, String string, int n8) {
        return mediaDrm.requiresSecureDecoder(string, n8);
    }
}

