/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.view.View;
import android.view.ViewTreeObserver;

public final class L
implements ViewTreeObserver.OnPreDrawListener,
View.OnAttachStateChangeListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private L(View view, Runnable runnable2) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable2;
    }

    public static L a(View view, Runnable object) {
        if (view != null) {
            if (object != null) {
                object = new L(view, (Runnable)object);
                view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
                view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
                return object;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    public void b() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        }
        this.a.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    public boolean onPreDraw() {
        this.b();
        this.c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        this.b();
    }
}

