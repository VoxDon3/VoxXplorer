package ax.k9;

import java.io.IOException;

/* renamed from: ax.k9.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2415c extends IOException {
    public static final ax.a9.c<C2415c> q = new a();

    /* renamed from: ax.k9.c$a */
    class a implements ax.a9.c<C2415c> {
        a() {
        }

        @Override // ax.a9.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2415c a(Throwable th) {
            return th instanceof C2415c ? (C2415c) th : new C2415c(th);
        }
    }

    public C2415c(String str) {
        super(str);
    }

    public C2415c(Throwable th) {
        super(th);
    }
}
