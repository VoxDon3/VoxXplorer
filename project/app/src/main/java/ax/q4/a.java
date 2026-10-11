/*
 * Decompiled with CFR 0.152.
 */
package ax.q4;

import android.content.Intent;
import com.dropbox.core.android.AuthActivity;

public final class a
implements Runnable {
    public final Intent c0;
    public final String d0;
    public final AuthActivity q;

    public /* synthetic */ a(AuthActivity authActivity, Intent intent, String string) {
        this.q = authActivity;
        this.c0 = intent;
        this.d0 = string;
    }

    @Override
    public final void run() {
        AuthActivity.a(this.q, this.c0, this.d0);
    }
}

