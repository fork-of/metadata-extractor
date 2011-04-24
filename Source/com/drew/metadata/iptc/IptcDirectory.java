/*
 * This is public domain software - that is, you can do whatever you want
 * with it, and include it software that is licensed under the GNU or the
 * BSD license, or whatever other licence you choose, including proprietary
 * closed source licenses.  I do ask that you leave this header in tact.
 *
 * If you make modifications to this code that you think would benefit the
 * wider community, please send me a copy and I'll post it on my site.
 *
 * If you make use of this code, I'd appreciate hearing about it.
 *   metadata_extractor [at] drewnoakes [dot] com
 * Latest version of this software kept at
 *   http://drewnoakes.com/
 *
 * Created by dnoakes on 26-Nov-2002 01:26:39 using IntelliJ IDEA.
 */
package com.drew.metadata.iptc;

import com.drew.metadata.Directory;

import java.util.HashMap;

/**
 * Describes tags used by the International Press Telecommunications Council (IPTC) metadata format.
 */
public class IptcDirectory extends Directory
{
    public static final int TAG_RECORD_VERSION = 0x0200;
    public static final int TAG_CAPTION = 0x0278;
    public static final int TAG_WRITER = 0x027a;
    public static final int TAG_HEADLINE = 0x0269;
    public static final int TAG_SPECIAL_INSTRUCTIONS = 0x0228;
    public static final int TAG_BY_LINE = 0x0250;
    public static final int TAG_BY_LINE_TITLE = 0x0255;
    public static final int TAG_CREDIT = 0x026e;
    public static final int TAG_SOURCE = 0x0273;
    public static final int TAG_OBJECT_NAME = 0x0205;
    public static final int TAG_DATE_CREATED = 0x0237;
    public static final int TAG_CITY = 0x025a;
    public static final int TAG_CONTENT_LOCATION_NAME = 0x021b;
    public static final int TAG_SUB_LOCATION = 0x025c;
    public static final int TAG_PROVINCE_OR_STATE = 0x025f;
    public static final int TAG_COUNTRY_OR_PRIMARY_LOCATION = 0x0265;
    public static final int TAG_ORIGINAL_TRANSMISSION_REFERENCE = 0x0267;
    public static final int TAG_CATEGORY = 0x020f;
    public static final int TAG_SUPPLEMENTAL_CATEGORIES = 0x0214;
    public static final int TAG_URGENCY = 0x0200 | 10;
    public static final int TAG_KEYWORDS = 0x0200 | 25;
    public static final int TAG_COPYRIGHT_NOTICE = 0x0274;
    public static final int TAG_RELEASE_DATE = 0x0200 | 30;
    public static final int TAG_RELEASE_TIME = 0x0200 | 35;
    public static final int TAG_TIME_CREATED = 0x0200 | 60;
    public static final int TAG_ORIGINATING_PROGRAM = 0x0200 | 65;
    //*** added by @Tom
    public static final int TAG_SERVICE_ID = 0x011e;
    public static final int TAG_DATE_SENT = 0x0146;
    public static final int TAG_TIME_SENT = 0x0150;
    public static final int TAG_EDIT_STATUS = 0x0207;
    public static final int TAG_FIXTURE_ID = 0x0216;
    public static final int TAG_REFERENCE_SERVICE = 0x022d;
    public static final int TAG_REFERENCE_DATE = 0x022f;
    public static final int TAG_REFERENCE_NUMBER = 0x0232;
    public static final int TAG_PROGRAM_VERSION = 0x0246;
    public static final int TAG_OBJECT_CYCLE = 0x024b;
    public static final int TAG_COUNTRY_CODE = 0x0264;

    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<Integer, String>();

    static
    {
        _tagNameMap.put(TAG_RECORD_VERSION, "Directory Version");
        _tagNameMap.put(TAG_CAPTION, "Caption/Abstract");
        _tagNameMap.put(TAG_WRITER, "Writer/Editor");
        _tagNameMap.put(TAG_HEADLINE, "Headline");
        _tagNameMap.put(TAG_SPECIAL_INSTRUCTIONS, "Special Instructions");
        _tagNameMap.put(TAG_BY_LINE, "By-line");
        _tagNameMap.put(TAG_BY_LINE_TITLE, "By-line Title");
        _tagNameMap.put(TAG_CREDIT, "Credit");
        _tagNameMap.put(TAG_SOURCE, "Source");
        _tagNameMap.put(TAG_OBJECT_NAME, "Object Name");
        _tagNameMap.put(TAG_DATE_CREATED, "Date Created");
        _tagNameMap.put(TAG_CITY, "City");
        _tagNameMap.put(TAG_PROVINCE_OR_STATE, "Province/State");
        _tagNameMap.put(TAG_COUNTRY_OR_PRIMARY_LOCATION, "Country/Primary Location");
        _tagNameMap.put(TAG_CONTENT_LOCATION_NAME, "Content Location Name");
        _tagNameMap.put(TAG_SUB_LOCATION, "Sub-location");
        _tagNameMap.put(TAG_ORIGINAL_TRANSMISSION_REFERENCE, "Original Transmission Reference");
        _tagNameMap.put(TAG_CATEGORY, "Category");
        _tagNameMap.put(TAG_SUPPLEMENTAL_CATEGORIES, "Supplemental Category(s)");
        _tagNameMap.put(TAG_URGENCY, "Urgency");
        _tagNameMap.put(TAG_KEYWORDS, "Keywords");
        _tagNameMap.put(TAG_COPYRIGHT_NOTICE, "Copyright Notice");
        _tagNameMap.put(TAG_RELEASE_DATE, "Release Date");
        _tagNameMap.put(TAG_RELEASE_TIME, "Release Time");
        _tagNameMap.put(TAG_TIME_CREATED, "Time Created");
        _tagNameMap.put(TAG_ORIGINATING_PROGRAM, "Originating Program");
        //*** added by @Tom
        _tagNameMap.put(TAG_SERVICE_ID, "Service ID");
        _tagNameMap.put(TAG_DATE_SENT, "Date Sent");
        _tagNameMap.put(TAG_TIME_SENT, "Time Sent");
        _tagNameMap.put(TAG_EDIT_STATUS, "Edit Status");
        _tagNameMap.put(TAG_FIXTURE_ID, "Fixture ID");
        _tagNameMap.put(TAG_REFERENCE_SERVICE, "Reference Service");
        _tagNameMap.put(TAG_REFERENCE_DATE, "Reference Date");
        _tagNameMap.put(TAG_REFERENCE_NUMBER, "Reference Number");
        _tagNameMap.put(TAG_PROGRAM_VERSION, "Program Version");
        _tagNameMap.put(TAG_OBJECT_CYCLE, "Object Cycle");
        _tagNameMap.put(TAG_COUNTRY_CODE, "Country Code");
        
    }

    public IptcDirectory()
    {
        this.setDescriptor(new IptcDescriptor(this));
    }

    public String getName()
    {
        return "Iptc";
    }

    protected HashMap<Integer, String> getTagNameMap()
    {
        return _tagNameMap;
    }
}
