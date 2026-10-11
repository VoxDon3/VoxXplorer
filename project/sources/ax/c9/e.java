package ax.c9;

import java.io.IOException;

/* loaded from: classes3.dex */
public class e extends IOException {
    public static final ax.a9.c<e> q = new a();

    class a implements ax.a9.c<e> {
        a() {
        }

        @Override // ax.a9.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a(Throwable th) {
            return th instanceof e ? (e) th : new e(th);
        }
    }

    public e(Throwable th) {
        super(th);
    }

    public e(String str) {
        super(str);
    }

    public e(String str, Throwable th) {
        super(str, th);
    }
}
