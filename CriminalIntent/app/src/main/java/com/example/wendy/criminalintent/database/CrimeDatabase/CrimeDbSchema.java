package com.example.wendy.criminalintent.database.CrimeDatabase;

/**
 * Created by Wendy on 2017/2/3.
 */

public class CrimeDbSchema {
    public static final class CrimeTable{
        public static final String NAME ="crimes";//database form name

        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved"; //database elements
            public static final String SUSPECT = "suspect";
        }
    }
}
