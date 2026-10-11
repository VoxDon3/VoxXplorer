/*
 * Decompiled with CFR 0.152.
 */
package com.android.ex.photo;

import android.graphics.drawable.Drawable;
import ax.n.a;
import com.android.ex.photo.a;

public class b
implements com.android.ex.photo.a {
    private final ax.n.a a;

    public b(ax.n.a a8) {
        this.a = a8;
    }

    @Override
    public void a() {
        this.a.y(8, 8);
    }

    @Override
    public void b(boolean bl) {
        this.a.x(bl);
    }

    @Override
    public void c(a.a a8) {
        this.a.g(new a(this, a8));
    }

    @Override
    public void e(Drawable drawable) {
        this.a.D(drawable);
    }

    @Override
    public void h(CharSequence charSequence) {
        this.a.F(charSequence);
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.a.H(charSequence);
    }

    private class a
    implements a.b {
        private final a.a a;
        final b b;

        public a(b b8, a.a a8) {
            this.b = b8;
            this.a = a8;
        }

        @Override
        public void a(boolean bl) {
            this.a.a(bl);
        }
    }
}

