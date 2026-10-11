/*
 * Decompiled with CFR 0.152.
 */
package ax.d0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import ax.d0.H;
import java.util.ArrayList;
import java.util.List;

public class K {
    private final Object a;

    public K() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new b(this);
            return;
        }
        this.a = new a(this);
    }

    public K(Object object) {
        this.a = object;
    }

    public void a(int n8, H h8, String string, Bundle bundle) {
    }

    public H b(int n8) {
        return null;
    }

    public List<H> c(String string, int n8) {
        return null;
    }

    public H d(int n8) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int n8, int n9, Bundle bundle) {
        return false;
    }

    static class a
    extends AccessibilityNodeProvider {
        final K a;

        a(K k8) {
            this.a = k8;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int n8) {
            H h8 = this.a.b(n8);
            if (h8 == null) {
                return null;
            }
            return h8.P0();
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String object, int n8) {
            if ((object = this.a.c((String)object, n8)) == null) {
                return null;
            }
            ArrayList<AccessibilityNodeInfo> arrayList = new ArrayList<AccessibilityNodeInfo>();
            int n9 = object.size();
            for (n8 = 0; n8 < n9; ++n8) {
                arrayList.add(((H)object.get(n8)).P0());
            }
            return arrayList;
        }

        public AccessibilityNodeInfo findFocus(int n8) {
            H h8 = this.a.d(n8);
            if (h8 == null) {
                return null;
            }
            return h8.P0();
        }

        public boolean performAction(int n8, int n9, Bundle bundle) {
            return this.a.f(n8, n9, bundle);
        }
    }

    static class b
    extends a {
        b(K k8) {
            super(k8);
        }

        public void addExtraDataToAccessibilityNodeInfo(int n8, AccessibilityNodeInfo accessibilityNodeInfo, String string, Bundle bundle) {
            this.a.a(n8, H.Q0(accessibilityNodeInfo), string, bundle);
        }
    }
}

