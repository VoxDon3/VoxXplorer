package ax.x3;

import android.view.View;
import android.widget.AbsListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: ax.x3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3421g implements SwipeRefreshLayout.i {
    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.i
    public boolean a(SwipeRefreshLayout swipeRefreshLayout, View view) {
        if (view == null) {
            return false;
        }
        return view instanceof AbsListView ? ((AbsListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }
}
