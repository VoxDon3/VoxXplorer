/*
 * Decompiled with CFR 0.152.
 */
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
import ax.K6.c;
import ax.K6.d;
import ax.K6.f;
import ax.K6.g;
import ax.K6.k;
import ax.S.h;
import ax.k6.m;
import ax.m.j;
import org.xmlpull.v1.XmlPullParser;

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

    public e(Context context, int n8) {
        TypedArray typedArray = context.obtainStyledAttributes(n8, ax.m.j.B2);
        this.o(typedArray.getDimension(ax.m.j.C2, 0.0f));
        this.n(ax.K6.c.a(context, typedArray, ax.m.j.F2));
        this.a = ax.K6.c.a(context, typedArray, ax.m.j.G2);
        this.b = ax.K6.c.a(context, typedArray, ax.m.j.H2);
        this.f = typedArray.getInt(ax.m.j.E2, 0);
        this.g = typedArray.getInt(ax.m.j.D2, 1);
        int n9 = ax.K6.c.f(typedArray, ax.m.j.O2, ax.m.j.M2);
        this.p = typedArray.getResourceId(n9, 0);
        this.d = typedArray.getString(n9);
        this.h = typedArray.getBoolean(ax.m.j.Q2, false);
        this.c = ax.K6.c.a(context, typedArray, ax.m.j.I2);
        this.i = typedArray.getFloat(ax.m.j.J2, 0.0f);
        this.j = typedArray.getFloat(ax.m.j.K2, 0.0f);
        this.k = typedArray.getFloat(ax.m.j.L2, 0.0f);
        typedArray.recycle();
        context = context.obtainStyledAttributes(n8, ax.k6.m.a4);
        n8 = ax.k6.m.b4;
        this.l = context.hasValue(n8);
        this.m = context.getFloat(n8, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.e = context.getString(ax.K6.c.f((TypedArray)context, ax.k6.m.e4, ax.k6.m.c4));
        }
        context.recycle();
    }

    static /* synthetic */ Typeface b(e e8, Typeface typeface) {
        e8.s = typeface;
        return typeface;
    }

    static /* synthetic */ boolean c(e e8, boolean bl) {
        e8.q = bl;
        return bl;
    }

    private void d() {
        String string;
        if (this.s == null && (string = this.d) != null) {
            this.s = Typeface.create((String)string, (int)this.f);
        }
        if (this.s == null) {
            int n8 = this.g;
            this.s = n8 != 1 ? (n8 != 2 ? (n8 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE) : Typeface.SERIF) : Typeface.SANS_SERIF;
            this.s = Typeface.create((Typeface)this.s, (int)this.f);
        }
    }

    private Typeface i(Context object) {
        if (this.r) {
            return null;
        }
        this.r = true;
        if ((object = ax.K6.e.m(object, this.p)) == null) {
            return null;
        }
        if ((object = Typeface.create((String)object, (int)0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create((Typeface)object, (int)this.f);
    }

    private boolean l(Context context) {
        if (ax.K6.f.a()) {
            this.f(context);
            return true;
        }
        if (this.q) {
            return true;
        }
        int n8 = this.p;
        if (n8 == 0) {
            return false;
        }
        Typeface typeface = ax.S.h.c(context, n8);
        if (typeface != null) {
            this.s = typeface;
            this.q = true;
            return true;
        }
        if ((context = this.i(context)) != null) {
            this.s = context;
            this.q = true;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"ResourceType"})
    private static String m(Context object, int n8) {
        object = object.getResources();
        if (n8 == 0) return null;
        if (!object.getResourceTypeName(n8).equals("font")) {
            return null;
        }
        try {
            XmlResourceParser xmlResourceParser = object.getXml(n8);
            while (xmlResourceParser.getEventType() != 1) {
                if (xmlResourceParser.getEventType() == 2 && xmlResourceParser.getName().equals("font-family")) {
                    xmlResourceParser = object.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xmlResourceParser), ax.O.g.h);
                    object = xmlResourceParser.getString(ax.O.g.o);
                    xmlResourceParser.recycle();
                    return object;
                }
                xmlResourceParser.next();
            }
            return null;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public Typeface e() {
        this.d();
        return this.s;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Typeface f(Context context) {
        if (this.q) {
            return this.s;
        }
        if (!context.isRestricted()) {
            try {
                context = ax.S.h.g(context, this.p);
                this.s = context;
                if (context != null) {
                    this.s = Typeface.create((Typeface)context, (int)this.f);
                }
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error loading font ");
                stringBuilder.append(this.d);
                Log.d((String)"TextAppearance", (String)stringBuilder.toString(), (Throwable)exception);
            }
            catch (Resources.NotFoundException | UnsupportedOperationException throwable) {}
        }
        this.d();
        this.q = true;
        return this.s;
    }

    public void g(Context context, TextPaint textPaint, g g8) {
        this.r(context, textPaint, this.e());
        this.h(context, new g(this, context, textPaint, g8){
            final Context a;
            final TextPaint b;
            final g c;
            final e d;
            {
                this.d = e8;
                this.a = context;
                this.b = textPaint;
                this.c = g8;
            }

            @Override
            public void a(int n8) {
                this.c.a(n8);
            }

            @Override
            public void b(Typeface typeface, boolean bl) {
                this.d.r(this.a, this.b, typeface);
                this.c.b(typeface, bl);
            }
        });
    }

    public void h(Context context, g g8) {
        int n8;
        if (!this.l(context)) {
            this.d();
        }
        if ((n8 = this.p) == 0) {
            this.q = true;
        }
        if (this.q) {
            g8.b(this.s, true);
            return;
        }
        try {
            h.e e8 = new h.e(this, g8){
                final g a;
                final e b;
                {
                    this.b = e8;
                    this.a = g8;
                }

                @Override
                public void f(int n8) {
                    ax.K6.e.c(this.b, true);
                    this.a.a(n8);
                }

                @Override
                public void g(Typeface typeface) {
                    e e8 = this.b;
                    ax.K6.e.b(e8, Typeface.create((Typeface)typeface, (int)e8.f));
                    ax.K6.e.c(this.b, true);
                    this.a.b(this.b.s, false);
                }
            };
            ax.S.h.i(context, n8, e8, null);
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error loading font ");
            stringBuilder.append(this.d);
            Log.d((String)"TextAppearance", (String)stringBuilder.toString(), (Throwable)exception);
            this.q = true;
            g8.a(-3);
        }
        catch (Resources.NotFoundException notFoundException) {
            this.q = true;
            g8.a(1);
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

    public void o(float f8) {
        this.o = f8;
    }

    public void p(Context context, TextPaint textPaint, g g8) {
        this.q(context, textPaint, g8);
        context = this.n;
        int n8 = context != null ? context.getColorForState(textPaint.drawableState, context.getDefaultColor()) : -16777216;
        textPaint.setColor(n8);
        float f8 = this.k;
        float f9 = this.i;
        float f10 = this.j;
        context = this.c;
        n8 = context != null ? context.getColorForState(textPaint.drawableState, context.getDefaultColor()) : 0;
        textPaint.setShadowLayer(f8, f9, f10, n8);
    }

    public void q(Context context, TextPaint textPaint, g g8) {
        Typeface typeface;
        if (this.l(context) && this.q && (typeface = this.s) != null) {
            this.r(context, textPaint, typeface);
            return;
        }
        this.g(context, textPaint, g8);
    }

    public void r(Context context, TextPaint textPaint, Typeface typeface) {
        if ((context = ax.K6.k.a(context, typeface)) != null) {
            typeface = context;
        }
        textPaint.setTypeface(typeface);
        int n8 = this.f & ~typeface.getStyle();
        boolean bl = (n8 & 1) != 0;
        textPaint.setFakeBoldText(bl);
        float f8 = (n8 & 2) != 0 ? -0.25f : 0.0f;
        textPaint.setTextSkewX(f8);
        textPaint.setTextSize(this.o);
        if (Build.VERSION.SDK_INT >= 26) {
            ax.K6.d.a(textPaint, this.e);
        }
        if (this.l) {
            textPaint.setLetterSpacing(this.m);
        }
    }
}

