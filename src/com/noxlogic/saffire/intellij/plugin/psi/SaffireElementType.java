package com.noxlogic.saffire.intellij.plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.noxlogic.saffire.intellij.plugin.SaffireLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SaffireElementType extends IElementType {
    public SaffireElementType(@NotNull @NonNls String debugName) {
        super(debugName, SaffireLanguage.INSTANCE);
    }
}
