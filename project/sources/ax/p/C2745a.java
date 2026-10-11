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
import ax.p.C2746b;
import ax.p.C2749e;
import ax.q.C2829a;
import ax.q.C2831c;
import ax.w2.C3333e;
import ax.w2.C3338j;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ax.p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2745a extends C2749e implements ax.U.b {
    private c o;
    private g p;
    private int q;
    private int r;
    private boolean s;

    /* renamed from: ax.p.a$b */
    private static class b extends g {
        private final Animatable a;

        b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        @Override // ax.p.C2745a.g
        public void c() {
            this.a.start();
        }

        @Override // ax.p.C2745a.g
        public void d() {
            this.a.stop();
        }
    }

    /* renamed from: ax.p.a$c */
    static class c extends C2749e.a {
        h<Long> K;
        l<Integer> L;

        c(c cVar, C2745a c2745a, Resources resources) {
            super(cVar, c2745a, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
            } else {
                this.K = new h<>();
                this.L = new l<>();
            }
        }

        private static long D(int i, int i2) {
            return i2 | (i << 32);
        }

        int B(int[] iArr, Drawable drawable, int i) {
            int z = super.z(iArr, drawable);
            this.L.k(z, Integer.valueOf(i));
            return z;
        }

        int C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.a(drawable);
            long D = D(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = a;
            this.K.b(D, Long.valueOf(j2 | j));
            if (z) {
                this.K.b(D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        int E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.h(i, 0).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        int G(int i, int i2) {
            return (int) this.K.h(D(i, i2), -1L).longValue();
        }

        boolean H(int i, int i2) {
            return (this.K.h(D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        boolean I(int i, int i2) {
            return (this.K.h(D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // ax.p.C2749e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C2745a(this, null);
        }

        @Override // ax.p.C2749e.a, ax.p.C2746b.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // ax.p.C2749e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C2745a(this, resources);
        }
    }

    /* renamed from: ax.p.a$d */
    private static class d extends g {
        private final C3333e a;

        d(C3333e c3333e) {
            super();
            this.a = c3333e;
        }

        @Override // ax.p.C2745a.g
        public void c() {
            this.a.start();
        }

        @Override // ax.p.C2745a.g
        public void d() {
            this.a.stop();
        }
    }

    /* renamed from: ax.p.a$e */
    private static class e extends g {
        private final ObjectAnimator a;
        private final boolean b;

        e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            ofInt.setAutoCancel(true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // ax.p.C2745a.g
        public boolean a() {
            return this.b;
        }

        @Override // ax.p.C2745a.g
        public void b() {
            this.a.reverse();
        }

        @Override // ax.p.C2745a.g
        public void c() {
            this.a.start();
        }

        @Override // ax.p.C2745a.g
        public void d() {
            this.a.cancel();
        }
    }

    /* renamed from: ax.p.a$f */
    private static class f implements TimeInterpolator {
        private int[] a;
        private int b;
        private int c;

        f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        int a() {
            return this.c;
        }

        int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.c) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.c : 0.0f);
        }
    }

    public C2745a() {
        this(null, null);
    }

    public static C2745a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C2745a c2745a = new C2745a();
            c2745a.n(context, resources, xmlPullParser, attributeSet, theme);
            return c2745a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s = k.s(resources, theme, attributeSet, C2831c.h);
        int resourceId = s.getResourceId(C2831c.i, 0);
        int resourceId2 = s.getResourceId(C2831c.j, -1);
        Drawable j = resourceId2 > 0 ? C.h().j(context, resourceId2) : null;
        s.recycle();
        int[] k = k(attributeSet);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j = xmlPullParser.getName().equals("vector") ? C3338j.c(resources, xmlPullParser, attributeSet, theme) : C2829a.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (j != null) {
            return this.o.B(k, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray s = k.s(resources, theme, attributeSet, C2831c.k);
        int resourceId = s.getResourceId(C2831c.n, -1);
        int resourceId2 = s.getResourceId(C2831c.m, -1);
        int resourceId3 = s.getResourceId(C2831c.l, -1);
        Drawable j = resourceId3 > 0 ? C.h().j(context, resourceId3) : null;
        boolean z = s.getBoolean(C2831c.o, false);
        s.recycle();
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j = xmlPullParser.getName().equals("animated-vector") ? C3333e.b(context, resources, xmlPullParser, attributeSet, theme) : C2829a.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.o.C(resourceId, resourceId2, j, z);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean s(int i) {
        int c2;
        int G;
        g bVar;
        g gVar = this.p;
        if (gVar == null) {
            c2 = c();
        } else {
            if (i == this.q) {
                return true;
            }
            if (i == this.r && gVar.a()) {
                gVar.b();
                this.q = this.r;
                this.r = i;
                return true;
            }
            c2 = this.q;
            gVar.d();
        }
        this.p = null;
        this.r = -1;
        this.q = -1;
        c cVar = this.o;
        int E = cVar.E(c2);
        int E2 = cVar.E(i);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else {
            if (!(current instanceof C3333e)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((C3333e) current);
        }
        bVar.c();
        this.p = bVar;
        this.r = c2;
        this.q = i;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.o;
        cVar.d |= C2829a.b(typedArray);
        cVar.x(typedArray.getBoolean(C2831c.d, cVar.i));
        cVar.t(typedArray.getBoolean(C2831c.e, cVar.l));
        cVar.u(typedArray.getInt(C2831c.f, cVar.A));
        cVar.v(typedArray.getInt(C2831c.g, cVar.B));
        setDither(typedArray.getBoolean(C2831c.b, cVar.x));
    }

    @Override // ax.p.C2749e, ax.p.C2746b
    void h(C2746b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.o = (c) dVar;
        }
    }

    @Override // ax.p.C2749e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // ax.p.C2746b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.p;
        if (gVar != null) {
            gVar.d();
            this.p = null;
            g(this.q);
            this.q = -1;
            this.r = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ax.p.C2749e
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.o, this, null);
    }

    @Override // ax.p.C2749e, ax.p.C2746b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.s && super.mutate() == this) {
            this.o.r();
            this.s = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray s = k.s(resources, theme, attributeSet, C2831c.a);
        setVisible(s.getBoolean(C2831c.c, true), true);
        t(s);
        i(resources);
        s.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    @Override // ax.p.C2749e, ax.p.C2746b, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int F = this.o.F(iArr);
        boolean z = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z : z;
    }

    @Override // ax.p.C2746b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.p;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    C2745a(c cVar, Resources resources) {
        super(null);
        this.q = -1;
        this.r = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: ax.p.a$g */
    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
