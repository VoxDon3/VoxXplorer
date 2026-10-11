/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import android.media.AudioManager;
import androidx.media3.exoplayer.g;

public final class e
implements AudioManager.OnAudioFocusChangeListener {
    public final g q;

    public /* synthetic */ e(g g8) {
        this.q = g8;
    }

    public final void onAudioFocusChange(int n8) {
        g.b(this.q, n8);
    }
}

