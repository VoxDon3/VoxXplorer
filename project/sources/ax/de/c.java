package ax.de;

/* loaded from: classes3.dex */
public class c {
    public static int a(long j) {
        int i = 0;
        do {
            i++;
            j >>= 7;
        } while (j != 0);
        return i;
    }
}
