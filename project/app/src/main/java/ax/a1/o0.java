/*
 * Decompiled with CFR 0.152.
 */
package ax.a1;

import android.media.AudioRouting;
import ax.a1.f0;

public final class o0
implements AudioRouting.OnRoutingChangedListener {
    public final f0.l a;

    public /* synthetic */ o0(f0.l l8) {
        this.a = l8;
    }

    public final void onRoutingChanged(AudioRouting audioRouting) {
        f0.l.a(this.a, audioRouting);
    }
}

