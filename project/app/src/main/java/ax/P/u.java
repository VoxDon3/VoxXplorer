/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.Map;
import java.util.Set;

public final class u {
    private final String a;
    private final CharSequence b;
    private final CharSequence[] c;
    private final boolean d;
    private final int e;
    private final Bundle f;
    private final Set<String> g;

    static RemoteInput a(u u8) {
        return ax.P.u$a.b(u8);
    }

    static RemoteInput[] b(u[] uArray) {
        if (uArray == null) {
            return null;
        }
        RemoteInput[] remoteInputArray = new RemoteInput[uArray.length];
        for (int i8 = 0; i8 < uArray.length; ++i8) {
            remoteInputArray[i8] = u.a(uArray[i8]);
        }
        return remoteInputArray;
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
        return !this.c() && (this.e() == null || this.e().length == 0) && this.d() != null && !this.d().isEmpty();
    }

    static class a {
        static void a(Object object, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[])((RemoteInput[])object), (Intent)intent, (Bundle)bundle);
        }

        public static RemoteInput b(u u8) {
            Object object;
            RemoteInput.Builder builder = new RemoteInput.Builder(u8.i()).setLabel(u8.h()).setChoices(u8.e()).setAllowFreeFormInput(u8.c()).addExtras(u8.g());
            if (Build.VERSION.SDK_INT >= 26 && (object = u8.d()) != null) {
                object = object.iterator();
                while (object.hasNext()) {
                    ax.P.u$b.d(builder, (String)object.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ax.P.u$c.b(builder, u8.f());
            }
            return builder.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent((Intent)intent);
        }
    }

    static class b {
        static void a(u u8, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent((RemoteInput)u.a(u8), (Intent)intent, map);
        }

        static Set<String> b(Object object) {
            return ((RemoteInput)object).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String string) {
            return RemoteInput.getDataResultsFromIntent((Intent)intent, (String)string);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String string, boolean bl) {
            return builder.setAllowDataType(string, bl);
        }
    }

    static class c {
        static int a(Object object) {
            return ((RemoteInput)object).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int n8) {
            return builder.setEditChoicesBeforeSending(n8);
        }
    }
}

