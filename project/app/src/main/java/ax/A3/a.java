/*
 * Decompiled with CFR 0.152.
 */
package ax.A3;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import ax.A3.b;
import com.android.ex.photo.f;
import java.util.concurrent.Executor;

public class a
extends ax.c5.a<b.a>
implements b {
    private String o;
    private b.a p;

    public a(Context context, Executor executor, String string) {
        super(context, executor);
        this.o = string;
    }

    public void K(b.a a8) {
        if (this.m()) {
            if (a8 != null) {
                this.N(a8.c);
                this.O(a8.b);
                return;
            }
        } else {
            Bitmap bitmap;
            b.a a9 = this.p;
            this.p = a8;
            if (this.n()) {
                super.h(a8);
            }
            if (a9 != null && (bitmap = a9.c) != a8.c) {
                this.N(bitmap);
            }
            if (a9 != null && (a9 = a9.b) != a8.b) {
                this.O((Drawable)a9);
            }
        }
    }

    public b.a L() {
        b.a a8;
        block5: {
            UnsupportedOperationException unsupportedOperationException2;
            b.a a9;
            block6: {
                block4: {
                    a9 = new b.a();
                    Context context = this.j();
                    a8 = a9;
                    if (context == null) break block5;
                    a8 = a9;
                    if (this.o == null) break block5;
                    a8 = context.getContentResolver();
                    try {
                        a9 = a8 = ax.C3.b.c(ax.C3.b.b((ContentResolver)a8, Uri.parse((String)this.o)), f.O, true);
                    }
                    catch (UnsupportedOperationException unsupportedOperationException2) {}
                    context = a8.c;
                    if (context == null) break block4;
                    a9 = a8;
                    context.setDensity(160);
                    return a8;
                    break block6;
                }
                return a8;
            }
            a9.e = 1;
            a9.h = unsupportedOperationException2;
            a8 = a9;
        }
        return a8;
    }

    public void M(b.a a8) {
        super.I(a8);
        if (a8 != null) {
            this.N(a8.c);
            this.O(a8.b);
        }
    }

    protected void N(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    protected void O(Drawable drawable) {
    }

    @Override
    public void b(String string) {
        this.o = string;
    }

    @Override
    protected void s() {
        super.s();
        this.u();
        b.a a8 = this.p;
        if (a8 != null) {
            this.N(a8.c);
            this.O(this.p.b);
            this.p = null;
        }
    }

    @Override
    protected void t() {
        b.a a8 = this.p;
        if (a8 != null) {
            this.K(a8);
        }
        if (!this.A() && this.p != null) {
            return;
        }
        this.a();
    }

    @Override
    protected void u() {
        this.d();
    }
}

