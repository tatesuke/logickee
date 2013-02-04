package com.tatesuke.logickee.unit;

/**
 *
 * @author tatesuke
 */
public interface Unit {
    
    public Unit execute();
    
    public static final Unit T = new Unit() {
        @Override
        public Unit execute() {
            return this;
        }
        @Override
        public String toString() {
            return "T";
        }
    };
    
    public static final Unit F = new Unit() {
        @Override
        public Unit execute() {
            return this;
        }
        @Override
        public String toString() {
            return "F";
        }
    };
    
}
