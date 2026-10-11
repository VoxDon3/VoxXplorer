package ax.r4;

import android.os.AsyncTask;
import android.util.Log;
import ax.p4.C2771h;
import ax.p4.C2773j;
import ax.p4.C2774k;
import ax.p4.l;
import ax.p4.m;

/* renamed from: ax.r4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC2955f extends AsyncTask<Void, Void, C2771h> {
    public static final a f = new a(null);
    private static final String g;
    private final String a;
    private final l b;
    private final m c;
    private final String d;
    private final C2774k e;

    /* renamed from: ax.r4.f$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    static {
        String simpleName = AsyncTaskC2955f.class.getSimpleName();
        ax.Gb.l.e(simpleName, "getSimpleName(...)");
        g = simpleName;
    }

    public AsyncTaskC2955f(String str, l lVar, m mVar, String str2, C2774k c2774k) {
        ax.Gb.l.f(str, "code");
        ax.Gb.l.f(lVar, "mPKCEManager");
        ax.Gb.l.f(mVar, "requestConfig");
        ax.Gb.l.f(str2, "appKey");
        ax.Gb.l.f(c2774k, "host");
        this.a = str;
        this.b = lVar;
        this.c = mVar;
        this.d = str2;
        this.e = c2774k;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2771h doInBackground(Void... voidArr) {
        ax.Gb.l.f(voidArr, "params");
        try {
            return this.b.d(this.c, this.a, this.d, null, this.e);
        } catch (C2773j e) {
            Log.e(g, "Token Request Failed: " + e.getMessage());
            return null;
        }
    }
}
