package ax.F6;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import ax.b0.C1446g;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.lang.reflect.Constructor;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class s {
    static final int o;
    private static boolean p;
    private static Constructor<StaticLayout> q;
    private static Object r;
    private CharSequence a;
    private final TextPaint b;
    private final int c;
    private int e;
    private boolean l;
    private t n;
    private int d = 0;
    private Layout.Alignment f = Layout.Alignment.ALIGN_NORMAL;
    private int g = SubsamplingScaleImageView.TILE_SIZE_AUTO;
    private float h = 0.0f;
    private float i = 1.0f;
    private int j = o;
    private boolean k = true;
    private TextUtils.TruncateAt m = null;

    public static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        o = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private s(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.e = charSequence.length();
    }

    private void b() throws a {
        if (p) {
            return;
        }
        try {
            r = this.l && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            q = declaredConstructor;
            declaredConstructor.setAccessible(true);
            p = true;
        } catch (Exception e) {
            throw new a(e);
        }
    }

    public static s c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new s(charSequence, textPaint, i);
    }

    public StaticLayout a() throws a {
        StaticLayout.Builder obtain;
        StaticLayout build;
        if (this.a == null) {
            this.a = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, max, this.m);
        }
        int min = Math.min(charSequence.length(), this.e);
        this.e = min;
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                return (StaticLayout) ((Constructor) C1446g.g(q)).newInstance(charSequence, Integer.valueOf(this.d), Integer.valueOf(this.e), this.b, Integer.valueOf(max), this.f, C1446g.g(r), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.k), null, Integer.valueOf(max), Integer.valueOf(this.g));
            } catch (Exception e) {
                throw new a(e);
            }
        }
        if (this.l && this.g == 1) {
            this.f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        obtain = StaticLayout.Builder.obtain(charSequence, this.d, min, this.b, max);
        obtain.setAlignment(this.f);
        obtain.setIncludePad(this.k);
        obtain.setTextDirection(this.l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.g);
        float f = this.h;
        if (f != 0.0f || this.i != 1.0f) {
            obtain.setLineSpacing(f, this.i);
        }
        if (this.g > 1) {
            obtain.setHyphenationFrequency(this.j);
        }
        t tVar = this.n;
        if (tVar != null) {
            tVar.a(obtain);
        }
        build = obtain.build();
        return build;
    }

    public s d(Layout.Alignment alignment) {
        this.f = alignment;
        return this;
    }

    public s e(TextUtils.TruncateAt truncateAt) {
        this.m = truncateAt;
        return this;
    }

    public s f(int i) {
        this.j = i;
        return this;
    }

    public s g(boolean z) {
        this.k = z;
        return this;
    }

    public s h(boolean z) {
        this.l = z;
        return this;
    }

    public s i(float f, float f2) {
        this.h = f;
        this.i = f2;
        return this;
    }

    public s j(int i) {
        this.g = i;
        return this;
    }

    public s k(t tVar) {
        this.n = tVar;
        return this;
    }
}
