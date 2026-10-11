package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.preference.g;
import ax.S.k;
import ax.b2.AbstractC1476d;
import ax.b2.C1478f;
import ax.b2.C1481i;
import ax.b2.C1482j;
import ax.b2.C1484l;
import ax.d0.H;
import ax.o.C2653a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private boolean A0;
    private boolean B0;
    private boolean C0;
    private boolean D0;
    private boolean E0;
    private boolean F0;
    private boolean G0;
    private int H0;
    private int I0;
    private c J0;
    private List<Preference> K0;
    private PreferenceGroup L0;
    private boolean M0;
    private boolean N0;
    private f O0;
    private g P0;
    private final View.OnClickListener Q0;
    private androidx.preference.g c0;
    private long d0;
    private boolean e0;
    private d f0;
    private e g0;
    private int h0;
    private int i0;
    private CharSequence j0;
    private CharSequence k0;
    private int l0;
    private Drawable m0;
    private String n0;
    private Intent o0;
    private String p0;
    private final Context q;
    private Bundle q0;
    private boolean r0;
    private boolean s0;
    private boolean t0;
    private boolean u0;
    private String v0;
    private Object w0;
    private boolean x0;
    private boolean y0;
    private boolean z0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.p0(view);
        }
    }

    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    interface c {
        void a(Preference preference);

        void d(Preference preference);

        void f(Preference preference);
    }

    public interface d {
        boolean a(Preference preference, Object obj);
    }

    public interface e {
        boolean a(Preference preference);
    }

    private static class f implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {
        private final Preference a;

        f(Preference preference) {
            this.a = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence M = this.a.M();
            if (!this.a.R() || TextUtils.isEmpty(M)) {
                return;
            }
            contextMenu.setHeaderTitle(M);
            contextMenu.add(0, 0, 0, C1482j.a).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.a.s().getSystemService("clipboard");
            CharSequence M = this.a.M();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", M));
            Toast.makeText(this.a.s(), this.a.s().getString(C1482j.d, M), 0).show();
            return true;
        }
    }

    public interface g<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.h0 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.i0 = 0;
        this.r0 = true;
        this.s0 = true;
        this.u0 = true;
        this.x0 = true;
        this.y0 = true;
        this.z0 = true;
        this.A0 = true;
        this.B0 = true;
        this.D0 = true;
        this.G0 = true;
        int i3 = C1481i.b;
        this.H0 = i3;
        this.Q0 = new a();
        this.q = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484l.J, i, i2);
        this.l0 = k.n(obtainStyledAttributes, C1484l.h0, C1484l.K, 0);
        this.n0 = k.o(obtainStyledAttributes, C1484l.k0, C1484l.Q);
        this.j0 = k.p(obtainStyledAttributes, C1484l.s0, C1484l.O);
        this.k0 = k.p(obtainStyledAttributes, C1484l.r0, C1484l.R);
        this.h0 = k.d(obtainStyledAttributes, C1484l.m0, C1484l.S, SubsamplingScaleImageView.TILE_SIZE_AUTO);
        this.p0 = k.o(obtainStyledAttributes, C1484l.g0, C1484l.X);
        this.H0 = k.n(obtainStyledAttributes, C1484l.l0, C1484l.N, i3);
        this.I0 = k.n(obtainStyledAttributes, C1484l.t0, C1484l.T, 0);
        this.r0 = k.b(obtainStyledAttributes, C1484l.f0, C1484l.M, true);
        this.s0 = k.b(obtainStyledAttributes, C1484l.o0, C1484l.P, true);
        this.u0 = k.b(obtainStyledAttributes, C1484l.n0, C1484l.L, true);
        this.v0 = k.o(obtainStyledAttributes, C1484l.d0, C1484l.U);
        int i4 = C1484l.a0;
        this.A0 = k.b(obtainStyledAttributes, i4, i4, this.s0);
        int i5 = C1484l.b0;
        this.B0 = k.b(obtainStyledAttributes, i5, i5, this.s0);
        int i6 = C1484l.c0;
        if (obtainStyledAttributes.hasValue(i6)) {
            this.w0 = g0(obtainStyledAttributes, i6);
        } else {
            int i7 = C1484l.V;
            if (obtainStyledAttributes.hasValue(i7)) {
                this.w0 = g0(obtainStyledAttributes, i7);
            }
        }
        this.G0 = k.b(obtainStyledAttributes, C1484l.p0, C1484l.W, true);
        int i8 = C1484l.q0;
        boolean hasValue = obtainStyledAttributes.hasValue(i8);
        this.C0 = hasValue;
        if (hasValue) {
            this.D0 = k.b(obtainStyledAttributes, i8, C1484l.Y, true);
        }
        this.E0 = k.b(obtainStyledAttributes, C1484l.i0, C1484l.Z, false);
        int i9 = C1484l.j0;
        this.z0 = k.b(obtainStyledAttributes, i9, i9, true);
        int i10 = C1484l.e0;
        this.F0 = k.b(obtainStyledAttributes, i10, i10, false);
        obtainStyledAttributes.recycle();
    }

    private void Q0(SharedPreferences.Editor editor) {
        if (this.c0.t()) {
            editor.apply();
        }
    }

    private void R0() {
        Preference r;
        String str = this.v0;
        if (str == null || (r = r(str)) == null) {
            return;
        }
        r.S0(this);
    }

    private void S0(Preference preference) {
        List<Preference> list = this.K0;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void q() {
        J();
        if (P0() && L().contains(this.n0)) {
            n0(true, null);
            return;
        }
        Object obj = this.w0;
        if (obj != null) {
            n0(false, obj);
        }
    }

    private void u0() {
        if (TextUtils.isEmpty(this.v0)) {
            return;
        }
        Preference r = r(this.v0);
        if (r != null) {
            r.v0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.v0 + "\" not found for preference \"" + this.n0 + "\" (title: \"" + ((Object) this.j0) + "\"");
    }

    private void v0(Preference preference) {
        if (this.K0 == null) {
            this.K0 = new ArrayList();
        }
        this.K0.add(preference);
        preference.e0(this, O0());
    }

    private void z0(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                z0(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public Intent A() {
        return this.o0;
    }

    public void A0(int i) {
        B0(C2653a.b(this.q, i));
        this.l0 = i;
    }

    public String B() {
        return this.n0;
    }

    public void B0(Drawable drawable) {
        if (this.m0 != drawable) {
            this.m0 = drawable;
            this.l0 = 0;
            W();
        }
    }

    public final int C() {
        return this.H0;
    }

    public void C0(Intent intent) {
        this.o0 = intent;
    }

    public int D() {
        return this.h0;
    }

    public void D0(String str) {
        this.n0 = str;
        if (!this.t0 || Q()) {
            return;
        }
        w0();
    }

    public PreferenceGroup E() {
        return this.L0;
    }

    public void E0(int i) {
        this.H0 = i;
    }

    protected boolean F(boolean z) {
        if (!P0()) {
            return z;
        }
        J();
        return this.c0.l().getBoolean(this.n0, z);
    }

    final void F0(c cVar) {
        this.J0 = cVar;
    }

    protected int G(int i) {
        if (!P0()) {
            return i;
        }
        J();
        return this.c0.l().getInt(this.n0, i);
    }

    public void G0(d dVar) {
        this.f0 = dVar;
    }

    protected String H(String str) {
        if (!P0()) {
            return str;
        }
        J();
        return this.c0.l().getString(this.n0, str);
    }

    public void H0(e eVar) {
        this.g0 = eVar;
    }

    public Set<String> I(Set<String> set) {
        if (!P0()) {
            return set;
        }
        J();
        return this.c0.l().getStringSet(this.n0, set);
    }

    public void I0(int i) {
        if (i != this.h0) {
            this.h0 = i;
            Y();
        }
    }

    public AbstractC1476d J() {
        androidx.preference.g gVar = this.c0;
        if (gVar != null) {
            gVar.j();
        }
        return null;
    }

    public void J0(CharSequence charSequence) {
        if (N() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.k0, charSequence)) {
            return;
        }
        this.k0 = charSequence;
        W();
    }

    public androidx.preference.g K() {
        return this.c0;
    }

    public final void K0(g gVar) {
        this.P0 = gVar;
        W();
    }

    public SharedPreferences L() {
        if (this.c0 == null) {
            return null;
        }
        J();
        return this.c0.l();
    }

    public void L0(int i) {
        M0(this.q.getString(i));
    }

    public CharSequence M() {
        return N() != null ? N().a(this) : this.k0;
    }

    public void M0(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.j0)) {
            return;
        }
        this.j0 = charSequence;
        W();
    }

    public final g N() {
        return this.P0;
    }

    public final void N0(boolean z) {
        if (this.z0 != z) {
            this.z0 = z;
            c cVar = this.J0;
            if (cVar != null) {
                cVar.d(this);
            }
        }
    }

    public CharSequence O() {
        return this.j0;
    }

    public boolean O0() {
        return !S();
    }

    public final int P() {
        return this.I0;
    }

    protected boolean P0() {
        return this.c0 != null && T() && Q();
    }

    public boolean Q() {
        return !TextUtils.isEmpty(this.n0);
    }

    public boolean R() {
        return this.F0;
    }

    public boolean S() {
        return this.r0 && this.x0 && this.y0;
    }

    public boolean T() {
        return this.u0;
    }

    public boolean U() {
        return this.s0;
    }

    public final boolean V() {
        return this.z0;
    }

    protected void W() {
        c cVar = this.J0;
        if (cVar != null) {
            cVar.f(this);
        }
    }

    public void X(boolean z) {
        List<Preference> list = this.K0;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).e0(this, z);
        }
    }

    protected void Y() {
        c cVar = this.J0;
        if (cVar != null) {
            cVar.a(this);
        }
    }

    public void Z() {
        u0();
    }

    protected void a0(androidx.preference.g gVar) {
        this.c0 = gVar;
        if (!this.e0) {
            this.d0 = gVar.f();
        }
        q();
    }

    protected void b0(androidx.preference.g gVar, long j) {
        this.d0 = j;
        this.e0 = true;
        try {
            a0(gVar);
        } finally {
            this.e0 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(androidx.preference.h r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.c0(androidx.preference.h):void");
    }

    void d(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.L0 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.L0 = preferenceGroup;
    }

    protected void d0() {
    }

    public void e0(Preference preference, boolean z) {
        if (this.x0 == z) {
            this.x0 = !z;
            X(O0());
            W();
        }
    }

    public void f0() {
        R0();
        this.M0 = true;
    }

    protected Object g0(TypedArray typedArray, int i) {
        return null;
    }

    public boolean h(Object obj) {
        d dVar = this.f0;
        return dVar == null || dVar.a(this, obj);
    }

    public void i0(Preference preference, boolean z) {
        if (this.y0 == z) {
            this.y0 = !z;
            X(O0());
            W();
        }
    }

    final void j() {
        this.M0 = false;
    }

    protected void j0() {
        R0();
    }

    protected void k0(Parcelable parcelable) {
        this.N0 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i = this.h0;
        int i2 = preference.h0;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.j0;
        CharSequence charSequence2 = preference.j0;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.j0.toString());
    }

    protected Parcelable l0() {
        this.N0 = true;
        return AbsSavedState.EMPTY_STATE;
    }

    protected void m0(Object obj) {
    }

    void n(Bundle bundle) {
        Parcelable parcelable;
        if (!Q() || (parcelable = bundle.getParcelable(this.n0)) == null) {
            return;
        }
        this.N0 = false;
        k0(parcelable);
        if (!this.N0) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    @Deprecated
    protected void n0(boolean z, Object obj) {
        m0(obj);
    }

    public void o0() {
        g.c h;
        if (S() && U()) {
            d0();
            e eVar = this.g0;
            if (eVar == null || !eVar.a(this)) {
                androidx.preference.g K = K();
                if ((K == null || (h = K.h()) == null || !h.U(this)) && this.o0 != null) {
                    s().startActivity(this.o0);
                }
            }
        }
    }

    void p(Bundle bundle) {
        if (Q()) {
            this.N0 = false;
            Parcelable l0 = l0();
            if (!this.N0) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (l0 != null) {
                bundle.putParcelable(this.n0, l0);
            }
        }
    }

    protected void p0(View view) {
        o0();
    }

    protected boolean q0(boolean z) {
        if (!P0()) {
            return false;
        }
        if (z == F(!z)) {
            return true;
        }
        J();
        SharedPreferences.Editor e2 = this.c0.e();
        e2.putBoolean(this.n0, z);
        Q0(e2);
        return true;
    }

    protected <T extends Preference> T r(String str) {
        androidx.preference.g gVar = this.c0;
        if (gVar == null) {
            return null;
        }
        return (T) gVar.a(str);
    }

    protected boolean r0(int i) {
        if (!P0()) {
            return false;
        }
        if (i == G(~i)) {
            return true;
        }
        J();
        SharedPreferences.Editor e2 = this.c0.e();
        e2.putInt(this.n0, i);
        Q0(e2);
        return true;
    }

    public Context s() {
        return this.q;
    }

    protected boolean s0(String str) {
        if (!P0()) {
            return false;
        }
        if (TextUtils.equals(str, H(null))) {
            return true;
        }
        J();
        SharedPreferences.Editor e2 = this.c0.e();
        e2.putString(this.n0, str);
        Q0(e2);
        return true;
    }

    public Bundle t() {
        if (this.q0 == null) {
            this.q0 = new Bundle();
        }
        return this.q0;
    }

    public boolean t0(Set<String> set) {
        if (!P0()) {
            return false;
        }
        if (set.equals(I(null))) {
            return true;
        }
        J();
        SharedPreferences.Editor e2 = this.c0.e();
        e2.putStringSet(this.n0, set);
        Q0(e2);
        return true;
    }

    public String toString() {
        return u().toString();
    }

    StringBuilder u() {
        StringBuilder sb = new StringBuilder();
        CharSequence O = O();
        if (!TextUtils.isEmpty(O)) {
            sb.append(O);
            sb.append(' ');
        }
        CharSequence M = M();
        if (!TextUtils.isEmpty(M)) {
            sb.append(M);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String w() {
        return this.p0;
    }

    void w0() {
        if (TextUtils.isEmpty(this.n0)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.t0 = true;
    }

    long x() {
        return this.d0;
    }

    public void x0(Bundle bundle) {
        n(bundle);
    }

    public void y0(Bundle bundle) {
        p(bundle);
    }

    @Deprecated
    public void h0(H h) {
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, C1478f.h, R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
