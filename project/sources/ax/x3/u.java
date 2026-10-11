package ax.x3;

import android.util.SparseBooleanArray;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class u {
    public static <T> List<T> a(AbsListView absListView, ListAdapter listAdapter, boolean z) {
        int selectedItemPosition;
        ArrayList arrayList = new ArrayList();
        if (absListView.getCheckedItemCount() > 0) {
            SparseBooleanArray checkedItemPositions = absListView.getCheckedItemPositions();
            boolean z2 = false;
            for (int i = 0; i < checkedItemPositions.size(); i++) {
                if (checkedItemPositions.valueAt(i)) {
                    if (checkedItemPositions.keyAt(i) >= listAdapter.getCount()) {
                        z2 = true;
                    } else {
                        arrayList.add(listAdapter.getItem(checkedItemPositions.keyAt(i)));
                    }
                }
            }
            if (z2) {
                ax.Ha.c.h().f().d("GetCurrentSelectedFiles!").a("OutOfIndex").g(absListView.getCount() + ":" + listAdapter.getCount()).h();
            }
        }
        if (z && arrayList.size() == 0 && (selectedItemPosition = absListView.getSelectedItemPosition()) != -1 && selectedItemPosition < listAdapter.getCount()) {
            arrayList.add(listAdapter.getItem(selectedItemPosition));
        }
        return arrayList;
    }
}
