/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import ax.Q2.f;
import ax.X2.Q;
import ax.Z2.k;
import ax.b3.h;
import ax.b3.j;
import ax.b3.r;
import ax.b3.t;
import ax.c3.B;
import ax.c3.K;
import ax.c3.d0;
import ax.c3.v;
import ax.c3.x;
import ax.o3.b;
import ax.u3.q;
import com.voxdon.xplorer.file.g;
import com.voxdon.xplorer.file.i;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.o;
import com.voxdon.xplorer.file.y;
import com.voxdon.xplorer.provider.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

public class MyFileProvider
extends ContentProvider {
    private static final Logger d = Logger.getLogger("FileManager.MyFileProvider");
    private static final String[] e = new String[]{"_display_name", "_size", "_data"};
    private static final String[] f = new String[]{"_display_name", "_size"};
    private static boolean g;
    private static MyFileProvider h;
    private Handler a = new Handler(Looper.getMainLooper());
    private a b;
    private final HashMap<Uri, n> c = new HashMap();

    public static boolean A(Uri uri) {
        if (!"com.voxdon.xplorer.fileprovider".equals(uri.getAuthority())) {
            return false;
        }
        return com.voxdon.xplorer.provider.MyFileProvider$c.b(uri).i();
    }

    public static boolean B(Uri uri) {
        if (!"com.voxdon.xplorer.fileprovider".equals(uri.getAuthority())) {
            return false;
        }
        return com.voxdon.xplorer.provider.MyFileProvider$c.b(uri).k();
    }

    public static boolean C(Uri uri) {
        return MyFileProvider.D(uri) && "1".equals(uri.getQueryParameter("motion_photo"));
    }

    public static boolean D(Uri uri) {
        if (uri == null) {
            return false;
        }
        return "com.voxdon.xplorer.fileprovider".equals(uri.getAuthority());
    }

    public static boolean E(Uri uri) {
        if (!"com.voxdon.xplorer.fileprovider".equals(uri.getAuthority())) {
            return false;
        }
        return com.voxdon.xplorer.provider.MyFileProvider$c.b(uri).l();
    }

    private static int F(String string) {
        if ("r".equals(string)) {
            return 0x10000000;
        }
        if (!"w".equals(string) && !"wt".equals(string)) {
            if ("wa".equals(string)) {
                return 0x2A000000;
            }
            if ("rw".equals(string)) {
                return 0x38000000;
            }
            if ("rwt".equals(string)) {
                return 0x3C000000;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid mode: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return 0x2C000000;
    }

    private ParcelFileDescriptor G(File file, String string) throws FileNotFoundException {
        int n8 = MyFileProvider.F(string);
        try {
            b.d d8 = ax.o3.b.j().k();
            d8.b(file);
            string = this.a;
            ParcelFileDescriptor.OnCloseListener onCloseListener = new ParcelFileDescriptor.OnCloseListener(){
                final b.d a;
                final File b;
                final MyFileProvider c;
                {
                    this.c = myFileProvider;
                    this.a = d8;
                    this.b = file;
                }

                public void onClose(IOException iOException) {
                    this.a.a(this.b, iOException);
                }
            };
            file = ParcelFileDescriptor.open((File)file, (int)n8, (Handler)string, (ParcelFileDescriptor.OnCloseListener)onCloseListener);
            return file;
        }
        catch (IOException iOException) {
            throw new FileNotFoundException(iOException.getMessage());
        }
    }

    private ParcelFileDescriptor H(c object, String string) throws FileNotFoundException {
        int n8 = MyFileProvider.F(string);
        if ((object = ((c)object).d()) != null) {
            try {
                object = this.q().b((k)object, n8);
                return object;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                throw new FileNotFoundException(iOException.getMessage());
            }
        }
        ax.u3.b.g("location uri is not valid");
        throw new FileNotFoundException("location uri is not valid");
    }

    private MatrixCursor b(String[] stringArray) {
        String[] stringArray2 = stringArray;
        if (stringArray == null) {
            stringArray2 = f;
        }
        return new MatrixCursor(stringArray2, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private MatrixCursor c(String[] objectArray, n matrixCursor) {
        Object[] objectArray2 = objectArray;
        if (objectArray == null) {
            objectArray2 = f;
        }
        String[] stringArray = new String[objectArray2.length];
        objectArray = new Object[objectArray2.length];
        int n8 = objectArray2.length;
        int n9 = 0;
        int n10 = 0;
        while (true) {
            int n11;
            block10: {
                block7: {
                    Object object;
                    block9: {
                        block8: {
                            block6: {
                                if (n9 >= n8) {
                                    matrixCursor = MyFileProvider.g(stringArray, n10);
                                    objectArray = MyFileProvider.f(objectArray, n10);
                                    matrixCursor = new MatrixCursor((String[])matrixCursor, 1);
                                    matrixCursor.addRow(objectArray);
                                    return matrixCursor;
                                }
                                object = objectArray2[n9];
                                if (!"_display_name".equals(object)) break block6;
                                stringArray[n10] = "_display_name";
                                n11 = n10 + 1;
                                objectArray[n10] = matrixCursor.B();
                                n10 = n11;
                                break block7;
                            }
                            if (!"_size".equals(object)) break block8;
                            stringArray[n10] = "_size";
                            n11 = n10 + 1;
                            objectArray[n10] = matrixCursor.p();
                            n10 = n11;
                            break block7;
                        }
                        if (!"mime_type".equals(object)) break block9;
                        stringArray[n10] = "mime_type";
                        n11 = n10 + 1;
                        objectArray[n10] = matrixCursor.s();
                        n10 = n11;
                        break block7;
                    }
                    n11 = n10;
                    if (!"_data".equals(object)) break block10;
                    stringArray[n10] = "_data";
                    n11 = n10 + 1;
                    objectArray[n10] = null;
                    n10 = n11;
                }
                n11 = n10;
            }
            ++n9;
            n10 = n11;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private MatrixCursor d(Uri uri, String[] objectArray) {
        Object[] objectArray2 = objectArray;
        if (objectArray == null) {
            objectArray2 = f;
        }
        String[] stringArray = new String[objectArray2.length];
        objectArray = new Object[objectArray2.length];
        c c8 = com.voxdon.xplorer.provider.MyFileProvider$c.b(uri);
        long l8 = MyFileProvider.o(uri, "length");
        int n8 = objectArray2.length;
        int n9 = 0;
        int n10 = 0;
        while (true) {
            int n11;
            block10: {
                block7: {
                    Object object;
                    block9: {
                        block8: {
                            block6: {
                                if (n9 >= n8) {
                                    uri = new MatrixCursor(MyFileProvider.g(stringArray, n10), 1);
                                    uri.addRow(MyFileProvider.f(objectArray, n10));
                                    return uri;
                                }
                                object = objectArray2[n9];
                                if (!"_display_name".equals(object)) break block6;
                                stringArray[n10] = "_display_name";
                                n11 = n10 + 1;
                                object = new StringBuilder();
                                ((StringBuilder)object).append(new File(c8.d).getName());
                                ((StringBuilder)object).append(".mp4");
                                objectArray[n10] = ((StringBuilder)object).toString();
                                n10 = n11;
                                break block7;
                            }
                            if (!"_size".equals(object)) break block8;
                            stringArray[n10] = "_size";
                            n11 = n10 + 1;
                            objectArray[n10] = l8;
                            n10 = n11;
                            break block7;
                        }
                        if (!"mime_type".equals(object)) break block9;
                        stringArray[n10] = "mime_type";
                        n11 = n10 + 1;
                        objectArray[n10] = MyFileProvider.n(uri);
                        n10 = n11;
                        break block7;
                    }
                    n11 = n10;
                    if (!"_data".equals(object)) break block10;
                    stringArray[n10] = "_data";
                    n11 = n10 + 1;
                    objectArray[n10] = null;
                    n10 = n11;
                }
                n11 = n10;
            }
            ++n9;
            n10 = n11;
        }
    }

    public static k e(Uri uri) {
        if (!"com.voxdon.xplorer.fileprovider".equals(uri.getAuthority())) {
            return null;
        }
        return com.voxdon.xplorer.provider.MyFileProvider$c.b(uri).d();
    }

    private static Object[] f(Object[] objectArray, int n8) {
        Object[] objectArray2 = new Object[n8];
        System.arraycopy(objectArray, 0, objectArray2, 0, n8);
        return objectArray2;
    }

    private static String[] g(String[] stringArray, int n8) {
        String[] stringArray2 = new String[n8];
        System.arraycopy(stringArray, 0, stringArray2, 0, n8);
        return stringArray2;
    }

    private void h(c c8) throws j {
        Object object = c8.e();
        if (object != null) {
            if (((o)(object = x.e((K)object))).a()) {
                try {
                    ((o)object).n0();
                    ((o)object).P(((o)object).z(c8.d));
                    return;
                }
                finally {
                    ((o)object).k0(true);
                }
            }
            throw new j("Not connected");
        }
        throw new j("Bad Uri");
    }

    public static Uri i(Uri object) {
        object = com.voxdon.xplorer.provider.MyFileProvider$c.b((Uri)object);
        ax.u3.b.c(((c)object).k());
        return MyFileProvider.u("external_files", ((c)object).d);
    }

    private ParcelFileDescriptor j(c object, String string) throws j, FileNotFoundException {
        Object object2 = ((c)object).e();
        if (object2 != null) {
            if (!((o)(object2 = x.e((K)object2))).a()) {
                if (!ax.Q2.f.e0(((o)object2).S()) && !ax.Q2.f.o0(((o)object2).S())) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("not document location?");
                    ((StringBuilder)object).append(((o)object2).S().I());
                    ax.u3.b.g(((StringBuilder)object).toString());
                    throw new h("Not connected");
                }
                ((o)object2).h(null);
                if (!((o)object2).a()) {
                    throw new h("Not connected");
                }
            }
            try {
                ((o)object2).n0();
                object = com.voxdon.xplorer.file.g.l(((o)object2).z(((c)object).d));
                object = com.voxdon.xplorer.file.g.o(this.getContext(), (Uri)object, string);
                return object;
            }
            finally {
                ((o)object2).k0(false);
            }
        }
        throw new j("Bad Uri");
    }

    private static n k(c object) throws j {
        Object object2;
        if (!((c)object).j() && !((c)object).i()) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(((c)object).c);
            ((StringBuilder)object2).append(":");
            ((StringBuilder)object2).append(((c)object).d);
            ax.u3.b.g(((StringBuilder)object2).toString());
        }
        if ((object2 = ((c)object).e()) != null) {
            if (((o)(object2 = x.e((K)object2))).a()) {
                try {
                    ((o)object2).n0();
                    object = ((o)object2).z(((c)object).d);
                    return object;
                }
                finally {
                    ((o)object2).k0(false);
                }
            }
            throw new j("Not connected");
        }
        throw new j("Bad Uri");
    }

    public static MyFileProvider l() {
        return h;
    }

    public static File m(Uri uri) {
        return com.voxdon.xplorer.provider.MyFileProvider$c.b(uri).c();
    }

    private static String n(Uri object) {
        if (!TextUtils.isEmpty((CharSequence)(object = object.getQueryParameter("mimetype")))) {
            return object;
        }
        return "video/mp4";
    }

    private static long o(Uri object, String string) {
        if ((object = object.getQueryParameter(string)) == null) {
            return -1L;
        }
        try {
            long l8 = Long.parseLong((String)object);
            return l8;
        }
        catch (NumberFormatException numberFormatException) {
            return -1L;
        }
    }

    public static Uri p(n n8, long l8, long l9, String string) {
        if (B.H(n8) && l8 >= 0L && l9 > 0L) {
            n8 = n8 instanceof y ? MyFileProvider.t((y)n8) : com.voxdon.xplorer.provider.MyFileProvider$c.g(n8);
            return n8.buildUpon().appendQueryParameter("motion_photo", "1").appendQueryParameter("offset", Long.toString(l8)).appendQueryParameter("length", Long.toString(l9)).appendQueryParameter("mimetype", string).build();
        }
        throw new IllegalArgumentException("Invalid Motion Photo video range");
    }

    private a q() {
        this.z();
        return this.b;
    }

    public static Uri r(i i8) {
        return com.voxdon.xplorer.provider.MyFileProvider$c.g(i8);
    }

    public static Uri s(File file) {
        return MyFileProvider.u("root", file.getAbsolutePath());
    }

    public static Uri t(y y8) {
        return MyFileProvider.s(y8.F0());
    }

    private static Uri u(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Uri.encode((String)string));
        stringBuilder.append(Uri.encode((String)string2, (String)"/"));
        string = stringBuilder.toString();
        return new Uri.Builder().scheme("content").authority("com.voxdon.xplorer.fileprovider").encodedPath(string).build();
    }

    public static Uri v(y y8) {
        return com.voxdon.xplorer.provider.MyFileProvider$c.h(y8);
    }

    public static Uri w(y y8) {
        return MyFileProvider.s(y8.F0());
    }

    public static Uri x(n n8) {
        Uri uri = com.voxdon.xplorer.provider.MyFileProvider$c.g(n8);
        MyFileProvider myFileProvider = h;
        if (myFileProvider != null) {
            myFileProvider.a(uri, n8);
        }
        return uri;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void y(Context context) {
        if (context == null) return;
        if (g) return;
        try {
            context.grantUriPermission("com.android.systemui", Uri.parse((String)"content://com.voxdon.xplorer.fileprovider/"), 129);
            g = true;
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    void a(Uri uri, n n8) {
        this.c.put(uri, n8);
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    public int delete(Uri object, String string, String[] stringArray) {
        if (((c)(object = com.voxdon.xplorer.provider.MyFileProvider$c.b((Uri)object))).k()) {
            return ((c)object).c().delete() ? 1 : 0;
        }
        if (((c)object).l()) {
            ax.Ha.c.i(this.getContext()).f().b("PROXY FILE DELETE REQUESTED").h();
            return 0;
        }
        try {
            this.h((c)object);
            return 1;
        }
        catch (j j8) {
            return 0;
        }
    }

    public String getType(Uri uri) {
        if (MyFileProvider.C(uri)) {
            return MyFileProvider.n(uri);
        }
        return com.voxdon.xplorer.provider.MyFileProvider$c.b(uri).f();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        ax.Q2.b.k(this.getContext());
        h = this;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public AssetFileDescriptor openAssetFile(Uri uri, String string) throws FileNotFoundException {
        if (!MyFileProvider.C(uri)) {
            return super.openAssetFile(uri, string);
        }
        if (!"r".equals(string)) throw new FileNotFoundException("Motion Photo is read-only");
        long l8 = MyFileProvider.o(uri, "offset");
        long l9 = MyFileProvider.o(uri, "length");
        if (l8 < 0L || l9 <= 0L || l8 > Long.MAX_VALUE - l9) throw new FileNotFoundException("Invalid Motion Photo video range");
        if ((uri = this.openFile(uri.buildUpon().clearQuery().build(), "r")) == null) throw new FileNotFoundException("Unable to open Motion Photo");
        long l10 = uri.getStatSize();
        if (l10 < 0L || l8 + l9 <= l10) return new AssetFileDescriptor((ParcelFileDescriptor)uri, l8, l9);
        try {
            uri.close();
        }
        catch (IOException iOException) {
            throw new FileNotFoundException("Motion Photo video range exceeds file size");
        }
        throw new FileNotFoundException("Motion Photo video range exceeds file size");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public ParcelFileDescriptor openFile(Uri var1_1, String var2_5) throws FileNotFoundException {
        block22: {
            block21: {
                block20: {
                    block23: {
                        block19: {
                            ax.Q2.b.f(this.getContext(), false);
                            if (MyFileProvider.C((Uri)var1_1)) break block22;
                            this.getContext();
                            var1_1 = com.voxdon.xplorer.provider.MyFileProvider$c.b((Uri)var1_1);
                            if (!Q.V1()) {
                                return this.G(var1_1.c(), var2_5);
                            }
                            if (!var1_1.k()) break block23;
                            var1_1 = var1_1.c();
                            var3_6 = x.f((File)var1_1);
                            try {
                                var3_6 = (y)var3_6.z(var1_1.getAbsolutePath());
                                if (var3_6 == null) ** GOTO lbl20
                                try {
                                    block24: {
                                        if (var3_6.d1()) {
                                            return com.voxdon.xplorer.shizuku.c.t().w(var3_6.E());
                                        }
                                        break block24;
                                        catch (j var1_2) {
                                            break block19;
                                        }
                                    }
                                    if (var3_6 != null && var3_6.i0() && this.getContext() != null) {
                                        var3_6 = com.voxdon.xplorer.file.g.l((n)var3_6);
                                        var3_6 = this.getContext().getContentResolver().openFileDescriptor((Uri)var3_6, var2_5);
                                        if (var3_6 != null) {
                                            return var3_6.dup();
                                        }
                                        return null;
                                    }
                                    var3_6 = this.G((File)var1_1, var2_5);
                                    return var3_6;
                                }
                                catch (r | IOException var3_7) {
                                    var1_1 = this.G((File)var1_1, var2_5);
                                    return var1_1;
                                }
                            }
                            catch (SecurityException var1_3) {
                                throw new FileNotFoundException();
                            }
                        }
                        var1_2.printStackTrace();
                        throw new FileNotFoundException();
                    }
                    if (var1_1.l()) {
                        if (Q.t1()) {
                            return this.H((c)var1_1, var2_5);
                        }
                        ax.u3.b.g("API VERSION NOT SUPPORTED");
                        throw new FileNotFoundException("API VERSION NOT SUPPORTED");
                    }
                    try {
                        var3_8 = this.j((c)var1_1, var2_5);
                        if (var3_8 != null) {
                            var3_8 = var3_8.dup();
                            return var3_8;
                        }
                    }
                    catch (IOException var1_4) {
                        break block20;
                    }
                    catch (j var3_9) {
                        break block21;
                    }
                    return null;
                }
                throw new FileNotFoundException(var1_4.getMessage());
            }
            if (!(var3_9 instanceof t) && !(var3_9 instanceof h)) {
                if (var3_9 instanceof r) {
                    var4_10 = ax.Ha.c.h().f().b("MyFileProvider error 1").l(var3_9);
                    var5_11 = new StringBuilder();
                    var5_11.append("uri:");
                    var5_11.append(var1_1.d);
                    var4_10.g(var5_11.toString()).h();
                } else {
                    ax.Ha.c.h().f().b("MyFileProvider error 2").l(var3_9).h();
                }
            }
            if (var1_1.j()) {
                return this.G(var1_1.c(), var2_5);
            }
            throw new FileNotFoundException(var3_9.getMessage());
        }
        throw new FileNotFoundException("Motion Photo must be opened as an asset file");
    }

    public Cursor query(Uri object, String[] objectArray, String object2, String[] object3, String object4) {
        object2 = this.getContext();
        int n8 = 0;
        ax.Q2.b.f((Context)object2, false);
        if (MyFileProvider.C((Uri)object)) {
            return this.d((Uri)object, (String[])objectArray);
        }
        object2 = com.voxdon.xplorer.provider.MyFileProvider$c.b((Uri)object);
        if (((c)object2).k()) {
            int n9;
            object3 = ((c)object2).c();
            object = x.f((File)object3);
            try {
                int n10 = ((y)((o)object).z(((File)object3).getAbsolutePath())).a1();
                n9 = n10 ^ 1;
            }
            catch (j j8) {
                n9 = 1;
            }
            object = objectArray;
            if (objectArray == null) {
                object = n9 != 0 ? e : f;
            }
            String[] stringArray = new String[((Object)object).length];
            objectArray = new Object[((Object)object).length];
            int n11 = ((Object)object).length;
            int n12 = 0;
            while (n8 < n11) {
                object4 = object[n8];
                if ("_display_name".equals(object4)) {
                    stringArray[n12] = "_display_name";
                    n9 = n12 + 1;
                    objectArray[n12] = ((File)object3).getName();
                } else if ("_size".equals(object4)) {
                    stringArray[n12] = "_size";
                    n9 = n12 + 1;
                    objectArray[n12] = ((File)object3).length();
                } else if ("_data".equals(object4)) {
                    stringArray[n12] = "_data";
                    objectArray[n12] = ((File)object3).getAbsolutePath();
                    n9 = n12 + 1;
                } else {
                    n9 = n12;
                    if ("mime_type".equals(object4)) {
                        stringArray[n12] = "mime_type";
                        n9 = n12 + 1;
                        objectArray[n12] = ((c)object2).f();
                    }
                }
                ++n8;
                n12 = n9;
            }
            object = MyFileProvider.g(stringArray, n12);
            objectArray = MyFileProvider.f(objectArray, n12);
            object = new MatrixCursor((String[])object, 1);
            object.addRow(objectArray);
            return object;
        }
        if (((c)object2).l()) {
            if ((object = this.c.get(object)) != null) {
                return this.c((String[])objectArray, (n)object);
            }
            object3 = new CountDownLatch(1);
            object = new b((c)object2, (CountDownLatch)object3);
            ((q)object).i(new Void[0]);
            try {
                ((CountDownLatch)object3).await();
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            object = ((b)object).x();
            if (object != null) {
                return this.c((String[])objectArray, (n)object);
            }
            return this.b((String[])objectArray);
        }
        try {
            object = this.c((String[])objectArray, MyFileProvider.k((c)object2));
            return object;
        }
        catch (j j9) {
            throw new IllegalStateException(j9);
        }
    }

    public int update(Uri uri, ContentValues contentValues, String string, String[] stringArray) {
        throw new UnsupportedOperationException("No external updates");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void z() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        a a8;
                        if (this.b != null) break block4;
                        this.b = a8 = new a(this.getContext());
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    static class b
    extends q<Void, Void, n> {
        c h;
        CountDownLatch i;
        n j;
        boolean k = ax.u3.B.H();

        b(c c8, CountDownLatch countDownLatch) {
            super(q.e.d0);
            this.h = c8;
            this.i = countDownLatch;
        }

        @Override
        protected void o() {
            this.i.countDown();
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected n w(Void ... object) {
            try {
                object = this.h.e();
                if (object == null) {
                    return null;
                }
                if (!((o)(object = x.e((K)object))).a()) {
                    if (this.k) {
                        ax.Ha.c.h().f().b("PROXY FILE OPERATOR NOT CONNECTED").h();
                        return null;
                    }
                    boolean bl = ((o)object).i(0L);
                    if (!bl) {
                        return null;
                    }
                }
            }
            catch (j j8) {
                return null;
            }
            try {
                ((o)object).n0();
                n n8 = ((o)object).z(this.h.d);
                return n8;
            }
            finally {
                ((o)object).k0(false);
            }
        }

        n x() {
            return this.j;
        }

        protected void y(n n8) {
            this.j = n8;
            this.i.countDown();
        }
    }

    static class c {
        private K a;
        private boolean b;
        String c;
        String d;

        c(Uri object) {
            object = object.getEncodedPath();
            if (object != null) {
                boolean bl = true;
                int n8 = ((String)object).indexOf(47, 1);
                this.c = Uri.decode((String)((String)object).substring(1, n8));
                this.d = Uri.decode((String)((String)object).substring(n8));
                boolean bl2 = bl;
                if (!"root".equals(this.c)) {
                    bl2 = "external_files".equals(this.c) ? bl : false;
                }
                this.b = bl2;
                if (bl2) {
                    this.a = x.g(this.d).T();
                    return;
                }
                this.a = K.h(this.c);
            }
        }

        private static String a(K k8, String string) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Uri.encode((String)k8.k()));
            stringBuilder.append(Uri.encode((String)string, (String)"/"));
            return stringBuilder.toString();
        }

        static c b(Uri uri) {
            return new c(uri);
        }

        static Uri g(n object) {
            object = com.voxdon.xplorer.provider.MyFileProvider$c.a(((n)object).R(), ((n)object).E());
            return new Uri.Builder().scheme("content").authority("com.voxdon.xplorer.fileprovider").encodedPath((String)object).build();
        }

        static Uri h(y object) {
            object = com.voxdon.xplorer.provider.MyFileProvider$c.a(((y)object).B0(), ((n)object).E());
            return new Uri.Builder().scheme("content").authority("com.voxdon.xplorer.fileprovider").encodedPath((String)object).build();
        }

        File c() {
            return new File(this.d).getAbsoluteFile();
        }

        k d() {
            K k8 = this.e();
            if (k8 == null) {
                ax.u3.b.f();
                return null;
            }
            return new k(k8, this.d);
        }

        K e() {
            return this.a;
        }

        String f() {
            String string = this.d;
            if (string != null && (string = v.f(d0.k(string))) != null) {
                return string;
            }
            return "application/octet-stream";
        }

        boolean i() {
            K k8;
            if (!this.b && (k8 = this.a) != null) {
                return ax.Q2.f.b0(k8.d()) || ax.Q2.f.o0(this.a.d());
                {
                }
            }
            return false;
        }

        boolean j() {
            K k8;
            if (!this.b && (k8 = this.a) != null) {
                return ax.Q2.f.j0(k8.d());
            }
            return false;
        }

        boolean k() {
            return this.b;
        }

        boolean l() {
            K k8;
            if (!this.b && (k8 = this.a) != null) {
                return ax.Q2.f.n0(k8.d());
            }
            return false;
        }
    }
}

