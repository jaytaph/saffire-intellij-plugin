package com.noxlogic.saffire.intellij.plugin;

import com.intellij.lang.Language;

public class SaffireLanguage extends Language {
    public static final SaffireLanguage INSTANCE = new SaffireLanguage();

    private SaffireLanguage() {
        super("Saffire");
    }
}