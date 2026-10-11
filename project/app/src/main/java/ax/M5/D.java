/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.content.Intent;
import ax.L5.f;
import ax.M5.E;

final class D
extends E {
    final Intent a;
    final f b;

    D(Intent intent, f f8, int n8) {
        this.a = intent;
        this.b = f8;
    }

    @Override
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}

