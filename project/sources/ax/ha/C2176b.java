package ax.ha;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import ax.ca.h;

/* renamed from: ax.ha.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2176b extends d {
    public C2176b(ImageView imageView) {
        super(imageView);
    }

    @Override // ax.ha.d
    protected void b(Bitmap bitmap, View view) {
        ((ImageView) view).setImageBitmap(bitmap);
    }

    @Override // ax.ha.d
    protected void c(Drawable drawable, View view) {
        ((ImageView) view).setImageDrawable(drawable);
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    @Override // ax.ha.d, ax.ha.InterfaceC2175a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ImageView h() {
        return (ImageView) super.h();
    }

    @Override // ax.ha.d, ax.ha.InterfaceC2175a
    public int f() {
        ImageView imageView;
        int f = super.f();
        return (f > 0 || (imageView = (ImageView) this.a.get()) == null) ? f : imageView.getMaxHeight();
    }

    @Override // ax.ha.d, ax.ha.InterfaceC2175a
    public int i() {
        ImageView imageView;
        int i = super.i();
        return (i > 0 || (imageView = (ImageView) this.a.get()) == null) ? i : imageView.getMaxWidth();
    }

    @Override // ax.ha.d, ax.ha.InterfaceC2175a
    public h k() {
        ImageView imageView = (ImageView) this.a.get();
        return imageView != null ? h.h(imageView) : super.k();
    }
}
