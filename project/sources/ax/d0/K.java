package ax.d0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class K {
    private final Object a;

    static class a extends AccessibilityNodeProvider {
        final K a;

        a(K k) {
            this.a = k;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            H b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.P0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<H> c = this.a.c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).P0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            H d = this.a.d(i);
            if (d == null) {
                return null;
            }
            return d.P0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    static class b extends a {
        b(K k) {
            super(k);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, H.Q0(accessibilityNodeInfo), str, bundle);
        }
    }

    public K() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new b(this);
        } else {
            this.a = new a(this);
        }
    }

    public H b(int i) {
        return null;
    }

    public List<H> c(String str, int i) {
        return null;
    }

    public H d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }

    public K(Object obj) {
        this.a = obj;
    }

    public void a(int i, H h, String str, Bundle bundle) {
    }
}
