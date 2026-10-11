package ax.i8;

import ax.i8.i;

/* loaded from: classes3.dex */
public class k extends i {
    private final int c0;

    public k(int i, String str) {
        super(str);
        this.c0 = i;
    }

    public int a() {
        return this.c0;
    }

    public k(int i, String str, Throwable th) {
        super(str, th);
        this.c0 = i;
    }

    public k(String str, i.a aVar) {
        super(str, aVar);
        this.c0 = -1;
    }

    public k(int i, String str, i.a aVar) {
        super(str, aVar);
        this.c0 = i;
    }
}
