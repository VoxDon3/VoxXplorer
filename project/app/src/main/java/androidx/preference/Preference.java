/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.preference.PreferenceGroup;
import androidx.preference.h;
import ax.S.k;
import ax.b2.i;
import ax.b2.j;
import ax.b2.l;
import ax.c0.d0;
import ax.d0.H;
import ax.o.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Preference
implements Comparable<Preference> {
    private boolean A0 = true;
    private boolean B0 = true;
    private boolean C0;
    private boolean D0 = true;
    private boolean E0;
    private boolean F0;
    private boolean G0 = true;
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
    private int h0 = Integer.MAX_VALUE;
    private int i0 = 0;
    private CharSequence j0;
    private CharSequence k0;
    private int l0;
    private Drawable m0;
    private String n0;
    private Intent o0;
    private String p0;
    private final Context q;
    private Bundle q0;
    private boolean r0 = true;
    private boolean s0 = true;
    private boolean t0;
    private boolean u0 = true;
    private String v0;
    private Object w0;
    private boolean x0 = true;
    private boolean y0 = true;
    private boolean z0 = true;

    public Preference(Context context) {
        this(context, null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, ax.b2.f.h, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int n8, int n9) {
        boolean bl;
        int n10;
        this.H0 = n10 = i.b;
        this.Q0 = new View.OnClickListener(this){
            final Preference a;
            {
                this.a = preference;
            }

            public void onClick(View view) {
                this.a.p0(view);
            }
        };
        this.q = context;
        context = context.obtainStyledAttributes(attributeSet, l.J, n8, n9);
        this.l0 = k.n((TypedArray)context, l.h0, l.K, 0);
        this.n0 = k.o((TypedArray)context, l.k0, l.Q);
        this.j0 = k.p((TypedArray)context, l.s0, l.O);
        this.k0 = k.p((TypedArray)context, l.r0, l.R);
        this.h0 = k.d((TypedArray)context, l.m0, l.S, Integer.MAX_VALUE);
        this.p0 = k.o((TypedArray)context, l.g0, l.X);
        this.H0 = k.n((TypedArray)context, l.l0, l.N, n10);
        this.I0 = k.n((TypedArray)context, l.t0, l.T, 0);
        this.r0 = k.b((TypedArray)context, l.f0, l.M, true);
        this.s0 = k.b((TypedArray)context, l.o0, l.P, true);
        this.u0 = k.b((TypedArray)context, l.n0, l.L, true);
        this.v0 = k.o((TypedArray)context, l.d0, l.U);
        n8 = l.a0;
        this.A0 = k.b((TypedArray)context, n8, n8, this.s0);
        n8 = l.b0;
        this.B0 = k.b((TypedArray)context, n8, n8, this.s0);
        n8 = l.c0;
        if (context.hasValue(n8)) {
            this.w0 = this.g0((TypedArray)context, n8);
        } else {
            n8 = l.V;
            if (context.hasValue(n8)) {
                this.w0 = this.g0((TypedArray)context, n8);
            }
        }
        this.G0 = k.b((TypedArray)context, l.p0, l.W, true);
        n8 = l.q0;
        this.C0 = bl = context.hasValue(n8);
        if (bl) {
            this.D0 = k.b((TypedArray)context, n8, l.Y, true);
        }
        this.E0 = k.b((TypedArray)context, l.i0, l.Z, false);
        n8 = l.j0;
        this.z0 = k.b((TypedArray)context, n8, n8, true);
        n8 = l.e0;
        this.F0 = k.b((TypedArray)context, n8, n8, false);
        context.recycle();
    }

    private void Q0(SharedPreferences.Editor editor) {
        if (this.c0.t()) {
            editor.apply();
        }
    }

    private void R0() {
        String string = this.v0;
        if (string != null && (string = this.r(string)) != null) {
            super.S0(this);
        }
    }

    private void S0(Preference preference) {
        List<Preference> list = this.K0;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void q() {
        this.J();
        if (this.P0() && this.L().contains(this.n0)) {
            this.n0(true, null);
            return;
        }
        Object object = this.w0;
        if (object != null) {
            this.n0(false, object);
        }
    }

    private void u0() {
        if (TextUtils.isEmpty((CharSequence)this.v0)) {
            return;
        }
        Object object = this.r(this.v0);
        if (object != null) {
            super.v0(this);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Dependency \"");
        ((StringBuilder)object).append(this.v0);
        ((StringBuilder)object).append("\" not found for preference \"");
        ((StringBuilder)object).append(this.n0);
        ((StringBuilder)object).append("\" (title: \"");
        ((StringBuilder)object).append((Object)this.j0);
        ((StringBuilder)object).append("\"");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private void v0(Preference preference) {
        if (this.K0 == null) {
            this.K0 = new ArrayList<Preference>();
        }
        this.K0.add(preference);
        preference.e0(this, this.O0());
    }

    private void z0(View view, boolean bl) {
        view.setEnabled(bl);
        if (view instanceof ViewGroup) {
            view = (ViewGroup)view;
            for (int i8 = view.getChildCount() - 1; i8 >= 0; --i8) {
                this.z0(view.getChildAt(i8), bl);
            }
        }
    }

    public Intent A() {
        return this.o0;
    }

    public void A0(int n8) {
        this.B0(a.b(this.q, n8));
        this.l0 = n8;
    }

    public String B() {
        return this.n0;
    }

    public void B0(Drawable drawable) {
        if (this.m0 != drawable) {
            this.m0 = drawable;
            this.l0 = 0;
            this.W();
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

    public void D0(String string) {
        this.n0 = string;
        if (this.t0 && !this.Q()) {
            this.w0();
        }
    }

    public PreferenceGroup E() {
        return this.L0;
    }

    public void E0(int n8) {
        this.H0 = n8;
    }

    protected boolean F(boolean bl) {
        if (!this.P0()) {
            return bl;
        }
        this.J();
        return this.c0.l().getBoolean(this.n0, bl);
    }

    final void F0(c c8) {
        this.J0 = c8;
    }

    protected int G(int n8) {
        if (!this.P0()) {
            return n8;
        }
        this.J();
        return this.c0.l().getInt(this.n0, n8);
    }

    public void G0(d d8) {
        this.f0 = d8;
    }

    protected String H(String string) {
        if (!this.P0()) {
            return string;
        }
        this.J();
        return this.c0.l().getString(this.n0, string);
    }

    public void H0(e e8) {
        this.g0 = e8;
    }

    public Set<String> I(Set<String> set) {
        if (!this.P0()) {
            return set;
        }
        this.J();
        return this.c0.l().getStringSet(this.n0, set);
    }

    public void I0(int n8) {
        if (n8 != this.h0) {
            this.h0 = n8;
            this.Y();
        }
    }

    public ax.b2.d J() {
        androidx.preference.g g8 = this.c0;
        if (g8 != null) {
            g8.j();
        }
        return null;
    }

    public void J0(CharSequence charSequence) {
        if (this.N() == null) {
            if (!TextUtils.equals((CharSequence)this.k0, (CharSequence)charSequence)) {
                this.k0 = charSequence;
                this.W();
            }
            return;
        }
        throw new IllegalStateException("Preference already has a SummaryProvider set.");
    }

    public androidx.preference.g K() {
        return this.c0;
    }

    public final void K0(g g8) {
        this.P0 = g8;
        this.W();
    }

    public SharedPreferences L() {
        if (this.c0 != null) {
            this.J();
            return this.c0.l();
        }
        return null;
    }

    public void L0(int n8) {
        this.M0(this.q.getString(n8));
    }

    public CharSequence M() {
        if (this.N() != null) {
            return this.N().a(this);
        }
        return this.k0;
    }

    public void M0(CharSequence charSequence) {
        if (!TextUtils.equals((CharSequence)charSequence, (CharSequence)this.j0)) {
            this.j0 = charSequence;
            this.W();
        }
    }

    public final g N() {
        return this.P0;
    }

    public final void N0(boolean bl) {
        if (this.z0 != bl) {
            this.z0 = bl;
            c c8 = this.J0;
            if (c8 != null) {
                c8.d(this);
            }
        }
    }

    public CharSequence O() {
        return this.j0;
    }

    public boolean O0() {
        return this.S() ^ true;
    }

    public final int P() {
        return this.I0;
    }

    protected boolean P0() {
        return this.c0 != null && this.T() && this.Q();
    }

    public boolean Q() {
        return TextUtils.isEmpty((CharSequence)this.n0) ^ true;
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
        c c8 = this.J0;
        if (c8 != null) {
            c8.f(this);
        }
    }

    public void X(boolean bl) {
        List<Preference> list = this.K0;
        if (list != null) {
            int n8 = list.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                list.get(i8).e0(this, bl);
            }
        }
    }

    protected void Y() {
        c c8 = this.J0;
        if (c8 != null) {
            c8.a(this);
        }
    }

    public void Z() {
        this.u0();
    }

    protected void a0(androidx.preference.g g8) {
        this.c0 = g8;
        if (!this.e0) {
            this.d0 = g8.f();
        }
        this.q();
    }

    protected void b0(androidx.preference.g g8, long l8) {
        this.d0 = l8;
        this.e0 = true;
        try {
            this.a0(g8);
            return;
        }
        finally {
            this.e0 = false;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void c0(h var1_1) {
        var8_2 = var1_1.a;
        var8_2.setOnClickListener(this.Q0);
        var8_2.setId(this.i0);
        var6_3 = (TextView)var1_1.N(0x1020010);
        var3_4 = 8;
        if (var6_3 == null) ** GOTO lbl14
        var7_5 = this.M();
        if (!TextUtils.isEmpty((CharSequence)var7_5)) {
            var6_3.setText(var7_5);
            var6_3.setVisibility(0);
            var6_3 = var6_3.getCurrentTextColor();
        } else {
            var6_3.setVisibility(8);
lbl14:
            // 2 sources

            var6_3 = null;
        }
        var7_5 = (TextView)var1_1.N(16908310);
        if (var7_5 != null) {
            var9_6 = this.O();
            if (!TextUtils.isEmpty((CharSequence)var9_6)) {
                var7_5.setText(var9_6);
                var7_5.setVisibility(0);
                if (this.C0) {
                    var7_5.setSingleLine(this.D0);
                }
                if (!this.U() && this.S() && var6_3 != null) {
                    var7_5.setTextColor(var6_3.intValue());
                }
            } else {
                var7_5.setVisibility(8);
            }
        }
        if ((var6_3 = (ImageView)var1_1.N(16908294)) != null) {
            var2_7 = this.l0;
            if (var2_7 != 0 || this.m0 != null) {
                if (this.m0 == null) {
                    this.m0 = a.b(this.q, var2_7);
                }
                if ((var7_5 = this.m0) != null) {
                    var6_3.setImageDrawable((Drawable)var7_5);
                }
            }
            if (this.m0 != null) {
                var6_3.setVisibility(0);
            } else {
                var2_7 = this.E0 != false ? 4 : 8;
                var6_3.setVisibility(var2_7);
            }
        }
        var7_5 = var1_1.N(ax.b2.h.a);
        var6_3 = var7_5;
        if (var7_5 == null) {
            var6_3 = var1_1.N(16908350);
        }
        if (var6_3 != null) {
            if (this.m0 != null) {
                var6_3.setVisibility(0);
            } else {
                var2_7 = var3_4;
                if (this.E0) {
                    var2_7 = 4;
                }
                var6_3.setVisibility(var2_7);
            }
        }
        if (this.G0) {
            this.z0(var8_2, this.S());
        } else {
            this.z0(var8_2, true);
        }
        var5_8 = this.U();
        var8_2.setFocusable(var5_8);
        var8_2.setClickable(var5_8);
        var1_1.R(this.A0);
        var1_1.S(this.B0);
        var4_9 = this.R();
        if (var4_9 && this.O0 == null) {
            this.O0 = new f(this);
        }
        var1_1 = var4_9 != false ? this.O0 : null;
        var8_2.setOnCreateContextMenuListener((View.OnCreateContextMenuListener)var1_1);
        var8_2.setLongClickable(var4_9);
        if (var4_9 && !var5_8) {
            ax.c0.d0.o0(var8_2, null);
        }
    }

    void d(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.L0 != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.L0 = preferenceGroup;
    }

    protected void d0() {
    }

    public void e0(Preference preference, boolean bl) {
        if (this.x0 == bl) {
            this.x0 = bl ^ true;
            this.X(this.O0());
            this.W();
        }
    }

    public void f0() {
        this.R0();
        this.M0 = true;
    }

    protected Object g0(TypedArray typedArray, int n8) {
        return null;
    }

    public boolean h(Object object) {
        d d8 = this.f0;
        return d8 == null || d8.a(this, object);
        {
        }
    }

    @Deprecated
    public void h0(H h8) {
    }

    public void i0(Preference preference, boolean bl) {
        if (this.y0 == bl) {
            this.y0 = bl ^ true;
            this.X(this.O0());
            this.W();
        }
    }

    final void j() {
        this.M0 = false;
    }

    protected void j0() {
        this.R0();
    }

    protected void k0(Parcelable parcelable) {
        this.N0 = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public int l(Preference preference) {
        int n8 = this.h0;
        int n9 = preference.h0;
        if (n8 != n9) {
            return n8 - n9;
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

    protected void m0(Object object) {
    }

    void n(Bundle bundle) {
        if (this.Q() && (bundle = bundle.getParcelable(this.n0)) != null) {
            this.N0 = false;
            this.k0((Parcelable)bundle);
            if (!this.N0) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    @Deprecated
    protected void n0(boolean bl, Object object) {
        this.m0(object);
    }

    public void o0() {
        if (this.S() && this.U()) {
            this.d0();
            Object object = this.g0;
            if (!(object != null && object.a(this) || (object = this.K()) != null && (object = ((androidx.preference.g)object).h()) != null && object.U(this) || this.o0 == null)) {
                this.s().startActivity(this.o0);
            }
        }
    }

    void p(Bundle bundle) {
        if (this.Q()) {
            this.N0 = false;
            Parcelable parcelable = this.l0();
            if (this.N0) {
                if (parcelable != null) {
                    bundle.putParcelable(this.n0, parcelable);
                    return;
                }
            } else {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
        }
    }

    protected void p0(View view) {
        this.o0();
    }

    protected boolean q0(boolean bl) {
        if (!this.P0()) {
            return false;
        }
        if (bl == this.F(bl ^ true)) {
            return true;
        }
        this.J();
        SharedPreferences.Editor editor = this.c0.e();
        editor.putBoolean(this.n0, bl);
        this.Q0(editor);
        return true;
    }

    protected <T extends Preference> T r(String string) {
        androidx.preference.g g8 = this.c0;
        if (g8 == null) {
            return null;
        }
        return g8.a(string);
    }

    protected boolean r0(int n8) {
        if (!this.P0()) {
            return false;
        }
        if (n8 == this.G(~n8)) {
            return true;
        }
        this.J();
        SharedPreferences.Editor editor = this.c0.e();
        editor.putInt(this.n0, n8);
        this.Q0(editor);
        return true;
    }

    public Context s() {
        return this.q;
    }

    protected boolean s0(String string) {
        if (!this.P0()) {
            return false;
        }
        if (TextUtils.equals((CharSequence)string, (CharSequence)this.H(null))) {
            return true;
        }
        this.J();
        SharedPreferences.Editor editor = this.c0.e();
        editor.putString(this.n0, string);
        this.Q0(editor);
        return true;
    }

    public Bundle t() {
        if (this.q0 == null) {
            this.q0 = new Bundle();
        }
        return this.q0;
    }

    public boolean t0(Set<String> set) {
        if (!this.P0()) {
            return false;
        }
        if (set.equals(this.I(null))) {
            return true;
        }
        this.J();
        SharedPreferences.Editor editor = this.c0.e();
        editor.putStringSet(this.n0, set);
        this.Q0(editor);
        return true;
    }

    public String toString() {
        return this.u().toString();
    }

    StringBuilder u() {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = this.O();
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            stringBuilder.append(charSequence);
            stringBuilder.append(' ');
        }
        if (!TextUtils.isEmpty((CharSequence)(charSequence = this.M()))) {
            stringBuilder.append(charSequence);
            stringBuilder.append(' ');
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder;
    }

    public String w() {
        return this.p0;
    }

    void w0() {
        if (!TextUtils.isEmpty((CharSequence)this.n0)) {
            this.t0 = true;
            return;
        }
        throw new IllegalStateException("Preference does not have a key assigned.");
    }

    long x() {
        return this.d0;
    }

    public void x0(Bundle bundle) {
        this.n(bundle);
    }

    public void y0(Bundle bundle) {
        this.p(bundle);
    }

    public static class b
    extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>(){

            public b a(Parcel parcel) {
                return new b(parcel);
            }

            public b[] b(int n8) {
                return new b[n8];
            }
        };

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static interface c {
        public void a(Preference var1);

        public void d(Preference var1);

        public void f(Preference var1);
    }

    public static interface d {
        public boolean a(Preference var1, Object var2);
    }

    public static interface e {
        public boolean a(Preference var1);
    }

    private static class f
    implements View.OnCreateContextMenuListener,
    MenuItem.OnMenuItemClickListener {
        private final Preference a;

        f(Preference preference) {
            this.a = preference;
        }

        public void onCreateContextMenu(ContextMenu contextMenu, View object, ContextMenu.ContextMenuInfo contextMenuInfo) {
            object = this.a.M();
            if (this.a.R() && !TextUtils.isEmpty((CharSequence)object)) {
                contextMenu.setHeaderTitle((CharSequence)object);
                contextMenu.add(0, 0, 0, j.a).setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)this);
            }
        }

        public boolean onMenuItemClick(MenuItem object) {
            ClipboardManager clipboardManager = (ClipboardManager)this.a.s().getSystemService("clipboard");
            object = this.a.M();
            clipboardManager.setPrimaryClip(ClipData.newPlainText((CharSequence)"Preference", (CharSequence)object));
            Toast.makeText((Context)this.a.s(), (CharSequence)this.a.s().getString(j.d, new Object[]{object}), (int)0).show();
            return true;
        }
    }

    public static interface g<T extends Preference> {
        public CharSequence a(T var1);
    }
}

