package ax.ca;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes3.dex */
public class e {
    private final int a;
    private final int b;

    public e(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public e c(float f) {
        return new e((int) (this.a * f), (int) (this.b * f));
    }

    public e d(int i) {
        return new e(this.a / i, this.b / i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(9);
        sb.append(this.a);
        sb.append("x");
        sb.append(this.b);
        return sb.toString();
    }

    public e(int i, int i2, int i3) {
        if (i3 % SubsamplingScaleImageView.ORIENTATION_180 == 0) {
            this.a = i;
            this.b = i2;
        } else {
            this.a = i2;
            this.b = i;
        }
    }
}
