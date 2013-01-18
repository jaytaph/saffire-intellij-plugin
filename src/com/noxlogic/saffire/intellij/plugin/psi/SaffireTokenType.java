package com.noxlogic.saffire.intellij.plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.noxlogic.saffire.intellij.plugin.SaffireLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SaffireTokenType extends IElementType {
    public SaffireTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SaffireLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SaffireTokenType." + super.toString();
    }
}
