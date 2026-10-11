package ax.w2;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: ax.w2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3330b {
    Animatable2.AnimationCallback a;

    /* renamed from: ax.w2.b$a */
    class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            AbstractC3330b.this.b(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            AbstractC3330b.this.c(drawable);
        }
    }

    Animatable2.AnimationCallback a() {
        if (this.a == null) {
            this.a = new a();
        }
        return this.a;
    }

    public void b(Drawable drawable) {
    }

    public void c(Drawable drawable) {
    }
}
