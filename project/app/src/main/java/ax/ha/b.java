/*
 * Decompiled with CFR 0.152.
 */
package ax.ha;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import ax.ca.h;
import ax.ha.d;

public class b
extends d {
    public b(ImageView imageView) {
        super((View)imageView);
    }

    @Override
    protected void b(Bitmap bitmap, View view) {
        ((ImageView)view).setImageBitmap(bitmap);
    }

    @Override
    protected void c(Drawable drawable, View view) {
        ((ImageView)view).setImageDrawable(drawable);
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable)drawable).start();
        }
    }

    public ImageView d() {
        return (ImageView)super.h();
    }

    @Override
    public int f() {
        int n8;
        int n9 = n8 = super.f();
        if (n8 <= 0) {
            ImageView imageView = (ImageView)this.a.get();
            n9 = n8;
            if (imageView != null) {
                n9 = imageView.getMaxHeight();
            }
        }
        return n9;
    }

    @Override
    public int i() {
        int n8;
        int n9 = n8 = super.i();
        if (n8 <= 0) {
            ImageView imageView = (ImageView)this.a.get();
            n9 = n8;
            if (imageView != null) {
                n9 = imageView.getMaxWidth();
            }
        }
        return n9;
    }

    @Override
    public h k() {
        ImageView imageView = (ImageView)this.a.get();
        if (imageView != null) {
            return h.h(imageView);
        }
        return super.k();
    }
}

