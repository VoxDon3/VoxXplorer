/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import ax.A2.m;
import ax.A2.w;
import ax.A2.x;
import ax.A2.y;

public interface v {
    public static final a a = ax.A2.v$a.a;

    public ax.z2.a a(Context var1, m var2);

    public ax.z2.a b(Activity var1, m var2);

    public static final class a {
        static final a a = new a();

        private a() {
        }

        public final v a() {
            int n8 = Build.VERSION.SDK_INT;
            if (n8 >= 34) {
                return x.b;
            }
            if (n8 >= 30) {
                return w.b;
            }
            return y.b;
        }
    }
}

