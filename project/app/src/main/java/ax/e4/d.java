/*
 * Decompiled with CFR 0.152.
 */
package ax.e4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import ax.e4.b;
import java.util.ArrayList;
import java.util.List;

public final class d {
    private final Context a;

    public d(Context context) {
        this.a = context;
    }

    private static b b(String object) {
        Object t8;
        try {
            object = Class.forName((String)object);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", classNotFoundException);
        }
        try {
            t8 = ((Class)object).newInstance();
        }
        catch (IllegalAccessException illegalAccessException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate GlideModule implementation for ");
            stringBuilder.append(object);
            throw new RuntimeException(stringBuilder.toString(), illegalAccessException);
        }
        catch (InstantiationException instantiationException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate GlideModule implementation for ");
            stringBuilder.append(object);
            throw new RuntimeException(stringBuilder.toString(), instantiationException);
        }
        if (t8 instanceof b) {
            return (b)t8;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Expected instanceof GlideModule, but found: ");
        ((StringBuilder)object).append(t8);
        throw new RuntimeException(((StringBuilder)object).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<b> a() {
        ApplicationInfo applicationInfo;
        if (Log.isLoggable((String)"ManifestParser", (int)3)) {
            Log.d((String)"ManifestParser", (String)"Loading Glide modules");
        }
        ArrayList<b> arrayList = new ArrayList<b>();
        try {
            applicationInfo = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                if (!Log.isLoggable((String)"ManifestParser", (int)3)) return arrayList;
                Log.d((String)"ManifestParser", (String)"Got null app info metadata");
                return arrayList;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", nameNotFoundException);
        }
        if (Log.isLoggable((String)"ManifestParser", (int)2)) {
            CharSequence charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Got app info metadata: ");
            ((StringBuilder)charSequence).append(applicationInfo.metaData);
            Log.v((String)"ManifestParser", (String)((StringBuilder)charSequence).toString());
        }
        for (CharSequence charSequence : applicationInfo.metaData.keySet()) {
            if (!"GlideModule".equals(applicationInfo.metaData.get((String)charSequence))) continue;
            arrayList.add(d.b((String)charSequence));
            if (!Log.isLoggable((String)"ManifestParser", (int)3)) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Loaded Glide module: ");
            stringBuilder.append((String)charSequence);
            Log.d((String)"ManifestParser", (String)stringBuilder.toString());
        }
        if (!Log.isLoggable((String)"ManifestParser", (int)3)) return arrayList;
        Log.d((String)"ManifestParser", (String)"Finished loading Glide modules");
        return arrayList;
    }
}

