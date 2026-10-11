/*
 * Decompiled with CFR 0.152.
 */
package ax.l6;

import android.graphics.drawable.Drawable;
import android.util.Property;

public class e
extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> a = new e();

    private e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    public Integer a(Drawable drawable) {
        return drawable.getAlpha();
    }

    public void b(Drawable drawable, Integer n8) {
        drawable.setAlpha(n8.intValue());
    }
}

