/*
 * Decompiled with CFR 0.152.
 */
package ax.q5;

import android.content.Context;
import ax.q5.c;
import ax.z5.a;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class h {
    public static h a(Context context, a a8, a a9, String string) {
        return new c(context, a8, a9, string);
    }

    public abstract Context b();

    public abstract String c();

    public abstract a d();

    public abstract a e();
}

