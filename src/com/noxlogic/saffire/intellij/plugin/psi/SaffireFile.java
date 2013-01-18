package com.noxlogic.saffire.intellij.plugin.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.noxlogic.saffire.intellij.plugin.SaffireFileType;
import com.noxlogic.saffire.intellij.plugin.SaffireLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SaffireFile extends PsiFileBase {
    public SaffireFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SaffireLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SaffireFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Saffire File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
