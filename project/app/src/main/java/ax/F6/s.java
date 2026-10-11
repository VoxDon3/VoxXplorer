/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import ax.F6.k;
import ax.F6.l;
import ax.F6.m;
import ax.F6.n;
import ax.F6.o;
import ax.F6.p;
import ax.F6.q;
import ax.F6.r;
import ax.F6.t;
import ax.b0.g;
import ax.u.h;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;

public final class s {
    static final int o;
    private static boolean p;
    private static Constructor<StaticLayout> q;
    private static Object r;
    private CharSequence a;
    private final TextPaint b;
    private final int c;
    private int d;
    private int e;
    private Layout.Alignment f;
    private int g;
    private float h;
    private float i;
    private int j;
    private boolean k;
    private boolean l;
    private TextUtils.TruncateAt m;
    private t n;

    static {
        int n8 = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
        o = n8;
    }

    private s(CharSequence charSequence, TextPaint textPaint, int n8) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = n8;
        this.d = 0;
        this.e = charSequence.length();
        this.f = Layout.Alignment.ALIGN_NORMAL;
        this.g = Integer.MAX_VALUE;
        this.h = 0.0f;
        this.i = 1.0f;
        this.j = o;
        this.k = true;
        this.m = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b() throws a {
        boolean bl;
        if (p) {
            return;
        }
        try {
            bl = this.l && Build.VERSION.SDK_INT >= 23;
        }
        catch (Exception exception) {
            throw new a(exception);
        }
        Object object = bl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        r = object;
        Class<Integer> clazz = Integer.TYPE;
        object = Float.TYPE;
        q = object = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, clazz, clazz, TextPaint.class, clazz, Layout.Alignment.class, TextDirectionHeuristic.class, object, object, Boolean.TYPE, TextUtils.TruncateAt.class, clazz, clazz});
        ((AccessibleObject)object).setAccessible(true);
        p = true;
    }

    public static s c(CharSequence charSequence, TextPaint textPaint, int n8) {
        return new s(charSequence, textPaint, n8);
    }

    public StaticLayout a() throws a {
        int n8;
        if (this.a == null) {
            this.a = "";
        }
        int n9 = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        Object object = charSequence;
        if (this.g == 1) {
            object = TextUtils.ellipsize((CharSequence)charSequence, (TextPaint)this.b, (float)n9, (TextUtils.TruncateAt)this.m);
        }
        this.e = n8 = Math.min(object.length(), this.e);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.l && this.g == 1) {
                this.f = Layout.Alignment.ALIGN_OPPOSITE;
            }
            charSequence = ax.F6.k.a((CharSequence)object, this.d, n8, this.b, n9);
            ax.F6.l.a((StaticLayout.Builder)charSequence, this.f);
            ax.F6.m.a((StaticLayout.Builder)charSequence, this.k);
            object = this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            ax.u.h.a((StaticLayout.Builder)charSequence, (TextDirectionHeuristic)object);
            object = this.m;
            if (object != null) {
                ax.F6.n.a((StaticLayout.Builder)charSequence, (TextUtils.TruncateAt)object);
            }
            ax.F6.o.a((StaticLayout.Builder)charSequence, this.g);
            float f8 = this.h;
            if (f8 != 0.0f || this.i != 1.0f) {
                ax.F6.p.a((StaticLayout.Builder)charSequence, f8, this.i);
            }
            if (this.g > 1) {
                ax.F6.q.a((StaticLayout.Builder)charSequence, this.j);
            }
            if ((object = this.n) != null) {
                object.a((StaticLayout.Builder)charSequence);
            }
            return ax.F6.r.a((StaticLayout.Builder)charSequence);
        }
        this.b();
        try {
            object = ax.b0.g.g(q).newInstance(object, this.d, this.e, this.b, n9, this.f, ax.b0.g.g(r), Float.valueOf(1.0f), Float.valueOf(0.0f), this.k, null, n9, this.g);
            return object;
        }
        catch (Exception exception) {
            throw new a(exception);
        }
    }

    public s d(Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    public s e(TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    public s f(int n8) {
        this.j = n8;
        return this;
    }

    public s g(boolean bl) {
        this.k = bl;
        return this;
    }

    public s h(boolean bl) {
        this.l = bl;
        return this;
    }

    public s i(float f8, float f9) {
        this.h = f8;
        this.i = f9;
        return this;
    }

    public s j(int n8) {
        this.g = n8;
        return this;
    }

    public s k(t t8) {
        this.n = t8;
        return this;
    }

    public static class a
    extends Exception {
        a(Throwable throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error thrown initializing StaticLayout ");
            stringBuilder.append(throwable.getMessage());
            super(stringBuilder.toString(), throwable);
        }
    }
}

