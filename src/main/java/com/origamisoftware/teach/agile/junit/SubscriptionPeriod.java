package com.origamisoftware.teach.agile.junit;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;

/**
 * A simple Date Range Class
 *
 * @author Spencer A Marks
 */
public class SubscriptionPeriod {

    private Date startDate;
    private Date endDate;

    /**
     * Creates a  SubscriptionPeriod instance
     *
     * @param startDate the starting date of the subscription period
     * @param endDate   the end date of the subscription period
     */
    public SubscriptionPeriod(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * @return the the start date of the subscription
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @return the the end date of the subscription
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @return the total Days in the subscription, to start 0
     */
    public int getTotalDays() {
        /** todo implement method */
        long end = endDate.getTime();
        long start = startDate.getTime();
        long diff = Math.abs(endDate.getTime() - startDate.getTime());
        diff = diff / 1000;
        diff = diff / 86400;
     int tmptotalDays = (int) diff;
        return tmptotalDays;
    }

    /**
     * @return the total months on the subscription
     */
    public int getTotalMonths() {
        /** todo implement method */
        long end = endDate.getTime();
        long start = startDate.getTime();
        long diff = Math.abs(endDate.getTime() - startDate.getTime());
        diff = diff/1000;
        diff = diff/86400;
        diff = diff/30;
        int tmpTotalMonths = (int) diff;

        return tmpTotalMonths;
    }

    /**
     * Given a date return true if the date comes after the expiration date of this
     * subscription period or false otherwise.
     *
     * @param date a date to consider
     * @return true if true if the date comes after the expiration date of this
     * subscription period or false otherwise.
     */
    public boolean hasExpired(Date date) {
        /** todo implement method */
       /**  throw new NotImplementedException(); */

       boolean has_Expired =  endDate.after(date);
        return has_Expired;
    }

}
