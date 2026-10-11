package ax.c4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ax.P3.s;
import ax.X3.k;
import ax.k4.h;

/* renamed from: ax.c4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1839b implements InterfaceC1841d<Bitmap, BitmapDrawable> {
    private final Resources a;
    private final ax.Q3.d b;

    public C1839b(Resources resources, ax.Q3.d dVar) {
        this.a = (Resources) h.d(resources);
        this.b = (ax.Q3.d) h.d(dVar);
    }

    @Override // ax.c4.InterfaceC1841d
    public s<BitmapDrawable> a(s<Bitmap> sVar) {
        return k.e(this.a, this.b, sVar.get());
    }
}
