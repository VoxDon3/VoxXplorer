/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import ax.Q2.f;
import ax.c3.k;
import com.voxdon.xplorer.file.n;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class u {
    public static boolean a(List<n> object) {
        if (object == null) {
            return false;
        }
        object = object.iterator();
        while (object.hasNext()) {
            n n8 = (n)object.next();
            if (n8.isDirectory()) {
                return false;
            }
            if (f.Y(n8.P())) continue;
            return false;
        }
        return true;
    }

    public static ClipData b(List<n> item, n n8) {
        if (item.size() <= 1) {
            item = new ClipData.Item(ax.c3.u.v((k)n8));
            return new ClipData((CharSequence)n8.B(), new String[]{n8.s()}, item);
        }
        String[] stringArray = new HashSet();
        Iterator<n> iterator = item.iterator();
        while (iterator.hasNext()) {
            stringArray.add(iterator.next().s());
        }
        stringArray = stringArray.toArray(new String[stringArray.size()]);
        iterator = item.iterator();
        item = null;
        while (iterator.hasNext()) {
            ClipData.Item item2 = new ClipData.Item(ax.c3.u.v((k)iterator.next()));
            if (item == null) {
                item = new ClipData((CharSequence)n8.B(), stringArray, item2);
                continue;
            }
            item.addItem(item2);
        }
        return item;
    }

    public static void c(Context context, ClipData clipData) {
        ((ClipboardManager)context.getSystemService("clipboard")).setPrimaryClip(clipData);
    }
}

