package ax.O6;

/* loaded from: classes3.dex */
public class f extends e {
    float a = -1.0f;

    @Override // ax.O6.e
    public void a(n nVar, float f, float f2, float f3) {
        float f4 = f3 * f2;
        nVar.o(0.0f, f4, 180.0f, 180.0f - f);
        double d = f4;
        nVar.m((float) (Math.sin(Math.toRadians(f)) * d), (float) (Math.sin(Math.toRadians(90.0f - f)) * d));
    }
}
