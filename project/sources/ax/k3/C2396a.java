package ax.k3;

/* renamed from: ax.k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2396a implements Comparable<C2396a> {
    public String c0;
    public String q;

    public C2396a(String str, String str2) {
        this.q = str;
        this.c0 = str2;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2396a c2396a) {
        return this.q.compareTo(c2396a.q);
    }
}
