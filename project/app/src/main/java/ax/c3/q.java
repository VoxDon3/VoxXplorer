/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import ax.c3.B;
import ax.c3.d0;
import com.alphainventor.filemanager.file.y;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class q {
    static HashMap<String, q> c = new HashMap();
    Comparator<com.alphainventor.filemanager.file.n> a;
    boolean b;

    q(Comparator<com.alphainventor.filemanager.file.n> comparator, boolean bl) {
        this.a = comparator;
        this.b = bl;
    }

    public static q a(String object) {
        if ("SearchPath".equals(object)) {
            return q.c((String)object);
        }
        if ((object = q.c((String)object)) == null) {
            return q.c("SearchPath");
        }
        return new q(new k(((q)object).b()), false);
    }

    public static q c(String string) {
        q q8 = c.get(string);
        if (q8 != null) {
            return q8;
        }
        return q.e(string);
    }

    private static q e(String string) {
        boolean bl = string.equals("None");
        q q8 = null;
        if (!bl) {
            if (string.equals("NameUp")) {
                q8 = new q(new h(), true);
            } else if (string.equals("NameDown")) {
                q8 = new q(new g(), true);
            } else if (string.equals("CollatorNameUp")) {
                q8 = new q(new b(), true);
            } else if (string.equals("CollatorNameDown")) {
                q8 = new q(new a(), true);
            } else if (string.equals("SizeUp")) {
                q8 = new q(new m(), true);
            } else if (string.equals("SizeDown")) {
                q8 = new q(new l(), true);
            } else if (string.equals("DateUp")) {
                q8 = new q(new f(), true);
            } else if (string.equals("DateDown")) {
                q8 = new q(new c(), true);
            } else if (string.equals("DateTakenUp")) {
                q8 = new q(new e(), true);
            } else if (string.equals("DateTakenDown")) {
                q8 = new q(new d(), true);
            } else if (string.equals("DateDownNoSeparate")) {
                q8 = new q(new c(), false);
            } else if (string.equals("DateUpNoSeparate")) {
                q8 = new q(new f(), false);
            } else if (string.equals("TypeUp")) {
                q8 = new q(new p(), true);
            } else if (string.equals("TypeDown")) {
                q8 = new q(new o(), true);
            } else if (string.equals("RecursiveUp")) {
                q8 = new q(Collections.reverseOrder(new n()), false);
            } else if (string.equals("RecursiveDown")) {
                q8 = new q(new n(), false);
            } else if (string.equals("Search")) {
                q8 = new q(new i(), false);
            } else if (string.equals("SearchPath")) {
                q8 = new q(new j(), false);
            }
        }
        c.put(string, q8);
        return q8;
    }

    public static boolean f(String string) {
        return "DateTakenUp".equals(string) || "DateTakenDown".equals(string);
        {
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<com.alphainventor.filemanager.file.n> g(List<com.alphainventor.filemanager.file.n> object, q arrayList) {
        Object object2;
        ArrayList<Object> arrayList2;
        block27: {
            Object object3;
            int n8;
            Comparator<com.alphainventor.filemanager.file.n> comparator;
            block25: {
                if (object == null) {
                    return null;
                }
                if (arrayList == null) {
                    return new ArrayList<com.alphainventor.filemanager.file.n>((Collection<com.alphainventor.filemanager.file.n>)object);
                }
                comparator = ((q)((Object)arrayList)).b();
                if (((q)((Object)arrayList)).d()) {
                    arrayList2 = new ArrayList<Object>();
                    arrayList = new ArrayList();
                    object = object.iterator();
                } else {
                    arrayList = new ArrayList(object);
                    if (comparator != null) {
                        try {
                            Collections.sort(arrayList, comparator);
                            return arrayList;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            object = ax.Ha.c.h().f().d("FUSORT5!!!:");
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(comparator.getClass().getName());
                            stringBuilder.append(":");
                            stringBuilder.append(illegalArgumentException.getMessage());
                            ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                        }
                    }
                    return arrayList;
                }
                while (object.hasNext()) {
                    object2 = (com.alphainventor.filemanager.file.n)object.next();
                    if (object2.isDirectory()) {
                        arrayList2.add(object2);
                        continue;
                    }
                    arrayList.add((com.alphainventor.filemanager.file.n)object2);
                }
                object2 = new ArrayList();
                n8 = 0;
                if (comparator == null) break block25;
                try {
                    Collections.sort(arrayList2, comparator);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    block26: {
                        if (comparator instanceof h) {
                            Collections.sort(arrayList2, q.c("CollatorNameUp").b());
                        }
                        if (!(comparator instanceof g)) break block26;
                        try {
                            Collections.sort(arrayList2, q.c("CollatorNameDown").b());
                        }
                        catch (IllegalArgumentException illegalArgumentException2) {}
                    }
                    if (arrayList2.size() > 0) {
                        object = (com.alphainventor.filemanager.file.n)arrayList2.get(0);
                        object3 = ax.Ha.c.h().d("FUSORT1!!!:").f().l(illegalArgumentException);
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(((com.alphainventor.filemanager.file.n)object).P().I());
                        stringBuilder.append(":");
                        stringBuilder.append(comparator.getClass().getName());
                        ((ax.Ha.b)object3).g(stringBuilder.toString()).h();
                    }
                    ax.Ha.c.h().d("FUSORT2!!!:").g(comparator.getClass().getName()).h();
                }
            }
            if (comparator == null) break block27;
            try {
                Collections.sort(arrayList, comparator);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                boolean bl;
                block28: {
                    bl = comparator instanceof h;
                    if (bl) {
                        Collections.sort(arrayList, q.c("CollatorNameUp").b());
                    }
                    if (!(comparator instanceof g)) break block28;
                    try {
                        Collections.sort(arrayList, q.c("CollatorNameDown").b());
                    }
                    catch (IllegalArgumentException illegalArgumentException3) {}
                }
                if (arrayList.size() > 0) {
                    object3 = (com.alphainventor.filemanager.file.n)arrayList.get(0);
                    if (bl && arrayList.size() < 30) {
                        int n9 = arrayList.size();
                        object = "";
                        while (n8 < n9) {
                            com.alphainventor.filemanager.file.n n10 = arrayList.get(n8);
                            ++n8;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append((String)object);
                            stringBuilder.append(n10.B());
                            stringBuilder.append(",");
                            object = stringBuilder.toString();
                        }
                        ax.Ha.c.h().f().b("ALPHANUM SORT").g(object).h();
                    }
                    ax.Ha.b b8 = ax.Ha.c.h().d("FUSORT3!!!:").f().l(illegalArgumentException);
                    object = new StringBuilder();
                    ((StringBuilder)object).append(((com.alphainventor.filemanager.file.n)object3).P().I());
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append(comparator.getClass().getName());
                    b8.g(((StringBuilder)object).toString()).h();
                }
                ax.Ha.c.h().d("FUSORT4!!!:").g(comparator.getClass().getName()).h();
            }
        }
        object2.addAll(arrayList2);
        object2.addAll(arrayList);
        return object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(List<com.alphainventor.filemanager.file.n> list, q object) {
        if (list == null) return;
        if (object == null) return;
        if (((q)object).b() == null) {
            return;
        }
        try {
            Collections.sort(list, ((q)object).b());
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            if (!(((q)object).b() instanceof k)) return;
            if (((k)(object = (k)((q)object).b())).b() instanceof h) {
                try {
                    q q8 = q.c("CollatorNameUp");
                    object = new k(q8.b());
                    Collections.sort(list, object);
                    return;
                }
                catch (IllegalArgumentException illegalArgumentException2) {
                    return;
                }
            }
            if (!(((k)object).b() instanceof g)) return;
            {
                q q9 = q.c("CollatorNameDown");
                object = new k(q9.b());
                Collections.sort(list, object);
                return;
            }
        }
    }

    public Comparator<com.alphainventor.filemanager.file.n> b() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public static class a
    implements Comparator<com.alphainventor.filemanager.file.n> {
        Collator q;

        public a() {
            Collator collator;
            this.q = collator = Collator.getInstance();
            try {
                collator.setDecomposition(1);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 2").g(Locale.getDefault().toString()).h();
            }
            this.q.setStrength(3);
        }

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            return this.q.compare(n9.B(), n8.B());
        }
    }

    public static class b
    implements Comparator<com.alphainventor.filemanager.file.n> {
        Collator q;

        public b() {
            Collator collator;
            this.q = collator = Collator.getInstance();
            try {
                collator.setDecomposition(1);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 1").g(Locale.getDefault().toString()).h();
            }
            this.q.setStrength(3);
        }

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            return this.q.compare(n8.B(), n9.B());
        }
    }

    public static class c
    implements Comparator<com.alphainventor.filemanager.file.n> {
        h q = new h();

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            long l8 = n8.q() - n9.q();
            long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (l9 < 0) {
                return 1;
            }
            if (l9 == false) {
                return this.q.a(n8, n9);
            }
            return -1;
        }
    }

    public static class d
    implements Comparator<com.alphainventor.filemanager.file.n> {
        h q = new h();

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            long l8;
            boolean bl = n8 instanceof y;
            long l9 = bl ? ((y)n8).D0() : n8.q();
            long l10 = l9 - (l8 = bl ? ((y)n9).D0() : n9.q());
            long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
            if (l11 < 0) {
                return 1;
            }
            if (l11 == false) {
                return this.q.a(n8, n9);
            }
            return -1;
        }
    }

    public static class e
    implements Comparator<com.alphainventor.filemanager.file.n> {
        h q = new h();

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            long l8;
            boolean bl = n8 instanceof y;
            long l9 = bl ? ((y)n8).D0() : n8.q();
            long l10 = l9 - (l8 = bl ? ((y)n9).D0() : n9.q());
            long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
            if (l11 < 0) {
                return -1;
            }
            if (l11 == false) {
                return this.q.a(n8, n9);
            }
            return 1;
        }
    }

    public static class f
    implements Comparator<com.alphainventor.filemanager.file.n> {
        h q = new h();

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            long l8 = n8.q() - n9.q();
            long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (l9 < 0) {
                return -1;
            }
            if (l9 == false) {
                return this.q.a(n8, n9);
            }
            return 1;
        }
    }

    public static class g
    implements Comparator<com.alphainventor.filemanager.file.n> {
        Collator c0;
        ax.u3.a q;

        public g() {
            Collator collator;
            this.c0 = collator = Collator.getInstance();
            try {
                collator.setDecomposition(1);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 2").g(Locale.getDefault().toString()).h();
            }
            this.c0.setStrength(3);
            this.q = new ax.u3.a(this.c0);
        }

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            try {
                int n10 = this.q.a(n9.B(), n8.B());
                return n10;
            }
            catch (Exception exception) {
                ax.Ha.b b8 = ax.Ha.c.h().f().d("ALPHANUM EXCEPTION 2");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("name:");
                stringBuilder.append(n8.B());
                stringBuilder.append(",");
                stringBuilder.append(n9.B());
                b8.g(stringBuilder.toString()).h();
                return this.c0.compare(n9.B(), n8.B());
            }
        }
    }

    public static class h
    implements Comparator<com.alphainventor.filemanager.file.n> {
        Collator c0;
        ax.u3.a q;

        public h() {
            Collator collator;
            this.c0 = collator = Collator.getInstance();
            try {
                collator.setDecomposition(1);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 1").g(Locale.getDefault().toString()).h();
            }
            this.c0.setStrength(3);
            this.q = new ax.u3.a(this.c0);
        }

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            try {
                int n10 = this.q.a(n8.B(), n9.B());
                return n10;
            }
            catch (Exception exception) {
                ax.Ha.b b8 = ax.Ha.c.h().f().d("ALPHANUM EXCEPTION 1");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("name:");
                stringBuilder.append(n8.B());
                stringBuilder.append(",");
                stringBuilder.append(n9.B());
                b8.g(stringBuilder.toString()).h();
                return this.c0.compare(n8.B(), n9.B());
            }
        }
    }

    public static class i
    implements Comparator<com.alphainventor.filemanager.file.n> {
        Collator q;

        public i() {
            Collator collator;
            this.q = collator = Collator.getInstance();
            try {
                collator.setDecomposition(1);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 1").g(Locale.getDefault().toString()).h();
            }
            this.q.setStrength(3);
        }

        private boolean b(com.alphainventor.filemanager.file.n n8) {
            String string;
            if (B.P(n8) && (string = n8.W()) != null && string.equals("/Android")) {
                return true;
            }
            return n8.h();
        }

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            boolean bl = this.b(n8);
            boolean bl2 = this.b(n9);
            if (bl && !bl2) {
                return 1;
            }
            if (!bl && bl2) {
                return -1;
            }
            return this.q.compare(n8.B(), n9.B());
        }
    }

    public static class j
    implements Comparator<com.alphainventor.filemanager.file.n> {
        Collator q;

        public j() {
            Collator collator;
            this.q = collator = Collator.getInstance();
            try {
                collator.setDecomposition(1);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 1").g(Locale.getDefault().toString()).h();
            }
            this.q.setStrength(3);
        }

        private boolean b(com.alphainventor.filemanager.file.n n8) {
            String string;
            if (B.P(n8) && (string = n8.W()) != null && d0.H("/Android", string)) {
                return true;
            }
            return n8.h();
        }

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            boolean bl = this.b(n8);
            boolean bl2 = this.b(n9);
            if (bl && !bl2) {
                return 1;
            }
            if (!bl && bl2) {
                return -1;
            }
            String string = n8.T();
            String string2 = n9.T();
            if (string != null && string2 != null) {
                int n10 = this.q.compare(string, string2);
                if (n10 != 0) {
                    return n10;
                }
            } else {
                if (string == null && string2 != null) {
                    return 1;
                }
                if (string != null && string2 == null) {
                    return -1;
                }
            }
            return this.q.compare(n8.B(), n9.B());
        }
    }

    public static class k
    implements Comparator<com.alphainventor.filemanager.file.n> {
        private Comparator<com.alphainventor.filemanager.file.n> c0;
        Collator q;

        k(Comparator<com.alphainventor.filemanager.file.n> collator) {
            this.c0 = collator;
            this.q = collator = Collator.getInstance();
            try {
                collator.setDecomposition(1);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 1").g(Locale.getDefault().toString()).h();
            }
            this.q.setStrength(3);
        }

        public int a(com.alphainventor.filemanager.file.n object, com.alphainventor.filemanager.file.n object2) {
            int n8 = this.c0.compare((com.alphainventor.filemanager.file.n)object, (com.alphainventor.filemanager.file.n)object2);
            if (n8 != 0) {
                return n8;
            }
            object = ((com.alphainventor.filemanager.file.n)object).T();
            object2 = ((com.alphainventor.filemanager.file.n)object2).T();
            if (object == null && object2 != null) {
                return 1;
            }
            if (object != null && object2 == null) {
                return -1;
            }
            if (object != null && object2 != null) {
                return this.q.compare((String)object, (String)object2);
            }
            return 0;
        }

        public Comparator<com.alphainventor.filemanager.file.n> b() {
            return this.c0;
        }
    }

    public static class l
    implements Comparator<com.alphainventor.filemanager.file.n> {
        Collator q = Collator.getInstance();

        l() {
        }

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            long l8;
            long l9;
            block6: {
                long l10;
                block7: {
                    block4: {
                        boolean bl;
                        boolean bl2;
                        block5: {
                            if (!(n8 instanceof y) || !(n9 instanceof y)) break block4;
                            bl2 = n8.isDirectory();
                            bl = n9.isDirectory();
                            if (!bl2 || !bl) break block5;
                            l9 = n9.r(true) - n8.r(true);
                            break block6;
                        }
                        if (bl2 && !bl) {
                            return 1;
                        }
                        if (!bl2 && bl) {
                            return -1;
                        }
                        l10 = n9.p();
                        l9 = n8.p();
                        break block7;
                    }
                    l10 = n9.p();
                    l9 = n8.p();
                }
                l9 = l10 - l9;
            }
            long l11 = (l8 = l9 - 0L) == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (l11 == false) {
                return this.q.compare(n8.B(), n9.B());
            }
            if (l11 > 0) {
                return 1;
            }
            return -1;
        }
    }

    public static class m
    implements Comparator<com.alphainventor.filemanager.file.n> {
        Collator q = Collator.getInstance();

        m() {
        }

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            long l8;
            long l9;
            block6: {
                long l10;
                block7: {
                    block4: {
                        boolean bl;
                        boolean bl2;
                        block5: {
                            if (!(n8 instanceof y) || !(n9 instanceof y)) break block4;
                            bl2 = n8.isDirectory();
                            bl = n9.isDirectory();
                            if (!bl2 || !bl) break block5;
                            l9 = n8.r(true) - n9.r(true);
                            break block6;
                        }
                        if (bl2 && !bl) {
                            return -1;
                        }
                        if (!bl2 && bl) {
                            return 1;
                        }
                        l9 = n8.p();
                        l10 = n9.p();
                        break block7;
                    }
                    l9 = n8.p();
                    l10 = n9.p();
                }
                l9 -= l10;
            }
            long l11 = (l8 = l9 - 0L) == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (l11 == false) {
                return this.q.compare(n8.B(), n9.B());
            }
            if (l11 > 0) {
                return 1;
            }
            return -1;
        }
    }

    public static class n
    implements Comparator<com.alphainventor.filemanager.file.n> {
        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            long l8 = ax.T2.h.T(n8).Y(n8) - ax.T2.h.T(n9).Y(n9);
            long l9 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (l9 > 0) {
                return -1;
            }
            if (l9 == false) {
                return 0;
            }
            return 1;
        }
    }

    public static class o
    implements Comparator<com.alphainventor.filemanager.file.n> {
        Collator c0;
        g q = new g();

        public o() {
            Collator collator;
            this.c0 = collator = Collator.getInstance();
            collator.setDecomposition(1);
            this.c0.setStrength(3);
        }

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            if (n8.isDirectory() && n9.isDirectory()) {
                return this.q.a(n8, n9);
            }
            String string = d0.j(n8.B());
            String string2 = d0.j(n9.B());
            int n10 = this.c0.compare(string2, string);
            if (n10 == 0) {
                return this.q.a(n8, n9);
            }
            return n10;
        }
    }

    public static class p
    implements Comparator<com.alphainventor.filemanager.file.n> {
        Collator c0;
        h q = new h();

        public p() {
            Collator collator;
            this.c0 = collator = Collator.getInstance();
            collator.setDecomposition(1);
            this.c0.setStrength(3);
        }

        public int a(com.alphainventor.filemanager.file.n n8, com.alphainventor.filemanager.file.n n9) {
            String string;
            if (n8.isDirectory() && n9.isDirectory()) {
                return this.q.a(n8, n9);
            }
            String string2 = d0.j(n8.B());
            int n10 = this.c0.compare(string2, string = d0.j(n9.B()));
            if (n10 == 0) {
                return this.q.a(n8, n9);
            }
            return n10;
        }
    }
}

