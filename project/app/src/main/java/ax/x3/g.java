/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.view.View;
import android.widget.AbsListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class g
implements SwipeRefreshLayout.i {
    @Override
    public boolean a(SwipeRefreshLayout swipeRefreshLayout, View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof AbsListView) {
            return ((AbsListView)view).canScrollList(-1);
        }
        return view.canScrollVertically(-1);
    }
}

