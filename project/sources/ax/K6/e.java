package ax.K6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import ax.S.h;
import ax.k6.m;

/* loaded from: classes3.dex */
public class e {
    public final ColorStateList a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final String d;
    public String e;
    public final int f;
    public final int g;
    public final boolean h;
    public final float i;
    public final float j;
    public final float k;
    public final boolean l;
    public final float m;
    private ColorStateList n;
    private float o;
    private final int p;
    private boolean q = false;
    private boolean r = false;
    private Typeface s;

    class a extends h.e {
        final /* synthetic */ g a;

        a(g gVar) {
            this.a = gVar;
        }

        @Override // ax.S.h.e
        public void f(int i) {
            e.this.q = true;
            this.a.a(i);
        }

        @Override // ax.S.h.e
        public void g(Typeface typeface) {
            e eVar = e.this;
            eVar.s = Typeface.create(typeface, eVar.f);
            e.this.q = true;
            this.a.b(e.this.s, false);
        }
    }

    class b extends g {
        final /* synthetic */ Context a;
        final /* synthetic */ TextPaint b;
        final /* synthetic */ g c;

        b(Context context, TextPaint textPaint, g gVar) {
            this.a = context;
            this.b = textPaint;
            this.c = gVar;
        }

        @Override // ax.K6.g
        public void a(int i) {
            this.c.a(i);
        }

        @Override // ax.K6.g
        public void b(Typeface typeface, boolean z) {
            e.this.r(this.a, this.b, typeface);
            this.c.b(typeface, z);
        }
    }

    public e(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ax.m.j.B2);
        o(obtainStyledAttributes.getDimension(ax.m.j.C2, 0.0f));
        n(c.a(context, obtainStyledAttributes, ax.m.j.F2));
        this.a = c.a(context, obtainStyledAttributes, ax.m.j.G2);
        this.b = c.a(context, obtainStyledAttributes, ax.m.j.H2);
        this.f = obtainStyledAttributes.getInt(ax.m.j.E2, 0);
        this.g = obtainStyledAttributes.getInt(ax.m.j.D2, 1);
        int f = c.f(obtainStyledAttributes, ax.m.j.O2, ax.m.j.M2);
        this.p = obtainStyledAttributes.getResourceId(f, 0);
        this.d = obtainStyledAttributes.getString(f);
        this.h = obtainStyledAttributes.getBoolean(ax.m.j.Q2, false);
        this.c = c.a(context, obtainStyledAttributes, ax.m.j.I2);
        this.i = obtainStyledAttributes.getFloat(ax.m.j.J2, 0.0f);
        this.j = obtainStyledAttributes.getFloat(ax.m.j.K2, 0.0f);
        this.k = obtainStyledAttributes.getFloat(ax.m.j.L2, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, m.a4);
        int i2 = m.b4;
        this.l = obtainStyledAttributes2.hasValue(i2);
        this.m = obtainStyledAttributes2.getFloat(i2, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = obtainStyledAttributes2.getString(c.f(obtainStyledAttributes2, m.e4, m.c4));
        }
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.s == null && (str = this.d) != null) {
            this.s = Typeface.create(str, this.f);
        }
        if (this.s == null) {
            int i = this.g;
            if (i == 1) {
                this.s = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.s = Typeface.SERIF;
            } else if (i != 3) {
                this.s = Typeface.DEFAULT;
            } else {
                this.s = Typeface.MONOSPACE;
            }
            this.s = Typeface.create(this.s, this.f);
        }
    }

    private Typeface i(Context context) {
        Typeface create;
        if (this.r) {
            return null;
        }
        this.r = true;
        String m = m(context, this.p);
        if (m == null || (create = Typeface.create(m, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(create, this.f);
    }

    private boolean l(Context context) {
        if (f.a()) {
            f(context);
            return true;
        }
        if (this.q) {
            return true;
        }
        int i = this.p;
        if (i == 0) {
            return false;
        }
        Typeface c = ax.S.h.c(context, i);
        if (c != null) {
            this.s = c;
            this.q = true;
            return true;
        }
        Typeface i2 = i(context);
        if (i2 == null) {
            return false;
        }
        this.s = i2;
        this.q = true;
        return true;
    }

    @SuppressLint({"ResourceType"})
    private static String m(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 0 && resources.getResourceTypeName(i).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), ax.O.g.h);
                        String string = obtainAttributes.getString(ax.O.g.o);
                        obtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public Typeface e() {
        d();
        return this.s;
    }

    public Typeface f(Context context) {
        if (this.q) {
            return this.s;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g = ax.S.h.g(context, this.p);
                this.s = g;
                if (g != null) {
                    this.s = Typeface.create(g, this.f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.d, e);
            }
        }
        d();
        this.q = true;
        return this.s;
    }

    public void g(Context context, TextPaint textPaint, g gVar) {
        r(context, textPaint, e());
        h(context, new b(context, textPaint, gVar));
    }

    public void h(Context context, g gVar) {
        if (!l(context)) {
            d();
        }
        int i = this.p;
        if (i == 0) {
            this.q = true;
        }
        if (this.q) {
            gVar.b(this.s, true);
            return;
        }
        try {
            ax.S.h.i(context, i, new a(gVar), null);
        } catch (Resources.NotFoundException unused) {
            this.q = true;
            gVar.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.d, e);
            this.q = true;
            gVar.a(-3);
        }
    }

    public ColorStateList j() {
        return this.n;
    }

    public float k() {
        return this.o;
    }

    public void n(ColorStateList colorStateList) {
        this.n = colorStateList;
    }

    public void o(float f) {
        this.o = f;
    }

    public void p(Context context, TextPaint textPaint, g gVar) {
        q(context, textPaint, gVar);
        ColorStateList colorStateList = this.n;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.k;
        float f2 = this.i;
        float f3 = this.j;
        ColorStateList colorStateList2 = this.c;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void q(Context context, TextPaint textPaint, g gVar) {
        Typeface typeface;
        if (l(context) && this.q && (typeface = this.s) != null) {
            r(context, textPaint, typeface);
        } else {
            g(context, textPaint, gVar);
        }
    }

    public void r(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a2 = k.a(context, typeface);
        if (a2 != null) {
            typeface = a2;
        }
        textPaint.setTypeface(typeface);
        int i = this.f & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.o);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.e);
        }
        if (this.l) {
            textPaint.setLetterSpacing(this.m);
        }
    }
}
