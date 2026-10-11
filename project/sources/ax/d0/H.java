package ax.d0;

import android.R;
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
import ax.d0.M;
import j$.time.Duration;
import j$.time.TimeConversions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public class H {
    private static int d;
    private final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

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
        public static final a e = new a(1, null);
        public static final a f = new a(2, null);
        public static final a g = new a(4, null);
        public static final a h = new a(8, null);
        public static final a i = new a(16, null);
        public static final a j = new a(32, null);
        public static final a k = new a(64, null);
        public static final a l = new a(128, null);
        public static final a m = new a(256, (CharSequence) null, (Class<? extends M.a>) M.b.class);
        public static final a n = new a(512, (CharSequence) null, (Class<? extends M.a>) M.b.class);
        public static final a o = new a(1024, (CharSequence) null, (Class<? extends M.a>) M.c.class);
        public static final a p = new a(2048, (CharSequence) null, (Class<? extends M.a>) M.c.class);
        public static final a q = new a(4096, null);
        public static final a r = new a(8192, null);
        public static final a s = new a(Http2.INITIAL_MAX_FRAME_SIZE, null);
        public static final a t = new a(32768, null);
        public static final a u = new a(65536, null);
        public static final a v = new a(131072, (CharSequence) null, (Class<? extends M.a>) M.g.class);
        public static final a w = new a(262144, null);
        public static final a x = new a(524288, null);
        public static final a y = new a(1048576, null);
        public static final a z = new a(2097152, (CharSequence) null, (Class<? extends M.a>) M.h.class);
        final Object a;
        private final int b;
        private final Class<? extends M.a> c;
        protected final M d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction33;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction34;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction35;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction36;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                accessibilityAction36 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
                accessibilityAction = accessibilityAction36;
            } else {
                accessibilityAction = null;
            }
            A = new a(accessibilityAction, R.id.accessibilityActionShowOnScreen, null, null, null);
            if (i2 >= 23) {
                accessibilityAction35 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction2 = accessibilityAction35;
            } else {
                accessibilityAction2 = null;
            }
            B = new a(accessibilityAction2, R.id.accessibilityActionScrollToPosition, null, null, M.e.class);
            if (i2 >= 23) {
                accessibilityAction34 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction3 = accessibilityAction34;
            } else {
                accessibilityAction3 = null;
            }
            C = new a(accessibilityAction3, R.id.accessibilityActionScrollUp, null, null, null);
            if (i2 >= 23) {
                accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction4 = accessibilityAction33;
            } else {
                accessibilityAction4 = null;
            }
            D = new a(accessibilityAction4, R.id.accessibilityActionScrollLeft, null, null, null);
            if (i2 >= 23) {
                accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                accessibilityAction5 = accessibilityAction32;
            } else {
                accessibilityAction5 = null;
            }
            E = new a(accessibilityAction5, R.id.accessibilityActionScrollDown, null, null, null);
            if (i2 >= 23) {
                accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction6 = accessibilityAction31;
            } else {
                accessibilityAction6 = null;
            }
            F = new a(accessibilityAction6, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            if (i2 >= 29) {
                accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction7 = accessibilityAction30;
            } else {
                accessibilityAction7 = null;
            }
            H = new a(accessibilityAction7, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            if (i2 >= 29) {
                accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction8 = accessibilityAction29;
            } else {
                accessibilityAction8 = null;
            }
            J = new a(accessibilityAction8, R.id.accessibilityActionPageRight, null, null, null);
            if (i2 >= 23) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction9 = accessibilityAction28;
            } else {
                accessibilityAction9 = null;
            }
            K = new a(accessibilityAction9, R.id.accessibilityActionContextClick, null, null, null);
            if (i2 >= 24) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction10 = accessibilityAction27;
            } else {
                accessibilityAction10 = null;
            }
            L = new a(accessibilityAction10, R.id.accessibilityActionSetProgress, null, null, M.f.class);
            if (i2 >= 26) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction11 = accessibilityAction26;
            } else {
                accessibilityAction11 = null;
            }
            M = new a(accessibilityAction11, R.id.accessibilityActionMoveWindow, null, null, M.d.class);
            if (i2 >= 28) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction12 = accessibilityAction25;
            } else {
                accessibilityAction12 = null;
            }
            N = new a(accessibilityAction12, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i2 >= 28) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction13 = accessibilityAction24;
            } else {
                accessibilityAction13 = null;
            }
            O = new a(accessibilityAction13, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i2 >= 30) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction14 = accessibilityAction23;
            } else {
                accessibilityAction14 = null;
            }
            P = new a(accessibilityAction14, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i2 >= 30) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction15 = accessibilityAction22;
            } else {
                accessibilityAction15 = null;
            }
            Q = new a(accessibilityAction15, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            if (i2 >= 32) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction16 = accessibilityAction21;
            } else {
                accessibilityAction16 = null;
            }
            S = new a(accessibilityAction16, R.id.accessibilityActionDragDrop, null, null, null);
            if (i2 >= 32) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction17 = accessibilityAction20;
            } else {
                accessibilityAction17 = null;
            }
            T = new a(accessibilityAction17, R.id.accessibilityActionDragCancel, null, null, null);
            if (i2 >= 33) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction18 = accessibilityAction19;
            } else {
                accessibilityAction18 = null;
            }
            U = new a(accessibilityAction18, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i2 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, charSequence, null, null);
        }

        public a a(CharSequence charSequence, M m2) {
            return new a(null, this.b, charSequence, m2, this.c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            M.a newInstance;
            if (this.d == null) {
                return false;
            }
            Class<? extends M.a> cls = this.c;
            M.a aVar = null;
            if (cls != null) {
                try {
                    newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    newInstance.a(bundle);
                    aVar = newInstance;
                } catch (Exception e3) {
                    e = e3;
                    aVar = newInstance;
                    Class<? extends M.a> cls2 = this.c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    return this.d.a(view, aVar);
                }
            }
            return this.d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.a;
            return obj2 == null ? aVar.a == null : obj2.equals(aVar.a);
        }

        public int hashCode() {
            Object obj = this.a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String j2 = H.j(this.b);
            if (j2.equals("ACTION_UNKNOWN") && c() != null) {
                j2 = c().toString();
            }
            sb.append(j2);
            return sb.toString();
        }

        public a(int i2, CharSequence charSequence, M m2) {
            this(null, i2, charSequence, m2, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i2, CharSequence charSequence, Class<? extends M.a> cls) {
            this(null, i2, charSequence, null, cls);
        }

        a(Object obj, int i2, CharSequence charSequence, M m2, Class<? extends M.a> cls) {
            this.b = i2;
            this.d = m2;
            if (obj == null) {
                this.a = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.a = obj;
            }
            this.c = cls;
        }
    }

    private static class b {
        public static Object a(int i, float f, float f2, float f3) {
            return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static f a(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static H b(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return H.R0(accessibilityNodeInfo.getChild(i, i2));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static H f(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return H.R0(accessibilityNodeInfo.getParent(i));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
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
            Duration convert;
            convert = TimeConversions.convert(accessibilityNodeInfo.getMinDurationBetweenContentChanges());
            return convert.toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(TimeConversions.convert(Duration.ofMillis(j)));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }
    }

    public static class e {
        final Object a;

        e(Object obj) {
            this.a = obj;
        }

        public static e a(int i, int i2, boolean z, int i3) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class f {
        final Object a;

        f(Object obj) {
            this.a = obj;
        }

        public static f a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    @Deprecated
    public H(Object obj) {
        this.a = (AccessibilityNodeInfo) obj;
    }

    private boolean F() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int G(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public static H Q0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new H(accessibilityNodeInfo);
    }

    static H R0(Object obj) {
        if (obj != null) {
            return new H(obj);
        }
        return null;
    }

    public static H Z() {
        return Q0(AccessibilityNodeInfo.obtain());
    }

    public static H a0(View view) {
        return Q0(AccessibilityNodeInfo.obtain(view));
    }

    public static H b0(H h) {
        return Q0(AccessibilityNodeInfo.obtain(h.a));
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    private void f0(View view) {
        SparseArray<WeakReference<ClickableSpan>> z = z(view);
        if (z != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < z.size(); i++) {
                if (z.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                z.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    private void g() {
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private List<Integer> h(String str) {
        ArrayList<Integer> integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private void h0(int i, boolean z) {
        Bundle v = v();
        if (v != null) {
            int i2 = v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            v.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    static String j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean l(int i) {
        Bundle v = v();
        return v != null && (v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> x(View view) {
        SparseArray<WeakReference<ClickableSpan>> z = z(view);
        if (z != null) {
            return z;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(ax.O.e.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> z(View view) {
        return (SparseArray) view.getTag(ax.O.e.I);
    }

    public CharSequence A() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void A0(CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public CharSequence B() {
        if (!F()) {
            return this.a.getText();
        }
        List<Integer> h = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new C1866a(h4.get(i).intValue(), this, v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    public void B0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setPaneTitle(charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public CharSequence C() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT < 28) {
            return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        tooltipText = this.a.getTooltipText();
        return tooltipText;
    }

    public void C0(View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public String D() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.a) : this.a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void D0(View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public String E() {
        return this.a.getViewIdResourceName();
    }

    public void E0(CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public void F0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(z);
        } else {
            h0(1, z);
        }
    }

    public void G0(boolean z) {
        this.a.setScrollable(z);
    }

    public boolean H() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.a) : l(64);
    }

    public void H0(boolean z) {
        this.a.setSelected(z);
    }

    public boolean I() {
        return this.a.isAccessibilityFocused();
    }

    public void I0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(z);
        } else {
            h0(4, z);
        }
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

    public void K0(View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public boolean L() {
        return this.a.isClickable();
    }

    public void L0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.a, charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean M() {
        boolean isContextClickable;
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        isContextClickable = this.a.isContextClickable();
        return isContextClickable;
    }

    public void M0(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public boolean N() {
        return this.a.isEnabled();
    }

    public void N0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.a.setTraversalAfter(view);
        }
    }

    public boolean O() {
        return this.a.isFocusable();
    }

    public void O0(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public boolean P() {
        return this.a.isFocused();
    }

    public AccessibilityNodeInfo P0() {
        return this.a;
    }

    public boolean Q() {
        return l(67108864);
    }

    public boolean R() {
        boolean isImportantForAccessibility;
        if (Build.VERSION.SDK_INT < 24) {
            return true;
        }
        isImportantForAccessibility = this.a.isImportantForAccessibility();
        return isImportantForAccessibility;
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
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT < 26) {
            return l(4);
        }
        isShowingHintText = this.a.isShowingHintText();
        return isShowingHintText;
    }

    public boolean X() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.a) : l(8388608);
    }

    public boolean Y() {
        return this.a.isVisibleToUser();
    }

    public void a(int i) {
        this.a.addAction(i);
    }

    public void b(a aVar) {
        this.a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public void c(View view) {
        this.a.addChild(view);
    }

    public boolean c0(int i, Bundle bundle) {
        return this.a.performAction(i, bundle);
    }

    public void d(View view, int i) {
        this.a.addChild(view, i);
    }

    public boolean e0(a aVar) {
        return this.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H)) {
            return false;
        }
        H h = (H) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (h.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(h.a)) {
            return false;
        }
        return this.c == h.c && this.b == h.b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            f0(view);
            ClickableSpan[] r = r(charSequence);
            if (r == null || r.length <= 0) {
                return;
            }
            v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", ax.O.e.a);
            SparseArray<WeakReference<ClickableSpan>> x = x(view);
            for (int i = 0; i < r.length; i++) {
                int G = G(r[i], x);
                x.put(G, new WeakReference<>(r[i]));
                e(r[i], (Spanned) charSequence, G);
            }
        }
    }

    public void g0(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.a.getActionList();
        if (actionList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i)));
        }
        return arrayList;
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

    public void k0(boolean z) {
        this.a.setCheckable(z);
    }

    public void l0(boolean z) {
        this.a.setChecked(z);
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

    public void n0(boolean z) {
        this.a.setClickable(z);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.a, rect);
            return;
        }
        Rect rect2 = (Rect) this.a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0(Object obj) {
        this.a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).a);
    }

    public int p() {
        return this.a.getChildCount();
    }

    public void p0(Object obj) {
        this.a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).a);
    }

    public CharSequence q() {
        return this.a.getClassName();
    }

    public void q0(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public void r0(boolean z) {
        this.a.setDismissable(z);
    }

    public CharSequence s() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.a) : this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void s0(boolean z) {
        this.a.setEnabled(z);
    }

    public CharSequence t() {
        return this.a.getContentDescription();
    }

    public void t0(CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb.append("; boundsInParent: " + rect);
        n(rect);
        sb.append("; boundsInScreen: " + rect);
        o(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(y());
        sb.append("; className: ");
        sb.append(q());
        sb.append("; text: ");
        sb.append(B());
        sb.append("; error: ");
        sb.append(u());
        sb.append("; maxTextLength: ");
        sb.append(w());
        sb.append("; stateDescription: ");
        sb.append(A());
        sb.append("; contentDescription: ");
        sb.append(t());
        sb.append("; tooltipText: ");
        sb.append(C());
        sb.append("; viewIdResName: ");
        sb.append(E());
        sb.append("; uniqueId: ");
        sb.append(D());
        sb.append("; checkable: ");
        sb.append(J());
        sb.append("; checked: ");
        sb.append(K());
        sb.append("; focusable: ");
        sb.append(O());
        sb.append("; focused: ");
        sb.append(P());
        sb.append("; selected: ");
        sb.append(V());
        sb.append("; clickable: ");
        sb.append(L());
        sb.append("; longClickable: ");
        sb.append(S());
        sb.append("; contextClickable: ");
        sb.append(M());
        sb.append("; enabled: ");
        sb.append(N());
        sb.append("; password: ");
        sb.append(T());
        sb.append("; scrollable: " + U());
        sb.append("; containerTitle: ");
        sb.append(s());
        sb.append("; granularScrollingSupported: ");
        sb.append(Q());
        sb.append("; importantForAccessibility: ");
        sb.append(R());
        sb.append("; visible: ");
        sb.append(Y());
        sb.append("; isTextSelectable: ");
        sb.append(X());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(H());
        sb.append("; [");
        List<a> i = i();
        for (int i2 = 0; i2 < i.size(); i2++) {
            a aVar = i.get(i2);
            String j = j(aVar.b());
            if (j.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                j = aVar.c().toString();
            }
            sb.append(j);
            if (i2 != i.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public CharSequence u() {
        return this.a.getError();
    }

    public void u0(boolean z) {
        this.a.setFocusable(z);
    }

    public Bundle v() {
        return this.a.getExtras();
    }

    public void v0(boolean z) {
        this.a.setFocused(z);
    }

    public int w() {
        return this.a.getMaxTextLength();
    }

    public void w0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(z);
        } else {
            h0(2, z);
        }
    }

    public void x0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a.setHintText(charSequence);
        } else {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence y() {
        return this.a.getPackageName();
    }

    public void y0(View view) {
        this.a.setLabelFor(view);
    }

    public void z0(int i) {
        this.a.setMaxTextLength(i);
    }

    private H(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    @Deprecated
    public void d0() {
    }
}
