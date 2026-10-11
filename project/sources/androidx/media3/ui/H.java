package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.ui.SubtitleView;
import ax.S0.d0;
import ax.a2.C1317a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class H extends FrameLayout implements SubtitleView.a {
    private final C0638a a;
    private final WebView b;
    private List<ax.R0.a> c;
    private C1317a d;
    private float e;
    private int f;
    private float g;

    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public H(Context context) {
        this(context, null);
    }

    private static int b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = b.a[alignment.ordinal()];
        return i != 1 ? i != 2 ? "center" : "end" : "start";
    }

    private static String d(C1317a c1317a) {
        int i = c1317a.d;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unset" : d0.G("-0.05em -0.05em 0.15em %s", C0640c.b(c1317a.e)) : d0.G("0.06em 0.08em 0.15em %s", C0640c.b(c1317a.e)) : d0.G("0.1em 0.12em 0.15em %s", C0640c.b(c1317a.e)) : d0.G("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C0640c.b(c1317a.e));
    }

    private String e(int i, float f) {
        float f2 = F.f(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return f2 == -3.4028235E38f ? "unset" : d0.G("%.2fpx", Float.valueOf(f2 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    private static String h(ax.R0.a aVar) {
        float f = aVar.q;
        if (f == 0.0f) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int i = aVar.p;
        return d0.G("%s(%.2fdeg)", (i == 2 || i == 1) ? "skewY" : "skewX", Float.valueOf(f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0168, code lost:
    
        if (r13 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016b, code lost:
    
        r23 = "left";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016e, code lost:
    
        if (r13 != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i() {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.H.i():void");
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<ax.R0.a> list, C1317a c1317a, float f, int i, float f2) {
        this.d = c1317a;
        this.e = f;
        this.f = i;
        this.g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ax.R0.a aVar = list.get(i2);
            if (aVar.d != null) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            i();
        }
        this.a.a(arrayList, c1317a, f, i, f2);
        invalidate();
    }

    public void g() {
        this.b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        i();
    }

    public H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = Collections.EMPTY_LIST;
        this.d = C1317a.g;
        this.e = 0.0533f;
        this.f = 0;
        this.g = 0.08f;
        C0638a c0638a = new C0638a(context, attributeSet);
        this.a = c0638a;
        a aVar = new a(context, attributeSet);
        this.b = aVar;
        aVar.setBackgroundColor(0);
        addView(c0638a);
        addView(aVar);
    }
}
