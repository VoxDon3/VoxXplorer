/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.f;
import ax.Tc.r;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class s
extends r {
    private final Pattern e;

    public s(f f8) {
        this.f(f8);
        try {
            this.e = Pattern.compile("(.*?);([0-9]+)\\s*.*");
            return;
        }
        catch (PatternSyntaxException patternSyntaxException) {
            throw new IllegalArgumentException("Unparseable regex supplied:  (.*?);([0-9]+)\\s*.*");
        }
    }

    @Override
    public List<String> b(List<String> list) {
        Object object;
        Object object2;
        HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            object2 = listIterator.next().trim();
            if (!((Matcher)(object2 = this.e.matcher((CharSequence)object2))).matches()) continue;
            object = ((Matcher)object2).toMatchResult();
            object2 = object.group(1);
            Integer n8 = Integer.valueOf(object.group(2));
            object = (Integer)hashMap.get(object2);
            if (object != null && n8 < (Integer)object) {
                listIterator.remove();
                continue;
            }
            hashMap.put(object2, n8);
        }
        while (listIterator.hasPrevious()) {
            object2 = listIterator.previous().trim();
            if (!((Matcher)(object2 = this.e.matcher((CharSequence)object2))).matches()) continue;
            object = ((Matcher)object2).toMatchResult();
            object2 = object.group(1);
            int n9 = Integer.parseInt(object.group(2));
            if ((object2 = (Integer)hashMap.get(object2)) == null || n9 >= (Integer)object2) continue;
            listIterator.remove();
        }
        return list;
    }

    @Override
    protected boolean k() {
        return true;
    }
}

