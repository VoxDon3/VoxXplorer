package ax.P;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w implements Iterable<Intent> {
    private final Context c0;
    private final ArrayList<Intent> q = new ArrayList<>();

    public interface a {
        Intent getSupportParentActivityIntent();
    }

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

    /* JADX WARN: Multi-variable type inference failed */
    public w g(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = j.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.c0.getPackageManager());
            }
            h(component);
            e(supportParentActivityIntent);
        }
        return this;
    }

    public w h(ComponentName componentName) {
        int size = this.q.size();
        try {
            Intent b = j.b(this.c0, componentName);
            while (b != null) {
                this.q.add(size, b);
                b = j.b(this.c0, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.q.iterator();
    }

    public void k() {
        l(null);
    }

    public void l(Bundle bundle) {
        if (this.q.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.q.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (ax.Q.b.k(this.c0, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.c0.startActivity(intent);
    }
}
