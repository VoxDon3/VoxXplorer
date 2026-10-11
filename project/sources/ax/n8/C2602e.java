package ax.n8;

/* renamed from: ax.n8.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2602e {
    public static /* synthetic */ int a(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
