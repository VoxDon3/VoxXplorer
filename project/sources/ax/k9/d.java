package ax.k9;

/* loaded from: classes3.dex */
public class d extends RuntimeException {
    public static final ax.a9.c<d> q = new a();

    class a implements ax.a9.c<d> {
        a() {
        }

        @Override // ax.a9.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(Throwable th) {
            return th instanceof d ? (d) th : new d(th);
        }
    }

    public d(Throwable th) {
        super(th);
    }

    public d(String str) {
        super(str);
    }

    public d(String str, Throwable th) {
        super(str, th);
    }
}
