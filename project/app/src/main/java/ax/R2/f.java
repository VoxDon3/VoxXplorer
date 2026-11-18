/*
 * Decompiled with CFR 0.152.
 */
package ax.R2;

import com.voxdon.xplorer.activity.RestartActivity;

public final class f
implements Runnable {
    public final int c0;
    public final RestartActivity q;

    public /* synthetic */ f(RestartActivity restartActivity, int n8) {
        this.q = restartActivity;
        this.c0 = n8;
    }

    @Override
    public final void run() {
        RestartActivity.F(this.q, this.c0);
    }
}

