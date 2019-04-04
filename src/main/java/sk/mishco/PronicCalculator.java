package sk.mishco;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;

public class PronicCalculator {

    public List<Integer> calcPronic(int n) {
        List<Integer> results = new ArrayList<Integer>();
        if (n <= 1) {
            return singletonList(0);
        } else {
            for (int i = 0; i < n; i++) {
                int interRes = i * (i + 1);
                if (interRes <= n) {
                    results.add(interRes);
                }
            }
        }
        return results;
    }
}
