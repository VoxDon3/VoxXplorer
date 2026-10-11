/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.a;
import ax.B2.l;
import ax.B2.t;
import ax.C2.D;
import java.util.Collections;
import java.util.List;

@SuppressLint(value={"AddedAbstractMethod"})
public abstract class s {
    protected s() {
    }

    public static s c(Context context) {
        return D.j(context);
    }

    public static void d(Context context, a a8) {
        D.d(context, a8);
    }

    public final l a(t t8) {
        return this.b(Collections.singletonList(t8));
    }

    public abstract l b(List<? extends t> var1);
}

