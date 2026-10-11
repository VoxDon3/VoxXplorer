/*
 * Decompiled with CFR 0.152.
 */
package ax.g2;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;

public final class f
implements Runnable {
    public final Context q;

    public /* synthetic */ f(Context context) {
        this.q = context;
    }

    @Override
    public final void run() {
        ProfileInstallerInitializer.d(this.q);
    }
}

