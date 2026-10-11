/*
 * Decompiled with CFR 0.152.
 */
package ax.w2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import ax.S.k;
import ax.T.d;
import ax.w2.a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class j
extends ax.w2.i {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    private h b;
    private PorterDuffColorFilter c;
    private ColorFilter d;
    private boolean e;
    private boolean f = true;
    private Drawable.ConstantState g;
    private final float[] h = new float[9];
    private final Matrix i = new Matrix();
    private final Rect j = new Rect();

    j() {
        this.b = new h();
    }

    j(h h8) {
        this.b = h8;
        this.c = this.j(this.c, h8.c, h8.d);
    }

    static int a(int n8, float f8) {
        return n8 & 0xFFFFFF | (int)((float)Color.alpha((int)n8) * f8) << 24;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static j b(Resources object, int n8, Resources.Theme theme) {
        XmlPullParserException xmlPullParserException2;
        block7: {
            IOException iOException2;
            block6: {
                if (Build.VERSION.SDK_INT >= 24) {
                    j j8 = new j();
                    j8.a = ax.S.h.e(object, n8, theme);
                    j8.g = new i(j8.a.getConstantState());
                    return j8;
                }
                try {
                    XmlResourceParser xmlResourceParser = object.getXml(n8);
                    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
                    while ((n8 = xmlResourceParser.next()) != 2 && n8 != 1) {
                    }
                    if (n8 == 2) {
                        return ax.w2.j.c(object, (XmlPullParser)xmlResourceParser, attributeSet, theme);
                    }
                }
                catch (IOException iOException2) {
                    break block6;
                }
                catch (XmlPullParserException xmlPullParserException2) {
                    break block7;
                }
                object = new XmlPullParserException("No start tag found");
                throw object;
            }
            Log.e((String)"VectorDrawableCompat", (String)"parser error", (Throwable)iOException2);
            return null;
        }
        Log.e((String)"VectorDrawableCompat", (String)"parser error", (Throwable)xmlPullParserException2);
        return null;
    }

    public static j c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        j j8 = new j();
        j8.inflate(resources, xmlPullParser, attributeSet, theme);
        return j8;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h h8 = this.b;
        g g8 = h8.b;
        ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>();
        arrayDeque.push(g8.h);
        int n8 = xmlPullParser.getEventType();
        int n9 = xmlPullParser.getDepth();
        int n10 = 1;
        while (n8 != 1 && (xmlPullParser.getDepth() >= n9 + 1 || n8 != 3)) {
            int n11;
            if (n8 == 2) {
                Object object = xmlPullParser.getName();
                d d8 = (d)arrayDeque.peek();
                if ("path".equals(object)) {
                    object = new c();
                    ((c)object).g(resources, attributeSet, theme, xmlPullParser);
                    d8.b.add((e)object);
                    if (((f)object).getPathName() != null) {
                        g8.p.put(((f)object).getPathName(), object);
                    }
                    n10 = h8.a;
                    h8.a = ((f)object).d | n10;
                    n11 = 0;
                } else if ("clip-path".equals(object)) {
                    object = new b();
                    ((b)object).e(resources, attributeSet, theme, xmlPullParser);
                    d8.b.add((e)object);
                    if (((f)object).getPathName() != null) {
                        g8.p.put(((f)object).getPathName(), object);
                    }
                    n11 = h8.a;
                    h8.a = ((f)object).d | n11;
                    n11 = n10;
                } else {
                    n11 = n10;
                    if ("group".equals(object)) {
                        object = new d();
                        ((d)object).c(resources, attributeSet, theme, xmlPullParser);
                        d8.b.add((e)object);
                        arrayDeque.push(object);
                        if (((d)object).getGroupName() != null) {
                            g8.p.put(((d)object).getGroupName(), object);
                        }
                        n11 = h8.a;
                        h8.a = ((d)object).k | n11;
                        n11 = n10;
                    }
                }
            } else {
                n11 = n10;
                if (n8 == 3) {
                    n11 = n10;
                    if ("group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                        n11 = n10;
                    }
                }
            }
            n8 = xmlPullParser.next();
            n10 = n11;
        }
        if (n10 == 0) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    private boolean f() {
        return this.isAutoMirrored() && ax.U.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int n8, PorterDuff.Mode mode) {
        if (n8 != 3) {
            if (n8 != 5) {
                if (n8 != 9) {
                    switch (n8) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void i(TypedArray object, XmlPullParser object2, Resources.Theme theme) throws XmlPullParserException {
        float f8;
        h h8 = this.b;
        g g8 = h8.b;
        h8.d = ax.w2.j.g(ax.S.k.k(object, (XmlPullParser)object2, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        if ((theme = ax.S.k.g(object, (XmlPullParser)object2, theme, "tint", 1)) != null) {
            h8.c = theme;
        }
        h8.e = ax.S.k.e(object, (XmlPullParser)object2, "autoMirrored", 5, h8.e);
        g8.k = ax.S.k.j(object, (XmlPullParser)object2, "viewportWidth", 7, g8.k);
        g8.l = f8 = ax.S.k.j(object, (XmlPullParser)object2, "viewportHeight", 8, g8.l);
        if (!(g8.k <= 0.0f)) {
            if (!(f8 <= 0.0f)) {
                g8.i = object.getDimension(3, g8.i);
                g8.j = f8 = object.getDimension(2, g8.j);
                if (!(g8.i <= 0.0f)) {
                    if (!(f8 <= 0.0f)) {
                        g8.setAlpha(ax.S.k.j(object, (XmlPullParser)object2, "alpha", 4, g8.getAlpha()));
                        object = object.getString(0);
                        if (object != null) {
                            g8.n = object;
                            g8.p.put((String)object, g8);
                        }
                        return;
                    }
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(object.getPositionDescription());
                    ((StringBuilder)object2).append("<vector> tag requires height > 0");
                    throw new XmlPullParserException(((StringBuilder)object2).toString());
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(object.getPositionDescription());
                ((StringBuilder)object2).append("<vector> tag requires width > 0");
                throw new XmlPullParserException(((StringBuilder)object2).toString());
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(object.getPositionDescription());
            ((StringBuilder)object2).append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(((StringBuilder)object2).toString());
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append(object.getPositionDescription());
        ((StringBuilder)object2).append("<vector> tag requires viewportWidth > 0");
        throw new XmlPullParserException(((StringBuilder)object2).toString());
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.b(drawable);
        }
        return false;
    }

    Object d(String string) {
        return this.b.b.p.get((Object)string);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.copyBounds(this.j);
        if (this.j.width() > 0 && this.j.height() > 0) {
            ColorFilter colorFilter = this.d;
            drawable = colorFilter;
            if (colorFilter == null) {
                drawable = this.c;
            }
            canvas.getMatrix(this.i);
            this.i.getValues(this.h);
            float f8 = Math.abs(this.h[0]);
            float f9 = Math.abs(this.h[4]);
            float f10 = Math.abs(this.h[1]);
            float f11 = Math.abs(this.h[3]);
            if (f10 != 0.0f || f11 != 0.0f) {
                f8 = 1.0f;
                f9 = 1.0f;
            }
            int n8 = (int)((float)this.j.width() * f8);
            int n9 = (int)((float)this.j.height() * f9);
            n8 = Math.min(2048, n8);
            n9 = Math.min(2048, n9);
            if (n8 > 0 && n9 > 0) {
                int n10 = canvas.save();
                colorFilter = this.j;
                canvas.translate((float)colorFilter.left, (float)colorFilter.top);
                if (this.f()) {
                    canvas.translate((float)this.j.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                this.b.c(n8, n9);
                if (!this.f) {
                    this.b.j(n8, n9);
                } else if (!this.b.b()) {
                    this.b.j(n8, n9);
                    this.b.i();
                }
                this.b.d(canvas, (ColorFilter)drawable, this.j);
                canvas.restoreToCount(n10);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ax.U.a.d(drawable);
        }
        return this.b.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ax.U.a.e(drawable);
        }
        return this.d;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.a.getConstantState());
        }
        this.b.a = this.getChangingConfigurations();
        return this.b;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int)this.b.b.j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int)this.b.b.i;
    }

    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    void h(boolean bl) {
        this.f = bl;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
            return;
        }
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Object object = this.a;
        if (object != null) {
            ax.U.a.g(object, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        object = this.b;
        object.b = new g();
        TypedArray typedArray = ax.S.k.s(resources, theme, attributeSet, ax.w2.a.a);
        this.i(typedArray, xmlPullParser, theme);
        typedArray.recycle();
        object.a = this.getChangingConfigurations();
        object.k = true;
        this.e(resources, xmlPullParser, attributeSet, theme);
        this.c = this.j(this.c, object.c, object.d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ax.U.a.h(drawable);
        }
        return this.b.e;
    }

    public boolean isStateful() {
        Object object = this.a;
        if (object != null) {
            return object.isStateful();
        }
        return super.isStateful() || (object = this.b) != null && (((h)((Object)object)).g() || (object = this.b.c) != null && object.isStateful());
        {
        }
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(this.getState(), 0), mode);
        }
        return null;
    }

    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            this.b = new h(this.b);
            this.e = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    protected boolean onStateChange(int[] nArray) {
        boolean bl;
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(nArray);
        }
        h h8 = this.b;
        drawable = h8.c;
        if (drawable != null && (mode = h8.d) != null) {
            this.c = this.j(this.c, (ColorStateList)drawable, mode);
            this.invalidateSelf();
            bl = true;
        } else {
            bl = false;
        }
        if (h8.g() && h8.h(nArray)) {
            this.invalidateSelf();
            return true;
        }
        return bl;
    }

    public void scheduleSelf(Runnable runnable2, long l8) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable2, l8);
            return;
        }
        super.scheduleSelf(runnable2, l8);
    }

    public void setAlpha(int n8) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(n8);
            return;
        }
        if (this.b.b.getRootAlpha() != n8) {
            this.b.b.setRootAlpha(n8);
            this.invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean bl) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.j(drawable, bl);
            return;
        }
        this.b.e = bl;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.d = colorFilter;
        this.invalidateSelf();
    }

    public void setTint(int n8) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.n(drawable, n8);
            return;
        }
        this.setTintList(ColorStateList.valueOf((int)n8));
    }

    public void setTintList(ColorStateList colorStateList) {
        Object object = this.a;
        if (object != null) {
            ax.U.a.o(object, colorStateList);
            return;
        }
        object = this.b;
        if (object.c != colorStateList) {
            object.c = colorStateList;
            this.c = this.j(this.c, colorStateList, object.d);
            this.invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Object object = this.a;
        if (object != null) {
            ax.U.a.p(object, mode);
            return;
        }
        object = this.b;
        if (object.d != mode) {
            object.d = mode;
            this.c = this.j(this.c, object.c, mode);
            this.invalidateSelf();
        }
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(bl, bl2);
        }
        return super.setVisible(bl, bl2);
    }

    public void unscheduleSelf(Runnable runnable2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable2);
            return;
        }
        super.unscheduleSelf(runnable2);
    }

    private static class b
    extends f {
        b() {
        }

        b(b b8) {
            super(b8);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            if ((string = typedArray.getString(1)) != null) {
                this.a = ax.T.d.d(string);
            }
            this.c = ax.S.k.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!ax.S.k.r(xmlPullParser, "pathData")) {
                return;
            }
            resources = ax.S.k.s(resources, theme, attributeSet, ax.w2.a.d);
            this.f((TypedArray)resources, xmlPullParser);
            resources.recycle();
        }
    }

    private static class c
    extends f {
        private int[] e;
        ax.S.d f;
        float g = 0.0f;
        ax.S.d h;
        float i = 1.0f;
        float j = 1.0f;
        float k = 0.0f;
        float l = 1.0f;
        float m = 0.0f;
        Paint.Cap n = Paint.Cap.BUTT;
        Paint.Join o = Paint.Join.MITER;
        float p = 4.0f;

        c() {
        }

        c(c c8) {
            super(c8);
            this.e = c8.e;
            this.f = c8.f;
            this.g = c8.g;
            this.i = c8.i;
            this.h = c8.h;
            this.c = c8.c;
            this.j = c8.j;
            this.k = c8.k;
            this.l = c8.l;
            this.m = c8.m;
            this.n = c8.n;
            this.o = c8.o;
            this.p = c8.p;
        }

        private Paint.Cap e(int n8, Paint.Cap cap) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        private Paint.Join f(int n8, Paint.Join join) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.e = null;
            if (!ax.S.k.r(xmlPullParser, "pathData")) {
                return;
            }
            String string = typedArray.getString(0);
            if (string != null) {
                this.b = string;
            }
            if ((string = typedArray.getString(2)) != null) {
                this.a = ax.T.d.d(string);
            }
            this.h = ax.S.k.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.j = ax.S.k.j(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
            this.n = this.e(ax.S.k.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
            this.o = this.f(ax.S.k.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
            this.p = ax.S.k.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
            this.f = ax.S.k.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.i = ax.S.k.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
            this.g = ax.S.k.j(typedArray, xmlPullParser, "strokeWidth", 4, this.g);
            this.l = ax.S.k.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
            this.m = ax.S.k.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
            this.k = ax.S.k.j(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
            this.c = ax.S.k.k(typedArray, xmlPullParser, "fillType", 13, this.c);
        }

        @Override
        public boolean a() {
            return this.h.i() || this.f.i();
            {
            }
        }

        @Override
        public boolean b(int[] nArray) {
            boolean bl = this.h.j(nArray);
            return this.f.j(nArray) | bl;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            resources = ax.S.k.s(resources, theme, attributeSet, ax.w2.a.c);
            this.h((TypedArray)resources, xmlPullParser, theme);
            resources.recycle();
        }

        float getFillAlpha() {
            return this.j;
        }

        int getFillColor() {
            return this.h.e();
        }

        float getStrokeAlpha() {
            return this.i;
        }

        int getStrokeColor() {
            return this.f.e();
        }

        float getStrokeWidth() {
            return this.g;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.k;
        }

        void setFillAlpha(float f8) {
            this.j = f8;
        }

        void setFillColor(int n8) {
            this.h.k(n8);
        }

        void setStrokeAlpha(float f8) {
            this.i = f8;
        }

        void setStrokeColor(int n8) {
            this.f.k(n8);
        }

        void setStrokeWidth(float f8) {
            this.g = f8;
        }

        void setTrimPathEnd(float f8) {
            this.l = f8;
        }

        void setTrimPathOffset(float f8) {
            this.m = f8;
        }

        void setTrimPathStart(float f8) {
            this.k = f8;
        }
    }

    private static class d
    extends e {
        final Matrix a = new Matrix();
        final ArrayList<e> b = new ArrayList();
        float c = 0.0f;
        private float d = 0.0f;
        private float e = 0.0f;
        private float f = 1.0f;
        private float g = 1.0f;
        private float h = 0.0f;
        private float i = 0.0f;
        final Matrix j;
        int k;
        private int[] l;
        private String m;

        public d() {
            this.j = new Matrix();
            this.m = null;
        }

        public d(d e8, ax.B.a<String, Object> a8) {
            String string;
            Object object = new Matrix();
            this.j = object;
            this.m = null;
            this.c = e8.c;
            this.d = e8.d;
            this.e = e8.e;
            this.f = e8.f;
            this.g = e8.g;
            this.h = e8.h;
            this.i = e8.i;
            this.l = e8.l;
            this.m = string = e8.m;
            this.k = e8.k;
            if (string != null) {
                a8.put(string, this);
            }
            object.set(e8.j);
            object = e8.b;
            for (int i8 = 0; i8 < ((ArrayList)object).size(); ++i8) {
                block8: {
                    block7: {
                        block6: {
                            e8 = ((ArrayList)object).get(i8);
                            if (e8 instanceof d) {
                                this.b.add(new d((d)e8, a8));
                                continue;
                            }
                            if (!(e8 instanceof c)) break block6;
                            e8 = new c((c)e8);
                            break block7;
                        }
                        if (!(e8 instanceof b)) break block8;
                        e8 = new b((b)e8);
                    }
                    this.b.add(e8);
                    string = ((f)e8).b;
                    if (string == null) continue;
                    a8.put(string, e8);
                    continue;
                }
                throw new IllegalStateException("Unknown object in the tree!");
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        private void e(TypedArray object, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = ax.S.k.j(object, xmlPullParser, "rotation", 5, this.c);
            this.d = object.getFloat(1, this.d);
            this.e = object.getFloat(2, this.e);
            this.f = ax.S.k.j(object, xmlPullParser, "scaleX", 3, this.f);
            this.g = ax.S.k.j(object, xmlPullParser, "scaleY", 4, this.g);
            this.h = ax.S.k.j(object, xmlPullParser, "translateX", 6, this.h);
            this.i = ax.S.k.j(object, xmlPullParser, "translateY", 7, this.i);
            if ((object = object.getString(0)) != null) {
                this.m = object;
            }
            this.d();
        }

        @Override
        public boolean a() {
            for (int i8 = 0; i8 < this.b.size(); ++i8) {
                if (!this.b.get(i8).a()) continue;
                return true;
            }
            return false;
        }

        @Override
        public boolean b(int[] nArray) {
            boolean bl = false;
            for (int i8 = 0; i8 < this.b.size(); ++i8) {
                bl |= this.b.get(i8).b(nArray);
            }
            return bl;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            resources = ax.S.k.s(resources, theme, attributeSet, ax.w2.a.b);
            this.e((TypedArray)resources, xmlPullParser);
            resources.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f8) {
            if (f8 != this.d) {
                this.d = f8;
                this.d();
            }
        }

        public void setPivotY(float f8) {
            if (f8 != this.e) {
                this.e = f8;
                this.d();
            }
        }

        public void setRotation(float f8) {
            if (f8 != this.c) {
                this.c = f8;
                this.d();
            }
        }

        public void setScaleX(float f8) {
            if (f8 != this.f) {
                this.f = f8;
                this.d();
            }
        }

        public void setScaleY(float f8) {
            if (f8 != this.g) {
                this.g = f8;
                this.d();
            }
        }

        public void setTranslateX(float f8) {
            if (f8 != this.h) {
                this.h = f8;
                this.d();
            }
        }

        public void setTranslateY(float f8) {
            if (f8 != this.i) {
                this.i = f8;
                this.d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] nArray) {
            return false;
        }
    }

    private static abstract class f
    extends e {
        protected d.b[] a = null;
        String b;
        int c = 0;
        int d;

        public f() {
        }

        public f(f f8) {
            this.b = f8.b;
            this.d = f8.d;
            this.a = ax.T.d.f(f8.a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bArray = this.a;
            if (bArray != null) {
                d.b.i(bArray, path);
            }
        }

        public d.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(d.b[] bArray) {
            if (!ax.T.d.b(this.a, bArray)) {
                this.a = ax.T.d.f(bArray);
                return;
            }
            ax.T.d.k(this.a, bArray);
        }
    }

    private static class g {
        private static final Matrix q = new Matrix();
        private final Path a;
        private final Path b;
        private final Matrix c = new Matrix();
        Paint d;
        Paint e;
        private PathMeasure f;
        private int g;
        final d h;
        float i = 0.0f;
        float j = 0.0f;
        float k = 0.0f;
        float l = 0.0f;
        int m = 255;
        String n = null;
        Boolean o = null;
        final ax.B.a<String, Object> p;

        public g() {
            this.p = new ax.B.a();
            this.h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        public g(g g8) {
            ax.B.a<String, Object> a8 = new ax.B.a<String, Object>();
            this.p = a8;
            this.h = new d(g8.h, a8);
            this.a = new Path(g8.a);
            this.b = new Path(g8.b);
            this.i = g8.i;
            this.j = g8.j;
            this.k = g8.k;
            this.l = g8.l;
            this.g = g8.g;
            this.m = g8.m;
            this.n = g8.n;
            String string = g8.n;
            if (string != null) {
                a8.put(string, this);
            }
            this.o = g8.o;
        }

        private static float a(float f8, float f9, float f10, float f11) {
            return f8 * f11 - f9 * f10;
        }

        private void c(d d8, Matrix object, Canvas canvas, int n8, int n9, ColorFilter colorFilter) {
            d8.a.set(object);
            d8.a.preConcat(d8.j);
            canvas.save();
            for (int i8 = 0; i8 < d8.b.size(); ++i8) {
                object = d8.b.get(i8);
                if (object instanceof d) {
                    this.c((d)object, d8.a, canvas, n8, n9, colorFilter);
                    continue;
                }
                if (!(object instanceof f)) continue;
                this.d(d8, (f)object, canvas, n8, n9, colorFilter);
            }
            canvas.restore();
        }

        private void d(d object, f f8, Canvas canvas, int n8, int n9, ColorFilter colorFilter) {
            float f9 = (float)n8 / this.k;
            float f10 = (float)n9 / this.l;
            float f11 = Math.min(f9, f10);
            object = ((d)object).a;
            this.c.set((Matrix)object);
            this.c.postScale(f9, f10);
            f10 = this.e((Matrix)object);
            if (f10 != 0.0f) {
                Paint.Join join;
                f8.d(this.a);
                Object object2 = this.a;
                this.b.reset();
                if (f8.c()) {
                    colorFilter = this.b;
                    object = f8.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    colorFilter.setFillType((Path.FillType)object);
                    this.b.addPath((Path)object2, this.c);
                    canvas.clipPath(this.b);
                    return;
                }
                f8 = (c)f8;
                float f12 = ((c)f8).k;
                if (f12 != 0.0f || ((c)f8).l != 1.0f) {
                    float f13 = ((c)f8).m;
                    float f14 = ((c)f8).l;
                    if (this.f == null) {
                        this.f = new PathMeasure();
                    }
                    this.f.setPath(this.a, false);
                    f9 = this.f.getLength();
                    f12 = (f12 + f13) % 1.0f * f9;
                    f13 = (f14 + f13) % 1.0f * f9;
                    object2.reset();
                    if (f12 > f13) {
                        this.f.getSegment(f12, f9, (Path)object2, true);
                        this.f.getSegment(0.0f, f13, (Path)object2, true);
                    } else {
                        this.f.getSegment(f12, f13, (Path)object2, true);
                    }
                    object2.rLineTo(0.0f, 0.0f);
                }
                this.b.addPath((Path)object2, this.c);
                if (((c)f8).h.l()) {
                    object = ((c)f8).h;
                    if (this.e == null) {
                        object2 = new Paint(1);
                        this.e = object2;
                        object2.setStyle(Paint.Style.FILL);
                    }
                    object2 = this.e;
                    if (((ax.S.d)object).h()) {
                        object = ((ax.S.d)object).f();
                        object.setLocalMatrix(this.c);
                        object2.setShader((Shader)object);
                        object2.setAlpha(Math.round(((c)f8).j * 255.0f));
                    } else {
                        object2.setShader(null);
                        object2.setAlpha(255);
                        object2.setColor(ax.w2.j.a(((ax.S.d)object).e(), ((c)f8).j));
                    }
                    object2.setColorFilter(colorFilter);
                    join = this.b;
                    object = f8.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    join.setFillType((Path.FillType)object);
                    canvas.drawPath(this.b, (Paint)object2);
                }
                if (((c)f8).f.l()) {
                    object2 = ((c)f8).f;
                    if (this.d == null) {
                        object = new Paint(1);
                        this.d = object;
                        object.setStyle(Paint.Style.STROKE);
                    }
                    object = this.d;
                    join = ((c)f8).o;
                    if (join != null) {
                        object.setStrokeJoin(join);
                    }
                    if ((join = ((c)f8).n) != null) {
                        object.setStrokeCap((Paint.Cap)join);
                    }
                    object.setStrokeMiter(((c)f8).p);
                    if (((ax.S.d)object2).h()) {
                        object2 = ((ax.S.d)object2).f();
                        object2.setLocalMatrix(this.c);
                        object.setShader((Shader)object2);
                        object.setAlpha(Math.round(((c)f8).i * 255.0f));
                    } else {
                        object.setShader(null);
                        object.setAlpha(255);
                        object.setColor(ax.w2.j.a(((ax.S.d)object2).e(), ((c)f8).i));
                    }
                    object.setColorFilter(colorFilter);
                    object.setStrokeWidth(((c)f8).g * (f11 * f10));
                    canvas.drawPath(this.b, (Paint)object);
                }
            }
        }

        private float e(Matrix matrix) {
            float[] fArray;
            float[] fArray2 = fArray = new float[4];
            fArray[0] = 0.0f;
            fArray2[1] = 1.0f;
            fArray2[2] = 1.0f;
            fArray2[3] = 0.0f;
            matrix.mapVectors(fArray);
            float f8 = (float)Math.hypot(fArray[0], fArray[1]);
            float f9 = (float)Math.hypot(fArray[2], fArray[3]);
            float f10 = ax.w2.j$g.a(fArray[0], fArray[1], fArray[2], fArray[3]);
            f8 = Math.max(f8, f9);
            if (f8 > 0.0f) {
                return Math.abs(f10) / f8;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int n8, int n9, ColorFilter colorFilter) {
            this.c(this.h, q, canvas, n8, n9, colorFilter);
        }

        public boolean f() {
            if (this.o == null) {
                this.o = this.h.a();
            }
            return this.o;
        }

        public boolean g(int[] nArray) {
            return this.h.b(nArray);
        }

        public float getAlpha() {
            return (float)this.getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f8) {
            this.setRootAlpha((int)(f8 * 255.0f));
        }

        public void setRootAlpha(int n8) {
            this.m = n8;
        }
    }

    private static class h
    extends Drawable.ConstantState {
        int a;
        g b;
        ColorStateList c = null;
        PorterDuff.Mode d = k;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public h() {
            this.b = new g();
        }

        public h(h h8) {
            if (h8 != null) {
                g g8;
                this.a = h8.a;
                this.b = g8 = new g(h8.b);
                if (h8.b.e != null) {
                    g8.e = new Paint(h8.b.e);
                }
                if (h8.b.d != null) {
                    this.b.d = new Paint(h8.b.d);
                }
                this.c = h8.c;
                this.d = h8.d;
                this.e = h8.e;
            }
        }

        public boolean a(int n8, int n9) {
            return n8 == this.f.getWidth() && n9 == this.f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
        }

        public void c(int n8, int n9) {
            if (this.f != null && this.a(n8, n9)) {
                return;
            }
            this.f = Bitmap.createBitmap((int)n8, (int)n9, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            this.k = true;
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            colorFilter = this.e(colorFilter);
            canvas.drawBitmap(this.f, null, rect, (Paint)colorFilter);
        }

        public Paint e(ColorFilter colorFilter) {
            if (!this.f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint;
                this.l = paint = new Paint();
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.b.f();
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] nArray) {
            boolean bl = this.b.g(nArray);
            this.k |= bl;
            return bl;
        }

        public void i() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public void j(int n8, int n9) {
            this.f.eraseColor(0);
            Canvas canvas = new Canvas(this.f);
            this.b.b(canvas, n8, n9, null);
        }

        public Drawable newDrawable() {
            return new j(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new j(this);
        }
    }

    private static class i
    extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            j j8 = new j();
            j8.a = (VectorDrawable)this.a.newDrawable();
            return j8;
        }

        public Drawable newDrawable(Resources resources) {
            j j8 = new j();
            j8.a = (VectorDrawable)this.a.newDrawable(resources);
            return j8;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            j j8 = new j();
            j8.a = (VectorDrawable)this.a.newDrawable(resources, theme);
            return j8;
        }
    }
}

