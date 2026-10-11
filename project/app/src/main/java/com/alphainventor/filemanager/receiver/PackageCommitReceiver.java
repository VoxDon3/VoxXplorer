/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.receiver;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import ax.Ha.c;
import ax.U2.d;
import ax.U2.f;
import ax.c3.u;

public class PackageCommitReceiver
extends BroadcastReceiver {
    public void onReceive(Context context, Intent object) {
        block13: {
            int n8;
            block14: {
                ActivityNotFoundException activityNotFoundException2;
                block12: {
                    n8 = object.getIntExtra("android.content.pm.extra.STATUS", -9999);
                    if (n8 == -9999) break block13;
                    if (n8 != -1) break block14;
                    try {
                        object = (Intent)object.getParcelableExtra("android.intent.extra.INTENT");
                        object.addFlags(0x10000000);
                        u.o0(context, (Intent)object);
                        return;
                    }
                    catch (Exception exception) {
                    }
                    catch (ActivityNotFoundException activityNotFoundException2) {
                        break block12;
                    }
                    Toast.makeText((Context)context, (int)2131951927, (int)1).show();
                    c.i(context).f().b("PACKAGE COMMIT RECEIVER ERROR").l(exception).h();
                    break block13;
                }
                activityNotFoundException2.printStackTrace();
                Toast.makeText((Context)context, (int)2131952448, (int)1).show();
                break block13;
            }
            if (n8 == 0) {
                String string = object.getStringExtra("android.content.pm.extra.PACKAGE_NAME");
                if (string != null) {
                    object = d.F(context).x(string);
                    if (object != null) {
                        Toast.makeText((Context)context, (CharSequence)context.getString(2131952318, new Object[]{((f)object).q()}), (int)1).show();
                        return;
                    }
                    Toast.makeText((Context)context, (CharSequence)context.getString(2131952318, new Object[]{string}), (int)1).show();
                    return;
                }
            } else if (n8 != 3) {
                if (n8 == 7) {
                    String string = object.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                    String string2 = context.getString(2131951927);
                    object = string2;
                    if (string != null) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(string2);
                        ((StringBuilder)object).append(" (");
                        ((StringBuilder)object).append(string);
                        ((StringBuilder)object).append(")");
                        object = ((StringBuilder)object).toString();
                    }
                    Toast.makeText((Context)context, (CharSequence)object, (int)1).show();
                    return;
                }
                if (n8 > 0) {
                    String string = object.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
                    String string3 = context.getString(2131951927);
                    object = string3;
                    if (string != null) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(string3);
                        ((StringBuilder)object).append(" (");
                        ((StringBuilder)object).append(string);
                        ((StringBuilder)object).append(")");
                        object = ((StringBuilder)object).toString();
                    }
                    Toast.makeText((Context)context, (CharSequence)object, (int)1).show();
                }
            }
        }
    }
}

