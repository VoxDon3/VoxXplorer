package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import ax.J5.C0748i;
import ax.J5.C0752m;
import ax.M5.C0821p;
import ax.b6.X6;
import ax.b6.r7;
import ax.e2.AbstractC1973a;
import ax.f6.C2066n;
import ax.f6.C2068p;
import ax.f6.C2069q;
import ax.f6.C2071s;
import j$.util.Objects;
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

/* loaded from: classes3.dex */
public final class B5 extends AbstractC3646e3 {
    private static final String[] i = {"firebase_", "google_", "ga_"};
    private static final String[] j = {"_err"};
    private SecureRandom c;
    private final AtomicLong d;
    private int e;
    private AbstractC1973a f;
    private Boolean g;
    private Integer h;

    B5(E2 e2) {
        super(e2);
        this.h = null;
        this.d = new AtomicLong(0L);
    }

    public static long A(C c) {
        long j2 = 0;
        if (c == null) {
            return 0L;
        }
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            if (c.D(it.next()) instanceof Parcelable[]) {
                j2 += ((Parcelable[]) r3).length;
            }
        }
        return j2;
    }

    static long B(byte[] bArr) {
        C0821p.l(bArr);
        int i2 = 0;
        C0821p.o(bArr.length > 0);
        long j2 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j2 += (bArr[length] & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    private static boolean B0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static Bundle D(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        if (parcelableArr[i2] instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle2;
    }

    static boolean D0(String str) {
        return G0(F.c0.a(null), str);
    }

    public static Bundle G(List<A5> list) {
        Bundle bundle = new Bundle();
        if (list != null) {
            for (A5 a5 : list) {
                String str = a5.f0;
                if (str != null) {
                    bundle.putString(a5.c0, str);
                } else {
                    Long l = a5.e0;
                    if (l != null) {
                        bundle.putLong(a5.c0, l.longValue());
                    } else {
                        Double d = a5.h0;
                        if (d != null) {
                            bundle.putDouble(a5.c0, d.doubleValue());
                        }
                    }
                }
            }
        }
        return bundle;
    }

    private static boolean G0(String str, String str2) {
        return str.equals("*") || Arrays.asList(str.split(",")).contains(str2);
    }

    static boolean H0(String str) {
        return G0(F.v0.a(null), str);
    }

    private final Object I(int i2, Object obj, boolean z, boolean z2, String str) {
        Bundle E;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Long) {
            return obj;
        }
        if (obj instanceof Double) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return J(String.valueOf(obj), i2, z);
        }
        if (!z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (E = E((Bundle) parcelable, null)) != null && !E.isEmpty()) {
                arrayList.add(E);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static String J(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (!z) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i2)) + "...";
    }

    static boolean J0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private static void L(Bundle bundle, int i2, String str, Object obj) {
        if (v0(bundle, i2)) {
            bundle.putString("_ev", J(str, 40, true));
            if (obj != null) {
                C0821p.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    static boolean L0(String str) {
        C0821p.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean N0(String str) {
        for (String str2 : j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private final int O0(String str) {
        if (!w0("event param", str)) {
            return 3;
        }
        if (o0("event param", null, str)) {
            return !j0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int P0(String str) {
        if (!C0("event param", str)) {
            return 3;
        }
        if (o0("event param", null, str)) {
            return !j0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int Q0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return "_lgclid".equals(str) ? 100 : 36;
    }

    private static boolean T0(String str) {
        C0821p.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest V0() {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static void X(C3640d4 c3640d4, Bundle bundle, boolean z) {
        if (bundle == null || c3640d4 == null || (bundle.containsKey("_sc") && !z)) {
            if (bundle != null && c3640d4 == null && z) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c3640d4.a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c3640d4.b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c3640d4.c);
    }

    public static void Y(D5 d5, int i2, String str, String str2, int i3) {
        Z(d5, null, i2, str, str2, i3);
    }

    static void Z(D5 d5, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        v0(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        d5.b(str, "_err", bundle);
    }

    @TargetApi(30)
    private final boolean Z0() {
        Integer num;
        if (this.g == null) {
            AbstractC1973a S0 = S0();
            boolean z = false;
            if (S0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = S0.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z = true;
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        num2 = num;
                        k().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        k().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (CancellationException e2) {
                        e = e2;
                        num2 = num;
                        k().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        k().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (ExecutionException e3) {
                        e = e3;
                        num2 = num;
                        k().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        k().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    } catch (TimeoutException e4) {
                        e = e4;
                        num2 = num;
                        k().L().b("Measurement manager api exception", e);
                        this.g = Boolean.FALSE;
                        num = num2;
                        k().K().b("Measurement manager api status result", num);
                        return this.g.booleanValue();
                    }
                }
                this.g = Boolean.valueOf(z);
            } catch (InterruptedException e5) {
                e = e5;
            } catch (CancellationException e6) {
                e = e6;
            } catch (ExecutionException e7) {
                e = e7;
            } catch (TimeoutException e8) {
                e = e8;
            }
            k().K().b("Measurement manager api status result", num);
        }
        return this.g.booleanValue();
    }

    private final void a0(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int P0;
        int x;
        List<String> list2 = list;
        if (bundle == null) {
            return;
        }
        int x2 = d().x();
        int i2 = 0;
        for (String str4 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str4)) {
                P0 = !z ? P0(str4) : 0;
                if (P0 == 0) {
                    P0 = O0(str4);
                }
            } else {
                P0 = 0;
            }
            if (P0 != 0) {
                L(bundle, P0, str4, P0 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (h0(bundle.get(str4))) {
                    k().M().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str4);
                    x = 22;
                } else {
                    x = x(str, str2, str4, bundle.get(str4), bundle, list2, z, false);
                }
                if (x != 0 && !"_ev".equals(str4)) {
                    L(bundle, x, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (L0(str4) && !n0(str4, C2068p.d)) {
                    i2++;
                    if (!c0(231100000, true)) {
                        k().H().c("Item array not supported on client's version of Google Play Services (Android Only)", g().c(str2), g().a(bundle));
                        v0(bundle, 23);
                        bundle.remove(str4);
                    } else if (i2 > x2) {
                        if (X6.a() && d().t(F.y0)) {
                            k().H().c("Item can't contain more than " + x2 + " item-scoped custom params", g().c(str2), g().a(bundle));
                            v0(bundle, 28);
                            bundle.remove(str4);
                        } else {
                            k().H().c("Item cannot contain custom parameters", g().c(str2), g().a(bundle));
                            v0(bundle, 23);
                            bundle.remove(str4);
                        }
                    }
                }
            }
            list2 = list;
        }
    }

    static boolean d0(Context context) {
        ActivityInfo receiverInfo;
        C0821p.l(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static boolean e0(Context context, boolean z) {
        C0821p.l(context);
        return Build.VERSION.SDK_INT >= 24 ? B0(context, "com.google.android.gms.measurement.AppMeasurementJobService") : B0(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    static boolean f0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean g0(Bundle bundle, int i2) {
        int i3 = 0;
        if (bundle.size() <= i2) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i3++;
            if (i3 > i2) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean h0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean m0(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            C0821p.l(str);
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean n0(String str, String[] strArr) {
        C0821p.l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static byte[] q0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList<Bundle> t0(List<C3649f> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C3649f c3649f : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c3649f.q);
            bundle.putString("origin", c3649f.c0);
            bundle.putLong("creation_timestamp", c3649f.e0);
            bundle.putString("name", c3649f.d0.c0);
            C2066n.b(bundle, C0821p.l(c3649f.d0.k()));
            bundle.putBoolean("active", c3649f.f0);
            String str = c3649f.g0;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            D d = c3649f.h0;
            if (d != null) {
                bundle.putString("timed_out_event_name", d.q);
                C c = d.c0;
                if (c != null) {
                    bundle.putBundle("timed_out_event_params", c.B());
                }
            }
            bundle.putLong("trigger_timeout", c3649f.i0);
            D d2 = c3649f.j0;
            if (d2 != null) {
                bundle.putString("triggered_event_name", d2.q);
                C c2 = d2.c0;
                if (c2 != null) {
                    bundle.putBundle("triggered_event_params", c2.B());
                }
            }
            bundle.putLong("triggered_timestamp", c3649f.d0.d0);
            bundle.putLong("time_to_live", c3649f.k0);
            D d3 = c3649f.l0;
            if (d3 != null) {
                bundle.putString("expired_event_name", d3.q);
                C c3 = d3.c0;
                if (c3 != null) {
                    bundle.putBundle("expired_event_params", c3.B());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean u0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo d = ax.S5.e.a(context).d(str, 64);
            if (d == null || (signatureArr = d.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e) {
            k().G().b("Package name not found", e);
            return true;
        } catch (CertificateException e2) {
            k().G().b("Error obtaining certificate", e2);
            return true;
        }
    }

    private static boolean v0(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i2);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int x(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List<java.lang.String> r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.B5.x(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    static Bundle[] x0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static long y(long j2, long j3) {
        return (j2 + (j3 * 60000)) / 86400000;
    }

    static int y0() {
        int extensionVersion;
        int extensionVersion2;
        if (Build.VERSION.SDK_INT < 30) {
            return 0;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        if (extensionVersion <= 3) {
            return 0;
        }
        extensionVersion2 = SdkExtensions.getExtensionVersion(1000000);
        return extensionVersion2;
    }

    final Object A0(String str, Object obj) {
        return "_ldl".equals(str) ? I(Q0(str), obj, true, false, null) : I(Q0(str), obj, false, false, null);
    }

    final Bundle C(Uri uri, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str = uri.getQueryParameter("utm_campaign");
                str2 = uri.getQueryParameter("utm_source");
                str3 = uri.getQueryParameter("utm_medium");
                str4 = uri.getQueryParameter("gclid");
                str5 = z ? uri.getQueryParameter("gbraid") : null;
                str6 = uri.getQueryParameter("utm_id");
                str7 = uri.getQueryParameter("dclid");
                str8 = uri.getQueryParameter("srsltid");
                str9 = uri.getQueryParameter("sfmc_id");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && ((!z || TextUtils.isEmpty(str5)) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7) && TextUtils.isEmpty(str8) && TextUtils.isEmpty(str9))) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(str)) {
                str10 = "sfmc_id";
            } else {
                str10 = "sfmc_id";
                bundle.putString("campaign", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("source", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("medium", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("gclid", str4);
            }
            if (z && !TextUtils.isEmpty(str5)) {
                bundle.putString("gbraid", str5);
            }
            String queryParameter = uri.getQueryParameter("gad_source");
            if (z && !TextUtils.isEmpty(queryParameter)) {
                bundle.putString("gad_source", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("term", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("content", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("aclid", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("cp1", queryParameter5);
            }
            String queryParameter6 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("anid", queryParameter6);
            }
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("campaign_id", str6);
            }
            if (!TextUtils.isEmpty(str7)) {
                bundle.putString("dclid", str7);
            }
            String queryParameter7 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("source_platform", queryParameter7);
            }
            String queryParameter8 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("creative_format", queryParameter8);
            }
            String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString("marketing_tactic", queryParameter9);
            }
            if (!TextUtils.isEmpty(str8)) {
                bundle.putString("srsltid", str8);
            }
            if (!TextUtils.isEmpty(str9)) {
                bundle.putString(str10, str9);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            k().L().b("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    final boolean C0(String str, String str2) {
        if (str2 == null) {
            k().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            k().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt)) {
            k().H().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                k().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    final Bundle E(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object s0 = s0(str2, bundle.get(str2));
                if (s0 == null) {
                    k().M().b("Param value can't be null", g().f(str2));
                } else {
                    O(bundle2, str2, s0);
                }
            }
        }
        return bundle2;
    }

    final boolean E0(String str, String str2) {
        if (r7.a() && d().t(F.u0) && !TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return d().P().equals(str);
    }

    final Bundle F(String str, String str2, Bundle bundle, List<String> list, boolean z) {
        int P0;
        List<String> list2 = list;
        boolean n0 = n0(str2, C2069q.d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int H = d().H();
        int i2 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                P0 = !z ? P0(str3) : 0;
                if (P0 == 0) {
                    P0 = O0(str3);
                }
            } else {
                P0 = 0;
            }
            if (P0 != 0) {
                L(bundle2, P0, str3, P0 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int x = x(str, str2, str3, bundle.get(str3), bundle2, list2, z, n0);
                if (x == 17) {
                    L(bundle2, x, str3, Boolean.FALSE);
                } else if (x != 0 && !"_ev".equals(str3)) {
                    L(bundle2, x, x == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (L0(str3) && (i2 = i2 + 1) > H) {
                    k().H().c("Event can't contain more than " + H + " params", g().c(str2), g().a(bundle));
                    v0(bundle2, 5);
                    bundle2.remove(str3);
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    final boolean F0(String str) {
        n();
        if (ax.S5.e.a(a()).a(str) == 0) {
            return true;
        }
        k().F().b("Permission not granted", str);
        return false;
    }

    final D H(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (v(str2) != 0) {
            k().G().b("Invalid conditional property event name", g().g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle F = F(str, str2, bundle2, ax.R5.f.a("_o"), true);
        if (z) {
            F = E(F, str);
        }
        C0821p.l(F);
        return new D(str2, new C(F), str3, j2);
    }

    public final int I0() {
        if (this.h == null) {
            this.h = Integer.valueOf(C0748i.f().a(a()) / 1000);
        }
        return this.h.intValue();
    }

    public final URL K(long j2, String str, String str2, long j3, String str3) {
        try {
            C0821p.f(str2);
            C0821p.f(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j2), Integer.valueOf(I0())), str2, str, Long.valueOf(j3));
            if (str.equals(d().Q())) {
                format = format.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    format = format.concat("&");
                }
                format = format.concat(str3);
            }
            return new URL(format);
        } catch (IllegalArgumentException e) {
            e = e;
            k().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e2) {
            e = e2;
            k().G().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    final long K0() {
        int extensionVersion;
        long j2;
        n();
        if (!D0(this.a.B().F())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j2 = 4;
        } else {
            extensionVersion = SdkExtensions.getExtensionVersion(30);
            j2 = extensionVersion < 4 ? 8L : y0() < F.W.a(null).intValue() ? 16L : 0L;
        }
        if (!F0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j2 |= 2;
        }
        if (j2 == 0 && !Z0()) {
            j2 |= 64;
        }
        if (j2 == 0) {
            return 1L;
        }
        return j2;
    }

    final void M(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            k().L().b("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final boolean M0(String str) {
        List<ResolveInfo> queryIntentActivities;
        return (TextUtils.isEmpty(str) || (queryIntentActivities = a().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 0)) == null || queryIntentActivities.isEmpty()) ? false : true;
    }

    final void N(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                i().O(bundle, str, bundle2.get(str));
            }
        }
    }

    final void O(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            k().M().c("Not putting event parameter. Invalid value type. name, type", g().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void P(ax.b6.M0 m0, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            m0.n(bundle);
        } catch (RemoteException e) {
            this.a.k().L().b("Error returning int value to wrapper", e);
        }
    }

    public final void Q(ax.b6.M0 m0, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            m0.n(bundle);
        } catch (RemoteException e) {
            this.a.k().L().b("Error returning long value to wrapper", e);
        }
    }

    public final void R(ax.b6.M0 m0, Bundle bundle) {
        try {
            m0.n(bundle);
        } catch (RemoteException e) {
            this.a.k().L().b("Error returning bundle value to wrapper", e);
        }
    }

    public final long R0() {
        long andIncrement;
        long j2;
        if (this.d.get() != 0) {
            synchronized (this.d) {
                this.d.compareAndSet(-1L, 1L);
                andIncrement = this.d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.d) {
            long nextLong = new Random(System.nanoTime() ^ b().a()).nextLong();
            int i2 = this.e + 1;
            this.e = i2;
            j2 = nextLong + i2;
        }
        return j2;
    }

    public final void S(ax.b6.M0 m0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            m0.n(bundle);
        } catch (RemoteException e) {
            this.a.k().L().b("Error returning string value to wrapper", e);
        }
    }

    final AbstractC1973a S0() {
        if (this.f == null) {
            this.f = AbstractC1973a.a(a());
        }
        return this.f;
    }

    public final void T(ax.b6.M0 m0, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            m0.n(bundle);
        } catch (RemoteException e) {
            this.a.k().L().b("Error returning bundle list to wrapper", e);
        }
    }

    public final void U(ax.b6.M0 m0, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            m0.n(bundle);
        } catch (RemoteException e) {
            this.a.k().L().b("Error returning boolean value to wrapper", e);
        }
    }

    final String U0() {
        byte[] bArr = new byte[16];
        W0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void V(ax.b6.M0 m0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            m0.n(bundle);
        } catch (RemoteException e) {
            this.a.k().L().b("Error returning byte array to wrapper", e);
        }
    }

    final void W(C3617a2 c3617a2, int i2) {
        int i3 = 0;
        for (String str : new TreeSet(c3617a2.d.keySet())) {
            if (L0(str) && (i3 = i3 + 1) > i2) {
                k().H().c("Event can't contain more than " + i2 + " params", g().c(c3617a2.a), g().a(c3617a2.d));
                v0(c3617a2.d, 5);
                c3617a2.d.remove(str);
            }
        }
    }

    final SecureRandom W0() {
        n();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    final boolean X0() {
        n();
        return K0() == 1;
    }

    public final boolean Y0() {
        try {
            a().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ ax.R5.e b() {
        return super.b();
    }

    final void b0(Parcelable[] parcelableArr, int i2, boolean z) {
        C0821p.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i3 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (L0(str) && !n0(str, C2068p.d) && (i3 = i3 + 1) > i2) {
                    if (z) {
                        k().H().c("Param can't contain more than " + i2 + " item-scoped custom parameters", g().f(str), g().a(bundle));
                        v0(bundle, 28);
                    } else {
                        k().H().c("Param cannot contain item-scoped custom parameters", g().f(str), g().a(bundle));
                        v0(bundle, 23);
                    }
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean c0(int i2, boolean z) {
        Boolean W = this.a.J().W();
        if (I0() < i2 / 1000) {
            return (W == null || W.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3663h d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3628c e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3758w f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ R1 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ C3659g2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ B5 i() {
        return super.i();
    }

    @SuppressLint({"ApplySharedPref"})
    final boolean i0(String str, double d) {
        try {
            SharedPreferences.Editor edit = a().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (RuntimeException e) {
            k().G().b("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    final boolean j0(String str, int i2, String str2) {
        if (str2 == null) {
            k().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        }
        k().H().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ V1 k() {
        return super.k();
    }

    final boolean k0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (T0(str)) {
                return true;
            }
            if (this.a.r()) {
                k().H().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", V1.v(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.a.r()) {
                k().H().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (T0(str2)) {
            return true;
        }
        k().H().b("Invalid admob_app_id. Analytics disabled.", V1.v(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3, com.google.android.gms.measurement.internal.InterfaceC3660g3
    public final /* bridge */ /* synthetic */ C3779z2 l() {
        return super.l();
    }

    final boolean l0(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i2) {
                k().M().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.C3653f3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3646e3
    protected final void o() {
        n();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                k().L().a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    final boolean o0(String str, String[] strArr, String str2) {
        return p0(str, strArr, null, str2);
    }

    final boolean p0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            k().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        C0821p.l(str2);
        for (String str3 : i) {
            if (str2.startsWith(str3)) {
                k().H().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !n0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && n0(str2, strArr2)) {
            return true;
        }
        k().H().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final int r0(String str) {
        if (!w0("user property", str)) {
            return 6;
        }
        if (o0("user property", C2071s.a, str)) {
            return !j0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final Object s0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return I(d().w(null, false), obj, true, true, null);
        }
        return I(J0(str) ? d().w(null, false) : d().r(null, false), obj, false, true, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3646e3
    protected final boolean t() {
        return true;
    }

    public final int u(int i2) {
        return C0748i.f().h(a(), C0752m.a);
    }

    final int v(String str) {
        if (!w0("event", str)) {
            return 2;
        }
        if (p0("event", C2069q.a, C2069q.b, str)) {
            return !j0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int w(String str, Object obj) {
        return "_ldl".equals(str) ? l0("user property referrer", str, Q0(str), obj) : l0("user property", str, Q0(str), obj) ? 0 : 7;
    }

    final boolean w0(String str, String str2) {
        if (str2 == null) {
            k().H().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            k().H().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int codePointAt = str2.codePointAt(0);
        if (!Character.isLetter(codePointAt) && codePointAt != 95) {
            k().H().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int charCount = Character.charCount(codePointAt);
        while (charCount < length) {
            int codePointAt2 = str2.codePointAt(charCount);
            if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                k().H().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    final long z(Context context, String str) {
        n();
        C0821p.l(context);
        C0821p.f(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest V0 = V0();
        if (V0 == null) {
            k().G().a("Could not get MD5 instance");
            return -1L;
        }
        if (packageManager == null) {
            return 0L;
        }
        try {
            if (u0(context, str)) {
                return 0L;
            }
            Signature[] signatureArr = ax.S5.e.a(context).d(a().getPackageName(), 64).signatures;
            if (signatureArr != null && signatureArr.length > 0) {
                return B(V0.digest(signatureArr[0].toByteArray()));
            }
            k().L().a("Could not get signatures");
            return -1L;
        } catch (PackageManager.NameNotFoundException e) {
            k().G().b("Package name not found", e);
            return 0L;
        }
    }

    final long z0(String str) {
        if (a().getPackageManager() == null) {
            return 0L;
        }
        int i2 = 0;
        try {
            ApplicationInfo b = ax.S5.e.a(a()).b(str, 0);
            if (b != null) {
                i2 = b.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            k().J().b("PackageManager failed to find running app: app_id", str);
        }
        return i2;
    }
}
