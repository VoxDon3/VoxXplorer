package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import ax.R0.a;
import ax.a2.C1317a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    private List<ax.R0.a> a;
    private C1317a b;
    private int c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    private int h;
    private a i;
    private View j;

    interface a {
        void a(List<ax.R0.a> list, C1317a c1317a, float f, int i, float f2);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = C1317a.g;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.g = true;
        C0638a c0638a = new C0638a(context);
        this.i = c0638a;
        this.j = c0638a;
        addView(c0638a);
        this.h = 1;
    }

    private ax.R0.a a(ax.R0.a aVar) {
        a.b a2 = aVar.a();
        if (!this.f) {
            F.c(a2);
        } else if (!this.g) {
            F.d(a2);
        }
        return a2.a();
    }

    private void d(int i, float f) {
        this.c = i;
        this.d = f;
        g();
    }

    private void g() {
        this.i.a(getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.e);
    }

    private List<ax.R0.a> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.g) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            arrayList.add(a(this.a.get(i)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C1317a getUserCaptionStyle() {
        if (isInEditMode()) {
            return C1317a.g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? C1317a.g : C1317a.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof H) {
            ((H) view).g();
        }
        this.j = t;
        this.i = t;
        addView(t);
    }

    public void b(int i, float f) {
        Context context = getContext();
        d(2, TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void c(float f, boolean z) {
        d(z ? 1 : 0, f);
    }

    public void e() {
        setStyle(getUserCaptionStyle());
    }

    public void f() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.g = z;
        g();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f = z;
        g();
    }

    public void setBottomPaddingFraction(float f) {
        this.e = f;
        g();
    }

    public void setCues(List<ax.R0.a> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        g();
    }

    public void setFractionalTextSize(float f) {
        c(f, false);
    }

    public void setStyle(C1317a c1317a) {
        this.b = c1317a;
        g();
    }

    public void setViewType(int i) {
        if (this.h == i) {
            return;
        }
        if (i == 1) {
            setView(new C0638a(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new H(getContext()));
        }
        this.h = i;
    }
}
