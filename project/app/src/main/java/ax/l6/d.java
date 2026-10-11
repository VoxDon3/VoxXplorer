/*
 * Decompiled with CFR 0.152.
 */
package ax.l6;

import android.util.Property;
import android.view.ViewGroup;
import ax.k6.g;

public class d
extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> a = new d("childrenAlpha");

    private d(String string) {
        super(Float.class, string);
    }

    public Float a(ViewGroup object) {
        if ((object = (Float)object.getTag(g.E)) != null) {
            return object;
        }
        return Float.valueOf(1.0f);
    }

    public void b(ViewGroup viewGroup, Float f8) {
        float f9 = f8.floatValue();
        viewGroup.setTag(g.E, (Object)f8);
        int n8 = viewGroup.getChildCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            viewGroup.getChildAt(i8).setAlpha(f9);
        }
    }
}

