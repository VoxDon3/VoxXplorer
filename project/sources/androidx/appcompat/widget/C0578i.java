package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* renamed from: androidx.appcompat.widget.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0578i {
    private final CheckedTextView a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    C0578i(CheckedTextView checkedTextView) {
        this.a = checkedTextView;
    }

    void a() {
        Drawable a = ax.h0.b.a(this.a);
        if (a != null) {
            if (this.d || this.e) {
                Drawable mutate = ax.U.a.r(a).mutate();
                if (this.d) {
                    ax.U.a.o(mutate, this.b);
                }
                if (this.e) {
                    ax.U.a.p(mutate, this.c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.a.getDrawableState());
                }
                this.a.setCheckMarkDrawable(mutate);
            }
        }
    }

    ColorStateList b() {
        return this.b;
    }

    PorterDuff.Mode c() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0057, B:11:0x005f, B:12:0x0068, B:14:0x0070, B:21:0x003c, B:23:0x0044, B:25:0x004a), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0057, B:11:0x005f, B:12:0x0068, B:14:0x0070, B:21:0x003c, B:23:0x0044, B:25:0x004a), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void d(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CheckedTextView r0 = r10.a
            android.content.Context r0 = r0.getContext()
            int[] r3 = ax.m.j.P0
            r8 = 0
            androidx.appcompat.widget.L r9 = androidx.appcompat.widget.L.v(r0, r11, r3, r12, r8)
            android.widget.CheckedTextView r1 = r10.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r9.r()
            r7 = 0
            r4 = r11
            r6 = r12
            ax.c0.C1760d0.j0(r1, r2, r3, r4, r5, r6, r7)
            int r11 = ax.m.j.R0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.s(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L3c
            int r11 = r9.n(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L3c
            android.widget.CheckedTextView r12 = r10.a     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.graphics.drawable.Drawable r11 = ax.o.C2653a.b(r0, r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            goto L57
        L39:
            r0 = move-exception
            r11 = r0
            goto L83
        L3c:
            int r11 = ax.m.j.Q0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.s(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L57
            int r11 = r9.n(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L57
            android.widget.CheckedTextView r12 = r10.a     // Catch: java.lang.Throwable -> L39
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r11 = ax.o.C2653a.b(r0, r11)     // Catch: java.lang.Throwable -> L39
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L39
        L57:
            int r11 = ax.m.j.S0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.s(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L68
            android.widget.CheckedTextView r12 = r10.a     // Catch: java.lang.Throwable -> L39
            android.content.res.ColorStateList r11 = r9.c(r11)     // Catch: java.lang.Throwable -> L39
            ax.h0.b.b(r12, r11)     // Catch: java.lang.Throwable -> L39
        L68:
            int r11 = ax.m.j.T0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.s(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L7f
            android.widget.CheckedTextView r12 = r10.a     // Catch: java.lang.Throwable -> L39
            r0 = -1
            int r11 = r9.k(r11, r0)     // Catch: java.lang.Throwable -> L39
            r0 = 0
            android.graphics.PorterDuff$Mode r11 = androidx.appcompat.widget.A.e(r11, r0)     // Catch: java.lang.Throwable -> L39
            ax.h0.b.c(r12, r11)     // Catch: java.lang.Throwable -> L39
        L7f:
            r9.x()
            return
        L83:
            r9.x()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0578i.d(android.util.AttributeSet, int):void");
    }

    void e() {
        if (this.f) {
            this.f = false;
        } else {
            this.f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
