package com.zero.project.myapplication.utils;

import com.zero.project.myapplication.dao.ListingDao;

import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;

/**
 * Created by Gopi on 11-12-2016.
 */

// TODO: 12-12-2016 Need to add direction for sorting.
public class SortComparator implements Comparator<ListingDao> {
    @Override
    public int compare(ListingDao o1, ListingDao o2) {
        String textReg = "([^a-zA-Z]*)";
        String numReg = "([^0-9]*)";
        String aText = o1.getTask().toLowerCase().replaceAll(textReg, "");
        String bText = o2.getTask().toLowerCase().replaceAll(textReg, "");
        if (aText.equals(bText)) {
            int aNum = Integer.parseInt(o1.getTask().toLowerCase().replaceAll(numReg, ""), 10);
            int bNum = Integer.parseInt(o2.getTask().toLowerCase().replaceAll(numReg, ""), 10);
            return aNum == bNum ? 0 : aNum > bNum ? 1 : -1;

        } else {
            if (!StringUtils.isBlank(aText) && !StringUtils.isBlank(bText)) {
                if (aText.compareTo(bText) > 0) {
                    return 1;
                } else if (aText.compareTo(bText) < 0) {
                    return -1;
                }
            } else {
                if (StringUtils.isBlank(aText)) {
                    return -1;
                } else if (StringUtils.isBlank(bText)) {
                    return 1;
                }
            }
        }
        return 0;
    }
}
