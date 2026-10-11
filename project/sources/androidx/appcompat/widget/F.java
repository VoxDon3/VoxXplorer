package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.B;
import ax.m.C2506a;
import ax.n.AbstractC2559a;
import ax.s.C3034a;
import ax.u.C3151B;

/* loaded from: classes.dex */
public class F extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final Interpolator j = new DecelerateInterpolator();
    Runnable a;
    private c b;
    B c;
    private Spinner d;
    private boolean e;
    int f;
    int g;
    private int h;
    private int i;

    class a implements Runnable {
        final /* synthetic */ View q;

        a(View view) {
            this.q = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            F.this.smoothScrollTo(this.q.getLeft() - ((F.this.getWidth() - this.q.getWidth()) / 2), 0);
            F.this.a = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return F.this.c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) F.this.c.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return F.this.c((AbstractC2559a.c) getItem(i), true);
            }
            ((d) view).a((AbstractC2559a.c) getItem(i));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = F.this.c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = F.this.c.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {
        private final int[] a;
        private AbstractC2559a.c b;
        private TextView c;
        private ImageView d;
        private View e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.content.Context r4, ax.n.AbstractC2559a.c r5, boolean r6) {
            /*
                r2 = this;
                androidx.appcompat.widget.F.this = r3
                int r3 = ax.m.C2506a.d
                r0 = 0
                r2.<init>(r4, r0, r3)
                r1 = 16842964(0x10100d4, float:2.3694152E-38)
                int[] r1 = new int[]{r1}
                r2.a = r1
                r2.b = r5
                r5 = 0
                androidx.appcompat.widget.L r3 = androidx.appcompat.widget.L.v(r4, r0, r1, r3, r5)
                boolean r4 = r3.s(r5)
                if (r4 == 0) goto L25
                android.graphics.drawable.Drawable r4 = r3.g(r5)
                r2.setBackgroundDrawable(r4)
            L25:
                r3.x()
                if (r6 == 0) goto L30
                r3 = 8388627(0x800013, float:1.175497E-38)
                r2.setGravity(r3)
            L30:
                r2.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.F.d.<init>(androidx.appcompat.widget.F, android.content.Context, ax.n.a$c, boolean):void");
        }

        public void a(AbstractC2559a.c cVar) {
            this.b = cVar;
            c();
        }

        public AbstractC2559a.c b() {
            return this.b;
        }

        public void c() {
            AbstractC2559a.c cVar = this.b;
            View b = cVar.b();
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.e = b;
                TextView textView = this.c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.e;
            if (view != null) {
                removeView(view);
                this.e = null;
            }
            Drawable c = cVar.c();
            CharSequence d = cVar.d();
            if (c != null) {
                if (this.d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.d = appCompatImageView;
                }
                this.d.setImageDrawable(c);
                this.d.setVisibility(0);
            } else {
                ImageView imageView2 = this.d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(d);
            if (isEmpty) {
                TextView textView2 = this.c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.c.setText((CharSequence) null);
                }
            } else {
                if (this.c == null) {
                    x xVar = new x(getContext(), null, C2506a.e);
                    xVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    xVar.setLayoutParams(layoutParams2);
                    addView(xVar);
                    this.c = xVar;
                }
                this.c.setText(d);
                this.c.setVisibility(0);
            }
            ImageView imageView3 = this.d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            C3151B.a(this, isEmpty ? cVar.a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (F.this.f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = F.this.f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        u uVar = new u(getContext(), null, C2506a.h);
        uVar.setLayoutParams(new B.a(-2, -1));
        uVar.setOnItemSelectedListener(this);
        return uVar;
    }

    private boolean d() {
        Spinner spinner = this.d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.d == null) {
            this.d = b();
        }
        removeView(this.c);
        addView(this.d, new ViewGroup.LayoutParams(-2, -1));
        if (this.d.getAdapter() == null) {
            this.d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.a = null;
        }
        this.d.setSelection(this.i);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.d);
        addView(this.c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.d.getSelectedItemPosition());
        return false;
    }

    public void a(int i) {
        View childAt = this.c.getChildAt(i);
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.a = aVar;
        post(aVar);
    }

    d c(AbstractC2559a.c cVar, boolean z) {
        d dVar = new d(this, getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.b == null) {
            this.b = new c();
        }
        dVar.setOnClickListener(this.b);
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3034a b2 = C3034a.b(getContext());
        setContentHeight(b2.f());
        this.g = b2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j2) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f = -1;
        } else {
            if (childCount > 2) {
                this.f = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f = View.MeasureSpec.getSize(i) / 2;
            }
            this.f = Math.min(this.f, this.g);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        if (z || !this.e) {
            f();
        } else {
            this.c.measure(0, makeMeasureSpec);
            if (this.c.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                e();
            } else {
                f();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.e = z;
    }

    public void setContentHeight(int i) {
        this.h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.i = i;
        int childCount = this.c.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.c.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        Spinner spinner = this.d;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
