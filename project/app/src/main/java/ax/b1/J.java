/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.media.MediaDrm;
import ax.b1.E;
import ax.b1.O;

public final class J
implements MediaDrm.OnEventListener {
    public final O a;
    public final E.b b;

    public /* synthetic */ J(O o8, E.b b8) {
        this.a = o8;
        this.b = b8;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] byArray, int n8, int n9, byte[] byArray2) {
        O.p(this.a, this.b, mediaDrm, byArray, n8, n9, byArray2);
    }
}

