package com.alee.managers.style.skin.web;

import com.alee.laf.text.ITextFieldPainter;
import com.alee.laf.text.WebTextFieldUI;
import com.alee.managers.language.LM;

import javax.swing.*;
import java.awt.*;

/**
 * @author Alexandr Zernov
 */

public class WebTextFieldPainter<E extends JTextField, U extends WebTextFieldUI> extends AbstractTextFieldPainter<E, U>
        implements ITextFieldPainter<E, U>, SwingConstants
{
    @Override
    public String getInputPrompt ()
    {
        return LM.get ( ui.getInputPrompt () );
    }

    @Override
    public Component getTrailingComponent ()
    {
        return ui.getTrailingComponent ();
    }

    @Override
    public Component getLeadingComponent ()
    {
        return ui.getLeadingComponent ();
    }
}