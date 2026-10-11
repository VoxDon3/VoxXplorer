package ax.U9;

import android.os.AsyncTask;

/* loaded from: classes3.dex */
class z extends AsyncTask<Void, Void, Void> {
    private final c a;
    private f b;
    private t c;
    private final y d;

    public z(y yVar) {
        if (yVar == null) {
            throw new AssertionError();
        }
        this.a = new c();
        this.d = yVar;
    }

    public void a(s sVar) {
        this.a.a(sVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void doInBackground(Void... voidArr) {
        try {
            this.c = this.d.b();
            return null;
        } catch (f e) {
            this.b = e;
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void r2) {
        super.onPostExecute(r2);
        t tVar = this.c;
        if (tVar != null) {
            this.a.c(tVar);
            return;
        }
        f fVar = this.b;
        if (fVar != null) {
            this.a.b(fVar);
        } else {
            this.a.b(new f("An error occured on the client during the operation."));
        }
    }
}
