package ax.Tc;

import j$.util.DesugarTimeZone;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class g extends ax.Sc.k {
    private static final g a = new g();
    private static final HashMap<String, Integer> b;
    private static final int[] c;
    private static final int[][] d;

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put("file", 0);
        hashMap.put("cdir", 1);
        hashMap.put("pdir", 1);
        hashMap.put("dir", 1);
        c = new int[]{0, 1, 2};
        d = new int[][]{new int[0], new int[]{2}, new int[]{1}, new int[]{2, 1}, new int[]{0}, new int[]{0, 2}, new int[]{0, 1}, new int[]{0, 1, 2}};
    }

    private void d(ax.Sc.i iVar, String str) {
        for (char c2 : str.toCharArray()) {
            if (c2 == 'a') {
                iVar.m(0, 1, true);
            } else if (c2 == 'p') {
                iVar.m(0, 1, true);
            } else if (c2 == 'r') {
                iVar.m(0, 0, true);
            } else if (c2 == 'w') {
                iVar.m(0, 1, true);
            } else if (c2 == 'l') {
                iVar.m(0, 2, true);
            } else if (c2 != 'm') {
                switch (c2) {
                    case 'c':
                        iVar.m(0, 1, true);
                        break;
                    case 'd':
                        iVar.m(0, 1, true);
                        break;
                    case 'e':
                        iVar.m(0, 0, true);
                        break;
                }
            } else {
                iVar.m(0, 1, true);
            }
        }
    }

    public static g e() {
        return a;
    }

    public static ax.Sc.i g(String str) {
        return a.c(str);
    }

    public static Calendar h(String str) {
        SimpleDateFormat simpleDateFormat;
        boolean z;
        if (str.contains(".")) {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            z = true;
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            z = false;
        }
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        simpleDateFormat.setTimeZone(timeZone);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        ParsePosition parsePosition = new ParsePosition(0);
        simpleDateFormat.setLenient(false);
        Date parse = simpleDateFormat.parse(str, parsePosition);
        if (parsePosition.getIndex() != str.length()) {
            return null;
        }
        gregorianCalendar.setTime(parse);
        if (!z) {
            gregorianCalendar.clear(14);
        }
        return gregorianCalendar;
    }

    @Override // ax.Sc.j
    public ax.Sc.i c(String str) {
        ax.Sc.i iVar;
        ax.Sc.i iVar2 = null;
        if (str.startsWith(" ")) {
            if (str.length() <= 1) {
                return null;
            }
            ax.Sc.i iVar3 = new ax.Sc.i();
            iVar3.n(str);
            iVar3.l(str.substring(1));
            return iVar3;
        }
        int i = 2;
        String[] split = str.split(" ", 2);
        if (split.length != 2 || split[1].isEmpty()) {
            return null;
        }
        String str2 = split[0];
        if (!str2.endsWith(";")) {
            return null;
        }
        ax.Sc.i iVar4 = new ax.Sc.i();
        iVar4.n(str);
        iVar4.l(split[1]);
        String[] split2 = str2.split(";");
        boolean contains = split[0].toLowerCase(Locale.ENGLISH).contains("unix.mode=");
        int length = split2.length;
        int i2 = 0;
        while (i2 < length) {
            String[] split3 = split2[i2].split("=", -1);
            if (split3.length != i) {
                return iVar2;
            }
            String str3 = split3[0];
            Locale locale = Locale.ENGLISH;
            String lowerCase = str3.toLowerCase(locale);
            String str4 = split3[1];
            if (!str4.isEmpty()) {
                String lowerCase2 = str4.toLowerCase(locale);
                if ("size".equals(lowerCase) || "sizd".equals(lowerCase)) {
                    iVar = iVar2;
                    iVar4.o(Long.parseLong(str4));
                } else if ("modify".equals(lowerCase)) {
                    Calendar h = h(str4);
                    if (h == null) {
                        return iVar2;
                    }
                    iVar4.p(h);
                } else if ("type".equals(lowerCase)) {
                    Integer num = b.get(lowerCase2);
                    if (num == null) {
                        iVar4.q(3);
                    } else {
                        iVar4.q(num.intValue());
                    }
                } else if (lowerCase.startsWith("unix.")) {
                    String lowerCase3 = lowerCase.substring(5).toLowerCase(locale);
                    if ("group".equals(lowerCase3)) {
                        iVar4.i(str4);
                    } else if ("owner".equals(lowerCase3)) {
                        iVar4.r(str4);
                    } else if ("mode".equals(lowerCase3)) {
                        int length2 = str4.length() - 3;
                        int i3 = 0;
                        while (i3 < 3) {
                            int charAt = str4.charAt(length2 + i3) - '0';
                            if (charAt >= 0 && charAt <= 7) {
                                int[] iArr = d[charAt];
                                int length3 = iArr.length;
                                int i4 = 0;
                                while (i4 < length3) {
                                    iVar4.m(c[i3], iArr[i4], true);
                                    i4++;
                                    iVar2 = iVar2;
                                }
                            }
                            i3++;
                            iVar2 = iVar2;
                        }
                    }
                    iVar = iVar2;
                } else {
                    iVar = iVar2;
                    if (!contains && ("perm".equals(lowerCase) || "perms".equals(lowerCase))) {
                        d(iVar4, lowerCase2);
                    }
                }
                i2++;
                iVar2 = iVar;
                i = 2;
            }
            iVar = iVar2;
            i2++;
            iVar2 = iVar;
            i = 2;
        }
        return iVar4;
    }
}
