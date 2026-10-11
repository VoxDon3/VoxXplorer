/*
 * Decompiled with CFR 0.152.
 */
package ax.p;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C;
import ax.B.h;
import ax.B.l;
import ax.S.k;
import ax.p.b;
import ax.p.e;
import ax.w2.j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a
extends ax.p.e
implements ax.U.b {
    private c o;
    private g p;
    private int q = -1;
    private int r = -1;
    private boolean s;

    public a() {
        this(null, null);
    }

    a(c c8, Resources resources) {
        super(null);
        this.h(new c(c8, this, resources));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }

    public static a m(Context object, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        Object object2 = xmlPullParser.getName();
        if (((String)object2).equals("animated-selector")) {
            object2 = new a();
            ((a)object2).n((Context)object, resources, xmlPullParser, attributeSet, theme);
            return object2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
        ((StringBuilder)object).append(": invalid animated-selector tag ");
        ((StringBuilder)object).append((String)object2);
        throw new XmlPullParserException(((StringBuilder)object).toString());
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int n8;
        int n9;
        int n10 = xmlPullParser.getDepth() + 1;
        while ((n9 = xmlPullParser.next()) != 1 && ((n8 = xmlPullParser.getDepth()) >= n10 || n9 != 3)) {
            if (n9 != 2 || n8 > n10) continue;
            if (xmlPullParser.getName().equals("item")) {
                this.q(context, resources, xmlPullParser, attributeSet, theme);
                continue;
            }
            if (!xmlPullParser.getName().equals("transition")) continue;
            this.r(context, resources, xmlPullParser, attributeSet, theme);
        }
    }

    private void p() {
        this.onStateChange(this.getState());
    }

    private int q(Context object, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Object object2 = k.s(resources, theme, attributeSet, ax.q.c.h);
        int n8 = object2.getResourceId(ax.q.c.i, 0);
        int n9 = object2.getResourceId(ax.q.c.j, -1);
        object = n9 > 0 ? C.h().j((Context)object, n9) : null;
        object2.recycle();
        int[] nArray = this.k(attributeSet);
        object2 = object;
        if (object == null) {
            while ((n9 = xmlPullParser.next()) == 4) {
            }
            if (n9 == 2) {
                object2 = xmlPullParser.getName().equals("vector") ? j.c(resources, xmlPullParser, attributeSet, theme) : ax.q.a.a(resources, xmlPullParser, attributeSet, theme);
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
                ((StringBuilder)object).append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(((StringBuilder)object).toString());
            }
        }
        if (object2 != null) {
            return this.o.B(nArray, (Drawable)object2, n8);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
        ((StringBuilder)object).append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(((StringBuilder)object).toString());
    }

    private int r(Context object, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Object object2 = k.s(resources, theme, attributeSet, ax.q.c.k);
        int n8 = object2.getResourceId(ax.q.c.n, -1);
        int n9 = object2.getResourceId(ax.q.c.m, -1);
        int n10 = object2.getResourceId(ax.q.c.l, -1);
        Drawable drawable = n10 > 0 ? C.h().j((Context)object, n10) : null;
        boolean bl = object2.getBoolean(ax.q.c.o, false);
        object2.recycle();
        object2 = drawable;
        if (drawable == null) {
            while ((n10 = xmlPullParser.next()) == 4) {
            }
            if (n10 == 2) {
                object2 = xmlPullParser.getName().equals("animated-vector") ? ax.w2.e.b((Context)object, resources, xmlPullParser, attributeSet, theme) : ax.q.a.a(resources, xmlPullParser, attributeSet, theme);
            } else {
                object = new StringBuilder();
                ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
                ((StringBuilder)object).append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(((StringBuilder)object).toString());
            }
        }
        if (object2 != null) {
            if (n8 != -1 && n9 != -1) {
                return this.o.C(n8, n9, (Drawable)object2, bl);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
            ((StringBuilder)object).append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
        ((StringBuilder)object).append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(((StringBuilder)object).toString());
    }

    private boolean s(int n8) {
        block8: {
            int n9;
            Object object;
            block10: {
                Drawable drawable;
                block11: {
                    block9: {
                        object = this.p;
                        if (object != null) {
                            if (n8 == this.q) {
                                return true;
                            }
                            if (n8 == this.r && ((g)object).a()) {
                                ((g)object).b();
                                this.q = this.r;
                                this.r = n8;
                                return true;
                            }
                            n9 = this.q;
                            ((g)object).d();
                        } else {
                            n9 = this.c();
                        }
                        this.p = null;
                        this.r = -1;
                        this.q = -1;
                        object = this.o;
                        int n10 = ((c)((Object)object)).E(n9);
                        int n11 = ((c)((Object)object)).E(n8);
                        if (n11 == 0 || n10 == 0) break block8;
                        int n12 = ((c)((Object)object)).G(n10, n11);
                        if (n12 < 0) {
                            return false;
                        }
                        boolean bl = ((c)((Object)object)).I(n10, n11);
                        this.g(n12);
                        drawable = this.getCurrent();
                        if (!(drawable instanceof AnimationDrawable)) break block9;
                        boolean bl2 = ((c)((Object)object)).H(n10, n11);
                        object = new e((AnimationDrawable)drawable, bl2, bl);
                        break block10;
                    }
                    if (!(drawable instanceof ax.w2.e)) break block11;
                    object = new d((ax.w2.e)drawable);
                    break block10;
                }
                if (!(drawable instanceof Animatable)) break block8;
                object = new b((Animatable)drawable);
            }
            ((g)object).c();
            this.p = object;
            this.r = n9;
            this.q = n8;
            return true;
        }
        return false;
    }

    private void t(TypedArray typedArray) {
        c c8 = this.o;
        c8.d |= ax.q.a.b(typedArray);
        c8.x(typedArray.getBoolean(ax.q.c.d, c8.i));
        c8.t(typedArray.getBoolean(ax.q.c.e, c8.l));
        c8.u(typedArray.getInt(ax.q.c.f, c8.A));
        c8.v(typedArray.getInt(ax.q.c.g, c8.B));
        this.setDither(typedArray.getBoolean(ax.q.c.b, c8.x));
    }

    @Override
    void h(b.d d8) {
        super.h(d8);
        if (d8 instanceof c) {
            this.o = (c)d8;
        }
    }

    @Override
    public boolean isStateful() {
        return true;
    }

    @Override
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g g8 = this.p;
        if (g8 != null) {
            g8.d();
            this.p = null;
            this.g(this.q);
            this.q = -1;
            this.r = -1;
        }
    }

    c l() {
        return new c(this.o, this, null);
    }

    @Override
    public Drawable mutate() {
        if (!this.s && super.mutate() == this) {
            this.o.r();
            this.s = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArray = k.s(resources, theme, attributeSet, ax.q.c.a);
        this.setVisible(typedArray.getBoolean(ax.q.c.c, true), true);
        this.t(typedArray);
        this.i(resources);
        typedArray.recycle();
        this.o(context, resources, xmlPullParser, attributeSet, theme);
        this.p();
    }

    @Override
    protected boolean onStateChange(int[] nArray) {
        int n8 = this.o.F(nArray);
        boolean bl = n8 != this.c() && (this.s(n8) || this.g(n8));
        Drawable drawable = this.getCurrent();
        if (drawable != null) {
            return drawable.setState(nArray) | bl;
        }
        return bl;
    }

    @Override
    public boolean setVisible(boolean bl, boolean bl2) {
        boolean bl3 = super.setVisible(bl, bl2);
        g g8 = this.p;
        if (g8 != null && (bl3 || bl2)) {
            if (bl) {
                g8.c();
                return bl3;
            }
            this.jumpToCurrentState();
        }
        return bl3;
    }

    private static class b
    extends g {
        private final Animatable a;

        b(Animatable animatable) {
            this.a = animatable;
        }

        @Override
        public void c() {
            this.a.start();
        }

        @Override
        public void d() {
            this.a.stop();
        }
    }

    static class c
    extends e.a {
        h<Long> K;
        l<Integer> L;

        c(c c8, a a8, Resources resources) {
            super(c8, a8, resources);
            if (c8 != null) {
                this.K = c8.K;
                this.L = c8.L;
                return;
            }
            this.K = new h();
            this.L = new l();
        }

        private static long D(int n8, int n9) {
            long l8 = n8;
            return (long)n9 | l8 << 32;
        }

        int B(int[] nArray, Drawable drawable, int n8) {
            int n9 = super.z(nArray, drawable);
            this.L.k(n9, n8);
            return n9;
        }

        int C(int n8, int n9, Drawable object, boolean bl) {
            int n10 = super.a((Drawable)object);
            long l8 = c.D(n8, n9);
            long l9 = bl ? 0x200000000L : 0L;
            object = this.K;
            long l10 = n10;
            ((h)object).b(l8, l10 | l9);
            if (bl) {
                l8 = c.D(n9, n8);
                this.K.b(l8, 0x100000000L | l10 | l9);
            }
            return n10;
        }

        int E(int n8) {
            if (n8 < 0) {
                return 0;
            }
            return this.L.h(n8, 0);
        }

        int F(int[] nArray) {
            int n8 = super.A(nArray);
            if (n8 >= 0) {
                return n8;
            }
            return super.A(StateSet.WILD_CARD);
        }

        int G(int n8, int n9) {
            long l8 = c.D(n8, n9);
            return (int)this.K.h(l8, -1L).longValue();
        }

        boolean H(int n8, int n9) {
            long l8 = c.D(n8, n9);
            return (this.K.h(l8, -1L) & 0x100000000L) != 0L;
        }

        boolean I(int n8, int n9) {
            long l8 = c.D(n8, n9);
            return (this.K.h(l8, -1L) & 0x200000000L) != 0L;
        }

        @Override
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        @Override
        void r() {
            this.K = this.K.d();
            this.L = this.L.d();
        }
    }

    private static class d
    extends g {
        private final ax.w2.e a;

        d(ax.w2.e e8) {
            this.a = e8;
        }

        @Override
        public void c() {
            this.a.start();
        }

        @Override
        public void d() {
            this.a.stop();
        }
    }

    private static class e
    extends g {
        private final ObjectAnimator a;
        private final boolean b;

        e(AnimationDrawable animationDrawable, boolean bl, boolean bl2) {
            int n8 = animationDrawable.getNumberOfFrames();
            int n9 = 0;
            int n10 = bl ? n8 - 1 : 0;
            if (!bl) {
                n9 = n8 - 1;
            }
            f f8 = new f(animationDrawable, bl);
            animationDrawable = ObjectAnimator.ofInt((Object)animationDrawable, (String)"currentIndex", (int[])new int[]{n10, n9});
            animationDrawable.setAutoCancel(true);
            animationDrawable.setDuration((long)f8.a());
            animationDrawable.setInterpolator((TimeInterpolator)f8);
            this.b = bl2;
            this.a = animationDrawable;
        }

        @Override
        public boolean a() {
            return this.b;
        }

        @Override
        public void b() {
            this.a.reverse();
        }

        @Override
        public void c() {
            this.a.start();
        }

        @Override
        public void d() {
            this.a.cancel();
        }
    }

    private static class f
    implements TimeInterpolator {
        private int[] a;
        private int b;
        private int c;

        f(AnimationDrawable animationDrawable, boolean bl) {
            this.b(animationDrawable, bl);
        }

        int a() {
            return this.c;
        }

        int b(AnimationDrawable animationDrawable, boolean bl) {
            int n8;
            this.b = n8 = animationDrawable.getNumberOfFrames();
            int[] nArray = this.a;
            if (nArray == null || nArray.length < n8) {
                this.a = new int[n8];
            }
            nArray = this.a;
            int n9 = 0;
            for (int i8 = 0; i8 < n8; ++i8) {
                int n10 = bl ? n8 - i8 - 1 : i8;
                nArray[i8] = n10 = animationDrawable.getDuration(n10);
                n9 += n10;
            }
            this.c = n9;
            return n9;
        }

        public float getInterpolation(float f8) {
            int n8;
            int n9;
            int n10 = (int)(f8 * (float)this.c + 0.5f);
            int n11 = this.b;
            int[] nArray = this.a;
            for (n8 = 0; n8 < n11 && n10 >= (n9 = nArray[n8]); n10 -= n9, ++n8) {
            }
            f8 = n8 < n11 ? (float)n10 / (float)this.c : 0.0f;
            return (float)n8 / (float)n11 + f8;
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }
}

