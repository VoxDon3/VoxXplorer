package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import ax.w0.C3321a;

/* loaded from: classes.dex */
public class o {
    private static final ThreadLocal<C3321a> d = new ThreadLocal<>();
    private final int a;
    private final n b;
    private volatile int c = 0;

    o(n nVar, int i) {
        this.b = nVar;
        this.a = i;
    }

    private C3321a g() {
        ThreadLocal<C3321a> threadLocal = d;
        C3321a c3321a = threadLocal.get();
        if (c3321a == null) {
            c3321a = new C3321a();
            threadLocal.set(c3321a);
        }
        this.b.d().j(c3321a, this.a);
        return c3321a;
    }

    public void a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface g = this.b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g);
        canvas.drawText(this.b.c(), this.a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i) {
        return g().h(i);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.c & 4) > 0;
    }

    public void l(boolean z) {
        int d2 = d();
        if (z) {
            this.c = d2 | 4;
        } else {
            this.c = d2;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void m(boolean z) {
        int i = this.c & 4;
        this.c = z ? i | 2 : i | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c = c();
        for (int i = 0; i < c; i++) {
            sb.append(Integer.toHexString(b(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
