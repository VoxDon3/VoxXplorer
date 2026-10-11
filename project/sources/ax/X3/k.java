package ax.X3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ax.P3.p;
import ax.P3.s;

/* loaded from: classes.dex */
public class k implements s<BitmapDrawable>, p {
    private final Resources c0;
    private final ax.Q3.d d0;
    private final Bitmap q;

    k(Resources resources, ax.Q3.d dVar, Bitmap bitmap) {
        this.c0 = (Resources) ax.k4.h.d(resources);
        this.d0 = (ax.Q3.d) ax.k4.h.d(dVar);
        this.q = (Bitmap) ax.k4.h.d(bitmap);
    }

    public static k d(Context context, Bitmap bitmap) {
        return e(context.getResources(), ax.J3.c.c(context).f(), bitmap);
    }

    public static k e(Resources resources, ax.Q3.d dVar, Bitmap bitmap) {
        return new k(resources, dVar, bitmap);
    }

    @Override // ax.P3.p
    public void a() {
        this.q.prepareToDraw();
    }

    @Override // ax.P3.s
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // ax.P3.s
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.c0, this.q);
    }

    @Override // ax.P3.s
    public int getSize() {
        return ax.k4.i.g(this.q);
    }

    @Override // ax.P3.s
    public void recycle() {
        this.d0.c(this.q);
    }
}
