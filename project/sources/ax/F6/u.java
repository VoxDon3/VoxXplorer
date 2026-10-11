package ax.F6;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class u {
    private float c;
    private float d;
    private ax.K6.e g;
    private final TextPaint a = new TextPaint(1);
    private final ax.K6.g b = new a();
    private boolean e = true;
    private WeakReference<b> f = new WeakReference<>(null);

    class a extends ax.K6.g {
        a() {
        }

        @Override // ax.K6.g
        public void a(int i) {
            u.this.e = true;
            b bVar = (b) u.this.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // ax.K6.g
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            u.this.e = true;
            b bVar = (b) u.this.f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public u(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        if (str == null) {
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

    private void i(String str) {
        this.c = d(str);
        this.d = c(str);
        this.e = false;
    }

    public ax.K6.e e() {
        return this.g;
    }

    public float f(String str) {
        if (!this.e) {
            return this.d;
        }
        i(str);
        return this.d;
    }

    public TextPaint g() {
        return this.a;
    }

    public float h(String str) {
        if (!this.e) {
            return this.c;
        }
        i(str);
        return this.c;
    }

    public void j(b bVar) {
        this.f = new WeakReference<>(bVar);
    }

    public void k(ax.K6.e eVar, Context context) {
        if (this.g != eVar) {
            this.g = eVar;
            if (eVar != null) {
                eVar.q(context, this.a, this.b);
                b bVar = this.f.get();
                if (bVar != null) {
                    this.a.drawableState = bVar.getState();
                }
                eVar.p(context, this.a, this.b);
                this.e = true;
            }
            b bVar2 = this.f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z) {
        this.e = z;
    }

    public void m(boolean z) {
        this.e = z;
    }

    public void n(Context context) {
        this.g.p(context, this.a, this.b);
    }
}
