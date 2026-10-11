/*
 * Decompiled with CFR 0.152.
 */
package ax.h0;

import android.view.View;
import android.widget.ListView;
import ax.h0.a;

public class f
extends a {
    private final ListView s;

    public f(ListView listView) {
        super((View)listView);
        this.s = listView;
    }

    @Override
    public boolean a(int n8) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(int n8) {
        ListView listView = this.s;
        int n9 = listView.getCount();
        if (n9 == 0) {
            return false;
        }
        int n10 = listView.getChildCount();
        int n11 = listView.getFirstVisiblePosition();
        if (n8 > 0) {
            if (n11 + n10 < n9 || listView.getChildAt(n10 - 1).getBottom() > listView.getHeight()) return true;
            return false;
        }
        if (n8 >= 0) return false;
        if (n11 > 0 || listView.getChildAt(0).getTop() < 0) return true;
        return false;
    }

    @Override
    public void j(int n8, int n9) {
        this.s.scrollListBy(n9);
    }
}

