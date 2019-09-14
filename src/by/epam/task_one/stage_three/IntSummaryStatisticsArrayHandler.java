package by.epam.task_one.stage_three;

import java.util.IntSummaryStatistics;

public class IntSummaryStatisticsArrayHandler {

    public int findMax(int ... array){
        IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
        for (int i = 0; i < array.length; i++) {
            intSummaryStatistics.accept(array[i]);
        }
        return intSummaryStatistics.getMax();
    }

    public int findMin(int ... array){
        IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
        for (int i = 0; i < array.length; i++) {
            intSummaryStatistics.accept(array[i]);
        }
        return intSummaryStatistics.getMin();
    }

    public int findAverage(int ... array){
        IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
        for (int i = 0; i < array.length; i++) {
            intSummaryStatistics.accept(array[i]);
        }
        return (int)intSummaryStatistics.getAverage();
    }


}
