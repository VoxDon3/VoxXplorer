/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ax.M3.m;
import ax.P3.s;
import ax.X3.e;
import ax.X3.k;
import ax.k4.h;
import java.security.MessageDigest;

public class c
implements m<BitmapDrawable> {
    private final m<Bitmap> b;

    public c(m<Bitmap> m8) {
        this.b = h.d(m8);
    }

    @Override
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override
    public s<BitmapDrawable> b(Context context, s<BitmapDrawable> s8, int n8, int n9) {
        e e8 = e.d(s8.get().getBitmap(), ax.J3.c.c(context).f());
        s<Bitmap> s9 = this.b.b(context, e8, n8, n9);
        if (s9.equals(e8)) {
            return s8;
        }
        return k.d(context, s9.get());
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof c) {
            object = (c)object;
            return this.b.equals(((c)object).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
}

