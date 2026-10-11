/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

class f {
    static <T> ObjectAnimator a(T t8, Property<T, PointF> property, Path path) {
        return a.a(t8, property, path);
    }

    static class a {
        static <T, V> ObjectAnimator a(T t8, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t8, property, null, (Path)path);
        }
    }
}

