/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.media3.ui.F;
import androidx.media3.ui.H;
import ax.R0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView
extends FrameLayout {
    private List<ax.R0.a> a = Collections.EMPTY_LIST;
    private ax.a2.a b = ax.a2.a.g;
    private int c = 0;
    private float d = 0.0533f;
    private float e = 0.08f;
    private boolean f = true;
    private boolean g = true;
    private int h;
    private a i;
    private View j;

    public SubtitleView(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        object = new androidx.media3.ui.a((Context)object);
        this.i = object;
        this.j = object;
        this.addView((View)object);
        this.h = 1;
    }

    private ax.R0.a a(ax.R0.a object) {
        object = ((ax.R0.a)object).a();
        if (!this.f) {
            F.c((a.b)object);
        } else if (!this.g) {
            F.d((a.b)object);
        }
        return ((a.b)object).a();
    }

    private void d(int n8, float f8) {
        this.c = n8;
        this.d = f8;
        this.g();
    }

    private void g() {
        this.i.a(this.getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.e);
    }

    private List<ax.R0.a> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.g) {
            return this.a;
        }
        ArrayList<ax.R0.a> arrayList = new ArrayList<ax.R0.a>(this.a.size());
        for (int i8 = 0; i8 < this.a.size(); ++i8) {
            arrayList.add(this.a(this.a.get(i8)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        if (this.isInEditMode()) {
            return 1.0f;
        }
        CaptioningManager captioningManager = (CaptioningManager)this.getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            return captioningManager.getFontScale();
        }
        return 1.0f;
    }

    private ax.a2.a getUserCaptionStyle() {
        if (this.isInEditMode()) {
            return ax.a2.a.g;
        }
        CaptioningManager captioningManager = (CaptioningManager)this.getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            return ax.a2.a.a(captioningManager.getUserStyle());
        }
        return ax.a2.a.g;
    }

    private <T extends View> void setView(T t8) {
        this.removeView(this.j);
        View view = this.j;
        if (view instanceof H) {
            ((H)view).g();
        }
        this.j = t8;
        this.i = (a)t8;
        this.addView(t8);
    }

    public void b(int n8, float f8) {
        Context context = this.getContext();
        context = context == null ? Resources.getSystem() : context.getResources();
        this.d(2, TypedValue.applyDimension((int)n8, (float)f8, (DisplayMetrics)context.getDisplayMetrics()));
    }

    public void c(float f8, boolean bl) {
        this.d(bl ? 1 : 0, f8);
    }

    public void e() {
        this.setStyle(this.getUserCaptionStyle());
    }

    public void f() {
        this.setFractionalTextSize(this.getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean bl) {
        this.g = bl;
        this.g();
    }

    public void setApplyEmbeddedStyles(boolean bl) {
        this.f = bl;
        this.g();
    }

    public void setBottomPaddingFraction(float f8) {
        this.e = f8;
        this.g();
    }

    public void setCues(List<ax.R0.a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        this.g();
    }

    public void setFractionalTextSize(float f8) {
        this.c(f8, false);
    }

    public void setStyle(ax.a2.a a8) {
        this.b = a8;
        this.g();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setViewType(int n8) {
        if (this.h == n8) {
            return;
        }
        if (n8 != 1) {
            if (n8 != 2) throw new IllegalArgumentException();
            this.setView(new H(this.getContext()));
        } else {
            this.setView(new androidx.media3.ui.a(this.getContext()));
        }
        this.h = n8;
    }

    static interface a {
        public void a(List<ax.R0.a> var1, ax.a2.a var2, float var3, int var4, float var5);
    }
}

