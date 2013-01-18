package com.noxlogic.saffire.intellij.plugin;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SaffireFileType extends LanguageFileType {
    public static final SaffireFileType INSTANCE = new SaffireFileType();

    private SaffireFileType() {
        super(SaffireLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Saffire file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Saffire language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "sf";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SaffireIcons.FILE;
    }
}
