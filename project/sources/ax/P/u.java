package ax.P;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class u {
    private final String a;
    private final CharSequence b;
    private final CharSequence[] c;
    private final boolean d;
    private final int e;
    private final Bundle f;
    private final Set<String> g;

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(u uVar) {
            Set<String> d;
            RemoteInput.Builder addExtras = new RemoteInput.Builder(uVar.i()).setLabel(uVar.h()).setChoices(uVar.e()).setAllowFreeFormInput(uVar.c()).addExtras(uVar.g());
            if (Build.VERSION.SDK_INT >= 26 && (d = uVar.d()) != null) {
                Iterator<String> it = d.iterator();
                while (it.hasNext()) {
                    b.d(addExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(addExtras, uVar.f());
            }
            return addExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static class b {
        static void a(u uVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(u.a(uVar), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    static RemoteInput a(u uVar) {
        return a.b(uVar);
    }

    static RemoteInput[] b(u[] uVarArr) {
        if (uVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[uVarArr.length];
        for (int i = 0; i < uVarArr.length; i++) {
            remoteInputArr[i] = a(uVarArr[i]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.d;
    }

    public Set<String> d() {
        return this.g;
    }

    public CharSequence[] e() {
        return this.c;
    }

    public int f() {
        return this.e;
    }

    public Bundle g() {
        return this.f;
    }

    public CharSequence h() {
        return this.b;
    }

    public String i() {
        return this.a;
    }

    public boolean j() {
        if (c()) {
            return false;
        }
        return ((e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
