package com.deathrayresearch.outlier.filter.dates;

import com.deathrayresearch.outlier.Row;
import com.deathrayresearch.outlier.filter.AbstractFilter;
import com.deathrayresearch.outlier.filter.ColumnReference;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 */
public class IsThursday extends AbstractFilter {

  public IsThursday(ColumnReference columnReference) {
    super(columnReference);
  }

  @Override
  public boolean matches(Row row) {
    LocalDate date = (LocalDate) row.get(columnName());
    return date.getDayOfWeek() == DayOfWeek.THURSDAY;
  }
}