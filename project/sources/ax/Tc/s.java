package ax.Tc;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
public class s extends r {
    private final Pattern e;

    public s(ax.Sc.f fVar) {
        f(fVar);
        try {
            this.e = Pattern.compile("(.*?);([0-9]+)\\s*.*");
        } catch (PatternSyntaxException unused) {
            throw new IllegalArgumentException("Unparseable regex supplied:  (.*?);([0-9]+)\\s*.*");
        }
    }

    @Override // ax.Sc.k, ax.Sc.j
    public List<String> b(List<String> list) {
        HashMap hashMap = new HashMap();
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Matcher matcher = this.e.matcher(listIterator.next().trim());
            if (matcher.matches()) {
                MatchResult matchResult = matcher.toMatchResult();
                String group = matchResult.group(1);
                Integer valueOf = Integer.valueOf(matchResult.group(2));
                Integer num = (Integer) hashMap.get(group);
                if (num == null || valueOf.intValue() >= num.intValue()) {
                    hashMap.put(group, valueOf);
                } else {
                    listIterator.remove();
                }
            }
        }
        while (listIterator.hasPrevious()) {
            Matcher matcher2 = this.e.matcher(listIterator.previous().trim());
            if (matcher2.matches()) {
                MatchResult matchResult2 = matcher2.toMatchResult();
                String group2 = matchResult2.group(1);
                int parseInt = Integer.parseInt(matchResult2.group(2));
                Integer num2 = (Integer) hashMap.get(group2);
                if (num2 != null && parseInt < num2.intValue()) {
                    listIterator.remove();
                }
            }
        }
        return list;
    }

    @Override // ax.Tc.r
    protected boolean k() {
        return true;
    }
}
