/*
 * Decompiled with CFR 0.152.
 */
package ax.d0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import ax.d0.A;
import ax.d0.B;
import ax.d0.C;
import ax.d0.D;
import ax.d0.E;
import ax.d0.F;
import ax.d0.G;
import ax.d0.I;
import ax.d0.J;
import ax.d0.M;
import ax.d0.g;
import ax.d0.h;
import ax.d0.i;
import ax.d0.j;
import ax.d0.k;
import ax.d0.l;
import ax.d0.m;
import ax.d0.n;
import ax.d0.o;
import ax.d0.p;
import ax.d0.q;
import ax.d0.r;
import ax.d0.s;
import ax.d0.t;
import ax.d0.u;
import ax.d0.v;
import ax.d0.w;
import ax.d0.x;
import ax.d0.y;
import ax.d0.z;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class H {
    private static int d;
    private final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    private H(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    @Deprecated
    public H(Object object) {
        this.a = (AccessibilityNodeInfo)object;
    }

    private boolean F() {
        return this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
    }

    private int G(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        int n8;
        if (sparseArray != null) {
            for (n8 = 0; n8 < sparseArray.size(); ++n8) {
                if (!clickableSpan.equals((ClickableSpan)((WeakReference)sparseArray.valueAt(n8)).get())) continue;
                return sparseArray.keyAt(n8);
            }
        }
        n8 = d;
        d = n8 + 1;
        return n8;
    }

    public static H Q0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new H(accessibilityNodeInfo);
    }

    static H R0(Object object) {
        if (object != null) {
            return new H(object);
        }
        return null;
    }

    public static H Z() {
        return H.Q0(AccessibilityNodeInfo.obtain());
    }

    public static H a0(View view) {
        return H.Q0(AccessibilityNodeInfo.obtain((View)view));
    }

    public static H b0(H h8) {
        return H.Q0(AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)h8.a));
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int n8) {
        this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(spanned.getSpanStart((Object)clickableSpan));
        this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(spanned.getSpanEnd((Object)clickableSpan));
        this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(spanned.getSpanFlags((Object)clickableSpan));
        this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(n8);
    }

    private void f0(View sparseArray) {
        if ((sparseArray = this.z((View)sparseArray)) != null) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            int n8 = 0;
            int n9 = 0;
            while (true) {
                if (n9 >= sparseArray.size()) break;
                if (((WeakReference)sparseArray.valueAt(n9)).get() == null) {
                    arrayList.add(n9);
                }
                ++n9;
            }
            for (int i8 = n8; i8 < arrayList.size(); ++i8) {
                sparseArray.remove(((Integer)arrayList.get(i8)).intValue());
            }
        }
    }

    private void g() {
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> h(String string) {
        ArrayList arrayList;
        ArrayList arrayList2 = arrayList = this.a.getExtras().getIntegerArrayList(string);
        if (arrayList == null) {
            arrayList2 = new ArrayList();
            this.a.getExtras().putIntegerArrayList(string, arrayList2);
        }
        return arrayList2;
    }

    private void h0(int n8, boolean bl) {
        Bundle bundle = this.v();
        if (bundle != null) {
            int n9 = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            int n10 = bl ? n8 : 0;
            bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", n10 | n9 & ~n8);
        }
    }

    static String j(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                switch (n8) {
                    default: {
                        switch (n8) {
                            default: {
                                switch (n8) {
                                    default: {
                                        switch (n8) {
                                            default: {
                                                return "ACTION_UNKNOWN";
                                            }
                                            case 16908375: {
                                                return "ACTION_DRAG_CANCEL";
                                            }
                                            case 16908374: {
                                                return "ACTION_DRAG_DROP";
                                            }
                                            case 16908373: {
                                                return "ACTION_DRAG_START";
                                            }
                                            case 16908372: 
                                        }
                                        return "ACTION_IME_ENTER";
                                    }
                                    case 16908362: {
                                        return "ACTION_PRESS_AND_HOLD";
                                    }
                                    case 16908361: {
                                        return "ACTION_PAGE_RIGHT";
                                    }
                                    case 16908360: {
                                        return "ACTION_PAGE_LEFT";
                                    }
                                    case 16908359: {
                                        return "ACTION_PAGE_DOWN";
                                    }
                                    case 16908358: {
                                        return "ACTION_PAGE_UP";
                                    }
                                    case 16908357: {
                                        return "ACTION_HIDE_TOOLTIP";
                                    }
                                    case 16908356: 
                                }
                                return "ACTION_SHOW_TOOLTIP";
                            }
                            case 16908349: {
                                return "ACTION_SET_PROGRESS";
                            }
                            case 16908348: {
                                return "ACTION_CONTEXT_CLICK";
                            }
                            case 16908347: {
                                return "ACTION_SCROLL_RIGHT";
                            }
                            case 16908346: {
                                return "ACTION_SCROLL_DOWN";
                            }
                            case 16908345: {
                                return "ACTION_SCROLL_LEFT";
                            }
                            case 16908344: {
                                return "ACTION_SCROLL_UP";
                            }
                            case 16908343: {
                                return "ACTION_SCROLL_TO_POSITION";
                            }
                            case 16908342: 
                        }
                        return "ACTION_SHOW_ON_SCREEN";
                    }
                    case 16908382: {
                        return "ACTION_SCROLL_IN_DIRECTION";
                    }
                    case 16908354: {
                        return "ACTION_MOVE_WINDOW";
                    }
                    case 0x200000: {
                        return "ACTION_SET_TEXT";
                    }
                    case 524288: {
                        return "ACTION_COLLAPSE";
                    }
                    case 262144: {
                        return "ACTION_EXPAND";
                    }
                    case 131072: {
                        return "ACTION_SET_SELECTION";
                    }
                    case 65536: {
                        return "ACTION_CUT";
                    }
                    case 32768: {
                        return "ACTION_PASTE";
                    }
                    case 16384: {
                        return "ACTION_COPY";
                    }
                    case 8192: {
                        return "ACTION_SCROLL_BACKWARD";
                    }
                    case 4096: {
                        return "ACTION_SCROLL_FORWARD";
                    }
                    case 2048: {
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    }
                    case 1024: {
                        return "ACTION_NEXT_HTML_ELEMENT";
                    }
                    case 512: {
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    }
                    case 256: {
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    }
                    case 128: {
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    }
                    case 64: {
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    }
                    case 32: {
                        return "ACTION_LONG_CLICK";
                    }
                    case 16: {
                        return "ACTION_CLICK";
                    }
                    case 8: {
                        return "ACTION_CLEAR_SELECTION";
                    }
                    case 4: 
                }
                return "ACTION_SELECT";
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    private boolean l(int n8) {
        Bundle bundle = this.v();
        if (bundle == null) {
            return false;
        }
        return (bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & n8) == n8;
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[])((Spanned)charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> x(View view) {
        SparseArray sparseArray;
        SparseArray sparseArray2 = sparseArray = this.z(view);
        if (sparseArray == null) {
            sparseArray2 = new SparseArray();
            view.setTag(ax.O.e.I, (Object)sparseArray2);
        }
        return sparseArray2;
    }

    private SparseArray<WeakReference<ClickableSpan>> z(View view) {
        return (SparseArray)view.getTag(ax.O.e.I);
    }

    public CharSequence A() {
        if (Build.VERSION.SDK_INT >= 30) {
            return ax.d0.H$b.b(this.a);
        }
        return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void A0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public CharSequence B() {
        if (this.F()) {
            List<Integer> list = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> list2 = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> list3 = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> list4 = this.h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            CharSequence charSequence = this.a.getText();
            int n8 = this.a.getText().length();
            charSequence = new SpannableString((CharSequence)TextUtils.substring((CharSequence)charSequence, (int)0, (int)n8));
            for (int i8 = 0; i8 < list.size(); ++i8) {
                charSequence.setSpan((Object)new ax.d0.a(list4.get(i8), this, this.v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), list.get(i8), list2.get(i8), list3.get(i8));
            }
            return charSequence;
        }
        return this.a.getText();
    }

    public void B0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            ax.d0.f.a(this.a, charSequence);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
    }

    public CharSequence C() {
        if (Build.VERSION.SDK_INT >= 28) {
            return h.a(this.a);
        }
        return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void C0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public String D() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ax.d0.H$c.g(this.a);
        }
        return this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void D0(View view, int n8) {
        this.b = n8;
        this.a.setParent(view, n8);
    }

    public String E() {
        return this.a.getViewIdResourceName();
    }

    public void E0(CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void F0(boolean bl) {
        if (Build.VERSION.SDK_INT >= 28) {
            ax.d0.e.a(this.a, bl);
            return;
        }
        this.h0(1, bl);
    }

    public void G0(boolean bl) {
        this.a.setScrollable(bl);
    }

    public boolean H() {
        if (Build.VERSION.SDK_INT >= 34) {
            return ax.d0.H$d.f(this.a);
        }
        return this.l(64);
    }

    public void H0(boolean bl) {
        this.a.setSelected(bl);
    }

    public boolean I() {
        return this.a.isAccessibilityFocused();
    }

    public void I0(boolean bl) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.a(this.a, bl);
            return;
        }
        this.h0(4, bl);
    }

    public boolean J() {
        return this.a.isCheckable();
    }

    public void J0(View view) {
        this.c = -1;
        this.a.setSource(view);
    }

    public boolean K() {
        return this.a.isChecked();
    }

    public void K0(View view, int n8) {
        this.c = n8;
        this.a.setSource(view, n8);
    }

    public boolean L() {
        return this.a.isClickable();
    }

    public void L0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            ax.d0.H$b.c(this.a, charSequence);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
    }

    public boolean M() {
        if (Build.VERSION.SDK_INT >= 23) {
            return k.a(this.a);
        }
        return false;
    }

    public void M0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean N() {
        return this.a.isEnabled();
    }

    public void N0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            ax.d0.c.a(this.a, view);
        }
    }

    public boolean O() {
        return this.a.isFocusable();
    }

    public void O0(boolean bl) {
        this.a.setVisibleToUser(bl);
    }

    public boolean P() {
        return this.a.isFocused();
    }

    public AccessibilityNodeInfo P0() {
        return this.a;
    }

    public boolean Q() {
        return this.l(0x4000000);
    }

    public boolean R() {
        if (Build.VERSION.SDK_INT >= 24) {
            return ax.d0.d.a(this.a);
        }
        return true;
    }

    public boolean S() {
        return this.a.isLongClickable();
    }

    public boolean T() {
        return this.a.isPassword();
    }

    public boolean U() {
        return this.a.isScrollable();
    }

    public boolean V() {
        return this.a.isSelected();
    }

    public boolean W() {
        if (Build.VERSION.SDK_INT >= 26) {
            return l.a(this.a);
        }
        return this.l(4);
    }

    public boolean X() {
        if (Build.VERSION.SDK_INT >= 33) {
            return ax.d0.H$c.h(this.a);
        }
        return this.l(0x800000);
    }

    public boolean Y() {
        return this.a.isVisibleToUser();
    }

    public void a(int n8) {
        this.a.addAction(n8);
    }

    public void b(a a8) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction)a8.a);
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public boolean c0(int n8, Bundle bundle) {
        return this.a.performAction(n8, bundle);
    }

    public void d(View view, int n8) {
        this.a.addChild(view, n8);
    }

    @Deprecated
    public void d0() {
    }

    public boolean e0(a a8) {
        return this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction)a8.a);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof H)) {
            return false;
        }
        object = (H)object;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null ? ((H)object).a != null : !accessibilityNodeInfo.equals((Object)((H)object).a)) {
            return false;
        }
        if (this.c != ((H)object).c) {
            return false;
        }
        return this.b == ((H)object).b;
    }

    public void f(CharSequence charSequence, View sparseArray) {
        if (Build.VERSION.SDK_INT < 26) {
            this.g();
            this.f0((View)sparseArray);
            ClickableSpan[] clickableSpanArray = H.r(charSequence);
            if (clickableSpanArray != null && clickableSpanArray.length > 0) {
                this.v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", ax.O.e.a);
                sparseArray = this.x((View)sparseArray);
                for (int i8 = 0; i8 < clickableSpanArray.length; ++i8) {
                    int n8 = this.G(clickableSpanArray[i8], sparseArray);
                    sparseArray.put(n8, new WeakReference<ClickableSpan>(clickableSpanArray[i8]));
                    this.e(clickableSpanArray[i8], (Spanned)charSequence, n8);
                }
            }
        }
    }

    public void g0(boolean bl) {
        this.a.setAccessibilityFocused(bl);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List list = this.a.getActionList();
        if (list != null) {
            ArrayList<a> arrayList = new ArrayList<a>();
            int n8 = list.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                arrayList.add(new a(list.get(i8)));
            }
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    @Deprecated
    public void i0(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public void j0(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    @Deprecated
    public int k() {
        return this.a.getActions();
    }

    public void k0(boolean bl) {
        this.a.setCheckable(bl);
    }

    public void l0(boolean bl) {
        this.a.setChecked(bl);
    }

    @Deprecated
    public void m(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void m0(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void n(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void n0(boolean bl) {
        this.a.setClickable(bl);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            ax.d0.H$d.b(this.a, rect);
            return;
        }
        Rect rect2 = (Rect)this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0(Object object) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        object = object == null ? null : (AccessibilityNodeInfo.CollectionInfo)((e)object).a;
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)object);
    }

    public int p() {
        return this.a.getChildCount();
    }

    public void p0(Object object) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        object = object == null ? null : (AccessibilityNodeInfo.CollectionItemInfo)((f)object).a;
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)object);
    }

    public CharSequence q() {
        return this.a.getClassName();
    }

    public void q0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public void r0(boolean bl) {
        this.a.setDismissable(bl);
    }

    public CharSequence s() {
        if (Build.VERSION.SDK_INT >= 34) {
            return ax.d0.H$d.c(this.a);
        }
        return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void s0(boolean bl) {
        this.a.setEnabled(bl);
    }

    public CharSequence t() {
        return this.a.getContentDescription();
    }

    public void t0(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Object object = new Rect();
        this.m((Rect)object);
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("; boundsInParent: ");
        ((StringBuilder)charSequence).append(object);
        stringBuilder.append(((StringBuilder)charSequence).toString());
        this.n((Rect)object);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("; boundsInScreen: ");
        ((StringBuilder)charSequence).append(object);
        stringBuilder.append(((StringBuilder)charSequence).toString());
        this.o((Rect)object);
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("; boundsInWindow: ");
        ((StringBuilder)charSequence).append(object);
        stringBuilder.append(((StringBuilder)charSequence).toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.y());
        stringBuilder.append("; className: ");
        stringBuilder.append(this.q());
        stringBuilder.append("; text: ");
        stringBuilder.append(this.B());
        stringBuilder.append("; error: ");
        stringBuilder.append(this.u());
        stringBuilder.append("; maxTextLength: ");
        stringBuilder.append(this.w());
        stringBuilder.append("; stateDescription: ");
        stringBuilder.append(this.A());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(this.t());
        stringBuilder.append("; tooltipText: ");
        stringBuilder.append(this.C());
        stringBuilder.append("; viewIdResName: ");
        stringBuilder.append(this.E());
        stringBuilder.append("; uniqueId: ");
        stringBuilder.append(this.D());
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.J());
        stringBuilder.append("; checked: ");
        stringBuilder.append(this.K());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(this.O());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.P());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.V());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.L());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.S());
        stringBuilder.append("; contextClickable: ");
        stringBuilder.append(this.M());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(this.N());
        stringBuilder.append("; password: ");
        stringBuilder.append(this.T());
        object = new StringBuilder();
        ((StringBuilder)object).append("; scrollable: ");
        ((StringBuilder)object).append(this.U());
        stringBuilder.append(((StringBuilder)object).toString());
        stringBuilder.append("; containerTitle: ");
        stringBuilder.append(this.s());
        stringBuilder.append("; granularScrollingSupported: ");
        stringBuilder.append(this.Q());
        stringBuilder.append("; importantForAccessibility: ");
        stringBuilder.append(this.R());
        stringBuilder.append("; visible: ");
        stringBuilder.append(this.Y());
        stringBuilder.append("; isTextSelectable: ");
        stringBuilder.append(this.X());
        stringBuilder.append("; accessibilityDataSensitive: ");
        stringBuilder.append(this.H());
        stringBuilder.append("; [");
        List<a> list = this.i();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            a a8 = list.get(i8);
            charSequence = H.j(a8.b());
            object = charSequence;
            if (((String)charSequence).equals("ACTION_UNKNOWN")) {
                object = charSequence;
                if (a8.c() != null) {
                    object = a8.c().toString();
                }
            }
            stringBuilder.append((String)object);
            if (i8 == list.size() - 1) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public CharSequence u() {
        return this.a.getError();
    }

    public void u0(boolean bl) {
        this.a.setFocusable(bl);
    }

    public Bundle v() {
        return this.a.getExtras();
    }

    public void v0(boolean bl) {
        this.a.setFocused(bl);
    }

    public int w() {
        return this.a.getMaxTextLength();
    }

    public void w0(boolean bl) {
        if (Build.VERSION.SDK_INT >= 28) {
            g.a(this.a, bl);
            return;
        }
        this.h0(2, bl);
    }

    public void x0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            i.a(this.a, charSequence);
            return;
        }
        this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
    }

    public CharSequence y() {
        return this.a.getPackageName();
    }

    public void y0(View view) {
        this.a.setLabelFor(view);
    }

    public void z0(int n8) {
        this.a.setMaxTextLength(n8);
    }

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        final Object a;
        private final int b;
        private final Class<? extends M.a> c;
        protected final M d;

        static {
            Object var2 = null;
            e = new a(1, null);
            f = new a(2, null);
            g = new a(4, null);
            h = new a(8, null);
            i = new a(16, null);
            j = new a(32, null);
            k = new a(64, null);
            l = new a(128, null);
            m = new a(256, null, M.b.class);
            n = new a(512, null, M.b.class);
            o = new a(1024, null, M.c.class);
            p = new a(2048, null, M.c.class);
            q = new a(4096, null);
            r = new a(8192, null);
            s = new a(16384, null);
            t = new a(32768, null);
            u = new a(65536, null);
            v = new a(131072, null, M.g.class);
            w = new a(262144, null);
            x = new a(524288, null);
            y = new a(0x100000, null);
            z = new a(0x200000, null, M.h.class);
            int n8 = Build.VERSION.SDK_INT;
            Object object = n8 >= 23 ? ax.d0.m.a() : null;
            A = new a(object, 16908342, null, null, null);
            object = n8 >= 23 ? ax.d0.o.a() : null;
            B = new a(object, 16908343, null, null, M.e.class);
            object = n8 >= 23 ? ax.d0.q.a() : null;
            C = new a(object, 16908344, null, null, null);
            object = n8 >= 23 ? ax.d0.r.a() : null;
            D = new a(object, 16908345, null, null, null);
            object = n8 >= 23 ? ax.d0.s.a() : null;
            E = new a(object, 16908346, null, null, null);
            object = n8 >= 23 ? ax.d0.t.a() : null;
            F = new a(object, 16908347, null, null, null);
            object = n8 >= 29 ? ax.d0.u.a() : null;
            G = new a(object, 16908358, null, null, null);
            object = n8 >= 29 ? ax.d0.v.a() : null;
            H = new a(object, 16908359, null, null, null);
            object = n8 >= 29 ? ax.d0.w.a() : null;
            I = new a(object, 16908360, null, null, null);
            object = n8 >= 29 ? ax.d0.y.a() : null;
            J = new a(object, 16908361, null, null, null);
            object = n8 >= 23 ? ax.d0.x.a() : null;
            K = new a(object, 16908348, null, null, null);
            object = n8 >= 24 ? ax.d0.z.a() : null;
            L = new a(object, 16908349, null, null, M.f.class);
            object = n8 >= 26 ? ax.d0.A.a() : null;
            M = new a(object, 16908354, null, null, M.d.class);
            object = n8 >= 28 ? ax.d0.B.a() : null;
            N = new a(object, 16908356, null, null, null);
            object = n8 >= 28 ? ax.d0.C.a() : null;
            O = new a(object, 16908357, null, null, null);
            object = n8 >= 30 ? ax.d0.D.a() : null;
            P = new a(object, 16908362, null, null, null);
            object = n8 >= 30 ? ax.d0.E.a() : null;
            Q = new a(object, 16908372, null, null, null);
            object = n8 >= 32 ? ax.d0.F.a() : null;
            R = new a(object, 16908373, null, null, null);
            object = n8 >= 32 ? ax.d0.G.a() : null;
            S = new a(object, 16908374, null, null, null);
            object = n8 >= 32 ? ax.d0.n.a() : null;
            T = new a(object, 16908375, null, null, null);
            object = n8 >= 33 ? ax.d0.p.a() : null;
            U = new a(object, 16908376, null, null, null);
            object = var2;
            if (n8 >= 34) {
                object = ax.d0.H$d.a();
            }
            V = new a(object, 16908382, null, null, null);
        }

        public a(int n8, CharSequence charSequence) {
            this(null, n8, charSequence, null, null);
        }

        public a(int n8, CharSequence charSequence, M m8) {
            this(null, n8, charSequence, m8, null);
        }

        private a(int n8, CharSequence charSequence, Class<? extends M.a> clazz) {
            this(null, n8, charSequence, null, clazz);
        }

        a(Object object) {
            this(object, 0, null, null, null);
        }

        a(Object object, int n8, CharSequence charSequence, M m8, Class<? extends M.a> clazz) {
            this.b = n8;
            this.d = m8;
            this.a = object == null ? new AccessibilityNodeInfo.AccessibilityAction(n8, charSequence) : object;
            this.c = clazz;
        }

        public a a(CharSequence charSequence, M m8) {
            return new a(null, this.b, charSequence, m8, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getLabel();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean d(View view, Bundle object) {
            Object object3;
            Object object2;
            Serializable serializable;
            block4: {
                if (this.d == null) return false;
                serializable = this.c;
                object2 = null;
                object3 = null;
                if (serializable == null) return this.d.a(view, (M.a)object2);
                try {
                    object2 = ((Class)serializable).getDeclaredConstructor(null).newInstance(null);
                }
                catch (Exception exception) {
                    object = object3;
                    break block4;
                }
                try {
                    ((M.a)object2).a((Bundle)object);
                    return this.d.a(view, (M.a)object2);
                }
                catch (Exception exception) {
                    object = object2;
                    object2 = exception;
                }
            }
            object3 = this.c;
            object3 = object3 == null ? "null" : ((Class)object3).getName();
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append("Failed to execute command with argument class ViewCommandArgument: ");
            ((StringBuilder)serializable).append((String)object3);
            Log.e((String)"A11yActionCompat", (String)((StringBuilder)serializable).toString(), (Throwable)object2);
            object2 = object;
            return this.d.a(view, (M.a)object2);
        }

        public boolean equals(Object object) {
            if (object == null) {
                return false;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            Object object2 = this.a;
            return !(object2 == null ? ((a)object).a != null : !object2.equals(((a)object).a));
        }

        public int hashCode() {
            Object object = this.a;
            if (object != null) {
                return object.hashCode();
            }
            return 0;
        }

        public String toString() {
            String string;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AccessibilityActionCompat: ");
            String string2 = string = ax.d0.H.j(this.b);
            if (string.equals("ACTION_UNKNOWN")) {
                string2 = string;
                if (this.c() != null) {
                    string2 = this.c().toString();
                }
            }
            stringBuilder.append(string2);
            return stringBuilder.toString();
        }
    }

    private static class b {
        public static Object a(int n8, float f8, float f9, float f10) {
            return new AccessibilityNodeInfo.RangeInfo(n8, f8, f9, f10);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static f a(boolean bl, int n8, int n9, int n10, int n11, boolean bl2, String string, String string2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(bl).setColumnIndex(n8).setRowIndex(n9).setColumnSpan(n10).setRowSpan(n11).setSelected(bl2).setRowTitle(string).setColumnTitle(string2).build());
        }

        public static H b(AccessibilityNodeInfo accessibilityNodeInfo, int n8, int n9) {
            return H.R0(accessibilityNodeInfo.getChild(n8, n9));
        }

        public static String c(Object object) {
            return ((AccessibilityNodeInfo.CollectionItemInfo)object).getColumnTitle();
        }

        public static String d(Object object) {
            return ((AccessibilityNodeInfo.CollectionItemInfo)object).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static H f(AccessibilityNodeInfo accessibilityNodeInfo, int n8) {
            return H.R0(accessibilityNodeInfo.getParent(n8));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
            accessibilityNodeInfo.setTextSelectable(bl);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String string) {
            accessibilityNodeInfo.setUniqueId(string);
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return J.a(accessibilityNodeInfo).toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(bl);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long l8) {
            I.a(accessibilityNodeInfo, j.Duration.ofMillis((long)l8));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean bl) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, bl);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(bl);
        }
    }

    public static class e {
        final Object a;

        e(Object object) {
            this.a = object;
        }

        public static e a(int n8, int n9, boolean bl, int n10) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain((int)n8, (int)n9, (boolean)bl, (int)n10));
        }
    }

    public static class f {
        final Object a;

        f(Object object) {
            this.a = object;
        }

        public static f a(int n8, int n9, int n10, int n11, boolean bl, boolean bl2) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain((int)n8, (int)n9, (int)n10, (int)n11, (boolean)bl, (boolean)bl2));
        }
    }
}

