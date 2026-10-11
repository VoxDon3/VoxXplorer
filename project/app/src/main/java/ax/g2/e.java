/*
 * Decompiled with CFR 0.152.
 */
package ax.g2;

import android.content.Context;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;

public final class e
implements Choreographer.FrameCallback {
    public final Context c0;
    public final ProfileInstallerInitializer q;

    public /* synthetic */ e(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.q = profileInstallerInitializer;
        this.c0 = context;
    }

    public final void doFrame(long l8) {
        ProfileInstallerInitializer.e(this.q, this.c0, l8);
    }
}

