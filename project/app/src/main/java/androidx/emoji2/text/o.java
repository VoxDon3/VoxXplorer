/*
 * Decompiled with CFR 0.152.
 */
package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.emoji2.text.n;
import ax.w0.a;

public class o {
    private static final ThreadLocal<a> d = new ThreadLocal();
    private final int a;
    private final n b;
    private volatile int c = 0;

    o(n n8, int n9) {
        this.b = n8;
        this.a = n9;
    }

    private a g() {
        a a8;
        ThreadLocal<a> threadLocal = d;
        a a9 = a8 = threadLocal.get();
        if (a8 == null) {
            a9 = new a();
            threadLocal.set(a9);
        }
        this.b.d().j(a9, this.a);
        return a9;
    }

    public void a(Canvas canvas, float f8, float f9, Paint paint) {
        Typeface typeface = this.b.g();
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int n8 = this.a;
        canvas.drawText(this.b.c(), n8 * 2, 2, f8, f9, paint);
        paint.setTypeface(typeface2);
    }

    public int b(int n8) {
        return this.g().h(n8);
    }

    public int c() {
        return this.g().i();
    }

    @SuppressLint(value={"KotlinPropertyAccess"})
    public int d() {
        return this.c & 3;
    }

    public int e() {
        return this.g().k();
    }

    public int f() {
        return this.g().l();
    }

    public short h() {
        return this.g().m();
    }

    public int i() {
        return this.g().n();
    }

    public boolean j() {
        return this.g().j();
    }

    public boolean k() {
        return (this.c & 4) > 0;
    }

    public void l(boolean bl) {
        int n8 = this.d();
        if (bl) {
            this.c = n8 | 4;
            return;
        }
        this.c = n8;
    }

    @SuppressLint(value={"KotlinPropertyAccess"})
    public void m(boolean bl) {
        int n8 = this.c & 4;
        n8 = bl ? (n8 |= 2) : (n8 |= 1);
        this.c = n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(", id:");
        stringBuilder.append(Integer.toHexString(this.f()));
        stringBuilder.append(", codepoints:");
        int n8 = this.c();
        for (int i8 = 0; i8 < n8; ++i8) {
            stringBuilder.append(Integer.toHexString(this.b(i8)));
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}

