package ax.u3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import ax.c3.AbstractC1823k;
import ax.c3.C1832u;
import com.voxdon.xplorer.file.AbstractC3595n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.u3.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3203u {
    public static boolean a(List<AbstractC3595n> list) {
        if (list == null) {
            return false;
        }
        for (AbstractC3595n abstractC3595n : list) {
            if (abstractC3595n.isDirectory() || !ax.Q2.f.Y(abstractC3595n.P())) {
                return false;
            }
        }
        return true;
    }

    public static ClipData b(List<AbstractC3595n> list, AbstractC3595n abstractC3595n) {
        if (list.size() <= 1) {
            return new ClipData(abstractC3595n.B(), new String[]{abstractC3595n.s()}, new ClipData.Item(C1832u.v((AbstractC1823k) abstractC3595n)));
        }
        HashSet hashSet = new HashSet();
        Iterator<AbstractC3595n> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().s());
        }
        String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
        Iterator<AbstractC3595n> it2 = list.iterator();
        ClipData clipData = null;
        while (it2.hasNext()) {
            ClipData.Item item = new ClipData.Item(C1832u.v((AbstractC1823k) it2.next()));
            if (clipData == null) {
                clipData = new ClipData(abstractC3595n.B(), strArr, item);
            } else {
                clipData.addItem(item);
            }
        }
        return clipData;
    }

    public static void c(Context context, ClipData clipData) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(clipData);
    }
}
