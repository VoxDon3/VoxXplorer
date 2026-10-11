/*
 * Decompiled with CFR 0.152.
 */
package ax.g2;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;

public final class g
implements Runnable {
    public final Context q;

    public /* synthetic */ g(Context context) {
        this.q = context;
    }

    @Override
    public final void run() {
        ProfileInstallerInitializer.c(this.q);
    }
}

