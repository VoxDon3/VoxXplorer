/*
 * Decompiled with CFR 0.152.
 */
package ax.i;

import android.content.IntentSender;
import androidx.activity.ComponentActivity;

public final class k
implements Runnable {
    public final int c0;
    public final IntentSender.SendIntentException d0;
    public final ComponentActivity.f q;

    public /* synthetic */ k(ComponentActivity.f f8, int n8, IntentSender.SendIntentException sendIntentException) {
        this.q = f8;
        this.c0 = n8;
        this.d0 = sendIntentException;
    }

    @Override
    public final void run() {
        ComponentActivity.f.q(this.q, this.c0, this.d0);
    }
}

