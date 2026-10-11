package ax.Ua;

/* loaded from: classes3.dex */
public class g extends ax.Ta.d {
    protected final ax.Va.a c0;
    protected final int q;

    public g(int i, ax.Va.a aVar) {
        this.q = i;
        this.c0 = aVar;
    }

    public int a() {
        return this.q;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "HttpCodeException{code=" + this.q + ", response=" + this.c0 + '}';
    }

    public g(int i) {
        this(i, null);
    }
}
