/*
 * Decompiled with CFR 0.152.
 */
package ax.w2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import ax.S.h;
import ax.S.k;
import ax.w2.a;
import ax.w2.b;
import ax.w2.g;
import ax.w2.i;
import ax.w2.j;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e
extends i
implements Animatable {
    private c b;
    private Context c;
    private ArgbEvaluator d = null;
    d e;
    private Animator.AnimatorListener f = null;
    ArrayList<b> g = null;
    final Drawable.Callback h;

    e() {
        this(null, null, null);
    }

    private e(Context context) {
        this(context, null, null);
    }

    private e(Context context, c c8, Resources resources) {
        Drawable.Callback callback;
        this.h = callback = new Drawable.Callback(this){
            final e a;
            {
                this.a = e8;
            }

            public void invalidateDrawable(Drawable drawable) {
                this.a.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable2, long l8) {
                this.a.scheduleSelf(runnable2, l8);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable2) {
                this.a.unscheduleSelf(runnable2);
            }
        };
        this.c = context;
        if (c8 != null) {
            this.b = c8;
            return;
        }
        this.b = new c(context, c8, callback, resources);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e a(Context object, int n8) {
        XmlPullParserException xmlPullParserException2;
        block7: {
            IOException iOException2;
            block6: {
                if (Build.VERSION.SDK_INT >= 24) {
                    e e8 = new e((Context)object);
                    object = ax.S.h.e(object.getResources(), n8, object.getTheme());
                    e8.a = object;
                    object.setCallback(e8.h);
                    e8.e = new d(e8.a.getConstantState());
                    return e8;
                }
                Resources resources = object.getResources();
                try {
                    resources = resources.getXml(n8);
                    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)resources);
                    while ((n8 = resources.next()) != 2 && n8 != 1) {
                    }
                    if (n8 == 2) {
                        return ax.w2.e.b(object, object.getResources(), (XmlPullParser)resources, attributeSet, object.getTheme());
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
            Log.e((String)"AnimatedVDCompat", (String)"parser error", (Throwable)iOException2);
            return null;
        }
        Log.e((String)"AnimatedVDCompat", (String)"parser error", (Throwable)xmlPullParserException2);
        return null;
    }

    public static e b(Context object, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        object = new e((Context)object);
        ((e)object).inflate(resources, xmlPullParser, attributeSet, theme);
        return object;
    }

    private static void d(AnimatedVectorDrawable animatedVectorDrawable, b b8) {
        ax.w2.c.a(animatedVectorDrawable, b8.a());
    }

    private void e() {
        Animator.AnimatorListener animatorListener = this.f;
        if (animatorListener != null) {
            this.b.c.removeListener(animatorListener);
            this.f = null;
        }
    }

    private void f(String string, Animator animator) {
        animator.setTarget(this.b.b.d(string));
        c c8 = this.b;
        if (c8.d == null) {
            c8.d = new ArrayList();
            this.b.e = new ax.B.a();
        }
        this.b.d.add(animator);
        this.b.e.put(animator, string);
    }

    private static boolean h(AnimatedVectorDrawable animatedVectorDrawable, b b8) {
        return ax.w2.d.a(animatedVectorDrawable, b8.a());
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.a(drawable, theme);
        }
    }

    public void c(b b8) {
        block7: {
            block6: {
                Drawable drawable = this.a;
                if (drawable != null) {
                    ax.w2.e.d((AnimatedVectorDrawable)drawable, b8);
                    return;
                }
                if (b8 == null) break block6;
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                if (!this.g.contains(b8)) break block7;
            }
            return;
        }
        this.g.add(b8);
        if (this.f == null) {
            this.f = new AnimatorListenerAdapter(this){
                final e a;
                {
                    this.a = e8;
                }

                public void onAnimationEnd(Animator object) {
                    object = new ArrayList<b>(this.a.g);
                    int n8 = ((ArrayList)object).size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        ((b)((ArrayList)object).get(i8)).b(this.a);
                    }
                }

                public void onAnimationStart(Animator object) {
                    object = new ArrayList<b>(this.a.g);
                    int n8 = ((ArrayList)object).size();
                    for (int i8 = 0; i8 < n8; ++i8) {
                        ((b)((ArrayList)object).get(i8)).c(this.a);
                    }
                }
            };
        }
        this.b.c.addListener(this.f);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ax.U.a.b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.b.b.draw(canvas);
        if (this.b.c.isStarted()) {
            this.invalidateSelf();
        }
    }

    public boolean g(b b8) {
        Object object = this.a;
        if (object != null) {
            ax.w2.e.h((AnimatedVectorDrawable)object, b8);
        }
        if ((object = this.g) != null && b8 != null) {
            boolean bl = ((ArrayList)object).remove(b8);
            if (this.g.size() == 0) {
                this.e();
            }
            return bl;
        }
        return false;
    }

    public int getAlpha() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ax.U.a.d(drawable);
        }
        return this.b.b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.b.a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ax.U.a.e(drawable);
        }
        return this.b.b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new d(this.a.getConstantState());
        }
        return null;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.b.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.b.b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.b.b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Object object = this.a;
        if (object != null) {
            ax.U.a.g((Drawable)object, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int n8 = xmlPullParser.getEventType();
        int n9 = xmlPullParser.getDepth();
        while (n8 != 1 && (xmlPullParser.getDepth() >= n9 + 1 || n8 != 3)) {
            if (n8 == 2) {
                Object object2;
                TypedArray typedArray;
                object = xmlPullParser.getName();
                if ("animated-vector".equals(object)) {
                    typedArray = k.s(resources, theme, attributeSet, ax.w2.a.e);
                    n8 = typedArray.getResourceId(0, 0);
                    if (n8 != 0) {
                        object = j.b(resources, n8, theme);
                        ((j)object).h(false);
                        object.setCallback(this.h);
                        object2 = this.b.b;
                        if (object2 != null) {
                            object2.setCallback(null);
                        }
                        this.b.b = object;
                    }
                    typedArray.recycle();
                } else if ("target".equals(object)) {
                    object2 = resources.obtainAttributes(attributeSet, ax.w2.a.f);
                    object = object2.getString(0);
                    n8 = object2.getResourceId(1, 0);
                    if (n8 != 0) {
                        typedArray = this.c;
                        if (typedArray != null) {
                            this.f((String)object, ax.w2.g.i((Context)typedArray, n8));
                        } else {
                            object2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    object2.recycle();
                }
            }
            n8 = xmlPullParser.next();
        }
        this.b.a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ax.U.a.h(drawable);
        }
        return this.b.b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable)drawable).isRunning();
        }
        return this.b.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.b.b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
            return;
        }
        this.b.b.setBounds(rect);
    }

    @Override
    protected boolean onLevelChange(int n8) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setLevel(n8);
        }
        return this.b.b.setLevel(n8);
    }

    protected boolean onStateChange(int[] nArray) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(nArray);
        }
        return this.b.b.setState(nArray);
    }

    public void setAlpha(int n8) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(n8);
            return;
        }
        this.b.b.setAlpha(n8);
    }

    public void setAutoMirrored(boolean bl) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.j(drawable, bl);
            return;
        }
        this.b.b.setAutoMirrored(bl);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.b.b.setColorFilter(colorFilter);
    }

    public void setTint(int n8) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.n(drawable, n8);
            return;
        }
        this.b.b.setTint(n8);
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.o(drawable, colorStateList);
            return;
        }
        this.b.b.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.p(drawable, mode);
            return;
        }
        this.b.b.setTintMode(mode);
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(bl, bl2);
        }
        this.b.b.setVisible(bl, bl2);
        return super.setVisible(bl, bl2);
    }

    public void start() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable)drawable).start();
            return;
        }
        if (this.b.c.isStarted()) {
            return;
        }
        this.b.c.start();
        this.invalidateSelf();
    }

    public void stop() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable)drawable).stop();
            return;
        }
        this.b.c.end();
    }

    private static class c
    extends Drawable.ConstantState {
        int a;
        j b;
        AnimatorSet c;
        ArrayList<Animator> d;
        ax.B.a<Animator, String> e;

        public c(Context object, c c8, Drawable.Callback object2, Resources resources) {
            if (c8 != null) {
                this.a = c8.a;
                object = c8.b;
                int n8 = 0;
                if (object != null) {
                    object = ((j)object).getConstantState();
                    this.b = resources != null ? (j)object.newDrawable(resources) : (j)object.newDrawable();
                    this.b = object = (j)this.b.mutate();
                    object.setCallback(object2);
                    this.b.setBounds(c8.b.getBounds());
                    this.b.h(false);
                }
                if ((object = c8.d) != null) {
                    int n9 = ((ArrayList)object).size();
                    this.d = new ArrayList(n9);
                    this.e = new ax.B.a(n9);
                    while (n8 < n9) {
                        object2 = c8.d.get(n8);
                        object = object2.clone();
                        object2 = c8.e.get(object2);
                        object.setTarget(this.b.d((String)object2));
                        this.d.add((Animator)object);
                        this.e.put((Animator)object, (String)object2);
                        ++n8;
                    }
                    this.a();
                }
            }
        }

        public void a() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class d
    extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public d(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            Drawable drawable;
            e e8 = new e();
            e8.a = drawable = this.a.newDrawable();
            drawable.setCallback(e8.h);
            return e8;
        }

        public Drawable newDrawable(Resources resources) {
            e e8 = new e();
            resources = this.a.newDrawable(resources);
            e8.a = resources;
            resources.setCallback(e8.h);
            return e8;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            e e8 = new e();
            resources = this.a.newDrawable(resources, theme);
            e8.a = resources;
            resources.setCallback(e8.h);
            return e8;
        }
    }
}

