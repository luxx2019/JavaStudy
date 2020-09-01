package generic.pair;

import java.time.LocalDate;

/**
 * 日期区间，为保证第二个时间大于第一个时间重写了setSecond方法
 */
public class DateInterval extends Pair<LocalDate> {
    public void setSecond(LocalDate second) {
        if (second.compareTo(getFirst()) >= 0) {
            super.setSecond(second);
        }
    }
}
