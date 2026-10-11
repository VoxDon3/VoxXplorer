/*
 * Decompiled with CFR 0.152.
 */
package ax.w2;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

public abstract class b {
    Animatable2.AnimationCallback a;

    Animatable2.AnimationCallback a() {
        if (this.a == null) {
            this.a = new Animatable2.AnimationCallback(this){
                final b a;
                {
                    this.a = b8;
                }

                public void onAnimationEnd(Drawable drawable) {
                    this.a.b(drawable);
                }

                public void onAnimationStart(Drawable drawable) {
                    this.a.c(drawable);
                }
            };
        }
        return this.a;
    }

    public void b(Drawable drawable) {
    }

    public void c(Drawable drawable) {
    }
}

