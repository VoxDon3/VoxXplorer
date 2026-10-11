/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import ax.K6.e;
import ax.K6.g;
import java.lang.ref.WeakReference;

public class u {
    private final TextPaint a = new TextPaint(1);
    private final g b = new g(this){
        final u a;
        {
            this.a = u8;
        }

        @Override
        public void a(int n8) {
            u.a(this.a, true);
            b b8 = (b)this.a.f.get();
            if (b8 != null) {
                b8.a();
            }
        }

        @Override
        public void b(Typeface object, boolean bl) {
            if (!bl) {
                u.a(this.a, true);
                object = (b)this.a.f.get();
                if (object != null) {
                    object.a();
                }
            }
        }
    };
    private float c;
    private float d;
    private boolean e = true;
    private WeakReference<b> f = new WeakReference<Object>(null);
    private e g;

    public u(b b8) {
        this.j(b8);
    }

    static /* synthetic */ boolean a(u u8, boolean bl) {
        u8.e = bl;
        return bl;
    }

    private float c(String string) {
        if (string == null) {
            return 0.0f;
        }
        return Math.abs(this.a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String string) {
        this.c = this.d(string);
        this.d = this.c(string);
        this.e = false;
    }

    public e e() {
        return this.g;
    }

    public float f(String string) {
        if (!this.e) {
            return this.d;
        }
        this.i(string);
        return this.d;
    }

    public TextPaint g() {
        return this.a;
    }

    public float h(String string) {
        if (!this.e) {
            return this.c;
        }
        this.i(string);
        return this.c;
    }

    public void j(b b8) {
        this.f = new WeakReference<b>(b8);
    }

    public void k(e object, Context context) {
        if (this.g != object) {
            this.g = object;
            if (object != null) {
                ((e)object).q(context, this.a, this.b);
                b b8 = (b)this.f.get();
                if (b8 != null) {
                    this.a.drawableState = b8.getState();
                }
                ((e)object).p(context, this.a, this.b);
                this.e = true;
            }
            if ((object = (b)this.f.get()) != null) {
                object.a();
                object.onStateChange(object.getState());
            }
        }
    }

    public void l(boolean bl) {
        this.e = bl;
    }

    public void m(boolean bl) {
        this.e = bl;
    }

    public void n(Context context) {
        this.g.p(context, this.a, this.b);
    }

    public static interface b {
        public void a();

        public int[] getState();

        public boolean onStateChange(int[] var1);
    }
}

