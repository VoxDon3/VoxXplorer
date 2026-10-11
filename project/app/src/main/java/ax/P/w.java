/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import ax.P.j;
import ax.Q.b;
import java.util.ArrayList;
import java.util.Iterator;

public final class w
implements Iterable<Intent> {
    private final Context c0;
    private final ArrayList<Intent> q = new ArrayList();

    private w(Context context) {
        this.c0 = context;
    }

    public static w i(Context context) {
        return new w(context);
    }

    public w e(Intent intent) {
        this.q.add(intent);
        return this;
    }

    public w g(Activity activity) {
        Intent intent = activity instanceof a ? ((a)activity).getSupportParentActivityIntent() : null;
        Intent intent2 = intent;
        if (intent == null) {
            intent2 = j.a(activity);
        }
        if (intent2 != null) {
            intent = intent2.getComponent();
            activity = intent;
            if (intent == null) {
                activity = intent2.resolveActivity(this.c0.getPackageManager());
            }
            this.h((ComponentName)activity);
            this.e(intent2);
        }
        return this;
    }

    public w h(ComponentName componentName) {
        PackageManager.NameNotFoundException nameNotFoundException2;
        block4: {
            int n8 = this.q.size();
            componentName = j.b(this.c0, componentName);
            while (componentName != null) {
                try {
                    this.q.add(n8, (Intent)componentName);
                    componentName = j.b(this.c0, componentName.getComponent());
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException2) {
                    break block4;
                }
            }
            return this;
        }
        Log.e((String)"TaskStackBuilder", (String)"Bad ComponentName while traversing activity parent metadata");
        throw new IllegalArgumentException(nameNotFoundException2);
    }

    @Override
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.q.iterator();
    }

    public void k() {
        this.l(null);
    }

    public void l(Bundle bundle) {
        if (!this.q.isEmpty()) {
            Intent[] intentArray = this.q.toArray(new Intent[0]);
            intentArray[0] = new Intent(intentArray[0]).addFlags(0x1000C000);
            if (!b.k(this.c0, intentArray, bundle)) {
                bundle = new Intent(intentArray[intentArray.length - 1]);
                bundle.addFlags(0x10000000);
                this.c0.startActivity((Intent)bundle);
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public static interface a {
        public Intent getSupportParentActivityIntent();
    }
}

