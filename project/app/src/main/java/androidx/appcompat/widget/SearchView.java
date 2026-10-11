/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import androidx.appcompat.widget.B;
import androidx.appcompat.widget.G;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView
extends B
implements ax.s.b {
    static final e e0;
    private int[] A;
    private final ImageView B;
    private final Drawable C;
    private final int D;
    private final int E;
    private final Intent F;
    private final Intent G;
    private final CharSequence H;
    View.OnFocusChangeListener I;
    private View.OnClickListener J;
    private boolean K;
    private boolean L;
    ax.i0.a M;
    private boolean N;
    private CharSequence O;
    private boolean P;
    private boolean Q;
    private int R;
    private boolean S;
    private CharSequence T;
    private boolean U;
    private int V;
    SearchableInfo W;
    private Bundle a0;
    private final Runnable b0;
    private Runnable c0;
    private final WeakHashMap<String, Drawable.ConstantState> d0;
    final SearchAutoComplete p;
    private final View q;
    private final View r;
    final ImageView s;
    final ImageView t;
    final ImageView u;
    final ImageView v;
    private g w;
    private Rect x;
    private Rect y;
    private int[] z;

    static {
        e e8 = Build.VERSION.SDK_INT < 29 ? new e() : null;
        e0 = e8;
    }

    private Intent B(String string, Uri uri, String string2, String string3, int n8, String string4) {
        string = new Intent(string);
        string.addFlags(0x10000000);
        if (uri != null) {
            string.setData(uri);
        }
        string.putExtra("user_query", this.T);
        if (string3 != null) {
            string.putExtra("query", string3);
        }
        if (string2 != null) {
            string.putExtra("intent_extra_data_key", string2);
        }
        if ((uri = this.a0) != null) {
            string.putExtra("app_data", (Bundle)uri);
        }
        if (n8 != 0) {
            string.putExtra("action_key", n8);
            string.putExtra("action_msg", string4);
        }
        string.setComponent(this.W.getSearchActivity());
        return string;
    }

    private void C() {
        this.p.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.z);
        this.getLocationInWindow(this.A);
        int[] nArray = this.z;
        int n8 = nArray[1];
        int[] nArray2 = this.A;
        int n9 = n8 - nArray2[1];
        n8 = nArray[0] - nArray2[0];
        rect.set(n8, n9, view.getWidth() + n8, view.getHeight() + n9);
    }

    private CharSequence F(CharSequence charSequence) {
        if (this.K && this.C != null) {
            int n8 = (int)((double)this.p.getTextSize() * 1.25);
            this.C.setBounds(0, 0, n8, n8);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)"   ");
            spannableStringBuilder.setSpan((Object)new ImageSpan(this.C), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    private boolean G() {
        Object object = this.W;
        return object != null && object.getVoiceSearchEnabled() && (object = this.W.getVoiceSearchLaunchWebSearch() ? this.F : (this.W.getVoiceSearchLaunchRecognizer() ? this.G : null)) != null && this.getContext().getPackageManager().resolveActivity((Intent)object, 65536) != null;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.N || this.S) && !this.H();
    }

    private void Q() {
        this.post(this.b0);
    }

    private void S() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.p.getText());
        int n8 = 0;
        int n9 = bl && (!this.K || this.U) ? 0 : 1;
        Object object = this.u;
        n9 = n9 != 0 ? n8 : 8;
        object.setVisibility(n9);
        Drawable drawable = this.u.getDrawable();
        if (drawable != null) {
            object = !bl ? (Object)ViewGroup.ENABLED_STATE_SET : (Object)ViewGroup.EMPTY_STATE_SET;
            drawable.setState((int[])object);
        }
    }

    private void T() {
        CharSequence charSequence = this.getQueryHint();
        SearchAutoComplete searchAutoComplete = this.p;
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = "";
        }
        searchAutoComplete.setHint(this.F(charSequence2));
    }

    private void U() {
        this.p.setThreshold(this.W.getSuggestThreshold());
        this.p.setImeOptions(this.W.getImeOptions());
        int n8 = this.W.getInputType();
        int n9 = 1;
        int n10 = n8;
        if ((n8 & 0xF) == 1) {
            n10 = n8 &= 0xFFFEFFFF;
            if (this.W.getSuggestAuthority() != null) {
                n10 = n8 | 0x90000;
            }
        }
        this.p.setInputType(n10);
        ax.i0.a a8 = this.M;
        if (a8 != null) {
            a8.a(null);
        }
        if (this.W.getSuggestAuthority() != null) {
            this.M = a8 = new G(this.getContext(), this, this.W, this.d0);
            this.p.setAdapter((ListAdapter)a8);
            a8 = (G)this.M;
            n10 = n9;
            if (this.P) {
                n10 = 2;
            }
            ((G)a8).x(n10);
        }
    }

    private void V() {
        int n8 = this.J() && (this.t.getVisibility() == 0 || this.v.getVisibility() == 0) ? 0 : 8;
        this.r.setVisibility(n8);
    }

    private void W(boolean bl) {
        int n8 = this.N && this.J() && this.hasFocus() && (bl || !this.S) ? 0 : 8;
        this.t.setVisibility(n8);
    }

    private void X(boolean bl) {
        this.L = bl;
        int n8 = 8;
        int n9 = bl ? 0 : 8;
        boolean bl2 = TextUtils.isEmpty((CharSequence)this.p.getText());
        this.s.setVisibility(n9);
        this.W(bl2 ^ true);
        View view = this.q;
        n9 = bl ? 8 : 0;
        view.setVisibility(n9);
        n9 = n8;
        if (this.B.getDrawable() != null) {
            n9 = this.K ? n8 : 0;
        }
        this.B.setVisibility(n9);
        this.S();
        this.Y(bl2);
        this.V();
    }

    private void Y(boolean bl) {
        int n8;
        boolean bl2 = this.S;
        int n9 = n8 = 8;
        if (bl2) {
            n9 = n8;
            if (!this.H()) {
                n9 = n8;
                if (bl) {
                    this.t.setVisibility(8);
                    n9 = 0;
                }
            }
        }
        this.v.setVisibility(n9);
    }

    private int getPreferredHeight() {
        return this.getContext().getResources().getDimensionPixelSize(ax.m.d.e);
    }

    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(ax.m.d.f);
    }

    private void setQuery(CharSequence charSequence) {
        this.p.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.p;
        int n8 = TextUtils.isEmpty((CharSequence)charSequence) ? 0 : charSequence.length();
        searchAutoComplete.setSelection(n8);
    }

    void D() {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(this.p);
            return;
        }
        e e8 = e0;
        e8.b(this.p);
        e8.a(this.p);
    }

    public boolean H() {
        return this.L;
    }

    void K(int n8, String string, String string2) {
        string = this.B("android.intent.action.SEARCH", null, null, string2, n8, string);
        this.getContext().startActivity((Intent)string);
    }

    void L() {
        if (TextUtils.isEmpty((CharSequence)this.p.getText())) {
            if (this.K) {
                this.clearFocus();
                this.X(true);
            }
            return;
        }
        this.p.setText("");
        this.p.requestFocus();
        this.p.setImeVisibility(true);
    }

    protected void M(CharSequence charSequence) {
        this.setQuery(charSequence);
    }

    void N() {
        this.X(false);
        this.p.requestFocus();
        this.p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.J;
        if (onClickListener != null) {
            onClickListener.onClick((View)this);
        }
    }

    void O() {
        Editable editable = this.p.getText();
        if (editable != null && TextUtils.getTrimmedLength((CharSequence)editable) > 0) {
            if (this.W != null) {
                this.K(0, null, editable.toString());
            }
            this.p.setImeVisibility(false);
            this.C();
        }
    }

    void P() {
        this.X(this.H());
        this.Q();
        if (this.p.hasFocus()) {
            this.D();
        }
    }

    public void R(CharSequence charSequence, boolean bl) {
        this.p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.T = charSequence;
        }
        if (bl && !TextUtils.isEmpty((CharSequence)charSequence)) {
            this.O();
        }
    }

    @Override
    public void c() {
        int n8;
        if (this.U) {
            return;
        }
        this.U = true;
        this.V = n8 = this.p.getImeOptions();
        this.p.setImeOptions(n8 | 0x2000000);
        this.p.setText("");
        this.setIconified(false);
    }

    public void clearFocus() {
        this.Q = true;
        super.clearFocus();
        this.p.clearFocus();
        this.p.setImeVisibility(false);
        this.Q = false;
    }

    @Override
    public void f() {
        this.R("", false);
        this.clearFocus();
        this.X(true);
        this.p.setImeOptions(this.V);
        this.U = false;
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.R;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.O;
        if (charSequence != null) {
            return charSequence;
        }
        charSequence = this.W;
        if (charSequence != null && charSequence.getHintId() != 0) {
            return this.getContext().getText(this.W.getHintId());
        }
        return this.H;
    }

    int getSuggestionCommitIconResId() {
        return this.E;
    }

    int getSuggestionRowLayout() {
        return this.D;
    }

    public ax.i0.a getSuggestionsAdapter() {
        return this.M;
    }

    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.b0);
        this.post(this.c0);
        super.onDetachedFromWindow();
    }

    @Override
    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        if (bl) {
            this.E((View)this.p, this.x);
            Object object = this.y;
            Rect rect = this.x;
            object.set(rect.left, 0, rect.right, n11 - n9);
            object = this.w;
            if (object == null) {
                object = new g(this.y, this.x, (View)this.p);
                this.w = object;
                this.setTouchDelegate((TouchDelegate)object);
                return;
            }
            object.a(this.y, this.x);
        }
    }

    @Override
    protected void onMeasure(int n8, int n9) {
        if (this.H()) {
            super.onMeasure(n8, n9);
            return;
        }
        int n10 = View.MeasureSpec.getMode((int)n8);
        int n11 = View.MeasureSpec.getSize((int)n8);
        if (n10 != Integer.MIN_VALUE) {
            if (n10 != 0) {
                if (n10 != 0x40000000) {
                    n8 = n11;
                } else {
                    n10 = this.R;
                    n8 = n11;
                    if (n10 > 0) {
                        n8 = Math.min(n10, n11);
                    }
                }
            } else {
                n8 = this.R;
                if (n8 <= 0) {
                    n8 = this.getPreferredWidth();
                }
            }
        } else {
            n8 = this.R;
            n8 = n8 > 0 ? Math.min(n8, n11) : Math.min(this.getPreferredWidth(), n11);
        }
        n11 = View.MeasureSpec.getMode((int)n9);
        n9 = View.MeasureSpec.getSize((int)n9);
        if (n11 != Integer.MIN_VALUE) {
            if (n11 == 0) {
                n9 = this.getPreferredHeight();
            }
        } else {
            n9 = Math.min(this.getPreferredHeight(), n9);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n8, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)n9, (int)0x40000000));
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (f)parcelable;
        super.onRestoreInstanceState(parcelable.a());
        this.X(parcelable.d0);
        this.requestLayout();
    }

    protected Parcelable onSaveInstanceState() {
        f f8 = new f(super.onSaveInstanceState());
        f8.d0 = this.H();
        return f8;
    }

    public void onWindowFocusChanged(boolean bl) {
        super.onWindowFocusChanged(bl);
        this.Q();
    }

    public boolean requestFocus(int n8, Rect rect) {
        if (this.Q) {
            return false;
        }
        if (!this.isFocusable()) {
            return false;
        }
        if (!this.H()) {
            boolean bl = this.p.requestFocus(n8, rect);
            if (bl) {
                this.X(false);
            }
            return bl;
        }
        return super.requestFocus(n8, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.a0 = bundle;
    }

    public void setIconified(boolean bl) {
        if (bl) {
            this.L();
            return;
        }
        this.N();
    }

    public void setIconifiedByDefault(boolean bl) {
        if (this.K == bl) {
            return;
        }
        this.K = bl;
        this.X(bl);
        this.T();
    }

    public void setImeOptions(int n8) {
        this.p.setImeOptions(n8);
    }

    public void setInputType(int n8) {
        this.p.setInputType(n8);
    }

    public void setMaxWidth(int n8) {
        this.R = n8;
        this.requestLayout();
    }

    public void setOnCloseListener(b b8) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.I = onFocusChangeListener;
    }

    public void setOnQueryTextListener(c c8) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.J = onClickListener;
    }

    public void setOnSuggestionListener(d d8) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.O = charSequence;
        this.T();
    }

    public void setQueryRefinementEnabled(boolean bl) {
        this.P = bl;
        ax.i0.a a8 = this.M;
        if (a8 instanceof G) {
            a8 = (G)a8;
            int n8 = bl ? 2 : 1;
            ((G)a8).x(n8);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean bl;
        this.W = searchableInfo;
        if (searchableInfo != null) {
            this.U();
            this.T();
        }
        this.S = bl = this.G();
        if (bl) {
            this.p.setPrivateImeOptions("nm");
        }
        this.X(this.H());
    }

    public void setSubmitButtonEnabled(boolean bl) {
        this.N = bl;
        this.X(this.H());
    }

    public void setSuggestionsAdapter(ax.i0.a a8) {
        this.M = a8;
        this.p.setAdapter((ListAdapter)a8);
    }

    public static class SearchAutoComplete
    extends androidx.appcompat.widget.d {
        private int e;
        private SearchView f;
        private boolean g;
        final Runnable h = new Runnable(this){
            final SearchAutoComplete q;
            {
                this.q = searchAutoComplete;
            }

            @Override
            public void run() {
                this.q.c();
            }
        };

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, ax.m.a.p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int n8) {
            super(context, attributeSet, n8);
            this.e = this.getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = this.getResources().getConfiguration();
            int n8 = configuration.screenWidthDp;
            int n9 = configuration.screenHeightDp;
            if (n8 >= 960 && n9 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (n8 < 600 && (n8 < 640 || n9 < 480)) {
                return 160;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT >= 29) {
                a.b(this, 1);
                if (this.enoughToFilter()) {
                    this.showDropDown();
                }
                return;
            }
            e0.c(this);
        }

        void c() {
            if (this.g) {
                ((InputMethodManager)this.getContext().getSystemService("input_method")).showSoftInput((View)this, 0);
                this.g = false;
            }
        }

        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
            {
            }
        }

        @Override
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            editorInfo = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                this.removeCallbacks(this.h);
                this.post(this.h);
            }
            return editorInfo;
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
            this.setMinWidth((int)TypedValue.applyDimension((int)1, (float)this.getSearchViewTextMinWidthDp(), (DisplayMetrics)displayMetrics));
        }

        protected void onFocusChanged(boolean bl, int n8, Rect rect) {
            super.onFocusChanged(bl, n8, rect);
            this.f.P();
        }

        public boolean onKeyPreIme(int n8, KeyEvent keyEvent) {
            if (n8 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
                    if (dispatcherState != null) {
                        dispatcherState.startTracking(keyEvent, (Object)this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState dispatcherState = this.getKeyDispatcherState();
                    if (dispatcherState != null) {
                        dispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        this.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(n8, keyEvent);
        }

        public void onWindowFocusChanged(boolean bl) {
            super.onWindowFocusChanged(bl);
            if (bl && this.f.hasFocus() && this.getVisibility() == 0) {
                this.g = true;
                if (SearchView.I(this.getContext())) {
                    this.b();
                }
            }
        }

        public void performCompletion() {
        }

        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean bl) {
            InputMethodManager inputMethodManager = (InputMethodManager)this.getContext().getSystemService("input_method");
            if (!bl) {
                this.g = false;
                this.removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(this.getWindowToken(), 0);
                return;
            }
            if (inputMethodManager.isActive((View)this)) {
                this.g = false;
                this.removeCallbacks(this.h);
                inputMethodManager.showSoftInput((View)this, 0);
                return;
            }
            this.g = true;
        }

        void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        public void setThreshold(int n8) {
            super.setThreshold(n8);
            this.e = n8;
        }
    }

    static class a {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int n8) {
            searchAutoComplete.setInputMethodMode(n8);
        }
    }

    public static interface b {
    }

    public static interface c {
    }

    public static interface d {
    }

    private static class e {
        private Method a = null;
        private Method b = null;
        private Method c = null;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @SuppressLint(value={"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        e() {
            Method method;
            e.d();
            try {
                this.a = method = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            try {
                this.b = method = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                ((AccessibleObject)method).setAccessible(true);
            }
            catch (NoSuchMethodException noSuchMethodException) {}
            try {
                this.c = method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                ((AccessibleObject)method).setAccessible(true);
                return;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                return;
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void a(AutoCompleteTextView autoCompleteTextView) {
            e.d();
            Method method = this.b;
            if (method == null) return;
            try {
                method.invoke(autoCompleteTextView, null);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void b(AutoCompleteTextView autoCompleteTextView) {
            e.d();
            Method method = this.a;
            if (method == null) return;
            try {
                method.invoke(autoCompleteTextView, null);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void c(AutoCompleteTextView autoCompleteTextView) {
            e.d();
            Method method = this.c;
            if (method == null) return;
            try {
                method.invoke(autoCompleteTextView, Boolean.TRUE);
                return;
            }
            catch (Exception exception) {
                return;
            }
        }
    }

    static class f
    extends ax.k0.a {
        public static final Parcelable.Creator<f> CREATOR = new Parcelable.ClassLoaderCreator<f>(){

            public f a(Parcel parcel) {
                return new f(parcel, null);
            }

            public f b(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            public f[] c(int n8) {
                return new f[n8];
            }
        };
        boolean d0;

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = (Boolean)parcel.readValue(null);
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SearchView.SavedState{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" isIconified=");
            stringBuilder.append(this.d0);
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        @Override
        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeValue((Object)this.d0);
        }
    }

    private static class g
    extends TouchDelegate {
        private final View a;
        private final Rect b;
        private final Rect c;
        private final Rect d;
        private final int e;
        private boolean f;

        public g(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get((Context)view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            this.a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            rect = this.d;
            int n8 = this.e;
            rect.inset(-n8, -n8);
            this.c.set(rect2);
        }

        /*
         * Unable to fully structure code
         */
        public boolean onTouchEvent(MotionEvent var1_1) {
            block6: {
                block9: {
                    block7: {
                        block8: {
                            var4_2 = (int)var1_1.getX();
                            var3_3 = (int)var1_1.getY();
                            var2_4 = var1_1.getAction();
                            var5_5 = true;
                            if (var2_4 == 0) break block7;
                            if (var2_4 == 1 || var2_4 == 2) break block8;
                            if (var2_4 == 3) {
                                var5_5 = this.f;
                                this.f = false;
lbl10:
                                // 4 sources

                                while (true) {
                                    var2_4 = 1;
                                    break block6;
                                    break;
                                }
                            }
                            break block9;
                        }
                        var5_5 = var6_6 = this.f;
                        if (!var6_6) ** GOTO lbl10
                        var5_5 = var6_6;
                        if (this.d.contains(var4_2, var3_3)) ** GOTO lbl10
                        var5_5 = var6_6;
                        var2_4 = 0;
                        break block6;
                    }
                    if (this.b.contains(var4_2, var3_3)) {
                        this.f = true;
                        ** continue;
                    }
                }
                var2_4 = 1;
                var5_5 = false;
            }
            if (var5_5) {
                if (var2_4 != 0 && !this.c.contains(var4_2, var3_3)) {
                    var1_1.setLocation((float)(this.a.getWidth() / 2), (float)(this.a.getHeight() / 2));
                } else {
                    var7_7 = this.c;
                    var1_1.setLocation((float)(var4_2 - var7_7.left), (float)(var3_3 - var7_7.top));
                }
                return this.a.dispatchTouchEvent(var1_1);
            }
            return false;
        }
    }
}

