/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.C;
import androidx.appcompat.widget.D;
import java.lang.ref.WeakReference;

public class N
extends D {
    private static boolean c = false;
    private final WeakReference<Context> b;

    public N(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<Context>(context);
    }

    public static boolean b() {
        return c;
    }

    public static void c(boolean bl) {
        c = bl;
    }

    public static boolean d() {
        N.b();
        return false;
    }

    public Drawable getDrawable(int n8) throws Resources.NotFoundException {
        Context context = (Context)this.b.get();
        if (context != null) {
            return C.h().t(context, this, n8);
        }
        return this.a(n8);
    }
}

