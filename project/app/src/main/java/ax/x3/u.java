/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.widget.AbsListView;
import android.widget.ListAdapter;
import ax.Ha.b;
import ax.Ha.c;
import java.util.ArrayList;
import java.util.List;

public class u {
    public static <T> List<T> a(AbsListView absListView, ListAdapter listAdapter, boolean bl) {
        int n8;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (absListView.getCheckedItemCount() > 0) {
            Object object = absListView.getCheckedItemPositions();
            int n9 = 0;
            for (int i8 = 0; i8 < object.size(); ++i8) {
                n8 = n9;
                if (object.valueAt(i8)) {
                    if (object.keyAt(i8) >= listAdapter.getCount()) {
                        n8 = 1;
                    } else {
                        arrayList.add(listAdapter.getItem(object.keyAt(i8)));
                        n8 = n9;
                    }
                }
                n9 = n8;
            }
            if (n9 != 0) {
                object = c.h().f().d("GetCurrentSelectedFiles!").a("OutOfIndex");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(absListView.getCount());
                stringBuilder.append(":");
                stringBuilder.append(listAdapter.getCount());
                ((b)object).g(stringBuilder.toString()).h();
            }
        }
        if (bl && arrayList.size() == 0 && (n8 = absListView.getSelectedItemPosition()) != -1 && n8 < listAdapter.getCount()) {
            arrayList.add(listAdapter.getItem(n8));
        }
        return arrayList;
    }
}

