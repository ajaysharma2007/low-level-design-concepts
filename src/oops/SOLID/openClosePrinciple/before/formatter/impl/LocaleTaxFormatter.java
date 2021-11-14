package oops.SOLID.openClosePrinciple.before.formatter.impl;

import oops.SOLID.openClosePrinciple.before.formatter.TaxFormatter;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleTaxFormatter implements TaxFormatter {
    String language;
    String country;

    private NumberFormat currencyFormatter;
    private Locale locale;

    public LocaleTaxFormatter(String language, String country) {
        this.language = language;
        this.country = country;

        locale = new Locale(this.language, this.country);
        currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    }

    @Override
    public String format(double tax) {
        return currencyFormatter.format(tax);
    }
}
