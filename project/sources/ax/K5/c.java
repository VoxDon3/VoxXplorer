package ax.K5;

import android.text.TextUtils;
import ax.J5.C0742c;
import ax.L5.C0790b;
import ax.M5.C0821p;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class c extends Exception {
    private final ax.B.a q;

    public c(ax.B.a aVar) {
        this.q = aVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C0790b c0790b : this.q.keySet()) {
            C0742c c0742c = (C0742c) C0821p.l((C0742c) this.q.get(c0790b));
            z &= !c0742c.C();
            arrayList.add(c0790b.b() + ": " + String.valueOf(c0742c));
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }
}
