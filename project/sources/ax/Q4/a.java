package ax.Q4;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {
    private static a b;
    private ArrayList<Pair<Uri, String>> a;

    public static a b() {
        if (b == null) {
            b = new a();
        }
        return b;
    }

    public void a() {
        this.a = null;
    }

    public ArrayList<Pair<Uri, String>> c() {
        ArrayList<Pair<Uri, String>> arrayList = this.a;
        this.a = null;
        return arrayList;
    }

    public void d(ArrayList<Pair<Uri, String>> arrayList) {
        this.a = arrayList;
    }
}
