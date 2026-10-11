package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class K extends D {
    private final WeakReference<Context> b;

    public K(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable a = a(i);
        Context context = this.b.get();
        if (a != null && context != null) {
            C.h().x(context, i, a);
        }
        return a;
    }
}
