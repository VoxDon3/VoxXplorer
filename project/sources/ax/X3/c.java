package ax.X3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ax.P3.s;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class c implements ax.M3.m<BitmapDrawable> {
    private final ax.M3.m<Bitmap> b;

    public c(ax.M3.m<Bitmap> mVar) {
        this.b = (ax.M3.m) ax.k4.h.d(mVar);
    }

    @Override // ax.M3.h
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // ax.M3.m
    public s<BitmapDrawable> b(Context context, s<BitmapDrawable> sVar, int i, int i2) {
        e d = e.d(sVar.get().getBitmap(), ax.J3.c.c(context).f());
        s<Bitmap> b = this.b.b(context, d, i, i2);
        return b.equals(d) ? sVar : k.d(context, b.get());
    }

    @Override // ax.M3.m, ax.M3.h
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.b.equals(((c) obj).b);
        }
        return false;
    }

    @Override // ax.M3.m, ax.M3.h
    public int hashCode() {
        return this.b.hashCode();
    }
}
