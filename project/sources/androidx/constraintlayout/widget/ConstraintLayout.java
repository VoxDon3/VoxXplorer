package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import ax.H.d;
import ax.H.e;
import ax.H.k;
import ax.H.l;
import ax.I.b;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static ax.L.d x;
    SparseArray<View> a;
    private ArrayList<androidx.constraintlayout.widget.c> b;
    protected ax.H.f c;
    private int d;
    private int e;
    private int f;
    private int g;
    protected boolean h;
    private int i;
    private e j;
    protected d k;
    private int l;
    private HashMap<String, Integer> m;
    private int n;
    private int o;
    int p;
    int q;
    int r;
    int s;
    private SparseArray<ax.H.e> t;
    c u;
    private int v;
    private int w;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.b.values().length];
            a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements b.InterfaceC0089b {
        ConstraintLayout a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        public c(ConstraintLayout constraintLayout) {
            this.a = constraintLayout;
        }

        private boolean d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // ax.I.b.InterfaceC0089b
        @SuppressLint({"WrongCall"})
        public final void a(ax.H.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int max2;
            int i;
            if (eVar == null) {
                return;
            }
            if (eVar.V() == 8 && !eVar.j0()) {
                aVar.e = 0;
                aVar.f = 0;
                aVar.g = 0;
                return;
            }
            if (eVar.K() == null) {
                return;
            }
            e.b bVar = aVar.a;
            e.b bVar2 = aVar.b;
            int i2 = aVar.c;
            int i3 = aVar.d;
            int i4 = this.b + this.c;
            int i5 = this.d;
            View view = (View) eVar.s();
            int[] iArr = a.a;
            int i6 = iArr[bVar.ordinal()];
            if (i6 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            } else if (i6 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
            } else if (i6 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5 + eVar.B(), -1);
            } else if (i6 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
                boolean z = eVar.w == 1;
                int i7 = aVar.j;
                if (i7 == b.a.l || i7 == b.a.m) {
                    boolean z2 = view.getMeasuredHeight() == eVar.x();
                    if (aVar.j == b.a.m || !z || ((z && z2) || (view instanceof h) || eVar.n0())) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.W(), 1073741824);
                    }
                }
            }
            int i8 = iArr[bVar2.ordinal()];
            if (i8 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else if (i8 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            } else if (i8 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4 + eVar.U(), -1);
            } else if (i8 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
                boolean z3 = eVar.x == 1;
                int i9 = aVar.j;
                if (i9 == b.a.l || i9 == b.a.m) {
                    boolean z4 = view.getMeasuredWidth() == eVar.W();
                    if (aVar.j == b.a.m || !z3 || ((z3 && z4) || (view instanceof h) || eVar.o0())) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.x(), 1073741824);
                    }
                }
            }
            ax.H.f fVar = (ax.H.f) eVar.K();
            if (fVar != null && k.b(ConstraintLayout.this.i, 256) && view.getMeasuredWidth() == eVar.W() && view.getMeasuredWidth() < fVar.W() && view.getMeasuredHeight() == eVar.x() && view.getMeasuredHeight() < fVar.x() && view.getBaseline() == eVar.p() && !eVar.m0() && d(eVar.C(), makeMeasureSpec, eVar.W()) && d(eVar.D(), makeMeasureSpec2, eVar.x())) {
                aVar.e = eVar.W();
                aVar.f = eVar.x();
                aVar.g = eVar.p();
                return;
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z5 = bVar == bVar3;
            boolean z6 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z7 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z8 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z9 = z5 && eVar.d0 > 0.0f;
            boolean z10 = z6 && eVar.d0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i10 = aVar.j;
            if (i10 != b.a.l && i10 != b.a.m && z5 && eVar.w == 0 && z6 && eVar.x == 0) {
                i = -1;
                max2 = 0;
                baseline = 0;
                max = 0;
            } else {
                if ((view instanceof ax.L.e) && (eVar instanceof l)) {
                    ((ax.L.e) view).t((l) eVar, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                eVar.V0(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i11 = eVar.z;
                max = i11 > 0 ? Math.max(i11, measuredWidth) : measuredWidth;
                int i12 = eVar.A;
                if (i12 > 0) {
                    max = Math.min(i12, max);
                }
                int i13 = eVar.C;
                max2 = i13 > 0 ? Math.max(i13, measuredHeight) : measuredHeight;
                boolean z11 = z8;
                int i14 = eVar.D;
                if (i14 > 0) {
                    max2 = Math.min(i14, max2);
                }
                if (!k.b(ConstraintLayout.this.i, 1)) {
                    if (z9 && z7) {
                        max = (int) ((max2 * eVar.d0) + 0.5f);
                    } else if (z10 && z11) {
                        max2 = (int) ((max / eVar.d0) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != max2) {
                    if (measuredWidth != max) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                    }
                    if (measuredHeight != max2) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    eVar.V0(makeMeasureSpec, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    max2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i = -1;
            }
            boolean z12 = baseline != i;
            aVar.i = (max == aVar.c && max2 == aVar.d) ? false : true;
            if (bVar5.g0) {
                z12 = true;
            }
            if (z12 && baseline != -1 && eVar.p() != baseline) {
                aVar.i = true;
            }
            aVar.e = max;
            aVar.f = max2;
            aVar.h = z12;
            aVar.g = baseline;
        }

        @Override // ax.I.b.InterfaceC0089b
        public final void b() {
            int childCount = this.a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.a.getChildAt(i);
                if (childAt instanceof h) {
                    ((h) childAt).a(this.a);
                }
            }
            int size = this.a.b.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.c) this.a.b.get(i2)).p(this.a);
                }
            }
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i;
            this.g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.c = new ax.H.f();
        this.d = 0;
        this.e = 0;
        this.f = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.g = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap<>();
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = new SparseArray<>();
        this.u = new c(this);
        this.v = 0;
        this.w = 0;
        q(attributeSet, 0, 0);
    }

    private boolean A() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            w();
        }
        return z;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static ax.L.d getSharedValues() {
        if (x == null) {
            x = new ax.L.d();
        }
        return x;
    }

    private final ax.H.e l(int i) {
        if (i == 0) {
            return this.c;
        }
        View view = this.a.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).v0;
    }

    private void q(AttributeSet attributeSet, int i, int i2) {
        this.c.B0(this);
        this.c.V1(this.u);
        this.a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ax.L.c.n1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == ax.L.c.x1) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == ax.L.c.y1) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == ax.L.c.v1) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == ax.L.c.w1) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == ax.L.c.g3) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == ax.L.c.b2) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == ax.L.c.F1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.j = eVar;
                        eVar.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.W1(this.i);
    }

    private void s() {
        this.h = true;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
    }

    private void w() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ax.H.e n = n(getChildAt(i));
            if (n != null) {
                n.t0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    l(childAt.getId()).C0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.l != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.l && (childAt2 instanceof f)) {
                    this.j = ((f) childAt2).getConstraintSet();
                }
            }
        }
        e eVar = this.j;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.c.u1();
        int size = this.b.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.b.get(i4).r(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof h) {
                ((h) childAt3).b(this);
            }
        }
        this.t.clear();
        this.t.put(0, this.c);
        this.t.put(getId(), this.c);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.t.put(childAt4.getId(), n(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ax.H.e n2 = n(childAt5);
            if (n2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.c.c(n2);
                g(isInEditMode, childAt5, n2, bVar, this.t);
            }
        }
    }

    private void z(ax.H.e eVar, b bVar, SparseArray<ax.H.e> sparseArray, int i, d.b bVar2) {
        View view = this.a.get(i);
        ax.H.e eVar2 = sparseArray.get(i);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.g0 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.g0 = true;
            bVar4.v0.K0(true);
        }
        eVar.o(bVar3).b(eVar2.o(bVar2), bVar.D, bVar.C, true);
        eVar.K0(true);
        eVar.o(d.b.TOP).q();
        eVar.o(d.b.BOTTOM).q();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.c> arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.b.get(i).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        s();
        super.forceLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void g(boolean r15, android.view.View r16, ax.H.e r17, androidx.constraintlayout.widget.ConstraintLayout.b r18, android.util.SparseArray<ax.H.e> r19) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.g(boolean, android.view.View, ax.H.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.J1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.c.o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.c.o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.c.o = "parent";
            }
        }
        if (this.c.t() == null) {
            ax.H.f fVar = this.c;
            fVar.C0(fVar.o);
            Log.v("ConstraintLayout", " setDebugName " + this.c.t());
        }
        ArrayList<ax.H.e> r1 = this.c.r1();
        int size = r1.size();
        int i = 0;
        while (i < size) {
            ax.H.e eVar = r1.get(i);
            i++;
            ax.H.e eVar2 = eVar;
            View view = (View) eVar2.s();
            if (view != null) {
                if (eVar2.o == null && (id = view.getId()) != -1) {
                    eVar2.o = getContext().getResources().getResourceEntryName(id);
                }
                if (eVar2.t() == null) {
                    eVar2.C0(eVar2.o);
                    Log.v("ConstraintLayout", " setDebugName " + eVar2.t());
                }
            }
        }
        this.c.O(sb);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object k(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.m;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.m.get(str);
    }

    public View m(int i) {
        return this.a.get(i);
    }

    public final ax.H.e n(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).v0;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            ax.H.e eVar = bVar.v0;
            if ((childAt.getVisibility() != 8 || bVar.h0 || bVar.i0 || bVar.k0 || isInEditMode) && !bVar.j0) {
                int X = eVar.X();
                int Y = eVar.Y();
                int W = eVar.W() + X;
                int x2 = eVar.x() + Y;
                childAt.layout(X, Y, W, x2);
                if ((childAt instanceof h) && (content = ((h) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(X, Y, W, x2);
                }
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.b.get(i6).o(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.v == i) {
            int i3 = this.w;
        }
        if (!this.h) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                if (getChildAt(i4).isLayoutRequested()) {
                    this.h = true;
                    break;
                }
                i4++;
            }
        }
        this.v = i;
        this.w = i2;
        this.c.Y1(r());
        if (this.h) {
            this.h = false;
            if (A()) {
                this.c.a2();
            }
        }
        v(this.c, this.i, i, i2);
        u(i, i2, this.c.W(), this.c.x(), this.c.Q1(), this.c.O1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ax.H.e n = n(view);
        if ((view instanceof g) && !(n instanceof ax.H.h)) {
            b bVar = (b) view.getLayoutParams();
            ax.H.h hVar = new ax.H.h();
            bVar.v0 = hVar;
            bVar.h0 = true;
            hVar.A1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.s();
            ((b) view.getLayoutParams()).i0 = true;
            if (!this.b.contains(cVar)) {
                this.b.add(cVar);
            }
        }
        this.a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.t1(n(view));
        this.b.remove(view);
        this.h = true;
    }

    protected boolean r() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.j = eVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ax.L.a aVar) {
        d dVar = this.k;
        if (dVar != null) {
            dVar.c(aVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        this.c.W1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void t(int i) {
        this.k = new d(getContext(), this, i);
    }

    protected void u(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.u;
        int i5 = cVar.e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + cVar.d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int min = Math.min(this.f, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.g, resolveSizeAndState2);
        if (z) {
            min |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z2) {
            min2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(min, min2);
        this.n = min;
        this.o = min2;
    }

    protected void v(ax.H.f fVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.u.c(i2, i3, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (r()) {
            i4 = max4;
            int i6 = size - paddingWidth;
            int i7 = size2 - i5;
            y(fVar, mode, i6, mode2, i7);
            fVar.R1(i, mode, i6, mode2, i7, this.n, this.o, i4, max);
        }
        i4 = max3;
        int i62 = size - paddingWidth;
        int i72 = size2 - i5;
        y(fVar, mode, i62, mode2, i72);
        fVar.R1(i, mode, i62, mode2, i72, this.n, this.o, i4, max);
    }

    public void x(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.m == null) {
                this.m = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.m.put(str, num);
        }
    }

    protected void y(ax.H.f fVar, int i, int i2, int i3, int i4) {
        e.b bVar;
        c cVar = this.u;
        int i5 = cVar.e;
        int i6 = cVar.d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.d);
            }
        } else if (i == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.d);
            }
            i2 = 0;
        } else if (i != 1073741824) {
            bVar = bVar2;
            i2 = 0;
        } else {
            i2 = Math.min(this.f - i6, i2);
            bVar = bVar2;
        }
        if (i3 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.e);
            }
        } else if (i3 != 0) {
            if (i3 == 1073741824) {
                i4 = Math.min(this.g - i5, i4);
            }
            i4 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.e);
            }
            i4 = 0;
        }
        if (i2 != fVar.W() || i4 != fVar.x()) {
            fVar.N1();
        }
        fVar.m1(0);
        fVar.n1(0);
        fVar.X0(this.f - i6);
        fVar.W0(this.g - i5);
        fVar.a1(0);
        fVar.Z0(0);
        fVar.P0(bVar);
        fVar.k1(i2);
        fVar.g1(bVar2);
        fVar.L0(i4);
        fVar.a1(this.d - i6);
        fVar.Z0(this.e - i5);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray<>();
        this.b = new ArrayList<>(4);
        this.c = new ax.H.f();
        this.d = 0;
        this.e = 0;
        this.f = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.g = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap<>();
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = new SparseArray<>();
        this.u = new c(this);
        this.v = 0;
        this.w = 0;
        q(attributeSet, i, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;
        public int a;
        public boolean a0;
        public int b;
        public boolean b0;
        public float c;
        public String c0;
        public boolean d;
        public int d0;
        public int e;
        boolean e0;
        public int f;
        boolean f0;
        public int g;
        boolean g0;
        public int h;
        boolean h0;
        public int i;
        boolean i0;
        public int j;
        boolean j0;
        public int k;
        boolean k0;
        public int l;
        int l0;
        public int m;
        int m0;
        public int n;
        int n0;
        public int o;
        int o0;
        public int p;
        int p0;
        public int q;
        int q0;
        public float r;
        float r0;
        public int s;
        int s0;
        public int t;
        int t0;
        public int u;
        float u0;
        public int v;
        ax.H.e v0;
        public int w;
        public boolean w0;
        public int x;
        public int y;
        public int z;

        private static class a {
            public static final SparseIntArray a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                a = sparseIntArray;
                sparseIntArray.append(ax.L.c.R2, 64);
                sparseIntArray.append(ax.L.c.u2, 65);
                sparseIntArray.append(ax.L.c.D2, 8);
                sparseIntArray.append(ax.L.c.E2, 9);
                sparseIntArray.append(ax.L.c.G2, 10);
                sparseIntArray.append(ax.L.c.H2, 11);
                sparseIntArray.append(ax.L.c.N2, 12);
                sparseIntArray.append(ax.L.c.M2, 13);
                sparseIntArray.append(ax.L.c.k2, 14);
                sparseIntArray.append(ax.L.c.j2, 15);
                sparseIntArray.append(ax.L.c.f2, 16);
                sparseIntArray.append(ax.L.c.h2, 52);
                sparseIntArray.append(ax.L.c.g2, 53);
                sparseIntArray.append(ax.L.c.l2, 2);
                sparseIntArray.append(ax.L.c.n2, 3);
                sparseIntArray.append(ax.L.c.m2, 4);
                sparseIntArray.append(ax.L.c.W2, 49);
                sparseIntArray.append(ax.L.c.X2, 50);
                sparseIntArray.append(ax.L.c.r2, 5);
                sparseIntArray.append(ax.L.c.s2, 6);
                sparseIntArray.append(ax.L.c.t2, 7);
                sparseIntArray.append(ax.L.c.a2, 67);
                sparseIntArray.append(ax.L.c.o1, 1);
                sparseIntArray.append(ax.L.c.I2, 17);
                sparseIntArray.append(ax.L.c.J2, 18);
                sparseIntArray.append(ax.L.c.q2, 19);
                sparseIntArray.append(ax.L.c.p2, 20);
                sparseIntArray.append(ax.L.c.b3, 21);
                sparseIntArray.append(ax.L.c.e3, 22);
                sparseIntArray.append(ax.L.c.c3, 23);
                sparseIntArray.append(ax.L.c.Z2, 24);
                sparseIntArray.append(ax.L.c.d3, 25);
                sparseIntArray.append(ax.L.c.a3, 26);
                sparseIntArray.append(ax.L.c.Y2, 55);
                sparseIntArray.append(ax.L.c.f3, 54);
                sparseIntArray.append(ax.L.c.z2, 29);
                sparseIntArray.append(ax.L.c.O2, 30);
                sparseIntArray.append(ax.L.c.o2, 44);
                sparseIntArray.append(ax.L.c.B2, 45);
                sparseIntArray.append(ax.L.c.Q2, 46);
                sparseIntArray.append(ax.L.c.A2, 47);
                sparseIntArray.append(ax.L.c.P2, 48);
                sparseIntArray.append(ax.L.c.d2, 27);
                sparseIntArray.append(ax.L.c.c2, 28);
                sparseIntArray.append(ax.L.c.S2, 31);
                sparseIntArray.append(ax.L.c.v2, 32);
                sparseIntArray.append(ax.L.c.U2, 33);
                sparseIntArray.append(ax.L.c.T2, 34);
                sparseIntArray.append(ax.L.c.V2, 35);
                sparseIntArray.append(ax.L.c.x2, 36);
                sparseIntArray.append(ax.L.c.w2, 37);
                sparseIntArray.append(ax.L.c.y2, 38);
                sparseIntArray.append(ax.L.c.C2, 39);
                sparseIntArray.append(ax.L.c.L2, 40);
                sparseIntArray.append(ax.L.c.F2, 41);
                sparseIntArray.append(ax.L.c.i2, 42);
                sparseIntArray.append(ax.L.c.e2, 43);
                sparseIntArray.append(ax.L.c.K2, 51);
                sparseIntArray.append(ax.L.c.h3, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new ax.H.e();
            this.w0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.L.c.n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = a.a.get(index);
                switch (i2) {
                    case 1:
                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f;
                        if (f < 0.0f) {
                            this.r = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.a = obtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        break;
                    case 7:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId2;
                        if (resourceId2 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f);
                        this.f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 22:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        break;
                    case 23:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        break;
                    case 24:
                        this.z = obtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        break;
                    case 25:
                        this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        break;
                    case 26:
                        this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        break;
                    case 27:
                        this.a0 = obtainStyledAttributes.getBoolean(index, this.a0);
                        break;
                    case 28:
                        this.b0 = obtainStyledAttributes.getBoolean(index, this.b0);
                        break;
                    case 29:
                        this.G = obtainStyledAttributes.getFloat(index, this.G);
                        break;
                    case 30:
                        this.H = obtainStyledAttributes.getFloat(index, this.H);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.P = i3;
                        if (i3 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.Q = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        break;
                    case 36:
                        try {
                            this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                e.q(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = obtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = obtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = obtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        e.o(this, obtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        e.o(this, obtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.d0 = obtainStyledAttributes.getInt(index, this.d0);
                                        break;
                                    case 67:
                                        this.d = obtainStyledAttributes.getBoolean(index, this.d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.h0 = false;
            this.e0 = true;
            this.f0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.a0) {
                this.e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.b0) {
                this.f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.e0 = false;
                if (i == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f0 = false;
                if (i2 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.b0 = true;
                }
            }
            if (this.c == -1.0f && this.a == -1 && this.b == -1) {
                return;
            }
            this.h0 = true;
            this.e0 = true;
            this.f0 = true;
            if (!(this.v0 instanceof ax.H.h)) {
                this.v0 = new ax.H.h();
            }
            ((ax.H.h) this.v0).A1(this.Z);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i, int i2) {
            super(i, i2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new ax.H.e();
            this.w0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = true;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new ax.H.e();
            this.w0 = false;
        }
    }
}
