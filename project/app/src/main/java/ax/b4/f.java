/*
 * Decompiled with CFR 0.152.
 */
package ax.b4;

import android.content.Context;
import android.graphics.Bitmap;
import ax.M3.m;
import ax.P3.s;
import ax.Q3.d;
import ax.X3.e;
import ax.b4.c;
import ax.k4.h;
import java.security.MessageDigest;

public class f
implements m<c> {
    private final m<Bitmap> b;

    public f(m<Bitmap> m8) {
        this.b = h.d(m8);
    }

    @Override
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override
    public s<c> b(Context object, s<c> s8, int n8, int n9) {
        c c8 = s8.get();
        Object object2 = ax.J3.c.c((Context)object).f();
        object2 = new e(c8.d(), (d)object2);
        if (!object2.equals(object = this.b.b((Context)object, (s<Bitmap>)object2, n8, n9))) {
            object2.recycle();
        }
        object = (Bitmap)object.get();
        c8.k(this.b, (Bitmap)object);
        return s8;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof f) {
            object = (f)object;
            return this.b.equals(((f)object).b);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
}

