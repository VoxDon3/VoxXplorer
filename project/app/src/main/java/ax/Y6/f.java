/*
 * Decompiled with CFR 0.152.
 */
package ax.Y6;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import ax.Y6.b;
import ax.Y6.e;
import ax.a6.E;
import ax.a6.F;
import ax.a6.G;
import ax.a6.c0;

public final class f {
    public static void a(@RecentlyNonNull Activity object, @RecentlyNonNull b.a a8) {
        if (ax.a6.a.a((Context)object).b().a()) {
            a8.a(null);
            return;
        }
        G g8 = ax.a6.a.a((Context)object).c();
        c0.a();
        object = new E((Activity)object, a8);
        j.Objects.requireNonNull((Object)a8);
        g8.a((b)object, new F(a8));
    }

    public static interface a {
        public void b(@RecentlyNonNull e var1);
    }

    public static interface b {
        public void a(@RecentlyNonNull ax.Y6.b var1);
    }
}

