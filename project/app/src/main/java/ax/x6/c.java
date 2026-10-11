/*
 * Decompiled with CFR 0.152.
 */
package ax.x6;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import ax.G6.a;

public interface c {
    public void a();

    public void b();

    public int getCircularRevealScrimColor();

    public e getRevealInfo();

    public void setCircularRevealOverlayDrawable(Drawable var1);

    public void setCircularRevealScrimColor(int var1);

    public void setRevealInfo(e var1);

    public static class b
    implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();
        private final e a = new e();

        public e a(float f8, e e8, e e9) {
            this.a.a(ax.G6.a.d(e8.a, e9.a, f8), ax.G6.a.d(e8.b, e9.b, f8), ax.G6.a.d(e8.c, e9.c, f8));
            return this.a;
        }
    }

    public static class c
    extends Property<c, e> {
        public static final Property<c, e> a = new c("circularReveal");

        private c(String string) {
            super(e.class, string);
        }

        public e a(c c8) {
            return c8.getRevealInfo();
        }

        public void b(c c8, e e8) {
            c8.setRevealInfo(e8);
        }
    }

    public static class d
    extends Property<c, Integer> {
        public static final Property<c, Integer> a = new d("circularRevealScrimColor");

        private d(String string) {
            super(Integer.class, string);
        }

        public Integer a(c c8) {
            return c8.getCircularRevealScrimColor();
        }

        public void b(c c8, Integer n8) {
            c8.setCircularRevealScrimColor(n8);
        }
    }

    public static class e {
        public float a;
        public float b;
        public float c;

        private e() {
        }

        public e(float f8, float f9, float f10) {
            this.a = f8;
            this.b = f9;
            this.c = f10;
        }

        public void a(float f8, float f9, float f10) {
            this.a = f8;
            this.b = f9;
            this.c = f10;
        }
    }
}

