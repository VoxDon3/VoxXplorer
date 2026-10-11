/*
 * Decompiled with CFR 0.152.
 */
package ax.A2;

import android.content.Context;
import android.os.Build;
import ax.A2.n;
import ax.A2.o;

public interface m {
    public static final a a = ax.A2.m$a.a;

    public float a(Context var1);

    public static final class a {
        static final a a = new a();

        private a() {
        }

        public final m a() {
            if (Build.VERSION.SDK_INT >= 34) {
                return n.b;
            }
            return o.b;
        }
    }
}

