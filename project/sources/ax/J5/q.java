package ax.J5;

import android.content.Intent;

/* loaded from: classes3.dex */
public class q extends Exception {
    private final Intent q;

    public q(String str, Intent intent) {
        super(str);
        this.q = intent;
    }

    public Intent a() {
        return new Intent(this.q);
    }
}
