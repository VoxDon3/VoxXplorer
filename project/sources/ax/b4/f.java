package ax.b4;

import android.content.Context;
import android.graphics.Bitmap;
import ax.M3.m;
import ax.P3.s;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class f implements m<c> {
    private final m<Bitmap> b;

    public f(m<Bitmap> mVar) {
        this.b = (m) ax.k4.h.d(mVar);
    }

    @Override // ax.M3.h
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // ax.M3.m
    public s<c> b(Context context, s<c> sVar, int i, int i2) {
        c cVar = sVar.get();
        s<Bitmap> eVar = new ax.X3.e(cVar.d(), ax.J3.c.c(context).f());
        s<Bitmap> b = this.b.b(context, eVar, i, i2);
        if (!eVar.equals(b)) {
            eVar.recycle();
        }
        cVar.k(this.b, b.get());
        return sVar;
    }

    @Override // ax.M3.m, ax.M3.h
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.b.equals(((f) obj).b);
        }
        return false;
    }

    @Override // ax.M3.m, ax.M3.h
    public int hashCode() {
        return this.b.hashCode();
    }
}
