package ax.w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import ax.S.k;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: ax.w2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3333e extends AbstractC3337i implements Animatable {
    private c b;
    private Context c;
    private ArgbEvaluator d;
    d e;
    private Animator.AnimatorListener f;
    ArrayList<AbstractC3330b> g;
    final Drawable.Callback h;

    /* renamed from: ax.w2.e$a */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C3333e.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C3333e.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C3333e.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: ax.w2.e$b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C3333e.this.g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC3330b) arrayList.get(i)).b(C3333e.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C3333e.this.g);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC3330b) arrayList.get(i)).c(C3333e.this);
            }
        }
    }

    /* renamed from: ax.w2.e$c */
    private static class c extends Drawable.ConstantState {
        int a;
        C3338j b;
        AnimatorSet c;
        ArrayList<Animator> d;
        ax.B.a<Animator, String> e;

        public c(Context context, c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.a = cVar.a;
                C3338j c3338j = cVar.b;
                if (c3338j != null) {
                    Drawable.ConstantState constantState = c3338j.getConstantState();
                    if (resources != null) {
                        this.b = (C3338j) constantState.newDrawable(resources);
                    } else {
                        this.b = (C3338j) constantState.newDrawable();
                    }
                    C3338j c3338j2 = (C3338j) this.b.mutate();
                    this.b = c3338j2;
                    c3338j2.setCallback(callback);
                    this.b.setBounds(cVar.b.getBounds());
                    this.b.h(false);
                }
                ArrayList<Animator> arrayList = cVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new ax.B.a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = cVar.d.get(i);
                        Animator clone = animator.clone();
                        String str = cVar.e.get(animator);
                        clone.setTarget(this.b.d(str));
                        this.d.add(clone);
                        this.e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C3333e() {
        this(null, null, null);
    }

    public static C3333e a(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C3333e c3333e = new C3333e(context);
            Drawable e = ax.S.h.e(context.getResources(), i, context.getTheme());
            c3333e.a = e;
            e.setCallback(c3333e.h);
            c3333e.e = new d(c3333e.a.getConstantState());
            return c3333e;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return b(context, context.getResources(), xml, asAttributeSet, context.getTheme());
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e2) {
            Log.e("AnimatedVDCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("AnimatedVDCompat", "parser error", e3);
            return null;
        }
    }

    public static C3333e b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C3333e c3333e = new C3333e(context);
        c3333e.inflate(resources, xmlPullParser, attributeSet, theme);
        return c3333e;
    }

    private static void d(AnimatedVectorDrawable animatedVectorDrawable, AbstractC3330b abstractC3330b) {
        animatedVectorDrawable.registerAnimationCallback(abstractC3330b.a());
    }

    private void e() {
        Animator.AnimatorListener animatorListener = this.f;
        if (animatorListener != null) {
            this.b.c.removeListener(animatorListener);
            this.f = null;
        }
    }

    private void f(String str, Animator animator) {
        animator.setTarget(this.b.b.d(str));
        c cVar = this.b;
        if (cVar.d == null) {
            cVar.d = new ArrayList<>();
            this.b.e = new ax.B.a<>();
        }
        this.b.d.add(animator);
        this.b.e.put(animator, str);
    }

    private static boolean h(AnimatedVectorDrawable animatedVectorDrawable, AbstractC3330b abstractC3330b) {
        boolean unregisterAnimationCallback;
        unregisterAnimationCallback = animatedVectorDrawable.unregisterAnimationCallback(abstractC3330b.a());
        return unregisterAnimationCallback;
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.a(drawable, theme);
        }
    }

    public void c(AbstractC3330b abstractC3330b) {
        Drawable drawable = this.a;
        if (drawable != null) {
            d((AnimatedVectorDrawable) drawable, abstractC3330b);
            return;
        }
        if (abstractC3330b == null) {
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        if (this.g.contains(abstractC3330b)) {
            return;
        }
        this.g.add(abstractC3330b);
        if (this.f == null) {
            this.f = new b();
        }
        this.b.c.addListener(this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ax.U.a.b(drawable);
        }
        return false;
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.b.b.draw(canvas);
        if (this.b.c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean g(AbstractC3330b abstractC3330b) {
        Drawable drawable = this.a;
        if (drawable != null) {
            h((AnimatedVectorDrawable) drawable, abstractC3330b);
        }
        ArrayList<AbstractC3330b> arrayList = this.g;
        if (arrayList == null || abstractC3330b == null) {
            return false;
        }
        boolean remove = arrayList.remove(abstractC3330b);
        if (this.g.size() == 0) {
            e();
        }
        return remove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? ax.U.a.d(drawable) : this.b.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        return drawable != null ? ax.U.a.e(drawable) : this.b.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.a.getConstantState());
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.b.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.b.b.getIntrinsicWidth();
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getOpacity() : this.b.b.getOpacity();
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray s = k.s(resources, theme, attributeSet, C3329a.e);
                    int resourceId = s.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C3338j b2 = C3338j.b(resources, resourceId, theme);
                        b2.h(false);
                        b2.setCallback(this.h);
                        C3338j c3338j = this.b.b;
                        if (c3338j != null) {
                            c3338j.setCallback(null);
                        }
                        this.b.b = b2;
                    }
                    s.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C3329a.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        f(string, C3335g.i(context, resourceId2));
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? ax.U.a.h(drawable) : this.b.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.b.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isStateful() : this.b.b.isStateful();
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.b.b.setBounds(rect);
        }
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setLevel(i) : this.b.b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setState(iArr) : this.b.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.b.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.j(drawable, z);
        } else {
            this.b.b.setAutoMirrored(z);
        }
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // ax.w2.AbstractC3337i, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.n(drawable, i);
        } else {
            this.b.b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.o(drawable, colorStateList);
        } else {
            this.b.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.p(drawable, mode);
        } else {
            this.b.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.b.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.b.c.isStarted()) {
                return;
            }
            this.b.c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.b.c.end();
        }
    }

    private C3333e(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.b.b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: ax.w2.e$d */
    private static class d extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public d(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C3333e c3333e = new C3333e();
            Drawable newDrawable = this.a.newDrawable();
            c3333e.a = newDrawable;
            newDrawable.setCallback(c3333e.h);
            return c3333e;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C3333e c3333e = new C3333e();
            Drawable newDrawable = this.a.newDrawable(resources);
            c3333e.a = newDrawable;
            newDrawable.setCallback(c3333e.h);
            return c3333e;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C3333e c3333e = new C3333e();
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            c3333e.a = newDrawable;
            newDrawable.setCallback(c3333e.h);
            return c3333e;
        }
    }

    private C3333e(Context context, c cVar, Resources resources) {
        this.d = null;
        this.f = null;
        this.g = null;
        a aVar = new a();
        this.h = aVar;
        this.c = context;
        if (cVar != null) {
            this.b = cVar;
        } else {
            this.b = new c(context, cVar, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
