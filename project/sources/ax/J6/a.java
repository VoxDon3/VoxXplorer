package ax.J6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import ax.h0.c;
import ax.k6.C2402c;
import ax.k6.l;
import ax.m.C2506a;
import ax.z6.C3555a;

/* loaded from: classes3.dex */
public class a extends s {
    private static final int g = l.y;
    private static final int[][] h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList e;
    private boolean f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2506a.J);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int d = C3555a.d(this, C2506a.v);
            int d2 = C3555a.d(this, C2402c.f);
            int d3 = C3555a.d(this, C2402c.i);
            int[][] iArr = h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C3555a.k(d3, d, 1.0f);
            iArr2[1] = C3555a.k(d3, d2, 0.54f);
            iArr2[2] = C3555a.k(d3, d2, 0.38f);
            iArr2[3] = C3555a.k(d3, d2, 0.38f);
            this.e = new ColorStateList(iArr, iArr2);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = ax.J6.a.g
            android.content.Context r7 = ax.V6.a.d(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = ax.k6.m.Q3
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = ax.F6.w.i(r0, r1, r2, r3, r4, r5)
            int r9 = ax.k6.m.R3
            boolean r1 = r8.hasValue(r9)
            if (r1 == 0) goto L27
            android.content.res.ColorStateList r9 = ax.K6.c.a(r0, r8, r9)
            ax.h0.c.d(r6, r9)
        L27:
            int r9 = ax.k6.m.S3
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.J6.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
