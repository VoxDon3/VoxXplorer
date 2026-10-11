/*
 * Decompiled with CFR 0.152.
 */
package ax.l;

import android.content.Context;
import android.content.Intent;
import ax.Gb.g;
import ax.Gb.l;

public final class c
extends ax.l.a<Intent, ax.k.a> {
    public static final a a = new a(null);

    public Intent d(Context context, Intent intent) {
        l.f(context, "context");
        l.f(intent, "input");
        return intent;
    }

    public ax.k.a e(int n8, Intent intent) {
        return new ax.k.a(n8, intent);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

