package ax.l6;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes3.dex */
public class e extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> a = new e();

    private e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
