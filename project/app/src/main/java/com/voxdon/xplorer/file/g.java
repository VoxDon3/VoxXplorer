/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.system.ErrnoException;
import android.system.Os;
import android.text.TextUtils;
import ax.Q2.f;
import ax.X2.J;
import ax.X2.Q;
import ax.Z2.j;
import ax.b3.C;
import ax.b3.M;
import ax.b3.a;
import ax.b3.d;
import ax.b3.k;
import ax.b3.p;
import ax.b3.r;
import ax.b3.t;
import ax.c3.B;
import ax.c3.F;
import ax.c3.G;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.k0;
import ax.c3.l;
import ax.c3.v;
import ax.u3.b;
import ax.u3.c;
import com.voxdon.xplorer.file.e;
import com.voxdon.xplorer.file.h;
import com.voxdon.xplorer.file.i;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.x;
import com.voxdon.xplorer.file.y;
import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class g {
    private static final Logger b = Logger.getLogger("FileManager.DocumentFileClient");
    Context a;

    g(Context context) {
        this.a = context;
    }

    public static String A(String string) {
        if (string == null) {
            return null;
        }
        int n8 = string.indexOf(":");
        if (n8 < 0) {
            return null;
        }
        return string.substring(0, n8);
    }

    public static String B(String string) {
        if (string == null) {
            return null;
        }
        int n8 = string.indexOf(":");
        if (n8 < 0) {
            return null;
        }
        return string.substring(0, n8);
    }

    public static boolean C(Context context, K k8, String string) {
        String string2;
        string2 = j.F().E0(k8) && string != null ? ((string2 = g.n(k8, string)) != null && g.a(context, (Uri)string2) ? string2.toString() : null) : g.x(context, k8, string);
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return false;
        }
        return g.H(context, k8, string, Uri.parse((String)string2));
    }

    private static boolean D(K object, l object2) {
        CharSequence charSequence;
        if (f.i0(((K)object).d())) {
            if ((object = ((K)object).e()) == null) {
                return false;
            }
            object = d0.h((String)object);
        } else if (f.c0(((K)object).d())) {
            object = j.F().Z((K)object);
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Unexpected location unit : ");
            ((StringBuilder)charSequence).append(object);
            ax.u3.b.g(((StringBuilder)charSequence).toString());
            object = null;
        }
        charSequence = ((l)object2).b;
        if (charSequence != null) {
            if (((String)charSequence).equals(object)) {
                return true;
            }
            object2 = g.A(((l)object2).a);
            if (object2 != null && ((String)object2).equals(object)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(String string) {
        if (string == null) {
            return false;
        }
        return string.endsWith(":");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean F(Context object, K object2, String string, Uri uri) {
        if (!Q.V1()) {
            return false;
        }
        try {
            String string2;
            String var2_5;
            String string3;
            Uri var3_6;
            String string4;
            block17: {
                block18: {
                    if (((K)((Object)string4)).e() == null) {
                        return false;
                    }
                    string3 = ax.X2.v.h((Uri)var3_6);
                    if (var2_5 != null) {
                        string2 = g.z(string3);
                        if (string2 == null) return false;
                        if (!string2.equals(var2_5)) {
                            return false;
                        }
                    } else if (!g.E(string3)) {
                        return false;
                    }
                    if (var2_5 != null) break block18;
                    if (f.i0(((K)((Object)string4)).d())) {
                        string2 = d0.h(((K)((Object)string4)).e());
                        break block17;
                    } else if (f.c0(((K)((Object)string4)).d())) {
                        string2 = j.F().Z((K)((Object)string4));
                        break block17;
                    } else {
                        if (f.o0(((K)((Object)string4)).d())) {
                            return false;
                        }
                        string2 = "";
                    }
                    break block17;
                }
                string2 = d0.h((String)var2_5);
            }
            l l8 = g.i(object, g.c((Uri)var3_6), string2);
            if (l8 == null) {
                return false;
            }
            if (var2_5 == null) {
                return g.D((K)((Object)string4), l8);
            }
            String string5 = g.B(string3);
            if (string4 == K.e) {
                return "primary".equals(string5);
            }
            if (string4 == K.f) {
                if ((string4 = d0.h(((K)((Object)string4)).e())) == null) return false;
                if (!string4.equals(string5)) return false;
                return true;
            }
            ax.u3.b.f();
            return false;
        }
        catch (ax.b3.j j8) {
            return false;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean G(Context object, K object2, Uri uri) {
        if (!Q.V1()) {
            return false;
        }
        try {
            Object var2_4;
            String string;
            if (((K)((Object)string)).e() == null) {
                return false;
            }
            j.f f8 = j.F().M((K)((Object)string));
            if (f8 == null) {
                return false;
            }
            Uri uri2 = f8.b;
            if (uri2 != null) {
                return uri2.equals((Object)var2_4);
            }
            String string2 = f8.a.getLastPathSegment();
            String string3 = var2_4.getLastPathSegment();
            if (string3 == null) return false;
            if (!string3.equals(string2)) {
                return false;
            }
            l l8 = g.i(object, g.c((Uri)var2_4), null);
            if (l8 == null) {
                return false;
            }
            j.F().U0((K)((Object)string), (Uri)var2_4, l8.b);
            ((K)((Object)string)).j(l8.b);
            string = ax.X2.v.h((Uri)var2_4);
            if (string == null) return false;
            if (!string.equals(l8.a)) return false;
            f8.b = var2_4;
            f8.c = l8.b;
            return true;
        }
        catch (ax.b3.j j8) {
            return false;
        }
    }

    public static boolean H(Context object, K object2, String string, Uri uri) {
        String string2 = uri.getAuthority();
        if ("com.android.externalstorage.documents".equals(string2)) {
            return g.F((Context)object, (K)object2, string, uri);
        }
        if ("com.android.mtp.documents".equals(string2)) {
            return g.G((Context)object, (K)object2, uri);
        }
        object2 = b;
        object = new StringBuilder();
        ((StringBuilder)object).append("Unknown Document Athority : ");
        ((StringBuilder)object).append(string2);
        ((Logger)object2).severe(((StringBuilder)object).toString());
        return false;
    }

    public static boolean I(K k8, Uri uri) {
        if (f.b0(k8.d())) {
            if ((k8 = g.n(k8, null)) == null) {
                return false;
            }
            return uri.toString().startsWith(k8.toString());
        }
        if (f.h1 == k8.d()) {
            return "com.android.mtp.documents".equals(uri.getAuthority());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("same storage uri :");
        stringBuilder.append(k8);
        stringBuilder.append(":");
        stringBuilder.append(uri);
        ax.u3.b.g(stringBuilder.toString());
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<n> J(e var0, n var1_9) throws ax.b3.j {
        block28: {
            block29: {
                block30: {
                    var3_16 /* !! */  = g.l(var1_9);
                    var9_17 = var0.p().getContentResolver();
                    var3_16 /* !! */  = DocumentsContract.buildChildDocumentsUriUsingTree((Uri)var3_16 /* !! */ , (String)DocumentsContract.getDocumentId((Uri)var3_16 /* !! */ ));
                    var4_18 = var3_16 /* !! */ ;
                    if (Q.L()) {
                        var4_18 = var3_16 /* !! */ ;
                        if (B.P(var1_9)) {
                            var4_18 = var3_16 /* !! */ ;
                            if (var1_9.E().endsWith("/Android")) {
                                var4_18 = var3_16 /* !! */ ;
                                if ("/Android".equals(((y)var1_9).C0())) {
                                    var4_18 = g.N(var3_16 /* !! */ );
                                }
                            }
                        }
                    }
                    var8_19 = new ArrayList<n>();
                    var6_20 = null;
                    var5_21 = null;
                    var7_22 = null;
                    var3_16 /* !! */  = null;
                    try {
                        var4_18 = var9_17.query((Uri)var4_18, l.g, null, null, null);
                        if (var4_18 != null) {
                        }
                        ** GOTO lbl-1000
                    }
                    catch (Throwable var0_5) {
                        break block28;
                    }
                    catch (Exception var1_12) {
                        var0 = var6_20;
                        break block29;
                    }
                    catch (ax.b3.j var0_6) {
                        var3_16 /* !! */  = var5_21;
                        throw var0_7;
                    }
                    catch (IllegalArgumentException var1_13) {
                        var0 = var7_22;
                        ** GOTO lbl109
                    }
                    try {
                        try {
                            var3_16 /* !! */  = var1_9.E();
                            if (!B.P(var1_9)) ** GOTO lbl-1000
                            var6_20 = ((y)var1_9).N0();
                            var5_21 = ((y)var1_9).B0();
lbl40:
                            // 2 sources

                            while (true) {
                                var2_24 = var4_18.moveToNext();
                                if (!var2_24) ** GOTO lbl67
                                break;
                            }
                        }
                        catch (IllegalArgumentException var1_11) {
                            var0 = var4_18;
                            ** GOTO lbl109
                        }
                        {
                            var7_22 = new y((x)var0, (Uri)var6_20, (K)var5_21, (String)var3_16 /* !! */ , (Cursor)var4_18);
                            var8_19.add(var7_22);
                        }
                    }
                    catch (Throwable var0_1) {
                        var3_16 /* !! */  = var4_18;
                        break block28;
                    }
                    catch (Exception var1_10) {
                        var0 = var4_18;
                        break block29;
                    }
                    catch (ax.b3.j var0_2) {
                        var3_16 /* !! */  = var4_18;
                        throw var0_7;
                    }
lbl-1000:
                    // 1 sources

                    {
                        var5_21 = (i)var1_9;
                        while (var4_18.moveToNext()) {
                            var6_20 = new i((h)var0, (String)var3_16 /* !! */ , (Cursor)var4_18);
                            var6_20.q0(var5_21.m0());
                            var8_19.add((n)var6_20);
                        }
lbl67:
                        // 2 sources

                        if (!Q.L() || var8_19.size() != 0 || !(var1_9 instanceof y) || !(var0 = (y)var1_9).a1() || var0.F0().canRead()) break block30;
                        var0.q1();
                        if (!var0.n()) ** GOTO lbl84
                        if (var1_9.R() == K.e) ** GOTO lbl77
                        var2_24 = "/Android/data".equals(var0.C0());
                        if (var2_24) ** GOTO lbl-1000
                    }
                    F.a((AutoCloseable)var4_18);
                    return var8_19;
lbl-1000:
                    // 1 sources

                    {
                        var0 = new ax.b3.e();
                        throw var0;
lbl77:
                        // 1 sources

                        try {
                            ((y)var1_9).x1();
                            break block30;
                        }
                        catch (r var0_3) {
                            var0_4 = new ax.b3.e();
                            throw var0_4;
                        }
lbl84:
                        // 1 sources

                        var0 = new t();
                        throw var0;
                    }
                }
                F.a((AutoCloseable)var4_18);
                return var8_19;
lbl-1000:
                // 1 sources

                {
                    var0 = new ax.b3.j("query return null");
                    throw var0;
                }
            }
            var3_16 /* !! */  = var0;
            {
                var3_16 /* !! */  = var0;
                var4_18 = new StringBuilder();
                var3_16 /* !! */  = var0;
                var4_18.append("listChildren : ");
                var3_16 /* !! */  = var0;
                var4_18.append(var1_14.getClass().getSimpleName());
                var3_16 /* !! */  = var0;
                var4_18.append(":");
                var3_16 /* !! */  = var0;
                var4_18.append(var1_14.getMessage());
                var3_16 /* !! */  = var0;
                throw d.a(var4_18.toString(), (Exception)var1_14);
lbl109:
                // 2 sources

                var3_16 /* !! */  = var0;
                var1_15.printStackTrace();
                var3_16 /* !! */  = var0;
                if (!TextUtils.isEmpty((CharSequence)var1_15.getMessage())) {
                    var3_16 /* !! */  = var0;
                    if (!var1_15.getMessage().contains("FileNotFoundException")) {
                        var3_16 /* !! */  = var0;
                        ax.Ha.c.h().f().b("DOCUMENT FILE EXCEPTION DO NOT CONTAIN FILENOTFOUND").l(var1_15).h();
                    }
                }
                var3_16 /* !! */  = var0;
                var3_16 /* !! */  = var0;
                var1_15 = new t();
                var3_16 /* !! */  = var0;
                throw var1_15;
            }
        }
        F.a((AutoCloseable)var3_16 /* !! */ );
        throw var0_8;
        catch (IllegalArgumentException var7_23) {
        }
        {
            ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void K(Context context, n n8, n n9, c c8, ax.g3.i i8) throws ax.b3.j {
        c c9;
        Uri uri;
        boolean bl;
        Uri uri2;
        long l8;
        block14: {
            long l10;
            long l9;
            ContentResolver contentResolver;
            l8 = n8.p();
            uri2 = g.l(n8);
            Uri uri3 = g.v(n8);
            c8 = g.v(n9);
            if (!n8.n()) {
                throw new t("Source File not exist");
            }
            bl = n8.B().equals(n9.B());
            if (bl || (uri = ax.X2.v.b(context.getContentResolver(), uri2, n9.B(), n8.p(), n8.q())) == null) {
                uri = uri2;
            }
            c9 = null;
            try {
                contentResolver = context.getContentResolver();
                l9 = n8.p();
                l10 = n8.q();
            }
            catch (ax.b3.j j9) {
                // empty catch block
                break block14;
            }
            try {
                c9 = c8 = ax.X2.y.a(contentResolver, uri, uri3, (Uri)c8, l9, l10);
                c8 = null;
            }
            catch (ax.b3.j j8) {}
        }
        if (c9 == null) {
            if (!uri.equals((Object)uri2)) {
                ax.X2.v.b(context.getContentResolver(), uri, n8.B(), n8.p(), n8.q());
            }
            if (c8 == null) {
                throw new ax.b3.j("moveDocument failed 1");
            }
            throw new ax.b3.j("moveDocument failed 2", (Throwable)((Object)c8));
        }
        if (f.b0(n8.P())) {
            if (!c9.equals(g.l(n9)) && !bl && ax.X2.v.b(context.getContentResolver(), (Uri)c9, n9.B(), n8.p(), n8.q()) == null) {
                throw new ax.b3.j("renameDocument in move failed");
            }
        } else if (f.h1 == n8.P()) {
            ax.u3.b.f();
        }
        if (i8 != null) {
            i8.a(l8, l8);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void L(e object, n object2, n n8, c c8, ax.g3.i i8) throws ax.b3.j {
        Throwable var1_5;
        block11: {
            RuntimeException var1_3;
            block10: {
                long l10;
                long l9;
                G g8;
                long l8 = object2.p();
                if (n8.n()) {
                    object2 = ax.Ha.c.h().f().d("!! Move Document FILE ALREADY EXISTS !!").j();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("location:");
                    ((StringBuilder)object).append(n8.P().I());
                    ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                    throw new ax.b3.j("moveUsingCopyDocumentFile file already exists");
                }
                if (object2.isDirectory()) {
                    if (((m)object).u() != f.h1) {
                        ax.u3.b.g("Not supported : doesSupportMoveFileToDifferentParent() == false");
                    }
                    throw new ax.b3.j("Folder rename is not supported");
                }
                try {
                    g8 = ((m)object).s((n)object2);
                    l9 = object2.p();
                    l10 = object2.q();
                }
                catch (ax.b3.j j9) {
                    break block10;
                }
                catch (a a9) {
                    break block11;
                }
                try {
                    g.Q((e)object, n8, g8, l9, l10, true, c8, i8);
                }
                catch (ax.b3.j j8) {
                    break block10;
                }
                catch (a a8) {
                    break block11;
                }
                g.g((m)object, (n)object2);
                if (i8 != null) {
                    i8.a(l8, l8);
                }
                return;
            }
            g.g((m)object, n8);
            throw var1_3;
        }
        g.g((m)object, n8);
        throw new ax.b3.j((Throwable)var1_5);
    }

    public static void M(Context context, n n8, n n9, c c8, ax.g3.i i8) throws ax.b3.j {
        long l8 = n8.p();
        c8 = g.l(n8);
        ax.X2.v.b(context.getContentResolver(), (Uri)c8, n9.B(), n8.p(), n8.q());
        if (i8 != null) {
            i8.a(l8, l8);
        }
    }

    public static Uri N(Uri uri) {
        Q.l(31);
        return uri.buildUpon().appendQueryParameter("manage", "true").build();
    }

    public static void O(Context context, K k8, String string, Uri uri) {
        try {
            context = context.getSharedPreferences("pref_secondary", 0).edit();
            context.putString(g.y(k8, string), uri.toString());
            context.commit();
            return;
        }
        catch (M m8) {
            m8.printStackTrace();
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void P(e object, n object2, long l8) throws IOException, ax.b3.j {
        Object object3;
        Object object4;
        block18: {
            Throwable var9_20;
            Object object5;
            Object object6;
            Object object7;
            Object object8;
            block20: {
                ax.b3.j j8;
                block19: {
                    if (!object2.n()) {
                        throw new t();
                    }
                    object = ((m)object).p();
                    object8 = g.l((n)object2);
                    object7 = null;
                    object6 = null;
                    object5 = null;
                    object4 = null;
                    object3 = null;
                    j8 = null;
                    try {
                        object = object.getContentResolver().openFileDescriptor((Uri)object8, "rw");
                    }
                    catch (Throwable throwable) {
                        object4 = null;
                        object2 = null;
                        break block18;
                    }
                    catch (SecurityException securityException) {
                        object4 = null;
                        object = null;
                        object2 = object5;
                        break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        object3 = null;
                        object = null;
                        break block20;
                    }
                    try {
                        object4 = new FileOutputStream(object.getFileDescriptor());
                        object3 = j8;
                        object5 = object7;
                    }
                    catch (Throwable throwable) {
                        object2 = null;
                        object4 = object;
                        object = throwable;
                        break block18;
                    }
                    catch (SecurityException securityException) {
                        object5 = null;
                        object2 = object;
                        object4 = null;
                        object = object5;
                        break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        object5 = null;
                        object4 = object;
                        object3 = null;
                        object = object5;
                        break block20;
                    }
                    try {
                        object3 = object7 = ax.g2.b.a((FileOutputStream)object4);
                        object5 = object7;
                        object6 = object7;
                        ((FileChannel)object7).truncate(l8);
                    }
                    catch (Throwable throwable) {
                        object2 = object4;
                        object4 = object;
                        object = throwable;
                        break block18;
                    }
                    catch (SecurityException securityException) {
                        object2 = object;
                        object = object4;
                        object4 = object5;
                        break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        object3 = object;
                        object = object4;
                        object4 = object3;
                        object3 = object6;
                        break block20;
                    }
                    ((AbstractInterruptibleChannel)object7).close();
                    ((FileOutputStream)object4).close();
                    object.close();
                    return;
                }
                object5 = object;
                object6 = object2;
                object7 = object4;
                try {
                    object5 = object;
                    object6 = object2;
                    object7 = object4;
                    j8 = new ax.b3.j((Throwable)object3);
                    object5 = object;
                    object6 = object2;
                    object7 = object4;
                    throw j8;
                }
                catch (Throwable throwable) {
                    object3 = object7;
                    object4 = object6;
                    object2 = object5;
                }
                break block18;
            }
            object5 = object;
            object6 = object4;
            object7 = object3;
            object5 = object;
            object6 = object4;
            object7 = object3;
            object8 = new StringBuilder();
            object5 = object;
            object6 = object4;
            object7 = object3;
            ((StringBuilder)object8).append("FILE:");
            object5 = object;
            object6 = object4;
            object7 = object3;
            ((StringBuilder)object8).append(object2.n());
            object5 = object;
            object6 = object4;
            object7 = object3;
            object2 = ((StringBuilder)object8).toString();
            object5 = object;
            object6 = object4;
            object7 = object3;
            ax.Ha.c.h().f().b("trucate failed").l((Throwable)var9_20).g(object2).h();
            object5 = object;
            object6 = object4;
            object7 = object3;
            object5 = object;
            object6 = object4;
            object7 = object3;
            object2 = new IOException((Throwable)var9_20);
            object5 = object;
            object6 = object4;
            object7 = object3;
            throw object2;
        }
        if (object3 != null) {
            ((AbstractInterruptibleChannel)object3).close();
        }
        if (object2 != null) {
            ((FileOutputStream)object2).close();
        }
        if (object4 != null) {
            object4.close();
        }
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void Q(e var0, n var1_18, G var2_23, long var3_29, Long var5_30, boolean var6_34, c var7_35, ax.g3.i var8_36) throws ax.b3.j, a {
        block52: {
            block48: {
                block49: {
                    var22_37 = var0.p();
                    var21_38 = g.d((e)var0, (n)var1_18, false);
                    if (var21_38 == null) throw new ax.b3.j("DocumentFile returns null");
                    if (f.b0(var1_18.P())) {
                        var5_30 = g.l((n)var1_18);
                        if (var5_30 == null || var21_38.equals(var5_30) || !d0.M(var1_18.B())) break block48;
                        var1_18 = d0.g(d0.h(var21_38.getPath()));
                        if (var1_18 != null && var1_18.endsWith(")") && (var11_39 = var1_18.contains("("))) {
                            ax.X2.v.f(var22_37.getContentResolver(), var21_38);
                            break block49;
                        }
                        var1_18 = ax.Ha.c.h().f().d("UNEXPECTED DOCUMENT FILE NAME");
                        var12_40 = new StringBuilder();
                        var12_40.append("expected:");
                        var12_40.append(var5_30);
                        var12_40.append(",uri:");
                        var12_40.append(var21_38);
                        var1_18.g(var12_40.toString()).h();
                    }
                    var1_18.P();
                    break block48;
                    catch (ax.b3.j var1_21) {}
                    break block48;
                    catch (SecurityException var1_22) {}
                }
                var1_18 = new ax.b3.f(false);
                throw var1_18;
            }
            var9_41 = 0;
            while (true) {
                block56: {
                    block51: {
                        block50: {
                            var19_51 = null;
                            var16_48 = null;
                            var18_50 = null;
                            var17_49 = null;
                            var12_40 = null;
                            var20_52 = null;
                            var1_18 = var2_23.b();
                            var12_40 = var20_52;
                            var5_30 = var1_18;
                            try {
                                var14_46 = ax.X2.v.p(var22_37, var21_38);
                            }
                            catch (FileNotFoundException var5_31) {
                                var12_40 = var20_52;
                                var5_30 = var1_18;
                                var13_43 = ax.X2.v.p(var22_37, var21_38);
                                var14_46 = var13_43;
                                if (var13_43 == null) break block50;
                                var12_40 = var20_52;
                                var5_30 = var1_18;
                                ax.Ha.c.h().f().c("REMOTE EXCEPTION RETRY SUCCESS! : WriteDocumentFile").h();
                                var14_46 = var13_43;
                            }
                        }
                        if (var14_46 != null) {
                            var12_40 = var20_52;
                            var5_30 = var1_18;
                            var5_30 = var13_43 = var14_46.createOutputStream();
                        } else {
                            var5_30 = null;
                        }
                        var15_47 = var5_30;
                        if (var5_30 == null) {
                            var12_40 = var20_52;
                            var5_30 = var1_18;
                            var15_47 = var22_37.getContentResolver().openOutputStream(var21_38);
                        }
                        var12_40 = var20_52;
                        var5_30 = var1_18;
                        var12_40 = var20_52;
                        var5_30 = var1_18;
                        var13_43 = new BufferedOutputStream((OutputStream)var15_47, 8192);
                        try {
                            F.c((InputStream)var1_18, (OutputStream)var13_43, var3_29, (c)var7_35, var8_36);
                            if (var14_46 == null || !var6_34 || !var0.k0()) break block51;
                            var14_46.getParcelFileDescriptor().getFileDescriptor().sync();
                        }
                        catch (Throwable var0_6) {
                            var12_40 = var13_43;
                            break block52;
                        }
                        catch (NullPointerException var2_25) {
                            var0 = var13_43;
                            ** GOTO lbl156
                        }
                        catch (SecurityException var0_7) {}
                        ** GOTO lbl-1000
                        catch (IllegalArgumentException var0_8) {}
lbl-1000:
                        // 2 sources

                        {
                            var2_23 = var0_3 /* !! */ ;
                            var0_3 /* !! */  = var13_43;
                            ** GOTO lbl164
                        }
                        catch (IOException var0_9) {
                            var12_40 = var13_43;
                            ** GOTO lbl176
                        }
                        catch (SyncFailedException var5_32) {
                            var14_46 = var13_43;
                            var13_43 = var5_32;
                            ** GOTO lbl179
                        }
                    }
                    try {
                        var13_43.close();
                    }
                    catch (IOException var0_10) {
                        // empty catch block
                    }
                    if (var1_18 == null) return;
                    try {
                        var1_18.close();
                        return;
                    }
                    catch (IOException var0_11) {
                        var0_11.printStackTrace();
                    }
                    return;
                    catch (Throwable var0_12) {
                        var1_18 = null;
                        break block52;
                    }
                    catch (NullPointerException var2_26) {
                        var1_18 = null;
                        var0 = var19_51;
                        ** GOTO lbl156
                    }
                    {
                        block55: {
                            block54: {
                                block53: {
                                    catch (SecurityException var0_13) {}
                                    ** GOTO lbl-1000
                                    catch (IllegalArgumentException var0_14) {}
lbl-1000:
                                    // 2 sources

                                    {
                                        var2_23 = var0_3 /* !! */ ;
                                        var1_18 = null;
                                        var0_3 /* !! */  = var16_48;
                                        break block53;
                                    }
                                    catch (IOException var0_15) {
                                        var1_18 = null;
                                        var12_40 = var18_50;
                                        break block54;
                                    }
                                    catch (SyncFailedException var13_45) {
                                        var1_18 = null;
                                        var14_46 = var17_49;
                                        break block55;
                                    }
                                    catch (Throwable var0_1) {
                                        var1_18 = var5_30;
                                        break block52;
                                    }
                                    catch (NullPointerException var2_24) {
                                        var0 = var19_51;
                                    }
                                    catch (SecurityException var0_2) {}
                                    ** GOTO lbl-1000
                                    catch (IllegalArgumentException var0_4) {}
lbl-1000:
                                    // 2 sources

                                    {
                                        var2_23 = var0_3 /* !! */ ;
                                        var0_3 /* !! */  = var16_48;
                                        break block53;
                                    }
                                    catch (IOException var0_5) {
                                        var12_40 = var18_50;
                                        break block54;
                                    }
                                    catch (SyncFailedException var13_44) {
                                        var14_46 = var17_49;
                                        break block55;
                                    }
lbl156:
                                    // 3 sources

                                    var12_40 = var0;
                                    var5_30 = var1_18;
                                    var12_40 = var0;
                                    var5_30 = var1_18;
                                    var7_35 = new ax.b3.j((Throwable)var2_27);
                                    var12_40 = var0;
                                    var5_30 = var1_18;
                                    throw var7_35;
                                }
                                var12_40 = var0_3 /* !! */ ;
                                var5_30 = var1_18;
                                ax.Ha.c.h().f().d("LOWDF1:").l((Throwable)var2_23).g(var21_38.toString()).h();
                                var12_40 = var0_3 /* !! */ ;
                                var5_30 = var1_18;
                                var12_40 = var0_3 /* !! */ ;
                                var5_30 = var1_18;
                                var7_35 = new ax.b3.j((Throwable)var2_23);
                                var12_40 = var0_3 /* !! */ ;
                                var5_30 = var1_18;
                                throw var7_35;
                            }
                            var5_30 = var1_18;
                            throw d.a("write document error", (Exception)var0_16);
                        }
                        if (var9_41 > 0) break;
                        var12_40 = var14_46;
                        var5_30 = var1_18;
                        var11_39 = var2_23.a();
                        if (!var11_39) break;
                        var10_42 = var9_41 + 1;
                        if (var14_46 == null) break block56;
                    }
                    try {
                        var14_46.close();
                    }
                    catch (IOException var5_33) {
                        // empty catch block
                    }
                }
                var9_41 = var10_42;
                if (var1_18 == null) continue;
                try {
                    var1_18.close();
                    var9_41 = var10_42;
                }
                catch (IOException var1_19) {
                    var1_19.printStackTrace();
                    var9_41 = var10_42;
                }
            }
            var12_40 = var14_46;
            var5_30 = var1_18;
            {
                var12_40 = var14_46;
                var5_30 = var1_18;
                var0 = new ax.b3.j((Throwable)var13_43);
                var12_40 = var14_46;
                var5_30 = var1_18;
                throw var0;
            }
        }
        if (var12_40 != null) {
            try {
                var12_40.close();
            }
            catch (IOException var2_28) {
                // empty catch block
            }
        }
        if (var1_18 == null) throw var0_17;
        try {
            var1_18.close();
            throw var0_17;
        }
        catch (IOException var1_20) {
            var1_20.printStackTrace();
        }
        throw var0_17;
    }

    public static boolean a(Context context, Uri uri) {
        return ax.Z2.n.b(context).d(uri);
    }

    public static void b(Context context, K k8, String string) {
        try {
            context = context.getSharedPreferences("pref_secondary", 0).edit();
            if (k8.d() == f.p0) {
                context.remove("secondaryRootUri");
            }
            context.remove(g.y(k8, string));
            context.commit();
            return;
        }
        catch (M m8) {
            m8.printStackTrace();
            return;
        }
    }

    public static Uri c(Uri uri) {
        return DocumentsContract.buildDocumentUriUsingTree((Uri)uri, (String)DocumentsContract.getTreeDocumentId((Uri)uri));
    }

    public static Uri d(e object, n object2, boolean bl) throws ax.b3.j {
        Context context = ((m)object).p();
        String string = ((n)object2).E();
        String string2 = ((n)object2).B();
        if ((object = object.z(d0.r(string))) != null && object.n()) {
            Uri uri = g.v((n)object2);
            if (bl) {
                try {
                    object = ax.X2.v.e(context.getContentResolver(), uri, string2);
                    return object;
                }
                catch (SecurityException securityException) {
                    ax.Ha.c.h().f().d("CDF1").l(securityException).h();
                    return null;
                }
            }
            object = object2 = v.h(string);
            if (object2 == null) {
                object = "";
            }
            try {
                object = ax.X2.v.d(context.getContentResolver(), uri, (String)object, string2);
                return object;
            }
            catch (SecurityException securityException) {
                ax.Ha.c.h().f().d("CDF2").l(securityException).h();
                return null;
            }
        }
        throw new ax.b3.j("CreateDocument Parent not exists");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri e(K object, Uri object2, String object3) throws ax.b3.j {
        IllegalArgumentException illegalArgumentException2;
        block5: {
            if (object2 == null) {
                object3 = ax.Ha.c.h().b("Null RootUri").j();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("loc:");
                ((StringBuilder)object2).append(((K)object).toString());
                ((ax.Ha.b)object3).g(((StringBuilder)object2).toString()).h();
                throw new r("RootUri is empty");
            }
            if (((String)object3).equals(object = ((K)object).e())) {
                return ax.X2.v.c((Uri)object2, ax.X2.v.h((Uri)object2));
            }
            try {
                if (d0.I((String)object, (String)object3)) {
                    return g.f((Uri)object2, d0.n((String)object, (String)object3));
                }
            }
            catch (IllegalArgumentException illegalArgumentException2) {
                break block5;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Path is not subdir of root");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(":");
            ((StringBuilder)object2).append((String)object3);
            ax.b3.j j8 = new ax.b3.j(((StringBuilder)object2).toString());
            throw j8;
        }
        ax.Ha.c.h().f().d("Invalid PATH").l(illegalArgumentException2).g(object3).h();
        throw new ax.b3.j(illegalArgumentException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Uri f(Uri uri, String string) throws ax.b3.j {
        IllegalArgumentException illegalArgumentException2;
        block4: {
            String string2;
            String string3;
            block3: {
                try {
                    string3 = ax.X2.v.h(uri);
                    if (string3.endsWith(":")) {
                        string2 = string3;
                        break block3;
                    }
                    int n8 = string3.indexOf(":");
                    string2 = string3;
                    if (n8 < 0) break block3;
                    string2 = string3.substring(0, n8 + 1);
                }
                catch (IllegalArgumentException illegalArgumentException2) {
                    break block4;
                }
            }
            string3 = d0.m(string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(string3);
            return ax.X2.v.c(uri, stringBuilder.toString());
        }
        ax.Ha.c.h().f().d("Invalid Tree PATH").l(illegalArgumentException2).g(string).h();
        throw new ax.b3.j(illegalArgumentException2);
    }

    /*
     * WARNING - void declaration
     */
    public static void g(m object, n n8) throws ax.b3.j {
        Exception var2_5;
        Object object2;
        if (n8.isDirectory() && (object2 = ((m)object).b0(n8)) != null && object2.size() > 0) {
            throw new k("DocumentFile Delete Failed : has Children");
        }
        object2 = ((m)object).p();
        try {
            Uri uri = g.l(n8);
            ax.X2.v.f(object2.getContentResolver(), uri);
            return;
        }
        catch (SecurityException securityException) {
        }
        catch (ax.b3.j j8) {
            // empty catch block
        }
        if (var2_5 instanceof SecurityException) {
            if (".$recycle_bin$".equals(d0.h(n8.T()))) {
                ax.Ha.c.h().f().d("CDF3").l((Throwable)var2_5).h();
            } else {
                ax.Ha.c.h().f().d("CDF4").l((Throwable)var2_5).h();
            }
        }
        if (object.z(n8.E()).n()) {
            object = new StringBuilder();
            ((StringBuilder)object).append("DocumentFile delete failed : exist=true, dir=");
            ((StringBuilder)object).append(n8.isDirectory());
            throw d.a(((StringBuilder)object).toString(), (Exception)var2_5);
        }
        throw new t("DocumentFile delete failed : File not exist");
    }

    public static K h(Context context, Uri uri) {
        Object object4;
        Object object2;
        Object object3;
        block9: {
            if (Q.L()) {
                object3 = ax.X2.v.h(uri);
                object2 = j.F();
                object4 = K.e;
                object2 = ((j)object2).Z((K)object4);
                if (object3 == null || object2 == null) break block9;
                try {
                    boolean bl = ((String)object3).startsWith((String)object2);
                    if (bl) {
                        return object4;
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    // empty catch block
                }
            }
        }
        if (j.F().Y() != null) {
            for (Object object4 : j.F().Y()) {
                if (!g.H(context, object4, null, uri)) continue;
                return object4;
            }
        }
        for (Object object4 : j.F().L()) {
            if (!g.H(context, object4, null, uri)) continue;
            return object4;
        }
        object4 = f.p0;
        object3 = f.u0;
        for (int i8 = 0; i8 < 2; ++i8) {
            object2 = K.a((new f[]{object4, object3})[i8], 0);
            if (((K)object2).e() == null || !g.H(context, (K)object2, null, uri)) continue;
            return object2;
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static l i(Context var0, Uri var1_1, String var2_14) throws ax.b3.j {
        block26: {
            block31: {
                block25: {
                    block30: {
                        block29: {
                            block24: {
                                var9_16 = var0 /* !! */ .getContentResolver();
                                var4_17 = var9_16.query(var1_1, l.g, null, null, null);
                                if (var4_17 != null) ** GOTO lbl198
                                var0 /* !! */  = var4_17;
                                var5_18 = var4_17;
                                var6_20 = var4_17;
                                var7_22 = var4_17;
                                try {
                                    ** try [egrp 2[TRYBLOCK] [6, 5, 4 : 40->207)] { 
lbl11:
                                    // 1 sources

                                    break block24;
lbl12:
                                    // 1 sources

                                    catch (RuntimeException var1_3) {
                                        break block25;
                                    }
lbl14:
                                    // 1 sources

                                    catch (SecurityException var1_4) {
                                        ** GOTO lbl221
                                    }
lbl16:
                                    // 1 sources

                                    catch (IllegalArgumentException var1_5) {
                                        ** GOTO lbl226
                                    }
                                }
                                catch (Throwable var1_2) {
                                    break block26;
                                }
                                catch (Throwable var1_8) {
                                    var0 /* !! */  = null;
                                    break block26;
                                }
                                catch (RuntimeException var1_9) {
                                    var5_18 = null;
                                    break block25;
                                }
                                catch (SecurityException var1_10) {
                                    var6_20 = null;
                                    ** GOTO lbl221
                                }
                                catch (IllegalArgumentException var1_11) {
                                    var7_22 = null;
                                    ** GOTO lbl226
                                }
                            }
                            var10_24 = DocumentsContract.getTreeDocumentId((Uri)var1_1);
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            var8_25 = DocumentsContract.getDocumentId((Uri)var1_1);
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            var3_26 = j.Objects.equals((Object)var10_24, (Object)var8_25);
                            if (!var3_26) ** GOTO lbl184
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            var10_24 = new StringBuilder();
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            var10_24.append(var1_1.toString());
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            var10_24.append("$A$B$C$D$E$F$G$H$I$J$K$L");
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            var1_1 = Uri.parse((String)var10_24.toString());
                            var0 /* !! */  = var4_17;
                            var1_1 = var9_16.query(var1_1, new String[]{"document_id"}, null, null, null);
                            if (var1_1 != null) {
                                var0 /* !! */  = var1_1;
                                var5_18 = var1_1;
                                var6_20 = var1_1;
                                var7_22 = var1_1;
                            }
                            ** GOTO lbl93
                            {
                                block28: {
                                    block27: {
                                        catch (Exception var2_15) {
                                            break block27;
                                        }
                                        catch (IllegalArgumentException var1_6) {
                                            break block28;
                                        }
                                        {
                                            ax.Ha.c.h().c("RETRY success for getting file attribute 1").h();
                                            var0 /* !! */  = var1_1;
                                            var5_18 = var1_1;
                                            var6_20 = var1_1;
                                            var7_22 = var1_1;
                                            var2_14 = new l(var8_25, (String)var2_14);
                                        }
                                        F.a((AutoCloseable)var1_1);
                                        return var2_14;
lbl93:
                                        // 1 sources

                                        var0 /* !! */  = var1_1;
                                        var5_18 = var1_1;
                                        var6_20 = var1_1;
                                        var7_22 = var1_1;
                                        var0 /* !! */  = var1_1;
                                        var5_18 = var1_1;
                                        var6_20 = var1_1;
                                        var7_22 = var1_1;
                                        var2_14 = new ax.b3.v("Remote Provider Error");
                                        var0 /* !! */  = var1_1;
                                        var5_18 = var1_1;
                                        var6_20 = var1_1;
                                        var7_22 = var1_1;
                                        throw var2_14;
                                    }
                                    var0 /* !! */  = var4_17;
                                    var5_18 = var4_17;
                                    var6_20 = var4_17;
                                    var7_22 = var4_17;
                                    var0 /* !! */  = var4_17;
                                    var5_18 = var4_17;
                                    var6_20 = var4_17;
                                    var7_22 = var4_17;
                                    var1_1 = new ax.b3.j(var2_15);
                                    var0 /* !! */  = var4_17;
                                    var5_18 = var4_17;
                                    var6_20 = var4_17;
                                    var7_22 = var4_17;
                                    throw var1_1;
                                }
                                var0 /* !! */  = var4_17;
                                var5_18 = var4_17;
                                var6_20 = var4_17;
                                var7_22 = var4_17;
                                if (var1_6.getMessage() != null) {
                                    var0 /* !! */  = var4_17;
                                    var5_18 = var4_17;
                                    var6_20 = var4_17;
                                    var7_22 = var4_17;
                                    if (var1_6.getMessage().contains("No root for")) {
                                        var0 /* !! */  = var4_17;
                                        var5_18 = var4_17;
                                        var6_20 = var4_17;
                                        var7_22 = var4_17;
                                        var0 /* !! */  = var4_17;
                                        var5_18 = var4_17;
                                        var6_20 = var4_17;
                                        var7_22 = var4_17;
                                        var2_14 = new C(var1_6);
                                        var0 /* !! */  = var4_17;
                                        var5_18 = var4_17;
                                        var6_20 = var4_17;
                                        var7_22 = var4_17;
                                        throw var2_14;
                                    }
                                }
                                var0 /* !! */  = var4_17;
                                var5_18 = var4_17;
                                var6_20 = var4_17;
                                var7_22 = var4_17;
                                if (var1_6.getMessage() == null) break block29;
                                var0 /* !! */  = var4_17;
                                var5_18 = var4_17;
                                var6_20 = var4_17;
                                var7_22 = var4_17;
                                if (!var1_6.getMessage().contains("Missing file")) break block29;
                                var0 /* !! */  = var4_17;
                                var5_18 = var4_17;
                                var6_20 = var4_17;
                                var7_22 = var4_17;
                                ax.Ha.c.h().f().c("RETRY success for getting file attribute 2").l(var1_6).h();
                                var0 /* !! */  = var4_17;
                                var5_18 = var4_17;
                                var6_20 = var4_17;
                                var7_22 = var4_17;
                                var1_7 = new l(var8_25, (String)var2_14);
                            }
                            F.a((AutoCloseable)var4_17);
                            return var1_7;
                        }
                        var0 /* !! */  = var4_17;
                        var5_18 = var4_17;
                        var6_20 = var4_17;
                        var7_22 = var4_17;
                        {
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            var2_14 = new ax.b3.j(var1_6);
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            throw var2_14;
lbl184:
                            // 1 sources

                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            var1_1 = new ax.b3.v("Remote Provider Error");
                            var0 /* !! */  = var4_17;
                            var5_18 = var4_17;
                            var6_20 = var4_17;
                            var7_22 = var4_17;
                            throw var1_1;
lbl198:
                            // 1 sources

                            var0 /* !! */  = var4_17;
                            var5_19 = var4_17;
                            var6_21 = var4_17;
                            var7_23 = var4_17;
                            if (!var4_17.moveToFirst()) break block30;
                            var0 /* !! */  = var4_17;
                            var5_19 = var4_17;
                            var6_21 = var4_17;
                            var7_23 = var4_17;
                            var1_1 = new l(var4_17);
                        }
                        F.a((AutoCloseable)var4_17);
                        return var1_1;
                    }
                    F.a((AutoCloseable)var4_17);
                    return null;
                }
                var0 /* !! */  = var5_18;
                {
                    var1_1.printStackTrace();
                    var0 /* !! */  = var5_18;
                    var0 /* !! */  = var5_18;
                    var2_14 = new ax.b3.j((Throwable)var1_1);
                    var0 /* !! */  = var5_18;
                    throw var2_14;
lbl221:
                    // 2 sources

                    var0 /* !! */  = var6_20;
                    var0 /* !! */  = var6_20;
                    var2_14 = new p((Throwable)var1_12);
                    var0 /* !! */  = var6_20;
                    throw var2_14;
lbl226:
                    // 2 sources

                    var0 /* !! */  = var7_22;
                    if (var1_1.getMessage() != null) {
                        var0 /* !! */  = var7_22;
                        if (var1_1.getMessage().contains("No root for")) {
                            var0 /* !! */  = var7_22;
                            var0 /* !! */  = var7_22;
                            var2_14 = new C((Throwable)var1_1);
                            var0 /* !! */  = var7_22;
                            throw var2_14;
                        }
                    }
                    var0 /* !! */  = var7_22;
                    if (var1_1.getMessage() == null) break block31;
                    var0 /* !! */  = var7_22;
                    var3_26 = var1_1.getMessage().contains("Missing file");
                    if (!var3_26) break block31;
                }
                F.a((AutoCloseable)var7_22);
                return null;
            }
            var0 /* !! */  = var7_22;
            {
                var1_1.printStackTrace();
                var0 /* !! */  = var7_22;
                var0 /* !! */  = var7_22;
                var2_14 = new t((Throwable)var1_1);
                var0 /* !! */  = var7_22;
                throw var2_14;
            }
        }
        F.a((AutoCloseable)var0 /* !! */ );
        throw var1_13;
    }

    public static l j(Context context, n n8) throws ax.b3.j {
        return g.i(context, g.l(n8), n8.B());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static k0 k(Context context, m object, K k8, Uri object2) throws ax.b3.j {
        Throwable throwable222;
        block12: {
            block11: {
                String string;
                block14: {
                    block13: {
                        String string2;
                        if (!Q.u()) break block13;
                        string = string2 = d0.Q(k8.e(), "LOST.DIR");
                        if (!object.z(string2).n()) {
                            string2 = d0.Q(k8.e(), ".tempfstat");
                            n n8 = object.z(string2);
                            string = string2;
                            if (!n8.n()) {
                                object.N(n8);
                                string = string2;
                            }
                        }
                        break block14;
                    }
                    string = k8.e();
                }
                object2 = g.e(k8, object2, string);
                k8 = null;
                object = null;
                context = g.o(context, object2, "r");
                if (context == null) break block11;
                object = context;
                k8 = context;
                object2 = Os.fstatvfs((FileDescriptor)context.getFileDescriptor());
                object = context;
                k8 = context;
                long l8 = object2.f_blocks;
                object = context;
                k8 = context;
                long l9 = object2.f_bsize;
                object = context;
                k8 = context;
                object2 = new k0(l8 * l9, l9 * (l8 - object2.f_bavail), 0);
                try {
                    context.close();
                    return object2;
                }
                catch (IOException iOException) {
                    return object2;
                }
            }
            object = context;
            k8 = context;
            try {
                object = context;
                k8 = context;
                object2 = new ax.b3.j("faild to get file descriptor");
                object = context;
                k8 = context;
                throw object2;
            }
            catch (Throwable throwable222) {
                break block12;
            }
            catch (ErrnoException errnoException) {}
            object = k8;
            object = k8;
            object2 = new ax.b3.j(errnoException);
            object = k8;
            throw object2;
        }
        if (object == null) throw throwable222;
        try {
            object.close();
        }
        catch (IOException iOException) {
            throw throwable222;
        }
        throw throwable222;
    }

    public static Uri l(n n8) throws ax.b3.j {
        if (B.P(n8)) {
            y y8 = (y)n8;
            return g.e(y8.B0(), y8.N0(), n8.E());
        }
        if (B.J(n8)) {
            return ((i)n8).n0();
        }
        ax.u3.b.f();
        throw new ax.b3.j("Illegal File Info Class");
    }

    public static Uri m(K k8, String charSequence) {
        if (!f.b0(k8.d()) && !f.Q(k8)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("not reachable root uri : ");
            ((StringBuilder)charSequence).append(k8);
            ax.u3.b.g(((StringBuilder)charSequence).toString());
            return null;
        }
        if ((k8 = g.n(k8, (String)charSequence)) == null) {
            return null;
        }
        return g.c((Uri)k8);
    }

    public static Uri n(K object, String charSequence) {
        if (!f.b0(((K)object).d()) && !f.Q((K)object)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("not reachable root tree : ");
            ((StringBuilder)charSequence).append(object);
            ax.u3.b.g(((StringBuilder)charSequence).toString());
            return null;
        }
        charSequence = charSequence != null && f.Q((K)object) ? d0.m((String)charSequence) : "";
        String string = j.F().Z((K)object);
        if (string == null) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree");
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append((String)charSequence);
        return builder.appendPath(((StringBuilder)object).toString()).build();
    }

    public static ParcelFileDescriptor o(Context context, Uri uri, String string) throws ax.b3.j {
        try {
            context = context.getContentResolver().openFileDescriptor(uri, string);
            return context;
        }
        catch (SQLiteException | IllegalStateException | NullPointerException | SecurityException throwable) {
            throw new ax.b3.j(throwable);
        }
        catch (FileNotFoundException | IllegalArgumentException exception) {
            throw new t(exception);
        }
    }

    private static String p(String string, String string2) {
        if (string2 == null) {
            return null;
        }
        int n8 = string2.indexOf(":");
        if (n8 < 0) {
            return null;
        }
        if (TextUtils.isEmpty((CharSequence)(string2 = string2.substring(n8 + 1)))) {
            return string;
        }
        return d0.Q(string, string2);
    }

    public static String q(Context context, K k8, Uri uri, String string, String string2, l l8) throws ax.b3.j {
        if (f.o0(k8.d())) {
            return g.s(uri, string, string2, l8);
        }
        return g.p(k8.e(), string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String r(Uri object) {
        String string;
        K k8;
        String string2;
        String string3;
        try {
            string3 = ax.X2.v.g(object);
            string2 = g.A(string3);
            if ("primary".equals(string2)) {
                return g.p(K.e.e(), string3);
            }
            if (!j.F().t0()) return null;
            k8 = K.f;
            string = k8.e();
            if (string == null) return null;
        }
        catch (Exception exception) {
            return null;
        }
        string = d0.h(string);
        if (string == null) return null;
        if (!string.equals(string2)) return null;
        return g.p(k8.e(), string3);
    }

    private static String s(Uri object, String string, String string2, l l8) throws ax.b3.j {
        if (Q.k1()) {
            if (object != null) {
                if ((object = DocumentsContract.getTreeDocumentId((Uri)object)) != null && ((String)object).equals(string)) {
                    return "/";
                }
            } else {
                ax.u3.b.f();
            }
            if ((object = l8.b) != null) {
                return d0.Q(string2, (String)object);
            }
            ax.u3.b.f();
            throw new ax.b3.j("No displayname");
        }
        ax.u3.b.f();
        throw new ax.b3.j("not reachable");
    }

    public static InputStream t(Context object, n object2, long l8) throws ax.b3.j {
        block5: {
            object2 = g.o((Context)object, g.l((n)object2), "r");
            object = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor)object2);
            if (l8 == 0L) break block5;
            long l9 = ((InputStream)object).skip(l8);
            if (l9 == l8) break block5;
            try {
                object2 = ax.Ha.c.h().b("Document file SKIP FAILED");
                object = new StringBuilder();
                ((StringBuilder)object).append("offst:");
                ((StringBuilder)object).append(l8);
                ((StringBuilder)object).append(",skipped:");
                ((StringBuilder)object).append(l9);
                ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
                object = new ax.b3.j("AutoCloseInputStream skip failed");
                throw object;
            }
            catch (IOException iOException) {
                throw d.a("document getInputStream", iOException);
            }
            catch (FileNotFoundException fileNotFoundException) {
                throw new t(fileNotFoundException);
            }
        }
        return object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static OutputStream u(e object, n object2, boolean bl) throws IOException, ax.b3.j {
        IllegalArgumentException illegalArgumentException2222;
        Uri uri;
        Context context = ((m)object).p();
        boolean bl2 = object2.n();
        Object object3 = null;
        Object object4 = null;
        if (!bl2) {
            uri = g.d((e)object, (n)object2, false);
            if (uri == null) {
                throw new IOException("Create Document File failed");
            }
            object = object4;
            if (f.b0(((n)object2).P())) {
                object4 = g.l((n)object2);
                object = object4;
                if (!uri.equals(object4)) {
                    object = object4;
                    if (d0.M(((n)object2).B())) {
                        object = d0.g(d0.h(uri.getPath()));
                        if (object != null && ((String)object).endsWith(")") && ((String)object).contains("(")) {
                            object = object4;
                        } else {
                            object3 = ax.Ha.c.h().f().d("UNEXPECTED DOCUMENT FILE NAME 2");
                            object = new StringBuilder();
                            ((StringBuilder)object).append("expected:");
                            ((StringBuilder)object).append(object4);
                            ((StringBuilder)object).append(",created:");
                            ((StringBuilder)object).append(uri);
                            ((ax.Ha.b)object3).g(((StringBuilder)object).toString()).h();
                            object = object4;
                        }
                    }
                }
            }
            object3 = uri;
            object4 = object;
        } else {
            uri = g.l((n)object2);
            object4 = null;
        }
        if (bl) {
            try {
                object = context.getContentResolver().openFileDescriptor(uri, "wa");
                return new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor)object);
            }
            catch (IllegalArgumentException illegalArgumentException2222) {
            }
        }
        object = context.getContentResolver().openFileDescriptor(uri, "wt");
        return new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor)object);
        catch (SecurityException securityException) {
            throw new ax.b3.j(securityException);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("FILE:");
        ((StringBuilder)object).append(object2.n());
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(bl);
        object = object2 = ((StringBuilder)object).toString();
        if (object3 != null) {
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object2);
            ((StringBuilder)object).append(",CREATED:");
            ((StringBuilder)object).append(object3.toString());
            object = ((StringBuilder)object).toString();
        }
        object2 = object;
        if (object4 != null) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(",EXPECTED:");
            ((StringBuilder)object2).append(object4.toString());
            object2 = ((StringBuilder)object2).toString();
        }
        ax.Ha.c.h().f().b("GetOutputStreamForDocumentFile failed").l(illegalArgumentException2222).g(object2).h();
        throw new IOException(illegalArgumentException2222);
    }

    public static Uri v(n n8) throws ax.b3.j {
        if (B.P(n8)) {
            y y8 = (y)n8;
            return g.e(y8.B0(), y8.N0(), n8.T());
        }
        if (B.J(n8)) {
            return ((i)n8).o0();
        }
        ax.u3.b.f();
        throw new ax.b3.j("Illegal File Info Class");
    }

    public static ParcelFileDescriptor w(Context context, n n8) throws ax.b3.j {
        return g.o(context, g.l(n8), "rw");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String x(Context object, K object2, String string) {
        M m82;
        block3: {
            SharedPreferences sharedPreferences;
            try {
                sharedPreferences = object.getSharedPreferences("pref_secondary", 0);
                if (((K)object2).d() == f.p0 && (object = sharedPreferences.getString("secondaryRootUri", null)) != null) {
                    return object;
                }
            }
            catch (M m82) {
                break block3;
            }
            object2 = sharedPreferences.getString(g.y((K)object2, string), null);
            object = object2;
            if (!J.o()) return object;
            object = object2;
            if (object2 == null) return object;
            object = object2;
            if (!((String)object2).startsWith("content://0@com.android.externalstorage.documents")) return object;
            return ((String)object2).replace("0@com.android.externalstorage.documents", "com.android.externalstorage.documents");
        }
        m82.printStackTrace();
        return null;
    }

    private static String y(K object, String charSequence) throws M {
        Object object2 = ((K)object).d();
        if (f.i0(object2)) {
            if (charSequence != null) {
                boolean bl = object2 == f.p0;
                ax.u3.b.c(bl);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("secondaryRootUri:");
                ((StringBuilder)object2).append(((K)object).e());
                ((StringBuilder)object2).append(":");
                ((StringBuilder)object2).append((String)charSequence);
                return ((StringBuilder)object2).toString();
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("secondaryRootUri:");
            ((StringBuilder)charSequence).append(((K)object).e());
            return ((StringBuilder)charSequence).toString();
        }
        if (object2 != f.o0 && object2 != f.s0) {
            if (f.c0(object2)) {
                charSequence = j.F().Z((K)object);
                if (charSequence != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("documentRootUri:");
                    ((StringBuilder)object).append(object2.I());
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append((String)charSequence);
                    return ((StringBuilder)object).toString();
                }
                throw new M("uuid is null");
            }
            if (f.o0(object2)) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("nonExternalRootUri:");
                ((StringBuilder)charSequence).append(object2.I());
                ((StringBuilder)charSequence).append(":");
                ((StringBuilder)charSequence).append(((K)object).b());
                return ((StringBuilder)charSequence).toString();
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("not reachable:");
            ((StringBuilder)charSequence).append(object2.I());
            ax.u3.b.g(((StringBuilder)charSequence).toString());
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("documentRootUri:");
            ((StringBuilder)charSequence).append(object2.I());
            ((StringBuilder)charSequence).append(":");
            ((StringBuilder)charSequence).append(((K)object).b());
            return ((StringBuilder)charSequence).toString();
        }
        if (charSequence != null) {
            object2 = j.F().Z((K)object);
            if (object2 != null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("primaryRootUri:");
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append(":");
                ((StringBuilder)object).append((String)charSequence);
                return ((StringBuilder)object).toString();
            }
            throw new M("uuid is null");
        }
        ax.Ha.c.h().f().b("ROOT URI PREF NULL ROOT").j().h();
        throw new M("no rootTreePath");
    }

    public static String z(String string) {
        if (string == null) {
            return null;
        }
        int n8 = string.indexOf(":");
        if (n8 < 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("/");
        stringBuilder.append(string.substring(n8 + 1));
        return stringBuilder.toString();
    }
}

