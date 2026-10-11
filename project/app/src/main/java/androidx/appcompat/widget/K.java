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

class K
extends D {
    private final WeakReference<Context> b;

    public K(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<Context>(context);
    }

    public Drawable getDrawable(int n8) throws Resources.NotFoundException {
        Drawable drawable = this.a(n8);
        Context context = (Context)this.b.get();
        if (drawable != null && context != null) {
            C.h().x(context, n8, drawable);
        }
        return drawable;
    }
}

