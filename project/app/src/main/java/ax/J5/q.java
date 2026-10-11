/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.content.Intent;

public class q
extends Exception {
    private final Intent q;

    public q(String string, Intent intent) {
        super(string);
        this.q = intent;
    }

    public Intent a() {
        return new Intent(this.q);
    }
}

