/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import ax.J5.i;
import ax.M5.p;
import ax.S5.e;
import ax.b6.M0;
import ax.b6.X6;
import ax.b6.r7;
import ax.e2.a;
import ax.f6.n;
import ax.f6.q;
import ax.f6.s;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.C;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.D5;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.F;
import com.google.android.gms.measurement.internal.V1;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.a2;
import com.google.android.gms.measurement.internal.d4;
import com.google.android.gms.measurement.internal.e3;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.f3;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class B5
extends e3 {
    private static final String[] i = new String[]{"firebase_", "google_", "ga_"};
    private static final String[] j = new String[]{"_err"};
    private SecureRandom c;
    private final AtomicLong d = new AtomicLong(0L);
    private int e;
    private a f;
    private Boolean g;
    private Integer h = null;

    B5(E2 e22) {
        super(e22);
    }

    public static long A(C c8) {
        long l8 = 0L;
        if (c8 == null) {
            return 0L;
        }
        Iterator<String> iterator = c8.iterator();
        while (iterator.hasNext()) {
            Object object = c8.D(iterator.next());
            if (!(object instanceof Parcelable[])) continue;
            l8 += (long)((Parcelable[])object).length;
        }
        return l8;
    }

    static long B(byte[] byArray) {
        p.l(byArray);
        int n8 = byArray.length;
        int n9 = 0;
        boolean bl = n8 > 0;
        p.o(bl);
        long l8 = 0L;
        for (n8 = byArray.length - 1; n8 >= 0 && n8 >= byArray.length - 8; --n8) {
            l8 += ((long)byArray[n8] & 0xFFL) << n9;
            n9 += 8;
        }
        return l8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean B0(Context context, String string) {
        block6: {
            PackageManager packageManager;
            block5: {
                try {
                    packageManager = context.getPackageManager();
                    if (packageManager != null) break block5;
                    return false;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return false;
                }
            }
            ComponentName componentName = new ComponentName(context, string);
            context = packageManager.getServiceInfo(componentName, 0);
            if (context == null) break block6;
            boolean bl = context.enabled;
            if (!bl) break block6;
            return true;
        }
        return false;
    }

    public static Bundle D(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        bundle = new Bundle(bundle);
        for (Object object : bundle.keySet()) {
            int n8;
            Object object2 = bundle.get((String)object);
            if (object2 instanceof Bundle) {
                bundle.putBundle((String)object, new Bundle((Bundle)object2));
                continue;
            }
            boolean bl = object2 instanceof Parcelable[];
            int n9 = 0;
            if (bl) {
                object = (Parcelable[])object2;
                for (n8 = 0; n8 < ((Parcelable[])object).length; ++n8) {
                    if (!(object[n8] instanceof Bundle)) continue;
                    object[n8] = new Bundle((Bundle)object[n8]);
                }
                continue;
            }
            if (!(object2 instanceof List)) continue;
            object = (List)object2;
            for (n8 = n9; n8 < object.size(); ++n8) {
                object2 = object.get(n8);
                if (!(object2 instanceof Bundle)) continue;
                object.set(n8, new Bundle((Bundle)object2));
            }
        }
        return bundle;
    }

    static boolean D0(String string) {
        return B5.G0(F.c0.a(null), string);
    }

    public static Bundle G(List<A5> object) {
        Bundle bundle = new Bundle();
        if (object != null) {
            Iterator<A5> iterator = object.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                Object object2 = ((A5)object).f0;
                if (object2 != null) {
                    bundle.putString(((A5)object).c0, (String)object2);
                    continue;
                }
                object2 = ((A5)object).e0;
                if (object2 != null) {
                    bundle.putLong(((A5)object).c0, ((Long)object2).longValue());
                    continue;
                }
                object2 = ((A5)object).h0;
                if (object2 == null) continue;
                bundle.putDouble(((A5)object).c0, ((Double)object2).doubleValue());
            }
        }
        return bundle;
    }

    private static boolean G0(String string, String string2) {
        return string.equals("*") || Arrays.asList(string.split(",")).contains(string2);
        {
        }
    }

    static boolean H0(String string) {
        return B5.G0(F.v0.a(null), string);
    }

    private final Object I(int n8, Object parcelableArray, boolean bl, boolean bl2, String object) {
        if (parcelableArray == null) {
            return null;
        }
        if (!(parcelableArray instanceof Long)) {
            if (parcelableArray instanceof Double) {
                return parcelableArray;
            }
            if (parcelableArray instanceof Integer) {
                return (long)((Integer)parcelableArray).intValue();
            }
            if (parcelableArray instanceof Byte) {
                return (long)((Byte)parcelableArray).byteValue();
            }
            if (parcelableArray instanceof Short) {
                return (long)((Short)parcelableArray).shortValue();
            }
            if (parcelableArray instanceof Boolean) {
                long l8 = (Boolean)parcelableArray != false ? 1L : 0L;
                return l8;
            }
            if (parcelableArray instanceof Float) {
                return ((Float)parcelableArray).doubleValue();
            }
            if (!(parcelableArray instanceof String || parcelableArray instanceof Character || parcelableArray instanceof CharSequence)) {
                if (bl2 && (parcelableArray instanceof Bundle[] || parcelableArray instanceof Parcelable[])) {
                    object = new ArrayList();
                    for (Parcelable parcelable : (Parcelable[])parcelableArray) {
                        if (!(parcelable instanceof Bundle) || (parcelable = this.E((Bundle)parcelable, null)) == null || parcelable.isEmpty()) continue;
                        object.add(parcelable);
                    }
                    return object.toArray(new Bundle[object.size()]);
                }
                return null;
            }
            return B5.J(String.valueOf(parcelableArray), n8, bl);
        }
        return parcelableArray;
    }

    public static String J(String string, int n8, boolean bl) {
        if (string == null) {
            return null;
        }
        if (string.codePointCount(0, string.length()) > n8) {
            if (bl) {
                string = string.substring(0, string.offsetByCodePoints(0, n8));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("...");
                return stringBuilder.toString();
            }
            return null;
        }
        return string;
    }

    static boolean J0(String string) {
        return !TextUtils.isEmpty((CharSequence)string) && string.startsWith("_");
    }

    private static void L(Bundle bundle, int n8, String string, Object object) {
        if (B5.v0(bundle, n8)) {
            bundle.putString("_ev", B5.J(string, 40, true));
            if (object != null) {
                p.l(bundle);
                if (object instanceof String || object instanceof CharSequence) {
                    bundle.putLong("_el", (long)String.valueOf(object).length());
                }
            }
        }
    }

    static boolean L0(String string) {
        p.f(string);
        return string.charAt(0) != '_' || string.equals("_ep");
        {
        }
    }

    public static boolean N0(String string) {
        String[] stringArray = j;
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!stringArray[i8].equals(string)) continue;
            return false;
        }
        return true;
    }

    private final int O0(String string) {
        if (!this.w0("event param", string)) {
            return 3;
        }
        if (!this.o0("event param", null, string)) {
            return 14;
        }
        if (!this.j0("event param", 40, string)) {
            return 3;
        }
        return 0;
    }

    private final int P0(String string) {
        if (!this.C0("event param", string)) {
            return 3;
        }
        if (!this.o0("event param", null, string)) {
            return 14;
        }
        if (!this.j0("event param", 40, string)) {
            return 3;
        }
        return 0;
    }

    private static int Q0(String string) {
        if ("_ldl".equals(string)) {
            return 2048;
        }
        if ("_id".equals(string)) {
            return 256;
        }
        if ("_lgclid".equals(string)) {
            return 100;
        }
        return 36;
    }

    private static boolean T0(String string) {
        p.l(string);
        return string.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static MessageDigest V0() {
        int n8 = 0;
        while (n8 < 2) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
            ++n8;
        }
        return null;
    }

    public static void X(d4 d42, Bundle bundle, boolean bl) {
        if (bundle != null && d42 != null && (!bundle.containsKey("_sc") || bl)) {
            String string = d42.a;
            if (string != null) {
                bundle.putString("_sn", string);
            } else {
                bundle.remove("_sn");
            }
            string = d42.b;
            if (string != null) {
                bundle.putString("_sc", string);
            } else {
                bundle.remove("_sc");
            }
            bundle.putLong("_si", d42.c);
            return;
        }
        if (bundle != null && d42 == null && bl) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static void Y(D5 d52, int n8, String string, String string2, int n9) {
        B5.Z(d52, null, n8, string, string2, n9);
    }

    static void Z(D5 d52, String string, int n8, String string2, String string3, int n9) {
        Bundle bundle = new Bundle();
        B5.v0(bundle, n8);
        if (!TextUtils.isEmpty((CharSequence)string2) && !TextUtils.isEmpty((CharSequence)string3)) {
            bundle.putString(string2, string3);
        }
        if (n8 == 6 || n8 == 7 || n8 == 2) {
            bundle.putLong("_el", (long)n9);
        }
        d52.b(string, "_err", bundle);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @TargetApi(value=30)
    private final boolean Z0() {
        block13: {
            Integer n8;
            block14: {
                Object var3_3;
                block12: {
                    boolean bl;
                    block11: {
                        if (this.g != null) break block13;
                        Object object = this.S0();
                        boolean bl2 = false;
                        if (object == null) {
                            return false;
                        }
                        object = ((a)object).b();
                        Integer n9 = null;
                        try {
                            n8 = (Integer)object.get(10000L, TimeUnit.MILLISECONDS);
                            bl = bl2;
                            if (n8 == null) break block11;
                            bl = bl2;
                        }
                        catch (TimeoutException timeoutException) {
                            n8 = n9;
                            break block12;
                        }
                        catch (InterruptedException interruptedException) {
                            n8 = n9;
                            break block12;
                        }
                        catch (ExecutionException executionException) {
                            n8 = n9;
                            break block12;
                        }
                        catch (CancellationException cancellationException) {
                            n8 = n9;
                            break block12;
                        }
                        try {
                            if (n8 != 1) break block11;
                            bl = true;
                        }
                        catch (TimeoutException timeoutException) {
                            break block12;
                        }
                        catch (InterruptedException interruptedException) {
                            break block12;
                        }
                        catch (ExecutionException executionException) {
                            break block12;
                        }
                        catch (CancellationException cancellationException) {
                            break block12;
                        }
                    }
                    this.g = bl;
                    break block14;
                }
                ((f3)this).k().L().b("Measurement manager api exception", var3_3);
                this.g = Boolean.FALSE;
            }
            ((f3)this).k().K().b("Measurement manager api status result", n8);
        }
        return this.g;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void a0(String string, String string2, String string3, Bundle bundle, List<String> list, boolean bl) {
        if (bundle == null) {
            return;
        }
        int n8 = ((f3)this).d().x();
        Iterator iterator = new TreeSet(bundle.keySet()).iterator();
        int n9 = 0;
        while (iterator.hasNext()) {
            Object object;
            int n10;
            int n11;
            String string4 = (String)iterator.next();
            if (list != null && list.contains(string4)) {
                n11 = 0;
            } else {
                n10 = !bl ? this.P0(string4) : 0;
                n11 = n10;
                if (n10 == 0) {
                    n11 = this.O0(string4);
                }
            }
            if (n11 != 0) {
                object = n11 == 3 ? string4 : null;
                B5.L(bundle, n11, string4, object);
                bundle.remove(string4);
                n11 = n9;
            } else {
                if (B5.h0(bundle.get(string4))) {
                    ((f3)this).k().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", string2, string3, string4);
                    n11 = 22;
                } else {
                    n11 = this.x(string, string2, string4, bundle.get(string4), bundle, list, bl, false);
                }
                if (n11 != 0 && !"_ev".equals(string4)) {
                    B5.L(bundle, n11, string4, bundle.get(string4));
                    bundle.remove(string4);
                    n11 = n9;
                } else {
                    n11 = n9;
                    if (B5.L0(string4)) {
                        n11 = n9;
                        if (!B5.n0(string4, ax.f6.p.d)) {
                            n10 = n9 + 1;
                            if (!this.c0(231100000, true)) {
                                ((f3)this).k().H().c("Item array not supported on client's version of Google Play Services (Android Only)", ((f3)this).g().c(string2), ((f3)this).g().a(bundle));
                                B5.v0(bundle, 23);
                                bundle.remove(string4);
                                n11 = n10;
                            } else {
                                n11 = n10;
                                if (n10 > n8) {
                                    if (X6.a() && ((f3)this).d().t(F.y0)) {
                                        object = ((f3)this).k().H();
                                        StringBuilder stringBuilder = new StringBuilder("Item can't contain more than ");
                                        stringBuilder.append(n8);
                                        stringBuilder.append(" item-scoped custom params");
                                        ((X1)object).c(stringBuilder.toString(), ((f3)this).g().c(string2), ((f3)this).g().a(bundle));
                                        B5.v0(bundle, 28);
                                        bundle.remove(string4);
                                        n11 = n10;
                                    } else {
                                        ((f3)this).k().H().c("Item cannot contain custom parameters", ((f3)this).g().c(string2), ((f3)this).g().a(bundle));
                                        B5.v0(bundle, 23);
                                        bundle.remove(string4);
                                        n11 = n10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            n9 = n11;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean d0(Context context) {
        block6: {
            PackageManager packageManager;
            block5: {
                p.l(context);
                try {
                    packageManager = context.getPackageManager();
                    if (packageManager != null) break block5;
                    return false;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return false;
                }
            }
            ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver");
            context = packageManager.getReceiverInfo(componentName, 0);
            if (context == null) break block6;
            boolean bl = context.enabled;
            if (!bl) break block6;
            return true;
        }
        return false;
    }

    static boolean e0(Context context, boolean bl) {
        p.l(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return B5.B0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return B5.B0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean f0(Intent object) {
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(object = object.getStringExtra("android.intent.extra.REFERRER_NAME")) || "https://www.google.com".equals(object) || "android-app://com.google.appcrawler".equals(object);
        {
        }
    }

    static boolean g0(Bundle bundle, int n8) {
        int n9 = bundle.size();
        int n10 = 0;
        if (n9 <= n8) {
            return false;
        }
        for (String string : new TreeSet(bundle.keySet())) {
            n10 = n9 = n10 + 1;
            if (n9 <= n8) continue;
            bundle.remove(string);
            n10 = n9;
        }
        return true;
    }

    static boolean h0(Object object) {
        return object instanceof Parcelable[] || object instanceof ArrayList || object instanceof Bundle;
        {
        }
    }

    static boolean m0(String string, String string2, String string3, String string4) {
        boolean bl = TextUtils.isEmpty((CharSequence)string);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl && !bl2) {
            p.l(string);
            return !string.equals(string2);
        }
        if (bl && bl2) {
            if (!TextUtils.isEmpty((CharSequence)string3) && !TextUtils.isEmpty((CharSequence)string4)) {
                return !string3.equals(string4);
            }
            return !TextUtils.isEmpty((CharSequence)string4);
        }
        if (!bl && bl2) {
            if (TextUtils.isEmpty((CharSequence)string4)) {
                return false;
            }
            return TextUtils.isEmpty((CharSequence)string3) || !string3.equals(string4);
            {
            }
        }
        return TextUtils.isEmpty((CharSequence)string3) || !string3.equals(string4);
        {
        }
    }

    private static boolean n0(String string, String[] stringArray) {
        p.l(stringArray);
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!j.Objects.equals((Object)string, (Object)stringArray[i8])) continue;
            return true;
        }
        return false;
    }

    static byte[] q0(Parcelable object) {
        if (object == null) {
            return null;
        }
        Parcel parcel = Parcel.obtain();
        try {
            object.writeToParcel(parcel, 0);
            object = parcel.marshall();
            return object;
        }
        finally {
            parcel.recycle();
        }
    }

    public static ArrayList<Bundle> t0(List<f> object) {
        if (object == null) {
            return new ArrayList<Bundle>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<Bundle>(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            ax.N5.a a8 = (f)object.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", ((f)a8).q);
            bundle.putString("origin", ((f)a8).c0);
            bundle.putLong("creation_timestamp", ((f)a8).e0);
            bundle.putString("name", ((f)a8).d0.c0);
            n.b(bundle, p.l(((f)a8).d0.k()));
            bundle.putBoolean("active", ((f)a8).f0);
            Object object2 = ((f)a8).g0;
            if (object2 != null) {
                bundle.putString("trigger_event_name", (String)object2);
            }
            if ((object2 = ((f)a8).h0) != null) {
                bundle.putString("timed_out_event_name", ((D)object2).q);
                object2 = ((D)object2).c0;
                if (object2 != null) {
                    bundle.putBundle("timed_out_event_params", ((C)object2).B());
                }
            }
            bundle.putLong("trigger_timeout", ((f)a8).i0);
            object2 = ((f)a8).j0;
            if (object2 != null) {
                bundle.putString("triggered_event_name", ((D)object2).q);
                object2 = ((D)object2).c0;
                if (object2 != null) {
                    bundle.putBundle("triggered_event_params", ((C)object2).B());
                }
            }
            bundle.putLong("triggered_timestamp", ((f)a8).d0.d0);
            bundle.putLong("time_to_live", ((f)a8).k0);
            a8 = ((f)a8).l0;
            if (a8 != null) {
                bundle.putString("expired_event_name", ((D)a8).q);
                a8 = ((D)a8).c0;
                if (a8 != null) {
                    bundle.putBundle("expired_event_params", ((C)a8).B());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean u0(Context signature, String object) {
        block6: {
            CertificateException certificateException2;
            block8: {
                X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
                signature = ax.S5.e.a((Context)signature).d((String)object, 64);
                if (signature == null) break block6;
                signature = signature.signatures;
                if (signature == null) break block6;
                if (((Signature[])signature).length <= 0) break block6;
                signature = signature[0];
                try {
                    object = CertificateFactory.getInstance("X.509");
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                    boolean bl = ((X509Certificate)((CertificateFactory)object).generateCertificate(byteArrayInputStream)).getSubjectX500Principal().equals(x500Principal);
                    return bl;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                }
                catch (CertificateException certificateException2) {
                    break block8;
                }
                ((f3)this).k().G().b("Package name not found", (Object)nameNotFoundException);
                break block6;
            }
            ((f3)this).k().G().b("Error obtaining certificate", certificateException2);
        }
        return true;
    }

    private static boolean v0(Bundle bundle, int n8) {
        if (bundle == null) {
            return false;
        }
        if (bundle.getLong("_err") == 0L) {
            bundle.putLong("_err", (long)n8);
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private final int x(String object, String object2, String string, Object object3, Bundle object42, List<String> list, boolean bl, boolean bl2) {
        block15: {
            int n8;
            Object var8_14;
            block20: {
                block16: {
                    block17: {
                        Object var5_8;
                        Object object4;
                        boolean bl3;
                        block19: {
                            block18: {
                                ((f3)this).n();
                                bl3 = B5.h0(object3);
                                int n9 = 0;
                                if (!bl3) break block16;
                                if (var8_14 == false) break block17;
                                if (!B5.n0(string, ax.f6.p.c)) {
                                    return 20;
                                }
                                if (!this.a.J().g0()) {
                                    return 25;
                                }
                                bl3 = object3 instanceof Parcelable[];
                                if (!bl3) break block18;
                                n8 = ((Parcelable[])object3).length;
                                break block19;
                            }
                            if (!(object3 instanceof ArrayList)) break block16;
                            n8 = ((ArrayList)object3).size();
                        }
                        if (n8 <= 200) break block16;
                        ((f3)this).k().M().d("Parameter array is too long; discarded. Value kind, name, array length", "param", string, n8);
                        if (bl3) {
                            object4 = (Parcelable[])object3;
                            if (((Parcelable[])object4).length > 200) {
                                var5_8.putParcelableArray(string, (Parcelable[])Arrays.copyOf(object4, 200));
                            }
                        } else if (object3 instanceof ArrayList && ((ArrayList)(object4 = (ArrayList)object3)).size() > 200) {
                            var5_8.putParcelableArrayList(string, new ArrayList(((ArrayList)object4).subList(0, 200)));
                        }
                        n8 = 17;
                        break block20;
                    }
                    return 21;
                }
                n8 = 0;
            }
            int n10 = !B5.J0((String)object2) && !B5.J0(string) ? ((f3)this).d().r(null, false) : ((f3)this).d().w(null, false);
            if (this.l0("param", string, n10, object3)) {
                return n8;
            }
            if (var8_14 != false) {
                List<String> var7_13;
                List<String> var6_12;
                if (object3 instanceof Bundle) {
                    this.a0((String)object, (String)object2, string, (Bundle)object3, (List<String>)var6_12, (boolean)var7_13);
                    return n8;
                }
                if (object3 instanceof Parcelable[]) {
                    for (Parcelable parcelable : (Parcelable[])object3) {
                        if (!(parcelable instanceof Bundle)) {
                            ((f3)this).k().M().c("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), string);
                            break block15;
                        }
                        this.a0((String)object, (String)object2, string, (Bundle)parcelable, (List<String>)var6_12, (boolean)var7_13);
                    }
                    return n8;
                }
                if (object3 instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList)object3;
                    int n11 = arrayList.size();
                    for (n10 = n9; n10 < n11; ++n10) {
                        Object e8 = arrayList.get(n10);
                        if (!(e8 instanceof Bundle)) {
                            object2 = ((f3)this).k().M();
                            object = e8 != null ? e8.getClass() : "null";
                            ((X1)object2).c("All ArrayList elements must be of type Bundle. Value type, name", object, string);
                            break block15;
                        }
                        this.a0((String)object, (String)object2, string, (Bundle)e8, (List<String>)var6_12, (boolean)var7_13);
                    }
                    return n8;
                }
            }
        }
        return 4;
    }

    static Bundle[] x0(Object object) {
        if (object instanceof Bundle) {
            return new Bundle[]{(Bundle)object};
        }
        if (object instanceof Parcelable[]) {
            object = (Parcelable[])object;
            return (Bundle[])Arrays.copyOf(object, ((Parcelable[])object).length, Bundle[].class);
        }
        if (object instanceof ArrayList) {
            object = (ArrayList)object;
            return ((ArrayList)object).toArray(new Bundle[((ArrayList)object).size()]);
        }
        return null;
    }

    public static long y(long l8, long l9) {
        return (l8 + l9 * 60000L) / 86400000L;
    }

    static int y0() {
        if (Build.VERSION.SDK_INT >= 30 && ax.c2.a.a(30) > 3) {
            return ax.c2.a.a(1000000);
        }
        return 0;
    }

    final Object A0(String string, Object object) {
        if ("_ldl".equals(string)) {
            return this.I(B5.Q0(string), object, true, false, null);
        }
        return this.I(B5.Q0(string), object, false, false, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Bundle C(Uri object, boolean bl) {
        UnsupportedOperationException unsupportedOperationException2;
        block24: {
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            block25: {
                block23: {
                    if (object == null) {
                        return null;
                    }
                    try {
                        boolean bl2 = object.isHierarchical();
                        if (bl2) {
                            string10 = object.getQueryParameter("utm_campaign");
                            string9 = object.getQueryParameter("utm_source");
                            string8 = object.getQueryParameter("utm_medium");
                            string7 = object.getQueryParameter("gclid");
                            string6 = bl ? object.getQueryParameter("gbraid") : null;
                        }
                        break block23;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException2) {
                        break block24;
                    }
                    string5 = object.getQueryParameter("utm_id");
                    string4 = object.getQueryParameter("dclid");
                    string3 = object.getQueryParameter("srsltid");
                    string2 = object.getQueryParameter("sfmc_id");
                    string = string6;
                    break block25;
                }
                Object var14_15 = null;
                string2 = string3 = (string4 = (string5 = (string = (string9 = (string6 = (string10 = null))))));
                string7 = string9;
                string8 = string6;
                string9 = string10;
                string10 = var14_15;
            }
            if (TextUtils.isEmpty((CharSequence)string10) && TextUtils.isEmpty((CharSequence)string9) && TextUtils.isEmpty((CharSequence)string8) && TextUtils.isEmpty((CharSequence)string7) && (!bl || TextUtils.isEmpty((CharSequence)string)) && TextUtils.isEmpty((CharSequence)string5) && TextUtils.isEmpty((CharSequence)string4) && TextUtils.isEmpty((CharSequence)string3) && TextUtils.isEmpty((CharSequence)string2)) {
                return null;
            }
            string6 = new Bundle();
            if (!TextUtils.isEmpty((CharSequence)string10)) {
                string6.putString("campaign", string10);
            }
            if (!TextUtils.isEmpty((CharSequence)string9)) {
                string6.putString("source", string9);
            }
            if (!TextUtils.isEmpty((CharSequence)string8)) {
                string6.putString("medium", string8);
            }
            if (!TextUtils.isEmpty((CharSequence)string7)) {
                string6.putString("gclid", string7);
            }
            if (bl && !TextUtils.isEmpty((CharSequence)string)) {
                string6.putString("gbraid", string);
            }
            string9 = object.getQueryParameter("gad_source");
            if (bl && !TextUtils.isEmpty((CharSequence)string9)) {
                string6.putString("gad_source", string9);
            }
            if (!TextUtils.isEmpty((CharSequence)(string9 = object.getQueryParameter("utm_term")))) {
                string6.putString("term", string9);
            }
            if (!TextUtils.isEmpty((CharSequence)(string9 = object.getQueryParameter("utm_content")))) {
                string6.putString("content", string9);
            }
            if (!TextUtils.isEmpty((CharSequence)(string9 = object.getQueryParameter("aclid")))) {
                string6.putString("aclid", string9);
            }
            if (!TextUtils.isEmpty((CharSequence)(string9 = object.getQueryParameter("cp1")))) {
                string6.putString("cp1", string9);
            }
            if (!TextUtils.isEmpty((CharSequence)(string9 = object.getQueryParameter("anid")))) {
                string6.putString("anid", string9);
            }
            if (!TextUtils.isEmpty((CharSequence)string5)) {
                string6.putString("campaign_id", string5);
            }
            if (!TextUtils.isEmpty((CharSequence)string4)) {
                string6.putString("dclid", string4);
            }
            if (!TextUtils.isEmpty((CharSequence)(string9 = object.getQueryParameter("utm_source_platform")))) {
                string6.putString("source_platform", string9);
            }
            if (!TextUtils.isEmpty((CharSequence)(string9 = object.getQueryParameter("utm_creative_format")))) {
                string6.putString("creative_format", string9);
            }
            if (!TextUtils.isEmpty((CharSequence)(object = object.getQueryParameter("utm_marketing_tactic")))) {
                string6.putString("marketing_tactic", (String)object);
            }
            if (!TextUtils.isEmpty((CharSequence)string3)) {
                string6.putString("srsltid", string3);
            }
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                string6.putString("sfmc_id", string2);
            }
            return string6;
        }
        ((f3)this).k().L().b("Install referrer url isn't a hierarchical URI", unsupportedOperationException2);
        return null;
    }

    final boolean C0(String string, String string2) {
        int n8;
        if (string2 == null) {
            ((f3)this).k().H().b("Name is required and can't be null. Type", string);
            return false;
        }
        if (string2.length() == 0) {
            ((f3)this).k().H().b("Name is required and can't be empty. Type", string);
            return false;
        }
        int n9 = string2.codePointAt(0);
        if (!Character.isLetter(n9)) {
            ((f3)this).k().H().c("Name must start with a letter. Type, name", string, string2);
            return false;
        }
        int n10 = string2.length();
        for (n9 = Character.charCount(n9); n9 < n10; n9 += Character.charCount(n8)) {
            n8 = string2.codePointAt(n9);
            if (n8 == 95 || Character.isLetterOrDigit(n8)) continue;
            ((f3)this).k().H().c("Name must consist of letters, digits or _ (underscores). Type, name", string, string2);
            return false;
        }
        return true;
    }

    final Bundle E(Bundle bundle, String string2) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String string2 : bundle.keySet()) {
                Object object = this.s0(string2, bundle.get(string2));
                if (object == null) {
                    ((f3)this).k().M().b("Param value can't be null", ((f3)this).g().f(string2));
                    continue;
                }
                this.O(bundle2, string2, object);
            }
        }
        return bundle2;
    }

    final boolean E0(String string, String string2) {
        if (r7.a() && ((f3)this).d().t(F.u0) && !TextUtils.isEmpty((CharSequence)string2)) {
            return true;
        }
        if (TextUtils.isEmpty((CharSequence)string)) {
            return false;
        }
        return ((f3)this).d().P().equals(string);
    }

    /*
     * Unable to fully structure code
     */
    final Bundle F(String var1_1, String var2_2, Bundle var3_3, List<String> var4_4, boolean var5_5) {
        block8: {
            var10_6 = B5.n0(var2_2, q.d);
            if (var3_3 == null) break block8;
            var14_7 = new Bundle(var3_3);
            var9_8 = this.d().H();
            var13_9 = new TreeSet<E>(var3_3.keySet()).iterator();
            var8_10 = 0;
            block0: while (var13_9.hasNext()) {
                block12: {
                    block10: {
                        block11: {
                            block9: {
                                var11_13 = (String)var13_9.next();
                                if (var4_4 != null && var4_4.contains(var11_13)) {
                                    var6_11 = 0;
                                } else {
                                    var7_12 = var5_5 == false ? this.P0(var11_13) : 0;
                                    var6_11 = var7_12;
                                    if (var7_12 == 0) {
                                        var6_11 = this.O0(var11_13);
                                    }
                                }
                                if (var6_11 == 0) break block9;
                                var12_14 = var6_11 == 3 ? var11_13 : null;
                                B5.L(var14_7, var6_11, var11_13, var12_14);
                                var14_7.remove(var11_13);
                                var6_11 = var8_10;
                                break block10;
                            }
                            var6_11 = this.x(var1_1, var2_2, var11_13, var3_3.get(var11_13), var14_7, var4_4, var5_5, var10_6);
                            if (var6_11 != 17) break block11;
                            B5.L(var14_7, var6_11, var11_13, Boolean.FALSE);
                            break block12;
                        }
                        if (var6_11 == 0 || "_ev".equals(var11_13)) break block12;
                        var12_14 = var6_11 == 21 ? var2_2 : var11_13;
                        B5.L(var14_7, var6_11, (String)var12_14, var3_3.get(var11_13));
                        var14_7.remove(var11_13);
                        var6_11 = var8_10;
                    }
lbl34:
                    // 4 sources

                    while (true) {
                        var8_10 = var6_11;
                        continue block0;
                        break;
                    }
                }
                var6_11 = var8_10;
                if (!B5.L0(var11_13)) ** GOTO lbl34
                var6_11 = var7_12 = var8_10 + 1;
                if (var7_12 <= var9_8) ** GOTO lbl34
                var12_14 = new StringBuilder("Event can't contain more than ");
                var12_14.append(var9_8);
                var12_14.append(" params");
                var12_14 = var12_14.toString();
                this.k().H().c((String)var12_14, this.g().c(var2_2), this.g().a(var3_3));
                B5.v0(var14_7, 5);
                var14_7.remove(var11_13);
                var6_11 = var7_12;
                ** continue;
            }
            return var14_7;
        }
        return null;
    }

    final boolean F0(String string) {
        ((f3)this).n();
        if (ax.S5.e.a(((f3)this).a()).a(string) == 0) {
            return true;
        }
        ((f3)this).k().F().b("Permission not granted", string);
        return false;
    }

    final D H(String string, String string2, Bundle bundle, String string3, long l8, boolean bl, boolean bl2) {
        if (TextUtils.isEmpty((CharSequence)string2)) {
            return null;
        }
        if (this.v(string2) == 0) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putString("_o", string3);
            bundle = bundle2 = this.F(string, string2, bundle2, ax.R5.f.a("_o"), true);
            if (bl) {
                bundle = this.E(bundle2, string);
            }
            p.l(bundle);
            return new D(string2, new C(bundle), string3, l8);
        }
        ((f3)this).k().G().b("Invalid conditional property event name", ((f3)this).g().g(string2));
        throw new IllegalArgumentException();
    }

    public final int I0() {
        if (this.h == null) {
            this.h = ax.J5.i.f().a(((f3)this).a()) / 1000;
        }
        return this.h;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final URL K(long l8, String object, String string, long l9, String string2) {
        RuntimeException var3_5;
        block5: {
            block4: {
                try {
                    String string3;
                    p.f(string);
                    p.f((String)object);
                    string = string3 = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", l8, this.I0()), string, object, l9);
                    if (!((String)object).equals(((f3)this).d().Q())) break block4;
                    string = string3.concat("&ddl_test=1");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    break block5;
                }
                catch (MalformedURLException malformedURLException) {
                    break block5;
                }
            }
            object = string;
            if (string2.isEmpty()) return new URL((String)object);
            object = string;
            if (string2.charAt(0) != '&') {
                object = string.concat("&");
            }
            object = ((String)object).concat(string2);
            return new URL((String)object);
        }
        ((f3)this).k().G().b("Failed to create BOW URL for Deferred Deep Link. exception", var3_5.getMessage());
        return null;
    }

    final long K0() {
        ((f3)this).n();
        if (!B5.D0(this.a.B().F())) {
            return 0L;
        }
        long l8 = Build.VERSION.SDK_INT < 30 ? 4L : (ax.c2.a.a(30) < 4 ? 8L : (B5.y0() < (Integer)F.W.a(null) ? 16L : 0L));
        long l9 = l8;
        if (!this.F0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            l9 = l8 | 2L;
        }
        l8 = l9;
        if (l9 == 0L) {
            l8 = l9;
            if (!this.Z0()) {
                l8 = l9 | 0x40L;
            }
        }
        if (l8 == 0L) {
            return 1L;
        }
        return l8;
    }

    final void M(Bundle bundle, long l8) {
        long l9 = bundle.getLong("_et");
        if (l9 != 0L) {
            ((f3)this).k().L().b("Params already contained engagement", l9);
        }
        bundle.putLong("_et", l8 + l9);
    }

    public final boolean M0(String object) {
        if (TextUtils.isEmpty((CharSequence)object)) {
            return false;
        }
        object = ((f3)this).a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse((String)object)), 0);
        return object != null && !object.isEmpty();
    }

    final void N(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String string : bundle2.keySet()) {
                if (bundle.containsKey(string)) continue;
                ((f3)this).i().O(bundle, string, bundle2.get(string));
            }
        }
    }

    final void O(Bundle object, String string, Object object2) {
        if (object != null) {
            if (object2 instanceof Long) {
                object.putLong(string, ((Long)object2).longValue());
                return;
            }
            if (object2 instanceof String) {
                object.putString(string, String.valueOf(object2));
                return;
            }
            if (object2 instanceof Double) {
                object.putDouble(string, ((Double)object2).doubleValue());
                return;
            }
            if (object2 instanceof Bundle[]) {
                object.putParcelableArray(string, (Parcelable[])((Bundle[])object2));
                return;
            }
            if (string != null) {
                object = object2 != null ? object2.getClass().getSimpleName() : null;
                ((f3)this).k().M().c("Not putting event parameter. Invalid value type. name, type", ((f3)this).g().f(string), object);
            }
        }
    }

    public final void P(M0 m02, int n8) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", n8);
        try {
            m02.n(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.k().L().b("Error returning int value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void Q(M0 m02, long l8) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", l8);
        try {
            m02.n(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.k().L().b("Error returning long value to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void R(M0 m02, Bundle bundle) {
        try {
            m02.n(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.k().L().b("Error returning bundle value to wrapper", (Object)remoteException);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long R0() {
        if (this.d.get() == 0L) {
            AtomicLong atomicLong = this.d;
            synchronized (atomicLong) {
                int n8;
                Random random = new Random(System.nanoTime() ^ ((f3)this).b().a());
                long l8 = random.nextLong();
                this.e = n8 = this.e + 1;
                long l9 = n8;
                return l8 + l9;
            }
        }
        AtomicLong atomicLong = this.d;
        synchronized (atomicLong) {
            this.d.compareAndSet(-1L, 1L);
            return this.d.getAndIncrement();
        }
    }

    public final void S(M0 m02, String string) {
        Bundle bundle = new Bundle();
        bundle.putString("r", string);
        try {
            m02.n(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.k().L().b("Error returning string value to wrapper", (Object)remoteException);
            return;
        }
    }

    final a S0() {
        if (this.f == null) {
            this.f = ax.e2.a.a(((f3)this).a());
        }
        return this.f;
    }

    public final void T(M0 m02, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            m02.n(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.k().L().b("Error returning bundle list to wrapper", (Object)remoteException);
            return;
        }
    }

    public final void U(M0 m02, boolean bl) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", bl);
        try {
            m02.n(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.k().L().b("Error returning boolean value to wrapper", (Object)remoteException);
            return;
        }
    }

    final String U0() {
        byte[] byArray = new byte[16];
        this.W0().nextBytes(byArray);
        return String.format(Locale.US, "%032x", new BigInteger(1, byArray));
    }

    public final void V(M0 m02, byte[] byArray) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", byArray);
        try {
            m02.n(bundle);
            return;
        }
        catch (RemoteException remoteException) {
            this.a.k().L().b("Error returning byte array to wrapper", (Object)remoteException);
            return;
        }
    }

    final void W(a2 a22, int n8) {
        Iterator iterator = new TreeSet(a22.d.keySet()).iterator();
        int n9 = 0;
        while (iterator.hasNext()) {
            int n10;
            String string = (String)iterator.next();
            if (!B5.L0(string)) continue;
            n9 = n10 = n9 + 1;
            if (n10 <= n8) continue;
            CharSequence charSequence = new StringBuilder("Event can't contain more than ");
            charSequence.append(n8);
            charSequence.append(" params");
            charSequence = charSequence.toString();
            ((f3)this).k().H().c((String)charSequence, ((f3)this).g().c(a22.a), ((f3)this).g().a(a22.d));
            B5.v0(a22.d, 5);
            a22.d.remove(string);
            n9 = n10;
        }
    }

    final SecureRandom W0() {
        ((f3)this).n();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    final boolean X0() {
        ((f3)this).n();
        return this.K0() == 1L;
    }

    public final boolean Y0() {
        try {
            ((f3)this).a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    final void b0(Parcelable[] parcelableArray, int n8, boolean bl) {
        p.l(parcelableArray);
        int n9 = parcelableArray.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            Bundle bundle = (Bundle)parcelableArray[i8];
            Iterator iterator = new TreeSet(bundle.keySet()).iterator();
            int n10 = 0;
            while (iterator.hasNext()) {
                int n11;
                String string = (String)iterator.next();
                if (!B5.L0(string) || B5.n0(string, ax.f6.p.d)) continue;
                n10 = n11 = n10 + 1;
                if (n11 <= n8) continue;
                if (bl) {
                    X1 x12 = ((f3)this).k().H();
                    StringBuilder stringBuilder = new StringBuilder("Param can't contain more than ");
                    stringBuilder.append(n8);
                    stringBuilder.append(" item-scoped custom parameters");
                    x12.c(stringBuilder.toString(), ((f3)this).g().f(string), ((f3)this).g().a(bundle));
                    B5.v0(bundle, 28);
                } else {
                    ((f3)this).k().H().c("Param cannot contain item-scoped custom parameters", ((f3)this).g().f(string), ((f3)this).g().a(bundle));
                    B5.v0(bundle, 23);
                }
                bundle.remove(string);
                n10 = n11;
            }
        }
    }

    public final boolean c0(int n8, boolean bl) {
        Boolean bl2 = this.a.J().W();
        return this.I0() >= n8 / 1000 || bl2 != null && !bl2.booleanValue();
        {
        }
    }

    @SuppressLint(value={"ApplySharedPref"})
    final boolean i0(String string, double d8) {
        try {
            SharedPreferences.Editor editor = ((f3)this).a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editor.putString("deeplink", string);
            editor.putLong("timestamp", Double.doubleToRawLongBits(d8));
            boolean bl = editor.commit();
            return bl;
        }
        catch (RuntimeException runtimeException) {
            ((f3)this).k().G().b("Failed to persist Deferred Deep Link. exception", runtimeException);
            return false;
        }
    }

    final boolean j0(String string, int n8, String string2) {
        if (string2 == null) {
            ((f3)this).k().H().b("Name is required and can't be null. Type", string);
            return false;
        }
        if (string2.codePointCount(0, string2.length()) > n8) {
            ((f3)this).k().H().d("Name is too long. Type, maximum supported length, name", string, n8, string2);
            return false;
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final boolean k0(String string, String string2) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            if (B5.T0(string)) return true;
            if (!this.a.r()) return false;
            ((f3)this).k().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", V1.v(string));
            return false;
        }
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            if (B5.T0(string2)) return true;
            ((f3)this).k().H().b("Invalid admob_app_id. Analytics disabled.", V1.v(string2));
            return false;
        }
        if (!this.a.r()) return false;
        ((f3)this).k().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        return false;
    }

    final boolean l0(String string, String string2, int n8, Object object) {
        if (object == null) {
            return true;
        }
        if (!(object instanceof Long || object instanceof Float || object instanceof Integer || object instanceof Byte || object instanceof Short || object instanceof Boolean || object instanceof Double)) {
            if (!(object instanceof String || object instanceof Character || object instanceof CharSequence)) {
                return false;
            }
            if (((String)(object = String.valueOf(object))).codePointCount(0, ((String)object).length()) > n8) {
                ((f3)this).k().M().d("Value is too long; discarded. Value kind, name, value length", string, string2, ((String)object).length());
                return false;
            }
        }
        return true;
    }

    @Override
    protected final void o() {
        long l8;
        ((f3)this).n();
        SecureRandom secureRandom = new SecureRandom();
        long l9 = l8 = secureRandom.nextLong();
        if (l8 == 0L) {
            l9 = l8 = secureRandom.nextLong();
            if (l8 == 0L) {
                ((f3)this).k().L().a("Utils falling back to Random for random id");
                l9 = l8;
            }
        }
        this.d.set(l9);
    }

    final boolean o0(String string, String[] stringArray, String string2) {
        return this.p0(string, stringArray, null, string2);
    }

    final boolean p0(String string, String[] stringArray, String[] stringArray2, String string2) {
        if (string2 == null) {
            ((f3)this).k().H().b("Name is required and can't be null. Type", string);
            return false;
        }
        p.l(string2);
        String[] stringArray3 = i;
        int n8 = stringArray3.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!string2.startsWith(stringArray3[i8])) continue;
            ((f3)this).k().H().c("Name starts with reserved prefix. Type, name", string, string2);
            return false;
        }
        if (stringArray != null && B5.n0(string2, stringArray) && (stringArray2 == null || !B5.n0(string2, stringArray2))) {
            ((f3)this).k().H().c("Name is reserved. Type, name", string, string2);
            return false;
        }
        return true;
    }

    final int r0(String string) {
        if (!this.w0("user property", string)) {
            return 6;
        }
        if (!this.o0("user property", s.a, string)) {
            return 15;
        }
        if (!this.j0("user property", 24, string)) {
            return 6;
        }
        return 0;
    }

    final Object s0(String string, Object object) {
        if ("_ev".equals(string)) {
            return this.I(((f3)this).d().w(null, false), object, true, true, null);
        }
        int n8 = B5.J0(string) ? ((f3)this).d().w(null, false) : ((f3)this).d().r(null, false);
        return this.I(n8, object, false, true, null);
    }

    @Override
    protected final boolean t() {
        return true;
    }

    public final int u(int n8) {
        return ax.J5.i.f().h(((f3)this).a(), 12451000);
    }

    final int v(String string) {
        if (!this.w0("event", string)) {
            return 2;
        }
        if (!this.p0("event", q.a, q.b, string)) {
            return 13;
        }
        if (!this.j0("event", 40, string)) {
            return 2;
        }
        return 0;
    }

    final int w(String string, Object object) {
        boolean bl = "_ldl".equals(string) ? this.l0("user property referrer", string, B5.Q0(string), object) : this.l0("user property", string, B5.Q0(string), object);
        if (bl) {
            return 0;
        }
        return 7;
    }

    final boolean w0(String string, String string2) {
        int n8;
        if (string2 == null) {
            ((f3)this).k().H().b("Name is required and can't be null. Type", string);
            return false;
        }
        if (string2.length() == 0) {
            ((f3)this).k().H().b("Name is required and can't be empty. Type", string);
            return false;
        }
        int n9 = string2.codePointAt(0);
        if (!Character.isLetter(n9) && n9 != 95) {
            ((f3)this).k().H().c("Name must start with a letter or _ (underscore). Type, name", string, string2);
            return false;
        }
        int n10 = string2.length();
        for (n9 = Character.charCount(n9); n9 < n10; n9 += Character.charCount(n8)) {
            n8 = string2.codePointAt(n9);
            if (n8 == 95 || Character.isLetterOrDigit(n8)) continue;
            ((f3)this).k().H().c("Name must consist of letters, digits or _ (underscores). Type, name", string, string2);
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final long z(Context signatureArray, String string) {
        block5: {
            ((f3)this).n();
            p.l(signatureArray);
            p.f(string);
            PackageManager packageManager = signatureArray.getPackageManager();
            MessageDigest messageDigest = B5.V0();
            if (messageDigest == null) {
                ((f3)this).k().G().a("Could not get MD5 instance");
                return -1L;
            }
            if (packageManager != null) {
                PackageManager.NameNotFoundException nameNotFoundException2;
                block6: {
                    try {
                        if (this.u0((Context)signatureArray, string)) break block5;
                        signatureArray = ax.S5.e.a((Context)signatureArray).d((String)((f3)this).a().getPackageName(), (int)64).signatures;
                        if (signatureArray != null && signatureArray.length > 0) {
                            return B5.B(messageDigest.digest(signatureArray[0].toByteArray()));
                        }
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException2) {
                        break block6;
                    }
                    ((f3)this).k().L().a("Could not get signatures");
                    return -1L;
                }
                ((f3)this).k().G().b("Package name not found", (Object)nameNotFoundException2);
            }
        }
        return 0L;
    }

    final long z0(String string) {
        int n8;
        block4: {
            if (((f3)this).a().getPackageManager() == null) {
                return 0L;
            }
            int n9 = 0;
            ApplicationInfo applicationInfo = ax.S5.e.a(((f3)this).a()).b(string, 0);
            n8 = n9;
            if (applicationInfo == null) break block4;
            try {
                n8 = applicationInfo.targetSdkVersion;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                ((f3)this).k().J().b("PackageManager failed to find running app: app_id", string);
                n8 = n9;
            }
        }
        return n8;
    }
}

