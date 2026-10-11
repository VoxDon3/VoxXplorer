/*
 * Decompiled with CFR 0.152.
 */
package ax.I2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import ax.B2.i;
import ax.Gb.l;
import ax.I2.e;
import ax.I2.n;
import ax.N2.c;

public final class m
extends e<Boolean> {
    public m(Context context, c c8) {
        l.f(context, "context");
        l.f(c8, "taskExecutor");
        super(context, c8);
    }

    @Override
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override
    public void k(Intent object) {
        l.f(object, "intent");
        if (object.getAction() != null) {
            i i8 = i.e();
            String string = n.a();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Received ");
            stringBuilder.append(object.getAction());
            i8.a(string, stringBuilder.toString());
            object = object.getAction();
            if (object != null) {
                int n8 = ((String)object).hashCode();
                if (n8 != -1181163412) {
                    if (n8 == -730838620 && ((String)object).equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        this.g(Boolean.TRUE);
                        return;
                    }
                } else if (((String)object).equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    this.g(Boolean.FALSE);
                }
            }
        }
    }

    public Boolean l() {
        boolean bl;
        block0: {
            block2: {
                Object object;
                block3: {
                    boolean bl2;
                    block1: {
                        object = this.d().registerReceiver(null, this.j());
                        bl = bl2 = true;
                        if (object == null) break block0;
                        if (object.getAction() != null) break block1;
                        bl = bl2;
                        break block0;
                    }
                    if ((object = object.getAction()) == null) break block2;
                    int n8 = ((String)object).hashCode();
                    if (n8 == -1181163412) break block3;
                    if (n8 != -730838620) break block2;
                    bl = bl2;
                    if (((String)object).equals("android.intent.action.DEVICE_STORAGE_OK")) break block0;
                    break block2;
                }
                ((String)object).equals("android.intent.action.DEVICE_STORAGE_LOW");
            }
            bl = false;
        }
        return bl;
    }
}

