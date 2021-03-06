package com.example.nickozoulis.teamproj.util.comparators;

import com.example.nickozoulis.teamproj.domain.Referee;

import java.util.Comparator;

/**
 * Created by nickozoulis on 21/09/2015.
 */
public class IDBasedRefereeComparator implements Comparator<Referee> {
    @Override
    public int compare(Referee lhs, Referee rhs) {
        return lhs.getPerson().getID().compareTo(rhs.getPerson().getID());
    }
}
