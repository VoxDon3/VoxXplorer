package ax.A3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public class c extends ax.K0.b {
    private final Uri w;
    private final String[] x;

    public c(Context context, Uri uri, String[] strArr) {
        super(context);
        this.w = uri;
        this.x = strArr == null ? ax.B3.a.a : strArr;
    }

    @Override // ax.K0.a
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public Cursor I() {
        P(this.w.buildUpon().appendQueryParameter("contentType", "image/").build());
        O(this.x);
        return super.I();
    }
}
