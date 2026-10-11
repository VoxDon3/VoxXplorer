/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.app.Activity;
import android.content.Intent;
import ax.M5.E;

final class C
extends E {
    final Intent a;
    final Activity b;
    final int c;

    C(Intent intent, Activity activity, int n8) {
        this.a = intent;
        this.b = activity;
        this.c = n8;
    }

    @Override
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}

