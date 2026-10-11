/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.content.DialogInterface;

public abstract class t
implements DialogInterface.OnClickListener {
    boolean a = false;

    public abstract void a(DialogInterface var1, int var2);

    public final void onClick(DialogInterface dialogInterface, int n8) {
        if (!this.a) {
            this.a(dialogInterface, n8);
            this.a = true;
        }
    }
}

