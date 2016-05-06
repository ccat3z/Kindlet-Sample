package krrxue;

import com.amazon.kindle.kindlet.AbstractKindlet;
import com.amazon.kindle.kindlet.KindletContext;
import javax.swing.*;
import java.awt.*;

public class Launch extends AbstractKindlet
{
    public void create(final KindletContext context)
    {
        JTextArea text = new JTextArea("Hello,Kindlet!");
        text.setFont(new Font(null, Font.PLAIN, 21));
        context.getRootContainer().add(text);

    }
}