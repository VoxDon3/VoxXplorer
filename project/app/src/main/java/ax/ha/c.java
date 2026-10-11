/*
 * Decompiled with CFR 0.152.
 */
package ax.ha;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import ax.ca.e;
import ax.ca.h;
import ax.ha.a;

public class c
implements a {
    protected final String a;
    protected final e b;
    protected final h c;

    public c(String string, e e8, h h8) {
        if (e8 != null) {
            if (h8 != null) {
                this.a = string;
                this.b = e8;
                this.c = h8;
                return;
            }
            throw new IllegalArgumentException("scaleType must not be null");
        }
        throw new IllegalArgumentException("imageSize must not be null");
    }

    @Override
    public int a() {
        if (TextUtils.isEmpty((CharSequence)this.a)) {
            return super.hashCode();
        }
        return this.a.hashCode();
    }

    @Override
    public int f() {
        return this.b.a();
    }

    @Override
    public boolean g(Drawable drawable) {
        return true;
    }

    @Override
    public View h() {
        return null;
    }

    @Override
    public int i() {
        return this.b.b();
    }

    @Override
    public boolean j() {
        return false;
    }

    @Override
    public h k() {
        return this.c;
    }

    @Override
    public boolean l(Bitmap bitmap) {
        return true;
    }
}

