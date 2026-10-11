package ax.v2;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: ax.v2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3263f {

    /* renamed from: ax.v2.f$a */
    static class a {
        static <T, V> ObjectAnimator a(T t, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
    }

    static <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        return a.a(t, property, path);
    }
}
