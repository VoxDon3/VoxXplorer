/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.file;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import ax.X2.Q;
import ax.Z2.s;
import ax.b3.j;
import ax.c3.A;
import ax.c3.B;
import ax.c3.E;
import ax.c3.G;
import ax.c3.d0;
import ax.c3.k0;
import ax.c3.q;
import ax.c7.a;
import ax.d3.L;
import ax.e7.a;
import ax.g3.h;
import ax.g3.i;
import ax.g3.k;
import ax.i7.g;
import ax.i7.t;
import ax.i7.y;
import ax.o7.a;
import ax.u3.q;
import com.voxdon.xplorer.file.T;
import com.voxdon.xplorer.file.c;
import com.voxdon.xplorer.file.m;
import com.voxdon.xplorer.file.n;
import com.voxdon.xplorer.file.p;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;

public class r
extends m {
    private static final Logger n = Logger.getLogger("FileManager.GoogleDriveFileHelper");
    private static c o;
    private ax.o7.a h;
    private String i;
    private boolean j;
    private j.ConcurrentHashMap<String, n> k = new j.ConcurrentHashMap();
    private j.ConcurrentHashMap<String, String> l = new j.ConcurrentHashMap();
    private e m;

    public static c A0(Context context) {
        if (o == null) {
            o = new c(context.getApplicationContext());
        }
        return o;
    }

    private String B0(n n8) throws j {
        String string;
        String string2 = string = ((E)n8).h0();
        if (string == null) {
            if (!((E)(n8 = (E)this.z(n8.T()))).n()) {
                return null;
            }
            string2 = this.y0((E)n8);
        }
        return this.r0(string2);
    }

    private E C0(ax.p7.c object, String string, String object2, String string2) throws IOException {
        if (((ax.p7.c)object).w() != null && ((ax.p7.c)object).w().size() > 0) {
            String string3;
            if (this.E0((String)(object = ((ax.p7.c)object).w().get(0)))) {
                return new E(this, "/");
            }
            if (string2 != null && string2.equals(object)) {
                object = string;
                string3 = object2;
            } else {
                string3 = (String)this.l.get(object);
            }
            if (string3 != null && this.k.containsKey((Object)string3)) {
                return (E)this.k.get((Object)string3);
            }
            object = (ax.p7.c)this.h.n().d((String)object).H("kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed").execute();
            object2 = this.C0((ax.p7.c)object, string, (String)object2, string2);
            string = d0.Q(((n)object2).E(), r.J0((ax.p7.c)object));
            object = new E(this, ((E)object2).t(), this.y0((E)object2), (ax.p7.c)object, string);
            this.k.put((Object)string, object);
            this.l.put((Object)((E)object).t(), (Object)((n)object).E());
            return object;
        }
        return this.t0();
    }

    private String D0(ArrayList<d> arrayList, String object, String object2, String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        while (object != null) {
            block7: {
                if (((String)object).equals(string2)) {
                    stringBuilder.insert(0, string);
                    break;
                }
                int n8 = arrayList.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    object2 = arrayList.get(i8);
                    d d8 = (d)object2;
                    if (!((String)object).equals(d8.a.r())) continue;
                    object2 = d8.b;
                    stringBuilder.insert(0, d8.a.v());
                    stringBuilder.insert(0, "/");
                    break block7;
                }
                object2 = object;
            }
            if (object2 == null) {
                ax.u3.b.e("what case is this?");
                break;
            }
            if (((String)object2).equals(this.i) || ((String)object2).equals("root")) break;
            if ("no-parent-id".equals(object2)) {
                stringBuilder.insert(0, ".hidden-system-folder");
                stringBuilder.insert(0, "/");
                break;
            }
            if (((String)object2).equals(object)) {
                ax.u3.b.e("what case is this?");
                break;
            }
            object = object2;
        }
        if (stringBuilder.length() == 0) {
            return null;
        }
        return stringBuilder.toString();
    }

    private boolean E0(String string) {
        String string2;
        return "root".equals(string) || (string2 = this.i) != null && string2.equals(string);
        {
        }
    }

    public static String F0(String string) {
        if (string == null) {
            return null;
        }
        return string.replace('/', '_');
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List<ax.p7.c> H0(String object) throws IOException {
        synchronized (this) {
            ArrayList<ax.p7.c> arrayList;
            try {
                int n8;
                arrayList = new ArrayList<ax.p7.c>();
                object = this.h.n().e().I("nextPageToken, files(kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed)").K((String)object);
                do {
                    IOException iOException2;
                    block8: {
                        ax.p7.d d8;
                        try {
                            d8 = (ax.p7.d)((ax.g7.b)object).execute();
                            Iterator<ax.p7.c> iterator = d8.n().iterator();
                            while (iterator.hasNext()) {
                                arrayList.add(iterator.next());
                            }
                        }
                        catch (IOException iOException2) {
                            break block8;
                        }
                        ((a.c.d)object).J(d8.o());
                        continue;
                    }
                    iOException2.printStackTrace();
                    ((a.c.d)object).J(null);
                } while (((a.c.d)object).G() != null && (n8 = ((a.c.d)object).G().length()) > 0);
            }
            catch (Throwable throwable) {}
            return arrayList;
            throw throwable;
        }
    }

    private void I0(String string) {
        for (String string2 : this.k.keySet()) {
            if (!string2.startsWith(string)) continue;
            this.k.remove((Object)string2);
        }
    }

    public static String J0(ax.p7.c c8) {
        return r.F0(c8.v());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void K0(n var1_1, G var2_20, String var3_22, long var4_23, Long var6_24, boolean var7_25, boolean var8_26, ax.u3.c var9_27, i var10_28) throws j, ax.b3.a {
        block36: {
            block32: {
                block34: {
                    block33: {
                        block31: {
                            var12_29 = new ax.p7.c();
                            var12_29.G(var1_1.B());
                            var12_29.E((String)var3_22);
                            if (var6_24 != null && var6_24.longValue() > 0L) {
                                var12_29.F(new ax.m7.i(var6_24.longValue()));
                            }
                            var11_30 = var8_26 != false && var1_1.t() != null;
                            var2_20 = var2_20.b();
                            var14_32 = new BufferedInputStream((InputStream)var2_20);
                            var13_31 = new y((String)var3_22, var14_32);
                            if (var4_23 == -1L) break block31;
                            try {
                                var13_31.i(var4_23);
                            }
                            catch (Throwable var1_2) {
                                break block32;
                            }
                            catch (IllegalArgumentException var1_3) {
                                ** GOTO lbl92
                            }
                            catch (NullPointerException var1_5) {
                                ** GOTO lbl92
                            }
                            catch (SecurityException var1_6) {
                                ** GOTO lbl92
                            }
                            catch (IOException var1_7) {
                                ** GOTO lbl92
                            }
                        }
                        var13_31.h(false);
                        if (!var11_30) break block33;
                        {
                            var1_1 = this.y0((E)var1_1);
                            var1_1 = this.h.n().g((String)var1_1, var12_29, var13_31);
                            ** GOTO lbl-1000
                        }
                    }
                    var1_1 = this.B0((n)var1_1);
                    if (var1_1 == null) ** GOTO lbl90
                    var12_29.H(Arrays.asList(new String[]{var1_1}));
                    var1_1 = this.h.n().c(var12_29, var13_31);
lbl-1000:
                    // 2 sources

                    {
                        if (var6_24 == null || var6_24.longValue() <= 0L) break block34;
                        var1_1.E("setModifiedDate", Boolean.TRUE);
                    }
                }
                var6_24 = var1_1.r();
                var6_24.n(false);
                var6_24.m(0x100000);
                try {
                    var3_22 = new ax.f7.c(){
                        final ax.u3.c a;
                        final InputStream b;
                        final i c;
                        final long d;
                        final r e;
                        {
                            this.e = r8;
                            this.a = c8;
                            this.b = inputStream;
                            this.c = i8;
                            this.d = l8;
                        }

                        @Override
                        public void a(ax.f7.b b8) throws IOException {
                            if (b8 != null) {
                                int n8;
                                Object object = this.a;
                                if (object != null && object.isCancelled()) {
                                    this.b.close();
                                }
                                if ((n8 = b.a[b8.i().ordinal()]) != 1) {
                                    if (n8 == 2 && (object = this.c) != null) {
                                        object.a(b8.h(), this.d);
                                        return;
                                    }
                                } else {
                                    object = this.c;
                                    if (object != null) {
                                        object.a(b8.h(), this.d);
                                    }
                                }
                            }
                        }
                    };
                    var6_24.s(var3_22);
                    var1_1 = (ax.p7.c)var1_1.execute();
                    if (var9_27 != null && var9_27.isCancelled()) {
                        var1_1 = new ax.b3.a();
                        throw var1_1;
                    }
                }
                catch (Throwable var1_8) {
                    break block32;
                }
                {
                    block35: {
                        catch (IllegalArgumentException var1_10) {
                            break block35;
                        }
                        catch (NullPointerException var1_11) {
                            break block35;
                        }
                        catch (SecurityException var1_12) {
                            break block35;
                        }
                        catch (IOException var1_13) {
                            break block35;
                        }
                        if (var1_1 == null) ** GOTO lbl-1000
                        if (var2_20 == null) return;
                        var2_20.close();
                        return;
lbl-1000:
                        // 1 sources

                        {
                            var1_1 = new j("GoogleDrive insert() returns null");
                            throw var1_1;
                            catch (Throwable var1_14) {
                                break block32;
                            }
                            catch (IllegalArgumentException var1_15) {
                                break block35;
                            }
                            catch (NullPointerException var1_16) {
                                break block35;
                            }
                            catch (SecurityException var1_17) {
                                break block35;
                            }
                            catch (IOException var1_18) {
                                break block35;
                            }
lbl90:
                            // 1 sources

                            var1_1 = new j("Dst parent not found");
                            throw var1_1;
                        }
                    }
                    if (var9_27 == null) throw this.s0("googledrive write file", var1_4);
                    if (var9_27.isCancelled() == false) throw this.s0("googledrive write file", var1_4);
                    var1_4 = new ax.b3.a();
                    throw var1_4;
                }
            }
            if (var2_20 == null) throw var1_9;
            try {}
            catch (IOException var2_21) {
                throw var1_9;
            }
            break block36;
            catch (IOException var1_19) {
                return;
            }
        }
        var2_20.close();
        throw var1_9;
    }

    static /* synthetic */ ax.o7.a l0(r r8, ax.o7.a a8) {
        r8.h = a8;
        return a8;
    }

    static /* synthetic */ String m0(r r8, String string) {
        r8.i = string;
        return string;
    }

    static /* synthetic */ boolean o0(r r8, boolean bl) {
        r8.j = bl;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ArrayList<d> p0() throws IOException {
        ArrayList<d> arrayList = new ArrayList<d>();
        a.c.d d8 = this.h.n().e().I("nextPageToken, files(id,name,parents)").K("trashed = false and mimeType = 'application/vnd.google-apps.folder'");
        do {
            Iterator<ax.p7.c> iterator;
            ax.p7.d d9;
            block9: {
                try {
                    d9 = (ax.p7.d)d8.execute();
                    iterator = d9.n().iterator();
                    break block9;
                }
                catch (IOException iOException) {}
                iOException.printStackTrace();
                d8.J(null);
                continue;
            }
            while (iterator.hasNext()) {
                Object object;
                ax.p7.c c8 = iterator.next();
                List<String> list = c8.w();
                if (list != null && list.size() != 0) {
                    if (list.size() == 1) {
                        list = (String)list.get(0);
                    } else {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("parent:");
                        ((StringBuilder)object).append(list.size());
                        ax.u3.b.g(((StringBuilder)object).toString());
                        list = (String)list.get(0);
                    }
                } else {
                    list = "no-parent-id";
                }
                if (list != null && c8.r() != null) {
                    object = new d(c8, (String)((Object)list));
                    arrayList.add((d)object);
                    continue;
                }
                ax.u3.b.f();
            }
            d8.J(d9.o());
        } while (d8.G() != null && d8.G().length() > 0);
        return arrayList;
    }

    private String q0(E e8) {
        return this.r0(e8.t());
    }

    private String r0(String string) {
        return string;
    }

    private j s0(String string, Exception exception) {
        if (exception instanceof ax.e7.b) {
            Object object = (ax.e7.b)exception;
            int n8 = ((t)object).b();
            if (n8 == 403 && ((ax.e7.b)object).e() != null) {
                if ((object = ((ax.e7.b)object).e().n()) != null) {
                    object = object.iterator();
                    while (object.hasNext()) {
                        String string2 = ((a.a)object.next()).n();
                        if (!"quotaExceeded".equals(string2) && !"storageQuotaExceeded".equals(string2)) {
                            if (!"forbidden".equals(string2) && !"insufficientPermissions".equals(string2) && !"insufficientParentPermissions".equals(string2)) continue;
                            return new ax.b3.e(exception);
                        }
                        return new ax.b3.s(exception);
                    }
                }
            } else if (n8 == 404 && ((ax.e7.b)object).e() != null && (object = ((ax.e7.b)object).e().n()) != null) {
                object = object.iterator();
                while (object.hasNext()) {
                    if (!"notFound".equals(((a.a)object.next()).n())) continue;
                    return new ax.b3.t(exception);
                }
            }
        } else if (exception instanceof t) {
            t t8 = (t)exception;
            String string3 = t8.c();
            int n9 = t8.b();
            if (n9 == 403 && "Forbidden".equalsIgnoreCase(string3)) {
                return new ax.b3.e(exception);
            }
            if (n9 == 404 && "Not Found".equalsIgnoreCase(string3)) {
                return new ax.b3.t(exception);
            }
        }
        if (exception.getMessage() != null && exception.getMessage().startsWith("NetworkError")) {
            return new ax.b3.q(exception);
        }
        return ax.b3.d.b(string, exception);
    }

    private E t0() {
        return new E(this, "/.hidden-system-folder", true, true);
    }

    private String u0(String string) {
        return string.replace("'", "\\'");
    }

    private String v0() {
        SharedPreferences sharedPreferences = this.p().getSharedPreferences("GoogleDrivePrefs", 0);
        int n8 = this.t();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("account_name_");
        stringBuilder.append(n8);
        return sharedPreferences.getString(stringBuilder.toString(), null);
    }

    private HashSet<String> w0(ArrayList<d> arrayList, String string) {
        Stack<String> stack = new Stack<String>();
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(string);
        ((AbstractCollection)stack).add(string);
        while (((AbstractCollection)stack).size() > 0) {
            string = (String)stack.pop();
            int n8 = arrayList.size();
            int n9 = 0;
            while (n9 < n8) {
                int n10;
                d d8 = arrayList.get(n9);
                n9 = n10 = n9 + 1;
                if (!d8.b.equals(string)) continue;
                hashSet.add(d8.a.r());
                ((AbstractCollection)stack).add(d8.a.r());
                n9 = n10;
            }
        }
        return hashSet;
    }

    private String y0(E e8) {
        Object object;
        object = e8.l() && (object = e8.g0()) != null && ((ax.p7.c)object).x() != null ? ((ax.p7.c)object).x().n() : null;
        if (object == null) {
            return e8.t();
        }
        return object;
    }

    private String z0(ax.p7.c object) {
        if (((ax.p7.c)object).w() != null && ((ax.p7.c)object).w().size() > 0) {
            if (this.E0((String)(object = ((ax.p7.c)object).w().get(0)))) {
                return "root";
            }
            return object;
        }
        return "root";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream A(String object, String object2, String object3) {
        RuntimeException var1_4;
        block7: {
            block6: {
                block5: {
                    if (object3 != null) {
                        try {
                            if (!((String)object3).startsWith("url=")) break block5;
                            object = Uri.decode((String)((String)object3).substring(4));
                            break block6;
                        }
                        catch (IOException iOException) {
                            break block7;
                        }
                        catch (j j8) {
                            break block7;
                        }
                    }
                }
                if (((E)(object = (E)this.z((String)object2))).i0() == null) {
                    return null;
                }
                object = ((E)object).i0();
            }
            object2 = this.h.e();
            object3 = new g((String)object);
            object2 = ((ax.i7.q)object2).a((g)object3).b();
            object = new ByteArrayOutputStream();
            ((ax.i7.s)object2).b((OutputStream)object);
            return new ByteArrayInputStream(((ByteArrayOutputStream)object).toByteArray());
        }
        var1_4.printStackTrace();
        return null;
    }

    @Override
    public boolean B(n n8) {
        return true;
    }

    @Override
    public List<n> C(n n8, m.f object) throws j {
        if (n8.n()) {
            if (!"/.hidden-system-folder".equals(n8.E())) {
                ax.u3.b.c(n8.isDirectory());
                object = this.x0((E)n8);
                Iterator iterator = object.iterator();
                while (iterator.hasNext()) {
                    n8 = (n)iterator.next();
                    if (!n8.isDirectory()) continue;
                    this.k.put((Object)n8.E(), (Object)n8);
                    this.l.put((Object)n8.t(), (Object)n8.E());
                }
                return object;
            }
            throw new ax.b3.e();
        }
        throw new ax.b3.t();
    }

    @Override
    public void D(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, ax.b3.a {
        ax.u3.b.a(n8.n());
        this.K0(n8, g8, string, l8, l9, bl, false, c8, i8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void E(n object, n object2, ax.u3.c object3, i i8) throws j {
        Exception var1_4;
        long l8;
        ax.u3.b.a(object2.n());
        if (!object.n()) throw new ax.b3.t();
        if (object.isDirectory()) {
            this.I0(((n)object).E());
        }
        try {
            l8 = object.p();
            ax.p7.c c8 = new ax.p7.c();
            object3 = new ax.m7.i(object.q());
            c8.F((ax.m7.i)object3);
            c8.G(((n)object2).B());
            object3 = this.h.n().f(this.q0((E)object), c8);
            if (!((n)object).T().equals(((n)object2).T())) {
                object = this.B0((n)object);
                if ((object2 = this.B0((n)object2)) == null) {
                    object = new j("Target parent does not exist");
                    throw object;
                }
                if (object == null) {
                    object = new j("Source parent does not exist");
                    throw object;
                }
                ((a.c.e)object3).H((String)object2);
                ((a.c.e)object3).J((String)object);
            }
        }
        catch (SecurityException securityException) {
            throw this.s0("GD moveFile", (Exception)var1_4);
        }
        catch (IOException iOException) {
            throw this.s0("GD moveFile", (Exception)var1_4);
        }
        ((a.c.e)object3).I("name");
        if (((ax.g7.b)object3).execute() != null) {
            if (i8 == null) return;
            i8.a(l8, l8);
            return;
        }
        object = new j("result is null");
        throw object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void F(n object, n object2, ax.u3.c object3, i i8) throws j {
        Exception var1_4;
        ax.u3.b.a(object2.n());
        if (!object.n()) throw new ax.b3.t("not existing source file");
        object3 = (E)object;
        ax.p7.c c8 = new ax.p7.c();
        long l8 = object.q();
        if (l8 >= 0L) {
            c8.F(new ax.m7.i(l8));
        }
        c8.G(((n)object2).B());
        if (!((n)object).T().equals(((n)object2).T())) {
            if ((object2 = this.B0((n)object2)) == null) throw new j("Dst parent not found");
            c8.H(Arrays.asList(object2));
        }
        try {
            l8 = object.p();
            if ((ax.p7.c)this.h.n().a(this.q0((E)object3), c8).execute() != null) {
                if (i8 == null) return;
                i8.a(l8, l8);
                return;
            }
        }
        catch (SecurityException securityException) {
            throw this.s0("GD copyFile", (Exception)var1_4);
        }
        catch (IOException iOException) {
            throw this.s0("GD copyFile", (Exception)var1_4);
        }
        object = new j("GoogleDrive copy returns null");
        throw object;
    }

    @Override
    public int G(String string, String string2) {
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<n> G0(String string, ArrayList<d> arrayList, String string2, String string3, String string4) throws IOException {
        ArrayList<n> arrayList2 = new ArrayList<n>();
        a.c.d d8 = this.h.n().e().I("nextPageToken, files(kind,id,name,mimeType,parents,capabilities/canDownload,capabilities/canEdit,size,modifiedTime,createdTime,webContentLink,thumbnailLink,webViewLink,shortcutDetails,trashed)").K(string);
        do {
            block9: {
                Iterator<ax.p7.c> iterator;
                ax.p7.d d9;
                try {
                    d9 = (ax.p7.d)d8.execute();
                    iterator = d9.n().iterator();
                }
                catch (IOException iOException) {
                    break block9;
                }
                while (iterator.hasNext()) {
                    ax.p7.c c8 = iterator.next();
                    String string5 = this.z0(c8);
                    Object object = string4 != null && string4.equals(string5) ? string3 : null;
                    string = object;
                    if (object == null) {
                        string = object;
                        if (arrayList != null) {
                            string = this.D0(arrayList, string5, string2, string3, string4);
                            boolean bl = string != null;
                            ax.u3.b.c(bl);
                        }
                    }
                    if (string == null) {
                        try {
                            string = this.C0(c8, string2, string3, string4).E();
                        }
                        catch (IOException iOException) {
                            break block9;
                        }
                    }
                    object = new E(this, string5, string5, c8, d0.Q(string, r.J0(c8)));
                    arrayList2.add((n)object);
                }
                d8.J(d9.o());
                continue;
            }
            ((Throwable)((Object)string)).printStackTrace();
            d8.J(null);
        } while (d8.G() != null && d8.G().length() > 0);
        return arrayList2;
    }

    @Override
    public String H(n n8) {
        Object object = (E)n8;
        if (((E)object).i0() == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("url=");
        stringBuilder.append(Uri.encode((String)((E)object).i0()));
        object = stringBuilder.toString();
        if (A.J(n8)) {
            return B.a0(n8, (String)object);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void I(n object) throws j {
        IOException iOException2;
        block4: {
            if (this.h == null) throw new ax.b3.h("Service is not connected!");
            try {
                if (object.n()) {
                    this.I0(((n)object).E());
                    ax.p7.c c8 = new ax.p7.c();
                    c8.I(Boolean.TRUE);
                    this.h.n().f(object.t(), c8).execute();
                    return;
                }
            }
            catch (SecurityException securityException) {
                throw new j(securityException);
            }
            catch (IOException iOException2) {
                break block4;
            }
            object = new ax.b3.t();
            throw object;
        }
        iOException2.printStackTrace();
        throw this.s0("GoogleDrive deleteFileRecursively", iOException2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public InputStream J(n object, long l8) throws j {
        Exception var1_5;
        if (this.h == null) throw new ax.b3.h("Service is not connected!");
        try {
            if (((E)object).g0() != null) {
                object = this.y0((E)object);
                a.c.c c8 = this.h.n().d((String)object);
                if (l8 == 0L) return c8.l();
                ax.i7.m m8 = c8.s();
                object = new StringBuilder();
                ((StringBuilder)object).append("bytes=");
                ((StringBuilder)object).append(l8);
                ((StringBuilder)object).append("-");
                m8.O(((StringBuilder)object).toString());
                return c8.l();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new j(illegalArgumentException);
        }
        catch (SecurityException securityException) {
            throw this.s0("googledrive getInputstream", (Exception)var1_5);
        }
        catch (IOException iOException) {
            throw this.s0("googledrive getInputstream", (Exception)var1_5);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The file doesn't have any content stored on Drive : ");
        stringBuilder.append(object.n());
        j j8 = new j(stringBuilder.toString());
        throw j8;
    }

    @Override
    public void K(Activity object, Fragment fragment, c.a a8) {
        a8.B();
        object = new e(this, (L)fragment, this.v0(), a8);
        ((ax.u3.q)object).i(new Object[0]);
        this.m = object;
    }

    @Override
    public boolean L() {
        return false;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean M(n n8) {
        RuntimeException var1_3;
        block11: {
            block10: {
                String string2;
                String string;
                ax.p7.c c8;
                Object object;
                try {
                    object = (E)this.z(n8.T());
                    if (!((E)object).n()) {
                        return false;
                    }
                    if (n8.n()) {
                        return false;
                    }
                    c8 = new ax.p7.c();
                    c8.G(n8.B());
                    c8.E("application/vnd.google-apps.folder");
                    c8.H(Arrays.asList(this.y0((E)object)));
                    c8 = (ax.p7.c)this.h.n().b(c8).execute();
                    if (c8 == null) break block10;
                    string = n8.E();
                    string2 = ((E)object).t();
                    object = this.y0((E)object);
                }
                catch (SecurityException securityException) {
                    break block11;
                }
                catch (j j9) {
                    break block11;
                }
                catch (IOException iOException) {
                    break block11;
                }
                try {
                    n8 = new E(this, string2, (String)object, c8, string);
                    this.k.put((Object)string, (Object)n8);
                    this.l.put((Object)n8.t(), (Object)n8.E());
                    return true;
                }
                catch (SecurityException securityException) {
                }
                catch (j j8) {
                }
                catch (IOException iOException) {}
                break block11;
            }
            return false;
        }
        var1_3.printStackTrace();
        return false;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean N(n n8) {
        RuntimeException var1_4;
        E e8;
        block6: {
            block5: {
                e8 = (E)this.z(n8.T());
                if (e8.n()) break block5;
                return false;
            }
            if (!n8.n()) break block6;
            return false;
        }
        try {
            ax.p7.c c8 = new ax.p7.c();
            c8.G(n8.B());
            c8.E(n8.s());
            c8.H(Arrays.asList(this.y0(e8)));
            n8 = this.h.n().b(c8).execute();
            return n8 != null;
        }
        catch (j j8) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        var1_4.printStackTrace();
        return false;
    }

    @Override
    public boolean O() {
        return true;
    }

    @Override
    public void P(n n8) throws j {
        this.I(n8);
    }

    @Override
    public boolean Q(n n8, n n9) {
        return true;
    }

    @Override
    public boolean Y() {
        return true;
    }

    @Override
    public boolean a() {
        return this.j;
    }

    @Override
    public void b() {
        this.k.clear();
        this.l.clear();
    }

    @Override
    public boolean g0() {
        return true;
    }

    @Override
    public boolean h0() {
        return true;
    }

    @Override
    public void j0(n n8, G g8, String string, long l8, Long l9, p p8, boolean bl, ax.u3.c c8, i i8) throws j, ax.b3.a {
        this.K0(n8, g8, string, l8, l9, bl, true, c8, i8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    void m(n var1_1, String var2_10, boolean var3_11, boolean var4_12, h var5_13, ax.u3.c var6_14) throws j {
        synchronized (this) {
            block21: {
                block20: {
                    block19: {
                        if (var4_12) ** GOTO lbl6
                        try {
                            this.o((n)var1_1, (String)var2_10, var3_11, var4_12, var5_13, (ax.u3.c)var6_14);
                            return;
lbl6:
                            // 1 sources

                            try {
                                var6_14 = this.u0((String)var2_10);
                                if (!d0.E((n)var1_1)) break block19;
                                var1_1 = new ArrayList<n>();
                                var1_1.append("name contains '");
                                var1_1.append((String)var6_14);
                                var1_1.append("' and trashed = false");
                                var1_1 = this.G0(var1_1.toString(), null, null, null, null);
                                break block20;
                            }
                            catch (SecurityException var1_3) {
                                throw this.s0("do search", (Exception)var1_7);
                            }
                            catch (IOException var1_4) {
                                throw this.s0("do search", (Exception)var1_7);
                            }
                        }
                        catch (Throwable var1_2) {
                            break block21;
                        }
                    }
                    var10_15 = ax.Z2.b.k().g((n)var1_1);
                    if (var10_15 != null && (var2_10 = B.h(q.g(var11_16 /* !! */  = new ArrayList<n>(var10_15), q.c("Search")), (String)var2_10, var3_11, false)) != null && !var2_10.isEmpty()) {
                        var5_13.Y((List<n>)var2_10, false);
                    }
                    var10_15 = var1_1.E();
                    var2_10 = var1_1.t();
                    var12_17 = this.y0((E)var1_1);
                    var11_16 /* !! */  = this.p0();
                    var1_1 = this.w0(var11_16 /* !! */ , var12_17);
                    var13_18 = new StringBuilder();
                    var1_1 = var1_1.iterator();
                    var8_19 = true;
                    var7_20 = 0;
                    while (var4_12 = var1_1.hasNext()) {
                        try {
                            var14_22 = (String)var1_1.next();
                            if (var8_19) {
                                var8_19 = false;
                            } else {
                                var13_18.append(" or ");
                            }
                            var13_18.append("'");
                            var13_18.append((String)var14_22);
                            var13_18.append("' in parents");
                            var7_20 = var9_21 = var7_20 + 1;
                            if (var9_21 < 300) continue;
                            var14_22 = new List<n>();
                            var14_22.append("name contains '");
                            var14_22.append((String)var6_14);
                            var14_22.append("' and (");
                            var14_22.append(var13_18.toString());
                            var14_22.append(") and trashed = false");
                            var15_23 = var14_22.toString();
                            var14_22 = new List<n>();
                            var14_22.addAll(this.G0(var15_23, var11_16 /* !! */ , (String)var2_10, (String)var10_15, var12_17));
                            var14_22 = B.h(var14_22, null, var3_11, false);
                            if (var14_22 != null && !var14_22.isEmpty()) {
                                var5_13.Y(var14_22, false);
                            }
                        }
                        catch (Throwable var1_5) {
                            break block21;
                        }
                        catch (SecurityException var1_6) {
                            throw this.s0("do search", (Exception)var1_7);
                        }
                        catch (IOException var1_8) {
                            throw this.s0("do search", (Exception)var1_7);
                        }
                        var13_18.setLength(0);
                        var8_19 = true;
                        var7_20 = 0;
                    }
                    var1_1 = new ArrayList<n>();
                    if (var13_18.length() > 0) {
                        var14_22 = new List<n>();
                        var14_22.append("name contains '");
                        var14_22.append((String)var6_14);
                        var14_22.append("' and (");
                        var14_22.append(var13_18.toString());
                        var14_22.append(") and trashed = false");
                        var6_14 = var14_22.toString();
                        {
                            var1_1.addAll(this.G0((String)var6_14, var11_16 /* !! */ , (String)var2_10, (String)var10_15, var12_17));
                        }
                    }
                }
                if (var1_1 != null) ** GOTO lbl-1000
                return;
lbl-1000:
                // 1 sources

                {
                    var5_13.Y(B.h(var1_1, null, var3_11, false), true);
                    return;
                }
            }
            throw var1_9;
        }
    }

    @Override
    public void n(n n8) throws j {
        if (n8 instanceof E) {
            IOException iOException2;
            block7: {
                block6: {
                    Object object;
                    try {
                        if (!n8.l() || (object = ((E)n8).g0()) == null) break block6;
                    }
                    catch (IOException iOException2) {
                        break block7;
                    }
                    if (((ax.p7.c)object).x() == null) break block6;
                    object = ((ax.p7.c)object).x().n();
                    object = (ax.p7.c)this.h.n().d((String)object).H("size").execute();
                    if (object == null) break block6;
                    if (((ax.p7.c)object).y() != null) {
                        ((E)n8).l0(((ax.p7.c)object).y());
                        return;
                    }
                }
                return;
            }
            throw new j(iOException2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid File Type :");
        stringBuilder.append(n8.getClass().getName());
        throw new j(stringBuilder.toString());
    }

    /*
     * Exception decompiling
     */
    public List<n> x0(E var1_1) throws j {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [24, 23, 22, 21, 20 : 230->258)] java.lang.OutOfMemoryError
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public k0 y() throws j {
        block4: {
            Exception var1_6;
            Long l8;
            Object object;
            try {
                object = (ax.p7.a)this.h.m().a().H("storageQuota").execute();
                if (object == null || ((ax.p7.a)object).n() == null) break block4;
                l8 = ((ax.p7.a)object).n().n();
                object = ((ax.p7.a)object).n().o();
                if (l8 != null && object != null) {
                    return new k0(l8, (Long)object);
                }
            }
            catch (SecurityException securityException) {
                throw this.s0("GD getStorageSpace", (Exception)var1_6);
            }
            catch (IOException iOException) {
                throw this.s0("GD getStorageSpace", (Exception)var1_6);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("no total :");
            stringBuilder.append(l8);
            stringBuilder.append(",");
            stringBuilder.append(object);
            j j8 = new j(stringBuilder.toString());
            throw j8;
        }
        j j9 = new j("No storage Quota");
        throw j9;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public n z(String var1_1) throws j {
        block25: {
            block24: {
                if (this.h == null) {
                    throw new ax.b3.h("Service is not connected!");
                }
                if (this.k.containsKey(var1_1)) {
                    return (n)this.k.get(var1_1);
                }
                if (d0.a.equals(var1_1)) {
                    return new E(this, (String)var1_1);
                }
                if ("/.hidden-system-folder".equals(var1_1)) {
                    return this.t0();
                }
                var2_16 = (E)this.z(d0.r((String)var1_1));
                var3_17 = d0.h((String)var1_1);
                var5_18 = this.u0((String)var3_17);
                if (var2_16.n() == false) return new E(this, (String)var1_1);
                if (var2_16.isDirectory() == false) return new E(this, (String)var1_1);
                var4_19 = this.y0((E)var2_16);
                var6_20 = new StringBuilder();
                var6_20.append("'");
                var6_20.append((String)var4_19);
                var6_20.append("' in parents and name = '");
                var6_20.append((String)var5_18);
                var6_20.append("' and trashed = false");
                var5_18 = this.H0(var6_20.toString());
                if (var5_18 != null && var5_18.size() > 0) {
                    var4_19 = (ax.p7.c)var5_18.get(0);
                    var5_18 = var2_16.t();
                    var2_16 = this.y0((E)var2_16);
                }
                ** GOTO lbl50
                {
                    catch (IllegalArgumentException var1_8) {
                        break block24;
                    }
                    catch (SecurityException var1_9) {
                        break block24;
                    }
                    catch (IOException var1_10) {
                        break block24;
                    }
                    catch (NullPointerException var1_11) {
                        break block25;
                    }
                    ** try [egrp 1[TRYBLOCK] [11, 10, 9, 8 : 218->433)] { 
lbl43:
                    // 1 sources

                    var3_17 = new E(this, (String)var5_18, (String)var2_16, (ax.p7.c)var4_19, (String)var1_1);
                    if (var3_17.isDirectory() == false) return var3_17;
                    this.k.put(var1_1, var3_17);
                    this.l.put((Object)var3_17.t(), (Object)var3_17.E());
                    return var3_17;
lbl50:
                    // 1 sources

                    if (var3_17.contains("_") == false) return new E(this, var2_16.t(), this.y0((E)var2_16), (String)var1_1);
                    var5_18 = new StringBuilder();
                    var5_18.append("'");
                    var5_18.append((String)var4_19);
                    var5_18.append("' in parents and trashed = false");
                    var4_19 = this.H0(var5_18.toString());
                    if (var4_19 == null) return new E(this, var2_16.t(), this.y0((E)var2_16), (String)var1_1);
                    if (var4_19.size() <= 0) return new E(this, var2_16.t(), this.y0((E)var2_16), (String)var1_1);
                    var5_18 = var4_19.iterator();
                    do {
                        if (var5_18.hasNext() == false) return new E(this, var2_16.t(), this.y0((E)var2_16), (String)var1_1);
                    } while (!r.J0((ax.p7.c)(var4_19 = var5_18.next())).equals(var3_17));
                    var3_17 = var2_16.t();
                    var2_16 = this.y0((E)var2_16);
                }
            }
lbl69:
            // 7 sources

            while (true) {
                var1_3.printStackTrace();
                throw this.s0("GoogleDrive getFileInfo", (Exception)var1_3);
            }
        }
lbl73:
        // 3 sources

        while (true) {
            ax.Ha.c.h().f().b("GoogleDrive queryFiles null").l((Throwable)var1_7).h();
            throw this.s0("GoogleDrive getFileInfo null", (Exception)var1_7);
        }
lbl76:
        // 1 sources

        catch (IllegalArgumentException var1_2) {
            ** GOTO lbl69
        }
lbl78:
        // 1 sources

        catch (SecurityException var1_4) {
            ** GOTO lbl69
        }
lbl80:
        // 1 sources

        catch (IOException var1_5) {
            ** GOTO lbl69
        }
lbl82:
        // 1 sources

        catch (NullPointerException var1_6) {
            ** GOTO lbl73
        }
        try {
            var5_18 = new E(this, (String)var3_17, (String)var2_16, (ax.p7.c)var4_19, (String)var1_1);
        }
        catch (IllegalArgumentException var1_12) {
            ** GOTO lbl69
        }
        catch (SecurityException var1_13) {
            ** GOTO lbl69
        }
        catch (IOException var1_14) {
            ** continue;
        }
        catch (NullPointerException var1_15) {
            ** continue;
        }
        if (var5_18.isDirectory() == false) return var5_18;
        this.k.put(var1_1, var5_18);
        this.l.put((Object)var5_18.t(), (Object)var5_18.E());
        return var5_18;
    }

    public static class c
    extends T {
        Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override
        public void a(int n8) {
            Object object = this.a.getSharedPreferences("GoogleDrivePrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("display_name_");
            stringBuilder.append(n8);
            stringBuilder = object.remove(stringBuilder.toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("account_name_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("created_");
            ((StringBuilder)object).append(n8);
            stringBuilder = stringBuilder.remove(((StringBuilder)object).toString());
            object = new StringBuilder();
            ((StringBuilder)object).append("sortindex_");
            ((StringBuilder)object).append(n8);
            stringBuilder.remove(((StringBuilder)object).toString()).commit();
        }

        @Override
        public s f(int n8) {
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("GoogleDrivePrefs", 0);
            CharSequence charSequence = new StringBuilder();
            charSequence.append("display_name_");
            charSequence.append(n8);
            charSequence = sharedPreferences.getString(charSequence.toString(), null);
            Object object = new StringBuilder();
            ((StringBuilder)object).append("account_name_");
            ((StringBuilder)object).append(n8);
            object = sharedPreferences.getString(((StringBuilder)object).toString(), null);
            if (!TextUtils.isEmpty((CharSequence)object)) {
                charSequence = object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("location_name_");
            ((StringBuilder)object).append(n8);
            String string = ((StringBuilder)object).toString();
            object = ax.Q2.f.O0;
            string = sharedPreferences.getString(string, ((ax.Q2.f)((Object)object)).M(this.a));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("created_");
            stringBuilder.append(n8);
            long l8 = sharedPreferences.getLong(stringBuilder.toString(), 0L);
            stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            return new s((ax.Q2.f)((Object)object), n8, string, (String)charSequence, null, null, l8, sharedPreferences.getLong(stringBuilder.toString(), 0L));
        }

        @Override
        public void g(int n8, String string) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("GoogleDrivePrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("location_name_");
            stringBuilder.append(n8);
            editor.putString(stringBuilder.toString(), string);
            editor.commit();
        }

        @Override
        public void j(int n8, long l8) {
            SharedPreferences.Editor editor = this.a.getSharedPreferences("GoogleDrivePrefs", 0).edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sortindex_");
            stringBuilder.append(n8);
            editor.putLong(stringBuilder.toString(), l8);
            editor.apply();
        }

        public void k(String string, k k8) {
            ax.Q2.f f8 = ax.Q2.f.O0;
            k8.b(f8);
            int n8 = this.m();
            int n9 = this.l(string);
            if (n9 >= 0) {
                n8 = n9;
            }
            this.p(n8, string);
            k8.c(f8, n8);
        }

        int l(String string) {
            Context context = this.a;
            context = context.getSharedPreferences("GoogleDrivePrefs", 0);
            int n8 = context.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("account_name_");
                stringBuilder.append(i8);
                if (!string.equals(context.getString(stringBuilder.toString(), null))) continue;
                return i8;
            }
            return -1;
        }

        int m() {
            return this.a.getSharedPreferences("GoogleDrivePrefs", 0).getInt("count", 0);
        }

        public Intent n(String object) {
            if (object != null) {
                return ax.J5.a.a(new Account((String)object, "com.google"), null, new String[]{"com.google"}, true, null, null, null, null);
            }
            object = new ArrayList();
            ((ArrayList)object).add("https://www.googleapis.com/auth/drive");
            return ax.d7.a.e(this.a, (Collection<String>)object).c();
        }

        public List<s> o() {
            ArrayList<s> arrayList = new ArrayList<s>();
            Context context = this.a;
            context = context.getSharedPreferences("GoogleDrivePrefs", 0);
            int n8 = context.getInt("count", 0);
            for (int i8 = 0; i8 < n8; ++i8) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("account_name_");
                stringBuilder.append(i8);
                if (context.getString(stringBuilder.toString(), null) == null) continue;
                arrayList.add(this.f(i8));
            }
            return arrayList;
        }

        public void p(int n8, String charSequence) {
            Context context = this.a;
            boolean bl = false;
            if (n8 >= (context = context.getSharedPreferences("GoogleDrivePrefs", 0)).getInt("count", 0)) {
                bl = true;
            }
            context = context.edit();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("account_name_");
            stringBuilder.append(n8);
            stringBuilder = context.putString(stringBuilder.toString(), (String)charSequence);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("display_name_");
            ((StringBuilder)charSequence).append(n8);
            stringBuilder = stringBuilder.putString(((StringBuilder)charSequence).toString(), "");
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("location_name_");
            ((StringBuilder)charSequence).append(n8);
            stringBuilder.putString(((StringBuilder)charSequence).toString(), ax.Q2.f.O0.M(this.a));
            if (bl) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("created_");
                ((StringBuilder)charSequence).append(n8);
                context.putLong(((StringBuilder)charSequence).toString(), System.currentTimeMillis());
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("sortindex_");
                ((StringBuilder)charSequence).append(n8);
                context.putLong(((StringBuilder)charSequence).toString(), System.currentTimeMillis());
            }
            if (bl) {
                context.putInt("count", n8 + 1);
            }
            context.commit();
        }
    }

    static class d {
        ax.p7.c a;
        String b;

        d(ax.p7.c c8, String string) {
            this.a = c8;
            this.b = string;
        }
    }

    private class e
    extends ax.u3.q<Object, Void, Integer> {
        private c.a h;
        String i;
        L j;
        boolean k;
        private Intent l;
        private Throwable m;
        final r n;

        public e(r r8, L l8, String string, c.a a8) {
            this.n = r8;
            super(q.e.c0);
            this.i = string;
            this.h = a8;
            this.j = l8;
            this.k = false;
            this.l = null;
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private int w() {
            ax.d7.d d82;
            block17: {
                IllegalArgumentException illegalArgumentException2;
                boolean bl;
                boolean bl2;
                block16: {
                    SecurityException securityException2;
                    block15: {
                        ax.D5.a a8;
                        Exception exception2;
                        block14: {
                            Throwable var3_10;
                            block13: {
                                Object object;
                                block12: {
                                    bl2 = true;
                                    bl = true;
                                    try {
                                        object = new ArrayList();
                                        ((ArrayList)object).add("https://www.googleapis.com/auth/drive");
                                        ax.d7.a a9 = ax.d7.a.e(this.n.p(), object);
                                        a9.d(this.i);
                                        Object object2 = this.n;
                                        ax.j7.e e8 = new ax.j7.e();
                                        object = new ax.a7.a();
                                        a.b b8 = new a.b(e8, (ax.l7.c)object, this.z(a9));
                                        r.l0((r)object2, b8.j(this.n.p().getString(2131951672)).h());
                                        object = ((ax.p7.a)this.n.h.m().a().H("user").execute()).o().n();
                                        e8 = this.n.p().getSharedPreferences("GoogleDrivePrefs", 0);
                                        if (object == null) break block12;
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("display_name_");
                                        ((StringBuilder)object2).append(this.n.t());
                                        if (((String)object).equals(e8.getString(((StringBuilder)object2).toString(), null))) break block12;
                                        e8 = e8.edit();
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("display_name_");
                                        ((StringBuilder)object2).append(this.n.t());
                                        e8.putString(((StringBuilder)object2).toString(), (String)object).apply();
                                        this.k = true;
                                    }
                                    catch (NoClassDefFoundError noClassDefFoundError) {
                                        break block13;
                                    }
                                    catch (ExceptionInInitializerError exceptionInInitializerError) {
                                        break block13;
                                    }
                                    catch (Exception exception2) {
                                        break block14;
                                    }
                                    catch (SecurityException securityException2) {
                                        break block15;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException2) {
                                        break block16;
                                    }
                                    catch (ax.d7.d d82) {
                                        break block17;
                                    }
                                }
                                object = (ax.p7.c)this.n.h.n().d("root").execute();
                                r.m0(this.n, ((ax.p7.c)object).r());
                                return 0;
                            }
                            this.m = var3_10;
                            ax.Q2.d.b((Throwable)var3_10);
                            return -2;
                        }
                        exception2.printStackTrace();
                        this.m = exception2;
                        if ("NetworkError".equals(exception2.getMessage())) {
                            return -9;
                        }
                        ax.Ha.c.h().f().d("!!GoogleDriveAuth 5!!").l(exception2).h();
                        if (exception2 instanceof ax.d7.b && (a8 = ((ax.d7.b)exception2).a()) != null && "UNREGISTERED_ON_API_CONSOLE".equals(a8.getMessage()) && !ax.u3.B.J(this.n.p())) {
                            return -8;
                        }
                        return -2;
                    }
                    ax.Ha.c.h().f().d("!!GoogleDriveAuth 4!!").l(securityException2).h();
                    return -5;
                }
                illegalArgumentException2.printStackTrace();
                Object object = new a(this.n.p());
                Object object3 = ((a)object).b();
                if (object3 != null && ((Account[])object3).length > 0) {
                    if (((a)object).a(this.i) == null) {
                        object = n;
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("Google Account '");
                        ((StringBuilder)object3).append(this.i);
                        ((StringBuilder)object3).append("' is not found in the device");
                        ((Logger)object).severe(((StringBuilder)object3).toString());
                        ax.Ha.c.h().f().d("!!GoogleDriveAuth 1!!").l(illegalArgumentException2).h();
                        return -3;
                    }
                    object = ax.Ha.c.h().f().d("!!GoogleDriveAuth 2!!");
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("ex:");
                    ((StringBuilder)object3).append(illegalArgumentException2.getMessage());
                    ((StringBuilder)object3).append(", account not null : ");
                    bl2 = this.i != null ? bl : false;
                    ((StringBuilder)object3).append(bl2);
                    ((ax.Ha.b)object).g(((StringBuilder)object3).toString()).h();
                    return -6;
                }
                object3 = ax.Ha.c.h().f().d("!!GoogleDriveAuth 3!!").l(illegalArgumentException2);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("account not null : ");
                if (this.i == null) {
                    bl2 = false;
                }
                stringBuilder.append(bl2);
                ((ax.Ha.b)object3).g(stringBuilder.toString()).h();
                return -4;
            }
            d82.printStackTrace();
            this.l = d82.c();
            return -1;
        }

        private ax.i7.r z(ax.i7.r r8) {
            return new ax.i7.r(){
                final ax.i7.r a;
                final e b;
                {
                    this.b = e8;
                    this.a = r8;
                }

                @Override
                public void b(ax.i7.p p8) throws IOException {
                    this.a.b(p8);
                    p8.y(45000);
                }
            };
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Integer x(Object ... object) {
            this.n.i();
            try {
                int n8;
                block14: {
                    int n9;
                    block13: {
                        n9 = this.w();
                        if (n9 == -6 || n9 == -3) break block13;
                        n8 = n9;
                        if (n9 != -4) break block14;
                    }
                    try {
                        Thread.sleep(500L);
                    }
                    catch (InterruptedException interruptedException) {}
                    n8 = this.w();
                    boolean bl = false;
                    boolean bl2 = false;
                    if (n8 == 0) {
                        object = ax.Ha.c.h().f().d("GoogleDriveAuth RETRY SUCCESS");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("result:");
                        stringBuilder.append(n9);
                        stringBuilder.append(",acocunt not null:");
                        bl = bl2;
                        if (this.i != null) {
                            bl = true;
                        }
                        stringBuilder.append(bl);
                        ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                    } else if (n9 == -6 && n8 == -6) {
                        object = ax.Ha.c.h().f().d("GoogleDriveAuth RETRY FAILURE");
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("acocunt not null:");
                        if (this.i != null) {
                            bl = true;
                        }
                        stringBuilder.append(bl);
                        ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                    }
                    if (!(n8 != -3 && n8 != -4 || Q.l0())) {
                        n8 = -7;
                    }
                }
                this.n.j();
                return n8;
            }
            catch (Throwable throwable) {}
            this.n.j();
            throw throwable;
        }

        protected void y(Integer object) {
            L l8;
            if (this.k && (l8 = this.j) != null) {
                l8.va();
            }
            if ((Integer)object == 0) {
                r.o0(this.n, true);
                this.h.T(true, null);
                return;
            }
            r.o0(this.n, false);
            if ((Integer)object == -1) {
                this.h.T(false, this.l);
                return;
            }
            if ((Integer)object == -2) {
                this.h.T(false, this.m);
                return;
            }
            if ((Integer)object == -3) {
                object = this.n.p().getString(2131952085, new Object[]{this.i});
                this.h.T(false, object);
                return;
            }
            if ((Integer)object != -4 && (Integer)object != -5 && (Integer)object != -6) {
                if ((Integer)object == -7) {
                    object = new f(this.i);
                    this.h.T(false, object);
                    return;
                }
                if ((Integer)object == -8) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.n.p().getString(2131952325, new Object[]{ax.Q2.f.O0}));
                    ((StringBuilder)object).append(" : THIS APP IS NOT GENUINE");
                    object = ((StringBuilder)object).toString();
                    this.h.T(false, object);
                    return;
                }
                if ((Integer)object == -9) {
                    object = this.n.p().getString(2131951948);
                    this.h.T(false, object);
                    return;
                }
                this.h.T(false, this.m);
                return;
            }
            object = this.n.p().getString(2131951797);
            this.h.T(false, object);
        }
    }

    public static class f {
        public String a;

        f(String string) {
            this.a = string;
        }
    }
}

