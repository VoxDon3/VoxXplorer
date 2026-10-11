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
import ax.i0.AbstractC2201a;
import ax.k0.AbstractC2357a;
import ax.m.C2506a;
import ax.s.InterfaceC3035b;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class SearchView extends B implements InterfaceC3035b {
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
    AbstractC2201a M;
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

    public static class SearchAutoComplete extends C0573d {
        private int e;
        private SearchView f;
        private boolean g;
        final Runnable h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C2506a.p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.e0.c(this);
                return;
            }
            a.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        void c() {
            if (this.g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0573d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                removeCallbacks(this.h);
                post(this.h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f.P();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                if (SearchView.I(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.g = true;
                    return;
                }
                this.g = false;
                removeCallbacks(this.h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.h = new a();
            this.e = getThreshold();
        }
    }

    static class a {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    private static class e {
        private Method a;
        private Method b;
        private Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        e() {
            this.a = null;
            this.b = null;
            this.c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class f extends AbstractC2357a {
        public static final Parcelable.Creator<f> CREATOR = new a();
        boolean d0;

        class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.d0 + "}";
        }

        @Override // ax.k0.AbstractC2357a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.d0));
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d0 = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class g extends TouchDelegate {
        private final View a;
        private final Rect b;
        private final Rect c;
        private final Rect d;
        private final int e;
        private boolean f;

        public g(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i = this.e;
            rect3.inset(-i, -i);
            this.c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.b.contains(x, y)) {
                    this.f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            if (!z || this.c.contains(x, y)) {
                Rect rect = this.c;
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
            }
            return this.a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        e0 = Build.VERSION.SDK_INT < 29 ? new e() : null;
    }

    private Intent B(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.T);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.a0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.W.getSearchActivity());
        return intent;
    }

    private void C() {
        this.p.dismissDropDown();
    }

    private void E(View view, Rect rect) {
        view.getLocationInWindow(this.z);
        getLocationInWindow(this.A);
        int[] iArr = this.z;
        int i = iArr[1];
        int[] iArr2 = this.A;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    private CharSequence F(CharSequence charSequence) {
        if (!this.K || this.C == null) {
            return charSequence;
        }
        int textSize = (int) (this.p.getTextSize() * 1.25d);
        this.C.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.C), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean G() {
        SearchableInfo searchableInfo = this.W;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.W.getVoiceSearchLaunchWebSearch() ? this.F : this.W.getVoiceSearchLaunchRecognizer() ? this.G : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean I(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean J() {
        return (this.N || this.S) && !H();
    }

    private void Q() {
        post(this.b0);
    }

    private void S() {
        boolean isEmpty = TextUtils.isEmpty(this.p.getText());
        this.u.setVisibility(!isEmpty || (this.K && !this.U) ? 0 : 8);
        Drawable drawable = this.u.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void T() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.p;
        if (queryHint == null) {
            queryHint = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        searchAutoComplete.setHint(F(queryHint));
    }

    private void U() {
        this.p.setThreshold(this.W.getSuggestThreshold());
        this.p.setImeOptions(this.W.getImeOptions());
        int inputType = this.W.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.W.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.p.setInputType(inputType);
        AbstractC2201a abstractC2201a = this.M;
        if (abstractC2201a != null) {
            abstractC2201a.a(null);
        }
        if (this.W.getSuggestAuthority() != null) {
            G g2 = new G(getContext(), this, this.W, this.d0);
            this.M = g2;
            this.p.setAdapter(g2);
            ((G) this.M).x(this.P ? 2 : 1);
        }
    }

    private void V() {
        this.r.setVisibility((J() && (this.t.getVisibility() == 0 || this.v.getVisibility() == 0)) ? 0 : 8);
    }

    private void W(boolean z) {
        this.t.setVisibility((this.N && J() && hasFocus() && (z || !this.S)) ? 0 : 8);
    }

    private void X(boolean z) {
        this.L = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.p.getText());
        this.s.setVisibility(i2);
        W(!isEmpty);
        this.q.setVisibility(z ? 8 : 0);
        if (this.B.getDrawable() != null && !this.K) {
            i = 0;
        }
        this.B.setVisibility(i);
        S();
        Y(isEmpty);
        V();
    }

    private void Y(boolean z) {
        int i = 8;
        if (this.S && !H() && z) {
            this.t.setVisibility(8);
            i = 0;
        }
        this.v.setVisibility(i);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(ax.m.d.e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(ax.m.d.f);
    }

    private void setQuery(CharSequence charSequence) {
        this.p.setText(charSequence);
        this.p.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void D() {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(this.p);
            return;
        }
        e eVar = e0;
        eVar.b(this.p);
        eVar.a(this.p);
    }

    public boolean H() {
        return this.L;
    }

    void K(int i, String str, String str2) {
        getContext().startActivity(B("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    void L() {
        if (!TextUtils.isEmpty(this.p.getText())) {
            this.p.setText(HttpUrl.FRAGMENT_ENCODE_SET);
            this.p.requestFocus();
            this.p.setImeVisibility(true);
        } else if (this.K) {
            clearFocus();
            X(true);
        }
    }

    protected void M(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void N() {
        X(false);
        this.p.requestFocus();
        this.p.setImeVisibility(true);
        View.OnClickListener onClickListener = this.J;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void O() {
        Editable text = this.p.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.W != null) {
            K(0, null, text.toString());
        }
        this.p.setImeVisibility(false);
        C();
    }

    void P() {
        X(H());
        Q();
        if (this.p.hasFocus()) {
            D();
        }
    }

    public void R(CharSequence charSequence, boolean z) {
        this.p.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.p;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.T = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        O();
    }

    @Override // ax.s.InterfaceC3035b
    public void c() {
        if (this.U) {
            return;
        }
        this.U = true;
        int imeOptions = this.p.getImeOptions();
        this.V = imeOptions;
        this.p.setImeOptions(imeOptions | 33554432);
        this.p.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.Q = true;
        super.clearFocus();
        this.p.clearFocus();
        this.p.setImeVisibility(false);
        this.Q = false;
    }

    @Override // ax.s.InterfaceC3035b
    public void f() {
        R(HttpUrl.FRAGMENT_ENCODE_SET, false);
        clearFocus();
        X(true);
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
        SearchableInfo searchableInfo = this.W;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.H : getContext().getText(this.W.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.E;
    }

    int getSuggestionRowLayout() {
        return this.D;
    }

    public AbstractC2201a getSuggestionsAdapter() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.b0);
        post(this.c0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.B, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            E(this.p, this.x);
            Rect rect = this.y;
            Rect rect2 = this.x;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            g gVar = this.w;
            if (gVar != null) {
                gVar.a(this.y, this.x);
                return;
            }
            g gVar2 = new g(this.y, this.x, this.p);
            this.w = gVar2;
            setTouchDelegate(gVar2);
        }
    }

    @Override // androidx.appcompat.widget.B, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        if (H()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.R;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.R;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.R) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        X(fVar.d0);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.d0 = H();
        return fVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.Q || !isFocusable()) {
            return false;
        }
        if (H()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.p.requestFocus(i, rect);
        if (requestFocus) {
            X(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.a0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            L();
        } else {
            N();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.K == z) {
            return;
        }
        this.K = z;
        X(z);
        T();
    }

    public void setImeOptions(int i) {
        this.p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.R = i;
        requestLayout();
    }

    public void setOnCloseListener(b bVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.I = onFocusChangeListener;
    }

    public void setOnQueryTextListener(c cVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.J = onClickListener;
    }

    public void setOnSuggestionListener(d dVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.O = charSequence;
        T();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.P = z;
        AbstractC2201a abstractC2201a = this.M;
        if (abstractC2201a instanceof G) {
            ((G) abstractC2201a).x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.W = searchableInfo;
        if (searchableInfo != null) {
            U();
            T();
        }
        boolean G = G();
        this.S = G;
        if (G) {
            this.p.setPrivateImeOptions("nm");
        }
        X(H());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.N = z;
        X(H());
    }

    public void setSuggestionsAdapter(AbstractC2201a abstractC2201a) {
        this.M = abstractC2201a;
        this.p.setAdapter(abstractC2201a);
    }
}
