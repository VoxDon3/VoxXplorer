/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import ax.O.e;
import ax.c0.d0;
import ax.d0.H;
import ax.d0.K;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class a {
    private static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate b;

    public a() {
        this(c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a(this);
    }

    static List<H.a> c(View object) {
        List list = (List)object.getTag(e.H);
        object = list;
        if (list == null) {
            object = Collections.EMPTY_LIST;
        }
        return object;
    }

    private boolean e(ClickableSpan clickableSpan, View clickableSpanArray) {
        if (clickableSpan != null) {
            clickableSpanArray = H.r(clickableSpanArray.createAccessibilityNodeInfo().getText());
            for (int i8 = 0; clickableSpanArray != null && i8 < clickableSpanArray.length; ++i8) {
                if (!clickableSpan.equals(clickableSpanArray[i8])) continue;
                return true;
            }
        }
        return false;
    }

    private boolean k(int n8, View view) {
        Object object = (SparseArray)view.getTag(e.I);
        if (object != null && (object = (WeakReference)object.get(n8)) != null && this.e((ClickableSpan)(object = (ClickableSpan)((Reference)object).get()), view)) {
            object.onClick(view);
            return true;
        }
        return false;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public K b(View view) {
        if ((view = this.a.getAccessibilityNodeProvider(view)) != null) {
            return new K(view);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, H h8) {
        this.a.onInitializeAccessibilityNodeInfo(view, h8.P0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int n8, Bundle bundle) {
        boolean bl;
        List<H.a> list = ax.c0.a.c(view);
        boolean bl2 = false;
        int n9 = 0;
        while (true) {
            bl = bl2;
            if (n9 >= list.size()) break;
            H.a a8 = list.get(n9);
            if (a8.b() == n8) {
                bl = a8.d(view, bundle);
                break;
            }
            ++n9;
        }
        bl2 = bl;
        if (!bl) {
            bl2 = this.a.performAccessibilityAction(view, n8, bundle);
        }
        if (!bl2 && n8 == e.a && bundle != null) {
            return this.k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return bl2;
    }

    public void l(View view, int n8) {
        this.a.sendAccessibilityEvent(view, n8);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    static final class a
    extends View.AccessibilityDelegate {
        final a a;

        a(a a8) {
            this.a = a8;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View object) {
            if ((object = this.a.b((View)object)) != null) {
                return (AccessibilityNodeProvider)((K)object).e();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View object, AccessibilityNodeInfo accessibilityNodeInfo) {
            H h8 = H.Q0(accessibilityNodeInfo);
            h8.F0(d0.T((View)object));
            h8.w0(d0.P((View)object));
            h8.B0(d0.p((View)object));
            h8.L0(d0.H((View)object));
            this.a.g((View)object, h8);
            h8.f(accessibilityNodeInfo.getText(), (View)object);
            object = ax.c0.a.c((View)object);
            for (int i8 = 0; i8 < object.size(); ++i8) {
                h8.b((H.a)object.get(i8));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int n8, Bundle bundle) {
            return this.a.j(view, n8, bundle);
        }

        public void sendAccessibilityEvent(View view, int n8) {
            this.a.l(view, n8);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.m(view, accessibilityEvent);
        }
    }
}

