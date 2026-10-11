/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.A;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.w;
import androidx.emoji2.text.e;
import ax.c0.d0;
import ax.h0.j;
import ax.m.h;
import ax.o.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class SwitchCompat
extends CompoundButton {
    private static final Property<SwitchCompat, Float> S = new Property<SwitchCompat, Float>(Float.class, "thumbPos"){

        public Float a(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.z);
        }

        public void b(SwitchCompat switchCompat, Float f8) {
            switchCompat.setThumbPosition(f8.floatValue());
        }
    };
    private static final int[] T = new int[]{0x10100A0};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H = true;
    private final TextPaint I;
    private ColorStateList J;
    private Layout K;
    private Layout L;
    private TransformationMethod M;
    ObjectAnimator N;
    private final w O;
    private n P;
    private b Q;
    private final Rect R;
    private Drawable a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private Drawable f;
    private ColorStateList g = null;
    private PorterDuff.Mode h = null;
    private boolean i = false;
    private boolean j = false;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private CharSequence o;
    private CharSequence p;
    private CharSequence q;
    private CharSequence r;
    private boolean s;
    private int t;
    private int u;
    private float v;
    private float w;
    private VelocityTracker x = VelocityTracker.obtain();
    private int y;
    float z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.N);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        int n9;
        this.R = new Rect();
        androidx.appcompat.widget.H.a((View)this, this.getContext());
        Object object = new TextPaint(1);
        this.I = object;
        ((TextPaint)object).density = this.getResources().getDisplayMetrics().density;
        Object object2 = ax.m.j.m2;
        object = androidx.appcompat.widget.L.v(context, attributeSet, (int[])object2, n8, 0);
        d0.j0((View)this, context, (int[])object2, attributeSet, ((L)object).r(), n8, 0);
        object2 = ((L)object).g(ax.m.j.p2);
        this.a = (Drawable)object2;
        if (object2 != null) {
            object2.setCallback((Drawable.Callback)this);
        }
        object2 = ((L)object).g(ax.m.j.y2);
        this.f = (Drawable)object2;
        if (object2 != null) {
            object2.setCallback((Drawable.Callback)this);
        }
        this.setTextOnInternal(((L)object).p(ax.m.j.n2));
        this.setTextOffInternal(((L)object).p(ax.m.j.o2));
        this.s = ((L)object).a(ax.m.j.q2, true);
        this.k = ((L)object).f(ax.m.j.v2, 0);
        this.l = ((L)object).f(ax.m.j.s2, 0);
        this.m = ((L)object).f(ax.m.j.t2, 0);
        this.n = ((L)object).a(ax.m.j.r2, false);
        object2 = ((L)object).c(ax.m.j.w2);
        if (object2 != null) {
            this.b = (ColorStateList)object2;
            this.d = true;
        }
        if (this.c != (object2 = (Object)androidx.appcompat.widget.A.e(((L)object).k(ax.m.j.x2, -1), null))) {
            this.c = (PorterDuff.Mode)object2;
            this.e = true;
        }
        if (this.d || this.e) {
            this.b();
        }
        if ((object2 = (Object)((L)object).c(ax.m.j.z2)) != null) {
            this.g = (ColorStateList)object2;
            this.i = true;
        }
        if (this.h != (object2 = (Object)androidx.appcompat.widget.A.e(((L)object).k(ax.m.j.A2, -1), null))) {
            this.h = (PorterDuff.Mode)object2;
            this.j = true;
        }
        if (this.i || this.j) {
            this.c();
        }
        if ((n9 = ((L)object).n(ax.m.j.u2, 0)) != 0) {
            this.m(context, n9);
        }
        object2 = new w((TextView)this);
        this.O = object2;
        ((w)object2).m(attributeSet, n8);
        ((L)object).x();
        context = ViewConfiguration.get((Context)context);
        this.u = context.getScaledTouchSlop();
        this.y = context.getScaledMinimumFlingVelocity();
        this.getEmojiTextViewHelper().c(attributeSet, n8);
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }

    private void a(boolean bl) {
        ObjectAnimator objectAnimator;
        float f8 = bl ? 1.0f : 0.0f;
        this.N = objectAnimator = ObjectAnimator.ofFloat((Object)((Object)this), S, (float[])new float[]{f8});
        objectAnimator.setDuration(250L);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    private void b() {
        Drawable drawable = this.a;
        if (drawable != null && (this.d || this.e)) {
            this.a = drawable = ax.U.a.r(drawable).mutate();
            if (this.d) {
                ax.U.a.o(drawable, this.b);
            }
            if (this.e) {
                ax.U.a.p(this.a, this.c);
            }
            if (this.a.isStateful()) {
                this.a.setState(this.getDrawableState());
            }
        }
    }

    private void c() {
        Drawable drawable = this.f;
        if (drawable != null && (this.i || this.j)) {
            this.f = drawable = ax.U.a.r(drawable).mutate();
            if (this.i) {
                ax.U.a.o(drawable, this.g);
            }
            if (this.j) {
                ax.U.a.p(this.f, this.h);
            }
            if (this.f.isStateful()) {
                this.f.setState(this.getDrawableState());
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        motionEvent = MotionEvent.obtain((MotionEvent)motionEvent);
        motionEvent.setAction(3);
        super.onTouchEvent(motionEvent);
        motionEvent.recycle();
    }

    private static float f(float f8, float f9, float f10) {
        if (f8 < f9) {
            return f9;
        }
        if (f8 > f10) {
            return f10;
        }
        return f8;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.getEmojiTextViewHelper().f(this.M);
        CharSequence charSequence2 = charSequence;
        if (transformationMethod != null) {
            charSequence2 = transformationMethod.getTransformation(charSequence, (View)this);
        }
        return charSequence2;
    }

    private n getEmojiTextViewHelper() {
        if (this.P == null) {
            this.P = new n((TextView)this);
        }
        return this.P;
    }

    private boolean getTargetCheckedState() {
        return this.z > 0.5f;
    }

    private int getThumbOffset() {
        float f8 = androidx.appcompat.widget.O.b((View)this) ? 1.0f - this.z : this.z;
        return (int)(f8 * (float)this.getThumbScrollRange() + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable != null) {
            Rect rect = this.R;
            drawable.getPadding(rect);
            drawable = this.a;
            drawable = drawable != null ? androidx.appcompat.widget.A.d(drawable) : androidx.appcompat.widget.A.c;
            return this.A - this.C - rect.left - rect.right - drawable.left - drawable.right;
        }
        return 0;
    }

    private boolean h(float f8, float f9) {
        if (this.a == null) {
            return false;
        }
        int n8 = this.getThumbOffset();
        this.a.getPadding(this.R);
        int n9 = this.E;
        int n10 = this.u;
        int n11 = this.D + n8 - n10;
        int n12 = this.C;
        Rect rect = this.R;
        int n13 = rect.left;
        n8 = rect.right;
        int n14 = this.G;
        return f8 > (float)n11 && f8 < (float)(n12 + n11 + n13 + n8 + n10) && f9 > (float)(n9 - n10) && f9 < (float)(n14 + n10);
    }

    private Layout i(CharSequence charSequence) {
        TextPaint textPaint = this.I;
        int n8 = charSequence != null ? (int)Math.ceil(Layout.getDesiredWidth((CharSequence)charSequence, (TextPaint)textPaint)) : 0;
        return new StaticLayout(charSequence, textPaint, n8, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence;
            CharSequence charSequence2 = charSequence = this.q;
            if (charSequence == null) {
                charSequence2 = this.getResources().getString(ax.m.h.b);
            }
            d0.z0((View)this, charSequence2);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence;
            CharSequence charSequence2 = charSequence = this.o;
            if (charSequence == null) {
                charSequence2 = this.getResources().getString(ax.m.h.c);
            }
            d0.z0((View)this, charSequence2);
        }
    }

    private void o(int n8, int n9) {
        Object object = n8 != 1 ? (n8 != 2 ? (n8 != 3 ? null : Typeface.MONOSPACE) : Typeface.SERIF) : Typeface.SANS_SERIF;
        this.n((Typeface)object, n9);
    }

    private void p() {
        e e8;
        int n8;
        if (this.Q == null && this.P.b() && androidx.emoji2.text.e.i() && ((n8 = (e8 = androidx.emoji2.text.e.c()).e()) == 3 || n8 == 0)) {
            b b8;
            this.Q = b8 = new b(this);
            e8.t(b8);
        }
    }

    private void q(MotionEvent motionEvent) {
        this.t = 0;
        int n8 = motionEvent.getAction();
        boolean bl = true;
        n8 = n8 == 1 && this.isEnabled() ? 1 : 0;
        boolean bl2 = this.isChecked();
        if (n8 != 0) {
            this.x.computeCurrentVelocity(1000);
            float f8 = this.x.getXVelocity();
            if (Math.abs(f8) > (float)this.y) {
                if (!(androidx.appcompat.widget.O.b((View)this) ? f8 < 0.0f : f8 > 0.0f)) {
                    bl = false;
                }
            } else {
                bl = this.getTargetCheckedState();
            }
        } else {
            bl = bl2;
        }
        if (bl != bl2) {
            this.playSoundEffect(0);
        }
        this.setChecked(bl);
        this.e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.q = charSequence;
        this.r = this.g(charSequence);
        this.L = null;
        if (this.s) {
            this.p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.o = charSequence;
        this.p = this.g(charSequence);
        this.K = null;
        if (this.s) {
            this.p();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void draw(Canvas canvas) {
        int n8;
        Drawable drawable;
        int n9;
        int n10;
        int n11;
        Rect rect;
        block4: {
            int n12;
            int n13;
            int n14;
            block7: {
                int n15;
                int n16;
                block6: {
                    block5: {
                        rect = this.R;
                        n16 = this.D;
                        n11 = this.E;
                        n14 = this.F;
                        n10 = this.G;
                        n9 = this.getThumbOffset() + n16;
                        drawable = this.a;
                        drawable = drawable != null ? androidx.appcompat.widget.A.d(drawable) : androidx.appcompat.widget.A.c;
                        Drawable drawable2 = this.f;
                        n8 = n9;
                        if (drawable2 == null) break block4;
                        drawable2.getPadding(rect);
                        n13 = rect.left;
                        n12 = n9 + n13;
                        if (drawable == null) break block5;
                        n9 = drawable.left;
                        n8 = n16;
                        if (n9 > n13) {
                            n8 = n16 + (n9 - n13);
                        }
                        n9 = (n13 = drawable.top) > (n9 = rect.top) ? n13 - n9 + n11 : n11;
                        n15 = drawable.right;
                        n16 = rect.right;
                        n13 = n14;
                        if (n15 > n16) {
                            n13 = n14 - (n15 - n16);
                        }
                        int n17 = drawable.bottom;
                        int n18 = rect.bottom;
                        n16 = n8;
                        n14 = n13;
                        n15 = n9;
                        if (n17 <= n18) break block6;
                        n14 = n10 - (n17 - n18);
                        break block7;
                    }
                    n15 = n11;
                }
                n9 = n10;
                n8 = n16;
                n13 = n14;
                n14 = n9;
                n9 = n15;
            }
            this.f.setBounds(n8, n9, n13, n14);
            n8 = n12;
        }
        if ((drawable = this.a) != null) {
            drawable.getPadding(rect);
            n9 = n8 - rect.left;
            n8 = n8 + this.C + rect.right;
            this.a.setBounds(n9, n11, n8, n10);
            drawable = this.getBackground();
            if (drawable != null) {
                ax.U.a.l(drawable, n9, n11, n8, n10);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f8, float f9) {
        super.drawableHotspotChanged(f8, f9);
        Drawable drawable = this.a;
        if (drawable != null) {
            ax.U.a.k(drawable, f8, f9);
        }
        if ((drawable = this.f) != null) {
            ax.U.a.k(drawable, f8, f9);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] nArray = this.getDrawableState();
        Drawable drawable = this.a;
        boolean bl = drawable != null && drawable.isStateful() ? drawable.setState(nArray) : false;
        drawable = this.f;
        boolean bl2 = bl;
        if (drawable != null) {
            bl2 = bl;
            if (drawable.isStateful()) {
                bl2 = bl | drawable.setState(nArray);
            }
        }
        if (bl2) {
            this.invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        int n8;
        if (!androidx.appcompat.widget.O.b((View)this)) {
            return super.getCompoundPaddingLeft();
        }
        int n9 = n8 = super.getCompoundPaddingLeft() + this.A;
        if (!TextUtils.isEmpty((CharSequence)this.getText())) {
            n9 = n8 + this.m;
        }
        return n9;
    }

    public int getCompoundPaddingRight() {
        int n8;
        if (androidx.appcompat.widget.O.b((View)this)) {
            return super.getCompoundPaddingRight();
        }
        int n9 = n8 = super.getCompoundPaddingRight() + this.A;
        if (!TextUtils.isEmpty((CharSequence)this.getText())) {
            n9 = n8 + this.m;
        }
        return n9;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return ax.h0.j.o(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.s;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    protected final float getThumbPosition() {
        return this.z;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    void j() {
        this.setTextOnInternal(this.o);
        this.setTextOffInternal(this.q);
        this.requestLayout();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        if ((drawable = this.f) != null) {
            drawable.jumpToCurrentState();
        }
        if ((drawable = this.N) != null && drawable.isStarted()) {
            this.N.end();
            this.N = null;
        }
    }

    public void m(Context context, int n8) {
        float f8;
        L l8 = androidx.appcompat.widget.L.t(context, n8, ax.m.j.B2);
        this.J = (context = l8.c(ax.m.j.F2)) != null ? context : this.getTextColors();
        n8 = l8.f(ax.m.j.C2, 0);
        if (n8 != 0 && (f8 = (float)n8) != this.I.getTextSize()) {
            this.I.setTextSize(f8);
            this.requestLayout();
        }
        this.o(l8.k(ax.m.j.D2, -1), l8.k(ax.m.j.E2, -1));
        this.M = l8.a(ax.m.j.Q2, false) ? new ax.r.a(this.getContext()) : null;
        this.setTextOnInternal(this.o);
        this.setTextOffInternal(this.q);
        l8.x();
    }

    public void n(Typeface typeface, int n8) {
        float f8 = 0.0f;
        boolean bl = false;
        if (n8 > 0) {
            typeface = typeface == null ? Typeface.defaultFromStyle((int)n8) : Typeface.create((Typeface)typeface, (int)n8);
            this.setSwitchTypeface(typeface);
            int n9 = typeface != null ? typeface.getStyle() : 0;
            n8 = ~n9 & n8;
            typeface = this.I;
            if ((n8 & 1) != 0) {
                bl = true;
            }
            typeface.setFakeBoldText(bl);
            typeface = this.I;
            if ((n8 & 2) != 0) {
                f8 = -0.25f;
            }
            typeface.setTextSkewX(f8);
            return;
        }
        this.I.setFakeBoldText(false);
        this.I.setTextSkewX(0.0f);
        this.setSwitchTypeface(typeface);
    }

    protected int[] onCreateDrawableState(int n8) {
        int[] nArray = super.onCreateDrawableState(n8 + 1);
        if (this.isChecked()) {
            View.mergeDrawableStates((int[])nArray, (int[])T);
        }
        return nArray;
    }

    protected void onDraw(Canvas canvas) {
        int n8;
        Rect rect;
        super.onDraw(canvas);
        Rect rect2 = this.R;
        Object object = this.f;
        if (object != null) {
            object.getPadding(rect2);
        } else {
            rect2.setEmpty();
        }
        int n9 = this.E;
        int n10 = this.G;
        int n11 = rect2.top;
        int n12 = rect2.bottom;
        Drawable drawable = this.a;
        if (object != null) {
            if (this.n && drawable != null) {
                rect = androidx.appcompat.widget.A.d(drawable);
                drawable.copyBounds(rect2);
                rect2.left += rect.left;
                rect2.right -= rect.right;
                n8 = canvas.save();
                canvas.clipRect(rect2, Region.Op.DIFFERENCE);
                object.draw(canvas);
                canvas.restoreToCount(n8);
            } else {
                object.draw(canvas);
            }
        }
        int n13 = canvas.save();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if ((rect = this.getTargetCheckedState() ? this.K : this.L) != null) {
            object = this.getDrawableState();
            rect2 = this.J;
            if (rect2 != null) {
                this.I.setColor(rect2.getColorForState((int[])object, 0));
            }
            this.I.drawableState = (int[])object;
            if (drawable != null) {
                drawable = drawable.getBounds();
                n8 = drawable.left + drawable.right;
            } else {
                n8 = this.getWidth();
            }
            int n14 = rect.getWidth() / 2;
            n11 = (n9 + n11 + (n10 - n12)) / 2;
            n10 = rect.getHeight() / 2;
            canvas.translate((float)((n8 /= 2) - n14), (float)(n11 - n10));
            rect.draw(canvas);
        }
        canvas.restoreToCount(n13);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30 && !TextUtils.isEmpty((CharSequence)(charSequence = this.isChecked() ? this.o : this.q))) {
            CharSequence charSequence2 = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty((CharSequence)charSequence2)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(charSequence2);
            stringBuilder.append(' ');
            stringBuilder.append(charSequence);
            accessibilityNodeInfo.setText((CharSequence)stringBuilder);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        super.onLayout(bl, n8, n9, n10, n11);
                        Drawable drawable = this.a;
                        n8 = 0;
                        if (drawable != null) {
                            drawable = this.R;
                            Drawable drawable2 = this.f;
                            if (drawable2 != null) {
                                drawable2.getPadding((Rect)drawable);
                            } else {
                                drawable.setEmpty();
                            }
                            drawable2 = androidx.appcompat.widget.A.d(this.a);
                            n9 = Math.max(0, drawable2.left - drawable.left);
                            n8 = Math.max(0, drawable2.right - drawable.right);
                        } else {
                            n9 = 0;
                        }
                        if (androidx.appcompat.widget.O.b((View)this)) {
                            n10 = this.getPaddingLeft() + n9;
                            n8 = this.A + n10 - n9 - n8;
                            n9 = n10;
                            n10 = n8;
                        } else {
                            n10 = this.getWidth() - this.getPaddingRight() - n8;
                            n9 = n10 - this.A + n9 + n8;
                        }
                        n8 = this.getGravity() & 0x70;
                        if (n8 == 16) break block6;
                        if (n8 == 80) break block7;
                        n8 = this.getPaddingTop();
                        n11 = this.B;
                        break block8;
                    }
                    n11 = this.getHeight() - this.getPaddingBottom();
                    n8 = n11 - this.B;
                    break block9;
                }
                n8 = (this.getPaddingTop() + this.getHeight() - this.getPaddingBottom()) / 2;
                n11 = this.B;
                n8 -= n11 / 2;
            }
            n11 += n8;
        }
        this.D = n9;
        this.E = n8;
        this.G = n11;
        this.F = n10;
    }

    public void onMeasure(int n8, int n9) {
        int n10;
        int n11;
        if (this.s) {
            if (this.K == null) {
                this.K = this.i(this.p);
            }
            if (this.L == null) {
                this.L = this.i(this.r);
            }
        }
        Rect rect = this.R;
        Drawable drawable = this.a;
        int n12 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            n11 = this.a.getIntrinsicWidth() - rect.left - rect.right;
            n10 = this.a.getIntrinsicHeight();
        } else {
            n11 = 0;
            n10 = 0;
        }
        int n13 = this.s ? Math.max(this.K.getWidth(), this.L.getWidth()) + this.k * 2 : 0;
        this.C = Math.max(n13, n11);
        drawable = this.f;
        if (drawable != null) {
            drawable.getPadding(rect);
            n11 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
            n11 = n12;
        }
        int n14 = rect.left;
        int n15 = rect.right;
        rect = this.a;
        n12 = n15;
        n13 = n14;
        if (rect != null) {
            rect = androidx.appcompat.widget.A.d((Drawable)rect);
            n13 = Math.max(n14, rect.left);
            n12 = Math.max(n15, rect.right);
        }
        n13 = this.H ? Math.max(this.l, this.C * 2 + n13 + n12) : this.l;
        n10 = Math.max(n11, n10);
        this.A = n13;
        this.B = n10;
        super.onMeasure(n8, n9);
        if (this.getMeasuredHeight() < n10) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), n10);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = this.isChecked() ? this.o : this.q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        block11: {
            block8: {
                block9: {
                    int n8;
                    block10: {
                        this.x.addMovement(motionEvent);
                        n8 = motionEvent.getActionMasked();
                        if (n8 == 0) break block8;
                        if (n8 == 1) break block9;
                        if (n8 == 2) break block10;
                        if (n8 == 3) break block9;
                        break block11;
                    }
                    n8 = this.t;
                    if (n8 != 1) {
                        if (n8 == 2) {
                            float f8 = motionEvent.getX();
                            n8 = this.getThumbScrollRange();
                            float f9 = f8 - this.v;
                            f9 = n8 != 0 ? (f9 /= (float)n8) : (f9 > 0.0f ? 1.0f : -1.0f);
                            float f10 = f9;
                            if (androidx.appcompat.widget.O.b((View)this)) {
                                f10 = -f9;
                            }
                            if ((f9 = SwitchCompat.f(this.z + f10, 0.0f, 1.0f)) != this.z) {
                                this.v = f8;
                                this.setThumbPosition(f9);
                            }
                            return true;
                        }
                    } else {
                        float f11 = motionEvent.getX();
                        float f12 = motionEvent.getY();
                        if (Math.abs(f11 - this.v) > (float)this.u || Math.abs(f12 - this.w) > (float)this.u) {
                            this.t = 2;
                            this.getParent().requestDisallowInterceptTouchEvent(true);
                            this.v = f11;
                            this.w = f12;
                            return true;
                        }
                    }
                    break block11;
                }
                if (this.t == 2) {
                    this.q(motionEvent);
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.t = 0;
                this.x.clear();
                break block11;
            }
            float f13 = motionEvent.getX();
            float f14 = motionEvent.getY();
            if (this.isEnabled() && this.h(f13, f14)) {
                this.t = 1;
                this.v = f13;
                this.w = f14;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAllCaps(boolean bl) {
        super.setAllCaps(bl);
        this.getEmojiTextViewHelper().d(bl);
    }

    public void setChecked(boolean bl) {
        super.setChecked(bl);
        bl = this.isChecked();
        if (bl) {
            this.l();
        } else {
            this.k();
        }
        if (this.getWindowToken() != null && this.isLaidOut()) {
            this.a(bl);
            return;
        }
        this.d();
        float f8 = bl ? 1.0f : 0.0f;
        this.setThumbPosition(f8);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(ax.h0.j.p((TextView)this, callback));
    }

    public void setEmojiCompatEnabled(boolean bl) {
        this.getEmojiTextViewHelper().e(bl);
        this.setTextOnInternal(this.o);
        this.setTextOffInternal(this.q);
        this.requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean bl) {
        this.H = bl;
        this.invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArray) {
        super.setFilters(this.getEmojiTextViewHelper().a(inputFilterArray));
    }

    public void setShowText(boolean bl) {
        if (this.s != bl) {
            this.s = bl;
            this.requestLayout();
            if (bl) {
                this.p();
            }
        }
    }

    public void setSplitTrack(boolean bl) {
        this.n = bl;
        this.invalidate();
    }

    public void setSwitchMinWidth(int n8) {
        this.l = n8;
        this.requestLayout();
    }

    public void setSwitchPadding(int n8) {
        this.m = n8;
        this.requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if (this.I.getTypeface() != null && !this.I.getTypeface().equals((Object)typeface) || this.I.getTypeface() == null && typeface != null) {
            this.I.setTypeface(typeface);
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.setTextOffInternal(charSequence);
        this.requestLayout();
        if (!this.isChecked()) {
            this.k();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.setTextOnInternal(charSequence);
        this.requestLayout();
        if (this.isChecked()) {
            this.l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
        }
        this.requestLayout();
    }

    void setThumbPosition(float f8) {
        this.z = f8;
        this.invalidate();
    }

    public void setThumbResource(int n8) {
        this.setThumbDrawable(ax.o.a.b(this.getContext(), n8));
    }

    public void setThumbTextPadding(int n8) {
        this.k = n8;
        this.requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        this.b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        this.b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
        }
        this.requestLayout();
    }

    public void setTrackResource(int n8) {
        this.setTrackDrawable(ax.o.a.b(this.getContext(), n8));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        this.c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        this.c();
    }

    public void toggle() {
        this.setChecked(this.isChecked() ^ true);
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.f;
        {
        }
    }

    static class b
    extends e.e {
        private final Reference<SwitchCompat> q;

        b(SwitchCompat switchCompat) {
            this.q = new WeakReference<SwitchCompat>(switchCompat);
        }

        @Override
        public void a(Throwable object) {
            object = this.q.get();
            if (object != null) {
                ((SwitchCompat)((Object)object)).j();
            }
        }

        @Override
        public void b() {
            SwitchCompat switchCompat = this.q.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }
}

